package com.vehiclecloud.app.videofetch.extensions;

import android.os.Bundle;
import qe.k;

/* compiled from: FirebaseAnalyticsExtensions.kt */
/* loaded from: classes3.dex */
public final class FirebaseAnalyticsExtensionsKt {
    public static final void putAnalyticsString(Bundle bundle, String str, String str2) {
        k.f(bundle, "<this>");
        k.f(str, "key");
        if (str2 != null) {
            if (str2.length() >= 100) {
                str2 = str2.substring(0, 100);
                k.e(str2, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            bundle.putString(str, str2);
        }
    }
}
