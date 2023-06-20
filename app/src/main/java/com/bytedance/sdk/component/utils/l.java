package com.bytedance.sdk.component.utils;

import android.util.Log;

/* compiled from: Logger.java */
/* loaded from: classes.dex */
public class l {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f10458a = false;

    /* renamed from: b  reason: collision with root package name */
    private static int f10459b = 4;

    /* renamed from: c  reason: collision with root package name */
    private static com.bytedance.sdk.component.a f10460c;

    public static void a(int i10) {
        f10459b = i10;
    }

    public static void b() {
        f10458a = true;
        a(3);
    }

    public static boolean c() {
        return f10458a;
    }

    public static void d(String str, String str2) {
        com.bytedance.sdk.component.a aVar = f10460c;
        if (aVar != null) {
            aVar.d(str, str2);
        }
        if (f10458a && str2 != null && f10459b <= 5) {
            Log.w(str, str2);
        }
    }

    public static void e(String str, String str2) {
        com.bytedance.sdk.component.a aVar = f10460c;
        if (aVar != null) {
            aVar.e(str, str2);
        }
        if (f10458a && str2 != null && f10459b <= 6) {
            Log.e(str, str2);
        }
    }

    public static boolean a() {
        return f10459b <= 3;
    }

    public static void c(String str, String str2) {
        com.bytedance.sdk.component.a aVar = f10460c;
        if (aVar != null) {
            aVar.c(str, str2);
        }
        if (f10458a && str2 != null && f10459b <= 4) {
            Log.i(str, str2);
        }
    }

    public static void a(String str, String str2) {
        com.bytedance.sdk.component.a aVar = f10460c;
        if (aVar != null) {
            aVar.a(str, str2);
        }
        if (f10458a && str2 != null && f10459b <= 2) {
            Log.v(str, str2);
        }
    }

    public static void b(String str, String str2) {
        com.bytedance.sdk.component.a aVar = f10460c;
        if (aVar != null) {
            aVar.b(str, str2);
        }
        if (f10458a && str2 != null && f10459b <= 3) {
            Log.d(str, str2);
        }
    }

    public static void c(String str, String str2, Throwable th) {
        com.bytedance.sdk.component.a aVar = f10460c;
        if (aVar != null) {
            aVar.b(str, str2, th);
        }
        if (f10458a) {
            if (!(str2 == null && th == null) && f10459b <= 6) {
                Log.e(str, str2, th);
            }
        }
    }

    public static void a(String str) {
        if (f10458a) {
            b("Logger", str);
        }
    }

    public static void b(String str, String str2, Throwable th) {
        com.bytedance.sdk.component.a aVar = f10460c;
        if (aVar != null) {
            aVar.a(str, str2, th);
        }
        if (f10458a) {
            if (!(str2 == null && th == null) && f10459b <= 5) {
                Log.w(str, str2, th);
            }
        }
    }

    public static void a(String str, String str2, Throwable th) {
        com.bytedance.sdk.component.a aVar = f10460c;
        if (aVar != null) {
            aVar.b(str, str2 + Log.getStackTraceString(th));
        }
        if (f10458a) {
            if (!(str2 == null && th == null) && f10459b <= 3) {
                Log.d(str, str2, th);
            }
        }
    }

    public static void b(String str, Object... objArr) {
        com.bytedance.sdk.component.a aVar = f10460c;
        if (aVar != null) {
            aVar.d(str, a(objArr));
        }
        if (f10458a && objArr != null && f10459b <= 5) {
            Log.v(str, a(objArr));
        }
    }

    public static void a(String str, Object... objArr) {
        com.bytedance.sdk.component.a aVar = f10460c;
        if (aVar != null) {
            aVar.c(str, a(objArr));
        }
        if (f10458a && objArr != null && f10459b <= 4) {
            Log.v(str, a(objArr));
        }
    }

    public static void b(String str) {
        if (f10458a) {
            e("Logger", str);
        }
    }

    private static String a(Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        for (Object obj : objArr) {
            if (obj != null) {
                sb2.append(obj.toString());
            } else {
                sb2.append(" null ");
            }
            sb2.append(" ");
        }
        return sb2.toString();
    }
}
