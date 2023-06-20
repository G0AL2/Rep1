package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzpp;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzii implements Runnable {
    final /* synthetic */ zzah zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ zzah zze;
    final /* synthetic */ zzin zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzii(zzin zzinVar, zzah zzahVar, int i10, long j10, boolean z10, zzah zzahVar2) {
        this.zzf = zzinVar;
        this.zza = zzahVar;
        this.zzb = i10;
        this.zzc = j10;
        this.zzd = z10;
        this.zze = zzahVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzf.zzX(this.zza);
        zzin.zzw(this.zzf, this.zza, this.zzb, this.zzc, false, this.zzd);
        zzpp.zzc();
        if (this.zzf.zzs.zzf().zzs(null, zzel.zzaI)) {
            zzin.zzv(this.zzf, this.zza, this.zze);
        }
    }
}
