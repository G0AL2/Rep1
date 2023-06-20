package p5;

/* compiled from: EncodedMemoryCacheFactory.java */
/* loaded from: classes.dex */
public class n {

    /* compiled from: EncodedMemoryCacheFactory.java */
    /* loaded from: classes.dex */
    static class a implements u<t3.d> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f35558a;

        a(o oVar) {
            this.f35558a = oVar;
        }

        @Override // p5.u
        /* renamed from: d */
        public void a(t3.d dVar) {
            this.f35558a.i(dVar);
        }

        @Override // p5.u
        /* renamed from: e */
        public void b(t3.d dVar) {
            this.f35558a.k(dVar);
        }

        @Override // p5.u
        /* renamed from: f */
        public void c(t3.d dVar) {
            this.f35558a.e(dVar);
        }
    }

    public static p<t3.d, b4.g> a(s<t3.d, b4.g> sVar, o oVar) {
        oVar.f(sVar);
        return new p<>(sVar, new a(oVar));
    }
}
