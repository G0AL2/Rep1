package com.fyber.inneractive.sdk.util;

/* loaded from: classes2.dex */
public enum k0 {
    UNKNOWN(""),
    ETHERNET("3g"),
    WIFI("wifi"),
    MOBILE_3G("3g"),
    MOBILE_4G("4g");
    

    /* renamed from: a  reason: collision with root package name */
    public final String f20300a;

    k0(String str) {
        this.f20300a = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.fyber.inneractive.sdk.util.k0 f() {
        /*
            android.app.Application r0 = com.fyber.inneractive.sdk.util.l.f20301a     // Catch: java.lang.Exception -> L1d
            java.lang.String r1 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch: java.lang.Exception -> L1d
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch: java.lang.Exception -> L1d
            java.lang.String r1 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r1 = com.fyber.inneractive.sdk.util.l.b(r1)     // Catch: java.lang.Exception -> L1d
            if (r1 == 0) goto L1d
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch: java.lang.Exception -> L1d
            if (r0 == 0) goto L1d
            int r0 = r0.getType()     // Catch: java.lang.Exception -> L1d
            goto L1f
        L1d:
            r0 = 8
        L1f:
            r1 = 9
            if (r0 == r1) goto L48
            if (r0 == 0) goto L3a
            r1 = 1
            if (r0 == r1) goto L37
            r1 = 2
            if (r0 == r1) goto L3a
            r1 = 3
            if (r0 == r1) goto L3a
            r1 = 4
            if (r0 == r1) goto L3a
            r1 = 5
            if (r0 == r1) goto L3a
            com.fyber.inneractive.sdk.util.k0 r0 = com.fyber.inneractive.sdk.util.k0.UNKNOWN
            return r0
        L37:
            com.fyber.inneractive.sdk.util.k0 r0 = com.fyber.inneractive.sdk.util.k0.WIFI
            return r0
        L3a:
            int r0 = com.fyber.inneractive.sdk.util.k.i()
            r1 = 13
            if (r0 != r1) goto L45
            com.fyber.inneractive.sdk.util.k0 r0 = com.fyber.inneractive.sdk.util.k0.MOBILE_4G
            goto L47
        L45:
            com.fyber.inneractive.sdk.util.k0 r0 = com.fyber.inneractive.sdk.util.k0.MOBILE_3G
        L47:
            return r0
        L48:
            com.fyber.inneractive.sdk.util.k0 r0 = com.fyber.inneractive.sdk.util.k0.ETHERNET
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.util.k0.f():com.fyber.inneractive.sdk.util.k0");
    }
}
