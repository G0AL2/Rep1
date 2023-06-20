package com.unity3d.scar.adapter.common;

import android.os.Handler;
import android.os.Looper;

/* compiled from: Utils.java */
/* loaded from: classes3.dex */
public class k {
    public static void a(Runnable runnable) {
        b(runnable, 0L);
    }

    public static void b(Runnable runnable, long j10) {
        new Handler(Looper.getMainLooper()).postDelayed(runnable, j10);
    }
}
