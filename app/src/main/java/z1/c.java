package z1;

import android.graphics.Color;
import android.graphics.Paint;
import z1.a;

/* compiled from: DropShadowKeyframeAnimation.java */
/* loaded from: classes.dex */
public class c implements a.b {

    /* renamed from: a  reason: collision with root package name */
    private final a.b f39909a;

    /* renamed from: b  reason: collision with root package name */
    private final z1.a<Integer, Integer> f39910b;

    /* renamed from: c  reason: collision with root package name */
    private final z1.a<Float, Float> f39911c;

    /* renamed from: d  reason: collision with root package name */
    private final z1.a<Float, Float> f39912d;

    /* renamed from: e  reason: collision with root package name */
    private final z1.a<Float, Float> f39913e;

    /* renamed from: f  reason: collision with root package name */
    private final z1.a<Float, Float> f39914f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f39915g = true;

    /* compiled from: DropShadowKeyframeAnimation.java */
    /* loaded from: classes.dex */
    class a extends j2.c<Float> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ j2.c f39916c;

        a(c cVar, j2.c cVar2) {
            this.f39916c = cVar2;
        }

        @Override // j2.c
        /* renamed from: d */
        public Float a(j2.b<Float> bVar) {
            Float f10 = (Float) this.f39916c.a(bVar);
            if (f10 == null) {
                return null;
            }
            return Float.valueOf(f10.floatValue() * 2.55f);
        }
    }

    public c(a.b bVar, e2.b bVar2, g2.j jVar) {
        this.f39909a = bVar;
        z1.a<Integer, Integer> a10 = jVar.a().a();
        this.f39910b = a10;
        a10.a(this);
        bVar2.i(a10);
        z1.a<Float, Float> a11 = jVar.d().a();
        this.f39911c = a11;
        a11.a(this);
        bVar2.i(a11);
        z1.a<Float, Float> a12 = jVar.b().a();
        this.f39912d = a12;
        a12.a(this);
        bVar2.i(a12);
        z1.a<Float, Float> a13 = jVar.c().a();
        this.f39913e = a13;
        a13.a(this);
        bVar2.i(a13);
        z1.a<Float, Float> a14 = jVar.e().a();
        this.f39914f = a14;
        a14.a(this);
        bVar2.i(a14);
    }

    @Override // z1.a.b
    public void a() {
        this.f39915g = true;
        this.f39909a.a();
    }

    public void b(Paint paint) {
        if (this.f39915g) {
            this.f39915g = false;
            double floatValue = this.f39912d.h().floatValue() * 0.017453292519943295d;
            float floatValue2 = this.f39913e.h().floatValue();
            float sin = ((float) Math.sin(floatValue)) * floatValue2;
            float cos = ((float) Math.cos(floatValue + 3.141592653589793d)) * floatValue2;
            int intValue = this.f39910b.h().intValue();
            paint.setShadowLayer(this.f39914f.h().floatValue(), sin, cos, Color.argb(Math.round(this.f39911c.h().floatValue()), Color.red(intValue), Color.green(intValue), Color.blue(intValue)));
        }
    }

    public void c(j2.c<Integer> cVar) {
        this.f39910b.n(cVar);
    }

    public void d(j2.c<Float> cVar) {
        this.f39912d.n(cVar);
    }

    public void e(j2.c<Float> cVar) {
        this.f39913e.n(cVar);
    }

    public void f(j2.c<Float> cVar) {
        if (cVar == null) {
            this.f39911c.n(null);
        } else {
            this.f39911c.n(new a(this, cVar));
        }
    }

    public void g(j2.c<Float> cVar) {
        this.f39914f.n(cVar);
    }
}
