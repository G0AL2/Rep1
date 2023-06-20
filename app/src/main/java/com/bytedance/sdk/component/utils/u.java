package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: SPUtils.java */
/* loaded from: classes.dex */
public class u {

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, u> f10472a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private SharedPreferences f10473b;

    private u(String str, Context context) {
        if (context != null) {
            this.f10473b = context.getApplicationContext().getSharedPreferences(str, 0);
        }
    }

    public static u a(String str, Context context) {
        if (TextUtils.isEmpty(str)) {
            str = "tt_ad_sdk_sp";
        }
        u uVar = f10472a.get(str);
        if (uVar == null) {
            u uVar2 = new u(str, context);
            f10472a.put(str, uVar2);
            return uVar2;
        }
        return uVar;
    }

    public String b(String str, String str2) {
        try {
            return this.f10473b.getString(str, str2);
        } catch (Throwable unused) {
            return str2;
        }
    }

    public void c(String str) {
        try {
            this.f10473b.edit().remove(str).apply();
        } catch (Throwable unused) {
        }
    }

    public int b(String str) {
        return b(str, -1);
    }

    public int b(String str, int i10) {
        try {
            return this.f10473b.getInt(str, i10);
        } catch (Throwable unused) {
            return i10;
        }
    }

    public long b(String str, long j10) {
        try {
            return this.f10473b.getLong(str, j10);
        } catch (Throwable unused) {
            return j10;
        }
    }

    public void a(String str, String str2) {
        try {
            this.f10473b.edit().putString(str, str2).apply();
        } catch (Throwable unused) {
        }
    }

    public float b(String str, float f10) {
        try {
            return this.f10473b.getFloat(str, f10);
        } catch (Throwable unused) {
            return f10;
        }
    }

    public String a(String str) {
        try {
            return b(str, "");
        } catch (Throwable unused) {
            return null;
        }
    }

    public boolean b(String str, boolean z10) {
        try {
            return this.f10473b.getBoolean(str, z10);
        } catch (Throwable unused) {
            return z10;
        }
    }

    public void a(String str, int i10) {
        try {
            this.f10473b.edit().putInt(str, i10).apply();
        } catch (Throwable unused) {
        }
    }

    public Set<String> b(String str, Set<String> set) {
        try {
            return this.f10473b.getStringSet(str, set);
        } catch (Throwable unused) {
            return set;
        }
    }

    public void a(String str, long j10) {
        try {
            this.f10473b.edit().putLong(str, j10).apply();
        } catch (Throwable unused) {
        }
    }

    public void a(String str, float f10) {
        try {
            this.f10473b.edit().putFloat(str, f10).apply();
        } catch (Throwable unused) {
        }
    }

    public void a(String str, boolean z10) {
        try {
            this.f10473b.edit().putBoolean(str, z10).apply();
        } catch (Throwable unused) {
        }
    }

    public void a(String str, Set<String> set) {
        try {
            this.f10473b.edit().putStringSet(str, set).apply();
        } catch (Throwable unused) {
        }
    }
}
