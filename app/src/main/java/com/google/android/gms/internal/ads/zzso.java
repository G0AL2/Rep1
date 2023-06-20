package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzso implements zzry, zzrx {
    private final zzry zza;
    private final long zzb;
    private zzrx zzc;

    public zzso(zzry zzryVar, long j10) {
        this.zza = zzryVar;
        this.zzb = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzry
    public final long zza(long j10, zzjw zzjwVar) {
        return this.zza.zza(j10 - this.zzb, zzjwVar) + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzry, com.google.android.gms.internal.ads.zzts
    public final long zzb() {
        long zzb = this.zza.zzb();
        if (zzb == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return zzb + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzry, com.google.android.gms.internal.ads.zzts
    public final long zzc() {
        long zzc = this.zza.zzc();
        if (zzc == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return zzc + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzry
    public final long zzd() {
        long zzd = this.zza.zzd();
        if (zzd == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return zzd + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzry
    public final long zze(long j10) {
        return this.zza.zze(j10 - this.zzb) + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzry
    public final long zzf(zzvg[] zzvgVarArr, boolean[] zArr, zztq[] zztqVarArr, boolean[] zArr2, long j10) {
        zztq[] zztqVarArr2 = new zztq[zztqVarArr.length];
        int i10 = 0;
        while (true) {
            zztq zztqVar = null;
            if (i10 >= zztqVarArr.length) {
                break;
            }
            zzsp zzspVar = (zzsp) zztqVarArr[i10];
            if (zzspVar != null) {
                zztqVar = zzspVar.zzc();
            }
            zztqVarArr2[i10] = zztqVar;
            i10++;
        }
        long zzf = this.zza.zzf(zzvgVarArr, zArr, zztqVarArr2, zArr2, j10 - this.zzb);
        for (int i11 = 0; i11 < zztqVarArr.length; i11++) {
            zztq zztqVar2 = zztqVarArr2[i11];
            if (zztqVar2 == null) {
                zztqVarArr[i11] = null;
            } else {
                zztq zztqVar3 = zztqVarArr[i11];
                if (zztqVar3 == null || ((zzsp) zztqVar3).zzc() != zztqVar2) {
                    zztqVarArr[i11] = new zzsp(zztqVar2, this.zzb);
                }
            }
        }
        return zzf + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zztr
    public final /* bridge */ /* synthetic */ void zzg(zzts zztsVar) {
        zzry zzryVar = (zzry) zztsVar;
        zzrx zzrxVar = this.zzc;
        Objects.requireNonNull(zzrxVar);
        zzrxVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zzry
    public final zzty zzh() {
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzrx
    public final void zzi(zzry zzryVar) {
        zzrx zzrxVar = this.zzc;
        Objects.requireNonNull(zzrxVar);
        zzrxVar.zzi(this);
    }

    @Override // com.google.android.gms.internal.ads.zzry
    public final void zzj(long j10, boolean z10) {
        this.zza.zzj(j10 - this.zzb, false);
    }

    @Override // com.google.android.gms.internal.ads.zzry
    public final void zzk() throws IOException {
        this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzry
    public final void zzl(zzrx zzrxVar, long j10) {
        this.zzc = zzrxVar;
        this.zza.zzl(this, j10 - this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzry, com.google.android.gms.internal.ads.zzts
    public final void zzm(long j10) {
        this.zza.zzm(j10 - this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzry, com.google.android.gms.internal.ads.zzts
    public final boolean zzo(long j10) {
        return this.zza.zzo(j10 - this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzry, com.google.android.gms.internal.ads.zzts
    public final boolean zzp() {
        return this.zza.zzp();
    }
}
