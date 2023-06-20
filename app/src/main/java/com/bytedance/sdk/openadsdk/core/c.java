package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: AdPreference.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private static volatile c f11987a;

    /* renamed from: b  reason: collision with root package name */
    private final SharedPreferences f11988b;

    private c(Context context) {
        this.f11988b = context.getSharedPreferences("ttopenadsdk", 0);
    }

    public static c a(Context context) {
        if (f11987a == null) {
            synchronized (c.class) {
                if (f11987a == null) {
                    f11987a = new c(context);
                }
            }
        }
        return f11987a;
    }

    public void a(String str, int i10) {
        if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
            com.bytedance.sdk.openadsdk.multipro.d.a.a("ttopenadsdk", str, Integer.valueOf(i10));
        } else {
            this.f11988b.edit().putInt(str, i10).apply();
        }
    }

    public void a(String str, long j10) {
        if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
            com.bytedance.sdk.openadsdk.multipro.d.a.a("ttopenadsdk", str, Long.valueOf(j10));
        } else {
            this.f11988b.edit().putLong(str, j10).apply();
        }
    }

    public void a(String str, String str2) {
        if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
            com.bytedance.sdk.openadsdk.multipro.d.a.a("ttopenadsdk", str, str2);
        } else {
            this.f11988b.edit().putString(str, str2).apply();
        }
    }

    public void a(String str, boolean z10) {
        if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
            com.bytedance.sdk.openadsdk.multipro.d.a.a("ttopenadsdk", str, Boolean.valueOf(z10));
        } else {
            this.f11988b.edit().putBoolean(str, z10).apply();
        }
    }

    public int b(String str, int i10) {
        return com.bytedance.sdk.openadsdk.multipro.b.c() ? com.bytedance.sdk.openadsdk.multipro.d.a.a("ttopenadsdk", str, i10) : this.f11988b.getInt(str, i10);
    }

    public Long b(String str, long j10) {
        return Long.valueOf(com.bytedance.sdk.openadsdk.multipro.b.c() ? com.bytedance.sdk.openadsdk.multipro.d.a.a("ttopenadsdk", str, j10) : this.f11988b.getLong(str, j10));
    }

    public String b(String str, String str2) {
        return com.bytedance.sdk.openadsdk.multipro.b.c() ? com.bytedance.sdk.openadsdk.multipro.d.a.b("ttopenadsdk", str, str2) : this.f11988b.getString(str, str2);
    }

    public boolean b(String str, boolean z10) {
        return com.bytedance.sdk.openadsdk.multipro.b.c() ? com.bytedance.sdk.openadsdk.multipro.d.a.a("ttopenadsdk", str, z10) : this.f11988b.getBoolean(str, z10);
    }
}
