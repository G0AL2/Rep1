package com.facebook.imagepipeline.producers;

import b6.b;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;

/* compiled from: EncodedMemoryCacheProducer.java */
/* loaded from: classes.dex */
public class t implements o0<w5.e> {

    /* renamed from: a  reason: collision with root package name */
    private final p5.s<t3.d, b4.g> f15107a;

    /* renamed from: b  reason: collision with root package name */
    private final p5.f f15108b;

    /* renamed from: c  reason: collision with root package name */
    private final o0<w5.e> f15109c;

    /* compiled from: EncodedMemoryCacheProducer.java */
    /* loaded from: classes.dex */
    private static class a extends p<w5.e, w5.e> {

        /* renamed from: c  reason: collision with root package name */
        private final p5.s<t3.d, b4.g> f15110c;

        /* renamed from: d  reason: collision with root package name */
        private final t3.d f15111d;

        /* renamed from: e  reason: collision with root package name */
        private final boolean f15112e;

        /* renamed from: f  reason: collision with root package name */
        private final boolean f15113f;

        public a(l<w5.e> lVar, p5.s<t3.d, b4.g> sVar, t3.d dVar, boolean z10, boolean z11) {
            super(lVar);
            this.f15110c = sVar;
            this.f15111d = dVar;
            this.f15112e = z10;
            this.f15113f = z11;
        }

        @Override // com.facebook.imagepipeline.producers.b
        /* renamed from: q */
        public void i(w5.e eVar, int i10) {
            boolean d10;
            try {
                if (c6.b.d()) {
                    c6.b.a("EncodedMemoryCacheProducer#onNewResultImpl");
                }
                if (!b.f(i10) && eVar != null && !b.m(i10, 10) && eVar.A() != com.facebook.imageformat.c.f14812b) {
                    c4.a<b4.g> h10 = eVar.h();
                    if (h10 != null) {
                        c4.a<b4.g> aVar = null;
                        if (this.f15113f && this.f15112e) {
                            aVar = this.f15110c.e(this.f15111d, h10);
                        }
                        c4.a.w(h10);
                        if (aVar != null) {
                            w5.e eVar2 = new w5.e(aVar);
                            eVar2.e(eVar);
                            c4.a.w(aVar);
                            p().d(1.0f);
                            p().c(eVar2, i10);
                            w5.e.d(eVar2);
                            if (d10) {
                                return;
                            }
                            return;
                        }
                    }
                    p().c(eVar, i10);
                    if (c6.b.d()) {
                        c6.b.b();
                        return;
                    }
                    return;
                }
                p().c(eVar, i10);
                if (c6.b.d()) {
                    c6.b.b();
                }
            } finally {
                if (c6.b.d()) {
                    c6.b.b();
                }
            }
        }
    }

    public t(p5.s<t3.d, b4.g> sVar, p5.f fVar, o0<w5.e> o0Var) {
        this.f15107a = sVar;
        this.f15108b = fVar;
        this.f15109c = o0Var;
    }

    @Override // com.facebook.imagepipeline.producers.o0
    public void b(l<w5.e> lVar, p0 p0Var) {
        try {
            if (c6.b.d()) {
                c6.b.a("EncodedMemoryCacheProducer#produceResults");
            }
            r0 h10 = p0Var.h();
            h10.d(p0Var, "EncodedMemoryCacheProducer");
            t3.d a10 = this.f15108b.a(p0Var.k(), p0Var.a());
            c4.a<b4.g> aVar = this.f15107a.get(a10);
            if (aVar != null) {
                w5.e eVar = new w5.e(aVar);
                h10.j(p0Var, "EncodedMemoryCacheProducer", h10.f(p0Var, "EncodedMemoryCacheProducer") ? y3.g.of("cached_value_found", InneractiveMediationDefs.SHOW_HOUSE_AD_YES) : null);
                h10.b(p0Var, "EncodedMemoryCacheProducer", true);
                p0Var.g("memory_encoded");
                lVar.d(1.0f);
                lVar.c(eVar, 1);
                w5.e.d(eVar);
                c4.a.w(aVar);
            } else if (p0Var.o().f() >= b.c.ENCODED_MEMORY_CACHE.f()) {
                h10.j(p0Var, "EncodedMemoryCacheProducer", h10.f(p0Var, "EncodedMemoryCacheProducer") ? y3.g.of("cached_value_found", "false") : null);
                h10.b(p0Var, "EncodedMemoryCacheProducer", false);
                p0Var.e("memory_encoded", "nil-result");
                lVar.c(null, 1);
                c4.a.w(aVar);
                if (c6.b.d()) {
                    c6.b.b();
                }
            } else {
                a aVar2 = new a(lVar, this.f15107a, a10, p0Var.k().u(), p0Var.d().D().q());
                h10.j(p0Var, "EncodedMemoryCacheProducer", h10.f(p0Var, "EncodedMemoryCacheProducer") ? y3.g.of("cached_value_found", "false") : null);
                this.f15109c.b(aVar2, p0Var);
                c4.a.w(aVar);
                if (c6.b.d()) {
                    c6.b.b();
                }
            }
        } finally {
            if (c6.b.d()) {
                c6.b.b();
            }
        }
    }
}
