package w7;

import android.content.Context;
import f8.m0;
import f8.n0;
import f8.u0;
import java.util.concurrent.Executor;
import javax.inject.Provider;
import w7.u;

/* compiled from: DaggerTransportRuntimeComponent.java */
/* loaded from: classes2.dex */
final class e extends u {

    /* renamed from: a  reason: collision with root package name */
    private Provider<Executor> f38281a;

    /* renamed from: b  reason: collision with root package name */
    private Provider<Context> f38282b;

    /* renamed from: c  reason: collision with root package name */
    private Provider f38283c;

    /* renamed from: d  reason: collision with root package name */
    private Provider f38284d;

    /* renamed from: e  reason: collision with root package name */
    private Provider f38285e;

    /* renamed from: f  reason: collision with root package name */
    private Provider<String> f38286f;

    /* renamed from: g  reason: collision with root package name */
    private Provider<m0> f38287g;

    /* renamed from: h  reason: collision with root package name */
    private Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.c> f38288h;

    /* renamed from: i  reason: collision with root package name */
    private Provider<e8.v> f38289i;

    /* renamed from: j  reason: collision with root package name */
    private Provider<d8.c> f38290j;

    /* renamed from: k  reason: collision with root package name */
    private Provider<e8.p> f38291k;

    /* renamed from: l  reason: collision with root package name */
    private Provider<e8.t> f38292l;

    /* renamed from: m  reason: collision with root package name */
    private Provider<t> f38293m;

    /* compiled from: DaggerTransportRuntimeComponent.java */
    /* loaded from: classes2.dex */
    private static final class b implements u.a {

        /* renamed from: a  reason: collision with root package name */
        private Context f38294a;

        private b() {
        }

        @Override // w7.u.a
        /* renamed from: b */
        public b a(Context context) {
            this.f38294a = (Context) z7.d.b(context);
            return this;
        }

        @Override // w7.u.a
        public u build() {
            z7.d.a(this.f38294a, Context.class);
            return new e(this.f38294a);
        }
    }

    public static u.a d() {
        return new b();
    }

    private void e(Context context) {
        this.f38281a = z7.a.b(k.a());
        z7.b a10 = z7.c.a(context);
        this.f38282b = a10;
        x7.d a11 = x7.d.a(a10, h8.c.a(), h8.d.a());
        this.f38283c = a11;
        this.f38284d = z7.a.b(x7.f.a(this.f38282b, a11));
        this.f38285e = u0.a(this.f38282b, f8.g.a(), f8.i.a());
        this.f38286f = f8.h.a(this.f38282b);
        this.f38287g = z7.a.b(n0.a(h8.c.a(), h8.d.a(), f8.j.a(), this.f38285e, this.f38286f));
        d8.g b10 = d8.g.b(h8.c.a());
        this.f38288h = b10;
        d8.i a12 = d8.i.a(this.f38282b, this.f38287g, b10, h8.d.a());
        this.f38289i = a12;
        Provider<Executor> provider = this.f38281a;
        Provider provider2 = this.f38284d;
        Provider<m0> provider3 = this.f38287g;
        this.f38290j = d8.d.a(provider, provider2, a12, provider3, provider3);
        Provider<Context> provider4 = this.f38282b;
        Provider provider5 = this.f38284d;
        Provider<m0> provider6 = this.f38287g;
        this.f38291k = e8.q.a(provider4, provider5, provider6, this.f38289i, this.f38281a, provider6, h8.c.a(), h8.d.a(), this.f38287g);
        Provider<Executor> provider7 = this.f38281a;
        Provider<m0> provider8 = this.f38287g;
        this.f38292l = e8.u.a(provider7, provider8, this.f38289i, provider8);
        this.f38293m = z7.a.b(v.a(h8.c.a(), h8.d.a(), this.f38290j, this.f38291k, this.f38292l));
    }

    @Override // w7.u
    f8.d a() {
        return this.f38287g.get();
    }

    @Override // w7.u
    t b() {
        return this.f38293m.get();
    }

    private e(Context context) {
        e(context);
    }
}
