package com.google.android.ads.mediationtestsuite.dataobjects;

import com.google.android.ads.mediationtestsuite.g;
import com.google.android.ads.mediationtestsuite.h;
import java.util.ArrayList;
import java.util.Collection;
import org.jspecify.nullness.Nullable;
import r7.f;
import s7.d;
import s7.e;
import s7.k;
import s7.p;
import s7.q;
import s7.s;

/* loaded from: classes2.dex */
public class AdManagerProductTheme implements ProductTheme {
    private static final String ADAPTER_INITIALIZATION_ANDROID_URL = "https://googlemobileadssdk.page.link/ad-manager-android-adapter-initialization";
    private static final String DISCLAIMER_URL = "https://googlemobileadssdk.page.link/mts-ad-manager-disclaimer";
    private static final String REGISTER_TEST_DEVICES_ANDROID_URL = "https://googlemobileadssdk.page.link/ad-manager-android-register-test-device";

    @Override // com.google.android.ads.mediationtestsuite.dataobjects.ProductTheme
    public int a() {
        return g.U0;
    }

    @Override // com.google.android.ads.mediationtestsuite.dataobjects.ProductTheme
    public int b() {
        return g.f20884t0;
    }

    @Override // com.google.android.ads.mediationtestsuite.dataobjects.ProductTheme
    public k c(NetworkConfig networkConfig) {
        if (networkConfig.B()) {
            return new q(networkConfig);
        }
        return new k(networkConfig);
    }

    @Override // com.google.android.ads.mediationtestsuite.dataobjects.ProductTheme
    public String d() {
        return com.google.android.ads.mediationtestsuite.utils.k.s().m() ? AdMobProductTheme.REGISTER_TEST_DEVICES_UNITY_URL : REGISTER_TEST_DEVICES_ANDROID_URL;
    }

    @Override // com.google.android.ads.mediationtestsuite.dataobjects.ProductTheme
    public String e() {
        return DISCLAIMER_URL;
    }

    @Override // com.google.android.ads.mediationtestsuite.dataobjects.ProductTheme
    public int f() {
        return g.B;
    }

    @Override // com.google.android.ads.mediationtestsuite.dataobjects.ProductTheme
    public String g(String str) {
        return null;
    }

    @Override // com.google.android.ads.mediationtestsuite.dataobjects.ProductTheme
    public s7.g h(Collection<ConfigurationItem> collection) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (ConfigurationItem configurationItem : collection) {
            if (configurationItem instanceof YieldGroup) {
                arrayList.add(configurationItem);
            } else if (configurationItem instanceof YieldPartner) {
                arrayList2.add(configurationItem);
            }
        }
        e eVar = new e(arrayList, f.a.YIELD_GROUPS, g.T0);
        e eVar2 = new e(arrayList2, f.a.AD_UNIT_MAPPINGS, g.f20876p0);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(eVar);
        arrayList3.add(eVar2);
        return new s7.g(arrayList3);
    }

    @Override // com.google.android.ads.mediationtestsuite.dataobjects.ProductTheme
    public String i() {
        return com.google.android.ads.mediationtestsuite.utils.k.s().m() ? AdMobProductTheme.ADAPTER_INITIALIZATION_UNITY_URL : ADAPTER_INITIALIZATION_ANDROID_URL;
    }

    @Override // com.google.android.ads.mediationtestsuite.dataobjects.ProductTheme
    public int j() {
        return g.D0;
    }

    @Override // com.google.android.ads.mediationtestsuite.dataobjects.ProductTheme
    public String k() {
        return "Google Ad Manager";
    }

    @Override // com.google.android.ads.mediationtestsuite.dataobjects.ProductTheme
    public int l() {
        return g.A;
    }

    @Override // com.google.android.ads.mediationtestsuite.dataobjects.ProductTheme
    public boolean m() {
        return false;
    }

    @Override // com.google.android.ads.mediationtestsuite.dataobjects.ProductTheme
    @Nullable
    public d<? extends ConfigurationItem> n(ConfigurationItem configurationItem) {
        if (configurationItem instanceof YieldGroup) {
            return new p((YieldGroup) configurationItem);
        }
        if (configurationItem instanceof YieldPartner) {
            return new s((YieldPartner) configurationItem);
        }
        return null;
    }

    @Override // com.google.android.ads.mediationtestsuite.dataobjects.ProductTheme
    public int o() {
        return g.I0;
    }

    @Override // com.google.android.ads.mediationtestsuite.dataobjects.ProductTheme
    public int p() {
        return h.f20897a;
    }

    @Override // com.google.android.ads.mediationtestsuite.dataobjects.ProductTheme
    public int q() {
        return g.F0;
    }

    @Override // com.google.android.ads.mediationtestsuite.dataobjects.ProductTheme
    public int r(f.a aVar) {
        if (aVar == f.a.AD_UNIT_MAPPINGS) {
            return g.f20856f0;
        }
        return g.f20854e0;
    }
}
