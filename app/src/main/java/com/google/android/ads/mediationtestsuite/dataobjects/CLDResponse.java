package com.google.android.ads.mediationtestsuite.dataobjects;

import ed.c;
import java.util.List;

/* loaded from: classes2.dex */
public class CLDResponse {
    @c("ad_unit_settings")
    private List<AdUnitResponse> adUnitSettings;

    public List<AdUnitResponse> a() {
        return this.adUnitSettings;
    }

    public void b(List<AdUnitResponse> list) {
        this.adUnitSettings = list;
    }
}
