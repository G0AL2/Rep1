package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;

/* compiled from: ShakeUtils.java */
/* loaded from: classes.dex */
public class v implements SensorEventListener {

    /* renamed from: b  reason: collision with root package name */
    private volatile long f10475b;

    /* renamed from: c  reason: collision with root package name */
    private float f10476c;

    /* renamed from: d  reason: collision with root package name */
    private float f10477d;

    /* renamed from: e  reason: collision with root package name */
    private float f10478e;

    /* renamed from: g  reason: collision with root package name */
    private volatile long f10480g;

    /* renamed from: j  reason: collision with root package name */
    private boolean f10483j;

    /* renamed from: k  reason: collision with root package name */
    private SensorManager f10484k;

    /* renamed from: a  reason: collision with root package name */
    private long f10474a = Constants.MIN_PROGRESS_TIME;

    /* renamed from: f  reason: collision with root package name */
    private boolean f10479f = false;

    /* renamed from: h  reason: collision with root package name */
    private float f10481h = 20.0f;

    /* renamed from: i  reason: collision with root package name */
    private float f10482i = 50.0f;

    /* renamed from: l  reason: collision with root package name */
    private a f10485l = null;

    /* compiled from: ShakeUtils.java */
    /* loaded from: classes.dex */
    public interface a {
        void a(int i10);
    }

    public v(Context context) {
        this.f10484k = null;
        this.f10484k = (SensorManager) context.getSystemService("sensor");
    }

    public void a(a aVar) {
        this.f10485l = aVar;
    }

    public void b() {
        SensorManager sensorManager = this.f10484k;
        if (sensorManager == null) {
            return;
        }
        sensorManager.unregisterListener(this);
        this.f10483j = false;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        int type = sensorEvent.sensor.getType();
        float[] fArr = sensorEvent.values;
        float abs = Math.abs(fArr[0]);
        float abs2 = Math.abs(fArr[1]);
        float abs3 = Math.abs(fArr[2]);
        if (type == 1) {
            float f10 = this.f10481h;
            if ((abs > f10 || abs2 > f10 || abs3 > f10) && this.f10485l != null && System.currentTimeMillis() - this.f10475b > this.f10474a) {
                this.f10485l.a(1);
                this.f10475b = System.currentTimeMillis();
            }
        } else if (type != 15) {
        } else {
            float abs4 = Math.abs(fArr[0]);
            float abs5 = Math.abs(fArr[1]);
            float abs6 = Math.abs(fArr[2]);
            if (abs4 == 0.0f && abs5 == 0.0f && abs6 == 0.0f) {
                return;
            }
            if (!this.f10479f) {
                this.f10479f = true;
                this.f10476c = abs4;
                this.f10477d = abs5;
                this.f10478e = abs6;
                return;
            }
            float abs7 = Math.abs(abs5 - this.f10477d) * 180.0f;
            float abs8 = Math.abs(abs6 - this.f10478e) * 180.0f;
            float f11 = this.f10482i;
            if ((Math.abs(abs4 - this.f10476c) * 180.0f > f11 || abs7 > f11 || abs8 > f11) && this.f10485l != null && System.currentTimeMillis() - this.f10480g > this.f10474a) {
                this.f10485l.a(2);
                this.f10480g = System.currentTimeMillis();
            }
        }
    }

    public void a() {
        SensorManager sensorManager = this.f10484k;
        if (sensorManager == null || this.f10483j) {
            return;
        }
        try {
            this.f10479f = false;
            sensorManager.registerListener(this, sensorManager.getDefaultSensor(1), 3);
            if (Build.VERSION.SDK_INT > 18) {
                SensorManager sensorManager2 = this.f10484k;
                sensorManager2.registerListener(this, sensorManager2.getDefaultSensor(15), 1);
            }
            this.f10483j = true;
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void b(float f10) {
        this.f10482i = f10;
    }

    public void a(float f10) {
        this.f10481h = f10;
    }
}
