package com.ironsource.mediationsdk.a;

import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
final class e extends a {

    /* renamed from: d  reason: collision with root package name */
    private final String f26722d = "https://outcome-ssp.supersonicads.com/mediation?adUnit=2";

    /* renamed from: e  reason: collision with root package name */
    private final String f26723e = "super.dwh.mediation_events";

    /* renamed from: f  reason: collision with root package name */
    private final String f26724f = "table";

    /* renamed from: g  reason: collision with root package name */
    private final String f26725g = "data";

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(int i10) {
        this.f26667b = i10;
    }

    @Override // com.ironsource.mediationsdk.a.a
    public final String a(ArrayList<c> arrayList, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        this.f26666a = jSONObject;
        try {
            JSONArray jSONArray = new JSONArray();
            if (arrayList != null && !arrayList.isEmpty()) {
                Iterator<c> it = arrayList.iterator();
                while (it.hasNext()) {
                    JSONObject a10 = a.a(it.next());
                    if (a10 != null) {
                        jSONArray.put(a10);
                    }
                }
            }
            jSONObject2.put("table", "super.dwh.mediation_events");
            jSONObject2.put("data", a(jSONArray));
            return jSONObject2.toString();
        } catch (JSONException e10) {
            e10.printStackTrace();
            return "";
        }
    }

    @Override // com.ironsource.mediationsdk.a.a
    public final String b() {
        return "https://outcome-ssp.supersonicads.com/mediation?adUnit=2";
    }

    @Override // com.ironsource.mediationsdk.a.a
    public final String c() {
        return "ironbeast";
    }
}
