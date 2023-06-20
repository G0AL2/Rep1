package com.google.android.ads.mediationtestsuite.dataobjects;

import com.google.android.ads.mediationtestsuite.g;
import com.google.android.ads.mediationtestsuite.h;
import com.google.android.ads.mediationtestsuite.utils.c;
import java.util.ArrayList;
import java.util.Collection;
import r7.f;
import s7.b;
import s7.d;
import s7.e;
import s7.k;

/* loaded from: classes2.dex */
public class AdMobProductTheme implements ProductTheme {
    private static final String ADAPTER_INITIALIZATION_ANDROID_URL = "https://googlemobileadssdk.page.link/admob-android-adapter-initialization";
    public static final String ADAPTER_INITIALIZATION_UNITY_URL = "https://googlemobileadssdk.page.link/unity-adapter-initialization";
    private static final String DISCLAIMER_URL = "https://googlemobileadssdk.page.link/mts-admob-disclaimer";
    public static final String REGISTER_TEST_DEVICES_ANDROID_URL = "https://googlemobileadssdk.page.link/admob-android-register-test-device";
    public static final String REGISTER_TEST_DEVICES_UNITY_URL = "https://googlemobileadssdk.page.link/unity-register-test-device";
    private static final String REGISTER_TEST_DEVICE_URL_FORMAT = "https://apps.admob.com/v2/settings/test-devices/create?tdid=%1$s&p=android";

    @Override // com.google.android.ads.mediationtestsuite.dataobjects.ProductTheme
    public int a() {
        return g.f20862i0;
    }

    @Override // com.google.android.ads.mediationtestsuite.dataobjects.ProductTheme
    public int b() {
        return g.f20882s0;
    }

    @Override // com.google.android.ads.mediationtestsuite.dataobjects.ProductTheme
    public k c(NetworkConfig networkConfig) {
        return new k(networkConfig);
    }

    @Override // com.google.android.ads.mediationtestsuite.dataobjects.ProductTheme
    public String d() {
        return com.google.android.ads.mediationtestsuite.utils.k.s().m() ? REGISTER_TEST_DEVICES_UNITY_URL : REGISTER_TEST_DEVICES_ANDROID_URL;
    }

    @Override // com.google.android.ads.mediationtestsuite.dataobjects.ProductTheme
    public String e() {
        return DISCLAIMER_URL;
    }

    @Override // com.google.android.ads.mediationtestsuite.dataobjects.ProductTheme
    public int f() {
        return g.f20893y;
    }

    @Override // com.google.android.ads.mediationtestsuite.dataobjects.ProductTheme
    public String g(String str) {
        return String.format(REGISTER_TEST_DEVICE_URL_FORMAT, str);
    }

    @Override // com.google.android.ads.mediationtestsuite.dataobjects.ProductTheme
    public s7.g h(Collection<ConfigurationItem> collection) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (ConfigurationItem configurationItem : collection) {
            if (configurationItem.j()) {
                arrayList.add(configurationItem);
            } else {
                arrayList2.add(configurationItem);
            }
        }
        e eVar = new e(arrayList, f.a.WORKING, g.P0);
        e eVar2 = new e(arrayList2, f.a.FAILING, g.C);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(eVar2);
        arrayList3.add(eVar);
        return new s7.g(arrayList3);
    }

    @Override // com.google.android.ads.mediationtestsuite.dataobjects.ProductTheme
    public String i() {
        return com.google.android.ads.mediationtestsuite.utils.k.s().m() ? ADAPTER_INITIALIZATION_UNITY_URL : ADAPTER_INITIALIZATION_ANDROID_URL;
    }

    @Override // com.google.android.ads.mediationtestsuite.dataobjects.ProductTheme
    public int j() {
        return g.C0;
    }

    @Override // com.google.android.ads.mediationtestsuite.dataobjects.ProductTheme
    public String k() {
        return "Google AdMob";
    }

    @Override // com.google.android.ads.mediationtestsuite.dataobjects.ProductTheme
    public int l() {
        return g.f20891x;
    }

    @Override // com.google.android.ads.mediationtestsuite.dataobjects.ProductTheme
    public boolean m() {
        return c.f() != null;
    }

    @Override // com.google.android.ads.mediationtestsuite.dataobjects.ProductTheme
    public d<? extends ConfigurationItem> n(ConfigurationItem configurationItem) {
        return new b((AdUnit) configurationItem);
    }

    @Override // com.google.android.ads.mediationtestsuite.dataobjects.ProductTheme
    public int o() {
        return g.f20892x0;
    }

    @Override // com.google.android.ads.mediationtestsuite.dataobjects.ProductTheme
    public int p() {
        return h.f20898b;
    }

    @Override // com.google.android.ads.mediationtestsuite.dataobjects.ProductTheme
    public int q() {
        return g.E0;
    }

    @Override // com.google.android.ads.mediationtestsuite.dataobjects.ProductTheme
    public int r(f.a aVar) {
        return g.f20852d0;
    }
}
