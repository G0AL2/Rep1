package com.google.firebase.remoteconfig.internal;

import android.os.Bundle;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: Personalization.java */
/* loaded from: classes3.dex */
public class r {

    /* renamed from: a  reason: collision with root package name */
    private final sc.b<rb.a> f23701a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, String> f23702b = Collections.synchronizedMap(new HashMap());

    public r(sc.b<rb.a> bVar) {
        this.f23701a = bVar;
    }

    public void a(String str, e eVar) {
        JSONObject optJSONObject;
        rb.a aVar = this.f23701a.get();
        if (aVar == null) {
            return;
        }
        JSONObject f10 = eVar.f();
        if (f10.length() < 1) {
            return;
        }
        JSONObject d10 = eVar.d();
        if (d10.length() >= 1 && (optJSONObject = f10.optJSONObject(str)) != null) {
            String optString = optJSONObject.optString("choiceId");
            if (optString.isEmpty()) {
                return;
            }
            synchronized (this.f23702b) {
                if (optString.equals(this.f23702b.get(str))) {
                    return;
                }
                this.f23702b.put(str, optString);
                Bundle bundle = new Bundle();
                bundle.putString("arm_key", str);
                bundle.putString("arm_value", d10.optString(str));
                bundle.putString("personalization_id", optJSONObject.optString("personalizationId"));
                bundle.putInt("arm_index", optJSONObject.optInt("armIndex", -1));
                bundle.putString("group", optJSONObject.optString("group"));
                aVar.a("fp", "personalization_assignment", bundle);
                Bundle bundle2 = new Bundle();
                bundle2.putString("_fpid", optString);
                aVar.a("fp", "_fpc", bundle2);
            }
        }
    }
}
