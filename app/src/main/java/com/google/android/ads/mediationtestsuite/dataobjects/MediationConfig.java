package com.google.android.ads.mediationtestsuite.dataobjects;

import ed.c;
import java.util.List;

/* loaded from: classes2.dex */
public class MediationConfig {
    @c("ad_networks")
    private List<NetworkResponse> adNetworks;
    @c("mediation_group_name")
    private String mediationGroupName;

    public List<NetworkResponse> a() {
        return this.adNetworks;
    }

    public String b() {
        return this.mediationGroupName;
    }
}
