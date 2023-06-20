package z1;

import java.util.List;

/* compiled from: FloatKeyframeAnimation.java */
/* loaded from: classes.dex */
public class d extends g<Float> {
    public d(List<j2.a<Float>> list) {
        super(list);
    }

    public float p() {
        return q(b(), d());
    }

    float q(j2.a<Float> aVar, float f10) {
        Float f11;
        if (aVar.f32181b != null && aVar.f32182c != null) {
            j2.c<A> cVar = this.f39899e;
            if (cVar != 0 && (f11 = (Float) cVar.b(aVar.f32186g, aVar.f32187h.floatValue(), aVar.f32181b, aVar.f32182c, f10, e(), f())) != null) {
                return f11.floatValue();
            }
            return i2.g.i(aVar.f(), aVar.c(), f10);
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // z1.a
    /* renamed from: r */
    public Float i(j2.a<Float> aVar, float f10) {
        return Float.valueOf(q(aVar, f10));
    }
}
