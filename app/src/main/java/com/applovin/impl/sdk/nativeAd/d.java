package com.applovin.impl.sdk.nativeAd;

import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.v;
import com.applovin.mediation.MaxAdFormat;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d extends com.applovin.impl.sdk.e.a {

    /* renamed from: a  reason: collision with root package name */
    private final JSONObject f8600a;

    /* renamed from: c  reason: collision with root package name */
    private final AppLovinNativeAdLoadListener f8601c;

    public d(JSONObject jSONObject, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, m mVar) {
        super("TaskProcessNativeAdResponse", mVar);
        this.f8600a = jSONObject;
        this.f8601c = appLovinNativeAdLoadListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        JSONArray jSONArray = JsonUtils.getJSONArray(this.f8600a, "ads", new JSONArray());
        if (jSONArray.length() > 0) {
            if (v.a()) {
                a("Processing ad...");
            }
            this.f8349b.S().a((com.applovin.impl.sdk.e.a) new e(JsonUtils.getJSONObject(jSONArray, 0, new JSONObject()), this.f8600a, this.f8601c, this.f8349b));
            return;
        }
        if (v.a()) {
            c("No ads were returned from the server");
        }
        Utils.maybeHandleNoFillResponseForPublisher("native_native", MaxAdFormat.NATIVE, this.f8600a, this.f8349b);
        this.f8601c.onNativeAdLoadFailed(204);
    }
}
