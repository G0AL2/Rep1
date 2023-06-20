package com.facebook.imagepipeline.producers;

import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;

/* compiled from: PostprocessedBitmapMemoryCacheProducer.java */
/* loaded from: classes.dex */
public class m0 implements o0<c4.a<w5.c>> {

    /* renamed from: a  reason: collision with root package name */
    private final p5.s<t3.d, w5.c> f15033a;

    /* renamed from: b  reason: collision with root package name */
    private final p5.f f15034b;

    /* renamed from: c  reason: collision with root package name */
    private final o0<c4.a<w5.c>> f15035c;

    /* compiled from: PostprocessedBitmapMemoryCacheProducer.java */
    /* loaded from: classes.dex */
    public static class a extends p<c4.a<w5.c>, c4.a<w5.c>> {

        /* renamed from: c  reason: collision with root package name */
        private final t3.d f15036c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f15037d;

        /* renamed from: e  reason: collision with root package name */
        private final p5.s<t3.d, w5.c> f15038e;

        /* renamed from: f  reason: collision with root package name */
        private final boolean f15039f;

        public a(l<c4.a<w5.c>> lVar, t3.d dVar, boolean z10, p5.s<t3.d, w5.c> sVar, boolean z11) {
            super(lVar);
            this.f15036c = dVar;
            this.f15037d = z10;
            this.f15038e = sVar;
            this.f15039f = z11;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.b
        /* renamed from: q */
        public void i(c4.a<w5.c> aVar, int i10) {
            if (aVar == null) {
                if (b.e(i10)) {
                    p().c(null, i10);
                }
            } else if (!b.f(i10) || this.f15037d) {
                c4.a<w5.c> e10 = this.f15039f ? this.f15038e.e(this.f15036c, aVar) : null;
                try {
                    p().d(1.0f);
                    l<c4.a<w5.c>> p10 = p();
                    if (e10 != null) {
                        aVar = e10;
                    }
                    p10.c(aVar, i10);
                } finally {
                    c4.a.w(e10);
                }
            }
        }
    }

    public m0(p5.s<t3.d, w5.c> sVar, p5.f fVar, o0<c4.a<w5.c>> o0Var) {
        this.f15033a = sVar;
        this.f15034b = fVar;
        this.f15035c = o0Var;
    }

    @Override // com.facebook.imagepipeline.producers.o0
    public void b(l<c4.a<w5.c>> lVar, p0 p0Var) {
        r0 h10 = p0Var.h();
        b6.b k10 = p0Var.k();
        Object a10 = p0Var.a();
        b6.d g10 = k10.g();
        if (g10 != null && g10.b() != null) {
            h10.d(p0Var, c());
            t3.d b10 = this.f15034b.b(k10, a10);
            c4.a<w5.c> aVar = this.f15033a.get(b10);
            if (aVar != null) {
                h10.j(p0Var, c(), h10.f(p0Var, c()) ? y3.g.of("cached_value_found", InneractiveMediationDefs.SHOW_HOUSE_AD_YES) : null);
                h10.b(p0Var, "PostprocessedBitmapMemoryCacheProducer", true);
                p0Var.e("memory_bitmap", "postprocessed");
                lVar.d(1.0f);
                lVar.c(aVar, 1);
                aVar.close();
                return;
            }
            a aVar2 = new a(lVar, b10, g10 instanceof b6.e, this.f15033a, p0Var.k().u());
            h10.j(p0Var, c(), h10.f(p0Var, c()) ? y3.g.of("cached_value_found", "false") : null);
            this.f15035c.b(aVar2, p0Var);
            return;
        }
        this.f15035c.b(lVar, p0Var);
    }

    protected String c() {
        return "PostprocessedBitmapMemoryCacheProducer";
    }
}
