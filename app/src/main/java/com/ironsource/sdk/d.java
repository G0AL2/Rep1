package com.ironsource.sdk;

import com.ironsource.sdk.g.d;
import com.vehiclecloud.app.videofetch.rnads.api.RNAdsEvents;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static String f28041a = "ManRewInst_";

    public static String a() {
        return String.valueOf(System.currentTimeMillis());
    }

    public static String a(b bVar) {
        return (bVar.a() ? d.e.Banner : bVar.f27606a ? d.e.RewardedVideo : d.e.Interstitial).toString();
    }

    public static String a(JSONObject jSONObject) {
        if (jSONObject.optBoolean(RNAdsEvents.EVENT_REWARDED)) {
            return f28041a + jSONObject.optString("name");
        }
        return jSONObject.optString("name");
    }
}
