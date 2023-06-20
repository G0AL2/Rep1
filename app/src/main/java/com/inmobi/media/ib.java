package com.inmobi.media;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: DeviceInfo.java */
/* loaded from: classes3.dex */
public class ib {
    public static String a(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        return telephonyManager != null ? telephonyManager.getNetworkOperatorName() : "";
    }

    public static String b() {
        int a10 = a();
        return a10 != 0 ? a10 != 1 ? "NIL" : "wifi" : "carrier";
    }

    @SuppressLint({"MissingPermission", "NewApi"})
    private static String c() {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        Context c10 = ho.c();
        if (c10 == null || !hw.a(c10, "android.permission.ACCESS_NETWORK_STATE") || (connectivityManager = (ConnectivityManager) c10.getSystemService("connectivity")) == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
            return "";
        }
        if (Build.VERSION.SDK_INT < 28) {
            int type = activeNetworkInfo.getType();
            int subtype = activeNetworkInfo.getSubtype();
            if (type == 0) {
                return type + "|" + subtype;
            } else if (type != 1) {
                return Integer.toString(type);
            }
        } else {
            NetworkCapabilities networkCapabilities = null;
            try {
                networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            } catch (SecurityException e10) {
                gg.a().a(new hg(e10));
            }
            if (networkCapabilities == null) {
                return "";
            }
            if (networkCapabilities.hasTransport(0)) {
                return "0|" + activeNetworkInfo.getSubtype();
            } else if (!networkCapabilities.hasTransport(1)) {
                return networkCapabilities.hasTransport(2) ? "7" : networkCapabilities.hasTransport(3) ? "9" : networkCapabilities.hasTransport(4) ? "17" : networkCapabilities.hasTransport(5) ? "10" : networkCapabilities.hasTransport(6) ? "11" : "8";
            }
        }
        return "1";
    }

    public static int b(Context context) {
        return ((AudioManager) context.getSystemService("audio")).getStreamVolume(3);
    }

    public static Map<String, String> a(boolean z10) {
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("os-v", Build.VERSION.RELEASE);
            hashMap.put("d-brand-name", Build.BRAND);
            hashMap.put("d-manufacturer-name", Build.MANUFACTURER);
            hashMap.put("d-model-name", Build.MODEL);
            hashMap.put("d-nettype-raw", c());
            hashMap.put("d-localization", Locale.getDefault().toString());
            hashMap.put("d-language", Locale.getDefault().getLanguage());
            hashMap.put("d-media-volume", String.valueOf(a(ho.c(), z10)));
        } catch (Exception unused) {
        }
        return hashMap;
    }

    public static int a() {
        String c10 = c();
        if (c10.startsWith("0")) {
            return 0;
        }
        return c10.startsWith("1") ? 1 : 2;
    }

    public static int a(Context context, boolean z10) {
        if (context == null || z10) {
            return 0;
        }
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        if (streamMaxVolume == 0) {
            return 0;
        }
        return (streamVolume * 100) / streamMaxVolume;
    }
}
