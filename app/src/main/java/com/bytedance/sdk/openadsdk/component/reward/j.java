package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.m;
import org.json.JSONObject;

/* compiled from: SpCache.java */
/* loaded from: classes.dex */
class j {

    /* renamed from: a  reason: collision with root package name */
    private String f11667a;

    /* renamed from: b  reason: collision with root package name */
    private Context f11668b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(Context context, String str) {
        this.f11668b = context;
        this.f11667a = TextUtils.isEmpty(str) ? "" : str;
    }

    private Context b() {
        Context context = this.f11668b;
        return context == null ? m.a() : context;
    }

    private String c() {
        return this.f11667a + "_adslot";
    }

    private String d() {
        return this.f11667a + "_adslot_preload";
    }

    private SharedPreferences f(String str) {
        try {
            if (b() != null) {
                return b().getSharedPreferences(str, 0);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    private String g(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "0";
        }
        return this.f11667a + "_cache_" + str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String a(String str) {
        if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
            return com.bytedance.sdk.openadsdk.multipro.d.a.b(g(str), "material_data", (String) null);
        }
        SharedPreferences f10 = f(g(str));
        if (f10 != null) {
            return f10.getString("material_data", null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AdSlot e(String str) {
        String string;
        try {
            if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
                string = com.bytedance.sdk.openadsdk.multipro.d.a.b(c(), str, (String) null);
            } else {
                SharedPreferences f10 = f(c());
                string = f10 != null ? f10.getString(str, null) : null;
            }
            return AdSlot.getSlot(string != null ? new JSONObject(string) : null);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long b(String str) {
        try {
            if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
                return com.bytedance.sdk.openadsdk.multipro.d.a.a(g(str), "create_time", 0L);
            }
            SharedPreferences f10 = f(g(str));
            if (f10 != null) {
                return f10.getLong("create_time", 0L);
            }
            return 0L;
        } catch (Throwable unused) {
            return 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c(String str) {
        if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
            return com.bytedance.sdk.openadsdk.multipro.d.a.a(g(str), "has_played", true);
        }
        SharedPreferences f10 = f(g(str));
        if (f10 != null) {
            return f10.getBoolean("has_played", true);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(String str) {
        try {
            if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
                com.bytedance.sdk.openadsdk.multipro.d.a.a(g(str));
                return;
            }
            SharedPreferences f10 = f(g(str));
            if (f10 != null) {
                f10.edit().clear().apply();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str, String str2) {
        try {
            if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
                com.bytedance.sdk.openadsdk.multipro.d.a.a(g(str), "has_played", Boolean.FALSE);
                com.bytedance.sdk.openadsdk.multipro.d.a.a(g(str), "create_time", Long.valueOf(System.currentTimeMillis()));
                com.bytedance.sdk.openadsdk.multipro.d.a.a(g(str), "material_data", str2);
                return;
            }
            SharedPreferences f10 = f(g(str));
            if (f10 != null) {
                f10.edit().putBoolean("has_played", false).putLong("create_time", System.currentTimeMillis()).putString("material_data", str2).apply();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(AdSlot adSlot) {
        if (adSlot != null) {
            try {
                if (!TextUtils.isEmpty(adSlot.getCodeId())) {
                    String jSONObject = adSlot.toJsonObj().toString();
                    if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
                        com.bytedance.sdk.openadsdk.multipro.d.a.a(d(), "preload_data", jSONObject);
                    } else {
                        SharedPreferences f10 = f(d());
                        if (f10 != null) {
                            f10.edit().putString("preload_data", jSONObject).apply();
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(AdSlot adSlot) {
        if (adSlot != null) {
            try {
                if (!TextUtils.isEmpty(adSlot.getCodeId())) {
                    String jSONObject = adSlot.toJsonObj().toString();
                    if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
                        com.bytedance.sdk.openadsdk.multipro.d.a.a(c(), adSlot.getCodeId(), jSONObject);
                    } else {
                        SharedPreferences f10 = f(c());
                        if (f10 != null) {
                            f10.edit().putString(adSlot.getCodeId(), jSONObject).apply();
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AdSlot a() {
        String str;
        try {
            if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
                str = com.bytedance.sdk.openadsdk.multipro.d.a.b(d(), "preload_data", (String) null);
                com.bytedance.sdk.openadsdk.multipro.d.a.a(d());
            } else {
                SharedPreferences f10 = f(d());
                if (f10 != null) {
                    String string = f10.getString("preload_data", null);
                    f10.edit().clear().apply();
                    str = string;
                } else {
                    str = null;
                }
            }
            return AdSlot.getSlot(str != null ? new JSONObject(str) : null);
        } catch (Throwable unused) {
            return null;
        }
    }
}
