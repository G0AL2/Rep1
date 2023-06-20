package com.ironsource.sdk.a;

import android.util.Base64;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class c implements com.ironsource.a.d {
    @Override // com.ironsource.a.d
    public final String a(Map<String, Object> map) {
        try {
            return String.format("%s=%s", "data", Base64.encodeToString(new JSONObject().put("table", "supersonic.adunitanalytics.ad_unit_events").put("data", new JSONObject(map)).toString().getBytes(), 2));
        } catch (JSONException e10) {
            e10.printStackTrace();
            return "";
        }
    }
}
