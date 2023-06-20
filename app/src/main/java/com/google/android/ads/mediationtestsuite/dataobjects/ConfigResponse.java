package com.google.android.ads.mediationtestsuite.dataobjects;

import java.util.List;

/* loaded from: classes2.dex */
public class ConfigResponse {
    private final List<ConfigurationItem> configurationItems;
    private final List<Network> networks;

    public ConfigResponse(List<ConfigurationItem> list, List<Network> list2) {
        this.configurationItems = list;
        this.networks = list2;
    }

    public List<ConfigurationItem> a() {
        return this.configurationItems;
    }

    public boolean b() {
        for (ConfigurationItem configurationItem : this.configurationItems) {
            if (configurationItem.g() != null) {
                return true;
            }
        }
        return false;
    }
}
