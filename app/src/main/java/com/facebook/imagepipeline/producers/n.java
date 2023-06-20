package com.facebook.imagepipeline.producers;

import android.graphics.Bitmap;
import android.os.Build;
import com.facebook.imagepipeline.producers.a0;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: DecodeProducer.java */
/* loaded from: classes.dex */
public class n implements o0<c4.a<w5.c>> {

    /* renamed from: a  reason: collision with root package name */
    private final b4.a f15040a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f15041b;

    /* renamed from: c  reason: collision with root package name */
    private final u5.c f15042c;

    /* renamed from: d  reason: collision with root package name */
    private final u5.e f15043d;

    /* renamed from: e  reason: collision with root package name */
    private final o0<w5.e> f15044e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f15045f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f15046g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f15047h;

    /* renamed from: i  reason: collision with root package name */
    private final int f15048i;

    /* renamed from: j  reason: collision with root package name */
    private final r5.a f15049j;

    /* renamed from: k  reason: collision with root package name */
    private final Runnable f15050k;

    /* renamed from: l  reason: collision with root package name */
    private final y3.n<Boolean> f15051l;

    /* compiled from: DecodeProducer.java */
    /* loaded from: classes.dex */
    private class a extends c {
        public a(n nVar, l<c4.a<w5.c>> lVar, p0 p0Var, boolean z10, int i10) {
            super(lVar, p0Var, z10, i10);
        }

        @Override // com.facebook.imagepipeline.producers.n.c
        protected synchronized boolean I(w5.e eVar, int i10) {
            if (com.facebook.imagepipeline.producers.b.f(i10)) {
                return false;
            }
            return super.I(eVar, i10);
        }

        @Override // com.facebook.imagepipeline.producers.n.c
        protected int x(w5.e eVar) {
            return eVar.U();
        }

        @Override // com.facebook.imagepipeline.producers.n.c
        protected w5.j y() {
            return w5.i.d(0, false, false);
        }
    }

    /* compiled from: DecodeProducer.java */
    /* loaded from: classes.dex */
    private class b extends c {

        /* renamed from: i  reason: collision with root package name */
        private final u5.f f15052i;

        /* renamed from: j  reason: collision with root package name */
        private final u5.e f15053j;

        /* renamed from: k  reason: collision with root package name */
        private int f15054k;

        public b(n nVar, l<c4.a<w5.c>> lVar, p0 p0Var, u5.f fVar, u5.e eVar, boolean z10, int i10) {
            super(lVar, p0Var, z10, i10);
            this.f15052i = (u5.f) y3.k.g(fVar);
            this.f15053j = (u5.e) y3.k.g(eVar);
            this.f15054k = 0;
        }

        @Override // com.facebook.imagepipeline.producers.n.c
        protected synchronized boolean I(w5.e eVar, int i10) {
            boolean I = super.I(eVar, i10);
            if ((com.facebook.imagepipeline.producers.b.f(i10) || com.facebook.imagepipeline.producers.b.n(i10, 8)) && !com.facebook.imagepipeline.producers.b.n(i10, 4) && w5.e.r0(eVar) && eVar.A() == com.facebook.imageformat.b.f14800a) {
                if (!this.f15052i.g(eVar)) {
                    return false;
                }
                int d10 = this.f15052i.d();
                int i11 = this.f15054k;
                if (d10 <= i11) {
                    return false;
                }
                if (d10 < this.f15053j.a(i11) && !this.f15052i.e()) {
                    return false;
                }
                this.f15054k = d10;
            }
            return I;
        }

        @Override // com.facebook.imagepipeline.producers.n.c
        protected int x(w5.e eVar) {
            return this.f15052i.c();
        }

        @Override // com.facebook.imagepipeline.producers.n.c
        protected w5.j y() {
            return this.f15053j.b(this.f15052i.d());
        }
    }

    /* compiled from: DecodeProducer.java */
    /* loaded from: classes.dex */
    private abstract class c extends p<w5.e, c4.a<w5.c>> {

        /* renamed from: c  reason: collision with root package name */
        private final p0 f15055c;

        /* renamed from: d  reason: collision with root package name */
        private final r0 f15056d;

        /* renamed from: e  reason: collision with root package name */
        private final q5.b f15057e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f15058f;

        /* renamed from: g  reason: collision with root package name */
        private final a0 f15059g;

        /* compiled from: DecodeProducer.java */
        /* loaded from: classes.dex */
        class a implements a0.d {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ p0 f15061a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f15062b;

            a(n nVar, p0 p0Var, int i10) {
                this.f15061a = p0Var;
                this.f15062b = i10;
            }

            @Override // com.facebook.imagepipeline.producers.a0.d
            public void a(w5.e eVar, int i10) {
                if (eVar != null) {
                    c.this.f15055c.b("image_format", eVar.A().a());
                    if (n.this.f15045f || !com.facebook.imagepipeline.producers.b.n(i10, 16)) {
                        b6.b k10 = this.f15061a.k();
                        if (n.this.f15046g || !g4.f.l(k10.q())) {
                            eVar.U0(d6.a.b(k10.o(), k10.m(), eVar, this.f15062b));
                        }
                    }
                    if (this.f15061a.d().D().z()) {
                        c.this.F(eVar);
                    }
                    c.this.v(eVar, i10);
                }
            }
        }

        /* compiled from: DecodeProducer.java */
        /* loaded from: classes.dex */
        class b extends e {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ boolean f15064a;

            b(n nVar, boolean z10) {
                this.f15064a = z10;
            }

            @Override // com.facebook.imagepipeline.producers.e, com.facebook.imagepipeline.producers.q0
            public void a() {
                if (c.this.f15055c.i()) {
                    c.this.f15059g.h();
                }
            }

            @Override // com.facebook.imagepipeline.producers.q0
            public void b() {
                if (this.f15064a) {
                    c.this.z();
                }
            }
        }

        public c(l<c4.a<w5.c>> lVar, p0 p0Var, boolean z10, int i10) {
            super(lVar);
            this.f15055c = p0Var;
            this.f15056d = p0Var.h();
            q5.b d10 = p0Var.k().d();
            this.f15057e = d10;
            this.f15058f = false;
            this.f15059g = new a0(n.this.f15041b, new a(n.this, p0Var, i10), d10.f35917a);
            p0Var.c(new b(n.this, z10));
        }

        private void A(Throwable th) {
            E(true);
            p().b(th);
        }

        private void B(w5.c cVar, int i10) {
            c4.a<w5.c> b10 = n.this.f15049j.b(cVar);
            try {
                E(com.facebook.imagepipeline.producers.b.e(i10));
                p().c(b10, i10);
            } finally {
                c4.a.w(b10);
            }
        }

        private w5.c C(w5.e eVar, int i10, w5.j jVar) {
            boolean z10 = n.this.f15050k != null && ((Boolean) n.this.f15051l.get()).booleanValue();
            try {
                return n.this.f15042c.a(eVar, i10, jVar, this.f15057e);
            } catch (OutOfMemoryError e10) {
                if (z10) {
                    n.this.f15050k.run();
                    System.gc();
                    return n.this.f15042c.a(eVar, i10, jVar, this.f15057e);
                }
                throw e10;
            }
        }

        private synchronized boolean D() {
            return this.f15058f;
        }

        private void E(boolean z10) {
            synchronized (this) {
                if (z10) {
                    if (!this.f15058f) {
                        p().d(1.0f);
                        this.f15058f = true;
                        this.f15059g.c();
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void F(w5.e eVar) {
            if (eVar.A() != com.facebook.imageformat.b.f14800a) {
                return;
            }
            eVar.U0(d6.a.c(eVar, com.facebook.imageutils.a.c(this.f15057e.f35923g), 104857600));
        }

        private void H(w5.e eVar, w5.c cVar) {
            this.f15055c.b("encoded_width", Integer.valueOf(eVar.Z()));
            this.f15055c.b("encoded_height", Integer.valueOf(eVar.z()));
            this.f15055c.b("encoded_size", Integer.valueOf(eVar.U()));
            if (cVar instanceof w5.b) {
                Bitmap l10 = ((w5.b) cVar).l();
                this.f15055c.b("bitmap_config", String.valueOf(l10 == null ? null : l10.getConfig()));
            }
            if (cVar != null) {
                cVar.h(this.f15055c.getExtras());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00d4  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void v(w5.e r21, int r22) {
            /*
                Method dump skipped, instructions count: 322
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.n.c.v(w5.e, int):void");
        }

        private Map<String, String> w(w5.c cVar, long j10, w5.j jVar, boolean z10, String str, String str2, String str3, String str4) {
            Bitmap l10;
            if (this.f15056d.f(this.f15055c, "DecodeProducer")) {
                String valueOf = String.valueOf(j10);
                String valueOf2 = String.valueOf(jVar.b());
                String valueOf3 = String.valueOf(z10);
                if (cVar instanceof w5.d) {
                    y3.k.g(((w5.d) cVar).l());
                    HashMap hashMap = new HashMap(8);
                    hashMap.put("bitmapSize", l10.getWidth() + "x" + l10.getHeight());
                    hashMap.put("queueTime", valueOf);
                    hashMap.put("hasGoodQuality", valueOf2);
                    hashMap.put("isFinal", valueOf3);
                    hashMap.put("encodedImageSize", str2);
                    hashMap.put("imageFormat", str);
                    hashMap.put("requestedImageSize", str3);
                    hashMap.put("sampleSize", str4);
                    if (Build.VERSION.SDK_INT >= 12) {
                        hashMap.put("byteCount", l10.getByteCount() + "");
                    }
                    return y3.g.a(hashMap);
                }
                HashMap hashMap2 = new HashMap(7);
                hashMap2.put("queueTime", valueOf);
                hashMap2.put("hasGoodQuality", valueOf2);
                hashMap2.put("isFinal", valueOf3);
                hashMap2.put("encodedImageSize", str2);
                hashMap2.put("imageFormat", str);
                hashMap2.put("requestedImageSize", str3);
                hashMap2.put("sampleSize", str4);
                return y3.g.a(hashMap2);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void z() {
            E(true);
            p().a();
        }

        @Override // com.facebook.imagepipeline.producers.b
        /* renamed from: G */
        public void i(w5.e eVar, int i10) {
            boolean d10;
            try {
                if (c6.b.d()) {
                    c6.b.a("DecodeProducer#onNewResultImpl");
                }
                boolean e10 = com.facebook.imagepipeline.producers.b.e(i10);
                if (e10) {
                    if (eVar == null) {
                        A(new g4.a("Encoded image is null."));
                        if (d10) {
                            return;
                        }
                        return;
                    } else if (!eVar.q0()) {
                        A(new g4.a("Encoded image is not valid."));
                        if (c6.b.d()) {
                            c6.b.b();
                            return;
                        }
                        return;
                    }
                }
                if (!I(eVar, i10)) {
                    if (c6.b.d()) {
                        c6.b.b();
                        return;
                    }
                    return;
                }
                boolean n10 = com.facebook.imagepipeline.producers.b.n(i10, 4);
                if (e10 || n10 || this.f15055c.i()) {
                    this.f15059g.h();
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

        protected boolean I(w5.e eVar, int i10) {
            return this.f15059g.k(eVar, i10);
        }

        @Override // com.facebook.imagepipeline.producers.p, com.facebook.imagepipeline.producers.b
        public void g() {
            z();
        }

        @Override // com.facebook.imagepipeline.producers.p, com.facebook.imagepipeline.producers.b
        public void h(Throwable th) {
            A(th);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.p, com.facebook.imagepipeline.producers.b
        public void j(float f10) {
            super.j(f10 * 0.99f);
        }

        protected abstract int x(w5.e eVar);

        protected abstract w5.j y();
    }

    public n(b4.a aVar, Executor executor, u5.c cVar, u5.e eVar, boolean z10, boolean z11, boolean z12, o0<w5.e> o0Var, int i10, r5.a aVar2, Runnable runnable, y3.n<Boolean> nVar) {
        this.f15040a = (b4.a) y3.k.g(aVar);
        this.f15041b = (Executor) y3.k.g(executor);
        this.f15042c = (u5.c) y3.k.g(cVar);
        this.f15043d = (u5.e) y3.k.g(eVar);
        this.f15045f = z10;
        this.f15046g = z11;
        this.f15044e = (o0) y3.k.g(o0Var);
        this.f15047h = z12;
        this.f15048i = i10;
        this.f15049j = aVar2;
        this.f15050k = runnable;
        this.f15051l = nVar;
    }

    @Override // com.facebook.imagepipeline.producers.o0
    public void b(l<c4.a<w5.c>> lVar, p0 p0Var) {
        l<w5.e> bVar;
        try {
            if (c6.b.d()) {
                c6.b.a("DecodeProducer#produceResults");
            }
            if (!g4.f.l(p0Var.k().q())) {
                bVar = new a(this, lVar, p0Var, this.f15047h, this.f15048i);
            } else {
                bVar = new b(this, lVar, p0Var, new u5.f(this.f15040a), this.f15043d, this.f15047h, this.f15048i);
            }
            this.f15044e.b(bVar, p0Var);
        } finally {
            if (c6.b.d()) {
                c6.b.b();
            }
        }
    }
}
