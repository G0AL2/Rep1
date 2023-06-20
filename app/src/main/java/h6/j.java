package h6;

import android.os.SystemClock;

/* compiled from: SystemClock.java */
/* loaded from: classes.dex */
public class j {
    public static long a() {
        return System.currentTimeMillis();
    }

    public static long b() {
        return System.nanoTime();
    }

    public static long c() {
        return SystemClock.uptimeMillis();
    }
}
