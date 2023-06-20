package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdyn implements SensorEventListener {
    private final SensorManager zza;
    private final Sensor zzb;
    private float zzc = 0.0f;
    private Float zzd = Float.valueOf(0.0f);
    private long zze = com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis();
    private int zzf = 0;
    private boolean zzg = false;
    private boolean zzh = false;
    private zzdym zzi = null;
    private boolean zzj = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdyn(Context context) {
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.zza = sensorManager;
        if (sensorManager != null) {
            this.zzb = sensorManager.getDefaultSensor(4);
        } else {
            this.zzb = null;
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhE)).booleanValue()) {
            long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis();
            if (this.zze + ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhG)).intValue() < currentTimeMillis) {
                this.zzf = 0;
                this.zze = currentTimeMillis;
                this.zzg = false;
                this.zzh = false;
                this.zzc = this.zzd.floatValue();
            }
            Float valueOf = Float.valueOf(this.zzd.floatValue() + (sensorEvent.values[1] * 4.0f));
            this.zzd = valueOf;
            float floatValue = valueOf.floatValue();
            float f10 = this.zzc;
            zzbhr zzbhrVar = zzbhz.zzhF;
            if (floatValue > f10 + ((Float) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhrVar)).floatValue()) {
                this.zzc = this.zzd.floatValue();
                this.zzh = true;
            } else if (this.zzd.floatValue() < this.zzc - ((Float) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhrVar)).floatValue()) {
                this.zzc = this.zzd.floatValue();
                this.zzg = true;
            }
            if (this.zzd.isInfinite()) {
                this.zzd = Float.valueOf(0.0f);
                this.zzc = 0.0f;
            }
            if (this.zzg && this.zzh) {
                com.google.android.gms.ads.internal.util.zze.zza("Flick detected.");
                this.zze = currentTimeMillis;
                int i10 = this.zzf + 1;
                this.zzf = i10;
                this.zzg = false;
                this.zzh = false;
                zzdym zzdymVar = this.zzi;
                if (zzdymVar != null) {
                    if (i10 == ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhH)).intValue()) {
                        zzdzb zzdzbVar = (zzdzb) zzdymVar;
                        zzdzbVar.zzg(new zzdyz(zzdzbVar), zzdza.GESTURE);
                    }
                }
            }
        }
    }

    public final void zza() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            if (this.zzj && (sensorManager = this.zza) != null && (sensor = this.zzb) != null) {
                sensorManager.unregisterListener(this, sensor);
                this.zzj = false;
                com.google.android.gms.ads.internal.util.zze.zza("Stopped listening for flick gestures.");
            }
        }
    }

    public final void zzb() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhE)).booleanValue()) {
                if (!this.zzj && (sensorManager = this.zza) != null && (sensor = this.zzb) != null) {
                    sensorManager.registerListener(this, sensor, 2);
                    this.zzj = true;
                    com.google.android.gms.ads.internal.util.zze.zza("Listening for flick gestures.");
                }
                if (this.zza == null || this.zzb == null) {
                    zzcfi.zzj("Flick detection failed to initialize. Failed to obtain gyroscope.");
                }
            }
        }
    }

    public final void zzc(zzdym zzdymVar) {
        this.zzi = zzdymVar;
    }
}
