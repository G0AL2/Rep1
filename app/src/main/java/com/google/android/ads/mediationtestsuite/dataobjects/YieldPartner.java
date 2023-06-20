package com.google.android.ads.mediationtestsuite.dataobjects;

import com.google.android.ads.mediationtestsuite.utils.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class YieldPartner extends ConfigurationItem implements Matchable {
    private String name;
    private final List<NetworkConfig> networkConfigs = new ArrayList();

    private YieldPartner() {
    }

    public static Collection<YieldPartner> o(AdManagerCLDResponse adManagerCLDResponse) {
        String c10;
        Network i10;
        List<AdUnitResponse> a10 = adManagerCLDResponse.a();
        if (a10 == null) {
            return new ArrayList();
        }
        HashMap hashMap = new HashMap();
        for (AdUnitResponse adUnitResponse : a10) {
            MediationConfig f10 = adUnitResponse.f();
            if (f10 != null && (c10 = adUnitResponse.c()) != null && c10.matches("^/\\d+(/[^/]+)*$")) {
                for (NetworkConfig networkConfig : new AdUnit(c10, adUnitResponse.d(), adUnitResponse.e(), f10).h()) {
                    NetworkAdapter i11 = networkConfig.i();
                    if (i11 != null && (i10 = i11.i()) != null) {
                        String h10 = i10.h();
                        YieldPartner yieldPartner = (YieldPartner) hashMap.get(h10);
                        if (yieldPartner == null) {
                            yieldPartner = new YieldPartner(h10);
                            hashMap.put(h10, yieldPartner);
                        }
                        yieldPartner.n(networkConfig);
                    }
                }
            }
        }
        return hashMap.values();
    }

    @Override // com.google.android.ads.mediationtestsuite.dataobjects.ConfigurationItem
    public String b(NetworkConfig networkConfig) {
        if (!networkConfig.v() && networkConfig.B() && networkConfig.g() != null) {
            return networkConfig.g();
        }
        return b.c(networkConfig.i().g());
    }

    @Override // com.google.android.ads.mediationtestsuite.dataobjects.Matchable
    public boolean c(CharSequence charSequence) {
        String lowerCase = charSequence.toString().toLowerCase();
        if (this.name.toLowerCase(Locale.getDefault()).startsWith(lowerCase)) {
            return true;
        }
        for (NetworkConfig networkConfig : h()) {
            if (networkConfig.c(lowerCase)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.ads.mediationtestsuite.dataobjects.ConfigurationItem
    public String e() {
        return this.name;
    }

    @Override // com.google.android.ads.mediationtestsuite.dataobjects.ConfigurationItem
    public String g() {
        return this.name;
    }

    @Override // com.google.android.ads.mediationtestsuite.dataobjects.ConfigurationItem
    public List<NetworkConfig> h() {
        return this.networkConfigs;
    }

    void n(NetworkConfig networkConfig) {
        this.networkConfigs.add(networkConfig);
        m(networkConfig);
    }

    public YieldPartner(String str) {
        this.name = str;
    }
}
