package com.ironsource.mediationsdk.a;

import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
final class f extends a {

    /* renamed from: d  reason: collision with root package name */
    private final String f26726d = "https://outcome-ssp.supersonicads.com/mediation?adUnit=3";

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(int i10) {
        this.f26667b = i10;
    }

    @Override // com.ironsource.mediationsdk.a.a
    public final String a(ArrayList<c> arrayList, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        this.f26666a = jSONObject;
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
        return a(jSONArray);
    }

    @Override // com.ironsource.mediationsdk.a.a
    public final String b() {
        return "https://outcome-ssp.supersonicads.com/mediation?adUnit=3";
    }

    @Override // com.ironsource.mediationsdk.a.a
    public final String c() {
        return "outcome";
    }
}
