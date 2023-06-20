package com.applovin.sdk;

import android.content.Context;
import com.applovin.impl.sdk.j;
import com.applovin.impl.sdk.v;

/* loaded from: classes.dex */
public class AppLovinPrivacySettings {
    public static boolean hasUserConsent(Context context) {
        v.f("AppLovinPrivacySettings", "hasUserConsent()");
        Boolean a10 = j.b().a(context);
        if (a10 != null) {
            return a10.booleanValue();
        }
        return false;
    }

    public static boolean isAgeRestrictedUser(Context context) {
        v.f("AppLovinPrivacySettings", "isAgeRestrictedUser()");
        Boolean a10 = j.a().a(context);
        if (a10 != null) {
            return a10.booleanValue();
        }
        return false;
    }

    public static boolean isAgeRestrictedUserSet(Context context) {
        v.f("AppLovinPrivacySettings", "isAgeRestrictedUserSet()");
        return j.a().a(context) != null;
    }

    public static boolean isDoNotSell(Context context) {
        v.f("AppLovinPrivacySettings", "isDoNotSell()");
        Boolean a10 = j.c().a(context);
        if (a10 != null) {
            return a10.booleanValue();
        }
        return false;
    }

    public static boolean isDoNotSellSet(Context context) {
        v.f("AppLovinPrivacySettings", "isDoNotSellSet()");
        return j.c().a(context) != null;
    }

    public static boolean isUserConsentSet(Context context) {
        v.f("AppLovinPrivacySettings", "isUserConsentSet()");
        return j.b().a(context) != null;
    }

    public static void setDoNotSell(boolean z10, Context context) {
        v.f("AppLovinPrivacySettings", "setDoNotSell()");
        if (j.c(z10, context)) {
            AppLovinSdk.reinitializeAll(null, null, Boolean.valueOf(z10));
        }
    }

    public static void setHasUserConsent(boolean z10, Context context) {
        v.f("AppLovinPrivacySettings", "setHasUserConsent()");
        if (j.b(z10, context)) {
            AppLovinSdk.reinitializeAll(Boolean.valueOf(z10), null, null);
        }
    }

    public static void setIsAgeRestrictedUser(boolean z10, Context context) {
        v.f("AppLovinPrivacySettings", "setIsAgeRestrictedUser()");
        if (j.a(z10, context)) {
            AppLovinSdk.reinitializeAll(null, Boolean.valueOf(z10), null);
        }
    }
}
