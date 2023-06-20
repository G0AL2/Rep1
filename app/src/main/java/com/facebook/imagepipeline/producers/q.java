package com.facebook.imagepipeline.producers;

import b6.b;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: DiskCacheReadProducer.java */
/* loaded from: classes.dex */
public class q implements o0<w5.e> {

    /* renamed from: a  reason: collision with root package name */
    private final p5.e f15089a;

    /* renamed from: b  reason: collision with root package name */
    private final p5.e f15090b;

    /* renamed from: c  reason: collision with root package name */
    private final p5.f f15091c;

    /* renamed from: d  reason: collision with root package name */
    private final o0<w5.e> f15092d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DiskCacheReadProducer.java */
    /* loaded from: classes.dex */
    public class a implements s1.d<w5.e, Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r0 f15093a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p0 f15094b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ l f15095c;

        a(r0 r0Var, p0 p0Var, l lVar) {
            this.f15093a = r0Var;
            this.f15094b = p0Var;
            this.f15095c = lVar;
        }

        @Override // s1.d
        /* renamed from: b */
        public Void a(s1.f<w5.e> fVar) throws Exception {
            if (q.f(fVar)) {
                this.f15093a.c(this.f15094b, "DiskCacheProducer", null);
                this.f15095c.a();
            } else if (fVar.n()) {
                this.f15093a.k(this.f15094b, "DiskCacheProducer", fVar.i(), null);
                q.this.f15092d.b(this.f15095c, this.f15094b);
            } else {
                w5.e j10 = fVar.j();
                if (j10 != null) {
                    r0 r0Var = this.f15093a;
                    p0 p0Var = this.f15094b;
                    r0Var.j(p0Var, "DiskCacheProducer", q.e(r0Var, p0Var, true, j10.U()));
                    this.f15093a.b(this.f15094b, "DiskCacheProducer", true);
                    this.f15094b.g("disk");
                    this.f15095c.d(1.0f);
                    this.f15095c.c(j10, 1);
                    j10.close();
                } else {
                    r0 r0Var2 = this.f15093a;
                    p0 p0Var2 = this.f15094b;
                    r0Var2.j(p0Var2, "DiskCacheProducer", q.e(r0Var2, p0Var2, false, 0));
                    q.this.f15092d.b(this.f15095c, this.f15094b);
                }
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DiskCacheReadProducer.java */
    /* loaded from: classes.dex */
    public class b extends e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AtomicBoolean f15097a;

        b(q qVar, AtomicBoolean atomicBoolean) {
            this.f15097a = atomicBoolean;
        }

        @Override // com.facebook.imagepipeline.producers.q0
        public void b() {
            this.f15097a.set(true);
        }
    }

    public q(p5.e eVar, p5.e eVar2, p5.f fVar, o0<w5.e> o0Var) {
        this.f15089a = eVar;
        this.f15090b = eVar2;
        this.f15091c = fVar;
        this.f15092d = o0Var;
    }

    static Map<String, String> e(r0 r0Var, p0 p0Var, boolean z10, int i10) {
        if (r0Var.f(p0Var, "DiskCacheProducer")) {
            if (z10) {
                return y3.g.of("cached_value_found", String.valueOf(z10), "encodedImageSize", String.valueOf(i10));
            }
            return y3.g.of("cached_value_found", String.valueOf(z10));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean f(s1.f<?> fVar) {
        return fVar.l() || (fVar.n() && (fVar.i() instanceof CancellationException));
    }

    private void g(l<w5.e> lVar, p0 p0Var) {
        if (p0Var.o().f() >= b.c.DISK_CACHE.f()) {
            p0Var.e("disk", "nil-result_read");
            lVar.c(null, 1);
            return;
        }
        this.f15092d.b(lVar, p0Var);
    }

    private s1.d<w5.e, Void> h(l<w5.e> lVar, p0 p0Var) {
        return new a(p0Var.h(), p0Var, lVar);
    }

    private void i(AtomicBoolean atomicBoolean, p0 p0Var) {
        p0Var.c(new b(this, atomicBoolean));
    }

    @Override // com.facebook.imagepipeline.producers.o0
    public void b(l<w5.e> lVar, p0 p0Var) {
        b6.b k10 = p0Var.k();
        if (!k10.t()) {
            g(lVar, p0Var);
            return;
        }
        p0Var.h().d(p0Var, "DiskCacheProducer");
        t3.d a10 = this.f15091c.a(k10, p0Var.a());
        p5.e eVar = k10.b() == b.EnumC0091b.SMALL ? this.f15090b : this.f15089a;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        eVar.n(a10, atomicBoolean).e(h(lVar, p0Var));
        i(atomicBoolean, p0Var);
    }
}
