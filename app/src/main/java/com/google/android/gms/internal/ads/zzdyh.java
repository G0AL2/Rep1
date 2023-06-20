package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdyh implements zzfuy {
    final /* synthetic */ zzdyj zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdyh(zzdyj zzdyjVar) {
        this.zza = zzdyjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuy
    public final void zza(Throwable th) {
        long j10;
        zzcga zzcgaVar;
        synchronized (this) {
            this.zza.zzc = true;
            zzdyj zzdyjVar = this.zza;
            long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime();
            j10 = this.zza.zzd;
            zzdyjVar.zzv("com.google.android.gms.ads.MobileAds", false, "Internal Error.", (int) (elapsedRealtime - j10));
            zzcgaVar = this.zza.zze;
            zzcgaVar.zze(new Exception());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfuy
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        long j10;
        Executor executor;
        final String str = (String) obj;
        synchronized (this) {
            this.zza.zzc = true;
            zzdyj zzdyjVar = this.zza;
            long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime();
            j10 = this.zza.zzd;
            zzdyjVar.zzv("com.google.android.gms.ads.MobileAds", true, "", (int) (elapsedRealtime - j10));
            executor = this.zza.zzi;
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdyg
                @Override // java.lang.Runnable
                public final void run() {
                    zzdyh zzdyhVar = zzdyh.this;
                    zzdyj.zzj(zzdyhVar.zza, str);
                }
            });
        }
    }
}
