package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzht implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ Object zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ zzin zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzht(zzin zzinVar, String str, String str2, Object obj, long j10) {
        this.zze = zzinVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = obj;
        this.zzd = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zze.zzaa(this.zza, this.zzb, this.zzc, this.zzd);
    }
}
