package com.google.android.ads.mediationtestsuite.dataobjects;

import com.google.android.ads.mediationtestsuite.utils.g;
import com.google.gson.Gson;
import com.google.gson.reflect.a;
import ed.c;

/* loaded from: classes2.dex */
public class AdUnitResponse implements Cloneable {
    @c("ad_unit_id")
    private String adUnitId;
    @c("ad_unit_name")
    private String adUnitName;
    private AdFormat format;
    @c("mediation_config")
    private MediationConfig mediationConfig;

    /* renamed from: b */
    public AdUnitResponse clone() {
        Gson b10 = g.b();
        return (AdUnitResponse) b10.fromJson(b10.toJsonTree(this), new a<AdUnitResponse>(this) { // from class: com.google.android.ads.mediationtestsuite.dataobjects.AdUnitResponse.1
        }.e());
    }

    public String c() {
        return this.adUnitId;
    }

    public String d() {
        return this.adUnitName;
    }

    public AdFormat e() {
        return this.format;
    }

    public MediationConfig f() {
        return this.mediationConfig;
    }
}
