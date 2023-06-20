package com.facebook.imagepipeline.producers;

import java.io.InputStream;
import java.util.concurrent.Executor;

/* compiled from: WebpTranscodeProducer.java */
/* loaded from: classes.dex */
public class f1 implements o0<w5.e> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f14949a;

    /* renamed from: b  reason: collision with root package name */
    private final b4.h f14950b;

    /* renamed from: c  reason: collision with root package name */
    private final o0<w5.e> f14951c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WebpTranscodeProducer.java */
    /* loaded from: classes.dex */
    public class a extends w0<w5.e> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ w5.e f14952f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(l lVar, r0 r0Var, p0 p0Var, String str, w5.e eVar) {
            super(lVar, r0Var, p0Var, str);
            this.f14952f = eVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.w0, w3.g
        public void d() {
            w5.e.d(this.f14952f);
            super.d();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.w0, w3.g
        public void e(Exception exc) {
            w5.e.d(this.f14952f);
            super.e(exc);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // w3.g
        /* renamed from: j */
        public void b(w5.e eVar) {
            w5.e.d(eVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // w3.g
        /* renamed from: k */
        public w5.e c() throws Exception {
            b4.j c10 = f1.this.f14950b.c();
            try {
                f1.g(this.f14952f, c10);
                c4.a L = c4.a.L(c10.a());
                w5.e eVar = new w5.e(L);
                eVar.e(this.f14952f);
                c4.a.w(L);
                return eVar;
            } finally {
                c10.close();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.w0, w3.g
        /* renamed from: l */
        public void f(w5.e eVar) {
            w5.e.d(this.f14952f);
            super.f(eVar);
        }
    }

    /* compiled from: WebpTranscodeProducer.java */
    /* loaded from: classes.dex */
    private class b extends p<w5.e, w5.e> {

        /* renamed from: c  reason: collision with root package name */
        private final p0 f14954c;

        /* renamed from: d  reason: collision with root package name */
        private g4.e f14955d;

        public b(l<w5.e> lVar, p0 p0Var) {
            super(lVar);
            this.f14954c = p0Var;
            this.f14955d = g4.e.UNSET;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.b
        /* renamed from: q */
        public void i(w5.e eVar, int i10) {
            if (this.f14955d == g4.e.UNSET && eVar != null) {
                this.f14955d = f1.h(eVar);
            }
            if (this.f14955d == g4.e.NO) {
                p().c(eVar, i10);
            } else if (com.facebook.imagepipeline.producers.b.e(i10)) {
                if (this.f14955d == g4.e.YES && eVar != null) {
                    f1.this.i(eVar, p(), this.f14954c);
                } else {
                    p().c(eVar, i10);
                }
            }
        }
    }

    public f1(Executor executor, b4.h hVar, o0<w5.e> o0Var) {
        this.f14949a = (Executor) y3.k.g(executor);
        this.f14950b = (b4.h) y3.k.g(hVar);
        this.f14951c = (o0) y3.k.g(o0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void g(w5.e eVar, b4.j jVar) throws Exception {
        InputStream inputStream = (InputStream) y3.k.g(eVar.C());
        com.facebook.imageformat.c c10 = com.facebook.imageformat.d.c(inputStream);
        if (c10 != com.facebook.imageformat.b.f14805f && c10 != com.facebook.imageformat.b.f14807h) {
            if (c10 != com.facebook.imageformat.b.f14806g && c10 != com.facebook.imageformat.b.f14808i) {
                throw new IllegalArgumentException("Wrong image format");
            }
            com.facebook.imagepipeline.nativecode.f.a().a(inputStream, jVar);
            eVar.Q0(com.facebook.imageformat.b.f14801b);
            return;
        }
        com.facebook.imagepipeline.nativecode.f.a().c(inputStream, jVar, 80);
        eVar.Q0(com.facebook.imageformat.b.f14800a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static g4.e h(w5.e eVar) {
        y3.k.g(eVar);
        com.facebook.imageformat.c c10 = com.facebook.imageformat.d.c((InputStream) y3.k.g(eVar.C()));
        if (com.facebook.imageformat.b.a(c10)) {
            com.facebook.imagepipeline.nativecode.e a10 = com.facebook.imagepipeline.nativecode.f.a();
            if (a10 == null) {
                return g4.e.NO;
            }
            return g4.e.h(!a10.b(c10));
        } else if (c10 == com.facebook.imageformat.c.f14812b) {
            return g4.e.UNSET;
        } else {
            return g4.e.NO;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(w5.e eVar, l<w5.e> lVar, p0 p0Var) {
        y3.k.g(eVar);
        this.f14949a.execute(new a(lVar, p0Var.h(), p0Var, "WebpTranscodeProducer", w5.e.b(eVar)));
    }

    @Override // com.facebook.imagepipeline.producers.o0
    public void b(l<w5.e> lVar, p0 p0Var) {
        this.f14951c.b(new b(lVar, p0Var), p0Var);
    }
}
