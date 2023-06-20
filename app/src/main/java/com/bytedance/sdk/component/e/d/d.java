package com.bytedance.sdk.component.e.d;

import android.util.Log;

/* compiled from: NLogger.java */
/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f10396a = false;

    /* renamed from: b  reason: collision with root package name */
    private static int f10397b = 4;

    public static void a(String str) {
        a("NetLog", str);
    }

    public static void b(String str, String str2) {
        if (f10396a && str2 != null && f10397b <= 4) {
            Log.i(str, str2);
        }
    }

    public static void a(String str, String str2) {
        if (f10396a && str2 != null && f10397b <= 2) {
            Log.v(str, str2);
        }
    }
}
