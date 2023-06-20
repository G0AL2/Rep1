package com.chartboost.sdk.impl;

import com.chartboost.sdk.Libraries.CBLogging;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class n3 {

    /* loaded from: classes.dex */
    interface a {
        void a(JSONObject jSONObject);
    }

    public void a(String str, a aVar) {
        if (a(str)) {
            CBLogging.b("Chartboost", "CORS policy: No 'Access-Control-Allow-Origin' header is present on the requested resource");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("message", "CORS policy: No 'Access-Control-Allow-Origin' header is present on the requested resource");
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
            if (aVar != null) {
                aVar.a(jSONObject);
            }
        }
    }

    private boolean a(String str) {
        return str != null && !str.isEmpty() && str.contains("Access-Control-Allow-Origin") && str.contains("'null'");
    }
}
