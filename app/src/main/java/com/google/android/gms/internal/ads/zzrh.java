package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzrh implements zzsk, zzpd {
    final /* synthetic */ zzrj zza;
    private final Object zzb;
    private zzsj zzc;
    private zzpc zzd;

    public zzrh(zzrj zzrjVar, Object obj) {
        this.zza = zzrjVar;
        this.zzc = zzrjVar.zze(null);
        this.zzd = zzrjVar.zzc(null);
        this.zzb = obj;
    }

    private final boolean zzf(int i10, zzsa zzsaVar) {
        zzsa zzsaVar2;
        if (zzsaVar != null) {
            zzsaVar2 = this.zza.zzv(this.zzb, zzsaVar);
            if (zzsaVar2 == null) {
                return false;
            }
        } else {
            zzsaVar2 = null;
        }
        zzsj zzsjVar = this.zzc;
        if (zzsjVar.zza != i10 || !zzeg.zzS(zzsjVar.zzb, zzsaVar2)) {
            this.zzc = this.zza.zzf(i10, zzsaVar2, 0L);
        }
        zzpc zzpcVar = this.zzd;
        if (zzpcVar.zza == i10 && zzeg.zzS(zzpcVar.zzb, zzsaVar2)) {
            return true;
        }
        this.zzd = this.zza.zzd(i10, zzsaVar2);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzsk
    public final void zzaf(int i10, zzsa zzsaVar, zzrw zzrwVar) {
        if (zzf(i10, zzsaVar)) {
            this.zzc.zzc(zzrwVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsk
    public final void zzag(int i10, zzsa zzsaVar, zzrr zzrrVar, zzrw zzrwVar) {
        if (zzf(i10, zzsaVar)) {
            this.zzc.zze(zzrrVar, zzrwVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsk
    public final void zzah(int i10, zzsa zzsaVar, zzrr zzrrVar, zzrw zzrwVar) {
        if (zzf(i10, zzsaVar)) {
            this.zzc.zzg(zzrrVar, zzrwVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsk
    public final void zzai(int i10, zzsa zzsaVar, zzrr zzrrVar, zzrw zzrwVar, IOException iOException, boolean z10) {
        if (zzf(i10, zzsaVar)) {
            this.zzc.zzi(zzrrVar, zzrwVar, iOException, z10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsk
    public final void zzaj(int i10, zzsa zzsaVar, zzrr zzrrVar, zzrw zzrwVar) {
        if (zzf(i10, zzsaVar)) {
            this.zzc.zzk(zzrrVar, zzrwVar);
        }
    }
}
