package w5;

import android.graphics.Bitmap;
import y3.k;

/* compiled from: CloseableStaticBitmap.java */
/* loaded from: classes.dex */
public class d extends b implements c4.d {

    /* renamed from: c  reason: collision with root package name */
    private c4.a<Bitmap> f38203c;

    /* renamed from: d  reason: collision with root package name */
    private volatile Bitmap f38204d;

    /* renamed from: e  reason: collision with root package name */
    private final j f38205e;

    /* renamed from: f  reason: collision with root package name */
    private final int f38206f;

    /* renamed from: g  reason: collision with root package name */
    private final int f38207g;

    public d(Bitmap bitmap, c4.h<Bitmap> hVar, j jVar, int i10) {
        this(bitmap, hVar, jVar, i10, 0);
    }

    private synchronized c4.a<Bitmap> w() {
        c4.a<Bitmap> aVar;
        aVar = this.f38203c;
        this.f38203c = null;
        this.f38204d = null;
        return aVar;
    }

    private static int y(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getHeight();
    }

    private static int z(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getWidth();
    }

    public int A() {
        return this.f38207g;
    }

    public int C() {
        return this.f38206f;
    }

    @Override // w5.c
    public j a() {
        return this.f38205e;
    }

    @Override // w5.c
    public int b() {
        return com.facebook.imageutils.a.e(this.f38204d);
    }

    @Override // w5.c, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        c4.a<Bitmap> w10 = w();
        if (w10 != null) {
            w10.close();
        }
    }

    @Override // w5.h
    public int getHeight() {
        int i10;
        if (this.f38206f % 180 == 0 && (i10 = this.f38207g) != 5 && i10 != 7) {
            return y(this.f38204d);
        }
        return z(this.f38204d);
    }

    @Override // w5.h
    public int getWidth() {
        int i10;
        if (this.f38206f % 180 == 0 && (i10 = this.f38207g) != 5 && i10 != 7) {
            return z(this.f38204d);
        }
        return y(this.f38204d);
    }

    @Override // w5.c
    public synchronized boolean isClosed() {
        return this.f38203c == null;
    }

    @Override // w5.b
    public Bitmap l() {
        return this.f38204d;
    }

    public synchronized c4.a<Bitmap> q() {
        return c4.a.q(this.f38203c);
    }

    public d(Bitmap bitmap, c4.h<Bitmap> hVar, j jVar, int i10, int i11) {
        this.f38204d = (Bitmap) k.g(bitmap);
        this.f38203c = c4.a.T(this.f38204d, (c4.h) k.g(hVar));
        this.f38205e = jVar;
        this.f38206f = i10;
        this.f38207g = i11;
    }

    public d(c4.a<Bitmap> aVar, j jVar, int i10) {
        this(aVar, jVar, i10, 0);
    }

    public d(c4.a<Bitmap> aVar, j jVar, int i10, int i11) {
        c4.a<Bitmap> aVar2 = (c4.a) k.g(aVar.e());
        this.f38203c = aVar2;
        this.f38204d = aVar2.y();
        this.f38205e = jVar;
        this.f38206f = i10;
        this.f38207g = i11;
    }
}
