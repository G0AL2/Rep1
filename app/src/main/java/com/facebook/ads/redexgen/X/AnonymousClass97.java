package com.facebook.ads.redexgen.X;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* renamed from: com.facebook.ads.redexgen.X.97  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class AnonymousClass97 implements SensorEventListener {
    public AnonymousClass97() {
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] unused = AnonymousClass98.A0A = sensorEvent.values;
        AnonymousClass98.A07();
    }
}
