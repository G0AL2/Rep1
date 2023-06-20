package com.fyber.inneractive.sdk.bidder;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveUserConfig;
import com.fyber.inneractive.sdk.util.k;
import com.fyber.inneractive.sdk.util.k0;
import com.fyber.inneractive.sdk.util.l;
import com.fyber.inneractive.sdk.util.n;
import java.util.List;

/* loaded from: classes.dex */
public class c {
    public int A;
    public String B;
    public Long C;
    public String D;
    public Boolean E;
    public String F;
    public String G;
    public int H;
    public InneractiveUserConfig.Gender I;
    public boolean J;
    public String K;
    public String L;

    /* renamed from: a  reason: collision with root package name */
    public final com.fyber.inneractive.sdk.serverapi.b f16790a;

    /* renamed from: b  reason: collision with root package name */
    public String f16791b;

    /* renamed from: c  reason: collision with root package name */
    public String f16792c;

    /* renamed from: d  reason: collision with root package name */
    public String f16793d;

    /* renamed from: e  reason: collision with root package name */
    public String f16794e;

    /* renamed from: f  reason: collision with root package name */
    public String f16795f;

    /* renamed from: g  reason: collision with root package name */
    public String f16796g;

    /* renamed from: h  reason: collision with root package name */
    public String f16797h;

    /* renamed from: i  reason: collision with root package name */
    public String f16798i;

    /* renamed from: j  reason: collision with root package name */
    public String f16799j;

    /* renamed from: k  reason: collision with root package name */
    public String f16800k;

    /* renamed from: l  reason: collision with root package name */
    public int f16801l;

    /* renamed from: m  reason: collision with root package name */
    public Long f16802m;

    /* renamed from: n  reason: collision with root package name */
    public int f16803n;

    /* renamed from: o  reason: collision with root package name */
    public int f16804o;

    /* renamed from: p  reason: collision with root package name */
    public TokenParametersOuterClass$TokenParameters.d f16805p;

    /* renamed from: q  reason: collision with root package name */
    public String f16806q;

    /* renamed from: r  reason: collision with root package name */
    public String f16807r;

    /* renamed from: s  reason: collision with root package name */
    public TokenParametersOuterClass$TokenParameters.h f16808s;

    /* renamed from: t  reason: collision with root package name */
    public Boolean f16809t;

    /* renamed from: u  reason: collision with root package name */
    public Boolean f16810u;

    /* renamed from: v  reason: collision with root package name */
    public Boolean f16811v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f16812w;

    /* renamed from: x  reason: collision with root package name */
    public Boolean f16813x;

    /* renamed from: y  reason: collision with root package name */
    public Boolean f16814y;

    /* renamed from: z  reason: collision with root package name */
    public Boolean f16815z;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.f16791b = l.f();
        }
    }

    public c(com.fyber.inneractive.sdk.serverapi.b bVar) {
        this.f16790a = bVar;
        c();
        this.f16792c = bVar.a("2.2.0");
        this.f16793d = bVar.j();
        this.f16794e = bVar.b();
        this.f16795f = bVar.k();
        this.f16803n = bVar.m();
        this.f16804o = bVar.l();
        this.f16805p = f.b(com.fyber.inneractive.sdk.serverapi.a.c());
        this.f16808s = bVar.o() ? TokenParametersOuterClass$TokenParameters.h.SECURE : TokenParametersOuterClass$TokenParameters.h.UNSECURE;
        b();
        a();
        this.f16810u = com.fyber.inneractive.sdk.serverapi.a.h();
        this.E = com.fyber.inneractive.sdk.serverapi.a.j();
        this.f16813x = com.fyber.inneractive.sdk.serverapi.a.g();
        this.f16814y = com.fyber.inneractive.sdk.serverapi.a.l();
        this.f16815z = com.fyber.inneractive.sdk.serverapi.a.k();
    }

    public void a() {
        this.f16790a.getClass();
        IAConfigManager iAConfigManager = IAConfigManager.J;
        this.f16796g = iAConfigManager.f16880p;
        this.f16790a.getClass();
        this.f16797h = k.g();
        this.f16798i = this.f16790a.a();
        this.f16799j = this.f16790a.h();
        this.f16800k = this.f16790a.i();
        this.f16801l = com.fyber.inneractive.sdk.serverapi.a.f().intValue();
        this.f16802m = com.fyber.inneractive.sdk.serverapi.a.e();
        this.f16790a.getClass();
        List<String> list = iAConfigManager.f16881q;
        if (list != null && !list.isEmpty()) {
            this.f16806q = l.b(",", list);
        }
        this.f16790a.getClass();
        this.f16807r = k0.f().f20300a;
        this.F = com.fyber.inneractive.sdk.serverapi.a.a();
        this.f16812w = com.fyber.inneractive.sdk.serverapi.a.i().booleanValue();
        this.A = com.fyber.inneractive.sdk.serverapi.a.b().intValue();
        this.B = this.f16790a.f();
        this.C = com.fyber.inneractive.sdk.serverapi.a.d();
        int i10 = com.fyber.inneractive.sdk.config.e.f16935a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.device");
        if (TextUtils.isEmpty(property)) {
            property = com.fyber.inneractive.sdk.config.k.a();
        }
        this.D = property;
        this.G = iAConfigManager.f16875k;
        this.H = iAConfigManager.f16874j.getAge();
        this.I = iAConfigManager.f16874j.getGender();
        this.K = iAConfigManager.f16874j.getZipCode();
        this.J = iAConfigManager.f16876l;
        this.f16809t = com.fyber.inneractive.sdk.serverapi.a.m();
        b();
        this.f16811v = com.fyber.inneractive.sdk.serverapi.a.n();
    }

    public final void b() {
        IAConfigManager iAConfigManager = IAConfigManager.J;
        if (!TextUtils.isEmpty(iAConfigManager.f16879o)) {
            this.L = String.format("%s_%s", iAConfigManager.f16877m, iAConfigManager.f16879o);
        } else {
            this.L = iAConfigManager.f16877m;
        }
    }

    public final void c() {
        if (TextUtils.isEmpty(this.f16791b)) {
            n.a(new a());
        }
    }

    public void a(String str) {
        this.f16791b = str;
    }
}
