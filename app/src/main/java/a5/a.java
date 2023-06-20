package a5;

import android.graphics.Bitmap;
import android.util.SparseArray;
import com.facebook.common.internal.VisibleForTesting;
import w5.d;
import w5.i;
import y3.k;

/* compiled from: FrescoFrameCache.java */
/* loaded from: classes.dex */
public class a implements z4.b {

    /* renamed from: e  reason: collision with root package name */
    private static final Class<?> f69e = a.class;

    /* renamed from: a  reason: collision with root package name */
    private final m5.b f70a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f71b;

    /* renamed from: c  reason: collision with root package name */
    private final SparseArray<c4.a<w5.c>> f72c = new SparseArray<>();

    /* renamed from: d  reason: collision with root package name */
    private c4.a<w5.c> f73d;

    public a(m5.b bVar, boolean z10) {
        this.f70a = bVar;
        this.f71b = z10;
    }

    @VisibleForTesting
    static c4.a<Bitmap> g(c4.a<w5.c> aVar) {
        d dVar;
        try {
            if (c4.a.C(aVar) && (aVar.y() instanceof d) && (dVar = (d) aVar.y()) != null) {
                return dVar.q();
            }
            return null;
        } finally {
            c4.a.w(aVar);
        }
    }

    private static c4.a<w5.c> h(c4.a<Bitmap> aVar) {
        return c4.a.L(new d(aVar, i.f38227d, 0));
    }

    private synchronized void i(int i10) {
        c4.a<w5.c> aVar = this.f72c.get(i10);
        if (aVar != null) {
            this.f72c.delete(i10);
            c4.a.w(aVar);
            z3.a.x(f69e, "removePreparedReference(%d) removed. Pending frames: %s", Integer.valueOf(i10), this.f72c);
        }
    }

    @Override // z4.b
    public synchronized c4.a<Bitmap> a(int i10) {
        return g(c4.a.q(this.f73d));
    }

    @Override // z4.b
    public synchronized c4.a<Bitmap> b(int i10, int i11, int i12) {
        if (this.f71b) {
            throw null;
        }
        return null;
    }

    @Override // z4.b
    public synchronized boolean c(int i10) {
        throw null;
    }

    @Override // z4.b
    public synchronized void clear() {
        c4.a.w(this.f73d);
        this.f73d = null;
        for (int i10 = 0; i10 < this.f72c.size(); i10++) {
            c4.a.w(this.f72c.valueAt(i10));
        }
        this.f72c.clear();
    }

    @Override // z4.b
    public synchronized void d(int i10, c4.a<Bitmap> aVar, int i11) {
        c4.a<w5.c> aVar2;
        Throwable th;
        k.g(aVar);
        try {
            aVar2 = h(aVar);
            if (aVar2 == null) {
                c4.a.w(aVar2);
            } else {
                try {
                    throw null;
                } catch (Throwable th2) {
                    th = th2;
                    c4.a.w(aVar2);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            aVar2 = null;
            th = th3;
        }
    }

    @Override // z4.b
    public synchronized c4.a<Bitmap> e(int i10) {
        throw null;
    }

    @Override // z4.b
    public synchronized void f(int i10, c4.a<Bitmap> aVar, int i11) {
        c4.a<w5.c> aVar2;
        Throwable th;
        k.g(aVar);
        i(i10);
        try {
            aVar2 = h(aVar);
            if (aVar2 == null) {
                c4.a.w(aVar2);
            } else {
                try {
                    c4.a.w(this.f73d);
                    throw null;
                } catch (Throwable th2) {
                    th = th2;
                    c4.a.w(aVar2);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            aVar2 = null;
            th = th3;
        }
    }
}
