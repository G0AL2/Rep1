package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d0 implements e0 {

    /* renamed from: a  reason: collision with root package name */
    public com.fyber.inneractive.sdk.cache.session.d f16930a;

    /* renamed from: d  reason: collision with root package name */
    public a f16933d;

    /* renamed from: b  reason: collision with root package name */
    public final Map<UnitDisplayType, Map<String, String>> f16931b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, String> f16932c = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public boolean f16934e = false;

    /* loaded from: classes.dex */
    public interface a {
    }

    public String a(UnitDisplayType unitDisplayType, String str) {
        Map<String, String> map = this.f16931b.get(unitDisplayType);
        return (map == null || map.get(str) == null) ? "" : map.get(str);
    }

    public void a(UnitDisplayType unitDisplayType, String str, String str2) {
        Map<String, String> map = this.f16931b.get(unitDisplayType);
        if (map == null) {
            map = new HashMap<>();
            this.f16931b.put(unitDisplayType, map);
        }
        map.put(str, str2);
        a aVar = this.f16933d;
        if (aVar == null || !this.f16934e) {
            return;
        }
        ((com.fyber.inneractive.sdk.bidder.a) aVar).b();
    }

    public JSONArray a(UnitDisplayType unitDisplayType) {
        com.fyber.inneractive.sdk.cache.session.enums.b[] values;
        com.fyber.inneractive.sdk.cache.session.d dVar = this.f16930a;
        if (dVar != null) {
            JSONArray jSONArray = new JSONArray();
            try {
                for (com.fyber.inneractive.sdk.cache.session.enums.b bVar : com.fyber.inneractive.sdk.cache.session.enums.b.values()) {
                    if (bVar != com.fyber.inneractive.sdk.cache.session.enums.b.f16858i && (unitDisplayType == null || bVar.f16860a == unitDisplayType)) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("type", bVar.f16860a.value());
                        jSONObject.put("subType", bVar.name().toLowerCase().contains(DownloadResource.TYPE_VIDEO) ? DownloadResource.TYPE_VIDEO : "display");
                        com.fyber.inneractive.sdk.cache.session.h hVar = dVar.f16839b.get(bVar);
                        int a10 = dVar.a();
                        if (a10 > 0 && hVar != null && hVar.size() >= a10) {
                            boolean z10 = bVar.f16861b;
                            JSONArray jSONArray2 = new JSONArray();
                            ArrayList arrayList = new ArrayList(hVar);
                            Collections.sort(arrayList, new com.fyber.inneractive.sdk.cache.session.g(hVar));
                            Iterator it = arrayList.iterator();
                            int i10 = 0;
                            while (it.hasNext()) {
                                jSONArray2.put(((com.fyber.inneractive.sdk.cache.session.e) it.next()).a(false, z10));
                                i10++;
                                if (i10 >= a10) {
                                    break;
                                }
                            }
                            jSONObject.put("sessionData", jSONArray2);
                            jSONArray.put(jSONObject);
                        }
                    }
                }
                return jSONArray;
            } catch (Exception unused) {
                return jSONArray;
            }
        }
        return null;
    }

    public void a(com.fyber.inneractive.sdk.cache.session.enums.b bVar, com.fyber.inneractive.sdk.cache.session.enums.a aVar) {
        com.fyber.inneractive.sdk.cache.session.d dVar = this.f16930a;
        if (dVar != null) {
            com.fyber.inneractive.sdk.util.n.a(new com.fyber.inneractive.sdk.cache.session.c(dVar, aVar, bVar));
        }
    }

    public void a(UnitDisplayType unitDisplayType, String... strArr) {
        for (String str : strArr) {
            a(unitDisplayType, str, "0");
        }
    }

    public void a(a aVar) {
        this.f16933d = aVar;
    }
}
