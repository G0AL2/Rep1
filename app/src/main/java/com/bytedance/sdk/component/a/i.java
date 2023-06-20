package com.bytedance.sdk.component.a;

import android.util.Log;

/* compiled from: DebugUtil.java */
/* loaded from: classes.dex */
class i {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f9242a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(boolean z10) {
        f9242a = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(String str) {
        if (f9242a) {
            Log.w("JsBridge2", str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(String str) {
        if (f9242a) {
            Log.i("JsBridge2", str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(String str, Throwable th) {
        if (f9242a) {
            Log.e("JsBridge2", str, th);
            Log.e("JsBridge2", "Stacktrace: " + Log.getStackTraceString(th));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(String str, Throwable th) {
        if (f9242a) {
            Log.w("JsBridge2", str, th);
            Log.w("JsBridge2", "Stacktrace: " + Log.getStackTraceString(th));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(RuntimeException runtimeException) {
        if (f9242a) {
            throw runtimeException;
        }
    }
}
