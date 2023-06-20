package v7;

import com.applovin.sdk.AppLovinEventTypes;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import java.io.IOException;

/* compiled from: AutoBatchedLogRequestEncoder.java */
/* loaded from: classes2.dex */
public final class b implements mc.a {

    /* renamed from: a  reason: collision with root package name */
    public static final mc.a f37814a = new b();

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    /* loaded from: classes2.dex */
    private static final class a implements lc.d<v7.a> {

        /* renamed from: a  reason: collision with root package name */
        static final a f37815a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static final lc.c f37816b = lc.c.d("sdkVersion");

        /* renamed from: c  reason: collision with root package name */
        private static final lc.c f37817c = lc.c.d("model");

        /* renamed from: d  reason: collision with root package name */
        private static final lc.c f37818d = lc.c.d("hardware");

        /* renamed from: e  reason: collision with root package name */
        private static final lc.c f37819e = lc.c.d("device");

        /* renamed from: f  reason: collision with root package name */
        private static final lc.c f37820f = lc.c.d(AppLovinEventTypes.USER_VIEWED_PRODUCT);

        /* renamed from: g  reason: collision with root package name */
        private static final lc.c f37821g = lc.c.d("osBuild");

        /* renamed from: h  reason: collision with root package name */
        private static final lc.c f37822h = lc.c.d("manufacturer");

        /* renamed from: i  reason: collision with root package name */
        private static final lc.c f37823i = lc.c.d("fingerprint");

        /* renamed from: j  reason: collision with root package name */
        private static final lc.c f37824j = lc.c.d("locale");

        /* renamed from: k  reason: collision with root package name */
        private static final lc.c f37825k = lc.c.d(ImpressionData.IMPRESSION_DATA_KEY_COUNTRY);

        /* renamed from: l  reason: collision with root package name */
        private static final lc.c f37826l = lc.c.d("mccMnc");

        /* renamed from: m  reason: collision with root package name */
        private static final lc.c f37827m = lc.c.d("applicationBuild");

        private a() {
        }

        @Override // lc.d
        /* renamed from: b */
        public void a(v7.a aVar, lc.e eVar) throws IOException {
            eVar.b(f37816b, aVar.m());
            eVar.b(f37817c, aVar.j());
            eVar.b(f37818d, aVar.f());
            eVar.b(f37819e, aVar.d());
            eVar.b(f37820f, aVar.l());
            eVar.b(f37821g, aVar.k());
            eVar.b(f37822h, aVar.h());
            eVar.b(f37823i, aVar.e());
            eVar.b(f37824j, aVar.g());
            eVar.b(f37825k, aVar.c());
            eVar.b(f37826l, aVar.i());
            eVar.b(f37827m, aVar.b());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    /* renamed from: v7.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    private static final class C0521b implements lc.d<j> {

        /* renamed from: a  reason: collision with root package name */
        static final C0521b f37828a = new C0521b();

        /* renamed from: b  reason: collision with root package name */
        private static final lc.c f37829b = lc.c.d("logRequest");

        private C0521b() {
        }

        @Override // lc.d
        /* renamed from: b */
        public void a(j jVar, lc.e eVar) throws IOException {
            eVar.b(f37829b, jVar.c());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    /* loaded from: classes2.dex */
    private static final class c implements lc.d<k> {

        /* renamed from: a  reason: collision with root package name */
        static final c f37830a = new c();

        /* renamed from: b  reason: collision with root package name */
        private static final lc.c f37831b = lc.c.d("clientType");

        /* renamed from: c  reason: collision with root package name */
        private static final lc.c f37832c = lc.c.d("androidClientInfo");

        private c() {
        }

        @Override // lc.d
        /* renamed from: b */
        public void a(k kVar, lc.e eVar) throws IOException {
            eVar.b(f37831b, kVar.c());
            eVar.b(f37832c, kVar.b());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    /* loaded from: classes2.dex */
    private static final class d implements lc.d<l> {

        /* renamed from: a  reason: collision with root package name */
        static final d f37833a = new d();

        /* renamed from: b  reason: collision with root package name */
        private static final lc.c f37834b = lc.c.d("eventTimeMs");

        /* renamed from: c  reason: collision with root package name */
        private static final lc.c f37835c = lc.c.d("eventCode");

        /* renamed from: d  reason: collision with root package name */
        private static final lc.c f37836d = lc.c.d("eventUptimeMs");

        /* renamed from: e  reason: collision with root package name */
        private static final lc.c f37837e = lc.c.d("sourceExtension");

        /* renamed from: f  reason: collision with root package name */
        private static final lc.c f37838f = lc.c.d("sourceExtensionJsonProto3");

        /* renamed from: g  reason: collision with root package name */
        private static final lc.c f37839g = lc.c.d("timezoneOffsetSeconds");

        /* renamed from: h  reason: collision with root package name */
        private static final lc.c f37840h = lc.c.d("networkConnectionInfo");

        private d() {
        }

        @Override // lc.d
        /* renamed from: b */
        public void a(l lVar, lc.e eVar) throws IOException {
            eVar.d(f37834b, lVar.c());
            eVar.b(f37835c, lVar.b());
            eVar.d(f37836d, lVar.d());
            eVar.b(f37837e, lVar.f());
            eVar.b(f37838f, lVar.g());
            eVar.d(f37839g, lVar.h());
            eVar.b(f37840h, lVar.e());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    /* loaded from: classes2.dex */
    private static final class e implements lc.d<m> {

        /* renamed from: a  reason: collision with root package name */
        static final e f37841a = new e();

        /* renamed from: b  reason: collision with root package name */
        private static final lc.c f37842b = lc.c.d("requestTimeMs");

        /* renamed from: c  reason: collision with root package name */
        private static final lc.c f37843c = lc.c.d("requestUptimeMs");

        /* renamed from: d  reason: collision with root package name */
        private static final lc.c f37844d = lc.c.d("clientInfo");

        /* renamed from: e  reason: collision with root package name */
        private static final lc.c f37845e = lc.c.d("logSource");

        /* renamed from: f  reason: collision with root package name */
        private static final lc.c f37846f = lc.c.d("logSourceName");

        /* renamed from: g  reason: collision with root package name */
        private static final lc.c f37847g = lc.c.d("logEvent");

        /* renamed from: h  reason: collision with root package name */
        private static final lc.c f37848h = lc.c.d("qosTier");

        private e() {
        }

        @Override // lc.d
        /* renamed from: b */
        public void a(m mVar, lc.e eVar) throws IOException {
            eVar.d(f37842b, mVar.g());
            eVar.d(f37843c, mVar.h());
            eVar.b(f37844d, mVar.b());
            eVar.b(f37845e, mVar.d());
            eVar.b(f37846f, mVar.e());
            eVar.b(f37847g, mVar.c());
            eVar.b(f37848h, mVar.f());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    /* loaded from: classes2.dex */
    private static final class f implements lc.d<o> {

        /* renamed from: a  reason: collision with root package name */
        static final f f37849a = new f();

        /* renamed from: b  reason: collision with root package name */
        private static final lc.c f37850b = lc.c.d("networkType");

        /* renamed from: c  reason: collision with root package name */
        private static final lc.c f37851c = lc.c.d("mobileSubtype");

        private f() {
        }

        @Override // lc.d
        /* renamed from: b */
        public void a(o oVar, lc.e eVar) throws IOException {
            eVar.b(f37850b, oVar.c());
            eVar.b(f37851c, oVar.b());
        }
    }

    private b() {
    }

    @Override // mc.a
    public void a(mc.b<?> bVar) {
        C0521b c0521b = C0521b.f37828a;
        bVar.a(j.class, c0521b);
        bVar.a(v7.d.class, c0521b);
        e eVar = e.f37841a;
        bVar.a(m.class, eVar);
        bVar.a(g.class, eVar);
        c cVar = c.f37830a;
        bVar.a(k.class, cVar);
        bVar.a(v7.e.class, cVar);
        a aVar = a.f37815a;
        bVar.a(v7.a.class, aVar);
        bVar.a(v7.c.class, aVar);
        d dVar = d.f37833a;
        bVar.a(l.class, dVar);
        bVar.a(v7.f.class, dVar);
        f fVar = f.f37849a;
        bVar.a(o.class, fVar);
        bVar.a(i.class, fVar);
    }
}
