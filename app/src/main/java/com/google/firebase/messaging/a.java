package com.google.firebase.messaging;

import com.ironsource.mediationsdk.impressionData.ImpressionData;
import java.io.IOException;

/* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
/* loaded from: classes3.dex */
public final class a implements mc.a {

    /* renamed from: a  reason: collision with root package name */
    public static final mc.a f23438a = new a();

    /* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
    /* renamed from: com.google.firebase.messaging.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    private static final class C0308a implements lc.d<ad.a> {

        /* renamed from: a  reason: collision with root package name */
        static final C0308a f23439a = new C0308a();

        /* renamed from: b  reason: collision with root package name */
        private static final lc.c f23440b = lc.c.a("projectNumber").b(oc.a.b().c(1).a()).a();

        /* renamed from: c  reason: collision with root package name */
        private static final lc.c f23441c = lc.c.a("messageId").b(oc.a.b().c(2).a()).a();

        /* renamed from: d  reason: collision with root package name */
        private static final lc.c f23442d = lc.c.a(ImpressionData.IMPRESSION_DATA_KEY_INSTANCE_ID).b(oc.a.b().c(3).a()).a();

        /* renamed from: e  reason: collision with root package name */
        private static final lc.c f23443e = lc.c.a("messageType").b(oc.a.b().c(4).a()).a();

        /* renamed from: f  reason: collision with root package name */
        private static final lc.c f23444f = lc.c.a("sdkPlatform").b(oc.a.b().c(5).a()).a();

        /* renamed from: g  reason: collision with root package name */
        private static final lc.c f23445g = lc.c.a("packageName").b(oc.a.b().c(6).a()).a();

        /* renamed from: h  reason: collision with root package name */
        private static final lc.c f23446h = lc.c.a("collapseKey").b(oc.a.b().c(7).a()).a();

        /* renamed from: i  reason: collision with root package name */
        private static final lc.c f23447i = lc.c.a("priority").b(oc.a.b().c(8).a()).a();

        /* renamed from: j  reason: collision with root package name */
        private static final lc.c f23448j = lc.c.a("ttl").b(oc.a.b().c(9).a()).a();

        /* renamed from: k  reason: collision with root package name */
        private static final lc.c f23449k = lc.c.a("topic").b(oc.a.b().c(10).a()).a();

        /* renamed from: l  reason: collision with root package name */
        private static final lc.c f23450l = lc.c.a("bulkId").b(oc.a.b().c(11).a()).a();

        /* renamed from: m  reason: collision with root package name */
        private static final lc.c f23451m = lc.c.a("event").b(oc.a.b().c(12).a()).a();

        /* renamed from: n  reason: collision with root package name */
        private static final lc.c f23452n = lc.c.a("analyticsLabel").b(oc.a.b().c(13).a()).a();

        /* renamed from: o  reason: collision with root package name */
        private static final lc.c f23453o = lc.c.a("campaignId").b(oc.a.b().c(14).a()).a();

        /* renamed from: p  reason: collision with root package name */
        private static final lc.c f23454p = lc.c.a("composerLabel").b(oc.a.b().c(15).a()).a();

        private C0308a() {
        }

        @Override // lc.d
        /* renamed from: b */
        public void a(ad.a aVar, lc.e eVar) throws IOException {
            eVar.d(f23440b, aVar.l());
            eVar.b(f23441c, aVar.h());
            eVar.b(f23442d, aVar.g());
            eVar.b(f23443e, aVar.i());
            eVar.b(f23444f, aVar.m());
            eVar.b(f23445g, aVar.j());
            eVar.b(f23446h, aVar.d());
            eVar.e(f23447i, aVar.k());
            eVar.e(f23448j, aVar.o());
            eVar.b(f23449k, aVar.n());
            eVar.d(f23450l, aVar.b());
            eVar.b(f23451m, aVar.f());
            eVar.b(f23452n, aVar.a());
            eVar.d(f23453o, aVar.c());
            eVar.b(f23454p, aVar.e());
        }
    }

    /* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
    /* loaded from: classes3.dex */
    private static final class b implements lc.d<ad.b> {

        /* renamed from: a  reason: collision with root package name */
        static final b f23455a = new b();

        /* renamed from: b  reason: collision with root package name */
        private static final lc.c f23456b = lc.c.a("messagingClientEvent").b(oc.a.b().c(1).a()).a();

        private b() {
        }

        @Override // lc.d
        /* renamed from: b */
        public void a(ad.b bVar, lc.e eVar) throws IOException {
            eVar.b(f23456b, bVar.a());
        }
    }

    /* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
    /* loaded from: classes3.dex */
    private static final class c implements lc.d<i0> {

        /* renamed from: a  reason: collision with root package name */
        static final c f23457a = new c();

        /* renamed from: b  reason: collision with root package name */
        private static final lc.c f23458b = lc.c.d("messagingClientEventExtension");

        private c() {
        }

        @Override // lc.d
        /* renamed from: b */
        public void a(i0 i0Var, lc.e eVar) throws IOException {
            eVar.b(f23458b, i0Var.b());
        }
    }

    private a() {
    }

    @Override // mc.a
    public void a(mc.b<?> bVar) {
        bVar.a(i0.class, c.f23457a);
        bVar.a(ad.b.class, b.f23455a);
        bVar.a(ad.a.class, C0308a.f23439a);
    }
}
