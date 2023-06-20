package com.facebook.imagepipeline.producers;

import b6.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* compiled from: BitmapProbeProducer.java */
/* loaded from: classes.dex */
public class j implements o0<c4.a<w5.c>> {

    /* renamed from: a  reason: collision with root package name */
    private final p5.s<t3.d, b4.g> f14994a;

    /* renamed from: b  reason: collision with root package name */
    private final p5.e f14995b;

    /* renamed from: c  reason: collision with root package name */
    private final p5.e f14996c;

    /* renamed from: d  reason: collision with root package name */
    private final p5.f f14997d;

    /* renamed from: e  reason: collision with root package name */
    private final o0<c4.a<w5.c>> f14998e;

    /* renamed from: f  reason: collision with root package name */
    private final p5.d<t3.d> f14999f;

    /* renamed from: g  reason: collision with root package name */
    private final p5.d<t3.d> f15000g;

    /* compiled from: BitmapProbeProducer.java */
    /* loaded from: classes.dex */
    private static class a extends p<c4.a<w5.c>, c4.a<w5.c>> {

        /* renamed from: c  reason: collision with root package name */
        private final p0 f15001c;

        /* renamed from: d  reason: collision with root package name */
        private final p5.s<t3.d, b4.g> f15002d;

        /* renamed from: e  reason: collision with root package name */
        private final p5.e f15003e;

        /* renamed from: f  reason: collision with root package name */
        private final p5.e f15004f;

        /* renamed from: g  reason: collision with root package name */
        private final p5.f f15005g;

        /* renamed from: h  reason: collision with root package name */
        private final p5.d<t3.d> f15006h;

        /* renamed from: i  reason: collision with root package name */
        private final p5.d<t3.d> f15007i;

        public a(l<c4.a<w5.c>> lVar, p0 p0Var, p5.s<t3.d, b4.g> sVar, p5.e eVar, p5.e eVar2, p5.f fVar, p5.d<t3.d> dVar, p5.d<t3.d> dVar2) {
            super(lVar);
            this.f15001c = p0Var;
            this.f15002d = sVar;
            this.f15003e = eVar;
            this.f15004f = eVar2;
            this.f15005g = fVar;
            this.f15006h = dVar;
            this.f15007i = dVar2;
        }

        @Override // com.facebook.imagepipeline.producers.b
        /* renamed from: q */
        public void i(c4.a<w5.c> aVar, int i10) {
            boolean d10;
            try {
                if (c6.b.d()) {
                    c6.b.a("BitmapProbeProducer#onNewResultImpl");
                }
                if (!b.f(i10) && aVar != null && !b.m(i10, 8)) {
                    b6.b k10 = this.f15001c.k();
                    t3.d a10 = this.f15005g.a(k10, this.f15001c.a());
                    String str = (String) this.f15001c.n(AppMeasurementSdk.ConditionalUserProperty.ORIGIN);
                    if (str != null && str.equals("memory_bitmap")) {
                        if (this.f15001c.d().D().r() && !this.f15006h.b(a10)) {
                            this.f15002d.b(a10);
                            this.f15006h.a(a10);
                        }
                        if (this.f15001c.d().D().p() && !this.f15007i.b(a10)) {
                            (k10.b() == b.EnumC0091b.SMALL ? this.f15004f : this.f15003e).h(a10);
                            this.f15007i.a(a10);
                        }
                    }
                    p().c(aVar, i10);
                    if (d10) {
                        return;
                    }
                    return;
                }
                p().c(aVar, i10);
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

    public j(p5.s<t3.d, b4.g> sVar, p5.e eVar, p5.e eVar2, p5.f fVar, p5.d<t3.d> dVar, p5.d<t3.d> dVar2, o0<c4.a<w5.c>> o0Var) {
        this.f14994a = sVar;
        this.f14995b = eVar;
        this.f14996c = eVar2;
        this.f14997d = fVar;
        this.f14999f = dVar;
        this.f15000g = dVar2;
        this.f14998e = o0Var;
    }

    @Override // com.facebook.imagepipeline.producers.o0
    public void b(l<c4.a<w5.c>> lVar, p0 p0Var) {
        try {
            if (c6.b.d()) {
                c6.b.a("BitmapProbeProducer#produceResults");
            }
            r0 h10 = p0Var.h();
            h10.d(p0Var, c());
            a aVar = new a(lVar, p0Var, this.f14994a, this.f14995b, this.f14996c, this.f14997d, this.f14999f, this.f15000g);
            h10.j(p0Var, "BitmapProbeProducer", null);
            if (c6.b.d()) {
                c6.b.a("mInputProducer.produceResult");
            }
            this.f14998e.b(aVar, p0Var);
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
        return "BitmapProbeProducer";
    }
}
