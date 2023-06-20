package z1;

import java.util.List;

/* compiled from: ColorKeyframeAnimation.java */
/* loaded from: classes.dex */
public class b extends g<Integer> {
    public b(List<j2.a<Integer>> list) {
        super(list);
    }

    public int p() {
        return q(b(), d());
    }

    public int q(j2.a<Integer> aVar, float f10) {
        Integer num;
        if (aVar.f32181b != null && aVar.f32182c != null) {
            j2.c<A> cVar = this.f39899e;
            if (cVar != 0 && (num = (Integer) cVar.b(aVar.f32186g, aVar.f32187h.floatValue(), aVar.f32181b, aVar.f32182c, f10, e(), f())) != null) {
                return num.intValue();
            }
            return i2.b.c(i2.g.b(f10, 0.0f, 1.0f), aVar.f32181b.intValue(), aVar.f32182c.intValue());
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // z1.a
    /* renamed from: r */
    public Integer i(j2.a<Integer> aVar, float f10) {
        return Integer.valueOf(q(aVar, f10));
    }
}
