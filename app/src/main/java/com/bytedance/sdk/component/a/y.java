package com.bytedance.sdk.component.a;

import android.text.TextUtils;

/* compiled from: SerializeHelper.java */
/* loaded from: classes.dex */
class y {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f9314a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(Throwable th) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{\"code\":");
        sb2.append(th instanceof s ? ((s) th).f9282a : 0);
        sb2.append("}");
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "{\"code\":1}";
        }
        String substring = f9314a ? str.substring(1, str.length() - 1) : "";
        String str2 = "{\"code\":1,\"__data\":" + str;
        if (!substring.isEmpty()) {
            return str2 + "," + substring + "}";
        }
        return str2 + "}";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(boolean z10) {
        f9314a = z10;
    }
}
