package ac;

import ac.a0;
import com.applovin.sdk.AppLovinEventTypes;
import com.facebook.react.modules.appstate.AppStateModule;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import com.vehiclecloud.app.videofetch.rnbillingclient.Analytics;
import java.io.IOException;

/* compiled from: AutoCrashlyticsReportEncoder.java */
/* loaded from: classes3.dex */
public final class a implements mc.a {

    /* renamed from: a  reason: collision with root package name */
    public static final mc.a f220a = new a();

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: ac.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    private static final class C0008a implements lc.d<a0.a> {

        /* renamed from: a  reason: collision with root package name */
        static final C0008a f221a = new C0008a();

        /* renamed from: b  reason: collision with root package name */
        private static final lc.c f222b = lc.c.d("pid");

        /* renamed from: c  reason: collision with root package name */
        private static final lc.c f223c = lc.c.d("processName");

        /* renamed from: d  reason: collision with root package name */
        private static final lc.c f224d = lc.c.d("reasonCode");

        /* renamed from: e  reason: collision with root package name */
        private static final lc.c f225e = lc.c.d("importance");

        /* renamed from: f  reason: collision with root package name */
        private static final lc.c f226f = lc.c.d("pss");

        /* renamed from: g  reason: collision with root package name */
        private static final lc.c f227g = lc.c.d("rss");

        /* renamed from: h  reason: collision with root package name */
        private static final lc.c f228h = lc.c.d("timestamp");

        /* renamed from: i  reason: collision with root package name */
        private static final lc.c f229i = lc.c.d("traceFile");

        private C0008a() {
        }

        @Override // lc.d
        /* renamed from: b */
        public void a(a0.a aVar, lc.e eVar) throws IOException {
            eVar.e(f222b, aVar.c());
            eVar.b(f223c, aVar.d());
            eVar.e(f224d, aVar.f());
            eVar.e(f225e, aVar.b());
            eVar.d(f226f, aVar.e());
            eVar.d(f227g, aVar.g());
            eVar.d(f228h, aVar.h());
            eVar.b(f229i, aVar.i());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* loaded from: classes3.dex */
    private static final class b implements lc.d<a0.c> {

        /* renamed from: a  reason: collision with root package name */
        static final b f230a = new b();

        /* renamed from: b  reason: collision with root package name */
        private static final lc.c f231b = lc.c.d("key");

        /* renamed from: c  reason: collision with root package name */
        private static final lc.c f232c = lc.c.d(AppMeasurementSdk.ConditionalUserProperty.VALUE);

        private b() {
        }

        @Override // lc.d
        /* renamed from: b */
        public void a(a0.c cVar, lc.e eVar) throws IOException {
            eVar.b(f231b, cVar.b());
            eVar.b(f232c, cVar.c());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* loaded from: classes3.dex */
    private static final class c implements lc.d<a0> {

        /* renamed from: a  reason: collision with root package name */
        static final c f233a = new c();

        /* renamed from: b  reason: collision with root package name */
        private static final lc.c f234b = lc.c.d("sdkVersion");

        /* renamed from: c  reason: collision with root package name */
        private static final lc.c f235c = lc.c.d("gmpAppId");

        /* renamed from: d  reason: collision with root package name */
        private static final lc.c f236d = lc.c.d("platform");

        /* renamed from: e  reason: collision with root package name */
        private static final lc.c f237e = lc.c.d("installationUuid");

        /* renamed from: f  reason: collision with root package name */
        private static final lc.c f238f = lc.c.d("buildVersion");

        /* renamed from: g  reason: collision with root package name */
        private static final lc.c f239g = lc.c.d("displayVersion");

        /* renamed from: h  reason: collision with root package name */
        private static final lc.c f240h = lc.c.d("session");

        /* renamed from: i  reason: collision with root package name */
        private static final lc.c f241i = lc.c.d("ndkPayload");

        private c() {
        }

        @Override // lc.d
        /* renamed from: b */
        public void a(a0 a0Var, lc.e eVar) throws IOException {
            eVar.b(f234b, a0Var.i());
            eVar.b(f235c, a0Var.e());
            eVar.e(f236d, a0Var.h());
            eVar.b(f237e, a0Var.f());
            eVar.b(f238f, a0Var.c());
            eVar.b(f239g, a0Var.d());
            eVar.b(f240h, a0Var.j());
            eVar.b(f241i, a0Var.g());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* loaded from: classes3.dex */
    private static final class d implements lc.d<a0.d> {

        /* renamed from: a  reason: collision with root package name */
        static final d f242a = new d();

        /* renamed from: b  reason: collision with root package name */
        private static final lc.c f243b = lc.c.d("files");

        /* renamed from: c  reason: collision with root package name */
        private static final lc.c f244c = lc.c.d("orgId");

        private d() {
        }

        @Override // lc.d
        /* renamed from: b */
        public void a(a0.d dVar, lc.e eVar) throws IOException {
            eVar.b(f243b, dVar.b());
            eVar.b(f244c, dVar.c());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* loaded from: classes3.dex */
    private static final class e implements lc.d<a0.d.b> {

        /* renamed from: a  reason: collision with root package name */
        static final e f245a = new e();

        /* renamed from: b  reason: collision with root package name */
        private static final lc.c f246b = lc.c.d("filename");

        /* renamed from: c  reason: collision with root package name */
        private static final lc.c f247c = lc.c.d("contents");

        private e() {
        }

        @Override // lc.d
        /* renamed from: b */
        public void a(a0.d.b bVar, lc.e eVar) throws IOException {
            eVar.b(f246b, bVar.c());
            eVar.b(f247c, bVar.b());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* loaded from: classes3.dex */
    private static final class f implements lc.d<a0.e.a> {

        /* renamed from: a  reason: collision with root package name */
        static final f f248a = new f();

        /* renamed from: b  reason: collision with root package name */
        private static final lc.c f249b = lc.c.d("identifier");

        /* renamed from: c  reason: collision with root package name */
        private static final lc.c f250c = lc.c.d(MediationMetaData.KEY_VERSION);

        /* renamed from: d  reason: collision with root package name */
        private static final lc.c f251d = lc.c.d("displayVersion");

        /* renamed from: e  reason: collision with root package name */
        private static final lc.c f252e = lc.c.d("organization");

        /* renamed from: f  reason: collision with root package name */
        private static final lc.c f253f = lc.c.d("installationUuid");

        /* renamed from: g  reason: collision with root package name */
        private static final lc.c f254g = lc.c.d("developmentPlatform");

        /* renamed from: h  reason: collision with root package name */
        private static final lc.c f255h = lc.c.d("developmentPlatformVersion");

        private f() {
        }

        @Override // lc.d
        /* renamed from: b */
        public void a(a0.e.a aVar, lc.e eVar) throws IOException {
            eVar.b(f249b, aVar.e());
            eVar.b(f250c, aVar.h());
            eVar.b(f251d, aVar.d());
            eVar.b(f252e, aVar.g());
            eVar.b(f253f, aVar.f());
            eVar.b(f254g, aVar.b());
            eVar.b(f255h, aVar.c());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* loaded from: classes3.dex */
    private static final class g implements lc.d<a0.e.a.b> {

        /* renamed from: a  reason: collision with root package name */
        static final g f256a = new g();

        /* renamed from: b  reason: collision with root package name */
        private static final lc.c f257b = lc.c.d("clsId");

        private g() {
        }

        @Override // lc.d
        /* renamed from: b */
        public void a(a0.e.a.b bVar, lc.e eVar) throws IOException {
            eVar.b(f257b, bVar.a());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* loaded from: classes3.dex */
    private static final class h implements lc.d<a0.e.c> {

        /* renamed from: a  reason: collision with root package name */
        static final h f258a = new h();

        /* renamed from: b  reason: collision with root package name */
        private static final lc.c f259b = lc.c.d("arch");

        /* renamed from: c  reason: collision with root package name */
        private static final lc.c f260c = lc.c.d("model");

        /* renamed from: d  reason: collision with root package name */
        private static final lc.c f261d = lc.c.d("cores");

        /* renamed from: e  reason: collision with root package name */
        private static final lc.c f262e = lc.c.d("ram");

        /* renamed from: f  reason: collision with root package name */
        private static final lc.c f263f = lc.c.d("diskSpace");

        /* renamed from: g  reason: collision with root package name */
        private static final lc.c f264g = lc.c.d("simulator");

        /* renamed from: h  reason: collision with root package name */
        private static final lc.c f265h = lc.c.d("state");

        /* renamed from: i  reason: collision with root package name */
        private static final lc.c f266i = lc.c.d("manufacturer");

        /* renamed from: j  reason: collision with root package name */
        private static final lc.c f267j = lc.c.d("modelClass");

        private h() {
        }

        @Override // lc.d
        /* renamed from: b */
        public void a(a0.e.c cVar, lc.e eVar) throws IOException {
            eVar.e(f259b, cVar.b());
            eVar.b(f260c, cVar.f());
            eVar.e(f261d, cVar.c());
            eVar.d(f262e, cVar.h());
            eVar.d(f263f, cVar.d());
            eVar.f(f264g, cVar.j());
            eVar.e(f265h, cVar.i());
            eVar.b(f266i, cVar.e());
            eVar.b(f267j, cVar.g());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* loaded from: classes3.dex */
    private static final class i implements lc.d<a0.e> {

        /* renamed from: a  reason: collision with root package name */
        static final i f268a = new i();

        /* renamed from: b  reason: collision with root package name */
        private static final lc.c f269b = lc.c.d("generator");

        /* renamed from: c  reason: collision with root package name */
        private static final lc.c f270c = lc.c.d("identifier");

        /* renamed from: d  reason: collision with root package name */
        private static final lc.c f271d = lc.c.d("startedAt");

        /* renamed from: e  reason: collision with root package name */
        private static final lc.c f272e = lc.c.d("endedAt");

        /* renamed from: f  reason: collision with root package name */
        private static final lc.c f273f = lc.c.d("crashed");

        /* renamed from: g  reason: collision with root package name */
        private static final lc.c f274g = lc.c.d("app");

        /* renamed from: h  reason: collision with root package name */
        private static final lc.c f275h = lc.c.d("user");

        /* renamed from: i  reason: collision with root package name */
        private static final lc.c f276i = lc.c.d("os");

        /* renamed from: j  reason: collision with root package name */
        private static final lc.c f277j = lc.c.d("device");

        /* renamed from: k  reason: collision with root package name */
        private static final lc.c f278k = lc.c.d("events");

        /* renamed from: l  reason: collision with root package name */
        private static final lc.c f279l = lc.c.d("generatorType");

        private i() {
        }

        @Override // lc.d
        /* renamed from: b */
        public void a(a0.e eVar, lc.e eVar2) throws IOException {
            eVar2.b(f269b, eVar.f());
            eVar2.b(f270c, eVar.i());
            eVar2.d(f271d, eVar.k());
            eVar2.b(f272e, eVar.d());
            eVar2.f(f273f, eVar.m());
            eVar2.b(f274g, eVar.b());
            eVar2.b(f275h, eVar.l());
            eVar2.b(f276i, eVar.j());
            eVar2.b(f277j, eVar.c());
            eVar2.b(f278k, eVar.e());
            eVar2.e(f279l, eVar.g());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* loaded from: classes3.dex */
    private static final class j implements lc.d<a0.e.d.a> {

        /* renamed from: a  reason: collision with root package name */
        static final j f280a = new j();

        /* renamed from: b  reason: collision with root package name */
        private static final lc.c f281b = lc.c.d("execution");

        /* renamed from: c  reason: collision with root package name */
        private static final lc.c f282c = lc.c.d("customAttributes");

        /* renamed from: d  reason: collision with root package name */
        private static final lc.c f283d = lc.c.d("internalKeys");

        /* renamed from: e  reason: collision with root package name */
        private static final lc.c f284e = lc.c.d(AppStateModule.APP_STATE_BACKGROUND);

        /* renamed from: f  reason: collision with root package name */
        private static final lc.c f285f = lc.c.d("uiOrientation");

        private j() {
        }

        @Override // lc.d
        /* renamed from: b */
        public void a(a0.e.d.a aVar, lc.e eVar) throws IOException {
            eVar.b(f281b, aVar.d());
            eVar.b(f282c, aVar.c());
            eVar.b(f283d, aVar.e());
            eVar.b(f284e, aVar.b());
            eVar.e(f285f, aVar.f());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* loaded from: classes3.dex */
    private static final class k implements lc.d<a0.e.d.a.b.AbstractC0012a> {

        /* renamed from: a  reason: collision with root package name */
        static final k f286a = new k();

        /* renamed from: b  reason: collision with root package name */
        private static final lc.c f287b = lc.c.d("baseAddress");

        /* renamed from: c  reason: collision with root package name */
        private static final lc.c f288c = lc.c.d("size");

        /* renamed from: d  reason: collision with root package name */
        private static final lc.c f289d = lc.c.d("name");

        /* renamed from: e  reason: collision with root package name */
        private static final lc.c f290e = lc.c.d("uuid");

        private k() {
        }

        @Override // lc.d
        /* renamed from: b */
        public void a(a0.e.d.a.b.AbstractC0012a abstractC0012a, lc.e eVar) throws IOException {
            eVar.d(f287b, abstractC0012a.b());
            eVar.d(f288c, abstractC0012a.d());
            eVar.b(f289d, abstractC0012a.c());
            eVar.b(f290e, abstractC0012a.f());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* loaded from: classes3.dex */
    private static final class l implements lc.d<a0.e.d.a.b> {

        /* renamed from: a  reason: collision with root package name */
        static final l f291a = new l();

        /* renamed from: b  reason: collision with root package name */
        private static final lc.c f292b = lc.c.d("threads");

        /* renamed from: c  reason: collision with root package name */
        private static final lc.c f293c = lc.c.d("exception");

        /* renamed from: d  reason: collision with root package name */
        private static final lc.c f294d = lc.c.d("appExitInfo");

        /* renamed from: e  reason: collision with root package name */
        private static final lc.c f295e = lc.c.d("signal");

        /* renamed from: f  reason: collision with root package name */
        private static final lc.c f296f = lc.c.d("binaries");

        private l() {
        }

        @Override // lc.d
        /* renamed from: b */
        public void a(a0.e.d.a.b bVar, lc.e eVar) throws IOException {
            eVar.b(f292b, bVar.f());
            eVar.b(f293c, bVar.d());
            eVar.b(f294d, bVar.b());
            eVar.b(f295e, bVar.e());
            eVar.b(f296f, bVar.c());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* loaded from: classes3.dex */
    private static final class m implements lc.d<a0.e.d.a.b.c> {

        /* renamed from: a  reason: collision with root package name */
        static final m f297a = new m();

        /* renamed from: b  reason: collision with root package name */
        private static final lc.c f298b = lc.c.d("type");

        /* renamed from: c  reason: collision with root package name */
        private static final lc.c f299c = lc.c.d(IronSourceConstants.EVENTS_ERROR_REASON);

        /* renamed from: d  reason: collision with root package name */
        private static final lc.c f300d = lc.c.d("frames");

        /* renamed from: e  reason: collision with root package name */
        private static final lc.c f301e = lc.c.d("causedBy");

        /* renamed from: f  reason: collision with root package name */
        private static final lc.c f302f = lc.c.d("overflowCount");

        private m() {
        }

        @Override // lc.d
        /* renamed from: b */
        public void a(a0.e.d.a.b.c cVar, lc.e eVar) throws IOException {
            eVar.b(f298b, cVar.f());
            eVar.b(f299c, cVar.e());
            eVar.b(f300d, cVar.c());
            eVar.b(f301e, cVar.b());
            eVar.e(f302f, cVar.d());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* loaded from: classes3.dex */
    private static final class n implements lc.d<a0.e.d.a.b.AbstractC0016d> {

        /* renamed from: a  reason: collision with root package name */
        static final n f303a = new n();

        /* renamed from: b  reason: collision with root package name */
        private static final lc.c f304b = lc.c.d("name");

        /* renamed from: c  reason: collision with root package name */
        private static final lc.c f305c = lc.c.d(Analytics.Param.CODE);

        /* renamed from: d  reason: collision with root package name */
        private static final lc.c f306d = lc.c.d("address");

        private n() {
        }

        @Override // lc.d
        /* renamed from: b */
        public void a(a0.e.d.a.b.AbstractC0016d abstractC0016d, lc.e eVar) throws IOException {
            eVar.b(f304b, abstractC0016d.d());
            eVar.b(f305c, abstractC0016d.c());
            eVar.d(f306d, abstractC0016d.b());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* loaded from: classes3.dex */
    private static final class o implements lc.d<a0.e.d.a.b.AbstractC0018e> {

        /* renamed from: a  reason: collision with root package name */
        static final o f307a = new o();

        /* renamed from: b  reason: collision with root package name */
        private static final lc.c f308b = lc.c.d("name");

        /* renamed from: c  reason: collision with root package name */
        private static final lc.c f309c = lc.c.d("importance");

        /* renamed from: d  reason: collision with root package name */
        private static final lc.c f310d = lc.c.d("frames");

        private o() {
        }

        @Override // lc.d
        /* renamed from: b */
        public void a(a0.e.d.a.b.AbstractC0018e abstractC0018e, lc.e eVar) throws IOException {
            eVar.b(f308b, abstractC0018e.d());
            eVar.e(f309c, abstractC0018e.c());
            eVar.b(f310d, abstractC0018e.b());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* loaded from: classes3.dex */
    private static final class p implements lc.d<a0.e.d.a.b.AbstractC0018e.AbstractC0020b> {

        /* renamed from: a  reason: collision with root package name */
        static final p f311a = new p();

        /* renamed from: b  reason: collision with root package name */
        private static final lc.c f312b = lc.c.d("pc");

        /* renamed from: c  reason: collision with root package name */
        private static final lc.c f313c = lc.c.d("symbol");

        /* renamed from: d  reason: collision with root package name */
        private static final lc.c f314d = lc.c.d("file");

        /* renamed from: e  reason: collision with root package name */
        private static final lc.c f315e = lc.c.d("offset");

        /* renamed from: f  reason: collision with root package name */
        private static final lc.c f316f = lc.c.d("importance");

        private p() {
        }

        @Override // lc.d
        /* renamed from: b */
        public void a(a0.e.d.a.b.AbstractC0018e.AbstractC0020b abstractC0020b, lc.e eVar) throws IOException {
            eVar.d(f312b, abstractC0020b.e());
            eVar.b(f313c, abstractC0020b.f());
            eVar.b(f314d, abstractC0020b.b());
            eVar.d(f315e, abstractC0020b.d());
            eVar.e(f316f, abstractC0020b.c());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* loaded from: classes3.dex */
    private static final class q implements lc.d<a0.e.d.c> {

        /* renamed from: a  reason: collision with root package name */
        static final q f317a = new q();

        /* renamed from: b  reason: collision with root package name */
        private static final lc.c f318b = lc.c.d("batteryLevel");

        /* renamed from: c  reason: collision with root package name */
        private static final lc.c f319c = lc.c.d("batteryVelocity");

        /* renamed from: d  reason: collision with root package name */
        private static final lc.c f320d = lc.c.d("proximityOn");

        /* renamed from: e  reason: collision with root package name */
        private static final lc.c f321e = lc.c.d(AdUnitActivity.EXTRA_ORIENTATION);

        /* renamed from: f  reason: collision with root package name */
        private static final lc.c f322f = lc.c.d("ramUsed");

        /* renamed from: g  reason: collision with root package name */
        private static final lc.c f323g = lc.c.d("diskUsed");

        private q() {
        }

        @Override // lc.d
        /* renamed from: b */
        public void a(a0.e.d.c cVar, lc.e eVar) throws IOException {
            eVar.b(f318b, cVar.b());
            eVar.e(f319c, cVar.c());
            eVar.f(f320d, cVar.g());
            eVar.e(f321e, cVar.e());
            eVar.d(f322f, cVar.f());
            eVar.d(f323g, cVar.d());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* loaded from: classes3.dex */
    private static final class r implements lc.d<a0.e.d> {

        /* renamed from: a  reason: collision with root package name */
        static final r f324a = new r();

        /* renamed from: b  reason: collision with root package name */
        private static final lc.c f325b = lc.c.d("timestamp");

        /* renamed from: c  reason: collision with root package name */
        private static final lc.c f326c = lc.c.d("type");

        /* renamed from: d  reason: collision with root package name */
        private static final lc.c f327d = lc.c.d("app");

        /* renamed from: e  reason: collision with root package name */
        private static final lc.c f328e = lc.c.d("device");

        /* renamed from: f  reason: collision with root package name */
        private static final lc.c f329f = lc.c.d("log");

        private r() {
        }

        @Override // lc.d
        /* renamed from: b */
        public void a(a0.e.d dVar, lc.e eVar) throws IOException {
            eVar.d(f325b, dVar.e());
            eVar.b(f326c, dVar.f());
            eVar.b(f327d, dVar.b());
            eVar.b(f328e, dVar.c());
            eVar.b(f329f, dVar.d());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* loaded from: classes3.dex */
    private static final class s implements lc.d<a0.e.d.AbstractC0022d> {

        /* renamed from: a  reason: collision with root package name */
        static final s f330a = new s();

        /* renamed from: b  reason: collision with root package name */
        private static final lc.c f331b = lc.c.d(AppLovinEventTypes.USER_VIEWED_CONTENT);

        private s() {
        }

        @Override // lc.d
        /* renamed from: b */
        public void a(a0.e.d.AbstractC0022d abstractC0022d, lc.e eVar) throws IOException {
            eVar.b(f331b, abstractC0022d.b());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* loaded from: classes3.dex */
    private static final class t implements lc.d<a0.e.AbstractC0023e> {

        /* renamed from: a  reason: collision with root package name */
        static final t f332a = new t();

        /* renamed from: b  reason: collision with root package name */
        private static final lc.c f333b = lc.c.d("platform");

        /* renamed from: c  reason: collision with root package name */
        private static final lc.c f334c = lc.c.d(MediationMetaData.KEY_VERSION);

        /* renamed from: d  reason: collision with root package name */
        private static final lc.c f335d = lc.c.d("buildVersion");

        /* renamed from: e  reason: collision with root package name */
        private static final lc.c f336e = lc.c.d("jailbroken");

        private t() {
        }

        @Override // lc.d
        /* renamed from: b */
        public void a(a0.e.AbstractC0023e abstractC0023e, lc.e eVar) throws IOException {
            eVar.e(f333b, abstractC0023e.c());
            eVar.b(f334c, abstractC0023e.d());
            eVar.b(f335d, abstractC0023e.b());
            eVar.f(f336e, abstractC0023e.e());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* loaded from: classes3.dex */
    private static final class u implements lc.d<a0.e.f> {

        /* renamed from: a  reason: collision with root package name */
        static final u f337a = new u();

        /* renamed from: b  reason: collision with root package name */
        private static final lc.c f338b = lc.c.d("identifier");

        private u() {
        }

        @Override // lc.d
        /* renamed from: b */
        public void a(a0.e.f fVar, lc.e eVar) throws IOException {
            eVar.b(f338b, fVar.b());
        }
    }

    private a() {
    }

    @Override // mc.a
    public void a(mc.b<?> bVar) {
        c cVar = c.f233a;
        bVar.a(a0.class, cVar);
        bVar.a(ac.b.class, cVar);
        i iVar = i.f268a;
        bVar.a(a0.e.class, iVar);
        bVar.a(ac.g.class, iVar);
        f fVar = f.f248a;
        bVar.a(a0.e.a.class, fVar);
        bVar.a(ac.h.class, fVar);
        g gVar = g.f256a;
        bVar.a(a0.e.a.b.class, gVar);
        bVar.a(ac.i.class, gVar);
        u uVar = u.f337a;
        bVar.a(a0.e.f.class, uVar);
        bVar.a(v.class, uVar);
        t tVar = t.f332a;
        bVar.a(a0.e.AbstractC0023e.class, tVar);
        bVar.a(ac.u.class, tVar);
        h hVar = h.f258a;
        bVar.a(a0.e.c.class, hVar);
        bVar.a(ac.j.class, hVar);
        r rVar = r.f324a;
        bVar.a(a0.e.d.class, rVar);
        bVar.a(ac.k.class, rVar);
        j jVar = j.f280a;
        bVar.a(a0.e.d.a.class, jVar);
        bVar.a(ac.l.class, jVar);
        l lVar = l.f291a;
        bVar.a(a0.e.d.a.b.class, lVar);
        bVar.a(ac.m.class, lVar);
        o oVar = o.f307a;
        bVar.a(a0.e.d.a.b.AbstractC0018e.class, oVar);
        bVar.a(ac.q.class, oVar);
        p pVar = p.f311a;
        bVar.a(a0.e.d.a.b.AbstractC0018e.AbstractC0020b.class, pVar);
        bVar.a(ac.r.class, pVar);
        m mVar = m.f297a;
        bVar.a(a0.e.d.a.b.c.class, mVar);
        bVar.a(ac.o.class, mVar);
        C0008a c0008a = C0008a.f221a;
        bVar.a(a0.a.class, c0008a);
        bVar.a(ac.c.class, c0008a);
        n nVar = n.f303a;
        bVar.a(a0.e.d.a.b.AbstractC0016d.class, nVar);
        bVar.a(ac.p.class, nVar);
        k kVar = k.f286a;
        bVar.a(a0.e.d.a.b.AbstractC0012a.class, kVar);
        bVar.a(ac.n.class, kVar);
        b bVar2 = b.f230a;
        bVar.a(a0.c.class, bVar2);
        bVar.a(ac.d.class, bVar2);
        q qVar = q.f317a;
        bVar.a(a0.e.d.c.class, qVar);
        bVar.a(ac.s.class, qVar);
        s sVar = s.f330a;
        bVar.a(a0.e.d.AbstractC0022d.class, sVar);
        bVar.a(ac.t.class, sVar);
        d dVar = d.f242a;
        bVar.a(a0.d.class, dVar);
        bVar.a(ac.e.class, dVar);
        e eVar = e.f245a;
        bVar.a(a0.d.b.class, eVar);
        bVar.a(ac.f.class, eVar);
    }
}
