package b5;

import android.graphics.Bitmap;
import android.util.SparseArray;
import java.util.concurrent.ExecutorService;
import o5.f;

/* compiled from: DefaultBitmapFramePreparer.java */
/* loaded from: classes.dex */
public class c implements b {

    /* renamed from: f  reason: collision with root package name */
    private static final Class<?> f4820f = c.class;

    /* renamed from: a  reason: collision with root package name */
    private final f f4821a;

    /* renamed from: b  reason: collision with root package name */
    private final z4.c f4822b;

    /* renamed from: c  reason: collision with root package name */
    private final Bitmap.Config f4823c;

    /* renamed from: d  reason: collision with root package name */
    private final ExecutorService f4824d;

    /* renamed from: e  reason: collision with root package name */
    private final SparseArray<Runnable> f4825e = new SparseArray<>();

    /* compiled from: DefaultBitmapFramePreparer.java */
    /* loaded from: classes.dex */
    private class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final z4.b f4826a;

        /* renamed from: b  reason: collision with root package name */
        private final y4.a f4827b;

        /* renamed from: c  reason: collision with root package name */
        private final int f4828c;

        /* renamed from: d  reason: collision with root package name */
        private final int f4829d;

        public a(y4.a aVar, z4.b bVar, int i10, int i11) {
            this.f4827b = aVar;
            this.f4826a = bVar;
            this.f4828c = i10;
            this.f4829d = i11;
        }

        private boolean a(int i10, int i11) {
            c4.a<Bitmap> b10;
            int i12 = 2;
            try {
                if (i11 == 1) {
                    b10 = this.f4826a.b(i10, this.f4827b.e(), this.f4827b.c());
                } else if (i11 != 2) {
                    return false;
                } else {
                    b10 = c.this.f4821a.b(this.f4827b.e(), this.f4827b.c(), c.this.f4823c);
                    i12 = -1;
                }
                boolean b11 = b(i10, b10, i11);
                c4.a.w(b10);
                return (b11 || i12 == -1) ? b11 : a(i10, i12);
            } catch (RuntimeException e10) {
                z3.a.D(c.f4820f, "Failed to create frame bitmap", e10);
                return false;
            } finally {
                c4.a.w(null);
            }
        }

        private boolean b(int i10, c4.a<Bitmap> aVar, int i11) {
            if (c4.a.C(aVar) && c.this.f4822b.a(i10, aVar.y())) {
                z3.a.w(c.f4820f, "Frame %d ready.", Integer.valueOf(this.f4828c));
                synchronized (c.this.f4825e) {
                    this.f4826a.d(this.f4828c, aVar, i11);
                }
                return true;
            }
            return false;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (this.f4826a.c(this.f4828c)) {
                    z3.a.w(c.f4820f, "Frame %d is cached already.", Integer.valueOf(this.f4828c));
                    synchronized (c.this.f4825e) {
                        c.this.f4825e.remove(this.f4829d);
                    }
                    return;
                }
                if (a(this.f4828c, 1)) {
                    z3.a.w(c.f4820f, "Prepared frame frame %d.", Integer.valueOf(this.f4828c));
                } else {
                    z3.a.h(c.f4820f, "Could not prepare frame %d.", Integer.valueOf(this.f4828c));
                }
                synchronized (c.this.f4825e) {
                    c.this.f4825e.remove(this.f4829d);
                }
            } catch (Throwable th) {
                synchronized (c.this.f4825e) {
                    c.this.f4825e.remove(this.f4829d);
                    throw th;
                }
            }
        }
    }

    public c(f fVar, z4.c cVar, Bitmap.Config config, ExecutorService executorService) {
        this.f4821a = fVar;
        this.f4822b = cVar;
        this.f4823c = config;
        this.f4824d = executorService;
    }

    private static int g(y4.a aVar, int i10) {
        return (aVar.hashCode() * 31) + i10;
    }

    @Override // b5.b
    public boolean a(z4.b bVar, y4.a aVar, int i10) {
        int g10 = g(aVar, i10);
        synchronized (this.f4825e) {
            if (this.f4825e.get(g10) != null) {
                z3.a.w(f4820f, "Already scheduled decode job for frame %d", Integer.valueOf(i10));
                return true;
            } else if (bVar.c(i10)) {
                z3.a.w(f4820f, "Frame %d is cached already.", Integer.valueOf(i10));
                return true;
            } else {
                a aVar2 = new a(aVar, bVar, i10, g10);
                this.f4825e.put(g10, aVar2);
                this.f4824d.execute(aVar2);
                return true;
            }
        }
    }
}
