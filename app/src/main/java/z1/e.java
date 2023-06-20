package z1;

import java.util.List;

/* compiled from: GradientColorKeyframeAnimation.java */
/* loaded from: classes.dex */
public class e extends g<d2.d> {

    /* renamed from: i  reason: collision with root package name */
    private final d2.d f39917i;

    public e(List<j2.a<d2.d>> list) {
        super(list);
        d2.d dVar = list.get(0).f32181b;
        int c10 = dVar != null ? dVar.c() : 0;
        this.f39917i = new d2.d(new float[c10], new int[c10]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // z1.a
    /* renamed from: p */
    public d2.d i(j2.a<d2.d> aVar, float f10) {
        this.f39917i.d(aVar.f32181b, aVar.f32182c, f10);
        return this.f39917i;
    }
}
