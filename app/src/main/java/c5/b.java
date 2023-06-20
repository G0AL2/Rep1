package c5;

import android.graphics.Bitmap;
import android.graphics.Rect;
import m5.c;
import z4.c;

/* compiled from: AnimatedDrawableBackendFrameRenderer.java */
/* loaded from: classes.dex */
public class b implements c {

    /* renamed from: e  reason: collision with root package name */
    private static final Class<?> f5324e = b.class;

    /* renamed from: a  reason: collision with root package name */
    private final z4.b f5325a;

    /* renamed from: b  reason: collision with root package name */
    private k5.a f5326b;

    /* renamed from: c  reason: collision with root package name */
    private m5.c f5327c;

    /* renamed from: d  reason: collision with root package name */
    private final c.b f5328d;

    /* compiled from: AnimatedDrawableBackendFrameRenderer.java */
    /* loaded from: classes.dex */
    class a implements c.b {
        a() {
        }

        @Override // m5.c.b
        public void a(int i10, Bitmap bitmap) {
        }

        @Override // m5.c.b
        public c4.a<Bitmap> b(int i10) {
            return b.this.f5325a.e(i10);
        }
    }

    public b(z4.b bVar, k5.a aVar) {
        a aVar2 = new a();
        this.f5328d = aVar2;
        this.f5325a = bVar;
        this.f5326b = aVar;
        this.f5327c = new m5.c(aVar, aVar2);
    }

    @Override // z4.c
    public boolean a(int i10, Bitmap bitmap) {
        try {
            this.f5327c.f(i10, bitmap);
            return true;
        } catch (IllegalStateException e10) {
            z3.a.i(f5324e, e10, "Rendering of frame unsuccessful. Frame number: %d", Integer.valueOf(i10));
            return false;
        }
    }

    @Override // z4.c
    public int c() {
        return this.f5326b.getHeight();
    }

    @Override // z4.c
    public void d(Rect rect) {
        k5.a d10 = this.f5326b.d(rect);
        if (d10 != this.f5326b) {
            this.f5326b = d10;
            this.f5327c = new m5.c(d10, this.f5328d);
        }
    }

    @Override // z4.c
    public int e() {
        return this.f5326b.getWidth();
    }
}
