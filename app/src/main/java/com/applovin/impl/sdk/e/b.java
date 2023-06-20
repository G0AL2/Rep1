package com.applovin.impl.sdk.e;

import android.text.TextUtils;
import com.applovin.impl.sdk.network.c;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinSdk;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class b extends a {
    /* JADX INFO: Access modifiers changed from: package-private */
    public b(com.applovin.impl.sdk.m mVar) {
        super("TaskApiSubmitData", mVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject) {
        try {
            JSONObject a10 = com.applovin.impl.sdk.utils.h.a(jSONObject);
            this.f8349b.K().a(com.applovin.impl.sdk.c.b.X, a10.getString("device_id"));
            this.f8349b.K().a(com.applovin.impl.sdk.c.b.Z, a10.getString("device_token"));
            this.f8349b.K().a(com.applovin.impl.sdk.c.b.f8192aa, Long.valueOf(a10.getLong("publisher_id")));
            com.applovin.impl.sdk.utils.h.d(a10, this.f8349b);
            com.applovin.impl.sdk.utils.h.e(a10, this.f8349b);
            String string = JsonUtils.getString(a10, "latest_version", "");
            if (!TextUtils.isEmpty(string)) {
                String str = AppLovinSdk.VERSION;
                if (!str.equals(string) && com.applovin.impl.sdk.v.a()) {
                    String str2 = "Current SDK version (" + str + ") is outdated. Please integrate the latest version of the AppLovin SDK (" + string + "). Doing so will improve your CPMs and ensure you have access to the latest revenue earning features.";
                    if (JsonUtils.valueExists(a10, "sdk_update_message")) {
                        str2 = JsonUtils.getString(a10, "sdk_update_message", str2);
                    }
                    com.applovin.impl.sdk.v.h("AppLovinSdk", str2);
                }
            }
            this.f8349b.T().b();
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.v.a()) {
                a("Unable to parse API response", th);
            }
        }
    }

    private void b(JSONObject jSONObject) throws JSONException {
        com.applovin.impl.sdk.o V = this.f8349b.V();
        Map<String, Object> d10 = V.d();
        Utils.renameKeyInObjectMap("platform", "type", d10);
        Utils.renameKeyInObjectMap("api_level", "sdk_version", d10);
        jSONObject.put("device_info", new JSONObject(d10));
        Map<String, Object> h10 = V.h();
        Utils.renameKeyInObjectMap("sdk_version", "applovin_sdk_version", h10);
        Utils.renameKeyInObjectMap("ia", "installed_at", h10);
        jSONObject.put("app_info", new JSONObject(h10));
    }

    private void c(JSONObject jSONObject) {
        u<JSONObject> uVar = new u<JSONObject>(com.applovin.impl.sdk.network.c.a(this.f8349b).a(com.applovin.impl.sdk.utils.h.a("2.0/device", this.f8349b)).c(com.applovin.impl.sdk.utils.h.b("2.0/device", this.f8349b)).a(com.applovin.impl.sdk.utils.h.e(this.f8349b)).b("POST").a(jSONObject).d(((Boolean) this.f8349b.a(com.applovin.impl.sdk.c.b.ew)).booleanValue()).a((c.a) new JSONObject()).a(((Integer) this.f8349b.a(com.applovin.impl.sdk.c.b.cV)).intValue()).a(), this.f8349b) { // from class: com.applovin.impl.sdk.e.b.1
            @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
            public void a(int i10, String str, JSONObject jSONObject2) {
                com.applovin.impl.sdk.utils.h.a(i10, this.f8349b);
            }

            @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
            public void a(JSONObject jSONObject2, int i10) {
                b.this.a(jSONObject2);
            }
        };
        uVar.a(com.applovin.impl.sdk.c.b.aT);
        uVar.b(com.applovin.impl.sdk.c.b.aU);
        this.f8349b.S().a((a) uVar);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (com.applovin.impl.sdk.v.a()) {
                b("Submitting user data...");
            }
            JSONObject jSONObject = new JSONObject();
            b(jSONObject);
            c(jSONObject);
        } catch (JSONException e10) {
            if (com.applovin.impl.sdk.v.a()) {
                a("Unable to build JSON message with collected data", e10);
            }
        }
    }
}
