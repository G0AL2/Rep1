package com.google.android.ads.mediationtestsuite.utils;

/* compiled from: StringUtil.java */
/* loaded from: classes2.dex */
public class j {
    public static boolean a(String str) {
        return str == null || str.trim().isEmpty();
    }

    public static Integer b(String str) {
        try {
            return Integer.valueOf(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            return -1;
        }
    }
}
