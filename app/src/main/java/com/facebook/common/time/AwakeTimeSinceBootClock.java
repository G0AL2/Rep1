package com.facebook.common.time;

import android.os.SystemClock;
import f4.b;
import y3.d;

@d
/* loaded from: classes.dex */
public class AwakeTimeSinceBootClock implements b {
    @d
    private static final AwakeTimeSinceBootClock INSTANCE = new AwakeTimeSinceBootClock();

    private AwakeTimeSinceBootClock() {
    }

    @d
    public static AwakeTimeSinceBootClock get() {
        return INSTANCE;
    }

    @Override // f4.b
    @d
    public long now() {
        return SystemClock.uptimeMillis();
    }

    @d
    public long nowNanos() {
        return System.nanoTime();
    }
}
