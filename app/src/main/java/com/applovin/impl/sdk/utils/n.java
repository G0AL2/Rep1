package com.applovin.impl.sdk.utils;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class n implements SensorEventListener, AppLovinBroadcastManager.Receiver {

    /* renamed from: a  reason: collision with root package name */
    private final int f8919a;

    /* renamed from: b  reason: collision with root package name */
    private final float f8920b;

    /* renamed from: c  reason: collision with root package name */
    private final SensorManager f8921c;

    /* renamed from: d  reason: collision with root package name */
    private final Sensor f8922d;

    /* renamed from: e  reason: collision with root package name */
    private final Sensor f8923e;

    /* renamed from: f  reason: collision with root package name */
    private final com.applovin.impl.sdk.m f8924f;

    /* renamed from: g  reason: collision with root package name */
    private float[] f8925g;

    /* renamed from: h  reason: collision with root package name */
    private float f8926h;

    public n(com.applovin.impl.sdk.m mVar) {
        this.f8924f = mVar;
        SensorManager sensorManager = (SensorManager) mVar.L().getSystemService("sensor");
        this.f8921c = sensorManager;
        this.f8922d = sensorManager.getDefaultSensor(9);
        this.f8923e = sensorManager.getDefaultSensor(4);
        this.f8919a = ((Integer) mVar.a(com.applovin.impl.sdk.c.b.dR)).intValue();
        this.f8920b = ((Float) mVar.a(com.applovin.impl.sdk.c.b.dQ)).floatValue();
        mVar.aj().registerReceiver(this, new IntentFilter("com.applovin.application_paused"));
        mVar.aj().registerReceiver(this, new IntentFilter("com.applovin.application_resumed"));
    }

    public void a() {
        this.f8921c.unregisterListener(this);
        if (((Boolean) this.f8924f.K().a(com.applovin.impl.sdk.c.b.dO)).booleanValue()) {
            this.f8921c.registerListener(this, this.f8922d, (int) TimeUnit.MILLISECONDS.toMicros(this.f8919a));
        }
        if (((Boolean) this.f8924f.K().a(com.applovin.impl.sdk.c.b.dP)).booleanValue()) {
            this.f8921c.registerListener(this, this.f8923e, (int) TimeUnit.MILLISECONDS.toMicros(this.f8919a));
        }
    }

    public float b() {
        return this.f8926h;
    }

    public float c() {
        float[] fArr = this.f8925g;
        if (fArr == null) {
            return 0.0f;
        }
        return (float) Math.toDegrees(Math.acos(fArr[2] / 9.81f));
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Context context, Intent intent, Map<String, Object> map) {
        String action = intent.getAction();
        if ("com.applovin.application_paused".equals(action)) {
            this.f8921c.unregisterListener(this);
        } else if ("com.applovin.application_resumed".equals(action)) {
            a();
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 9) {
            this.f8925g = sensorEvent.values;
        } else if (sensorEvent.sensor.getType() == 4) {
            float f10 = this.f8926h * this.f8920b;
            this.f8926h = f10;
            this.f8926h = f10 + Math.abs(sensorEvent.values[0]) + Math.abs(sensorEvent.values[1]) + Math.abs(sensorEvent.values[2]);
        }
    }
}
