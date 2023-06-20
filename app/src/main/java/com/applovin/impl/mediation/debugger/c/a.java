package com.applovin.impl.mediation.debugger.c;

import com.applovin.impl.mediation.d.c;
import com.applovin.impl.sdk.e.u;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.network.b;
import com.applovin.impl.sdk.network.c;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinWebViewActivity;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a extends com.applovin.impl.sdk.e.a {

    /* renamed from: a  reason: collision with root package name */
    private final b.c<JSONObject> f7545a;

    public a(b.c<JSONObject> cVar, m mVar) {
        super("TaskFetchMediationDebuggerInfo", mVar, true);
        this.f7545a = cVar;
    }

    private JSONObject a(m mVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("installed_mediation_adapters", c.a(mVar));
        } catch (JSONException e10) {
            a("Failed to create mediation debugger request post body", e10);
        }
        return jSONObject;
    }

    private JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("installed_mediation_adapters", c.a(this.f8349b));
        } catch (JSONException e10) {
            a("Failed to construct JSON body", e10);
        }
        return jSONObject;
    }

    protected Map<String, String> a() {
        HashMap hashMap = new HashMap();
        hashMap.put("sdk_version", AppLovinSdk.VERSION);
        if (!((Boolean) this.f8349b.a(com.applovin.impl.sdk.c.b.ep)).booleanValue()) {
            hashMap.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f8349b.z());
        }
        Map<String, Object> h10 = this.f8349b.V().h();
        hashMap.put("package_name", String.valueOf(h10.get("package_name")));
        hashMap.put("app_version", String.valueOf(h10.get("app_version")));
        Map<String, Object> b10 = this.f8349b.V().b();
        hashMap.put("platform", String.valueOf(b10.get("platform")));
        hashMap.put("os", String.valueOf(b10.get("os")));
        return hashMap;
    }

    @Override // java.lang.Runnable
    public void run() {
        u<JSONObject> uVar = new u<JSONObject>(com.applovin.impl.sdk.network.c.a(this.f8349b).b("POST").a(com.applovin.impl.mediation.d.b.c(this.f8349b)).c(com.applovin.impl.mediation.d.b.d(this.f8349b)).a(a()).a(a(this.f8349b)).a((c.a) new JSONObject()).b(((Long) this.f8349b.a(com.applovin.impl.sdk.c.a.f8171g)).intValue()).a(b()).a(), this.f8349b, g()) { // from class: com.applovin.impl.mediation.debugger.c.a.1
            @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
            public void a(int i10, String str, JSONObject jSONObject) {
                a.this.f7545a.a(i10, str, jSONObject);
            }

            @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
            public void a(JSONObject jSONObject, int i10) {
                a.this.f7545a.a(jSONObject, i10);
            }
        };
        uVar.a(com.applovin.impl.sdk.c.a.f8167c);
        uVar.b(com.applovin.impl.sdk.c.a.f8168d);
        this.f8349b.S().a((com.applovin.impl.sdk.e.a) uVar);
    }
}
