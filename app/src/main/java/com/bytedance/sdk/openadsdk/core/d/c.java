package com.bytedance.sdk.openadsdk.core.d;

import android.content.Context;
import com.bytedance.sdk.component.e.b.d;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.utils.u;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: FrequentCallEventHelper.java */
/* loaded from: classes.dex */
public class c {
    public static void a(Context context, String str, long j10) {
        JSONObject a10 = a(str, j10);
        d b10 = com.bytedance.sdk.openadsdk.i.d.a().b().b();
        b10.a(u.g("/api/ad/union/sdk/stats/"));
        b10.c(a10.toString());
        b10.a(new com.bytedance.sdk.component.e.a.a() { // from class: com.bytedance.sdk.openadsdk.core.d.c.1
            @Override // com.bytedance.sdk.component.e.a.a
            public void a(com.bytedance.sdk.component.e.b.c cVar, com.bytedance.sdk.component.e.b bVar) {
                if (bVar != null) {
                    l.a("uploadFrequentEvent", Boolean.valueOf(bVar.f()), bVar.d());
                } else {
                    l.c("uploadFrequentEvent", "NetResponse is null");
                }
            }

            @Override // com.bytedance.sdk.component.e.a.a
            public void a(com.bytedance.sdk.component.e.b.c cVar, IOException iOException) {
                l.c("uploadFrequentEvent", iOException.getMessage());
            }
        });
    }

    private static JSONObject a(String str, long j10) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", "over_freq");
            jSONObject.put("rit", str);
            jSONObject.put("ad_sdk_version", BuildConfig.VERSION_NAME);
            jSONObject.put("timestamp", j10);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
