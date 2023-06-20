package com.facebook.imagepipeline.producers;

import android.net.Uri;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PartialDiskCacheProducer.java */
/* loaded from: classes.dex */
public class l0 implements o0<w5.e> {

    /* renamed from: a  reason: collision with root package name */
    private final p5.e f15017a;

    /* renamed from: b  reason: collision with root package name */
    private final p5.f f15018b;

    /* renamed from: c  reason: collision with root package name */
    private final b4.h f15019c;

    /* renamed from: d  reason: collision with root package name */
    private final b4.a f15020d;

    /* renamed from: e  reason: collision with root package name */
    private final o0<w5.e> f15021e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PartialDiskCacheProducer.java */
    /* loaded from: classes.dex */
    public class a implements s1.d<w5.e, Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r0 f15022a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p0 f15023b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ l f15024c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ t3.d f15025d;

        a(r0 r0Var, p0 p0Var, l lVar, t3.d dVar) {
            this.f15022a = r0Var;
            this.f15023b = p0Var;
            this.f15024c = lVar;
            this.f15025d = dVar;
        }

        @Override // s1.d
        /* renamed from: b */
        public Void a(s1.f<w5.e> fVar) throws Exception {
            if (l0.g(fVar)) {
                this.f15022a.c(this.f15023b, "PartialDiskCacheProducer", null);
                this.f15024c.a();
            } else if (fVar.n()) {
                this.f15022a.k(this.f15023b, "PartialDiskCacheProducer", fVar.i(), null);
                l0.this.i(this.f15024c, this.f15023b, this.f15025d, null);
            } else {
                w5.e j10 = fVar.j();
                if (j10 != null) {
                    r0 r0Var = this.f15022a;
                    p0 p0Var = this.f15023b;
                    r0Var.j(p0Var, "PartialDiskCacheProducer", l0.f(r0Var, p0Var, true, j10.U()));
                    q5.a e10 = q5.a.e(j10.U() - 1);
                    j10.H0(e10);
                    int U = j10.U();
                    b6.b k10 = this.f15023b.k();
                    if (e10.a(k10.a())) {
                        this.f15023b.e("disk", "partial");
                        this.f15022a.b(this.f15023b, "PartialDiskCacheProducer", true);
                        this.f15024c.c(j10, 9);
                    } else {
                        this.f15024c.c(j10, 8);
                        l0.this.i(this.f15024c, new v0(b6.c.b(k10).u(q5.a.b(U - 1)).a(), this.f15023b), this.f15025d, j10);
                    }
                } else {
                    r0 r0Var2 = this.f15022a;
                    p0 p0Var2 = this.f15023b;
                    r0Var2.j(p0Var2, "PartialDiskCacheProducer", l0.f(r0Var2, p0Var2, false, 0));
                    l0.this.i(this.f15024c, this.f15023b, this.f15025d, j10);
                }
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PartialDiskCacheProducer.java */
    /* loaded from: classes.dex */
    public class b extends e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AtomicBoolean f15027a;

        b(l0 l0Var, AtomicBoolean atomicBoolean) {
            this.f15027a = atomicBoolean;
        }

        @Override // com.facebook.imagepipeline.producers.q0
        public void b() {
            this.f15027a.set(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PartialDiskCacheProducer.java */
    /* loaded from: classes.dex */
    public static class c extends p<w5.e, w5.e> {

        /* renamed from: c  reason: collision with root package name */
        private final p5.e f15028c;

        /* renamed from: d  reason: collision with root package name */
        private final t3.d f15029d;

        /* renamed from: e  reason: collision with root package name */
        private final b4.h f15030e;

        /* renamed from: f  reason: collision with root package name */
        private final b4.a f15031f;

        /* renamed from: g  reason: collision with root package name */
        private final w5.e f15032g;

        /* synthetic */ c(l lVar, p5.e eVar, t3.d dVar, b4.h hVar, b4.a aVar, w5.e eVar2, a aVar2) {
            this(lVar, eVar, dVar, hVar, aVar, eVar2);
        }

        private void q(InputStream inputStream, OutputStream outputStream, int i10) throws IOException {
            byte[] bArr = this.f15031f.get(16384);
            int i11 = i10;
            while (i11 > 0) {
                try {
                    int read = inputStream.read(bArr, 0, Math.min(16384, i11));
                    if (read < 0) {
                        break;
                    } else if (read > 0) {
                        outputStream.write(bArr, 0, read);
                        i11 -= read;
                    }
                } finally {
                    this.f15031f.a(bArr);
                }
            }
            if (i11 > 0) {
                throw new IOException(String.format(null, "Failed to read %d bytes - finished %d short", Integer.valueOf(i10), Integer.valueOf(i11)));
            }
        }

        private b4.j r(w5.e eVar, w5.e eVar2) throws IOException {
            int i10 = ((q5.a) y3.k.g(eVar2.l())).f35914a;
            b4.j e10 = this.f15030e.e(eVar2.U() + i10);
            q(eVar.L(), e10, i10);
            q(eVar2.L(), e10, eVar2.U());
            return e10;
        }

        private void t(b4.j jVar) {
            w5.e eVar;
            Throwable th;
            c4.a L = c4.a.L(jVar.a());
            try {
                eVar = new w5.e(L);
            } catch (Throwable th2) {
                eVar = null;
                th = th2;
            }
            try {
                eVar.s0();
                p().c(eVar, 1);
                w5.e.d(eVar);
                c4.a.w(L);
            } catch (Throwable th3) {
                th = th3;
                w5.e.d(eVar);
                c4.a.w(L);
                throw th;
            }
        }

        @Override // com.facebook.imagepipeline.producers.b
        /* renamed from: s */
        public void i(w5.e eVar, int i10) {
            if (com.facebook.imagepipeline.producers.b.f(i10)) {
                return;
            }
            if (this.f15032g != null && eVar != null && eVar.l() != null) {
                try {
                    try {
                        t(r(this.f15032g, eVar));
                    } catch (IOException e10) {
                        z3.a.k("PartialDiskCacheProducer", "Error while merging image data", e10);
                        p().b(e10);
                    }
                    this.f15028c.r(this.f15029d);
                } finally {
                    eVar.close();
                    this.f15032g.close();
                }
            } else if (com.facebook.imagepipeline.producers.b.n(i10, 8) && com.facebook.imagepipeline.producers.b.e(i10) && eVar != null && eVar.A() != com.facebook.imageformat.c.f14812b) {
                this.f15028c.p(this.f15029d, eVar);
                p().c(eVar, i10);
            } else {
                p().c(eVar, i10);
            }
        }

        private c(l<w5.e> lVar, p5.e eVar, t3.d dVar, b4.h hVar, b4.a aVar, w5.e eVar2) {
            super(lVar);
            this.f15028c = eVar;
            this.f15029d = dVar;
            this.f15030e = hVar;
            this.f15031f = aVar;
            this.f15032g = eVar2;
        }
    }

    public l0(p5.e eVar, p5.f fVar, b4.h hVar, b4.a aVar, o0<w5.e> o0Var) {
        this.f15017a = eVar;
        this.f15018b = fVar;
        this.f15019c = hVar;
        this.f15020d = aVar;
        this.f15021e = o0Var;
    }

    private static Uri e(b6.b bVar) {
        return bVar.q().buildUpon().appendQueryParameter("fresco_partial", InneractiveMediationDefs.SHOW_HOUSE_AD_YES).build();
    }

    static Map<String, String> f(r0 r0Var, p0 p0Var, boolean z10, int i10) {
        if (r0Var.f(p0Var, "PartialDiskCacheProducer")) {
            if (z10) {
                return y3.g.of("cached_value_found", String.valueOf(z10), "encodedImageSize", String.valueOf(i10));
            }
            return y3.g.of("cached_value_found", String.valueOf(z10));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean g(s1.f<?> fVar) {
        return fVar.l() || (fVar.n() && (fVar.i() instanceof CancellationException));
    }

    private s1.d<w5.e, Void> h(l<w5.e> lVar, p0 p0Var, t3.d dVar) {
        return new a(p0Var.h(), p0Var, lVar, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(l<w5.e> lVar, p0 p0Var, t3.d dVar, w5.e eVar) {
        this.f15021e.b(new c(lVar, this.f15017a, dVar, this.f15019c, this.f15020d, eVar, null), p0Var);
    }

    private void j(AtomicBoolean atomicBoolean, p0 p0Var) {
        p0Var.c(new b(this, atomicBoolean));
    }

    @Override // com.facebook.imagepipeline.producers.o0
    public void b(l<w5.e> lVar, p0 p0Var) {
        b6.b k10 = p0Var.k();
        if (!k10.t()) {
            this.f15021e.b(lVar, p0Var);
            return;
        }
        p0Var.h().d(p0Var, "PartialDiskCacheProducer");
        t3.d d10 = this.f15018b.d(k10, e(k10), p0Var.a());
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f15017a.n(d10, atomicBoolean).e(h(lVar, p0Var, d10));
        j(atomicBoolean, p0Var);
    }
}
