package p5;

/* compiled from: InstrumentedMemoryCacheBitmapMemoryCacheFactory.java */
/* loaded from: classes.dex */
public class q {

    /* compiled from: InstrumentedMemoryCacheBitmapMemoryCacheFactory.java */
    /* loaded from: classes.dex */
    static class a implements u<t3.d> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f35561a;

        a(o oVar) {
            this.f35561a = oVar;
        }

        @Override // p5.u
        /* renamed from: d */
        public void a(t3.d dVar) {
            this.f35561a.d(dVar);
        }

        @Override // p5.u
        /* renamed from: e */
        public void b(t3.d dVar) {
            this.f35561a.c(dVar);
        }

        @Override // p5.u
        /* renamed from: f */
        public void c(t3.d dVar) {
            this.f35561a.h(dVar);
        }
    }

    public static p<t3.d, w5.c> a(s<t3.d, w5.c> sVar, o oVar) {
        oVar.b(sVar);
        return new p<>(sVar, new a(oVar));
    }
}
