package com.facebook.imagepipeline.producers;

/* compiled from: AddImageTransformMetaDataProducer.java */
/* loaded from: classes.dex */
public class a implements o0<w5.e> {

    /* renamed from: a  reason: collision with root package name */
    private final o0<w5.e> f14883a;

    /* compiled from: AddImageTransformMetaDataProducer.java */
    /* loaded from: classes.dex */
    private static class b extends p<w5.e, w5.e> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.b
        /* renamed from: q */
        public void i(w5.e eVar, int i10) {
            if (eVar == null) {
                p().c(null, i10);
                return;
            }
            if (!w5.e.m0(eVar)) {
                eVar.s0();
            }
            p().c(eVar, i10);
        }

        private b(l<w5.e> lVar) {
            super(lVar);
        }
    }

    public a(o0<w5.e> o0Var) {
        this.f14883a = o0Var;
    }

    @Override // com.facebook.imagepipeline.producers.o0
    public void b(l<w5.e> lVar, p0 p0Var) {
        this.f14883a.b(new b(lVar), p0Var);
    }
}
