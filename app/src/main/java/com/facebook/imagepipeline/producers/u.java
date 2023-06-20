package com.facebook.imagepipeline.producers;

import b6.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* compiled from: EncodedProbeProducer.java */
/* loaded from: classes.dex */
public class u implements o0<w5.e> {

    /* renamed from: a  reason: collision with root package name */
    private final p5.e f15115a;

    /* renamed from: b  reason: collision with root package name */
    private final p5.e f15116b;

    /* renamed from: c  reason: collision with root package name */
    private final p5.f f15117c;

    /* renamed from: d  reason: collision with root package name */
    private final o0<w5.e> f15118d;

    /* renamed from: e  reason: collision with root package name */
    private final p5.d<t3.d> f15119e;

    /* renamed from: f  reason: collision with root package name */
    private final p5.d<t3.d> f15120f;

    /* compiled from: EncodedProbeProducer.java */
    /* loaded from: classes.dex */
    private static class a extends p<w5.e, w5.e> {

        /* renamed from: c  reason: collision with root package name */
        private final p0 f15121c;

        /* renamed from: d  reason: collision with root package name */
        private final p5.e f15122d;

        /* renamed from: e  reason: collision with root package name */
        private final p5.e f15123e;

        /* renamed from: f  reason: collision with root package name */
        private final p5.f f15124f;

        /* renamed from: g  reason: collision with root package name */
        private final p5.d<t3.d> f15125g;

        /* renamed from: h  reason: collision with root package name */
        private final p5.d<t3.d> f15126h;

        public a(l<w5.e> lVar, p0 p0Var, p5.e eVar, p5.e eVar2, p5.f fVar, p5.d<t3.d> dVar, p5.d<t3.d> dVar2) {
            super(lVar);
            this.f15121c = p0Var;
            this.f15122d = eVar;
            this.f15123e = eVar2;
            this.f15124f = fVar;
            this.f15125g = dVar;
            this.f15126h = dVar2;
        }

        @Override // com.facebook.imagepipeline.producers.b
        /* renamed from: q */
        public void i(w5.e eVar, int i10) {
            boolean d10;
            try {
                if (c6.b.d()) {
                    c6.b.a("EncodedProbeProducer#onNewResultImpl");
                }
                if (!b.f(i10) && eVar != null && !b.m(i10, 10) && eVar.A() != com.facebook.imageformat.c.f14812b) {
                    b6.b k10 = this.f15121c.k();
                    t3.d a10 = this.f15124f.a(k10, this.f15121c.a());
                    this.f15125g.a(a10);
                    if ("memory_encoded".equals(this.f15121c.n(AppMeasurementSdk.ConditionalUserProperty.ORIGIN))) {
                        if (!this.f15126h.b(a10)) {
                            (k10.b() == b.EnumC0091b.SMALL ? this.f15123e : this.f15122d).h(a10);
                            this.f15126h.a(a10);
                        }
                    } else if ("disk".equals(this.f15121c.n(AppMeasurementSdk.ConditionalUserProperty.ORIGIN))) {
                        this.f15126h.a(a10);
                    }
                    p().c(eVar, i10);
                    if (d10) {
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

    public u(p5.e eVar, p5.e eVar2, p5.f fVar, p5.d dVar, p5.d dVar2, o0<w5.e> o0Var) {
        this.f15115a = eVar;
        this.f15116b = eVar2;
        this.f15117c = fVar;
        this.f15119e = dVar;
        this.f15120f = dVar2;
        this.f15118d = o0Var;
    }

    @Override // com.facebook.imagepipeline.producers.o0
    public void b(l<w5.e> lVar, p0 p0Var) {
        try {
            if (c6.b.d()) {
                c6.b.a("EncodedProbeProducer#produceResults");
            }
            r0 h10 = p0Var.h();
            h10.d(p0Var, c());
            a aVar = new a(lVar, p0Var, this.f15115a, this.f15116b, this.f15117c, this.f15119e, this.f15120f);
            h10.j(p0Var, "EncodedProbeProducer", null);
            if (c6.b.d()) {
                c6.b.a("mInputProducer.produceResult");
            }
            this.f15118d.b(aVar, p0Var);
            if (c6.b.d()) {
                c6.b.b();
            }
        } finally {
            if (c6.b.d()) {
                c6.b.b();
            }
        }
    }

    protected String c() {
        return "EncodedProbeProducer";
    }
}
