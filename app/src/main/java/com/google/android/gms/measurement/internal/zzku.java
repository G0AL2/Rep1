package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PersistableBundle;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzku extends zzkw {
    private final AlarmManager zza;
    private zzao zzb;
    private Integer zzc;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzku(zzli zzliVar) {
        super(zzliVar);
        this.zza = (AlarmManager) this.zzs.zzav().getSystemService("alarm");
    }

    private final int zzf() {
        if (this.zzc == null) {
            this.zzc = Integer.valueOf("measurement".concat(String.valueOf(this.zzs.zzav().getPackageName())).hashCode());
        }
        return this.zzc.intValue();
    }

    private final PendingIntent zzh() {
        Context zzav = this.zzs.zzav();
        return PendingIntent.getBroadcast(zzav, 0, new Intent().setClassName(zzav, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), com.google.android.gms.internal.measurement.zzbs.zza);
    }

    private final zzao zzi() {
        if (this.zzb == null) {
            this.zzb = new zzkt(this, this.zzf.zzq());
        }
        return this.zzb;
    }

    @TargetApi(24)
    private final void zzj() {
        JobScheduler jobScheduler = (JobScheduler) this.zzs.zzav().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(zzf());
        }
    }

    public final void zza() {
        zzW();
        this.zzs.zzaz().zzj().zza("Unscheduling upload");
        AlarmManager alarmManager = this.zza;
        if (alarmManager != null) {
            alarmManager.cancel(zzh());
        }
        zzi().zzb();
        if (Build.VERSION.SDK_INT >= 24) {
            zzj();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzkw
    protected final boolean zzb() {
        AlarmManager alarmManager = this.zza;
        if (alarmManager != null) {
            alarmManager.cancel(zzh());
        }
        if (Build.VERSION.SDK_INT >= 24) {
            zzj();
            return false;
        }
        return false;
    }

    public final void zzd(long j10) {
        zzW();
        this.zzs.zzax();
        Context zzav = this.zzs.zzav();
        if (!zzlp.zzaj(zzav)) {
            this.zzs.zzaz().zzc().zza("Receiver not registered/enabled");
        }
        if (!zzlp.zzak(zzav, false)) {
            this.zzs.zzaz().zzc().zza("Service not registered/enabled");
        }
        zza();
        this.zzs.zzaz().zzj().zzb("Scheduling upload, millis", Long.valueOf(j10));
        long elapsedRealtime = this.zzs.zzaw().elapsedRealtime() + j10;
        this.zzs.zzf();
        if (j10 < Math.max(0L, ((Long) zzel.zzw.zza(null)).longValue()) && !zzi().zze()) {
            zzi().zzd(j10);
        }
        this.zzs.zzax();
        if (Build.VERSION.SDK_INT < 24) {
            AlarmManager alarmManager = this.zza;
            if (alarmManager != null) {
                this.zzs.zzf();
                alarmManager.setInexactRepeating(2, elapsedRealtime, Math.max(((Long) zzel.zzr.zza(null)).longValue(), j10), zzh());
                return;
            }
            return;
        }
        Context zzav2 = this.zzs.zzav();
        ComponentName componentName = new ComponentName(zzav2, "com.google.android.gms.measurement.AppMeasurementJobService");
        int zzf = zzf();
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
        com.google.android.gms.internal.measurement.zzbt.zza(zzav2, new JobInfo.Builder(zzf, componentName).setMinimumLatency(j10).setOverrideDeadline(j10 + j10).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
    }
}
