package com.ironsource.sdk.utils;

import android.text.TextUtils;
import android.util.Log;
import com.ironsource.sdk.g.d;

/* loaded from: classes3.dex */
public class Logger {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f28239a;

    public static void d(String str, String str2) {
        if (f28239a) {
            Log.d(str, str2);
        }
    }

    public static void d(String str, String str2, Throwable th) {
        if (f28239a) {
            Log.d(str, str2, th);
        }
    }

    public static void e(String str, String str2) {
        if (f28239a) {
            Log.e(str, str2);
        }
    }

    public static void e(String str, String str2, Throwable th) {
        if (f28239a) {
            Log.e(str, str2, th);
        }
    }

    public static void enableLogging(int i10) {
        f28239a = d.EnumC0353d.MODE_0.f28179d != i10;
    }

    public static void i(String str, String str2) {
        if (f28239a) {
            Log.i(str, str2);
        }
    }

    public static void i(String str, String str2, Throwable th) {
        if (!f28239a || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.i(str, str2, th);
    }

    public static void v(String str, String str2) {
        if (f28239a) {
            Log.v(str, str2);
        }
    }

    public static void v(String str, String str2, Throwable th) {
        if (f28239a) {
            Log.v(str, str2, th);
        }
    }

    public static void w(String str, String str2) {
        if (f28239a) {
            Log.w(str, str2);
        }
    }

    public static void w(String str, String str2, Throwable th) {
        if (f28239a) {
            Log.w(str, str2, th);
        }
    }
}
