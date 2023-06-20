package com.google.android.ads.mediationtestsuite.dataobjects;

import android.content.Context;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class NetworkAdapterDataStore {
    private List<Network> networks;
    private Map<String, Map<AdFormat, NetworkAdapter>> rtbAdapterMapping;
    private Map<String, Map<AdFormat, NetworkAdapter>> waterfallAdapterMapping;

    public NetworkAdapterDataStore(Context context, List<Network> list, List<NetworkAdapter> list2) {
        HashMap hashMap = new HashMap();
        for (Network network : list) {
            network.e();
            hashMap.put(network.h(), network);
        }
        this.networks = list;
        this.waterfallAdapterMapping = new HashMap();
        this.rtbAdapterMapping = new HashMap();
        for (NetworkAdapter networkAdapter : list2) {
            Network network2 = (Network) hashMap.get(networkAdapter.j());
            networkAdapter.s(network2);
            networkAdapter.c();
            String f10 = networkAdapter.f();
            String g10 = network2 != null ? network2.g() : null;
            if (networkAdapter.o()) {
                if (!this.rtbAdapterMapping.containsKey(f10)) {
                    this.rtbAdapterMapping.put(networkAdapter.f(), new HashMap());
                }
                this.rtbAdapterMapping.get(networkAdapter.f()).put(networkAdapter.g(), networkAdapter);
                if (g10 != null && !g10.equals(f10)) {
                    if (!this.rtbAdapterMapping.containsKey(g10)) {
                        this.rtbAdapterMapping.put(g10, new HashMap());
                    }
                    this.rtbAdapterMapping.get(g10).put(networkAdapter.g(), networkAdapter);
                }
            } else {
                if (!this.waterfallAdapterMapping.containsKey(f10)) {
                    this.waterfallAdapterMapping.put(f10, new HashMap());
                }
                this.waterfallAdapterMapping.get(f10).put(networkAdapter.g(), networkAdapter);
                if (g10 != null && !g10.equals(f10)) {
                    if (!this.waterfallAdapterMapping.containsKey(g10)) {
                        this.waterfallAdapterMapping.put(g10, new HashMap());
                    }
                    this.waterfallAdapterMapping.get(g10).put(networkAdapter.g(), networkAdapter);
                }
            }
        }
    }

    public NetworkAdapter a(AdFormat adFormat, boolean z10, String str) {
        if (z10) {
            Map<AdFormat, NetworkAdapter> map = this.rtbAdapterMapping.get(str);
            if (map != null) {
                return map.get(adFormat);
            }
            return null;
        }
        Map<AdFormat, NetworkAdapter> map2 = this.waterfallAdapterMapping.get(str);
        if (map2 != null) {
            return map2.get(adFormat);
        }
        return null;
    }

    public List<Network> b() {
        return this.networks;
    }
}
