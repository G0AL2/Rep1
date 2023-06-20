package com.chartboost.sdk.impl;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.chartboost.sdk.Libraries.CBLogging;

/* loaded from: classes.dex */
public class c1 {
    private TelephonyManager b(Context context) {
        if (context != null) {
            try {
                return (TelephonyManager) context.getSystemService("phone");
            } catch (Exception e10) {
                CBLogging.b("CarrierBuilder", "Unable to retrieve TELEPHONY_SERVICE " + e10.toString());
                return null;
            }
        }
        return null;
    }

    private boolean c(Context context) {
        return context != null && androidx.core.content.b.a(context, "android.permission.READ_PHONE_STATE") == -1;
    }

    public b1 a(Context context) {
        String str;
        String str2;
        if (c(context)) {
            CBLogging.a("CarrierBuilder", "Permission READ_PHONE_STATE not granted");
            return null;
        }
        TelephonyManager b10 = b(context);
        if (a(b10)) {
            String simOperator = b10.getSimOperator();
            if (TextUtils.isEmpty(simOperator)) {
                str = null;
                str2 = null;
            } else {
                str = simOperator.substring(0, 3);
                str2 = simOperator.substring(3);
            }
            return new b1(simOperator, str, str2, b10.getNetworkOperatorName(), b10.getNetworkCountryIso(), b10.getPhoneType());
        }
        return null;
    }

    private boolean a(TelephonyManager telephonyManager) {
        return (telephonyManager == null || telephonyManager.getPhoneType() == 0 || telephonyManager.getSimState() != 5) ? false : true;
    }
}
