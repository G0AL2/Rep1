package com.fyber.inneractive.sdk.util;

import com.google.android.gms.measurement.AppMeasurement;

/* loaded from: classes2.dex */
public class r0 {
    public static boolean a(String str) {
        int i10 = com.fyber.inneractive.sdk.config.e.f16935a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.response");
        return property != null && property.trim().length() > 0 && str != null && str.toLowerCase().startsWith("fyberInternalTesting".toLowerCase()) && str.contains(AppMeasurement.CRASH_ORIGIN);
    }
}
