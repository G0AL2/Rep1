package com.chartboost.sdk.Model;

import com.chartboost.sdk.Libraries.CBLogging;
import com.chartboost.sdk.impl.n0;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f13681a;

    /* renamed from: b  reason: collision with root package name */
    public final String f13682b;

    /* renamed from: c  reason: collision with root package name */
    public final String f13683c;

    public b(String str, String str2, String str3) {
        this.f13681a = str;
        this.f13682b = str2;
        this.f13683c = str3;
    }

    private static Map<String, b> a(JSONObject jSONObject) throws JSONException {
        HashMap hashMap = new HashMap();
        if (jSONObject == null) {
            CBLogging.a("Asset", "deserializeAssets assetsJson is null");
            return hashMap;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            JSONObject jSONObject2 = jSONObject.getJSONObject(next);
            Iterator<String> keys2 = jSONObject2.keys();
            while (keys2.hasNext()) {
                String next2 = keys2.next();
                JSONObject jSONObject3 = jSONObject2.getJSONObject(next2);
                hashMap.put(next2, new b(next, jSONObject3.getString("filename"), jSONObject3.getString(ImagesContract.URL)));
            }
        }
        return hashMap;
    }

    public static Map<String, b> b(JSONObject jSONObject, int i10) {
        HashMap hashMap = new HashMap();
        if (jSONObject == null) {
            return hashMap;
        }
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("cache_assets");
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if ("templates".equals(next)) {
                    hashMap.putAll(a(jSONObject2, i10));
                } else {
                    hashMap.putAll(a(jSONObject2, next));
                }
            }
        } catch (JSONException e10) {
            CBLogging.b("Asset", "v2PrefetchToAssets: " + e10.toString());
        }
        return hashMap;
    }

    private static JSONObject a(JSONArray jSONArray) throws JSONException {
        JSONObject a10 = n0.a(new n0.a[0]);
        if (jSONArray == null) {
            return a10;
        }
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i10);
            String optString = jSONObject.optString("name");
            String optString2 = jSONObject.optString("type");
            String optString3 = jSONObject.optString(AppMeasurementSdk.ConditionalUserProperty.VALUE);
            String optString4 = jSONObject.optString("param");
            if (!"param".equals(optString2) && optString4.isEmpty()) {
                JSONObject optJSONObject = a10.optJSONObject(optString2);
                if (optJSONObject == null) {
                    optJSONObject = n0.a(new n0.a[0]);
                    a10.put(optString2, optJSONObject);
                }
                optJSONObject.put("html".equals(optString2) ? "body" : optString, n0.a(n0.a("filename", optString), n0.a(ImagesContract.URL, optString3)));
            }
        }
        return a10;
    }

    private static Map<String, b> a(JSONObject jSONObject, int i10) throws JSONException {
        JSONArray optJSONArray;
        HashMap hashMap = new HashMap();
        if (jSONObject != null && (optJSONArray = jSONObject.optJSONArray("templates")) != null) {
            int min = Math.min(i10, optJSONArray.length());
            for (int i11 = 0; i11 < min; i11++) {
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i11);
                for (Map.Entry<String, b> entry : a(jSONObject2 != null ? a(jSONObject2.getJSONArray("elements")) : null).entrySet()) {
                    b value = entry.getValue();
                    hashMap.put(value.f13682b, value);
                }
            }
        }
        return hashMap;
    }

    private static Map<String, b> a(JSONObject jSONObject, String str) throws JSONException {
        HashMap hashMap = new HashMap();
        if (jSONObject != null && str != null) {
            JSONArray jSONArray = jSONObject.getJSONArray(str);
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                String string = jSONObject2.getString("name");
                hashMap.put(string, new b(str, string, jSONObject2.getString(AppMeasurementSdk.ConditionalUserProperty.VALUE)));
            }
        }
        return hashMap;
    }

    public File a(File file) {
        if (this.f13681a != null && this.f13682b != null) {
            String str = this.f13681a + "/" + this.f13682b;
            try {
                return new File(file, str);
            } catch (Exception e10) {
                CBLogging.a("Asset", "Cannot create file for path: " + str + ". Error: " + e10.toString());
            }
        } else {
            CBLogging.a("Asset", "Cannot create file. Directory or filename is null.");
        }
        return null;
    }
}
