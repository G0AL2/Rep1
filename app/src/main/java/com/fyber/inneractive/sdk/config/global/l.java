package com.fyber.inneractive.sdk.config.global;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class l {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, q> f16975a = new HashMap();

    public q a(String str) {
        return this.f16975a.get(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        return this.f16975a.equals(((l) obj).f16975a);
    }

    public int hashCode() {
        return this.f16975a.hashCode();
    }

    public String toString() {
        return String.format("remoteConfig - features: %s", this.f16975a.values());
    }

    public static l a(JSONObject jSONObject) throws Exception {
        l lVar = new l();
        JSONArray optJSONArray = jSONObject.optJSONArray("features");
        char c10 = 0;
        int i10 = 0;
        while (i10 < optJSONArray.length()) {
            JSONObject jSONObject2 = optJSONArray.getJSONObject(i10);
            q qVar = new q();
            qVar.f16978b = jSONObject2.getString("id");
            JSONObject optJSONObject = jSONObject2.optJSONObject("params");
            if (optJSONObject != null) {
                qVar.f16977a = new o(optJSONObject);
            } else {
                Object[] objArr = new Object[1];
                objArr[c10] = qVar.f16978b;
                IAlog.a("RemoteFeature fromJson. feature %s has no params!", objArr);
            }
            JSONArray optJSONArray2 = jSONObject2.optJSONArray("experiments");
            if (optJSONArray2 != null) {
                for (int i11 = 0; i11 < optJSONArray2.length(); i11++) {
                    JSONObject jSONObject3 = optJSONArray2.getJSONObject(i11);
                    b bVar = new b();
                    bVar.f16940a = jSONObject3.getString("id");
                    bVar.f16941b = jSONObject3.optInt("perc", 10);
                    JSONArray jSONArray = jSONObject3.getJSONArray("variants");
                    for (int i12 = 0; i12 < jSONArray.length(); i12++) {
                        JSONObject jSONObject4 = jSONArray.getJSONObject(i12);
                        k kVar = new k();
                        kVar.f16973b = jSONObject4.getString("id");
                        kVar.f16974c = jSONObject4.getInt("perc");
                        JSONObject optJSONObject2 = jSONObject4.optJSONObject("params");
                        if (optJSONObject2 != null) {
                            kVar.f16977a = new o(optJSONObject2);
                        }
                        bVar.f16942c.add(kVar);
                    }
                    b.a(bVar, jSONObject3.optJSONObject("include"), true);
                    b.a(bVar, jSONObject3.optJSONObject("exclude"), false);
                    qVar.f16979c.put(bVar.f16940a, bVar);
                }
            }
            lVar.f16975a.put(qVar.f16978b, qVar);
            i10++;
            c10 = 0;
        }
        return lVar;
    }
}
