package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinErrorCodes;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class p extends a implements AppLovinAdLoadListener {

    /* renamed from: a  reason: collision with root package name */
    private final JSONObject f8432a;

    /* renamed from: c  reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.d f8433c;

    /* renamed from: d  reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.b f8434d;

    /* renamed from: e  reason: collision with root package name */
    private final AppLovinAdLoadListener f8435e;

    public p(JSONObject jSONObject, com.applovin.impl.sdk.ad.d dVar, com.applovin.impl.sdk.ad.b bVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.m mVar) {
        super("TaskProcessAdResponse", mVar);
        if (jSONObject == null) {
            throw new IllegalArgumentException("No response specified");
        }
        if (dVar == null) {
            throw new IllegalArgumentException("No zone specified");
        }
        this.f8432a = jSONObject;
        this.f8433c = dVar;
        this.f8434d = bVar;
        this.f8435e = appLovinAdLoadListener;
    }

    private void a(JSONObject jSONObject) {
        a qVar;
        String string = JsonUtils.getString(jSONObject, "type", "undefined");
        if ("applovin".equalsIgnoreCase(string)) {
            if (com.applovin.impl.sdk.v.a()) {
                a("Starting task for AppLovin ad...");
            }
            qVar = new s(jSONObject, this.f8432a, this.f8434d, this, this.f8349b);
        } else if ("vast".equalsIgnoreCase(string)) {
            if (com.applovin.impl.sdk.v.a()) {
                a("Starting task for VAST ad...");
            }
            this.f8349b.S().a((a) r.a(jSONObject, this.f8432a, this.f8434d, this, this.f8349b));
            return;
        } else if (!"js_tag".equalsIgnoreCase(string)) {
            if (com.applovin.impl.sdk.v.a()) {
                c("Unable to process ad of unknown type: " + string);
            }
            failedToReceiveAd(AppLovinErrorCodes.INVALID_RESPONSE);
            return;
        } else {
            if (com.applovin.impl.sdk.v.a()) {
                a("Starting task for JS tag ad...");
            }
            qVar = new q(jSONObject, this.f8432a, this.f8434d, this, this.f8349b);
        }
        this.f8349b.S().a(qVar);
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(AppLovinAd appLovinAd) {
        AppLovinAdLoadListener appLovinAdLoadListener = this.f8435e;
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.adReceived(appLovinAd);
        }
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i10) {
        AppLovinAdLoadListener appLovinAdLoadListener = this.f8435e;
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.failedToReceiveAd(i10);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        JSONArray jSONArray = JsonUtils.getJSONArray(this.f8432a, "ads", new JSONArray());
        if (jSONArray.length() > 0) {
            if (com.applovin.impl.sdk.v.a()) {
                a("Processing ad...");
            }
            a(JsonUtils.getJSONObject(jSONArray, 0, new JSONObject()));
            return;
        }
        if (com.applovin.impl.sdk.v.a()) {
            c("No ads were returned from the server");
        }
        Utils.maybeHandleNoFillResponseForPublisher(this.f8433c.a(), this.f8433c.b(), this.f8432a, this.f8349b);
        failedToReceiveAd(204);
    }
}
