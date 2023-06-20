package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzpp;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzih implements Runnable {
    final /* synthetic */ zzah zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ int zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ boolean zze;
    final /* synthetic */ zzah zzf;
    final /* synthetic */ zzin zzg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzih(zzin zzinVar, zzah zzahVar, long j10, int i10, long j11, boolean z10, zzah zzahVar2) {
        this.zzg = zzinVar;
        this.zza = zzahVar;
        this.zzb = j10;
        this.zzc = i10;
        this.zzd = j11;
        this.zze = z10;
        this.zzf = zzahVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzg.zzX(this.zza);
        this.zzg.zzM(this.zzb, false);
        zzin.zzw(this.zzg, this.zza, this.zzc, this.zzd, true, this.zze);
        zzpp.zzc();
        if (this.zzg.zzs.zzf().zzs(null, zzel.zzaI)) {
            zzin.zzv(this.zzg, this.zza, this.zzf);
        }
    }
}
