package com.applovin.impl.mediation.debugger.b.a;

import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private final String f7492a;

    /* renamed from: b  reason: collision with root package name */
    private final String f7493b;

    public e(JSONObject jSONObject, m mVar) {
        this.f7492a = JsonUtils.getString(jSONObject, "id", "");
        this.f7493b = JsonUtils.getString(jSONObject, InAppPurchaseMetaData.KEY_PRICE, null);
    }

    public String a() {
        return this.f7492a;
    }

    public String b() {
        return this.f7493b;
    }
}
