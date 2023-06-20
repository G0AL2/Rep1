package com.facebook.imagepipeline.producers;

/* compiled from: BranchOnSeparateImagesProducer.java */
/* loaded from: classes.dex */
public class k implements o0<w5.e> {

    /* renamed from: a  reason: collision with root package name */
    private final o0<w5.e> f15013a;

    /* renamed from: b  reason: collision with root package name */
    private final o0<w5.e> f15014b;

    /* compiled from: BranchOnSeparateImagesProducer.java */
    /* loaded from: classes.dex */
    private class b extends p<w5.e, w5.e> {

        /* renamed from: c  reason: collision with root package name */
        private p0 f15015c;

        @Override // com.facebook.imagepipeline.producers.p, com.facebook.imagepipeline.producers.b
        protected void h(Throwable th) {
            k.this.f15014b.b(p(), this.f15015c);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.b
        /* renamed from: q */
        public void i(w5.e eVar, int i10) {
            b6.b k10 = this.f15015c.k();
            boolean e10 = com.facebook.imagepipeline.producers.b.e(i10);
            boolean c10 = e1.c(eVar, k10.m());
            if (eVar != null && (c10 || k10.e())) {
                if (e10 && c10) {
                    p().c(eVar, i10);
                } else {
                    p().c(eVar, com.facebook.imagepipeline.producers.b.o(i10, 1));
                }
            }
            if (!e10 || c10) {
                return;
            }
            w5.e.d(eVar);
            k.this.f15014b.b(p(), this.f15015c);
        }

        private b(l<w5.e> lVar, p0 p0Var) {
            super(lVar);
            this.f15015c = p0Var;
        }
    }

    public k(o0<w5.e> o0Var, o0<w5.e> o0Var2) {
        this.f15013a = o0Var;
        this.f15014b = o0Var2;
    }

    @Override // com.facebook.imagepipeline.producers.o0
    public void b(l<w5.e> lVar, p0 p0Var) {
        this.f15013a.b(new b(lVar, p0Var), p0Var);
    }
}
