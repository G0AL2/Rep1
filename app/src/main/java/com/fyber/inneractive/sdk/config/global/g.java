package com.fyber.inneractive.sdk.config.global;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class g {
    public static JSONArray a(Map<Class, com.fyber.inneractive.sdk.config.global.features.e> map, boolean z10) {
        d dVar;
        JSONArray jSONArray = new JSONArray();
        try {
            for (com.fyber.inneractive.sdk.config.global.features.e eVar : map.values()) {
                List<b> list = eVar.f16953c;
                Map<String, k> map2 = eVar.f16954d;
                for (b bVar : list) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("id", bVar.f16940a);
                    if (map2.containsKey(bVar.f16940a)) {
                        jSONObject.put("v", map2.get(bVar.f16940a).f16973b);
                    } else {
                        jSONObject.put("v", "control");
                    }
                    if (z10) {
                        Iterator<d> it = bVar.f16943d.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                dVar = null;
                                break;
                            }
                            dVar = it.next();
                            if (c.class.equals(dVar.getClass())) {
                                break;
                            }
                        }
                        if (dVar != null && ((c) dVar).f16945b) {
                            Set<Long> set = ((c) dVar).f16944a;
                            JSONArray jSONArray2 = new JSONArray();
                            for (Long l10 : set) {
                                jSONArray2.put(l10);
                            }
                            if (jSONArray2.length() > 0) {
                                jSONObject.put("d", jSONArray2);
                            }
                        }
                    }
                    jSONArray.put(jSONObject);
                }
            }
            return jSONArray;
        } catch (JSONException e10) {
            IAlog.a("ExperimentParamBuilder: Json exception during experiments Json build!", new Object[0]);
            if (IAlog.f20222a <= 3) {
                e10.printStackTrace();
            }
            return null;
        }
    }
}
