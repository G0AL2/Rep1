package z5;

import android.graphics.Bitmap;

/* compiled from: LruBitmapPool.java */
/* loaded from: classes.dex */
public class l implements c {

    /* renamed from: a  reason: collision with root package name */
    protected final p<Bitmap> f40010a = new d();

    /* renamed from: b  reason: collision with root package name */
    private final int f40011b;

    /* renamed from: c  reason: collision with root package name */
    private int f40012c;

    /* renamed from: d  reason: collision with root package name */
    private final t f40013d;

    /* renamed from: e  reason: collision with root package name */
    private int f40014e;

    public l(int i10, int i11, t tVar, b4.c cVar) {
        this.f40011b = i10;
        this.f40012c = i11;
        this.f40013d = tVar;
        if (cVar != null) {
            cVar.a(this);
        }
    }

    private Bitmap f(int i10) {
        this.f40013d.d(i10);
        return Bitmap.createBitmap(1, i10, Bitmap.Config.ALPHA_8);
    }

    private synchronized void i(int i10) {
        Bitmap pop;
        while (this.f40014e > i10 && (pop = this.f40010a.pop()) != null) {
            int a10 = this.f40010a.a(pop);
            this.f40014e -= a10;
            this.f40013d.b(a10);
        }
    }

    @Override // b4.e
    /* renamed from: g */
    public synchronized Bitmap get(int i10) {
        int i11 = this.f40014e;
        int i12 = this.f40011b;
        if (i11 > i12) {
            i(i12);
        }
        Bitmap bitmap = this.f40010a.get(i10);
        if (bitmap != null) {
            int a10 = this.f40010a.a(bitmap);
            this.f40014e -= a10;
            this.f40013d.e(a10);
            return bitmap;
        }
        return f(i10);
    }

    @Override // b4.e, c4.h
    /* renamed from: h */
    public void a(Bitmap bitmap) {
        int a10 = this.f40010a.a(bitmap);
        if (a10 <= this.f40012c) {
            this.f40013d.c(a10);
            this.f40010a.put(bitmap);
            synchronized (this) {
                this.f40014e += a10;
            }
        }
    }
}
