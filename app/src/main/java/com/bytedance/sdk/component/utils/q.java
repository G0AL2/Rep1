package com.bytedance.sdk.component.utils;

/* compiled from: Predicate.java */
/* loaded from: classes.dex */
public class q {
    public static void a(boolean z10, String str) {
        if (z10) {
            return;
        }
        a(str);
    }

    private static void a(String str) {
        throw new IllegalArgumentException(str);
    }
}
