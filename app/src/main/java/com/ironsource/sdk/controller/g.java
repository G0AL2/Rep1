package com.ironsource.sdk.controller;

import android.content.Context;
import android.os.CountDownTimer;
import android.util.Log;
import com.ironsource.sdk.IronSourceNetwork;
import com.ironsource.sdk.controller.x;
import com.ironsource.sdk.g.d;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class g implements com.ironsource.sdk.controller.e, com.ironsource.sdk.controller.m {

    /* renamed from: a  reason: collision with root package name */
    public com.ironsource.sdk.controller.m f27736a;

    /* renamed from: d  reason: collision with root package name */
    private CountDownTimer f27739d;

    /* renamed from: g  reason: collision with root package name */
    private final com.ironsource.environment.e.a f27742g;

    /* renamed from: b  reason: collision with root package name */
    private final String f27737b = g.class.getSimpleName();

    /* renamed from: c  reason: collision with root package name */
    private d.b f27738c = d.b.None;

    /* renamed from: e  reason: collision with root package name */
    private final com.ironsource.sdk.controller.b f27740e = new com.ironsource.sdk.controller.b("NativeCommandExecutor");

    /* renamed from: f  reason: collision with root package name */
    private final com.ironsource.sdk.controller.b f27741f = new com.ironsource.sdk.controller.b("ControllerCommandsExecutor");

    /* loaded from: classes3.dex */
    final class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (g.this.f27736a != null) {
                g.this.f27736a.destroy();
                g.this.f27736a = null;
            }
        }
    }

    /* loaded from: classes3.dex */
    final class b extends CountDownTimer {
        b(long j10, long j11) {
            super(200000L, 1000L);
        }

        @Override // android.os.CountDownTimer
        public final void onFinish() {
            Logger.i(g.this.f27737b, "Global Controller Timer Finish");
            g.this.g("controller html - download timeout");
        }

        @Override // android.os.CountDownTimer
        public final void onTick(long j10) {
            String str = g.this.f27737b;
            Logger.i(str, "Global Controller Timer Tick " + j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public final class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            g.this.b();
        }
    }

    /* loaded from: classes3.dex */
    final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ String f27746a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ String f27747b;

        /* renamed from: c  reason: collision with root package name */
        private /* synthetic */ Map f27748c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ com.ironsource.sdk.j.e f27749d;

        d(String str, String str2, Map map, com.ironsource.sdk.j.e eVar) {
            this.f27746a = str;
            this.f27747b = str2;
            this.f27748c = map;
            this.f27749d = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (g.this.f27736a != null) {
                g.this.f27736a.a(this.f27746a, this.f27747b, this.f27748c, this.f27749d);
            }
        }
    }

    /* loaded from: classes3.dex */
    final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ Map f27751a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ com.ironsource.sdk.j.e f27752b;

        e(Map map, com.ironsource.sdk.j.e eVar) {
            this.f27751a = map;
            this.f27752b = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (g.this.f27736a != null) {
                g.this.f27736a.a(this.f27751a, this.f27752b);
            }
        }
    }

    /* loaded from: classes3.dex */
    final class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ String f27754a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ String f27755b;

        /* renamed from: c  reason: collision with root package name */
        private /* synthetic */ com.ironsource.sdk.j.e f27756c;

        f(String str, String str2, com.ironsource.sdk.j.e eVar) {
            this.f27754a = str;
            this.f27755b = str2;
            this.f27756c = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (g.this.f27736a != null) {
                g.this.f27736a.a(this.f27754a, this.f27755b, this.f27756c);
            }
        }
    }

    /* renamed from: com.ironsource.sdk.controller.g$g  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    final class RunnableC0346g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ String f27758a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ String f27759b;

        /* renamed from: c  reason: collision with root package name */
        private /* synthetic */ com.ironsource.sdk.g.c f27760c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ com.ironsource.sdk.j.a.d f27761d;

        RunnableC0346g(String str, String str2, com.ironsource.sdk.g.c cVar, com.ironsource.sdk.j.a.d dVar) {
            this.f27758a = str;
            this.f27759b = str2;
            this.f27760c = cVar;
            this.f27761d = dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (g.this.f27736a != null) {
                g.this.f27736a.a(this.f27758a, this.f27759b, this.f27760c, this.f27761d);
            }
        }
    }

    /* loaded from: classes3.dex */
    final class h implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ JSONObject f27763a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ com.ironsource.sdk.j.a.d f27764b;

        h(JSONObject jSONObject, com.ironsource.sdk.j.a.d dVar) {
            this.f27763a = jSONObject;
            this.f27764b = dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (g.this.f27736a != null) {
                g.this.f27736a.a(this.f27763a, this.f27764b);
            }
        }
    }

    /* loaded from: classes3.dex */
    final class i implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ String f27766a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ String f27767b;

        /* renamed from: c  reason: collision with root package name */
        private /* synthetic */ com.ironsource.sdk.g.c f27768c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ com.ironsource.sdk.j.a.c f27769d;

        i(String str, String str2, com.ironsource.sdk.g.c cVar, com.ironsource.sdk.j.a.c cVar2) {
            this.f27766a = str;
            this.f27767b = str2;
            this.f27768c = cVar;
            this.f27769d = cVar2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (g.this.f27736a != null) {
                g.this.f27736a.a(this.f27766a, this.f27767b, this.f27768c, this.f27769d);
            }
        }
    }

    /* loaded from: classes3.dex */
    final class j implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ Context f27771a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ com.ironsource.sdk.controller.c f27772b;

        /* renamed from: c  reason: collision with root package name */
        private /* synthetic */ com.ironsource.sdk.service.d f27773c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ com.ironsource.sdk.controller.j f27774d;

        j(Context context, com.ironsource.sdk.controller.c cVar, com.ironsource.sdk.service.d dVar, com.ironsource.sdk.controller.j jVar) {
            this.f27771a = context;
            this.f27772b = cVar;
            this.f27773c = dVar;
            this.f27774d = jVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                g gVar = g.this;
                gVar.f27736a = g.c(gVar, this.f27771a, this.f27772b, this.f27773c, this.f27774d);
                g.this.f27736a.h();
            } catch (Exception e10) {
                g.this.g(Log.getStackTraceString(e10));
            }
        }
    }

    /* loaded from: classes3.dex */
    final class k implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ String f27776a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ com.ironsource.sdk.j.a.c f27777b;

        k(String str, com.ironsource.sdk.j.a.c cVar) {
            this.f27776a = str;
            this.f27777b = cVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (g.this.f27736a != null) {
                g.this.f27736a.a(this.f27776a, this.f27777b);
            }
        }
    }

    /* loaded from: classes3.dex */
    final class l implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ com.ironsource.sdk.g.c f27779a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Map f27780b;

        /* renamed from: c  reason: collision with root package name */
        private /* synthetic */ com.ironsource.sdk.j.a.c f27781c;

        l(com.ironsource.sdk.g.c cVar, Map map, com.ironsource.sdk.j.a.c cVar2) {
            this.f27779a = cVar;
            this.f27780b = map;
            this.f27781c = cVar2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.ironsource.sdk.a.a a10 = new com.ironsource.sdk.a.a().a("demandsourcename", this.f27779a.f28142a).a("producttype", com.ironsource.sdk.a.e.a(this.f27779a, d.e.Interstitial)).a("isbiddinginstance", Boolean.valueOf(com.ironsource.sdk.a.e.a(this.f27779a)));
            com.ironsource.sdk.service.a aVar = com.ironsource.sdk.service.a.f28229a;
            com.ironsource.sdk.a.d.a(com.ironsource.sdk.a.f.f27591i, a10.a("custom_c", Long.valueOf(com.ironsource.sdk.service.a.c(this.f27779a.f28143b))).f27575a);
            if (g.this.f27736a != null) {
                g.this.f27736a.a(this.f27779a, this.f27780b, this.f27781c);
            }
        }
    }

    /* loaded from: classes3.dex */
    final class m implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ JSONObject f27783a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ com.ironsource.sdk.j.a.c f27784b;

        m(JSONObject jSONObject, com.ironsource.sdk.j.a.c cVar) {
            this.f27783a = jSONObject;
            this.f27784b = cVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (g.this.f27736a != null) {
                g.this.f27736a.a(this.f27783a, this.f27784b);
            }
        }
    }

    /* loaded from: classes3.dex */
    final class n implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ com.ironsource.sdk.g.c f27786a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Map f27787b;

        /* renamed from: c  reason: collision with root package name */
        private /* synthetic */ com.ironsource.sdk.j.a.c f27788c;

        n(com.ironsource.sdk.g.c cVar, Map map, com.ironsource.sdk.j.a.c cVar2) {
            this.f27786a = cVar;
            this.f27787b = map;
            this.f27788c = cVar2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (g.this.f27736a != null) {
                g.this.f27736a.b(this.f27786a, this.f27787b, this.f27788c);
            }
        }
    }

    /* loaded from: classes3.dex */
    final class o implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ String f27790a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ String f27791b;

        /* renamed from: c  reason: collision with root package name */
        private /* synthetic */ com.ironsource.sdk.g.c f27792c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ com.ironsource.sdk.j.a.b f27793d;

        o(String str, String str2, com.ironsource.sdk.g.c cVar, com.ironsource.sdk.j.a.b bVar) {
            this.f27790a = str;
            this.f27791b = str2;
            this.f27792c = cVar;
            this.f27793d = bVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (g.this.f27736a != null) {
                g.this.f27736a.a(this.f27790a, this.f27791b, this.f27792c, this.f27793d);
            }
        }
    }

    /* loaded from: classes3.dex */
    final class p implements Runnable {
        p() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (g.this.f27736a != null) {
                g.this.f27736a.d();
            }
        }
    }

    /* loaded from: classes3.dex */
    final class q implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ com.ironsource.sdk.g.c f27796a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Map f27797b;

        /* renamed from: c  reason: collision with root package name */
        private /* synthetic */ com.ironsource.sdk.j.a.b f27798c;

        q(com.ironsource.sdk.g.c cVar, Map map, com.ironsource.sdk.j.a.b bVar) {
            this.f27796a = cVar;
            this.f27797b = map;
            this.f27798c = bVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (g.this.f27736a != null) {
                g.this.f27736a.a(this.f27796a, this.f27797b, this.f27798c);
            }
        }
    }

    /* loaded from: classes3.dex */
    final class r implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ JSONObject f27800a;

        r(JSONObject jSONObject) {
            this.f27800a = jSONObject;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (g.this.f27736a != null) {
                g.this.f27736a.a(this.f27800a);
            }
        }
    }

    public g(Context context, com.ironsource.sdk.controller.c cVar, com.ironsource.sdk.service.d dVar, com.ironsource.sdk.controller.j jVar, com.ironsource.environment.e.a aVar) {
        this.f27742g = aVar;
        IronSourceStorageUtils.getNetworkStorageDir(context);
        f(new j(context, cVar, dVar, jVar));
        this.f27739d = new b(200000L, 1000L).start();
    }

    static /* synthetic */ x c(g gVar, Context context, com.ironsource.sdk.controller.c cVar, com.ironsource.sdk.service.d dVar, com.ironsource.sdk.controller.j jVar) {
        com.ironsource.sdk.a.d.a(com.ironsource.sdk.a.f.f27584b);
        x xVar = new x(context, jVar, cVar, gVar, gVar.f27742g);
        com.ironsource.sdk.h.b bVar = new com.ironsource.sdk.h.b(context, xVar.r(), new com.ironsource.sdk.h.a(com.ironsource.environment.e.a.a()), new com.ironsource.sdk.h.d(xVar.r().f28203b));
        xVar.N = new v(context, dVar);
        xVar.L = new com.ironsource.sdk.controller.q(context);
        xVar.M = new com.ironsource.sdk.controller.r(context);
        xVar.O = new com.ironsource.sdk.controller.k(context);
        com.ironsource.sdk.controller.a aVar = new com.ironsource.sdk.controller.a(cVar);
        xVar.P = aVar;
        if (xVar.R == null) {
            xVar.R = new x.b();
        }
        aVar.f27701a = xVar.R;
        xVar.Q = new com.ironsource.sdk.controller.l(xVar.r().f28203b, bVar);
        return xVar;
    }

    private void f(Runnable runnable) {
        com.ironsource.environment.e.a aVar = this.f27742g;
        if (aVar != null) {
            aVar.a(runnable);
        } else {
            Logger.e(this.f27737b, "mThreadManager = null");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(String str) {
        com.ironsource.sdk.a.d.a(com.ironsource.sdk.a.f.f27585c, new com.ironsource.sdk.a.a().a("callfailreason", str).f27575a);
        this.f27736a = new com.ironsource.sdk.controller.p(str, this.f27742g);
        this.f27740e.a();
        this.f27740e.b();
        com.ironsource.environment.e.a aVar = this.f27742g;
        if (aVar != null) {
            aVar.c(new c());
        }
    }

    private boolean i() {
        return d.b.Ready.equals(this.f27738c);
    }

    @Override // com.ironsource.sdk.controller.e
    public final void a() {
        this.f27738c = d.b.Loaded;
        this.f27740e.a();
        this.f27740e.b();
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(Context context) {
        com.ironsource.sdk.controller.m mVar;
        if (!i() || (mVar = this.f27736a) == null) {
            return;
        }
        mVar.a(context);
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(com.ironsource.sdk.g.c cVar, Map<String, String> map, com.ironsource.sdk.j.a.b bVar) {
        this.f27741f.a(new q(cVar, map, bVar));
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(com.ironsource.sdk.g.c cVar, Map<String, String> map, com.ironsource.sdk.j.a.c cVar2) {
        this.f27741f.a(new l(cVar, map, cVar2));
    }

    public final void a(Runnable runnable) {
        this.f27740e.a(runnable);
    }

    @Override // com.ironsource.sdk.controller.e
    public final void a(String str) {
        com.ironsource.sdk.a.d.a(com.ironsource.sdk.a.f.f27594l, new com.ironsource.sdk.a.a().a("callfailreason", str).f27575a);
        com.ironsource.sdk.j.d initListener = IronSourceNetwork.getInitListener();
        if (initListener != null) {
            initListener.onFail(new com.ironsource.sdk.g.e(1001, str));
            IronSourceNetwork.setInitListener(null);
        }
        CountDownTimer countDownTimer = this.f27739d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        g(str);
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(String str, com.ironsource.sdk.j.a.c cVar) {
        this.f27741f.a(new k(str, cVar));
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(String str, String str2, com.ironsource.sdk.g.c cVar, com.ironsource.sdk.j.a.b bVar) {
        this.f27741f.a(new o(str, str2, cVar, bVar));
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(String str, String str2, com.ironsource.sdk.g.c cVar, com.ironsource.sdk.j.a.c cVar2) {
        this.f27741f.a(new i(str, str2, cVar, cVar2));
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(String str, String str2, com.ironsource.sdk.g.c cVar, com.ironsource.sdk.j.a.d dVar) {
        this.f27741f.a(new RunnableC0346g(str, str2, cVar, dVar));
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(String str, String str2, com.ironsource.sdk.j.e eVar) {
        this.f27741f.a(new f(str, str2, eVar));
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(String str, String str2, Map<String, String> map, com.ironsource.sdk.j.e eVar) {
        this.f27741f.a(new d(str, str2, map, eVar));
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(Map<String, String> map, com.ironsource.sdk.j.e eVar) {
        this.f27741f.a(new e(map, eVar));
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(JSONObject jSONObject) {
        this.f27741f.a(new r(jSONObject));
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(JSONObject jSONObject, com.ironsource.sdk.j.a.c cVar) {
        this.f27741f.a(new m(jSONObject, cVar));
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(JSONObject jSONObject, com.ironsource.sdk.j.a.d dVar) {
        this.f27741f.a(new h(jSONObject, dVar));
    }

    @Override // com.ironsource.sdk.controller.e
    public final void b() {
        if (d.c.Web.equals(c())) {
            com.ironsource.sdk.a.d.a(com.ironsource.sdk.a.f.f27586d);
            com.ironsource.sdk.j.d initListener = IronSourceNetwork.getInitListener();
            if (initListener != null) {
                initListener.onSuccess();
                IronSourceNetwork.setInitListener(null);
            }
        }
        this.f27738c = d.b.Ready;
        CountDownTimer countDownTimer = this.f27739d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.f27741f.a();
        this.f27741f.b();
        com.ironsource.sdk.controller.m mVar = this.f27736a;
        if (mVar != null) {
            mVar.g();
        }
    }

    @Override // com.ironsource.sdk.controller.m
    public final void b(Context context) {
        com.ironsource.sdk.controller.m mVar;
        if (!i() || (mVar = this.f27736a) == null) {
            return;
        }
        mVar.b(context);
    }

    @Override // com.ironsource.sdk.controller.m
    public final void b(com.ironsource.sdk.g.c cVar, Map<String, String> map, com.ironsource.sdk.j.a.c cVar2) {
        this.f27741f.a(new n(cVar, map, cVar2));
    }

    @Override // com.ironsource.sdk.controller.e
    public final void b(String str) {
        com.ironsource.sdk.a.d.a(com.ironsource.sdk.a.f.f27603u, new com.ironsource.sdk.a.a().a("generalmessage", str).f27575a);
        CountDownTimer countDownTimer = this.f27739d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        g(str);
    }

    @Override // com.ironsource.sdk.controller.m
    public final d.c c() {
        com.ironsource.sdk.controller.m mVar = this.f27736a;
        return mVar != null ? mVar.c() : d.c.None;
    }

    @Override // com.ironsource.sdk.controller.m
    public final boolean c(String str) {
        if (this.f27736a == null || !i()) {
            return false;
        }
        return this.f27736a.c(str);
    }

    @Override // com.ironsource.sdk.controller.m
    public final void d() {
        this.f27741f.a(new p());
    }

    @Override // com.ironsource.sdk.controller.m
    public void destroy() {
        CountDownTimer countDownTimer = this.f27739d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.f27739d = null;
        f(new a());
    }

    @Override // com.ironsource.sdk.controller.m
    public final void e() {
        com.ironsource.sdk.controller.m mVar;
        if (!i() || (mVar = this.f27736a) == null) {
            return;
        }
        mVar.e();
    }

    @Override // com.ironsource.sdk.controller.m
    public final void f() {
        com.ironsource.sdk.controller.m mVar;
        if (!i() || (mVar = this.f27736a) == null) {
            return;
        }
        mVar.f();
    }

    @Override // com.ironsource.sdk.controller.m
    @Deprecated
    public final void g() {
    }

    @Override // com.ironsource.sdk.controller.m
    public final void h() {
    }
}
