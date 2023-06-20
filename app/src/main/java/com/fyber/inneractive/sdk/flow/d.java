package com.fyber.inneractive.sdk.flow;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.network.q;
import com.fyber.inneractive.sdk.util.IAlog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d extends e implements IAConfigManager.OnConfigurationReadyAndValidListener {
    public void a(boolean z10) {
        g();
        com.fyber.inneractive.sdk.interfaces.a aVar = this.f17205c;
        if (aVar != null && z10) {
            aVar.a();
            this.f17205c = null;
        }
        b();
        this.f17206d = null;
    }

    @Override // com.fyber.inneractive.sdk.flow.e
    public String d() {
        return IAlog.a(this);
    }

    @Override // com.fyber.inneractive.sdk.flow.e
    public void e() {
        super.e();
        a(this.f17207e, c(), InneractiveErrorCode.IN_FLIGHT_TIMEOUT);
        g();
    }

    public void g() {
        IAConfigManager.removeListener(this);
        com.fyber.inneractive.sdk.network.n nVar = this.f17209g;
        if (nVar != null) {
            nVar.f17620e = true;
            nVar.f17618c = null;
            nVar.f17621f.f17549a = true;
            this.f17209g = null;
        }
        this.f17207e = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h() {
        /*
            Method dump skipped, instructions count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.flow.d.h():void");
    }

    @Override // com.fyber.inneractive.sdk.config.IAConfigManager.OnConfigurationReadyAndValidListener
    public void onConfigurationReadyAndValid(IAConfigManager iAConfigManager, boolean z10, Exception exc) {
        InneractiveErrorCode inneractiveErrorCode;
        IAConfigManager.removeListener(this);
        if (z10) {
            h();
            return;
        }
        InneractiveAdRequest inneractiveAdRequest = this.f17207e;
        com.fyber.inneractive.sdk.response.e c10 = c();
        if (exc instanceof com.fyber.inneractive.sdk.network.b) {
            inneractiveErrorCode = InneractiveErrorCode.CONNECTION_ERROR;
        } else {
            inneractiveErrorCode = InneractiveErrorCode.SDK_NOT_INITIALIZED_OR_CONFIG_ERROR;
        }
        a(inneractiveAdRequest, c10, inneractiveErrorCode);
    }

    public final void a(boolean z10, com.fyber.inneractive.sdk.response.e eVar) {
        String format;
        String spotId = this.f17207e.getSpotId();
        IAConfigManager iAConfigManager = IAConfigManager.J;
        String str = iAConfigManager.f16888x.f16932c.get("KEY_MISSMATCH_STATS_SPOTS");
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        if (str.contains(String.format("-%s-", spotId))) {
            return;
        }
        q.a aVar = new q.a(com.fyber.inneractive.sdk.network.o.MISSMATCH_SPOTID, this.f17207e, eVar, (JSONArray) null);
        if (z10) {
            format = String.format("There is no %s spot ID in current app config", spotId);
        } else {
            format = String.format("spot ID %s is not active in current app config", spotId);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(IronSourceConstants.EVENTS_ERROR_REASON, format);
        } catch (Exception unused) {
            IAlog.e("Got exception adding param to json object: %s, %s", IronSourceConstants.EVENTS_ERROR_REASON, format);
        }
        aVar.f17686f.put(jSONObject);
        aVar.a((String) null);
        iAConfigManager.f16888x.f16932c.put("KEY_MISSMATCH_STATS_SPOTS", String.format("%s -%s-", str, spotId));
    }
}
