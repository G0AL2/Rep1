package com.google.android.ads.mediationtestsuite.dataobjects;

import com.unity3d.ads.metadata.MediationMetaData;
import ed.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class AdManagerCLDResponse {
    @c("ad_unit_settings")
    private List<AdUnitResponse> adUnitSettings;
    @c("app_id")
    private String appId;
    @c("initializer_settings")
    private AdManagerInitializationSettings initializerSettings;
    @c("status")
    private Integer status;
    @c(MediationMetaData.KEY_VERSION)
    private String version;

    public List<AdUnitResponse> a() {
        return this.adUnitSettings;
    }

    public AdManagerInitializationSettings b() {
        return this.initializerSettings;
    }

    public List<YieldGroup> c() {
        Map<String, AdManagerAdapterInitializationSettings> a10;
        ArrayList arrayList = new ArrayList();
        if (b() == null || (a10 = b().a()) == null) {
            return arrayList;
        }
        HashMap hashMap = new HashMap();
        for (String str : a10.keySet()) {
            for (AdManagerNetworkResponse adManagerNetworkResponse : a10.get(str).a()) {
                NetworkResponse networkResponse = new NetworkResponse(adManagerNetworkResponse.a(), str, false);
                List<Integer> c10 = adManagerNetworkResponse.c();
                if (c10 != null) {
                    Iterator it = new HashSet(c10).iterator();
                    while (it.hasNext()) {
                        Integer num = (Integer) it.next();
                        Map map = (Map) hashMap.get(num);
                        if (map == null) {
                            map = new HashMap();
                            map.put(adManagerNetworkResponse.b(), new ArrayList());
                            hashMap.put(num, map);
                        }
                        ((List) map.get(adManagerNetworkResponse.b())).add(networkResponse);
                    }
                }
            }
        }
        for (Integer num2 : hashMap.keySet()) {
            Map map2 = (Map) hashMap.get(num2);
            for (AdFormat adFormat : map2.keySet()) {
                arrayList.add(new YieldGroup(num2, adFormat, (List) map2.get(adFormat)));
            }
        }
        return arrayList;
    }
}
