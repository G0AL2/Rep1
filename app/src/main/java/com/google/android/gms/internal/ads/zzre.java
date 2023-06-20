package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzre implements zztq {
    public final zztq zza;
    final /* synthetic */ zzrf zzb;
    private boolean zzc;

    public zzre(zzrf zzrfVar, zztq zztqVar) {
        this.zzb = zzrfVar;
        this.zza = zztqVar;
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final int zza(zziz zzizVar, zzgb zzgbVar, int i10) {
        if (this.zzb.zzq()) {
            return -3;
        }
        if (this.zzc) {
            zzgbVar.zzc(4);
            return -4;
        }
        int zza = this.zza.zza(zzizVar, zzgbVar, i10);
        if (zza == -5) {
            zzad zzadVar = zzizVar.zza;
            Objects.requireNonNull(zzadVar);
            int i11 = zzadVar.zzC;
            if (i11 == 0) {
                if (zzadVar.zzD != 0) {
                    i11 = 0;
                }
                return -5;
            }
            int i12 = this.zzb.zzb == Long.MIN_VALUE ? zzadVar.zzD : 0;
            zzab zzb = zzadVar.zzb();
            zzb.zzC(i11);
            zzb.zzD(i12);
            zzizVar.zza = zzb.zzY();
            return -5;
        }
        zzrf zzrfVar = this.zzb;
        long j10 = zzrfVar.zzb;
        if (j10 == Long.MIN_VALUE || ((zza != -4 || zzgbVar.zzd < j10) && !(zza == -3 && zzrfVar.zzb() == Long.MIN_VALUE && !zzgbVar.zzc))) {
            return zza;
        }
        zzgbVar.zzb();
        zzgbVar.zzc(4);
        this.zzc = true;
        return -4;
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final int zzb(long j10) {
        if (this.zzb.zzq()) {
            return -3;
        }
        return this.zza.zzb(j10);
    }

    public final void zzc() {
        this.zzc = false;
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final void zzd() throws IOException {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final boolean zze() {
        return !this.zzb.zzq() && this.zza.zze();
    }
}
