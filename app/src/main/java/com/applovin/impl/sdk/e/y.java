package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.network.b;
import com.applovin.impl.sdk.network.c;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class y extends a {
    /* JADX INFO: Access modifiers changed from: protected */
    public y(String str, com.applovin.impl.sdk.m mVar) {
        super(str, mVar);
    }

    protected abstract String a();

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(int i10) {
        com.applovin.impl.sdk.utils.h.a(i10, this.f8349b);
    }

    protected abstract void a(JSONObject jSONObject);

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(JSONObject jSONObject, final b.c<JSONObject> cVar) {
        u<JSONObject> uVar = new u<JSONObject>(com.applovin.impl.sdk.network.c.a(this.f8349b).a(com.applovin.impl.sdk.utils.h.a(a(), this.f8349b)).c(com.applovin.impl.sdk.utils.h.b(a(), this.f8349b)).a(com.applovin.impl.sdk.utils.h.e(this.f8349b)).b("POST").a(jSONObject).d(((Boolean) this.f8349b.a(com.applovin.impl.sdk.c.b.eA)).booleanValue()).a((c.a) new JSONObject()).a(h()).a(), this.f8349b) { // from class: com.applovin.impl.sdk.e.y.1
            @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
            public void a(int i10, String str, JSONObject jSONObject2) {
                cVar.a(i10, str, jSONObject2);
            }

            @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
            public void a(JSONObject jSONObject2, int i10) {
                cVar.a(jSONObject2, i10);
            }
        };
        uVar.a(com.applovin.impl.sdk.c.b.aT);
        uVar.b(com.applovin.impl.sdk.c.b.aU);
        this.f8349b.S().a((a) uVar);
    }

    protected abstract int h();

    /* JADX INFO: Access modifiers changed from: protected */
    public JSONObject i() {
        JSONObject jSONObject = new JSONObject();
        String m10 = this.f8349b.m();
        if (((Boolean) this.f8349b.a(com.applovin.impl.sdk.c.b.ds)).booleanValue() && StringUtils.isValidString(m10)) {
            JsonUtils.putString(jSONObject, "cuid", m10);
        }
        if (((Boolean) this.f8349b.a(com.applovin.impl.sdk.c.b.du)).booleanValue()) {
            JsonUtils.putString(jSONObject, "compass_random_token", this.f8349b.n());
        }
        if (((Boolean) this.f8349b.a(com.applovin.impl.sdk.c.b.dw)).booleanValue()) {
            JsonUtils.putString(jSONObject, "applovin_random_token", this.f8349b.o());
        }
        a(jSONObject);
        return jSONObject;
    }
}
