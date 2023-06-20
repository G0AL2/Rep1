package com.fyber.inneractive.sdk.config;

import android.content.Context;
import com.fyber.inneractive.sdk.config.enums.Vendor;
import com.fyber.inneractive.sdk.external.InneractiveMediationName;
import com.fyber.inneractive.sdk.external.InneractiveUserConfig;
import com.fyber.inneractive.sdk.network.m0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.j0;
import com.fyber.inneractive.sdk.util.u0;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class IAConfigManager {
    public static final IAConfigManager J = new IAConfigManager();
    public static long K;
    public final j0 A;
    public com.fyber.inneractive.sdk.network.b0<a> B;
    public com.fyber.inneractive.sdk.network.b0<com.fyber.inneractive.sdk.config.global.l> C;
    public d D;
    public final com.fyber.inneractive.sdk.dv.handler.a E;
    public final com.fyber.inneractive.sdk.cache.g F;
    public final com.fyber.inneractive.sdk.network.c G;
    public final Map<com.fyber.inneractive.sdk.util.u, com.fyber.inneractive.sdk.util.t> H;
    public com.fyber.inneractive.sdk.measurement.a I;

    /* renamed from: a  reason: collision with root package name */
    public Map<String, x> f16865a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public Map<String, y> f16866b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public String f16867c;

    /* renamed from: d  reason: collision with root package name */
    public String f16868d;

    /* renamed from: e  reason: collision with root package name */
    public String f16869e;

    /* renamed from: f  reason: collision with root package name */
    public Context f16870f;

    /* renamed from: g  reason: collision with root package name */
    public List<OnConfigurationReadyAndValidListener> f16871g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f16872h;

    /* renamed from: i  reason: collision with root package name */
    public final q f16873i;

    /* renamed from: j  reason: collision with root package name */
    public InneractiveUserConfig f16874j;

    /* renamed from: k  reason: collision with root package name */
    public String f16875k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f16876l;

    /* renamed from: m  reason: collision with root package name */
    public String f16877m;

    /* renamed from: n  reason: collision with root package name */
    public InneractiveMediationName f16878n;

    /* renamed from: o  reason: collision with root package name */
    public String f16879o;

    /* renamed from: p  reason: collision with root package name */
    public String f16880p;

    /* renamed from: q  reason: collision with root package name */
    public List<String> f16881q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f16882r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f16883s;

    /* renamed from: t  reason: collision with root package name */
    public final com.fyber.inneractive.sdk.network.w f16884t;

    /* renamed from: u  reason: collision with root package name */
    public String f16885u;

    /* renamed from: v  reason: collision with root package name */
    public i f16886v;

    /* renamed from: w  reason: collision with root package name */
    public j f16887w;

    /* renamed from: x  reason: collision with root package name */
    public final d0 f16888x;

    /* renamed from: y  reason: collision with root package name */
    public u0 f16889y;

    /* renamed from: z  reason: collision with root package name */
    public com.fyber.inneractive.sdk.config.global.a f16890z;

    /* loaded from: classes.dex */
    public interface OnConfigurationReadyAndValidListener {
        void onConfigurationReadyAndValid(IAConfigManager iAConfigManager, boolean z10, Exception exc);
    }

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f16891a;

        /* renamed from: b  reason: collision with root package name */
        public String f16892b;

        /* renamed from: c  reason: collision with root package name */
        public String f16893c;

        /* renamed from: d  reason: collision with root package name */
        public String f16894d;

        /* renamed from: e  reason: collision with root package name */
        public Map<String, x> f16895e = new HashMap();

        /* renamed from: f  reason: collision with root package name */
        public Map<String, y> f16896f = new HashMap();

        /* renamed from: g  reason: collision with root package name */
        public c f16897g = new c();
    }

    /* loaded from: classes.dex */
    public static class b extends Exception {
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public Set<Vendor> f16898a = new HashSet();
    }

    public IAConfigManager() {
        com.fyber.inneractive.sdk.dv.handler.a dVar;
        new HashSet();
        this.f16872h = false;
        this.f16873i = new q();
        this.f16876l = false;
        this.f16882r = false;
        this.f16883s = true;
        this.f16884t = new com.fyber.inneractive.sdk.network.w();
        this.f16885u = "";
        this.f16888x = new d0();
        this.A = new j0();
        if (com.fyber.inneractive.sdk.util.l.a("com.google.android.gms.ads.MobileAds", "com.google.android.gms.ads.query.QueryInfoGenerationCallback")) {
            dVar = new com.fyber.inneractive.sdk.dv.handler.c();
        } else {
            dVar = new com.fyber.inneractive.sdk.dv.handler.d();
        }
        this.E = dVar;
        this.F = new com.fyber.inneractive.sdk.cache.g();
        this.G = new com.fyber.inneractive.sdk.network.c();
        this.H = new HashMap();
        this.f16871g = new CopyOnWriteArrayList();
    }

    public static void addListener(OnConfigurationReadyAndValidListener onConfigurationReadyAndValidListener) {
        J.f16871g.add(onConfigurationReadyAndValidListener);
    }

    public static i b() {
        return J.f16886v;
    }

    public static d0 c() {
        return J.f16888x;
    }

    public static u0 d() {
        return J.f16889y;
    }

    public static String e() {
        return J.D.f16926d;
    }

    public static boolean f() {
        return J.f16869e != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
        if (r2 == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
        r2 = com.fyber.inneractive.sdk.config.IAConfigManager.J.f16886v;
        r2.f16989d = false;
        com.fyber.inneractive.sdk.util.n.a(new com.fyber.inneractive.sdk.util.m(r2.f16990e));
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0042, code lost:
        a();
        com.fyber.inneractive.sdk.config.IAConfigManager.J.F.a();
        r1 = com.fyber.inneractive.sdk.web.r.f20447c;
        r1.getClass();
        com.fyber.inneractive.sdk.util.n.a(new com.fyber.inneractive.sdk.web.q(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0059, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
        if ((java.lang.System.currentTimeMillis() - com.fyber.inneractive.sdk.config.IAConfigManager.K <= 3600000) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002e, code lost:
        if (r2 != false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean g() {
        /*
            boolean r0 = f()
            int r1 = com.fyber.inneractive.sdk.config.e.f16935a
            r1 = 0
            java.lang.String r2 = java.lang.Boolean.toString(r1)
            java.lang.String r3 = "ia.testEnvironmentConfiguration.forceConfigRefresh"
            java.lang.String r2 = java.lang.System.getProperty(r3, r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            boolean r2 = r2.booleanValue()
            if (r0 == 0) goto L2e
            long r3 = java.lang.System.currentTimeMillis()
            long r5 = com.fyber.inneractive.sdk.config.IAConfigManager.K
            long r3 = r3 - r5
            r5 = 3600000(0x36ee80, double:1.7786363E-317)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 > 0) goto L2b
            r3 = 1
            goto L2c
        L2b:
            r3 = 0
        L2c:
            if (r3 == 0) goto L30
        L2e:
            if (r2 == 0) goto L59
        L30:
            if (r2 == 0) goto L42
            com.fyber.inneractive.sdk.config.IAConfigManager r2 = com.fyber.inneractive.sdk.config.IAConfigManager.J
            com.fyber.inneractive.sdk.config.i r2 = r2.f16886v
            r2.f16989d = r1
            com.fyber.inneractive.sdk.cache.b r1 = r2.f16990e
            com.fyber.inneractive.sdk.util.m r2 = new com.fyber.inneractive.sdk.util.m
            r2.<init>(r1)
            com.fyber.inneractive.sdk.util.n.a(r2)
        L42:
            a()
            com.fyber.inneractive.sdk.config.IAConfigManager r1 = com.fyber.inneractive.sdk.config.IAConfigManager.J
            com.fyber.inneractive.sdk.cache.g r1 = r1.F
            r1.a()
            com.fyber.inneractive.sdk.web.r r1 = com.fyber.inneractive.sdk.web.r.f20447c
            r1.getClass()
            com.fyber.inneractive.sdk.web.q r2 = new com.fyber.inneractive.sdk.web.q
            r2.<init>(r1)
            com.fyber.inneractive.sdk.util.n.a(r2)
        L59:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.config.IAConfigManager.g():boolean");
    }

    public static void removeListener(OnConfigurationReadyAndValidListener onConfigurationReadyAndValidListener) {
        J.f16871g.remove(onConfigurationReadyAndValidListener);
    }

    public final void a(Exception exc) {
        for (OnConfigurationReadyAndValidListener onConfigurationReadyAndValidListener : this.f16871g) {
            if (onConfigurationReadyAndValidListener != null) {
                boolean f10 = f();
                IAlog.d("notifying listener configuration state has been resolved", new Object[0]);
                onConfigurationReadyAndValidListener.onConfigurationReadyAndValid(this, f10, !f10 ? exc : null);
            }
        }
    }

    public static void a() {
        IAConfigManager iAConfigManager = J;
        com.fyber.inneractive.sdk.network.b0<a> b0Var = iAConfigManager.B;
        if (b0Var != null) {
            iAConfigManager.f16884t.f17705a.offer(b0Var);
            b0Var.a(m0.QUEUED);
        }
        i iVar = iAConfigManager.f16886v;
        if (iVar.f16989d) {
            return;
        }
        iVar.b();
    }
}
