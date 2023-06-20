package com.ironsource.sdk.a;

import com.ironsource.sdk.g.d;
import com.vehiclecloud.app.videofetch.rnads.api.RNAdsEvents;
import java.util.Map;

/* loaded from: classes3.dex */
public class e {
    public e() {
        new com.ironsource.mediationsdk.adunit.a.a();
    }

    public static d.e a(com.ironsource.sdk.g.c cVar, d.e eVar) {
        Map<String, String> map;
        return (cVar == null || (map = cVar.f28145d) == null || map.get(RNAdsEvents.EVENT_REWARDED) == null) ? eVar : Boolean.parseBoolean(cVar.f28145d.get(RNAdsEvents.EVENT_REWARDED)) ? d.e.RewardedVideo : d.e.Interstitial;
    }

    public static boolean a(com.ironsource.sdk.g.c cVar) {
        if (cVar == null || cVar.f28145d.get("inAppBidding") == null) {
            return false;
        }
        return Boolean.parseBoolean(cVar.f28145d.get("inAppBidding"));
    }

    public void a(int i10) {
        com.ironsource.mediationsdk.adunit.a.a.a("sdia", Integer.valueOf(i10));
    }

    public void b(int i10) {
        com.ironsource.mediationsdk.adunit.a.a.a("sdra", Integer.valueOf(i10));
    }

    public void c(int i10) {
        com.ironsource.mediationsdk.adunit.a.a.a("sdba", Integer.valueOf(i10));
    }
}
