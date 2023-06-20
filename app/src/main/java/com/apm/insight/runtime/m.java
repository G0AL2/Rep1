package com.apm.insight.runtime;

import com.apm.insight.MonitorCrash;

/* loaded from: classes.dex */
public class m {

    /* renamed from: a  reason: collision with root package name */
    private static MonitorCrash f6635a = null;

    /* renamed from: b  reason: collision with root package name */
    private static int f6636b = -1;

    /* renamed from: c  reason: collision with root package name */
    private static int f6637c;

    public static MonitorCrash a() {
        if (f6635a == null) {
            MonitorCrash initSDK = MonitorCrash.initSDK(com.apm.insight.h.g(), "239017", 1030820L, "1.3.8.nourl-alpha.0", "com.apm.insight");
            f6635a = initSDK;
            initSDK.config().setChannel("release");
        }
        return f6635a;
    }

    public static void a(Throwable th, String str) {
        if (com.apm.insight.h.g() != null && b()) {
            a().reportCustomErr(str, "INNER", th);
        }
    }

    private static boolean b() {
        if (f6636b == -1) {
            f6636b = 5;
        }
        int i10 = f6637c;
        if (i10 < f6636b) {
            f6637c = i10 + 1;
            return true;
        }
        return false;
    }
}
