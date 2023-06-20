package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;

/* compiled from: AutoTestUtils.java */
/* loaded from: classes.dex */
public class b {
    public static String a(String str) {
        if (com.bytedance.sdk.component.utils.l.c() && !TextUtils.isEmpty(str)) {
            com.bytedance.sdk.openadsdk.core.e.e eVar = new com.bytedance.sdk.openadsdk.core.e.e(com.bytedance.sdk.openadsdk.core.h.d().n());
            StringBuilder sb2 = new StringBuilder(str);
            for (String str2 : eVar.b()) {
                if (sb2.toString().contains(str2)) {
                    if (sb2.toString().contains("?")) {
                        sb2.append("&");
                        sb2.append(eVar.a());
                    } else {
                        sb2.append("?");
                        sb2.append(eVar.a());
                    }
                }
            }
            return sb2.toString();
        }
        return str;
    }
}
