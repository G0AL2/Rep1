package com.fyber.inneractive.sdk.external;

import android.text.TextUtils;
import com.amazon.device.ads.DtbDeviceDataRetriever;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.network.o;
import com.fyber.inneractive.sdk.network.q;
import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class BidTokenProvider {
    public static String getBidderToken() {
        boolean z10 = false;
        if (!InneractiveAdManager.wasInitialized()) {
            IAlog.b("BidTokenProvider: Cannot generate token. Please init Fyber Marketplace SDK.", new Object[0]);
            return null;
        }
        com.fyber.inneractive.sdk.bidder.a aVar = com.fyber.inneractive.sdk.bidder.a.f16741h;
        if (aVar.f16747f.get() == null) {
            aVar.a();
        } else {
            aVar.b();
        }
        String str = aVar.f16747f.get();
        IAConfigManager iAConfigManager = IAConfigManager.J;
        String str2 = iAConfigManager.f16877m;
        int i10 = 2000;
        if (TextUtils.isEmpty(str2)) {
            str2 = DtbDeviceDataRetriever.ORIENTATION_UNKNOWN;
        } else {
            i10 = iAConfigManager.f16886v.f16987b.a(aVar.f16746e.get(str2.toLowerCase()), 2000, 1);
        }
        if (str != null && str.getBytes().length > i10) {
            o oVar = o.TOKEN_EXCEEDS_LIMIT;
            q.a aVar2 = new q.a(null);
            aVar2.f17682b = oVar;
            aVar2.f17681a = null;
            aVar2.f17684d = null;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("mediator", str2);
            } catch (Exception unused) {
                IAlog.e("Got exception adding param to json object: %s, %s", "mediator", str2);
            }
            Integer valueOf = Integer.valueOf(str.getBytes().length);
            try {
                jSONObject.put("token_size", valueOf);
            } catch (Exception unused2) {
                IAlog.e("Got exception adding param to json object: %s, %s", "token_size", valueOf);
            }
            Integer valueOf2 = Integer.valueOf(i10);
            try {
                jSONObject.put("token_limit", valueOf2);
            } catch (Exception unused3) {
                IAlog.e("Got exception adding param to json object: %s, %s", "token_limit", valueOf2);
            }
            aVar2.f17686f.put(jSONObject);
            aVar2.a((String) null);
            z10 = true;
        }
        if (z10) {
            return null;
        }
        return str;
    }
}
