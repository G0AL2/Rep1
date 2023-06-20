package com.google.android.gms.internal.p002firebaseauthapi;

import sun.misc.Unsafe;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaca  reason: invalid package */
/* loaded from: classes2.dex */
final class zzaca extends zzacc {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaca(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacc
    public final double zza(Object obj, long j10) {
        return Double.longBitsToDouble(zzk(obj, j10));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacc
    public final float zzb(Object obj, long j10) {
        return Float.intBitsToFloat(zzj(obj, j10));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacc
    public final void zzc(Object obj, long j10, boolean z10) {
        if (zzacd.zzb) {
            zzacd.zzD(obj, j10, r3 ? (byte) 1 : (byte) 0);
        } else {
            zzacd.zzE(obj, j10, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacc
    public final void zzd(Object obj, long j10, byte b10) {
        if (zzacd.zzb) {
            zzacd.zzD(obj, j10, b10);
        } else {
            zzacd.zzE(obj, j10, b10);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacc
    public final void zze(Object obj, long j10, double d10) {
        zzo(obj, j10, Double.doubleToLongBits(d10));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacc
    public final void zzf(Object obj, long j10, float f10) {
        zzn(obj, j10, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacc
    public final boolean zzg(Object obj, long j10) {
        if (zzacd.zzb) {
            return zzacd.zzt(obj, j10);
        }
        return zzacd.zzu(obj, j10);
    }
}
