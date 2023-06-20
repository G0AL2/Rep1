package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdzk implements SensorEventListener {
    private final Context zza;
    private SensorManager zzb;
    private Sensor zzc;
    private long zzd;
    private int zze;
    private zzdzj zzf;
    private boolean zzg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdzk(Context context) {
        this.zza = context;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhz)).booleanValue()) {
            float[] fArr = sensorEvent.values;
            float f10 = fArr[0] / 9.80665f;
            float f11 = fArr[1] / 9.80665f;
            float f12 = fArr[2] / 9.80665f;
            if (((float) Math.sqrt((f10 * f10) + (f11 * f11) + (f12 * f12))) < ((Float) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhA)).floatValue()) {
                return;
            }
            long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis();
            if (this.zzd + ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhB)).intValue() > currentTimeMillis) {
                return;
            }
            if (this.zzd + ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhC)).intValue() < currentTimeMillis) {
                this.zze = 0;
            }
            com.google.android.gms.ads.internal.util.zze.zza("Shake detected.");
            this.zzd = currentTimeMillis;
            int i10 = this.zze + 1;
            this.zze = i10;
            zzdzj zzdzjVar = this.zzf;
            if (zzdzjVar != null) {
                if (i10 == ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhD)).intValue()) {
                    zzdzb zzdzbVar = (zzdzb) zzdzjVar;
                    zzdzbVar.zzg(new zzdyy(zzdzbVar), zzdza.GESTURE);
                }
            }
        }
    }

    public final void zza() {
        synchronized (this) {
            if (this.zzg) {
                SensorManager sensorManager = this.zzb;
                if (sensorManager != null) {
                    sensorManager.unregisterListener(this, this.zzc);
                    com.google.android.gms.ads.internal.util.zze.zza("Stopped listening for shake gestures.");
                }
                this.zzg = false;
            }
        }
    }

    public final void zzb() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhz)).booleanValue()) {
                if (this.zzb == null) {
                    SensorManager sensorManager2 = (SensorManager) this.zza.getSystemService("sensor");
                    this.zzb = sensorManager2;
                    if (sensorManager2 == null) {
                        zzcfi.zzj("Shake detection failed to initialize. Failed to obtain accelerometer.");
                        return;
                    }
                    this.zzc = sensorManager2.getDefaultSensor(1);
                }
                if (!this.zzg && (sensorManager = this.zzb) != null && (sensor = this.zzc) != null) {
                    sensorManager.registerListener(this, sensor, 2);
                    this.zzd = com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis() - ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhB)).intValue();
                    this.zzg = true;
                    com.google.android.gms.ads.internal.util.zze.zza("Listening for shake gestures.");
                }
            }
        }
    }

    public final void zzc(zzdzj zzdzjVar) {
        this.zzf = zzdzjVar;
    }
}
