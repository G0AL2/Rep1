package z1;

import android.graphics.PointF;
import java.util.Collections;

/* compiled from: SplitDimensionPathKeyframeAnimation.java */
/* loaded from: classes.dex */
public class n extends a<PointF, PointF> {

    /* renamed from: i  reason: collision with root package name */
    private final PointF f39932i;

    /* renamed from: j  reason: collision with root package name */
    private final PointF f39933j;

    /* renamed from: k  reason: collision with root package name */
    private final a<Float, Float> f39934k;

    /* renamed from: l  reason: collision with root package name */
    private final a<Float, Float> f39935l;

    /* renamed from: m  reason: collision with root package name */
    protected j2.c<Float> f39936m;

    /* renamed from: n  reason: collision with root package name */
    protected j2.c<Float> f39937n;

    public n(a<Float, Float> aVar, a<Float, Float> aVar2) {
        super(Collections.emptyList());
        this.f39932i = new PointF();
        this.f39933j = new PointF();
        this.f39934k = aVar;
        this.f39935l = aVar2;
        m(f());
    }

    @Override // z1.a
    public void m(float f10) {
        this.f39934k.m(f10);
        this.f39935l.m(f10);
        this.f39932i.set(this.f39934k.h().floatValue(), this.f39935l.h().floatValue());
        for (int i10 = 0; i10 < this.f39895a.size(); i10++) {
            this.f39895a.get(i10).a();
        }
    }

    @Override // z1.a
    /* renamed from: p */
    public PointF h() {
        return i(null, 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // z1.a
    /* renamed from: q */
    public PointF i(j2.a<PointF> aVar, float f10) {
        Float f11;
        j2.a<Float> b10;
        j2.a<Float> b11;
        Float f12 = null;
        if (this.f39936m == null || (b11 = this.f39934k.b()) == null) {
            f11 = null;
        } else {
            float d10 = this.f39934k.d();
            Float f13 = b11.f32187h;
            j2.c<Float> cVar = this.f39936m;
            float f14 = b11.f32186g;
            f11 = cVar.b(f14, f13 == null ? f14 : f13.floatValue(), b11.f32181b, b11.f32182c, f10, f10, d10);
        }
        if (this.f39937n != null && (b10 = this.f39935l.b()) != null) {
            float d11 = this.f39935l.d();
            Float f15 = b10.f32187h;
            j2.c<Float> cVar2 = this.f39937n;
            float f16 = b10.f32186g;
            f12 = cVar2.b(f16, f15 == null ? f16 : f15.floatValue(), b10.f32181b, b10.f32182c, f10, f10, d11);
        }
        if (f11 == null) {
            this.f39933j.set(this.f39932i.x, 0.0f);
        } else {
            this.f39933j.set(f11.floatValue(), 0.0f);
        }
        if (f12 == null) {
            PointF pointF = this.f39933j;
            pointF.set(pointF.x, this.f39932i.y);
        } else {
            PointF pointF2 = this.f39933j;
            pointF2.set(pointF2.x, f12.floatValue());
        }
        return this.f39933j;
    }

    public void r(j2.c<Float> cVar) {
        j2.c<Float> cVar2 = this.f39936m;
        if (cVar2 != null) {
            cVar2.c(null);
        }
        this.f39936m = cVar;
        if (cVar != null) {
            cVar.c(this);
        }
    }

    public void s(j2.c<Float> cVar) {
        j2.c<Float> cVar2 = this.f39937n;
        if (cVar2 != null) {
            cVar2.c(null);
        }
        this.f39937n = cVar;
        if (cVar != null) {
            cVar.c(this);
        }
    }
}
