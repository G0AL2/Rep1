package com.chartboost.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.webkit.WebSettings;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.chartboost.sdk.Libraries.CBLogging;
import com.chartboost.sdk.Model.CBError;
import com.chartboost.sdk.Privacy.model.DataUseConsent;
import com.chartboost.sdk.impl.c1;
import com.chartboost.sdk.impl.d3;
import com.chartboost.sdk.impl.f;
import com.chartboost.sdk.impl.f3;
import com.chartboost.sdk.impl.g0;
import com.chartboost.sdk.impl.g2;
import com.chartboost.sdk.impl.h2;
import com.chartboost.sdk.impl.h3;
import com.chartboost.sdk.impl.i2;
import com.chartboost.sdk.impl.j1;
import com.chartboost.sdk.impl.j2;
import com.chartboost.sdk.impl.k2;
import com.chartboost.sdk.impl.l;
import com.chartboost.sdk.impl.l1;
import com.chartboost.sdk.impl.l2;
import com.chartboost.sdk.impl.m;
import com.chartboost.sdk.impl.m0;
import com.chartboost.sdk.impl.m1;
import com.chartboost.sdk.impl.n0;
import com.chartboost.sdk.impl.o1;
import com.chartboost.sdk.impl.p1;
import com.chartboost.sdk.impl.p2;
import com.chartboost.sdk.impl.q2;
import com.chartboost.sdk.impl.r0;
import com.chartboost.sdk.impl.s0;
import com.chartboost.sdk.impl.s1;
import com.chartboost.sdk.impl.s2;
import com.chartboost.sdk.impl.t;
import com.chartboost.sdk.impl.t1;
import com.chartboost.sdk.impl.u0;
import com.chartboost.sdk.impl.u1;
import com.chartboost.sdk.impl.u2;
import com.chartboost.sdk.impl.v0;
import com.chartboost.sdk.impl.x0;
import com.chartboost.sdk.impl.y2;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class f {
    private static f G;
    private static m1 H;
    protected static h2 I;
    public final com.chartboost.sdk.b A;
    public final v0 B;
    protected Runnable C;
    private d3 D;
    private final h3 E;

    /* renamed from: a  reason: collision with root package name */
    private final l f13844a;

    /* renamed from: b  reason: collision with root package name */
    protected final Context f13845b;

    /* renamed from: c  reason: collision with root package name */
    final p1 f13846c;

    /* renamed from: d  reason: collision with root package name */
    final r0 f13847d;

    /* renamed from: e  reason: collision with root package name */
    final u2 f13848e;

    /* renamed from: f  reason: collision with root package name */
    final c f13849f;

    /* renamed from: g  reason: collision with root package name */
    final x0 f13850g;

    /* renamed from: h  reason: collision with root package name */
    final j1 f13851h;

    /* renamed from: i  reason: collision with root package name */
    final p2 f13852i;

    /* renamed from: j  reason: collision with root package name */
    final c1 f13853j;

    /* renamed from: k  reason: collision with root package name */
    final u0 f13854k;

    /* renamed from: m  reason: collision with root package name */
    final SharedPreferences f13856m;

    /* renamed from: n  reason: collision with root package name */
    public g2 f13857n;

    /* renamed from: q  reason: collision with root package name */
    public final ScheduledExecutorService f13860q;

    /* renamed from: r  reason: collision with root package name */
    public final m0 f13861r;

    /* renamed from: s  reason: collision with root package name */
    public final com.chartboost.sdk.impl.f f13862s;

    /* renamed from: t  reason: collision with root package name */
    public final com.chartboost.sdk.impl.c f13863t;

    /* renamed from: u  reason: collision with root package name */
    public final com.chartboost.sdk.Networking.b f13864u;

    /* renamed from: v  reason: collision with root package name */
    public final l2 f13865v;

    /* renamed from: w  reason: collision with root package name */
    public final com.chartboost.sdk.impl.f f13866w;

    /* renamed from: x  reason: collision with root package name */
    public final com.chartboost.sdk.impl.c f13867x;

    /* renamed from: y  reason: collision with root package name */
    public final AtomicReference<com.chartboost.sdk.Model.e> f13868y;

    /* renamed from: z  reason: collision with root package name */
    public final Handler f13869z;

    /* renamed from: l  reason: collision with root package name */
    public t f13855l = new t();

    /* renamed from: o  reason: collision with root package name */
    boolean f13858o = false;

    /* renamed from: p  reason: collision with root package name */
    boolean f13859p = true;
    private final s0.a F = new a();

    /* loaded from: classes.dex */
    class a implements s0.a {
        a() {
        }

        @Override // com.chartboost.sdk.impl.s0.a
        public void a(s0 s0Var, JSONObject jSONObject) {
            f fVar = f.this;
            fVar.a(fVar.C, jSONObject);
        }

        @Override // com.chartboost.sdk.impl.s0.a
        public void a(s0 s0Var, CBError cBError) {
            m1.d(new com.chartboost.sdk.Tracking.b("config_request_error", cBError != null ? cBError.getErrorDesc() : "Config failure", "", ""));
            f fVar = f.this;
            fVar.a(fVar.C);
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final int f13871a;

        /* renamed from: b  reason: collision with root package name */
        String f13872b = null;

        /* renamed from: c  reason: collision with root package name */
        boolean f13873c = false;

        /* renamed from: d  reason: collision with root package name */
        boolean f13874d = false;

        /* loaded from: classes.dex */
        class a implements s0.a {
            a(b bVar) {
            }

            @Override // com.chartboost.sdk.impl.s0.a
            public void a(s0 s0Var, CBError cBError) {
                m1.d(new com.chartboost.sdk.Tracking.b("install_request_error", cBError != null ? cBError.getErrorDesc() : "Install failure", "", ""));
            }

            @Override // com.chartboost.sdk.impl.s0.a
            public void a(s0 s0Var, JSONObject jSONObject) {
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(int i10) {
            this.f13871a = i10;
        }

        private void a() {
            String d10;
            AtomicReference<com.chartboost.sdk.Model.e> atomicReference = f.this.f13868y;
            if (atomicReference == null || atomicReference.get() == null || (d10 = f.this.f13868y.get().d()) == null) {
                return;
            }
            CBLogging.e("Sdk", d10);
        }

        private void b() {
            g2 g2Var = f.this.f13857n;
            if (g2Var != null) {
                g2Var.b();
            }
        }

        private void c() {
            b();
        }

        @Override // java.lang.Runnable
        public void run() {
            AtomicReference<com.chartboost.sdk.Model.e> atomicReference;
            com.chartboost.sdk.impl.a aVar;
            try {
                int i10 = this.f13871a;
                if (i10 == 1) {
                    g.f13889n = this.f13873c;
                } else if (i10 == 2) {
                    boolean z10 = this.f13874d;
                    g.f13891p = z10;
                    if (z10 && f.k()) {
                        f.this.f13857n.b();
                    } else {
                        f.this.f13857n.a();
                    }
                } else if (i10 != 3) {
                    if (i10 == 4) {
                        f.this.f13857n.b();
                    } else if (i10 == 5 && (aVar = g.f13879d) != null) {
                        aVar.didFailToLoadMoreApps(this.f13872b, CBError.CBImpressionError.END_POINT_DISABLED);
                    }
                } else {
                    a();
                    f fVar = f.this;
                    m0 m0Var = fVar.f13861r;
                    if (m0Var != null && fVar.f13860q != null) {
                        m0Var.a(fVar.f13845b, l.b(), f.this.f13860q);
                    }
                    if (f.I != null && (atomicReference = f.this.f13868y) != null && atomicReference.get() != null) {
                        f.I.a(f.this.f13868y.get().f13728s);
                    }
                    s0 s0Var = new s0("https://live.chartboost.com", "/api/install", f.this.f13865v, 2, new a(this));
                    s0Var.f14299m = true;
                    f.this.f13864u.a(s0Var);
                    f fVar2 = f.this;
                    ScheduledExecutorService scheduledExecutorService = fVar2.f13860q;
                    com.chartboost.sdk.impl.f fVar3 = fVar2.f13862s;
                    Objects.requireNonNull(fVar3);
                    scheduledExecutorService.execute(new f.b(0, null, null, null, null));
                    f fVar4 = f.this;
                    ScheduledExecutorService scheduledExecutorService2 = fVar4.f13860q;
                    com.chartboost.sdk.impl.f fVar5 = fVar4.f13866w;
                    Objects.requireNonNull(fVar5);
                    scheduledExecutorService2.execute(new f.b(0, null, null, null, null));
                    c();
                    f.this.f13859p = false;
                }
            } catch (Exception e10) {
                CBLogging.b("Sdk", "Sdk command: " + this.f13871a + " : " + e10.toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(Context context, String str, String str2, l lVar, ScheduledExecutorService scheduledExecutorService, Handler handler, Executor executor) {
        JSONObject jSONObject;
        o1 a10 = o1.a();
        this.f13845b = context;
        this.f13861r = (m0) a10.a(new m0());
        r0 r0Var = (r0) a10.a(new r0(context));
        this.f13847d = r0Var;
        u2 u2Var = (u2) a10.a(new u2());
        this.f13848e = u2Var;
        this.f13864u = (com.chartboost.sdk.Networking.b) a10.a(new com.chartboost.sdk.Networking.b(scheduledExecutorService, (com.chartboost.sdk.Networking.d) a10.a(new com.chartboost.sdk.Networking.d()), r0Var, u2Var, handler, executor));
        SharedPreferences b10 = b(context);
        this.f13852i = (p2) a10.a(new p2(b10));
        try {
            jSONObject = new JSONObject(b10.getString("config", JsonUtils.EMPTY_JSON));
        } catch (Exception e10) {
            CBLogging.b("Sdk", "Unable to process config");
            e10.printStackTrace();
            jSONObject = new JSONObject();
        }
        AtomicReference<com.chartboost.sdk.Model.e> atomicReference = new AtomicReference<>(null);
        if (!com.chartboost.sdk.a.a(atomicReference, jSONObject)) {
            atomicReference.set(new com.chartboost.sdk.Model.e(new JSONObject()));
        }
        com.chartboost.sdk.Model.e eVar = atomicReference.get();
        eVar = eVar == null ? new com.chartboost.sdk.Model.e(new JSONObject()) : eVar;
        this.f13844a = lVar;
        this.f13860q = scheduledExecutorService;
        this.f13868y = atomicReference;
        this.f13856m = b10;
        this.f13869z = handler;
        p1 p1Var = new p1(context, atomicReference);
        this.f13846c = p1Var;
        if (!eVar.f13720k) {
            g.f13892q = "";
        } else {
            c(context);
        }
        c1 c1Var = (c1) a10.a(new c1());
        this.f13853j = c1Var;
        h2 h2Var = (h2) a10.a(a(context));
        I = h2Var;
        h2Var.a(eVar.f13728s);
        com.chartboost.sdk.Model.e eVar2 = eVar;
        l2 l2Var = (l2) a10.a(new l2(context, str, this.f13861r, this.f13847d, atomicReference, b10, this.f13848e, c1Var, this.f13852i, I));
        this.f13865v = l2Var;
        j1 j1Var = (j1) a10.a(new j1(scheduledExecutorService, p1Var, this.f13864u, this.f13847d, atomicReference, this.f13848e));
        this.f13851h = j1Var;
        c cVar = (c) a10.a(new c((m) o1.a().a(new m(handler)), j1Var, atomicReference, handler));
        this.f13849f = cVar;
        v0 v0Var = (v0) a10.a(new v0(scheduledExecutorService, this.f13864u, this.f13847d, handler));
        this.B = v0Var;
        com.chartboost.sdk.b bVar = (com.chartboost.sdk.b) a10.a(new com.chartboost.sdk.b(context, this.f13847d, this, handler, cVar));
        this.A = bVar;
        x0 x0Var = (x0) a10.a(new x0(p1Var));
        this.f13850g = x0Var;
        com.chartboost.sdk.impl.c b11 = com.chartboost.sdk.impl.c.b();
        this.f13863t = b11;
        com.chartboost.sdk.impl.c c10 = com.chartboost.sdk.impl.c.c();
        this.f13867x = c10;
        q();
        h3 h3Var = new h3(this.f13864u, this.D, this.f13847d, p1Var, new s2(), scheduledExecutorService);
        this.E = h3Var;
        u0 u0Var = new u0(cVar);
        this.f13854k = u0Var;
        this.f13862s = (com.chartboost.sdk.impl.f) a10.a(new com.chartboost.sdk.impl.f(context, b11, scheduledExecutorService, j1Var, p1Var, this.f13864u, this.f13847d, l2Var, atomicReference, b10, this.f13848e, handler, bVar, v0Var, cVar, x0Var, this.f13852i, new com.chartboost.sdk.impl.h(h3Var), u0Var));
        this.f13866w = (com.chartboost.sdk.impl.f) a10.a(new com.chartboost.sdk.impl.f(context, c10, scheduledExecutorService, j1Var, p1Var, this.f13864u, this.f13847d, l2Var, atomicReference, b10, this.f13848e, handler, bVar, v0Var, cVar, x0Var, this.f13852i, new com.chartboost.sdk.impl.h(h3Var), u0Var));
        this.f13857n = (g2) a10.a(new g2(j1Var, p1Var, this.f13864u, l2Var, atomicReference));
        g.f13885j = str;
        g.f13886k = str2;
        y2 e11 = eVar2.e();
        H = (m1) a10.a(new m1(context, (l1) a10.a(new l1(e11.b(), e11.c())), this.f13864u, l2Var, scheduledExecutorService, e11));
    }

    public static f a() {
        return G;
    }

    private static SharedPreferences b(Context context) {
        return context.getSharedPreferences("cbPrefs", 0);
    }

    private void d(Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
    }

    public static boolean k() {
        f a10 = a();
        if (a10 == null || !a10.i().c()) {
            return true;
        }
        try {
            throw new Exception("Chartboost Integration Warning: your account has been disabled for this session. This app has no active publishing campaigns, please create a publishing campaign in the Chartboost dashboard and wait at least 30 minutes to re-enable. If you need assistance, please visit http://chartboo.st/publishing .");
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    private void m() {
        if (this.f13858o) {
            return;
        }
        com.chartboost.sdk.impl.a aVar = g.f13879d;
        if (aVar != null) {
            aVar.didInitialize();
        }
        this.f13858o = true;
    }

    private void o() {
        p2 p2Var = this.f13852i;
        if (p2Var == null || this.f13858o) {
            return;
        }
        p2Var.a();
        CBLogging.c("Sdk", "Current session count: " + this.f13852i.c());
    }

    private void p() {
        y2 e10;
        com.chartboost.sdk.Model.e i10 = i();
        if (H == null || i10 == null || (e10 = i10.e()) == null) {
            return;
        }
        H.a(e10);
    }

    private void q() {
        f3 b10;
        com.chartboost.sdk.Model.e i10 = i();
        if (i10 == null || (b10 = i10.b()) == null) {
            return;
        }
        d3 d3Var = this.D;
        if (d3Var != null) {
            d3Var.c(b10.b());
            this.D.b(b10.c());
            this.D.c(b10.d());
            this.D.d(b10.e());
            this.D.e(b10.d());
            this.D.f(b10.g());
            this.D.a(b10.a());
        } else {
            this.D = a(b10);
        }
        h3 h3Var = this.E;
        if (h3Var != null) {
            h3Var.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(Runnable runnable) {
        this.C = runnable;
        s0 s0Var = new s0("https://live.chartboost.com", "/api/config", this.f13865v, 1, this.F);
        s0Var.f14299m = true;
        this.f13864u.a(s0Var);
    }

    public com.chartboost.sdk.impl.f e() {
        return this.f13862s;
    }

    public com.chartboost.sdk.impl.c f() {
        return this.f13863t;
    }

    public com.chartboost.sdk.impl.f g() {
        return this.f13866w;
    }

    public com.chartboost.sdk.impl.c h() {
        return this.f13867x;
    }

    public com.chartboost.sdk.Model.e i() {
        return this.f13868y.get();
    }

    public Handler j() {
        return this.f13869z;
    }

    public boolean l() {
        return this.f13858o;
    }

    public void n() {
        this.f13851h.c();
    }

    public static void a(f fVar) {
        G = fVar;
    }

    private void b(Runnable runnable) {
        p();
        q();
        d(runnable);
        o();
        m();
    }

    public static m1 d() {
        return H;
    }

    public static void e(Runnable runnable) {
        l b10 = l.b();
        if (!b10.c()) {
            b10.f14142a.post(runnable);
        } else {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Activity activity) {
        if (this.f13844a.a(23)) {
            com.chartboost.sdk.a.b(activity);
        }
        if (this.f13859p || this.A.g()) {
            return;
        }
        this.f13851h.b();
    }

    public Context c() {
        return this.f13845b;
    }

    public static void c(Context context) {
        String str;
        try {
            str = System.getProperty("http.agent");
        } catch (Exception e10) {
            a(e10.toString());
            str = "";
        }
        try {
            str = WebSettings.getDefaultUserAgent(context);
        } catch (Exception e11) {
            a(e11.toString());
        }
        g.f13892q = str;
    }

    public static t b() {
        f a10 = a();
        if (a10 != null) {
            return a10.f13855l;
        }
        return null;
    }

    void a(Runnable runnable, JSONObject jSONObject) {
        a(n0.a(jSONObject, "response"));
        b(runnable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static DataUseConsent b(Context context, String str) {
        return a(context).b(str);
    }

    void a(Runnable runnable) {
        b(runnable);
    }

    private d3 a(f3 f3Var) {
        return new d3(f3Var.b(), f3Var.c(), f3Var.d(), f3Var.e(), f3Var.f(), f3Var.g(), f3Var.a(), this.f13847d);
    }

    private void a(JSONObject jSONObject) {
        SharedPreferences.Editor edit;
        if (jSONObject == null || !com.chartboost.sdk.a.a(this.f13868y, jSONObject) || (edit = this.f13856m.edit()) == null) {
            return;
        }
        edit.putString("config", jSONObject.toString()).apply();
    }

    public void a(int i10) {
        p2 p2Var = this.f13852i;
        if (p2Var == null || !this.f13858o) {
            return;
        }
        p2Var.a(i10);
        CBLogging.c("Sdk", "Current session impression count: " + this.f13852i.b(i10) + " in session: " + this.f13852i.c());
    }

    public void a(ChartboostBanner chartboostBanner) {
        com.chartboost.sdk.impl.d dVar = (com.chartboost.sdk.impl.d) o1.a().a(new com.chartboost.sdk.impl.d(this.f13845b, g0.a(chartboostBanner.getTraits()), this.f13860q, this.f13851h, this.f13846c, this.f13864u, this.f13847d, this.f13865v, this.f13868y, this.f13856m, this.f13848e, this.f13869z, this.A, this.B, this.f13849f, this.f13850g, this.f13852i, null, this.f13854k));
        dVar.a(chartboostBanner);
        this.f13860q.execute(new f.b(0, null, null, null, null));
        this.f13855l.a(chartboostBanner.getLocation(), dVar);
    }

    public static h2 a(Context context) {
        if (I == null) {
            SharedPreferences b10 = b(context);
            i2 i2Var = new i2(b(context));
            I = new h2(new j2(i2Var), new s1(i2Var), new k2(i2Var), new t1(), new u1(i2Var), new q2(i2Var, b10));
        }
        return I;
    }

    private static void a(String str) {
        try {
            m1.d(new com.chartboost.sdk.Tracking.b("user_agent_update_error", str, "", ""));
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Context context, DataUseConsent dataUseConsent) {
        if (dataUseConsent.getPrivacyStandard().isEmpty()) {
            try {
                m1.d(new com.chartboost.sdk.Tracking.a("consent_persistence_error", "", "", ""));
            } catch (Exception unused) {
            }
            CBLogging.b("Sdk", "addDataUseConsent failed");
            return;
        }
        a(context).a(dataUseConsent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static DataUseConsent a(Context context, String str) {
        return a(context).a(str);
    }
}
