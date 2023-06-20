package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.producers.a0;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: ResizeAndRotateProducer.java */
/* loaded from: classes.dex */
public class u0 implements o0<w5.e> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f15127a;

    /* renamed from: b  reason: collision with root package name */
    private final b4.h f15128b;

    /* renamed from: c  reason: collision with root package name */
    private final o0<w5.e> f15129c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f15130d;

    /* renamed from: e  reason: collision with root package name */
    private final d6.d f15131e;

    /* compiled from: ResizeAndRotateProducer.java */
    /* loaded from: classes.dex */
    private class a extends p<w5.e, w5.e> {

        /* renamed from: c  reason: collision with root package name */
        private final boolean f15132c;

        /* renamed from: d  reason: collision with root package name */
        private final d6.d f15133d;

        /* renamed from: e  reason: collision with root package name */
        private final p0 f15134e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f15135f;

        /* renamed from: g  reason: collision with root package name */
        private final a0 f15136g;

        /* compiled from: ResizeAndRotateProducer.java */
        /* renamed from: com.facebook.imagepipeline.producers.u0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0201a implements a0.d {
            C0201a(u0 u0Var) {
            }

            @Override // com.facebook.imagepipeline.producers.a0.d
            public void a(w5.e eVar, int i10) {
                a aVar = a.this;
                aVar.w(eVar, i10, (d6.c) y3.k.g(aVar.f15133d.createImageTranscoder(eVar.A(), a.this.f15132c)));
            }
        }

        /* compiled from: ResizeAndRotateProducer.java */
        /* loaded from: classes.dex */
        class b extends e {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ l f15139a;

            b(u0 u0Var, l lVar) {
                this.f15139a = lVar;
            }

            @Override // com.facebook.imagepipeline.producers.e, com.facebook.imagepipeline.producers.q0
            public void a() {
                if (a.this.f15134e.i()) {
                    a.this.f15136g.h();
                }
            }

            @Override // com.facebook.imagepipeline.producers.q0
            public void b() {
                a.this.f15136g.c();
                a.this.f15135f = true;
                this.f15139a.a();
            }
        }

        a(l<w5.e> lVar, p0 p0Var, boolean z10, d6.d dVar) {
            super(lVar);
            this.f15135f = false;
            this.f15134e = p0Var;
            Boolean n10 = p0Var.k().n();
            this.f15132c = n10 != null ? n10.booleanValue() : z10;
            this.f15133d = dVar;
            this.f15136g = new a0(u0.this.f15127a, new C0201a(u0.this), 100);
            p0Var.c(new b(u0.this, lVar));
        }

        private w5.e A(w5.e eVar) {
            q5.f o10 = this.f15134e.k().o();
            return (o10.g() || !o10.f()) ? eVar : y(eVar, o10.e());
        }

        private w5.e B(w5.e eVar) {
            return (this.f15134e.k().o().c() || eVar.O() == 0 || eVar.O() == -1) ? eVar : y(eVar, 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void w(w5.e eVar, int i10, d6.c cVar) {
            this.f15134e.h().d(this.f15134e, "ResizeAndRotateProducer");
            b6.b k10 = this.f15134e.k();
            b4.j c10 = u0.this.f15128b.c();
            try {
                d6.b b10 = cVar.b(eVar, c10, k10.o(), k10.m(), null, 85);
                if (b10.a() != 2) {
                    Map<String, String> z10 = z(eVar, k10.m(), b10, cVar.a());
                    c4.a L = c4.a.L(c10.a());
                    try {
                        w5.e eVar2 = new w5.e(L);
                        eVar2.Q0(com.facebook.imageformat.b.f14800a);
                        eVar2.s0();
                        this.f15134e.h().j(this.f15134e, "ResizeAndRotateProducer", z10);
                        if (b10.a() != 1) {
                            i10 |= 16;
                        }
                        p().c(eVar2, i10);
                        w5.e.d(eVar2);
                        return;
                    } finally {
                        c4.a.w(L);
                    }
                }
                throw new RuntimeException("Error while transcoding the image");
            } catch (Exception e10) {
                this.f15134e.h().k(this.f15134e, "ResizeAndRotateProducer", e10, null);
                if (com.facebook.imagepipeline.producers.b.e(i10)) {
                    p().b(e10);
                }
            } finally {
                c10.close();
            }
        }

        private void x(w5.e eVar, int i10, com.facebook.imageformat.c cVar) {
            w5.e B;
            if (cVar != com.facebook.imageformat.b.f14800a && cVar != com.facebook.imageformat.b.f14810k) {
                B = A(eVar);
            } else {
                B = B(eVar);
            }
            p().c(B, i10);
        }

        private w5.e y(w5.e eVar, int i10) {
            w5.e b10 = w5.e.b(eVar);
            if (b10 != null) {
                b10.T0(i10);
            }
            return b10;
        }

        private Map<String, String> z(w5.e eVar, q5.e eVar2, d6.b bVar, String str) {
            String str2;
            if (this.f15134e.h().f(this.f15134e, "ResizeAndRotateProducer")) {
                String str3 = eVar.Z() + "x" + eVar.z();
                if (eVar2 != null) {
                    str2 = eVar2.f35945a + "x" + eVar2.f35946b;
                } else {
                    str2 = "Unspecified";
                }
                HashMap hashMap = new HashMap();
                hashMap.put("Image format", String.valueOf(eVar.A()));
                hashMap.put("Original size", str3);
                hashMap.put("Requested size", str2);
                hashMap.put("queueTime", String.valueOf(this.f15136g.f()));
                hashMap.put("Transcoder id", str);
                hashMap.put("Transcoding result", String.valueOf(bVar));
                return y3.g.a(hashMap);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.b
        /* renamed from: C */
        public void i(w5.e eVar, int i10) {
            if (this.f15135f) {
                return;
            }
            boolean e10 = com.facebook.imagepipeline.producers.b.e(i10);
            if (eVar == null) {
                if (e10) {
                    p().c(null, 1);
                    return;
                }
                return;
            }
            com.facebook.imageformat.c A = eVar.A();
            g4.e h10 = u0.h(this.f15134e.k(), eVar, (d6.c) y3.k.g(this.f15133d.createImageTranscoder(A, this.f15132c)));
            if (e10 || h10 != g4.e.UNSET) {
                if (h10 != g4.e.YES) {
                    x(eVar, i10, A);
                } else if (this.f15136g.k(eVar, i10)) {
                    if (e10 || this.f15134e.i()) {
                        this.f15136g.h();
                    }
                }
            }
        }
    }

    public u0(Executor executor, b4.h hVar, o0<w5.e> o0Var, boolean z10, d6.d dVar) {
        this.f15127a = (Executor) y3.k.g(executor);
        this.f15128b = (b4.h) y3.k.g(hVar);
        this.f15129c = (o0) y3.k.g(o0Var);
        this.f15131e = (d6.d) y3.k.g(dVar);
        this.f15130d = z10;
    }

    private static boolean f(q5.f fVar, w5.e eVar) {
        return !fVar.c() && (d6.e.e(fVar, eVar) != 0 || g(fVar, eVar));
    }

    private static boolean g(q5.f fVar, w5.e eVar) {
        if (fVar.f() && !fVar.c()) {
            return d6.e.f29086a.contains(Integer.valueOf(eVar.w()));
        }
        eVar.K0(0);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static g4.e h(b6.b bVar, w5.e eVar, d6.c cVar) {
        if (eVar != null && eVar.A() != com.facebook.imageformat.c.f14812b) {
            if (!cVar.d(eVar.A())) {
                return g4.e.NO;
            }
            return g4.e.h(f(bVar.o(), eVar) || cVar.c(eVar, bVar.o(), bVar.m()));
        }
        return g4.e.UNSET;
    }

    @Override // com.facebook.imagepipeline.producers.o0
    public void b(l<w5.e> lVar, p0 p0Var) {
        this.f15129c.b(new a(lVar, p0Var, this.f15130d, this.f15131e), p0Var);
    }
}
