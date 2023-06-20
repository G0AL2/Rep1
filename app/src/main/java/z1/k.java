package z1;

import android.graphics.PointF;
import java.util.List;

/* compiled from: PointKeyframeAnimation.java */
/* loaded from: classes.dex */
public class k extends g<PointF> {

    /* renamed from: i  reason: collision with root package name */
    private final PointF f39927i;

    public k(List<j2.a<PointF>> list) {
        super(list);
        this.f39927i = new PointF();
    }

    @Override // z1.a
    /* renamed from: p */
    public PointF i(j2.a<PointF> aVar, float f10) {
        return j(aVar, f10, f10, f10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // z1.a
    /* renamed from: q */
    public PointF j(j2.a<PointF> aVar, float f10, float f11, float f12) {
        PointF pointF;
        PointF pointF2;
        PointF pointF3 = aVar.f32181b;
        if (pointF3 != null && (pointF = aVar.f32182c) != null) {
            PointF pointF4 = pointF3;
            PointF pointF5 = pointF;
            j2.c<A> cVar = this.f39899e;
            if (cVar == 0 || (pointF2 = (PointF) cVar.b(aVar.f32186g, aVar.f32187h.floatValue(), pointF4, pointF5, f10, e(), f())) == null) {
                PointF pointF6 = this.f39927i;
                float f13 = pointF4.x;
                float f14 = f13 + (f11 * (pointF5.x - f13));
                float f15 = pointF4.y;
                pointF6.set(f14, f15 + (f12 * (pointF5.y - f15)));
                return this.f39927i;
            }
            return pointF2;
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
