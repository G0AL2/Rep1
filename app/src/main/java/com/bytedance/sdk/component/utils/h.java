package com.bytedance.sdk.component.utils;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;

/* compiled from: HandlerUtils.java */
/* loaded from: classes.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    private static volatile HandlerThread f10453a = new HandlerThread("tt_pangle_thread_io_handler");

    /* renamed from: b  reason: collision with root package name */
    private static volatile Handler f10454b;

    /* renamed from: c  reason: collision with root package name */
    private static volatile Handler f10455c;

    static {
        f10453a.start();
        f10455c = new Handler(f10453a.getLooper());
    }

    public static Handler a() {
        if (f10453a == null || !f10453a.isAlive()) {
            synchronized (h.class) {
                if (f10453a == null || !f10453a.isAlive()) {
                    f10453a = new HandlerThread("tt_pangle_thread_io_handler");
                    f10453a.start();
                    f10455c = new Handler(f10453a.getLooper());
                }
            }
        }
        return f10455c;
    }

    public static Handler b() {
        if (f10454b == null) {
            synchronized (h.class) {
                if (f10454b == null) {
                    f10454b = new Handler(Looper.getMainLooper());
                }
            }
        }
        return f10454b;
    }
}
