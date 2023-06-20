package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.network.b;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class ab extends y {
    /* JADX INFO: Access modifiers changed from: protected */
    public ab(String str, com.applovin.impl.sdk.m mVar) {
        super(str, mVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(JSONObject jSONObject) {
        com.applovin.impl.sdk.b.c c10 = c(jSONObject);
        if (c10 == null) {
            return;
        }
        a(c10);
        if (com.applovin.impl.sdk.v.a()) {
            a("Pending reward handled: " + c10);
        }
    }

    private com.applovin.impl.sdk.b.c c(JSONObject jSONObject) {
        String str;
        try {
            JSONObject a10 = com.applovin.impl.sdk.utils.h.a(jSONObject);
            com.applovin.impl.sdk.utils.h.d(a10, this.f8349b);
            com.applovin.impl.sdk.utils.h.c(jSONObject, this.f8349b);
            com.applovin.impl.sdk.utils.h.e(jSONObject, this.f8349b);
            Map<String, String> stringMap = JsonUtils.toStringMap((JSONObject) a10.get("params"));
            try {
                str = a10.getString(IronSourceConstants.EVENTS_RESULT);
            } catch (Throwable unused) {
                str = "network_timeout";
            }
            return com.applovin.impl.sdk.b.c.a(str, stringMap);
        } catch (JSONException e10) {
            if (com.applovin.impl.sdk.v.a()) {
                a("Unable to parse API response", e10);
                return null;
            }
            return null;
        }
    }

    protected abstract void a(com.applovin.impl.sdk.b.c cVar);

    protected abstract boolean b();

    @Override // com.applovin.impl.sdk.e.y
    protected int h() {
        return ((Integer) this.f8349b.a(com.applovin.impl.sdk.c.b.bs)).intValue();
    }

    @Override // java.lang.Runnable
    public void run() {
        a(i(), new b.c<JSONObject>() { // from class: com.applovin.impl.sdk.e.ab.1
            @Override // com.applovin.impl.sdk.network.b.c
            public void a(int i10, String str, JSONObject jSONObject) {
                if (ab.this.b()) {
                    if (com.applovin.impl.sdk.v.a()) {
                        ab abVar = ab.this;
                        abVar.d("Reward validation failed with error code " + i10 + " but task was cancelled already");
                        return;
                    }
                    return;
                }
                if (com.applovin.impl.sdk.v.a()) {
                    ab abVar2 = ab.this;
                    abVar2.d("Reward validation failed with code " + i10 + " and error: " + str);
                }
                ab.this.a(i10);
            }

            @Override // com.applovin.impl.sdk.network.b.c
            public void a(JSONObject jSONObject, int i10) {
                if (!ab.this.b()) {
                    if (com.applovin.impl.sdk.v.a()) {
                        ab abVar = ab.this;
                        abVar.a("Reward validation succeeded with code " + i10 + " and response: " + jSONObject);
                    }
                    ab.this.b(jSONObject);
                } else if (com.applovin.impl.sdk.v.a()) {
                    ab abVar2 = ab.this;
                    abVar2.d("Reward validation succeeded with code " + i10 + " but task was cancelled already");
                    ab abVar3 = ab.this;
                    abVar3.d("Response: " + jSONObject);
                }
            }
        });
    }
}
