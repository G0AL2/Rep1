package com.google.android.gms.internal.auth;

import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes2.dex */
final class zzgw extends zzgy {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgw(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.auth.zzgy
    public final double zza(Object obj, long j10) {
        return Double.longBitsToDouble(zzj(obj, j10));
    }

    @Override // com.google.android.gms.internal.auth.zzgy
    public final float zzb(Object obj, long j10) {
        return Float.intBitsToFloat(zzi(obj, j10));
    }

    @Override // com.google.android.gms.internal.auth.zzgy
    public final void zzc(Object obj, long j10, boolean z10) {
        if (zzgz.zza) {
            zzgz.zzi(obj, j10, z10);
        } else {
            zzgz.zzj(obj, j10, z10);
        }
    }

    @Override // com.google.android.gms.internal.auth.zzgy
    public final void zzd(Object obj, long j10, double d10) {
        zzn(obj, j10, Double.doubleToLongBits(d10));
    }

    @Override // com.google.android.gms.internal.auth.zzgy
    public final void zze(Object obj, long j10, float f10) {
        zzm(obj, j10, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.auth.zzgy
    public final boolean zzf(Object obj, long j10) {
        if (zzgz.zza) {
            return zzgz.zzq(obj, j10);
        }
        return zzgz.zzr(obj, j10);
    }
}
