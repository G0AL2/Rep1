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
public class i implements SensorEventListener, AppLovinBroadcastManager.Receiver {

    /* renamed from: a  reason: collision with root package name */
    private final com.applovin.impl.sdk.m f8825a;

    /* renamed from: b  reason: collision with root package name */
    private final SensorManager f8826b;

    /* renamed from: c  reason: collision with root package name */
    private final Sensor f8827c;

    /* renamed from: d  reason: collision with root package name */
    private final a f8828d;

    /* renamed from: e  reason: collision with root package name */
    private float f8829e;

    /* loaded from: classes.dex */
    public interface a {
        void b();

        void c();
    }

    public i(com.applovin.impl.sdk.m mVar, a aVar) {
        this.f8825a = mVar;
        SensorManager sensorManager = (SensorManager) mVar.L().getSystemService("sensor");
        this.f8826b = sensorManager;
        this.f8827c = sensorManager.getDefaultSensor(1);
        this.f8828d = aVar;
    }

    public void a() {
        this.f8826b.unregisterListener(this);
        this.f8826b.registerListener(this, this.f8827c, (int) TimeUnit.MILLISECONDS.toMicros(50L));
        this.f8825a.aj().unregisterReceiver(this);
        this.f8825a.aj().registerReceiver(this, new IntentFilter("com.applovin.application_paused"));
        this.f8825a.aj().registerReceiver(this, new IntentFilter("com.applovin.application_resumed"));
    }

    public void b() {
        this.f8825a.aj().unregisterReceiver(this);
        this.f8826b.unregisterListener(this);
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Context context, Intent intent, Map<String, Object> map) {
        String action = intent.getAction();
        if ("com.applovin.application_paused".equals(action)) {
            this.f8826b.unregisterListener(this);
        } else if ("com.applovin.application_resumed".equals(action)) {
            a();
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 1) {
            float max = Math.max(Math.min(sensorEvent.values[2] / 9.81f, 1.0f), -1.0f);
            float f10 = this.f8829e;
            float f11 = (f10 * 0.5f) + (max * 0.5f);
            this.f8829e = f11;
            if (f10 < 0.8f && f11 > 0.8f) {
                this.f8828d.c();
            } else if (f10 <= -0.8f || f11 >= -0.8f) {
            } else {
                this.f8828d.b();
            }
        }
    }
}
