package com.fyber.inneractive.sdk.config.global;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public String f16940a;

    /* renamed from: b  reason: collision with root package name */
    public int f16941b;

    /* renamed from: c  reason: collision with root package name */
    public final List<k> f16942c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public List<d> f16943d = new ArrayList();

    public static void a(b bVar, JSONObject jSONObject, boolean z10) throws Exception {
        d cVar;
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                next.getClass();
                char c10 = 65535;
                switch (next.hashCode()) {
                    case -1335432629:
                        if (next.equals("demand")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case -977436259:
                        if (next.equals("pub_id")) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case -212583340:
                        if (next.equals("placement_type")) {
                            c10 = 2;
                            break;
                        }
                        break;
                    case 3556:
                        if (next.equals("os")) {
                            c10 = 3;
                            break;
                        }
                        break;
                    case 113722:
                        if (next.equals("sdk")) {
                            c10 = 4;
                            break;
                        }
                        break;
                }
                switch (c10) {
                    case 0:
                        cVar = new c(jSONObject.getJSONArray(next), z10);
                        break;
                    case 1:
                        cVar = new i(jSONObject.getJSONArray(next), z10);
                        break;
                    case 2:
                        cVar = new h(jSONObject.getJSONArray(next), z10);
                        break;
                    case 3:
                        cVar = new f(jSONObject.getString(next), z10);
                        break;
                    case 4:
                        cVar = new j(jSONObject.getString(next), z10);
                        break;
                    default:
                        cVar = null;
                        break;
                }
                if (cVar != null) {
                    bVar.f16943d.add(cVar);
                } else {
                    IAlog.a(String.format("%s: Unsupported filter type: %s", "b", next), new Object[0]);
                }
            }
        }
    }

    public String toString() {
        return String.format("experiment: id=%s, variants=%s, filters=%s", this.f16940a, this.f16942c, this.f16943d);
    }
}
