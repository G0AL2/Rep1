package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;

/* compiled from: ExternalSpUtils.java */
/* loaded from: classes.dex */
public class f {
    public static void a(String str) {
        a("any_door_id", str);
    }

    private static String b(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
                return com.bytedance.sdk.openadsdk.multipro.d.a.b((String) null, str, str2);
            }
            return com.bytedance.sdk.component.utils.u.a("", com.bytedance.sdk.openadsdk.core.m.a()).b(str, str2);
        } catch (Throwable unused) {
            return str2;
        }
    }

    public static String a() {
        return b("any_door_id", null);
    }

    private static void a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
                com.bytedance.sdk.openadsdk.multipro.d.a.a(str, str2);
            } else {
                com.bytedance.sdk.component.utils.u.a("", com.bytedance.sdk.openadsdk.core.m.a()).a(str, str2);
            }
        } catch (Throwable unused) {
        }
    }
}
