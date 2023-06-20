package r5;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.producers.LocalExifThumbnailProducer;
import com.facebook.imagepipeline.producers.b0;
import com.facebook.imagepipeline.producers.b1;
import com.facebook.imagepipeline.producers.c0;
import com.facebook.imagepipeline.producers.c1;
import com.facebook.imagepipeline.producers.d0;
import com.facebook.imagepipeline.producers.d1;
import com.facebook.imagepipeline.producers.f0;
import com.facebook.imagepipeline.producers.f1;
import com.facebook.imagepipeline.producers.g0;
import com.facebook.imagepipeline.producers.h0;
import com.facebook.imagepipeline.producers.j0;
import com.facebook.imagepipeline.producers.k0;
import com.facebook.imagepipeline.producers.l0;
import com.facebook.imagepipeline.producers.m0;
import com.facebook.imagepipeline.producers.n0;
import com.facebook.imagepipeline.producers.o0;
import com.facebook.imagepipeline.producers.q;
import com.facebook.imagepipeline.producers.r;
import com.facebook.imagepipeline.producers.t;
import com.facebook.imagepipeline.producers.t0;
import com.facebook.imagepipeline.producers.u;
import com.facebook.imagepipeline.producers.u0;
import com.facebook.imagepipeline.producers.x0;
import com.facebook.imagepipeline.producers.y0;
import com.facebook.imagepipeline.producers.z0;
import p5.s;

/* compiled from: ProducerFactory.java */
/* loaded from: classes.dex */
public class o {

    /* renamed from: a  reason: collision with root package name */
    protected ContentResolver f36391a;

    /* renamed from: b  reason: collision with root package name */
    protected Resources f36392b;

    /* renamed from: c  reason: collision with root package name */
    protected AssetManager f36393c;

    /* renamed from: d  reason: collision with root package name */
    protected final b4.a f36394d;

    /* renamed from: e  reason: collision with root package name */
    protected final u5.c f36395e;

    /* renamed from: f  reason: collision with root package name */
    protected final u5.e f36396f;

    /* renamed from: g  reason: collision with root package name */
    protected final boolean f36397g;

    /* renamed from: h  reason: collision with root package name */
    protected final boolean f36398h;

    /* renamed from: i  reason: collision with root package name */
    protected final boolean f36399i;

    /* renamed from: j  reason: collision with root package name */
    protected final f f36400j;

    /* renamed from: k  reason: collision with root package name */
    protected final b4.h f36401k;

    /* renamed from: l  reason: collision with root package name */
    protected final p5.e f36402l;

    /* renamed from: m  reason: collision with root package name */
    protected final p5.e f36403m;

    /* renamed from: n  reason: collision with root package name */
    protected final s<t3.d, b4.g> f36404n;

    /* renamed from: o  reason: collision with root package name */
    protected final s<t3.d, w5.c> f36405o;

    /* renamed from: p  reason: collision with root package name */
    protected final p5.f f36406p;

    /* renamed from: q  reason: collision with root package name */
    protected final p5.d<t3.d> f36407q;

    /* renamed from: r  reason: collision with root package name */
    protected final p5.d<t3.d> f36408r;

    /* renamed from: s  reason: collision with root package name */
    protected final o5.f f36409s;

    /* renamed from: t  reason: collision with root package name */
    protected final int f36410t;

    /* renamed from: u  reason: collision with root package name */
    protected final int f36411u;

    /* renamed from: v  reason: collision with root package name */
    protected boolean f36412v;

    /* renamed from: w  reason: collision with root package name */
    protected final a f36413w;

    /* renamed from: x  reason: collision with root package name */
    protected final int f36414x;

    /* renamed from: y  reason: collision with root package name */
    protected final boolean f36415y;

    public o(Context context, b4.a aVar, u5.c cVar, u5.e eVar, boolean z10, boolean z11, boolean z12, f fVar, b4.h hVar, s<t3.d, w5.c> sVar, s<t3.d, b4.g> sVar2, p5.e eVar2, p5.e eVar3, p5.f fVar2, o5.f fVar3, int i10, int i11, boolean z13, int i12, a aVar2, boolean z14, int i13) {
        this.f36391a = context.getApplicationContext().getContentResolver();
        this.f36392b = context.getApplicationContext().getResources();
        this.f36393c = context.getApplicationContext().getAssets();
        this.f36394d = aVar;
        this.f36395e = cVar;
        this.f36396f = eVar;
        this.f36397g = z10;
        this.f36398h = z11;
        this.f36399i = z12;
        this.f36400j = fVar;
        this.f36401k = hVar;
        this.f36405o = sVar;
        this.f36404n = sVar2;
        this.f36402l = eVar2;
        this.f36403m = eVar3;
        this.f36406p = fVar2;
        this.f36409s = fVar3;
        this.f36407q = new p5.d<>(i13);
        this.f36408r = new p5.d<>(i13);
        this.f36410t = i10;
        this.f36411u = i11;
        this.f36412v = z13;
        this.f36414x = i12;
        this.f36413w = aVar2;
        this.f36415y = z14;
    }

    public static com.facebook.imagepipeline.producers.a a(o0<w5.e> o0Var) {
        return new com.facebook.imagepipeline.producers.a(o0Var);
    }

    public static com.facebook.imagepipeline.producers.k h(o0<w5.e> o0Var, o0<w5.e> o0Var2) {
        return new com.facebook.imagepipeline.producers.k(o0Var, o0Var2);
    }

    public m0 A(o0<c4.a<w5.c>> o0Var) {
        return new m0(this.f36405o, this.f36406p, o0Var);
    }

    public n0 B(o0<c4.a<w5.c>> o0Var) {
        return new n0(o0Var, this.f36409s, this.f36400j.e());
    }

    public t0 C() {
        return new t0(this.f36400j.f(), this.f36401k, this.f36391a);
    }

    public u0 D(o0<w5.e> o0Var, boolean z10, d6.d dVar) {
        return new u0(this.f36400j.e(), this.f36401k, o0Var, z10, dVar);
    }

    public <T> x0<T> E(o0<T> o0Var) {
        return new x0<>(o0Var);
    }

    public <T> b1<T> F(o0<T> o0Var) {
        return new b1<>(5, this.f36400j.a(), o0Var);
    }

    public c1 G(d1<EncodedImage>[] d1VarArr) {
        return new c1(d1VarArr);
    }

    public f1 H(o0<w5.e> o0Var) {
        return new f1(this.f36400j.e(), this.f36401k, o0Var);
    }

    public <T> o0<T> b(o0<T> o0Var, z0 z0Var) {
        return new y0(o0Var, z0Var);
    }

    public com.facebook.imagepipeline.producers.f c(o0<c4.a<w5.c>> o0Var) {
        return new com.facebook.imagepipeline.producers.f(this.f36405o, this.f36406p, o0Var);
    }

    public com.facebook.imagepipeline.producers.g d(o0<c4.a<w5.c>> o0Var) {
        return new com.facebook.imagepipeline.producers.g(this.f36406p, o0Var);
    }

    public com.facebook.imagepipeline.producers.h e(o0<c4.a<w5.c>> o0Var) {
        return new com.facebook.imagepipeline.producers.h(this.f36405o, this.f36406p, o0Var);
    }

    public com.facebook.imagepipeline.producers.i f(o0<c4.a<w5.c>> o0Var) {
        return new com.facebook.imagepipeline.producers.i(o0Var, this.f36410t, this.f36411u, this.f36412v);
    }

    public com.facebook.imagepipeline.producers.j g(o0<c4.a<w5.c>> o0Var) {
        return new com.facebook.imagepipeline.producers.j(this.f36404n, this.f36402l, this.f36403m, this.f36406p, this.f36407q, this.f36408r, o0Var);
    }

    public o0<w5.e> i(k0 k0Var) {
        return null;
    }

    public com.facebook.imagepipeline.producers.m j() {
        return new com.facebook.imagepipeline.producers.m(this.f36401k);
    }

    public com.facebook.imagepipeline.producers.n k(o0<w5.e> o0Var) {
        return new com.facebook.imagepipeline.producers.n(this.f36394d, this.f36400j.d(), this.f36395e, this.f36396f, this.f36397g, this.f36398h, this.f36399i, o0Var, this.f36414x, this.f36413w, null, y3.o.f39267a);
    }

    public com.facebook.imagepipeline.producers.o l(o0<c4.a<w5.c>> o0Var) {
        return new com.facebook.imagepipeline.producers.o(o0Var, this.f36400j.c());
    }

    public q m(o0<w5.e> o0Var) {
        return new q(this.f36402l, this.f36403m, this.f36406p, o0Var);
    }

    public r n(o0<w5.e> o0Var) {
        return new r(this.f36402l, this.f36403m, this.f36406p, o0Var);
    }

    public com.facebook.imagepipeline.producers.s o(o0<w5.e> o0Var) {
        return new com.facebook.imagepipeline.producers.s(this.f36406p, this.f36415y, o0Var);
    }

    public t p(o0<w5.e> o0Var) {
        return new t(this.f36404n, this.f36406p, o0Var);
    }

    public u q(o0<w5.e> o0Var) {
        return new u(this.f36402l, this.f36403m, this.f36406p, this.f36407q, this.f36408r, o0Var);
    }

    public b0 r() {
        return new b0(this.f36400j.f(), this.f36401k, this.f36393c);
    }

    public c0 s() {
        return new c0(this.f36400j.f(), this.f36401k, this.f36391a);
    }

    public d0 t() {
        return new d0(this.f36400j.f(), this.f36401k, this.f36391a);
    }

    public LocalExifThumbnailProducer u() {
        return new LocalExifThumbnailProducer(this.f36400j.g(), this.f36401k, this.f36391a);
    }

    public f0 v() {
        return new f0(this.f36400j.f(), this.f36401k);
    }

    public g0 w() {
        return new g0(this.f36400j.f(), this.f36401k, this.f36392b);
    }

    public h0 x() {
        return new h0(this.f36400j.f(), this.f36391a);
    }

    public o0<w5.e> y(k0 k0Var) {
        return new j0(this.f36401k, this.f36394d, k0Var);
    }

    public l0 z(o0<w5.e> o0Var) {
        return new l0(this.f36402l, this.f36406p, this.f36401k, this.f36394d, o0Var);
    }
}
