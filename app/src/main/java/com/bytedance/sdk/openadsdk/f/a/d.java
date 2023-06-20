package com.bytedance.sdk.openadsdk.f.a;

import com.bytedance.sdk.component.a.f;
import com.bytedance.sdk.component.a.r;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.w;
import com.vehiclecloud.app.videofetch.rnbillingclient.Analytics;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: InteractiveFinishMethod.java */
/* loaded from: classes.dex */
public class d extends com.bytedance.sdk.component.a.e<JSONObject, JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<w> f13246a;

    public d(w wVar) {
        this.f13246a = new WeakReference<>(wVar);
    }

    public static void a(r rVar, w wVar) {
        rVar.a("interactiveFinish", new d(wVar));
    }

    @Override // com.bytedance.sdk.component.a.e
    public JSONObject a(JSONObject jSONObject, f fVar) throws Exception {
        JSONObject jSONObject2 = new JSONObject();
        WeakReference<w> weakReference = this.f13246a;
        if (weakReference != null && weakReference.get() != null) {
            w wVar = this.f13246a.get();
            n c10 = wVar.c();
            try {
                boolean z10 = true;
                int i10 = 0;
                if (jSONObject.optInt("finish", 1) != 1) {
                    z10 = false;
                }
                int optInt = jSONObject.optInt("reduce_duration", -1);
                int aA = c10 != null ? c10.aA() : 0;
                if (optInt >= 0 && aA >= 0) {
                    optInt = Math.min(optInt, aA);
                } else if (optInt < 0) {
                    optInt = aA >= 0 ? aA : 0;
                }
                if (z10) {
                    wVar.c(optInt);
                } else {
                    i10 = -1;
                }
                jSONObject2.put(Analytics.Param.CODE, i10);
                jSONObject2.put("reduce_duration", optInt);
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
        return jSONObject2;
    }
}
