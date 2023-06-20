package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzpm;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.2 */
/* loaded from: classes2.dex */
final class zzgz implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ zzha zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgz(zzha zzhaVar, String str, String str2, String str3, long j10) {
        this.zze = zzhaVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzli zzliVar;
        zzli zzliVar2;
        zzli zzliVar3;
        zzli zzliVar4;
        zzli zzliVar5;
        zzpm.zzc();
        zzliVar = this.zze.zza;
        if (zzliVar.zzg().zzs(null, zzel.zzat)) {
            String str = this.zza;
            if (str == null) {
                zzliVar5 = this.zze.zza;
                zzliVar5.zzQ(this.zzb, null);
                return;
            }
            zziu zziuVar = new zziu(this.zzc, str, this.zzd);
            zzliVar4 = this.zze.zza;
            zzliVar4.zzQ(this.zzb, zziuVar);
            return;
        }
        String str2 = this.zza;
        if (str2 == null) {
            zzliVar3 = this.zze.zza;
            zzliVar3.zzq().zzs().zzy(this.zzb, null);
            return;
        }
        zziu zziuVar2 = new zziu(this.zzc, str2, this.zzd);
        zzliVar2 = this.zze.zza;
        zzliVar2.zzq().zzs().zzy(this.zzb, zziuVar2);
    }
}
