package z1;

import java.util.List;

/* compiled from: ScaleKeyframeAnimation.java */
/* loaded from: classes.dex */
public class l extends g<j2.d> {

    /* renamed from: i  reason: collision with root package name */
    private final j2.d f39928i;

    public l(List<j2.a<j2.d>> list) {
        super(list);
        this.f39928i = new j2.d();
    }

    @Override // z1.a
    /* renamed from: p */
    public j2.d i(j2.a<j2.d> aVar, float f10) {
        j2.d dVar;
        j2.d dVar2;
        j2.d dVar3 = aVar.f32181b;
        if (dVar3 != null && (dVar = aVar.f32182c) != null) {
            j2.d dVar4 = dVar3;
            j2.d dVar5 = dVar;
            j2.c<A> cVar = this.f39899e;
            if (cVar == 0 || (dVar2 = (j2.d) cVar.b(aVar.f32186g, aVar.f32187h.floatValue(), dVar4, dVar5, f10, e(), f())) == null) {
                this.f39928i.d(i2.g.i(dVar4.b(), dVar5.b(), f10), i2.g.i(dVar4.c(), dVar5.c(), f10));
                return this.f39928i;
            }
            return dVar2;
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
