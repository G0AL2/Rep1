package z1;

import java.util.List;

/* compiled from: TextKeyframeAnimation.java */
/* loaded from: classes.dex */
public class o extends g<b2.b> {

    /* compiled from: TextKeyframeAnimation.java */
    /* loaded from: classes.dex */
    class a extends j2.c<b2.b> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ j2.b f39938c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ j2.c f39939d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ b2.b f39940e;

        a(o oVar, j2.b bVar, j2.c cVar, b2.b bVar2) {
            this.f39938c = bVar;
            this.f39939d = cVar;
            this.f39940e = bVar2;
        }

        @Override // j2.c
        /* renamed from: d */
        public b2.b a(j2.b<b2.b> bVar) {
            this.f39938c.h(bVar.f(), bVar.a(), bVar.g().f4774a, bVar.b().f4774a, bVar.d(), bVar.c(), bVar.e());
            String str = (String) this.f39939d.a(this.f39938c);
            b2.b b10 = bVar.c() == 1.0f ? bVar.b() : bVar.g();
            this.f39940e.a(str, b10.f4775b, b10.f4776c, b10.f4777d, b10.f4778e, b10.f4779f, b10.f4780g, b10.f4781h, b10.f4782i, b10.f4783j, b10.f4784k);
            return this.f39940e;
        }
    }

    public o(List<j2.a<b2.b>> list) {
        super(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // z1.a
    /* renamed from: p */
    public b2.b i(j2.a<b2.b> aVar, float f10) {
        b2.b bVar;
        j2.c<A> cVar = this.f39899e;
        if (cVar == 0) {
            if (f10 == 1.0f && (bVar = aVar.f32182c) != null) {
                return bVar;
            }
            return aVar.f32181b;
        }
        float f11 = aVar.f32186g;
        Float f12 = aVar.f32187h;
        float floatValue = f12 == null ? Float.MAX_VALUE : f12.floatValue();
        b2.b bVar2 = aVar.f32181b;
        b2.b bVar3 = bVar2;
        b2.b bVar4 = aVar.f32182c;
        return (b2.b) cVar.b(f11, floatValue, bVar3, bVar4 == null ? bVar2 : bVar4, f10, d(), f());
    }

    public void q(j2.c<String> cVar) {
        super.n(new a(this, new j2.b(), cVar, new b2.b()));
    }
}
