package r5;

import android.content.ContentResolver;
import android.net.Uri;
import b6.b;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.producers.d1;
import com.facebook.imagepipeline.producers.k0;
import com.facebook.imagepipeline.producers.o0;
import com.facebook.imagepipeline.producers.q;
import com.facebook.imagepipeline.producers.r;
import com.facebook.imagepipeline.producers.t;
import com.facebook.imagepipeline.producers.z0;
import java.util.HashMap;
import java.util.Map;

/* compiled from: ProducerSequenceFactory.java */
/* loaded from: classes.dex */
public class p {
    o0<c4.a<w5.c>> A;
    o0<c4.a<w5.c>> B;
    Map<o0<c4.a<w5.c>>, o0<c4.a<w5.c>>> C = new HashMap();
    Map<o0<c4.a<w5.c>>, o0<c4.a<w5.c>>> D;

    /* renamed from: a  reason: collision with root package name */
    private final ContentResolver f36416a;

    /* renamed from: b  reason: collision with root package name */
    private final o f36417b;

    /* renamed from: c  reason: collision with root package name */
    private final k0 f36418c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f36419d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f36420e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f36421f;

    /* renamed from: g  reason: collision with root package name */
    private final z0 f36422g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f36423h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f36424i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f36425j;

    /* renamed from: k  reason: collision with root package name */
    private final d6.d f36426k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f36427l;

    /* renamed from: m  reason: collision with root package name */
    private final boolean f36428m;

    /* renamed from: n  reason: collision with root package name */
    private final boolean f36429n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f36430o;

    /* renamed from: p  reason: collision with root package name */
    o0<c4.a<w5.c>> f36431p;

    /* renamed from: q  reason: collision with root package name */
    o0<w5.e> f36432q;

    /* renamed from: r  reason: collision with root package name */
    o0<w5.e> f36433r;

    /* renamed from: s  reason: collision with root package name */
    o0<Void> f36434s;

    /* renamed from: t  reason: collision with root package name */
    o0<Void> f36435t;

    /* renamed from: u  reason: collision with root package name */
    private o0<w5.e> f36436u;

    /* renamed from: v  reason: collision with root package name */
    o0<c4.a<w5.c>> f36437v;

    /* renamed from: w  reason: collision with root package name */
    o0<c4.a<w5.c>> f36438w;

    /* renamed from: x  reason: collision with root package name */
    o0<c4.a<w5.c>> f36439x;

    /* renamed from: y  reason: collision with root package name */
    o0<c4.a<w5.c>> f36440y;

    /* renamed from: z  reason: collision with root package name */
    o0<c4.a<w5.c>> f36441z;

    public p(ContentResolver contentResolver, o oVar, k0 k0Var, boolean z10, boolean z11, z0 z0Var, boolean z12, boolean z13, boolean z14, boolean z15, d6.d dVar, boolean z16, boolean z17, boolean z18, boolean z19) {
        this.f36416a = contentResolver;
        this.f36417b = oVar;
        this.f36418c = k0Var;
        this.f36419d = z10;
        this.f36420e = z11;
        this.f36429n = z18;
        new HashMap();
        this.D = new HashMap();
        this.f36422g = z0Var;
        this.f36423h = z12;
        this.f36424i = z13;
        this.f36421f = z14;
        this.f36425j = z15;
        this.f36426k = dVar;
        this.f36427l = z16;
        this.f36428m = z17;
        this.f36430o = z19;
    }

    private o0<w5.e> A(d1<EncodedImage>[] d1VarArr) {
        return this.f36417b.D(this.f36417b.G(d1VarArr), true, this.f36426k);
    }

    private o0<w5.e> B(o0<w5.e> o0Var, d1<EncodedImage>[] d1VarArr) {
        return o.h(A(d1VarArr), this.f36417b.F(this.f36417b.D(o.a(o0Var), true, this.f36426k)));
    }

    private static void C(b6.b bVar) {
        y3.k.g(bVar);
        y3.k.b(Boolean.valueOf(bVar.f().f() <= b.c.ENCODED_MEMORY_CACHE.f()));
    }

    private synchronized o0<w5.e> a() {
        if (c6.b.d()) {
            c6.b.a("ProducerSequenceFactory#getBackgroundLocalFileFetchToEncodeMemorySequence");
        }
        if (this.f36432q == null) {
            if (c6.b.d()) {
                c6.b.a("ProducerSequenceFactory#getBackgroundLocalFileFetchToEncodeMemorySequence:init");
            }
            this.f36432q = this.f36417b.b(z(this.f36417b.v()), this.f36422g);
            if (c6.b.d()) {
                c6.b.b();
            }
        }
        if (c6.b.d()) {
            c6.b.b();
        }
        return this.f36432q;
    }

    private synchronized o0<w5.e> b() {
        if (c6.b.d()) {
            c6.b.a("ProducerSequenceFactory#getBackgroundNetworkFetchToEncodedMemorySequence");
        }
        if (this.f36433r == null) {
            if (c6.b.d()) {
                c6.b.a("ProducerSequenceFactory#getBackgroundNetworkFetchToEncodedMemorySequence:init");
            }
            this.f36433r = this.f36417b.b(e(), this.f36422g);
            if (c6.b.d()) {
                c6.b.b();
            }
        }
        if (c6.b.d()) {
            c6.b.b();
        }
        return this.f36433r;
    }

    private o0<c4.a<w5.c>> c(b6.b bVar) {
        try {
            if (c6.b.d()) {
                c6.b.a("ProducerSequenceFactory#getBasicDecodedImageSequence");
            }
            y3.k.g(bVar);
            Uri q10 = bVar.q();
            y3.k.h(q10, "Uri is null.");
            int r10 = bVar.r();
            if (r10 != 0) {
                switch (r10) {
                    case 2:
                        o0<c4.a<w5.c>> o10 = o();
                        if (c6.b.d()) {
                            c6.b.b();
                        }
                        return o10;
                    case 3:
                        o0<c4.a<w5.c>> m10 = m();
                        if (c6.b.d()) {
                            c6.b.b();
                        }
                        return m10;
                    case 4:
                        if (a4.a.c(this.f36416a.getType(q10))) {
                            o0<c4.a<w5.c>> o11 = o();
                            if (c6.b.d()) {
                                c6.b.b();
                            }
                            return o11;
                        }
                        o0<c4.a<w5.c>> k10 = k();
                        if (c6.b.d()) {
                            c6.b.b();
                        }
                        return k10;
                    case 5:
                        o0<c4.a<w5.c>> j10 = j();
                        if (c6.b.d()) {
                            c6.b.b();
                        }
                        return j10;
                    case 6:
                        o0<c4.a<w5.c>> n10 = n();
                        if (c6.b.d()) {
                            c6.b.b();
                        }
                        return n10;
                    case 7:
                        o0<c4.a<w5.c>> f10 = f();
                        if (c6.b.d()) {
                            c6.b.b();
                        }
                        return f10;
                    case 8:
                        return s();
                    default:
                        throw new IllegalArgumentException("Unsupported uri scheme! Uri is: " + t(q10));
                }
            }
            o0<c4.a<w5.c>> p10 = p();
            if (c6.b.d()) {
                c6.b.b();
            }
            return p10;
        } finally {
            if (c6.b.d()) {
                c6.b.b();
            }
        }
    }

    private synchronized o0<c4.a<w5.c>> d(o0<c4.a<w5.c>> o0Var) {
        o0<c4.a<w5.c>> o0Var2;
        o0Var2 = this.D.get(o0Var);
        if (o0Var2 == null) {
            o0Var2 = this.f36417b.f(o0Var);
            this.D.put(o0Var, o0Var2);
        }
        return o0Var2;
    }

    private synchronized o0<w5.e> e() {
        o0<w5.e> z10;
        if (c6.b.d()) {
            c6.b.a("ProducerSequenceFactory#getCommonNetworkFetchToEncodedMemorySequence");
        }
        if (this.f36436u == null) {
            if (c6.b.d()) {
                c6.b.a("ProducerSequenceFactory#getCommonNetworkFetchToEncodedMemorySequence:init");
            }
            if (this.f36429n) {
                z10 = this.f36417b.i(this.f36418c);
            } else {
                z10 = z(this.f36417b.y(this.f36418c));
            }
            com.facebook.imagepipeline.producers.a a10 = o.a((o0) y3.k.g(z10));
            this.f36436u = a10;
            this.f36436u = this.f36417b.D(a10, this.f36419d && !this.f36423h, this.f36426k);
            if (c6.b.d()) {
                c6.b.b();
            }
        }
        if (c6.b.d()) {
            c6.b.b();
        }
        return this.f36436u;
    }

    private synchronized o0<c4.a<w5.c>> f() {
        if (this.A == null) {
            o0<w5.e> j10 = this.f36417b.j();
            if (h4.c.f31090a && (!this.f36420e || h4.c.f31091b == null)) {
                j10 = this.f36417b.H(j10);
            }
            this.A = v(this.f36417b.D(o.a(j10), true, this.f36426k));
        }
        return this.A;
    }

    private synchronized o0<c4.a<w5.c>> h(o0<c4.a<w5.c>> o0Var) {
        return this.f36417b.l(o0Var);
    }

    private synchronized o0<c4.a<w5.c>> j() {
        if (this.f36441z == null) {
            this.f36441z = w(this.f36417b.r());
        }
        return this.f36441z;
    }

    private synchronized o0<c4.a<w5.c>> k() {
        if (this.f36439x == null) {
            this.f36439x = x(this.f36417b.s(), new d1[]{this.f36417b.t(), this.f36417b.u()});
        }
        return this.f36439x;
    }

    private synchronized o0<Void> l() {
        if (c6.b.d()) {
            c6.b.a("ProducerSequenceFactory#getLocalFileFetchToEncodedMemoryPrefetchSequence");
        }
        if (this.f36434s == null) {
            if (c6.b.d()) {
                c6.b.a("ProducerSequenceFactory#getLocalFileFetchToEncodedMemoryPrefetchSequence:init");
            }
            this.f36434s = this.f36417b.E(a());
            if (c6.b.d()) {
                c6.b.b();
            }
        }
        if (c6.b.d()) {
            c6.b.b();
        }
        return this.f36434s;
    }

    private synchronized o0<c4.a<w5.c>> m() {
        if (this.f36437v == null) {
            this.f36437v = w(this.f36417b.v());
        }
        return this.f36437v;
    }

    private synchronized o0<c4.a<w5.c>> n() {
        if (this.f36440y == null) {
            this.f36440y = w(this.f36417b.w());
        }
        return this.f36440y;
    }

    private synchronized o0<c4.a<w5.c>> o() {
        if (this.f36438w == null) {
            this.f36438w = u(this.f36417b.x());
        }
        return this.f36438w;
    }

    private synchronized o0<c4.a<w5.c>> p() {
        if (c6.b.d()) {
            c6.b.a("ProducerSequenceFactory#getNetworkFetchSequence");
        }
        if (this.f36431p == null) {
            if (c6.b.d()) {
                c6.b.a("ProducerSequenceFactory#getNetworkFetchSequence:init");
            }
            this.f36431p = v(e());
            if (c6.b.d()) {
                c6.b.b();
            }
        }
        if (c6.b.d()) {
            c6.b.b();
        }
        return this.f36431p;
    }

    private synchronized o0<Void> q() {
        if (c6.b.d()) {
            c6.b.a("ProducerSequenceFactory#getNetworkFetchToEncodedMemoryPrefetchSequence");
        }
        if (this.f36435t == null) {
            if (c6.b.d()) {
                c6.b.a("ProducerSequenceFactory#getNetworkFetchToEncodedMemoryPrefetchSequence:init");
            }
            this.f36435t = this.f36417b.E(b());
            if (c6.b.d()) {
                c6.b.b();
            }
        }
        if (c6.b.d()) {
            c6.b.b();
        }
        return this.f36435t;
    }

    private synchronized o0<c4.a<w5.c>> r(o0<c4.a<w5.c>> o0Var) {
        o0<c4.a<w5.c>> o0Var2;
        o0Var2 = this.C.get(o0Var);
        if (o0Var2 == null) {
            o0Var2 = this.f36417b.A(this.f36417b.B(o0Var));
            this.C.put(o0Var, o0Var2);
        }
        return o0Var2;
    }

    private synchronized o0<c4.a<w5.c>> s() {
        if (this.B == null) {
            this.B = w(this.f36417b.C());
        }
        return this.B;
    }

    private static String t(Uri uri) {
        String valueOf = String.valueOf(uri);
        if (valueOf.length() > 30) {
            return valueOf.substring(0, 30) + "...";
        }
        return valueOf;
    }

    private o0<c4.a<w5.c>> u(o0<c4.a<w5.c>> o0Var) {
        o0<c4.a<w5.c>> b10 = this.f36417b.b(this.f36417b.d(this.f36417b.e(o0Var)), this.f36422g);
        if (!this.f36427l && !this.f36428m) {
            return this.f36417b.c(b10);
        }
        return this.f36417b.g(this.f36417b.c(b10));
    }

    private o0<c4.a<w5.c>> v(o0<w5.e> o0Var) {
        if (c6.b.d()) {
            c6.b.a("ProducerSequenceFactory#newBitmapCacheGetToDecodeSequence");
        }
        o0<c4.a<w5.c>> u10 = u(this.f36417b.k(o0Var));
        if (c6.b.d()) {
            c6.b.b();
        }
        return u10;
    }

    private o0<c4.a<w5.c>> w(o0<w5.e> o0Var) {
        return x(o0Var, new d1[]{this.f36417b.u()});
    }

    private o0<c4.a<w5.c>> x(o0<w5.e> o0Var, d1<EncodedImage>[] d1VarArr) {
        return v(B(z(o0Var), d1VarArr));
    }

    private o0<w5.e> y(o0<w5.e> o0Var) {
        r n10;
        if (c6.b.d()) {
            c6.b.a("ProducerSequenceFactory#newDiskCacheSequence");
        }
        if (this.f36421f) {
            n10 = this.f36417b.n(this.f36417b.z(o0Var));
        } else {
            n10 = this.f36417b.n(o0Var);
        }
        q m10 = this.f36417b.m(n10);
        if (c6.b.d()) {
            c6.b.b();
        }
        return m10;
    }

    private o0<w5.e> z(o0<w5.e> o0Var) {
        if (h4.c.f31090a && (!this.f36420e || h4.c.f31091b == null)) {
            o0Var = this.f36417b.H(o0Var);
        }
        if (this.f36425j) {
            o0Var = y(o0Var);
        }
        t p10 = this.f36417b.p(o0Var);
        if (this.f36428m) {
            return this.f36417b.o(this.f36417b.q(p10));
        }
        return this.f36417b.o(p10);
    }

    public o0<c4.a<w5.c>> g(b6.b bVar) {
        if (c6.b.d()) {
            c6.b.a("ProducerSequenceFactory#getDecodedImageProducerSequence");
        }
        o0<c4.a<w5.c>> c10 = c(bVar);
        if (bVar.g() != null) {
            c10 = r(c10);
        }
        if (this.f36424i) {
            c10 = d(c10);
        }
        if (this.f36430o && bVar.c() > 0) {
            c10 = h(c10);
        }
        if (c6.b.d()) {
            c6.b.b();
        }
        return c10;
    }

    public o0<Void> i(b6.b bVar) {
        C(bVar);
        int r10 = bVar.r();
        if (r10 != 0) {
            if (r10 != 2 && r10 != 3) {
                Uri q10 = bVar.q();
                throw new IllegalArgumentException("Unsupported uri scheme for encoded image fetch! Uri is: " + t(q10));
            }
            return l();
        }
        return q();
    }
}
