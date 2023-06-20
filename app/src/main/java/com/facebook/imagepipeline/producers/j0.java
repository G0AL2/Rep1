package com.facebook.imagepipeline.producers;

import android.os.SystemClock;
import com.facebook.imagepipeline.producers.k0;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

/* compiled from: NetworkFetchProducer.java */
/* loaded from: classes.dex */
public class j0 implements o0<w5.e> {

    /* renamed from: a  reason: collision with root package name */
    protected final b4.h f15008a;

    /* renamed from: b  reason: collision with root package name */
    private final b4.a f15009b;

    /* renamed from: c  reason: collision with root package name */
    private final k0 f15010c;

    /* compiled from: NetworkFetchProducer.java */
    /* loaded from: classes.dex */
    class a implements k0.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ w f15011a;

        a(w wVar) {
            this.f15011a = wVar;
        }

        @Override // com.facebook.imagepipeline.producers.k0.a
        public void a() {
            j0.this.k(this.f15011a);
        }

        @Override // com.facebook.imagepipeline.producers.k0.a
        public void b(Throwable th) {
            j0.this.l(this.f15011a, th);
        }

        @Override // com.facebook.imagepipeline.producers.k0.a
        public void c(InputStream inputStream, int i10) throws IOException {
            if (c6.b.d()) {
                c6.b.a("NetworkFetcher->onResponse");
            }
            j0.this.m(this.f15011a, inputStream, i10);
            if (c6.b.d()) {
                c6.b.b();
            }
        }
    }

    public j0(b4.h hVar, b4.a aVar, k0 k0Var) {
        this.f15008a = hVar;
        this.f15009b = aVar;
        this.f15010c = k0Var;
    }

    protected static float e(int i10, int i11) {
        return i11 > 0 ? i10 / i11 : 1.0f - ((float) Math.exp((-i10) / 50000.0d));
    }

    private Map<String, String> f(w wVar, int i10) {
        if (wVar.d().f(wVar.b(), "NetworkFetchProducer")) {
            return this.f15010c.d(wVar, i10);
        }
        return null;
    }

    protected static void j(b4.j jVar, int i10, q5.a aVar, l<w5.e> lVar, p0 p0Var) {
        w5.e eVar;
        c4.a L = c4.a.L(jVar.a());
        w5.e eVar2 = null;
        try {
            eVar = new w5.e(L);
        } catch (Throwable th) {
            th = th;
        }
        try {
            eVar.H0(aVar);
            eVar.s0();
            p0Var.p(w5.f.NETWORK);
            lVar.c(eVar, i10);
            w5.e.d(eVar);
            c4.a.w(L);
        } catch (Throwable th2) {
            th = th2;
            eVar2 = eVar;
            w5.e.d(eVar2);
            c4.a.w(L);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(w wVar) {
        wVar.d().c(wVar.b(), "NetworkFetchProducer", null);
        wVar.a().a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(w wVar, Throwable th) {
        wVar.d().k(wVar.b(), "NetworkFetchProducer", th, null);
        wVar.d().b(wVar.b(), "NetworkFetchProducer", false);
        wVar.b().g("network");
        wVar.a().b(th);
    }

    private boolean n(w wVar) {
        if (wVar.b().i()) {
            return this.f15010c.c(wVar);
        }
        return false;
    }

    @Override // com.facebook.imagepipeline.producers.o0
    public void b(l<w5.e> lVar, p0 p0Var) {
        p0Var.h().d(p0Var, "NetworkFetchProducer");
        w e10 = this.f15010c.e(lVar, p0Var);
        this.f15010c.a(e10, new a(e10));
    }

    protected long g() {
        return SystemClock.uptimeMillis();
    }

    protected void h(b4.j jVar, w wVar) {
        Map<String, String> f10 = f(wVar, jVar.size());
        r0 d10 = wVar.d();
        d10.j(wVar.b(), "NetworkFetchProducer", f10);
        d10.b(wVar.b(), "NetworkFetchProducer", true);
        wVar.b().g("network");
        j(jVar, wVar.e() | 1, wVar.f(), wVar.a(), wVar.b());
    }

    protected void i(b4.j jVar, w wVar) {
        long g10 = g();
        if (!n(wVar) || g10 - wVar.c() < 100) {
            return;
        }
        wVar.h(g10);
        wVar.d().h(wVar.b(), "NetworkFetchProducer", "intermediate_result");
        j(jVar, wVar.e(), wVar.f(), wVar.a(), wVar.b());
    }

    protected void m(w wVar, InputStream inputStream, int i10) throws IOException {
        b4.j c10;
        if (i10 > 0) {
            c10 = this.f15008a.e(i10);
        } else {
            c10 = this.f15008a.c();
        }
        byte[] bArr = this.f15009b.get(16384);
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read < 0) {
                    this.f15010c.b(wVar, c10.size());
                    h(c10, wVar);
                    return;
                } else if (read > 0) {
                    c10.write(bArr, 0, read);
                    i(c10, wVar);
                    wVar.a().d(e(c10.size(), i10));
                }
            } finally {
                this.f15009b.a(bArr);
                c10.close();
            }
        }
    }
}
