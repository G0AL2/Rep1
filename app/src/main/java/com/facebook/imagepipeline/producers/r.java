package com.facebook.imagepipeline.producers;

import b6.b;

/* compiled from: DiskCacheWriteProducer.java */
/* loaded from: classes.dex */
public class r implements o0<w5.e> {

    /* renamed from: a  reason: collision with root package name */
    private final p5.e f15098a;

    /* renamed from: b  reason: collision with root package name */
    private final p5.e f15099b;

    /* renamed from: c  reason: collision with root package name */
    private final p5.f f15100c;

    /* renamed from: d  reason: collision with root package name */
    private final o0<w5.e> f15101d;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DiskCacheWriteProducer.java */
    /* loaded from: classes.dex */
    public static class b extends p<w5.e, w5.e> {

        /* renamed from: c  reason: collision with root package name */
        private final p0 f15102c;

        /* renamed from: d  reason: collision with root package name */
        private final p5.e f15103d;

        /* renamed from: e  reason: collision with root package name */
        private final p5.e f15104e;

        /* renamed from: f  reason: collision with root package name */
        private final p5.f f15105f;

        @Override // com.facebook.imagepipeline.producers.b
        /* renamed from: q */
        public void i(w5.e eVar, int i10) {
            this.f15102c.h().d(this.f15102c, "DiskCacheWriteProducer");
            if (!com.facebook.imagepipeline.producers.b.f(i10) && eVar != null && !com.facebook.imagepipeline.producers.b.m(i10, 10) && eVar.A() != com.facebook.imageformat.c.f14812b) {
                b6.b k10 = this.f15102c.k();
                t3.d a10 = this.f15105f.a(k10, this.f15102c.a());
                if (k10.b() == b.EnumC0091b.SMALL) {
                    this.f15104e.p(a10, eVar);
                } else {
                    this.f15103d.p(a10, eVar);
                }
                this.f15102c.h().j(this.f15102c, "DiskCacheWriteProducer", null);
                p().c(eVar, i10);
                return;
            }
            this.f15102c.h().j(this.f15102c, "DiskCacheWriteProducer", null);
            p().c(eVar, i10);
        }

        private b(l<w5.e> lVar, p0 p0Var, p5.e eVar, p5.e eVar2, p5.f fVar) {
            super(lVar);
            this.f15102c = p0Var;
            this.f15103d = eVar;
            this.f15104e = eVar2;
            this.f15105f = fVar;
        }
    }

    public r(p5.e eVar, p5.e eVar2, p5.f fVar, o0<w5.e> o0Var) {
        this.f15098a = eVar;
        this.f15099b = eVar2;
        this.f15100c = fVar;
        this.f15101d = o0Var;
    }

    private void c(l<w5.e> lVar, p0 p0Var) {
        if (p0Var.o().f() >= b.c.DISK_CACHE.f()) {
            p0Var.e("disk", "nil-result_write");
            lVar.c(null, 1);
            return;
        }
        if (p0Var.k().t()) {
            lVar = new b(lVar, p0Var, this.f15098a, this.f15099b, this.f15100c);
        }
        this.f15101d.b(lVar, p0Var);
    }

    @Override // com.facebook.imagepipeline.producers.o0
    public void b(l<w5.e> lVar, p0 p0Var) {
        c(lVar, p0Var);
    }
}
