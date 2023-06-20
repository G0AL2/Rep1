package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: SpAdUtile.java */
/* loaded from: classes.dex */
public class p {
    private static SharedPreferences a(String str) {
        try {
            if (e() != null) {
                return e().getSharedPreferences(str, 0);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static String b() {
        try {
            if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
                return com.bytedance.sdk.openadsdk.multipro.d.a.b(f(), "show_ad_tag", (String) null);
            }
            SharedPreferences a10 = a(f());
            if (a10 != null) {
                return a10.getString("show_ad_tag", null);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static long c() {
        try {
            if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
                return com.bytedance.sdk.openadsdk.multipro.d.a.a(f(), "show_time", 0L);
            }
            SharedPreferences a10 = a(f());
            if (a10 != null) {
                return a10.getLong("show_time", 0L);
            }
            return 0L;
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static void d() {
        try {
            if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
                com.bytedance.sdk.openadsdk.multipro.d.a.a(f());
                return;
            }
            SharedPreferences a10 = a(f());
            if (a10 != null) {
                a10.edit().clear().apply();
            }
        } catch (Throwable unused) {
        }
    }

    private static Context e() {
        return com.bytedance.sdk.openadsdk.core.m.a();
    }

    private static String f() {
        return "sp_last_ad_show_cache_show_ad";
    }

    public static String a() {
        try {
            if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
                return com.bytedance.sdk.openadsdk.multipro.d.a.b(f(), "material_data", (String) null);
            }
            SharedPreferences a10 = a(f());
            if (a10 != null) {
                return a10.getString("material_data", null);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void a(String str, String str2) {
        try {
            if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
                com.bytedance.sdk.openadsdk.multipro.d.a.a(f(), "show_time", Long.valueOf(System.currentTimeMillis()));
                com.bytedance.sdk.openadsdk.multipro.d.a.a(f(), "material_data", str);
                com.bytedance.sdk.openadsdk.multipro.d.a.a(f(), "show_ad_tag", str2);
                return;
            }
            SharedPreferences a10 = a(f());
            if (a10 != null) {
                a10.edit().putLong("show_time", System.currentTimeMillis()).putString("material_data", str).putString("show_ad_tag", str2).apply();
            }
        } catch (Throwable unused) {
        }
    }
}
