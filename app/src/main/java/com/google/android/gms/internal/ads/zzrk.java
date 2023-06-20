package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzrk implements zzts {
    protected final zzts[] zza;

    public zzrk(zzts[] zztsVarArr) {
        this.zza = zztsVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzts
    public final long zzb() {
        long j10 = Long.MAX_VALUE;
        for (zzts zztsVar : this.zza) {
            long zzb = zztsVar.zzb();
            if (zzb != Long.MIN_VALUE) {
                j10 = Math.min(j10, zzb);
            }
        }
        if (j10 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j10;
    }

    @Override // com.google.android.gms.internal.ads.zzts
    public final long zzc() {
        long j10 = Long.MAX_VALUE;
        for (zzts zztsVar : this.zza) {
            long zzc = zztsVar.zzc();
            if (zzc != Long.MIN_VALUE) {
                j10 = Math.min(j10, zzc);
            }
        }
        if (j10 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j10;
    }

    @Override // com.google.android.gms.internal.ads.zzts
    public final void zzm(long j10) {
        for (zzts zztsVar : this.zza) {
            zztsVar.zzm(j10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzts
    public final boolean zzo(long j10) {
        zzts[] zztsVarArr;
        boolean z10;
        boolean z11 = false;
        do {
            long zzc = zzc();
            if (zzc == Long.MIN_VALUE) {
                break;
            }
            z10 = false;
            for (zzts zztsVar : this.zza) {
                long zzc2 = zztsVar.zzc();
                boolean z12 = zzc2 != Long.MIN_VALUE && zzc2 <= j10;
                if (zzc2 == zzc || z12) {
                    z10 |= zztsVar.zzo(j10);
                }
            }
            z11 |= z10;
        } while (z10);
        return z11;
    }

    @Override // com.google.android.gms.internal.ads.zzts
    public final boolean zzp() {
        for (zzts zztsVar : this.zza) {
            if (zztsVar.zzp()) {
                return true;
            }
        }
        return false;
    }
}
