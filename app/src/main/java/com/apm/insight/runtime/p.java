package com.apm.insight.runtime;

import android.os.Handler;
import android.os.HandlerThread;

/* loaded from: classes.dex */
public class p {

    /* renamed from: a  reason: collision with root package name */
    private static volatile u f6651a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile Handler f6652b;

    public static HandlerThread a() {
        if (f6651a == null) {
            synchronized (p.class) {
                if (f6651a == null) {
                    f6651a = new u("default_npth_thread");
                    f6651a.b();
                }
            }
        }
        return f6651a.c();
    }

    public static u b() {
        if (f6651a == null) {
            a();
        }
        return f6651a;
    }
}
