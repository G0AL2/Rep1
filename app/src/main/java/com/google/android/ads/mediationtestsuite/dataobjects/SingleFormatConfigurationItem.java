package com.google.android.ads.mediationtestsuite.dataobjects;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class SingleFormatConfigurationItem extends ConfigurationItem {
    protected Map<AdFormat, List<NetworkConfig>> configsPerFormat;
    protected AdFormat format;

    protected SingleFormatConfigurationItem() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static List<AdFormat> o(AdFormat adFormat) {
        ArrayList arrayList = new ArrayList();
        if (adFormat == AdFormat.BANNER_INTERSTITIAL) {
            arrayList.add(AdFormat.BANNER);
            arrayList.add(AdFormat.INTERSTITIAL);
        } else if (adFormat != AdFormat.UNKNOWN) {
            arrayList.add(adFormat);
        }
        return arrayList;
    }

    @Override // com.google.android.ads.mediationtestsuite.dataobjects.ConfigurationItem
    public List<NetworkConfig> h() {
        ArrayList arrayList = new ArrayList();
        for (List<NetworkConfig> list : this.configsPerFormat.values()) {
            arrayList.addAll(list);
        }
        return arrayList;
    }

    @Override // com.google.android.ads.mediationtestsuite.dataobjects.ConfigurationItem
    public boolean j() {
        boolean z10;
        if (k()) {
            return false;
        }
        for (AdFormat adFormat : this.configsPerFormat.keySet()) {
            Iterator<NetworkConfig> it = this.configsPerFormat.get(adFormat).iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().o() != TestResult.SUCCESS) {
                        z10 = false;
                        continue;
                        break;
                    }
                } else {
                    z10 = true;
                    continue;
                    break;
                }
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public AdFormat n() {
        return this.format;
    }

    protected SingleFormatConfigurationItem(AdFormat adFormat) {
        this.configsPerFormat = new HashMap();
        this.format = adFormat;
        if (adFormat == AdFormat.UNKNOWN) {
            return;
        }
        for (AdFormat adFormat2 : o(adFormat)) {
            this.configsPerFormat.put(adFormat2, new ArrayList());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public SingleFormatConfigurationItem(AdFormat adFormat, List<NetworkResponse> list) {
        this(adFormat);
        for (AdFormat adFormat2 : o(adFormat)) {
            for (NetworkResponse networkResponse : list) {
                NetworkConfig networkConfig = new NetworkConfig(adFormat2, networkResponse);
                if (networkConfig.i() != null) {
                    this.configsPerFormat.get(adFormat2).add(networkConfig);
                    m(networkConfig);
                }
            }
        }
    }
}
