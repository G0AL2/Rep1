package com.amazon.device.ads;

import java.util.HashMap;

/* loaded from: classes.dex */
public class DTBAdNetworkInfo {
    private static final String LOGTAG = "DTBAdNetworkInfo";
    private final String adNetworkName;
    private final HashMap<String, String> adNetworkProperties = new HashMap<>();

    public DTBAdNetworkInfo(DTBAdNetwork dTBAdNetwork) {
        this.adNetworkName = dTBAdNetwork.toString();
    }

    public String getAdNetworkName() {
        return this.adNetworkName;
    }

    public String getAdNetworkProperties(String str) {
        if (!this.adNetworkProperties.containsKey(str)) {
            DtbLog.error(LOGTAG, "DTB Ad NetworkProperties not found");
            return null;
        }
        return this.adNetworkProperties.get(str);
    }

    public DTBAdNetworkInfo setAdNetworkProperties(String str, String str2) {
        this.adNetworkProperties.put(str, str2);
        return this;
    }
}
