package com.bytedance.sdk.openadsdk.core;

import android.text.TextUtils;
import android.util.Pair;
import com.applovin.sdk.AppLovinErrorCodes;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.common.internal.ImagesContract;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: AdInfoFactory.java */
/* loaded from: classes.dex */
public class b {

    /* compiled from: AdInfoFactory.java */
    /* loaded from: classes.dex */
    static class a {
        a() {
        }

        public static a a() {
            return new a();
        }

        public a b(boolean z10) {
            if (z10) {
                a(301);
            }
            return this;
        }

        public a c(boolean z10) {
            if (z10) {
                a(IronSourceConstants.OFFERWALL_AVAILABLE);
            }
            return this;
        }

        public a d(boolean z10) {
            if (z10) {
                a(303);
            }
            return this;
        }

        public a e(boolean z10) {
            if (z10) {
                a(304);
            }
            return this;
        }

        public a f(boolean z10) {
            if (z10) {
                a(IronSourceConstants.OFFERWALL_OPENED);
            }
            return this;
        }

        public static boolean b(com.bytedance.sdk.openadsdk.core.e.n nVar) {
            try {
                return new JSONObject(nVar.G().g()).optInt("comment_num_i18n", -1) < 0;
            } catch (Exception unused) {
                return true;
            }
        }

        public a a(boolean z10) {
            if (z10) {
                a(ms.bd.o.Pgl.c.COLLECT_MODE_FINANCE);
            }
            return this;
        }

        private void a(final int i10) {
            m.i().a(new com.bytedance.sdk.openadsdk.h.a() { // from class: com.bytedance.sdk.openadsdk.core.b.a.1
                @Override // com.bytedance.sdk.openadsdk.h.a
                public com.bytedance.sdk.openadsdk.h.a.a a() throws Exception {
                    return com.bytedance.sdk.openadsdk.h.a.b.b().a("creative_error").b(i10).b(g.b(i10));
                }
            });
        }

        public static void a(com.bytedance.sdk.openadsdk.core.e.a aVar) {
            if (aVar == null || aVar.b() == null || aVar.b().isEmpty()) {
                return;
            }
            for (com.bytedance.sdk.openadsdk.core.e.n nVar : aVar.b()) {
                boolean z10 = false;
                a d10 = a().a(TextUtils.isEmpty(nVar.U())).b(TextUtils.isEmpty(nVar.V())).c(TextUtils.isEmpty(nVar.X())).f(nVar.M() == null || TextUtils.isEmpty(nVar.M().a())).d(nVar.aa() == null || nVar.aa().d() == -1.0d || a(nVar));
                if (nVar.aa() == null || nVar.aa().e() == -1 || b(nVar)) {
                    z10 = true;
                }
                d10.e(z10);
            }
        }

        public static boolean a(com.bytedance.sdk.openadsdk.core.e.n nVar) {
            double optDouble;
            try {
                optDouble = new JSONObject(nVar.G().g()).optDouble("score_exact_i18n", -1.0d);
            } catch (Exception unused) {
            }
            return optDouble < 0.0d || optDouble > 5.0d;
        }
    }

    private static int a(com.bytedance.sdk.openadsdk.core.e.c cVar) {
        if (cVar == null) {
            return TTAdConstant.DOWNLOAD_APP_INFO_CODE;
        }
        if (TextUtils.isEmpty(cVar.a())) {
            return TTAdConstant.DOWNLOAD_URL_CODE;
        }
        return 200;
    }

    private static int a(com.bytedance.sdk.openadsdk.core.e.h hVar) {
        if (hVar == null) {
            return 200;
        }
        if (TextUtils.isEmpty(hVar.a())) {
            return TTAdConstant.DEEPLINK_UNAVAILABLE_CODE;
        }
        if (TextUtils.isEmpty(hVar.b())) {
            return TTAdConstant.DEEPLINK_FALLBACK_CODE;
        }
        if (hVar.c() == 1 || hVar.c() == 2) {
            return 200;
        }
        return TTAdConstant.DEEPLINK_FALLBACK_TYPE_CODE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x008f, code lost:
        if (r0 != 50) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int a(com.bytedance.sdk.openadsdk.core.e.n r6) {
        /*
            r0 = 401(0x191, float:5.62E-43)
            if (r6 != 0) goto L5
            return r0
        L5:
            java.lang.String r1 = r6.Y()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto Lac
            java.lang.String r1 = r6.Y()
            int r1 = r1.length()
            r2 = 1
            if (r1 > r2) goto L1c
            goto Lac
        L1c:
            com.bytedance.sdk.openadsdk.core.e.h r1 = r6.ab()
            int r1 = a(r1)
            r2 = 200(0xc8, float:2.8E-43)
            if (r1 == r2) goto L29
            return r1
        L29:
            boolean r3 = r6.ay()
            if (r3 == 0) goto L46
            java.lang.String r3 = r6.az()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L46
            android.content.Context r1 = com.bytedance.sdk.openadsdk.core.m.a()
            r2 = 0
            java.lang.String r3 = "banner_ad"
            java.lang.String r4 = "load_html_fail"
            com.bytedance.sdk.openadsdk.b.e.b(r1, r6, r3, r4, r2)
            return r0
        L46:
            int r0 = r6.L()
            r3 = 4
            r4 = 3
            r5 = 2
            if (r0 == r5) goto L5f
            if (r0 == r4) goto L5f
            if (r0 == r3) goto L54
            goto L72
        L54:
            com.bytedance.sdk.openadsdk.core.e.c r0 = r6.aa()
            int r1 = a(r0)
            if (r1 == r2) goto L72
            return r1
        L5f:
            boolean r0 = b(r6)
            if (r0 == 0) goto L72
            java.lang.String r0 = r6.O()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L72
            r6 = 406(0x196, float:5.69E-43)
            return r6
        L72:
            boolean r0 = r6.aw()
            if (r0 != 0) goto Lab
            int r0 = r6.ad()
            if (r0 == r5) goto La1
            if (r0 == r4) goto La1
            if (r0 == r3) goto La1
            r3 = 5
            if (r0 == r3) goto L92
            r3 = 15
            if (r0 == r3) goto L92
            r3 = 16
            if (r0 == r3) goto La1
            r3 = 50
            if (r0 == r3) goto L92
            goto Lab
        L92:
            l3.b r0 = r6.J()
            boolean r6 = r6.aw()
            int r1 = a(r0, r6)
            if (r1 == r2) goto Lab
            return r1
        La1:
            java.util.List r6 = r6.P()
            int r1 = a(r6)
            if (r1 == r2) goto Lab
        Lab:
            return r1
        Lac:
            r6 = 402(0x192, float:5.63E-43)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.b.a(com.bytedance.sdk.openadsdk.core.e.n):int");
    }

    private static int a(List<com.bytedance.sdk.openadsdk.core.e.k> list) {
        if (list == null) {
            return TTAdConstant.IMAGE_LIST_CODE;
        }
        if (list.size() <= 0) {
            return TTAdConstant.IMAGE_LIST_SIZE_CODE;
        }
        for (com.bytedance.sdk.openadsdk.core.e.k kVar : list) {
            if (kVar == null) {
                return 411;
            }
            if (TextUtils.isEmpty(kVar.a())) {
                return 412;
            }
        }
        return 200;
    }

    private static int a(l3.b bVar, boolean z10) {
        if (bVar == null) {
            return TTAdConstant.VIDEO_INFO_CODE;
        }
        if (TextUtils.isEmpty(bVar.y())) {
            return TTAdConstant.VIDEO_URL_CODE;
        }
        if (z10 || !TextUtils.isEmpty(bVar.w())) {
            return 200;
        }
        return TTAdConstant.VIDEO_COVER_URL_CODE;
    }

    public static Pair<com.bytedance.sdk.openadsdk.core.e.a, ArrayList<Integer>> a(JSONObject jSONObject, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.e.o oVar) {
        if (jSONObject == null) {
            return null;
        }
        try {
            com.bytedance.sdk.openadsdk.core.e.a aVar = new com.bytedance.sdk.openadsdk.core.e.a();
            aVar.a(jSONObject.optString("request_id"));
            aVar.a(jSONObject.optInt("ret"));
            aVar.b(jSONObject.optString("message"));
            String optString = jSONObject.optString("auction_price");
            if (aVar.a() != 0) {
                return null;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("creatives");
            ArrayList arrayList = new ArrayList();
            if (optJSONArray != null) {
                for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                    com.bytedance.sdk.openadsdk.core.e.n b10 = b(optJSONArray.optJSONObject(i10), adSlot, oVar);
                    int a10 = a(b10);
                    if (a10 != 200) {
                        arrayList.add(Integer.valueOf(a10));
                    } else {
                        b10.c(optString);
                        aVar.a(b10);
                    }
                }
            }
            return new Pair<>(aVar, arrayList);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static com.bytedance.sdk.openadsdk.core.e.n a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return b(jSONObject, null, null);
    }

    private static com.bytedance.sdk.openadsdk.core.j.a a(String str, int i10) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int c10 = com.bytedance.sdk.openadsdk.utils.v.c(m.a());
        int d10 = com.bytedance.sdk.openadsdk.utils.v.d(m.a());
        if (i10 == 2) {
            d10 = c10;
            c10 = d10;
        }
        return new com.bytedance.sdk.openadsdk.core.j.a.a.d(m.a(), c10, d10).b(str, new ArrayList());
    }

    private static void a(com.bytedance.sdk.openadsdk.core.e.n nVar, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("reason_code", -1);
            com.bytedance.sdk.openadsdk.b.e.b(m.a(), nVar, str, "load_vast_fail", jSONObject);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private static void a(com.bytedance.sdk.openadsdk.core.e.n nVar, String str, com.bytedance.sdk.openadsdk.core.j.a aVar, long j10) {
        try {
            JSONObject jSONObject = new JSONObject();
            String str2 = "load_vast_fail";
            if (aVar != null) {
                if (!TextUtils.isEmpty(aVar.i()) && !TextUtils.isEmpty(aVar.f()) && aVar.h() > 0.0d) {
                    jSONObject.put("duration", System.currentTimeMillis() - j10);
                    str2 = "load_vast_success";
                }
                jSONObject.put("reason_code", -3);
            } else {
                jSONObject.put("reason_code", -2);
                jSONObject.put("error_code", com.bytedance.sdk.openadsdk.core.j.a.b.f12413e);
            }
            com.bytedance.sdk.openadsdk.b.e.b(m.a(), nVar, str, str2, jSONObject);
        } catch (Exception unused) {
        }
    }

    private static void a(com.bytedance.sdk.openadsdk.core.j.a aVar, com.bytedance.sdk.openadsdk.core.e.n nVar) {
        aVar.a(nVar);
        int L = nVar.L();
        if (L != 2 && L != 3) {
            nVar.r(2);
        }
        nVar.d(1);
        nVar.c(true);
        nVar.a(aVar);
        if (!TextUtils.isEmpty(aVar.d())) {
            nVar.h(aVar.d());
        }
        if (!TextUtils.isEmpty(aVar.e())) {
            nVar.i(aVar.e());
        }
        nVar.f(aVar.f());
        com.bytedance.sdk.openadsdk.core.e.k kVar = null;
        nVar.a((com.bytedance.sdk.openadsdk.core.e.c) null);
        l3.b J = nVar.J();
        if (J == null) {
            J = new l3.b();
        }
        J.k(aVar.g());
        J.b(aVar.h());
        J.h(null);
        J.n(null);
        nVar.a(J);
        if (aVar.b() != null) {
            kVar = new com.bytedance.sdk.openadsdk.core.e.k();
            kVar.a(aVar.b().e());
            kVar.a(aVar.b().b());
            kVar.b(aVar.b().c());
        }
        nVar.a(kVar);
    }

    private static com.bytedance.sdk.openadsdk.core.e.d b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int optInt = jSONObject.optInt("splash_clickarea", 2);
        int optInt2 = jSONObject.optInt("splash_layout_id", 1);
        com.bytedance.sdk.openadsdk.core.e.d dVar = new com.bytedance.sdk.openadsdk.core.e.d();
        dVar.a(optInt);
        dVar.b(optInt2);
        return dVar;
    }

    public static com.bytedance.sdk.openadsdk.core.e.n b(JSONObject jSONObject, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.e.o oVar) {
        com.bytedance.sdk.openadsdk.core.j.a a10;
        if (jSONObject == null) {
            return null;
        }
        com.bytedance.sdk.openadsdk.core.e.n nVar = new com.bytedance.sdk.openadsdk.core.e.n();
        nVar.r(jSONObject.optInt("interaction_type"));
        nVar.f(jSONObject.optString("target_url"));
        nVar.k(jSONObject.optString("ad_id"));
        nVar.l(jSONObject.optString("app_log_url"));
        nVar.e(jSONObject.optString("source"));
        nVar.v(jSONObject.optInt("dislike_control", 0));
        nVar.m(jSONObject.optInt("play_bar_show_time", AppLovinErrorCodes.UNABLE_TO_PRECACHE_RESOURCES));
        nVar.n(jSONObject.optString("gecko_id"));
        if (jSONObject.has("set_click_type")) {
            JSONObject optJSONObject = jSONObject.optJSONObject("set_click_type");
            nVar.b(optJSONObject.optDouble("cta", 2.0d));
            nVar.a(optJSONObject.optDouble(InneractiveMediationNameConsts.OTHER, 1.0d));
        }
        nVar.c(jSONObject.optJSONObject("extension"));
        JSONObject optJSONObject2 = jSONObject.optJSONObject("icon");
        nVar.b(jSONObject.optBoolean("screenshot", false));
        nVar.k(jSONObject.optInt("play_bar_style", 0));
        nVar.o(jSONObject.optString("market_url", ""));
        nVar.i(jSONObject.optInt("video_adaptation", 0));
        nVar.f(jSONObject.optInt("feed_video_opentype", 0));
        nVar.a(jSONObject.optJSONObject("session_params"));
        nVar.c(jSONObject.optString("auction_price", ""));
        JSONObject optJSONObject3 = jSONObject.optJSONObject("render");
        if (optJSONObject3 != null) {
            nVar.g(optJSONObject3.optInt("render_sequence", 0));
            nVar.h(optJSONObject3.optInt("backup_render_control", 1));
        }
        nVar.d(jSONObject.optInt("render_control", oVar != null ? oVar.f12204f : 1));
        if (optJSONObject2 != null) {
            com.bytedance.sdk.openadsdk.core.e.k kVar = new com.bytedance.sdk.openadsdk.core.e.k();
            kVar.a(optJSONObject2.optString(ImagesContract.URL));
            kVar.b(optJSONObject2.optInt("height"));
            kVar.a(optJSONObject2.optInt("width"));
            nVar.a(kVar);
        }
        JSONObject optJSONObject4 = jSONObject.optJSONObject("reward_data");
        if (optJSONObject4 != null) {
            nVar.c(optJSONObject4.optInt("reward_amount", 0));
            nVar.a(optJSONObject4.optString("reward_name", ""));
        }
        JSONObject optJSONObject5 = jSONObject.optJSONObject("cover_image");
        if (optJSONObject5 != null) {
            com.bytedance.sdk.openadsdk.core.e.k kVar2 = new com.bytedance.sdk.openadsdk.core.e.k();
            kVar2.a(optJSONObject5.optString(ImagesContract.URL));
            kVar2.b(optJSONObject5.optInt("height"));
            kVar2.a(optJSONObject5.optInt("width"));
            nVar.b(kVar2);
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("image");
        if (optJSONArray != null) {
            for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                com.bytedance.sdk.openadsdk.core.e.k kVar3 = new com.bytedance.sdk.openadsdk.core.e.k();
                JSONObject optJSONObject6 = optJSONArray.optJSONObject(i10);
                kVar3.a(optJSONObject6.optString(ImagesContract.URL));
                kVar3.b(optJSONObject6.optInt("height"));
                kVar3.a(optJSONObject6.optInt("width"));
                kVar3.a(optJSONObject6.optBoolean("image_preview"));
                kVar3.b(optJSONObject6.optString("image_key"));
                nVar.c(kVar3);
            }
        }
        JSONArray optJSONArray2 = jSONObject.optJSONArray("show_url");
        if (optJSONArray2 != null) {
            for (int i11 = 0; i11 < optJSONArray2.length(); i11++) {
                nVar.R().add(optJSONArray2.optString(i11));
            }
        }
        JSONArray optJSONArray3 = jSONObject.optJSONArray("click_url");
        if (optJSONArray3 != null) {
            for (int i12 = 0; i12 < optJSONArray3.length(); i12++) {
                nVar.S().add(optJSONArray3.optString(i12));
            }
        }
        JSONArray optJSONArray4 = jSONObject.optJSONArray("play_start");
        if (optJSONArray4 != null) {
            for (int i13 = 0; i13 < optJSONArray4.length(); i13++) {
                nVar.T().add(optJSONArray4.optString(i13));
            }
        }
        JSONObject optJSONObject7 = jSONObject.optJSONObject("click_area");
        if (optJSONObject7 != null) {
            com.bytedance.sdk.openadsdk.core.e.f fVar = new com.bytedance.sdk.openadsdk.core.e.f();
            fVar.f12033a = optJSONObject7.optBoolean("click_upper_content_area", true);
            fVar.f12034b = optJSONObject7.optBoolean("click_upper_non_content_area", true);
            fVar.f12035c = optJSONObject7.optBoolean("click_lower_content_area", true);
            fVar.f12036d = optJSONObject7.optBoolean("click_lower_non_content_area", true);
            fVar.f12037e = optJSONObject7.optBoolean("click_button_area", true);
            fVar.f12038f = optJSONObject7.optBoolean("click_video_area", true);
            nVar.a(fVar);
        }
        JSONObject optJSONObject8 = jSONObject.optJSONObject("adslot");
        if (optJSONObject8 != null) {
            adSlot = c(optJSONObject8);
        }
        nVar.a(adSlot);
        nVar.l(jSONObject.optInt("intercept_flag", 0));
        nVar.g(jSONObject.optString("phone_num"));
        nVar.h(jSONObject.optString("title"));
        nVar.i(jSONObject.optString("description"));
        nVar.j(jSONObject.optString("button_text"));
        nVar.j(jSONObject.optInt("ad_logo", 1));
        nVar.m(jSONObject.optString("ext"));
        nVar.p(jSONObject.optInt("cover_click_area", 0));
        nVar.s(jSONObject.optInt("image_mode"));
        nVar.u(jSONObject.optInt(AdUnitActivity.EXTRA_ORIENTATION, 1));
        nVar.a((float) jSONObject.optDouble("aspect_ratio", 100.0d));
        nVar.p(jSONObject.optInt("cover_click_area", 0));
        JSONObject optJSONObject9 = jSONObject.optJSONObject("app");
        JSONObject optJSONObject10 = jSONObject.optJSONObject("deep_link");
        nVar.a(e(optJSONObject9));
        nVar.a(f(jSONObject.optJSONObject("interaction_method_params")));
        nVar.a(h(optJSONObject10));
        nVar.a(new com.bytedance.sdk.openadsdk.core.e.p(jSONObject));
        JSONArray optJSONArray5 = jSONObject.optJSONArray("filter_words");
        if (optJSONArray5 != null) {
            for (int i14 = 0; i14 < optJSONArray5.length(); i14++) {
                FilterWord d10 = d(optJSONArray5.optJSONObject(i14));
                if (d10 != null && d10.isValid()) {
                    nVar.a(d10);
                }
            }
        }
        nVar.t(jSONObject.optInt("count_down"));
        nVar.a(jSONObject.optLong("expiration_time"));
        nVar.B(jSONObject.optInt("video_encode_type", 0));
        nVar.A(jSONObject.optInt("player_type", 0));
        JSONObject optJSONObject11 = jSONObject.optJSONObject(DownloadResource.TYPE_VIDEO);
        if (optJSONObject11 != null) {
            nVar.a(i(optJSONObject11));
        }
        JSONObject optJSONObject12 = jSONObject.optJSONObject("h265_video");
        if (optJSONObject12 != null) {
            nVar.b(i(optJSONObject12));
        }
        JSONObject optJSONObject13 = jSONObject.optJSONObject("download_conf");
        if (optJSONObject13 != null) {
            nVar.a(g(optJSONObject13));
        }
        nVar.a(j(jSONObject.optJSONObject("media_ext")));
        JSONObject optJSONObject14 = jSONObject.optJSONObject("tpl_info");
        if (optJSONObject14 != null) {
            n.a aVar = new n.a();
            aVar.b(optJSONObject14.optString("id"));
            aVar.c(optJSONObject14.optString("md5"));
            aVar.d(optJSONObject14.optString(ImagesContract.URL));
            aVar.e(optJSONObject14.optString("data"));
            aVar.f(optJSONObject14.optString("diff_data"));
            aVar.g(optJSONObject14.optString("dynamic_creative"));
            aVar.a(optJSONObject14.optString(MediationMetaData.KEY_VERSION));
            nVar.a(aVar);
        }
        nVar.d(jSONObject.optString("creative_extra"));
        nVar.e(jSONObject.optInt("if_block_lp", 0));
        nVar.n(jSONObject.optInt("cache_sort", 1));
        nVar.o(jSONObject.optInt("if_sp_cache", 0));
        JSONObject optJSONObject15 = jSONObject.optJSONObject("splash_control");
        if (optJSONObject15 != null) {
            nVar.a(b(optJSONObject15));
        }
        nVar.w(jSONObject.optInt("is_package_open", 1));
        nVar.b(jSONObject.optString("ad_info", null));
        nVar.q(jSONObject.optInt("ua_policy", 2));
        nVar.x(jSONObject.optInt("playable_duration_time", 20));
        nVar.y(jSONObject.optInt("playable_endcard_close_time", -1));
        nVar.z(jSONObject.optInt("endcard_close_time", -1));
        nVar.a(jSONObject.optInt("interaction_method"));
        nVar.d(jSONObject.optBoolean("is_html"));
        nVar.p(jSONObject.optString("dsp_html"));
        if (jSONObject.optBoolean("is_vast", false)) {
            if (jSONObject.has("vast_json")) {
                a10 = com.bytedance.sdk.openadsdk.core.j.a.a(jSONObject.optJSONObject("vast_json"));
            } else {
                String b10 = com.bytedance.sdk.openadsdk.utils.u.b(com.bytedance.sdk.openadsdk.utils.u.e(nVar));
                String optString = jSONObject.optString("dsp_vast");
                if (TextUtils.isEmpty(optString)) {
                    a(nVar, b10);
                    return null;
                }
                long currentTimeMillis = System.currentTimeMillis();
                a10 = a(optString, nVar.am());
                a(nVar, b10, a10, currentTimeMillis);
                if (a10 != null) {
                    a10.f(b10);
                }
            }
            if (a10 == null) {
                return null;
            }
            a(a10, nVar);
        }
        return nVar;
    }

    private static boolean b(com.bytedance.sdk.openadsdk.core.e.n nVar) {
        return (nVar.aw() || nVar.ay()) ? false : true;
    }

    private static AdSlot c(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("mCodeId", "");
        int optInt = jSONObject.optInt("mImgAcceptedWidth", 0);
        int optInt2 = jSONObject.optInt("mImgAcceptedHeight", 0);
        int optInt3 = jSONObject.optInt("mAdCount", 6);
        boolean optBoolean = jSONObject.optBoolean("mSupportDeepLink", true);
        String optString2 = jSONObject.optString("mRewardName", "");
        int optInt4 = jSONObject.optInt("mRewardAmount", 0);
        String optString3 = jSONObject.optString("mMediaExtra", "");
        String optString4 = jSONObject.optString("mUserID", "");
        jSONObject.optInt("mOrientation", 2);
        int optInt5 = jSONObject.optInt("mNativeAdType", 0);
        boolean optBoolean2 = jSONObject.optBoolean("mIsAutoPlay", false);
        boolean optBoolean3 = jSONObject.optBoolean("mIsExpressAd", false);
        return new AdSlot.Builder().setCodeId(optString).setImageAcceptedSize(optInt, optInt2).setExpressViewAcceptedSize((float) jSONObject.optDouble("mExpressViewAcceptedWidth", 0.0d), (float) jSONObject.optDouble("mExpressViewAcceptedHeight", 0.0d)).setAdCount(optInt3).setSupportDeepLink(optBoolean).setRewardName(optString2).setRewardAmount(optInt4).setMediaExtra(optString3).setUserID(optString4).setNativeAdType(optInt5).setIsAutoPlay(optBoolean2).isExpressAd(optBoolean3).withBid(jSONObject.optString("mBidAdm", "")).build();
    }

    private static FilterWord d(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            FilterWord filterWord = new FilterWord();
            filterWord.setId(jSONObject.optString("id"));
            filterWord.setName(jSONObject.optString("name"));
            filterWord.setIsSelected(jSONObject.optBoolean("is_selected"));
            JSONArray optJSONArray = jSONObject.optJSONArray("options");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                    FilterWord d10 = d(optJSONArray.optJSONObject(i10));
                    if (d10 != null && d10.isValid()) {
                        filterWord.addOption(d10);
                    }
                }
            }
            return filterWord;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static com.bytedance.sdk.openadsdk.core.e.c e(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        com.bytedance.sdk.openadsdk.core.e.c cVar = new com.bytedance.sdk.openadsdk.core.e.c();
        cVar.b(jSONObject.optString("app_name"));
        cVar.c(jSONObject.optString("package_name"));
        cVar.a(jSONObject.optString("download_url"));
        cVar.a(jSONObject.optDouble("score", -1.0d));
        cVar.a(jSONObject.optInt("comment_num", -1));
        cVar.b(jSONObject.optInt("app_size", 0));
        return cVar;
    }

    private static com.bytedance.sdk.openadsdk.core.e.m f(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.e.m mVar = new com.bytedance.sdk.openadsdk.core.e.m();
        if (jSONObject == null) {
            mVar.a(10L);
            mVar.b(20L);
            mVar.a("");
            return mVar;
        }
        mVar.a(jSONObject.optLong("onlylp_loading_maxtime", 10L));
        mVar.b(jSONObject.optLong("straight_lp_showtime", 20L));
        mVar.a(jSONObject.optString("loading_text", ""));
        return mVar;
    }

    private static com.bytedance.sdk.openadsdk.core.e.i g(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        com.bytedance.sdk.openadsdk.core.e.i iVar = new com.bytedance.sdk.openadsdk.core.e.i();
        iVar.a(jSONObject.optInt("if_send_click", 0));
        return iVar;
    }

    private static com.bytedance.sdk.openadsdk.core.e.h h(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        com.bytedance.sdk.openadsdk.core.e.h hVar = new com.bytedance.sdk.openadsdk.core.e.h();
        hVar.a(jSONObject.optString("deeplink_url"));
        hVar.b(jSONObject.optString("fallback_url"));
        hVar.a(jSONObject.optInt("fallback_type"));
        return hVar;
    }

    private static l3.b i(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        l3.b bVar = new l3.b();
        bVar.g(jSONObject.optInt("cover_height"));
        bVar.j(jSONObject.optInt("cover_width"));
        bVar.e(jSONObject.optString("resolution"));
        bVar.d(jSONObject.optLong("size"));
        bVar.b(jSONObject.optDouble("video_duration", 0.0d));
        bVar.h(jSONObject.optString("cover_url"));
        bVar.k(jSONObject.optString(InneractiveRichMediaVideoPlayerActivityCore.VIDEO_URL));
        bVar.n(jSONObject.optString("endcard"));
        bVar.q(jSONObject.optString("playable_download_url"));
        bVar.t(jSONObject.optString("file_hash"));
        bVar.x(jSONObject.optInt("if_playable_loading_show", 0));
        bVar.z(jSONObject.optInt("remove_loading_page_type", 0));
        bVar.c(jSONObject.optInt("fallback_endcard_judge", 0));
        bVar.p(jSONObject.optInt("video_preload_size", 307200));
        bVar.s(jSONObject.optInt("reward_video_cached_type", 0));
        bVar.v(jSONObject.optInt("execute_cached_type", 0));
        bVar.m(jSONObject.optDouble("endcard_render", 0.0d) == 1.0d ? 1 : 0);
        return bVar;
    }

    private static Map<String, Object> j(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (!TextUtils.isEmpty(next)) {
                hashMap.put(next, jSONObject.opt(next));
            }
        }
        return hashMap;
    }
}
