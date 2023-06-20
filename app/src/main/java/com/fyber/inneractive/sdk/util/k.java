package com.fyber.inneractive.sdk.util;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;

/* loaded from: classes2.dex */
public class k extends l {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f20293c = 0;

    public static boolean a(Intent intent) {
        int i10;
        try {
            i10 = l.f20301a.getPackageManager().queryIntentActivities(intent, 0).size();
        } catch (Throwable unused) {
            i10 = 0;
        }
        return i10 > 0;
    }

    public static String g() {
        try {
            return ((TelephonyManager) l.f20301a.getSystemService("phone")).getNetworkCountryIso();
        } catch (Exception unused) {
            return null;
        }
    }

    public static String h() {
        return Build.MANUFACTURER + " " + Build.MODEL;
    }

    @SuppressLint({"MissingPermission"})
    public static int i() {
        try {
            if (l.b("android.permission.READ_PHONE_STATE")) {
                TelephonyManager telephonyManager = (TelephonyManager) l.f20301a.getSystemService("phone");
                return Build.VERSION.SDK_INT >= 24 ? telephonyManager.getDataNetworkType() : telephonyManager.getNetworkType();
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static String j() {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) l.f20301a.getSystemService("phone");
            String networkOperator = telephonyManager.getNetworkOperator();
            if (telephonyManager.getPhoneType() == 2) {
                TelephonyManager telephonyManager2 = (TelephonyManager) l.f20301a.getSystemService("phone");
                return telephonyManager2 != null && telephonyManager2.getSimState() == 5 ? telephonyManager.getSimOperator() : networkOperator;
            }
            return networkOperator;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String k() {
        return l.f20301a.getPackageName();
    }

    public static String l() {
        try {
            return l.f20301a.getPackageManager().getPackageInfo(l.f20301a.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean m() {
        try {
            if (l.f20301a.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", l.f20301a.getPackageName()) != 0) {
                return false;
            }
            ConnectivityManager connectivityManager = (ConnectivityManager) l.f20301a.getSystemService("connectivity");
            if (connectivityManager.getNetworkInfo(1).getState() != NetworkInfo.State.CONNECTED) {
                return connectivityManager.getNetworkInfo(1).getState() == NetworkInfo.State.CONNECTING;
            }
            return true;
        } catch (Exception e10) {
            IAlog.b("%sUnable to check whether device is connected to wifi: %s", IAlog.a((Class<?>) k.class), e10.getMessage());
            return false;
        }
    }

    public static boolean n() {
        return "mounted".equals(l.b()) && l.f20301a.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    public static boolean o() {
        boolean z10 = (l.f20301a.getResources().getConfiguration().screenLayout & 15) == 4;
        IAlog.d("This device has a tablet resolution? %s", Boolean.valueOf(z10));
        return z10;
    }
}
