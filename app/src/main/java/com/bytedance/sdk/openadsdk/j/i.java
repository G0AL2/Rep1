package com.bytedance.sdk.openadsdk.j;

import android.content.Context;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Vibrator;

/* compiled from: SensorHub.java */
/* loaded from: classes.dex */
public class i {

    /* renamed from: a  reason: collision with root package name */
    private static SensorManager f13434a;

    private static int a(int i10) {
        if (i10 == 0 || i10 == 1 || i10 == 2 || i10 == 3) {
            return i10;
        }
        return 2;
    }

    public static void a(Context context, SensorEventListener sensorEventListener, int i10) {
        if (sensorEventListener == null || context == null) {
            return;
        }
        try {
            SensorManager b10 = b(context);
            b10.registerListener(sensorEventListener, b10.getDefaultSensor(1), a(i10));
        } catch (Throwable th) {
            f.a("SensorHub", "startListenAccelerometer error", th);
        }
    }

    private static SensorManager b(Context context) {
        if (f13434a == null) {
            synchronized (i.class) {
                if (f13434a == null) {
                    f13434a = (SensorManager) context.getSystemService("sensor");
                }
            }
        }
        return f13434a;
    }

    public static void a(Context context, SensorEventListener sensorEventListener) {
        if (sensorEventListener == null || context == null) {
            return;
        }
        try {
            b(context).unregisterListener(sensorEventListener);
        } catch (Throwable th) {
            f.a("SensorHub", "stopListen error", th);
        }
    }

    public static void a(Context context) {
        if (context == null) {
            return;
        }
        ((Vibrator) context.getSystemService("vibrator")).vibrate(300L);
    }

    public static void b(Context context, SensorEventListener sensorEventListener, int i10) {
        if (sensorEventListener == null || context == null) {
            return;
        }
        try {
            SensorManager b10 = b(context);
            b10.registerListener(sensorEventListener, b10.getDefaultSensor(4), a(i10));
        } catch (Throwable th) {
            f.a("SensorHub", "startListenGyroscope error", th);
        }
    }
}
