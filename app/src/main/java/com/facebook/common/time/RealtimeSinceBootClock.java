package com.facebook.common.time;

import android.os.SystemClock;
import f4.b;
import y3.d;

@d
/* loaded from: classes.dex */
public class RealtimeSinceBootClock implements b {

    /* renamed from: a  reason: collision with root package name */
    private static final RealtimeSinceBootClock f14466a = new RealtimeSinceBootClock();

    private RealtimeSinceBootClock() {
    }

    @d
    public static RealtimeSinceBootClock get() {
        return f14466a;
    }

    @Override // f4.b
    public long now() {
        return SystemClock.elapsedRealtime();
    }
}
