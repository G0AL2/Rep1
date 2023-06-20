package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.AppLovinUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class v extends w {

    /* renamed from: a  reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.e f8460a;

    public v(com.applovin.impl.sdk.ad.e eVar, com.applovin.impl.sdk.m mVar) {
        super("TaskReportAppLovinReward", mVar);
        this.f8460a = eVar;
    }

    @Override // com.applovin.impl.sdk.e.y
    protected String a() {
        return "2.0/cr";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.sdk.e.y
    public void a(int i10) {
        super.a(i10);
        if (com.applovin.impl.sdk.v.a()) {
            d("Failed to report reward for ad: " + this.f8460a + " - error code: " + i10);
        }
    }

    @Override // com.applovin.impl.sdk.e.y
    protected void a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, AppLovinUtils.ServerParameterKeys.ZONE_ID, this.f8460a.getAdZone().a());
        JsonUtils.putInt(jSONObject, "fire_percent", this.f8460a.ae());
        String clCode = this.f8460a.getClCode();
        if (!StringUtils.isValidString(clCode)) {
            clCode = "NO_CLCODE";
        }
        JsonUtils.putString(jSONObject, "clcode", clCode);
    }

    @Override // com.applovin.impl.sdk.e.w
    protected com.applovin.impl.sdk.b.c b() {
        return this.f8460a.aG();
    }

    @Override // com.applovin.impl.sdk.e.w
    protected void b(JSONObject jSONObject) {
        if (com.applovin.impl.sdk.v.a()) {
            a("Reported reward successfully for ad: " + this.f8460a);
        }
    }

    @Override // com.applovin.impl.sdk.e.w
    protected void c() {
        if (com.applovin.impl.sdk.v.a()) {
            d("No reward result was found for ad: " + this.f8460a);
        }
    }
}
