package com.facebook.imagepipeline.producers;

import b6.b;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;

/* compiled from: BitmapMemoryCacheProducer.java */
/* loaded from: classes.dex */
public class h implements o0<c4.a<w5.c>> {

    /* renamed from: a  reason: collision with root package name */
    private final p5.s<t3.d, w5.c> f14959a;

    /* renamed from: b  reason: collision with root package name */
    private final p5.f f14960b;

    /* renamed from: c  reason: collision with root package name */
    private final o0<c4.a<w5.c>> f14961c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BitmapMemoryCacheProducer.java */
    /* loaded from: classes.dex */
    public class a extends p<c4.a<w5.c>, c4.a<w5.c>> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ t3.d f14962c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f14963d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(l lVar, t3.d dVar, boolean z10) {
            super(lVar);
            this.f14962c = dVar;
            this.f14963d = z10;
        }

        @Override // com.facebook.imagepipeline.producers.b
        /* renamed from: q */
        public void i(c4.a<w5.c> aVar, int i10) {
            c4.a<w5.c> aVar2;
            boolean d10;
            try {
                if (c6.b.d()) {
                    c6.b.a("BitmapMemoryCacheProducer#onNewResultImpl");
                }
                boolean e10 = b.e(i10);
                if (aVar == null) {
                    if (e10) {
                        p().c(null, i10);
                    }
                    if (d10) {
                        return;
                    }
                    return;
                }
                if (!aVar.y().d() && !b.n(i10, 8)) {
                    if (!e10 && (aVar2 = h.this.f14959a.get(this.f14962c)) != null) {
                        w5.j a10 = aVar.y().a();
                        w5.j a11 = aVar2.y().a();
                        if (!a11.a() && a11.c() < a10.c()) {
                            c4.a.w(aVar2);
                        } else {
                            p().c(aVar2, i10);
                            c4.a.w(aVar2);
                            if (c6.b.d()) {
                                c6.b.b();
                                return;
                            }
                            return;
                        }
                    }
                    c4.a<w5.c> e11 = this.f14963d ? h.this.f14959a.e(this.f14962c, aVar) : null;
                    if (e10) {
                        p().d(1.0f);
                    }
                    l<c4.a<w5.c>> p10 = p();
                    if (e11 != null) {
                        aVar = e11;
                    }
                    p10.c(aVar, i10);
                    c4.a.w(e11);
                    if (c6.b.d()) {
                        c6.b.b();
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

    public h(p5.s<t3.d, w5.c> sVar, p5.f fVar, o0<c4.a<w5.c>> o0Var) {
        this.f14959a = sVar;
        this.f14960b = fVar;
        this.f14961c = o0Var;
    }

    private static void f(w5.g gVar, p0 p0Var) {
        p0Var.l(gVar.getExtras());
    }

    @Override // com.facebook.imagepipeline.producers.o0
    public void b(l<c4.a<w5.c>> lVar, p0 p0Var) {
        boolean d10;
        try {
            if (c6.b.d()) {
                c6.b.a("BitmapMemoryCacheProducer#produceResults");
            }
            r0 h10 = p0Var.h();
            h10.d(p0Var, e());
            t3.d c10 = this.f14960b.c(p0Var.k(), p0Var.a());
            c4.a<w5.c> aVar = this.f14959a.get(c10);
            if (aVar != null) {
                f(aVar.y(), p0Var);
                boolean a10 = aVar.y().a().a();
                if (a10) {
                    h10.j(p0Var, e(), h10.f(p0Var, e()) ? y3.g.of("cached_value_found", InneractiveMediationDefs.SHOW_HOUSE_AD_YES) : null);
                    h10.b(p0Var, e(), true);
                    p0Var.e("memory_bitmap", d());
                    lVar.d(1.0f);
                }
                lVar.c(aVar, b.l(a10));
                aVar.close();
                if (a10) {
                    if (d10) {
                        return;
                    }
                    return;
                }
            }
            if (p0Var.o().f() >= b.c.BITMAP_MEMORY_CACHE.f()) {
                h10.j(p0Var, e(), h10.f(p0Var, e()) ? y3.g.of("cached_value_found", "false") : null);
                h10.b(p0Var, e(), false);
                p0Var.e("memory_bitmap", d());
                lVar.c(null, 1);
                if (c6.b.d()) {
                    c6.b.b();
                    return;
                }
                return;
            }
            l<c4.a<w5.c>> g10 = g(lVar, c10, p0Var.k().u());
            h10.j(p0Var, e(), h10.f(p0Var, e()) ? y3.g.of("cached_value_found", "false") : null);
            if (c6.b.d()) {
                c6.b.a("mInputProducer.produceResult");
            }
            this.f14961c.b(g10, p0Var);
            if (c6.b.d()) {
                c6.b.b();
            }
            if (c6.b.d()) {
                c6.b.b();
            }
        } finally {
            if (c6.b.d()) {
                c6.b.b();
            }
        }
    }

    protected String d() {
        return "pipe_bg";
    }

    protected String e() {
        return "BitmapMemoryCacheProducer";
    }

    protected l<c4.a<w5.c>> g(l<c4.a<w5.c>> lVar, t3.d dVar, boolean z10) {
        return new a(lVar, dVar, z10);
    }
}
