package com.chartboost.sdk.impl;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.provider.Settings;
import android.util.DisplayMetrics;
import java.util.UUID;

/* loaded from: classes.dex */
public class i1 {

    /* renamed from: a  reason: collision with root package name */
    private static int f14079a = 4;

    /* renamed from: b  reason: collision with root package name */
    private static int f14080b = 5;

    public static String a(Context context, boolean z10) {
        String a10 = a(context);
        return (z10 || a10 == null) ? c(context) : a10;
    }

    public static Integer b(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        float f10 = displayMetrics.heightPixels / displayMetrics.ydpi;
        float f11 = displayMetrics.widthPixels / displayMetrics.xdpi;
        if (Math.sqrt((f11 * f11) + (f10 * f10)) >= 6.5d) {
            return Integer.valueOf(f14080b);
        }
        return Integer.valueOf(f14079a);
    }

    private static String c(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("cbPrefs", 0);
        if (sharedPreferences == null) {
            return UUID.randomUUID().toString();
        }
        String string = sharedPreferences.getString("cbUUID", null);
        if (string != null) {
            return string;
        }
        String uuid = UUID.randomUUID().toString();
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (edit != null) {
            edit.putString("cbUUID", uuid).apply();
        }
        return uuid;
    }

    public static String d(Context context) {
        Resources resources;
        Configuration configuration;
        if (context == null || (resources = context.getResources()) == null || (configuration = resources.getConfiguration()) == null) {
            return "phone";
        }
        int i10 = configuration.uiMode & 15;
        int i11 = configuration.screenLayout & 15;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return "phone";
        }
        if (packageManager.hasSystemFeature("org.chromium.arc.device_management")) {
            return "chromebook";
        }
        String str = Build.BRAND;
        if (str != null && str.equals("chromium") && Build.MANUFACTURER.equals("chromium")) {
            return "chromebook";
        }
        String str2 = Build.DEVICE;
        if (str2 == null || !str2.matches(".+_cheets")) {
            if (packageManager.hasSystemFeature("android.hardware.type.watch") || i10 == 6) {
                return "watch";
            }
            if (packageManager.hasSystemFeature("android.hardware.type.television") || i10 == 4) {
                return "tv";
            }
            String str3 = Build.MANUFACTURER;
            return ((str3 == null || !str3.equalsIgnoreCase("Amazon")) && i11 != 4) ? "phone" : "tablet";
        }
        return "chromebook";
    }

    private static boolean e(Context context) {
        try {
            Object obj = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.get("cb.limit.aid");
            if (obj instanceof Integer) {
                return ((Integer) obj).intValue() == 1;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    @SuppressLint({"HardwareIds"})
    private static String a(Context context) {
        ContentResolver contentResolver;
        if (context == null || Build.VERSION.SDK_INT >= 26 || e(context) || (contentResolver = context.getContentResolver()) == null) {
            return null;
        }
        try {
            String string = Settings.Secure.getString(contentResolver, "android_id");
            try {
                if ("9774d56d682e549c".equals(string)) {
                    return null;
                }
            } catch (Exception unused) {
            }
            return string;
        } catch (Exception unused2) {
            return null;
        }
    }
}
