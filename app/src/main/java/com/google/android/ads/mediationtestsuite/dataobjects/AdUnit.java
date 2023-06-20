package com.google.android.ads.mediationtestsuite.dataobjects;

import com.google.android.ads.mediationtestsuite.utils.b;

/* loaded from: classes2.dex */
public class AdUnit extends SingleFormatConfigurationItem implements Matchable {
    public static final String CUSTOM_EVENT_ADAPTER_CLASS = "com.google.ads.mediation.customevent.CustomEventAdapter";
    public static final String GOOGLE_ADAPTER_CLASS = "com.google.ads.mediation.admob.AdMobAdapter";
    private AdUnitId adUnitId;

    /* renamed from: id  reason: collision with root package name */
    private String f20825id;
    private String mediationGroup;
    private String name;

    public AdUnit(String str, String str2, AdFormat adFormat, MediationConfig mediationConfig) {
        super(adFormat, mediationConfig.a());
        this.f20825id = str;
        this.name = str2;
        this.adUnitId = new AdUnitId(str, str2);
        this.mediationGroup = mediationConfig.b();
        for (NetworkConfig networkConfig : h()) {
            networkConfig.F(str);
        }
    }

    @Override // com.google.android.ads.mediationtestsuite.dataobjects.ConfigurationItem
    public String b(NetworkConfig networkConfig) {
        return b.d(networkConfig.i().g());
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0054 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    @Override // com.google.android.ads.mediationtestsuite.dataobjects.Matchable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean c(java.lang.CharSequence r5) {
        /*
            r4 = this;
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = r5.toLowerCase()
            java.lang.String r0 = r4.g()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L1e
            java.lang.String r0 = r4.g()
            java.lang.String r0 = r0.toLowerCase()
            boolean r0 = r0.contains(r5)
            if (r0 != 0) goto L51
        L1e:
            com.google.android.ads.mediationtestsuite.dataobjects.AdFormat r0 = r4.format
            java.lang.String r0 = r0.getDisplayString()
            java.util.Locale r3 = java.util.Locale.ENGLISH
            java.lang.String r0 = r0.toLowerCase(r3)
            boolean r0 = r0.startsWith(r5)
            if (r0 != 0) goto L51
            java.lang.String r0 = r4.e()
            java.lang.String r0 = r0.toLowerCase(r3)
            boolean r0 = r0.contains(r5)
            if (r0 != 0) goto L51
            java.lang.String r0 = r4.p()
            if (r0 == 0) goto L4f
            java.lang.String r0 = r4.p()
            boolean r0 = r0.contains(r5)
            if (r0 == 0) goto L4f
            goto L51
        L4f:
            r0 = 0
            goto L52
        L51:
            r0 = 1
        L52:
            if (r0 == 0) goto L55
            return r2
        L55:
            java.util.List r0 = r4.h()
            java.util.Iterator r0 = r0.iterator()
        L5d:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L70
            java.lang.Object r3 = r0.next()
            com.google.android.ads.mediationtestsuite.dataobjects.NetworkConfig r3 = (com.google.android.ads.mediationtestsuite.dataobjects.NetworkConfig) r3
            boolean r3 = r3.c(r5)
            if (r3 == 0) goto L5d
            return r2
        L70:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.ads.mediationtestsuite.dataobjects.AdUnit.c(java.lang.CharSequence):boolean");
    }

    @Override // com.google.android.ads.mediationtestsuite.dataobjects.ConfigurationItem
    public String e() {
        return this.f20825id;
    }

    @Override // com.google.android.ads.mediationtestsuite.dataobjects.ConfigurationItem
    public String g() {
        return this.name;
    }

    public String p() {
        return this.mediationGroup;
    }
}
