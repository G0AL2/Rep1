package com.google.android.ads.mediationtestsuite.dataobjects;

import ed.c;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class AdManagerNetworkResponse {
    @c("data")
    private Map<String, String> data;
    @c("format")
    private AdFormat format;
    @c("mediation_group_id")
    private List<Integer> mediationGroupIds;

    public Map<String, String> a() {
        return this.data;
    }

    public AdFormat b() {
        return this.format;
    }

    public List<Integer> c() {
        return this.mediationGroupIds;
    }
}
