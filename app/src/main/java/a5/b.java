package a5;

import android.graphics.Bitmap;
import z4.b;

/* compiled from: KeepLastFrameCache.java */
/* loaded from: classes.dex */
public class b implements z4.b {

    /* renamed from: a  reason: collision with root package name */
    private int f74a = -1;

    /* renamed from: b  reason: collision with root package name */
    private b.a f75b;

    /* renamed from: c  reason: collision with root package name */
    private c4.a<Bitmap> f76c;

    private synchronized void g() {
        int i10;
        b.a aVar = this.f75b;
        if (aVar != null && (i10 = this.f74a) != -1) {
            aVar.a(this, i10);
        }
        c4.a.w(this.f76c);
        this.f76c = null;
        this.f74a = -1;
    }

    @Override // z4.b
    public synchronized c4.a<Bitmap> a(int i10) {
        return c4.a.q(this.f76c);
    }

    @Override // z4.b
    public synchronized c4.a<Bitmap> b(int i10, int i11, int i12) {
        c4.a<Bitmap> q10;
        q10 = c4.a.q(this.f76c);
        g();
        return q10;
    }

    @Override // z4.b
    public synchronized boolean c(int i10) {
        boolean z10;
        if (i10 == this.f74a) {
            z10 = c4.a.C(this.f76c);
        }
        return z10;
    }

    @Override // z4.b
    public synchronized void clear() {
        g();
    }

    @Override // z4.b
    public void d(int i10, c4.a<Bitmap> aVar, int i11) {
    }

    @Override // z4.b
    public synchronized c4.a<Bitmap> e(int i10) {
        if (this.f74a == i10) {
            return c4.a.q(this.f76c);
        }
        return null;
    }

    @Override // z4.b
    public synchronized void f(int i10, c4.a<Bitmap> aVar, int i11) {
        int i12;
        if (aVar != null) {
            if (this.f76c != null && aVar.y().equals(this.f76c.y())) {
                return;
            }
        }
        c4.a.w(this.f76c);
        b.a aVar2 = this.f75b;
        if (aVar2 != null && (i12 = this.f74a) != -1) {
            aVar2.a(this, i12);
        }
        this.f76c = c4.a.q(aVar);
        b.a aVar3 = this.f75b;
        if (aVar3 != null) {
            aVar3.b(this, i10);
        }
        this.f74a = i10;
    }
}
