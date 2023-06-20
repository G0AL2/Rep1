package com.applovin.impl.mediation.c;

import com.applovin.impl.sdk.e.ab;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class g extends ab {

    /* renamed from: a  reason: collision with root package name */
    private final com.applovin.impl.mediation.a.c f7415a;

    public g(com.applovin.impl.mediation.a.c cVar, m mVar) {
        super("TaskValidateMaxReward", mVar);
        this.f7415a = cVar;
    }

    @Override // com.applovin.impl.sdk.e.y
    protected String a() {
        return "2.0/mvr";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.sdk.e.y
    public void a(int i10) {
        super.a(i10);
        this.f7415a.a(com.applovin.impl.sdk.b.c.a((i10 < 400 || i10 >= 500) ? "network_timeout" : "rejected"));
    }

    @Override // com.applovin.impl.sdk.e.ab
    protected void a(com.applovin.impl.sdk.b.c cVar) {
        this.f7415a.a(cVar);
    }

    @Override // com.applovin.impl.sdk.e.y
    protected void a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, "ad_unit_id", this.f7415a.getAdUnitId());
        JsonUtils.putString(jSONObject, "placement", this.f7415a.getPlacement());
        JsonUtils.putString(jSONObject, "custom_data", this.f7415a.Z());
        JsonUtils.putString(jSONObject, "ad_format", this.f7415a.getFormat().getLabel());
        String D = this.f7415a.D();
        if (!StringUtils.isValidString(D)) {
            D = "NO_MCODE";
        }
        JsonUtils.putString(jSONObject, "mcode", D);
        String C = this.f7415a.C();
        if (!StringUtils.isValidString(C)) {
            C = "NO_BCODE";
        }
        JsonUtils.putString(jSONObject, "bcode", C);
    }

    @Override // com.applovin.impl.sdk.e.ab
    protected boolean b() {
        return this.f7415a.E();
    }
}
