package com.bytedance.sdk.openadsdk.core.e;

import android.text.TextUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: AutoTestModel.java */
/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private String f12031a;

    /* renamed from: b  reason: collision with root package name */
    private List<String> f12032b;

    public e(String str) {
        this.f12031a = "";
        this.f12032b = new ArrayList();
        HashMap<String, Object> hashMap = TextUtils.isEmpty(str) ? new HashMap<>() : a(str);
        try {
            this.f12031a = (String) hashMap.get("auto_test_param");
            JSONArray jSONArray = new JSONArray((String) hashMap.get("auto_test_hosts"));
            this.f12032b = new ArrayList();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                this.f12032b.add(jSONArray.optString(i10));
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public String a() {
        return this.f12031a;
    }

    public List<String> b() {
        return this.f12032b;
    }

    private static final HashMap<String, Object> a(String str) {
        if (TextUtils.isEmpty(str)) {
            return new HashMap<>();
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i10);
                hashMap.put(optJSONObject.optString("name"), optJSONObject.optString(AppMeasurementSdk.ConditionalUserProperty.VALUE));
            }
            return hashMap;
        } catch (Exception unused) {
            return new HashMap<>();
        }
    }
}
