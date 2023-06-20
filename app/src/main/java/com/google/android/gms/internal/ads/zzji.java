package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzji implements zzsk, zzpd {
    final /* synthetic */ zzjm zza;
    private final zzjk zzb;
    private zzsj zzc;
    private zzpc zzd;

    public zzji(zzjm zzjmVar, zzjk zzjkVar) {
        zzsj zzsjVar;
        zzpc zzpcVar;
        this.zza = zzjmVar;
        zzsjVar = zzjmVar.zzf;
        this.zzc = zzsjVar;
        zzpcVar = zzjmVar.zzg;
        this.zzd = zzpcVar;
        this.zzb = zzjkVar;
    }

    private final boolean zzf(int i10, zzsa zzsaVar) {
        zzsj zzsjVar;
        zzpc zzpcVar;
        zzsa zzsaVar2 = null;
        if (zzsaVar != null) {
            zzjk zzjkVar = this.zzb;
            int i11 = 0;
            while (true) {
                if (i11 >= zzjkVar.zzc.size()) {
                    break;
                } else if (((zzsa) zzjkVar.zzc.get(i11)).zzd == zzsaVar.zzd) {
                    zzsaVar2 = zzsaVar.zzc(Pair.create(zzjkVar.zzb, zzsaVar.zza));
                    break;
                } else {
                    i11++;
                }
            }
            if (zzsaVar2 == null) {
                return false;
            }
        }
        int i12 = i10 + this.zzb.zzd;
        zzsj zzsjVar2 = this.zzc;
        if (zzsjVar2.zza != i12 || !zzeg.zzS(zzsjVar2.zzb, zzsaVar2)) {
            zzsjVar = this.zza.zzf;
            this.zzc = zzsjVar.zza(i12, zzsaVar2, 0L);
        }
        zzpc zzpcVar2 = this.zzd;
        if (zzpcVar2.zza == i12 && zzeg.zzS(zzpcVar2.zzb, zzsaVar2)) {
            return true;
        }
        zzpcVar = this.zza.zzg;
        this.zzd = zzpcVar.zza(i12, zzsaVar2);
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
