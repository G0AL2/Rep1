package com.chartboost.sdk.impl;

import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.Libraries.CBLogging;
import com.chartboost.sdk.Privacy.model.DataUseConsent;

/* loaded from: classes.dex */
public class e2 {

    /* renamed from: a  reason: collision with root package name */
    public static Chartboost.CBPIDataUseConsent f13964a = Chartboost.CBPIDataUseConsent.UNKNOWN;

    public static int a() {
        return Math.max(0, f13964a.getValue());
    }

    public static int b() {
        return f13964a == Chartboost.CBPIDataUseConsent.UNKNOWN ? 0 : 1;
    }

    public static void a(DataUseConsent dataUseConsent) {
        if ("gdpr".equals(dataUseConsent.getPrivacyStandard())) {
            try {
                a(Integer.parseInt((String) dataUseConsent.getConsent()));
            } catch (NumberFormatException unused) {
                CBLogging.b("PrivacyManager", "Cannot parse consent while setting GDPR");
            }
        }
    }

    public static void a(String str) {
        if ("gdpr".equals(str)) {
            a(Chartboost.CBPIDataUseConsent.UNKNOWN.getValue());
        }
    }

    public static void a(int i10) {
        Chartboost.CBPIDataUseConsent valueOf = Chartboost.CBPIDataUseConsent.valueOf(i10);
        f13964a = valueOf;
        if (valueOf == Chartboost.CBPIDataUseConsent.UNKNOWN) {
            CBLogging.e("PrivacyManager", "setPersonalInformationDataUseConsent set consent to UNKNOWN");
        }
    }
}
