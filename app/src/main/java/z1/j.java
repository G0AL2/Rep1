package z1;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* compiled from: PathKeyframeAnimation.java */
/* loaded from: classes.dex */
public class j extends g<PointF> {

    /* renamed from: i  reason: collision with root package name */
    private final PointF f39923i;

    /* renamed from: j  reason: collision with root package name */
    private final float[] f39924j;

    /* renamed from: k  reason: collision with root package name */
    private final PathMeasure f39925k;

    /* renamed from: l  reason: collision with root package name */
    private i f39926l;

    public j(List<? extends j2.a<PointF>> list) {
        super(list);
        this.f39923i = new PointF();
        this.f39924j = new float[2];
        this.f39925k = new PathMeasure();
    }

    @Override // z1.a
    /* renamed from: p */
    public PointF i(j2.a<PointF> aVar, float f10) {
        PointF pointF;
        i iVar = (i) aVar;
        Path j10 = iVar.j();
        if (j10 == null) {
            return aVar.f32181b;
        }
        j2.c<A> cVar = this.f39899e;
        if (cVar == 0 || (pointF = (PointF) cVar.b(iVar.f32186g, iVar.f32187h.floatValue(), (PointF) iVar.f32181b, (PointF) iVar.f32182c, e(), f10, f())) == null) {
            if (this.f39926l != iVar) {
                this.f39925k.setPath(j10, false);
                this.f39926l = iVar;
            }
            PathMeasure pathMeasure = this.f39925k;
            pathMeasure.getPosTan(f10 * pathMeasure.getLength(), this.f39924j, null);
            PointF pointF2 = this.f39923i;
            float[] fArr = this.f39924j;
            pointF2.set(fArr[0], fArr[1]);
            return this.f39923i;
        }
        return pointF;
    }
}
