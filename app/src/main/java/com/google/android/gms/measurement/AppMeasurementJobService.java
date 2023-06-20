package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.measurement.internal.zzkh;
import com.google.android.gms.measurement.internal.zzki;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.2 */
@TargetApi(24)
/* loaded from: classes2.dex */
public final class AppMeasurementJobService extends JobService implements zzkh {
    private zzki zza;

    private final zzki zzd() {
        if (this.zza == null) {
            this.zza = new zzki(this);
        }
        return this.zza;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        zzd().zze();
    }

    @Override // android.app.Service
    public void onDestroy() {
        zzd().zzf();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        zzd().zzg(intent);
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        zzd().zzi(jobParameters);
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        zzd().zzj(intent);
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.zzkh
    public final void zza(Intent intent) {
    }

    @Override // com.google.android.gms.measurement.internal.zzkh
    @TargetApi(24)
    public final void zzb(JobParameters jobParameters, boolean z10) {
        jobFinished(jobParameters, false);
    }

    @Override // com.google.android.gms.measurement.internal.zzkh
    public final boolean zzc(int i10) {
        throw new UnsupportedOperationException();
    }
}
