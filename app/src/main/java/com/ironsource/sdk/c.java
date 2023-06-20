package com.ironsource.sdk;

import com.ironsource.sdk.utils.SDKUtils;
import com.vehiclecloud.app.videofetch.rnads.api.RNAdsEvents;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public boolean f27629a = false;

    /* renamed from: b  reason: collision with root package name */
    public boolean f27630b = false;

    /* renamed from: c  reason: collision with root package name */
    public a f27631c = null;

    /* renamed from: d  reason: collision with root package name */
    public Map<String, String> f27632d;

    /* renamed from: e  reason: collision with root package name */
    private String f27633e;

    /* renamed from: f  reason: collision with root package name */
    private final com.ironsource.sdk.j.a f27634f;

    public c(String str, com.ironsource.sdk.j.a aVar) {
        this.f27633e = SDKUtils.requireNonEmptyOrNull(str, "Instance name can't be null");
        this.f27634f = (com.ironsource.sdk.j.a) SDKUtils.requireNonNull(aVar, "AdListener name can't be null");
    }

    public final b a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", this.f27633e);
            jSONObject.put(RNAdsEvents.EVENT_REWARDED, this.f27629a);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        return new b(this.f27630b ? d.a() : d.a(jSONObject), this.f27633e, this.f27629a, this.f27630b, this.f27632d, this.f27634f, this.f27631c);
    }
}
