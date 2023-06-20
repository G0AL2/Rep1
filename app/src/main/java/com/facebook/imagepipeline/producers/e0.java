package com.facebook.imagepipeline.producers;

import com.google.android.gms.common.internal.ImagesContract;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* compiled from: LocalFetchProducer.java */
/* loaded from: classes.dex */
public abstract class e0 implements o0<w5.e> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f14942a;

    /* renamed from: b  reason: collision with root package name */
    private final b4.h f14943b;

    /* compiled from: LocalFetchProducer.java */
    /* loaded from: classes.dex */
    class a extends w0<w5.e> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ b6.b f14944f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ r0 f14945g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ p0 f14946h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(l lVar, r0 r0Var, p0 p0Var, String str, b6.b bVar, r0 r0Var2, p0 p0Var2) {
            super(lVar, r0Var, p0Var, str);
            this.f14944f = bVar;
            this.f14945g = r0Var2;
            this.f14946h = p0Var2;
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
            w5.e d10 = e0.this.d(this.f14944f);
            if (d10 == null) {
                this.f14945g.b(this.f14946h, e0.this.f(), false);
                this.f14946h.g(ImagesContract.LOCAL);
                return null;
            }
            d10.s0();
            this.f14945g.b(this.f14946h, e0.this.f(), true);
            this.f14946h.g(ImagesContract.LOCAL);
            return d10;
        }
    }

    /* compiled from: LocalFetchProducer.java */
    /* loaded from: classes.dex */
    class b extends e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ w0 f14948a;

        b(e0 e0Var, w0 w0Var) {
            this.f14948a = w0Var;
        }

        @Override // com.facebook.imagepipeline.producers.q0
        public void b() {
            this.f14948a.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public e0(Executor executor, b4.h hVar) {
        this.f14942a = executor;
        this.f14943b = hVar;
    }

    @Override // com.facebook.imagepipeline.producers.o0
    public void b(l<w5.e> lVar, p0 p0Var) {
        r0 h10 = p0Var.h();
        b6.b k10 = p0Var.k();
        p0Var.e(ImagesContract.LOCAL, "fetch");
        a aVar = new a(lVar, h10, p0Var, f(), k10, h10, p0Var);
        p0Var.c(new b(this, aVar));
        this.f14942a.execute(aVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public w5.e c(InputStream inputStream, int i10) throws IOException {
        c4.a L;
        c4.a aVar = null;
        try {
            if (i10 <= 0) {
                L = c4.a.L(this.f14943b.a(inputStream));
            } else {
                L = c4.a.L(this.f14943b.b(inputStream, i10));
            }
            aVar = L;
            return new w5.e(aVar);
        } finally {
            y3.b.b(inputStream);
            c4.a.w(aVar);
        }
    }

    protected abstract w5.e d(b6.b bVar) throws IOException;

    /* JADX INFO: Access modifiers changed from: protected */
    public w5.e e(InputStream inputStream, int i10) throws IOException {
        return c(inputStream, i10);
    }

    protected abstract String f();
}
