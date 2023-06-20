package w7;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.IOException;

/* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
/* loaded from: classes2.dex */
public final class a implements mc.a {

    /* renamed from: a  reason: collision with root package name */
    public static final mc.a f38231a = new a();

    /* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
    /* renamed from: w7.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    private static final class C0527a implements lc.d<a8.a> {

        /* renamed from: a  reason: collision with root package name */
        static final C0527a f38232a = new C0527a();

        /* renamed from: b  reason: collision with root package name */
        private static final lc.c f38233b = lc.c.a("window").b(oc.a.b().c(1).a()).a();

        /* renamed from: c  reason: collision with root package name */
        private static final lc.c f38234c = lc.c.a("logSourceMetrics").b(oc.a.b().c(2).a()).a();

        /* renamed from: d  reason: collision with root package name */
        private static final lc.c f38235d = lc.c.a("globalMetrics").b(oc.a.b().c(3).a()).a();

        /* renamed from: e  reason: collision with root package name */
        private static final lc.c f38236e = lc.c.a("appNamespace").b(oc.a.b().c(4).a()).a();

        private C0527a() {
        }

        @Override // lc.d
        /* renamed from: b */
        public void a(a8.a aVar, lc.e eVar) throws IOException {
            eVar.b(f38233b, aVar.d());
            eVar.b(f38234c, aVar.c());
            eVar.b(f38235d, aVar.b());
            eVar.b(f38236e, aVar.a());
        }
    }

    /* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
    /* loaded from: classes2.dex */
    private static final class b implements lc.d<a8.b> {

        /* renamed from: a  reason: collision with root package name */
        static final b f38237a = new b();

        /* renamed from: b  reason: collision with root package name */
        private static final lc.c f38238b = lc.c.a("storageMetrics").b(oc.a.b().c(1).a()).a();

        private b() {
        }

        @Override // lc.d
        /* renamed from: b */
        public void a(a8.b bVar, lc.e eVar) throws IOException {
            eVar.b(f38238b, bVar.a());
        }
    }

    /* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
    /* loaded from: classes2.dex */
    private static final class c implements lc.d<a8.c> {

        /* renamed from: a  reason: collision with root package name */
        static final c f38239a = new c();

        /* renamed from: b  reason: collision with root package name */
        private static final lc.c f38240b = lc.c.a("eventsDroppedCount").b(oc.a.b().c(1).a()).a();

        /* renamed from: c  reason: collision with root package name */
        private static final lc.c f38241c = lc.c.a(IronSourceConstants.EVENTS_ERROR_REASON).b(oc.a.b().c(3).a()).a();

        private c() {
        }

        @Override // lc.d
        /* renamed from: b */
        public void a(a8.c cVar, lc.e eVar) throws IOException {
            eVar.d(f38240b, cVar.a());
            eVar.b(f38241c, cVar.b());
        }
    }

    /* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
    /* loaded from: classes2.dex */
    private static final class d implements lc.d<a8.d> {

        /* renamed from: a  reason: collision with root package name */
        static final d f38242a = new d();

        /* renamed from: b  reason: collision with root package name */
        private static final lc.c f38243b = lc.c.a("logSource").b(oc.a.b().c(1).a()).a();

        /* renamed from: c  reason: collision with root package name */
        private static final lc.c f38244c = lc.c.a("logEventDropped").b(oc.a.b().c(2).a()).a();

        private d() {
        }

        @Override // lc.d
        /* renamed from: b */
        public void a(a8.d dVar, lc.e eVar) throws IOException {
            eVar.b(f38243b, dVar.b());
            eVar.b(f38244c, dVar.a());
        }
    }

    /* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
    /* loaded from: classes2.dex */
    private static final class e implements lc.d<l> {

        /* renamed from: a  reason: collision with root package name */
        static final e f38245a = new e();

        /* renamed from: b  reason: collision with root package name */
        private static final lc.c f38246b = lc.c.d("clientMetrics");

        private e() {
        }

        @Override // lc.d
        /* renamed from: b */
        public void a(l lVar, lc.e eVar) throws IOException {
            eVar.b(f38246b, lVar.b());
        }
    }

    /* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
    /* loaded from: classes2.dex */
    private static final class f implements lc.d<a8.e> {

        /* renamed from: a  reason: collision with root package name */
        static final f f38247a = new f();

        /* renamed from: b  reason: collision with root package name */
        private static final lc.c f38248b = lc.c.a("currentCacheSizeBytes").b(oc.a.b().c(1).a()).a();

        /* renamed from: c  reason: collision with root package name */
        private static final lc.c f38249c = lc.c.a("maxCacheSizeBytes").b(oc.a.b().c(2).a()).a();

        private f() {
        }

        @Override // lc.d
        /* renamed from: b */
        public void a(a8.e eVar, lc.e eVar2) throws IOException {
            eVar2.d(f38248b, eVar.a());
            eVar2.d(f38249c, eVar.b());
        }
    }

    /* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
    /* loaded from: classes2.dex */
    private static final class g implements lc.d<a8.f> {

        /* renamed from: a  reason: collision with root package name */
        static final g f38250a = new g();

        /* renamed from: b  reason: collision with root package name */
        private static final lc.c f38251b = lc.c.a("startMs").b(oc.a.b().c(1).a()).a();

        /* renamed from: c  reason: collision with root package name */
        private static final lc.c f38252c = lc.c.a("endMs").b(oc.a.b().c(2).a()).a();

        private g() {
        }

        @Override // lc.d
        /* renamed from: b */
        public void a(a8.f fVar, lc.e eVar) throws IOException {
            eVar.d(f38251b, fVar.b());
            eVar.d(f38252c, fVar.a());
        }
    }

    private a() {
    }

    @Override // mc.a
    public void a(mc.b<?> bVar) {
        bVar.a(l.class, e.f38245a);
        bVar.a(a8.a.class, C0527a.f38232a);
        bVar.a(a8.f.class, g.f38250a);
        bVar.a(a8.d.class, d.f38242a);
        bVar.a(a8.c.class, c.f38239a);
        bVar.a(a8.b.class, b.f38237a);
        bVar.a(a8.e.class, f.f38247a);
    }
}
