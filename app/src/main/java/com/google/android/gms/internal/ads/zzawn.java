package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzawn implements zzaxn {
    private final zzaxn[] zza;

    public zzawn(zzaxn[] zzaxnVarArr) {
        this.zza = zzaxnVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzaxn
    public final long zza() {
        long j10 = Long.MAX_VALUE;
        for (zzaxn zzaxnVar : this.zza) {
            long zza = zzaxnVar.zza();
            if (zza != Long.MIN_VALUE) {
                j10 = Math.min(j10, zza);
            }
        }
        if (j10 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j10;
    }

    @Override // com.google.android.gms.internal.ads.zzaxn
    public final boolean zzbj(long j10) {
        zzaxn[] zzaxnVarArr;
        boolean z10;
        boolean z11 = false;
        do {
            long zza = zza();
            if (zza == Long.MIN_VALUE) {
                break;
            }
            z10 = false;
            for (zzaxn zzaxnVar : this.zza) {
                if (zzaxnVar.zza() == zza) {
                    z10 |= zzaxnVar.zzbj(j10);
                }
            }
            z11 |= z10;
        } while (z10);
        return z11;
    }
}
