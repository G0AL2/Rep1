package com.bytedance.sdk.component.adexpress.dynamic.b;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DynamicDiffPlugin.java */
/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public List<a> f9563a;

    /* renamed from: b  reason: collision with root package name */
    public String f9564b;

    /* renamed from: c  reason: collision with root package name */
    public String f9565c;

    /* renamed from: d  reason: collision with root package name */
    public String f9566d;

    /* compiled from: DynamicDiffPlugin.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f9567a;

        /* renamed from: b  reason: collision with root package name */
        public JSONObject f9568b;
    }

    public static d a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        d dVar = new d();
        String optString = jSONObject.optString("custom_components");
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(optString);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i10);
                if (optJSONObject != null) {
                    a aVar = new a();
                    aVar.f9567a = optJSONObject.optInt("id");
                    aVar.f9568b = new JSONObject(optJSONObject.optString("componentLayout"));
                    arrayList.add(aVar);
                }
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        dVar.f9563a = arrayList;
        dVar.f9564b = jSONObject.optString("diff_data");
        dVar.f9565c = jSONObject.optString("style_diff");
        dVar.f9566d = jSONObject.optString("tag_diff");
        return dVar;
    }
}
