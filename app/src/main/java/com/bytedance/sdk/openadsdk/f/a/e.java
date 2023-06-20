package com.bytedance.sdk.openadsdk.f.a;

import com.bytedance.sdk.component.a.f;
import com.bytedance.sdk.component.a.r;
import com.bytedance.sdk.openadsdk.core.w;
import org.json.JSONObject;

/* compiled from: OldBridgeSyncMethod.java */
/* loaded from: classes.dex */
public class e extends com.bytedance.sdk.component.a.e<JSONObject, JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    private String f13247a;

    /* renamed from: b  reason: collision with root package name */
    private w f13248b;

    public e(String str, w wVar) {
        this.f13248b = wVar;
        this.f13247a = str;
    }

    public static void a(r rVar, w wVar) {
        rVar.a("appInfo", new e("appInfo", wVar));
        rVar.a("adInfo", new e("adInfo", wVar));
        rVar.a("sendLog", new e("sendLog", wVar));
        rVar.a("playable_style", new e("playable_style", wVar));
        rVar.a("getTemplateInfo", new e("getTemplateInfo", wVar));
        rVar.a("getTeMaiAds", new e("getTeMaiAds", wVar));
        rVar.a("isViewable", new e("isViewable", wVar));
        rVar.a("getScreenSize", new e("getScreenSize", wVar));
        rVar.a("getCloseButtonInfo", new e("getCloseButtonInfo", wVar));
        rVar.a("getVolume", new e("getVolume", wVar));
        rVar.a("removeLoading", new e("removeLoading", wVar));
        rVar.a("sendReward", new e("sendReward", wVar));
        rVar.a("subscribe_app_ad", new e("subscribe_app_ad", wVar));
        rVar.a("download_app_ad", new e("download_app_ad", wVar));
        rVar.a("cancel_download_app_ad", new e("cancel_download_app_ad", wVar));
        rVar.a("unsubscribe_app_ad", new e("unsubscribe_app_ad", wVar));
        rVar.a("landscape_click", new e("landscape_click", wVar));
        rVar.a("clickEvent", new e("clickEvent", wVar));
        rVar.a("renderDidFinish", new e("renderDidFinish", wVar));
        rVar.a("dynamicTrack", new e("dynamicTrack", wVar));
        rVar.a("skipVideo", new e("skipVideo", wVar));
        rVar.a("muteVideo", new e("muteVideo", wVar));
        rVar.a("changeVideoState", new e("changeVideoState", wVar));
        rVar.a("getCurrentVideoState", new e("getCurrentVideoState", wVar));
        rVar.a("send_temai_product_ids", new e("send_temai_product_ids", wVar));
        rVar.a("getMaterialMeta", new e("getMaterialMeta", wVar));
        rVar.a("endcard_load", new e("endcard_load", wVar));
        rVar.a("pauseWebView", new e("pauseWebView", wVar));
        rVar.a("pauseWebViewTimers", new e("pauseWebViewTimers", wVar));
        rVar.a("webview_time_track", new e("webview_time_track", wVar));
        rVar.a("openPrivacy", new e("openPrivacy", wVar));
        rVar.a("openAdLandPageLinks", new e("openAdLandPageLinks", wVar));
        rVar.a("getNativeSiteCustomData", new e("getNativeSiteCustomData", wVar));
        rVar.a("close", new e("close", wVar));
    }

    @Override // com.bytedance.sdk.component.a.e
    public JSONObject a(JSONObject jSONObject, f fVar) throws Exception {
        while (true) {
            char c10 = '^';
            char c11 = '}';
            while (true) {
                switch (c10) {
                    case '^':
                        c10 = '_';
                        c11 = '_';
                    case '_':
                        switch (c11) {
                            case '_':
                                w.a aVar = new w.a();
                                aVar.f13009a = "call";
                                aVar.f13011c = this.f13247a;
                                aVar.f13012d = jSONObject;
                                return this.f13248b.a(aVar, 3);
                            case '^':
                            case '`':
                                c10 = '_';
                                c11 = '_';
                        }
                        break;
                }
                switch (c11) {
                    case '7':
                    case '8':
                    case '9':
                        break;
                    default:
                        c10 = '_';
                        c11 = '_';
                }
            }
        }
    }
}
