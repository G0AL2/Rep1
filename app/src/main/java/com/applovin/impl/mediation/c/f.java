package com.applovin.impl.mediation.c;

import com.applovin.impl.sdk.e.w;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.v;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class f extends w {

    /* renamed from: a  reason: collision with root package name */
    private final com.applovin.impl.mediation.a.c f7414a;

    public f(com.applovin.impl.mediation.a.c cVar, m mVar) {
        super("TaskReportMaxReward", mVar);
        this.f7414a = cVar;
    }

    @Override // com.applovin.impl.sdk.e.y
    protected String a() {
        return "2.0/mcr";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.sdk.e.y
    public void a(int i10) {
        super.a(i10);
        if (v.a()) {
            a("Failed to report reward for mediated ad: " + this.f7414a + " - error code: " + i10);
        }
    }

    @Override // com.applovin.impl.sdk.e.y
    protected void a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, "ad_unit_id", this.f7414a.getAdUnitId());
        JsonUtils.putString(jSONObject, "placement", this.f7414a.getPlacement());
        JsonUtils.putString(jSONObject, "custom_data", this.f7414a.Z());
        String D = this.f7414a.D();
        if (!StringUtils.isValidString(D)) {
            D = "NO_MCODE";
        }
        JsonUtils.putString(jSONObject, "mcode", D);
        String C = this.f7414a.C();
        if (!StringUtils.isValidString(C)) {
            C = "NO_BCODE";
        }
        JsonUtils.putString(jSONObject, "bcode", C);
    }

    @Override // com.applovin.impl.sdk.e.w
    protected com.applovin.impl.sdk.b.c b() {
        return this.f7414a.G();
    }

    @Override // com.applovin.impl.sdk.e.w
    protected void b(JSONObject jSONObject) {
        a("Reported reward successfully for mediated ad: " + this.f7414a);
    }

    @Override // com.applovin.impl.sdk.e.w
    protected void c() {
        if (v.a()) {
            d("No reward result was found for mediated ad: " + this.f7414a);
        }
    }
}
