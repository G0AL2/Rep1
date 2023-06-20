package com.google.android.gms.internal.ads;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzgns extends zzgnt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgns(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.ads.zzgnt
    public final byte zza(long j10) {
        return Memory.peekByte(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzgnt
    public final double zzb(Object obj, long j10) {
        return Double.longBitsToDouble(zzm(obj, j10));
    }

    @Override // com.google.android.gms.internal.ads.zzgnt
    public final float zzc(Object obj, long j10) {
        return Float.intBitsToFloat(zzl(obj, j10));
    }

    @Override // com.google.android.gms.internal.ads.zzgnt
    public final void zzd(long j10, byte[] bArr, long j11, long j12) {
        Memory.peekByteArray(j10, bArr, (int) j11, (int) j12);
    }

    @Override // com.google.android.gms.internal.ads.zzgnt
    public final void zze(Object obj, long j10, boolean z10) {
        if (zzgnu.zzb) {
            zzgnu.zzG(obj, j10, r3 ? (byte) 1 : (byte) 0);
        } else {
            zzgnu.zzH(obj, j10, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgnt
    public final void zzf(Object obj, long j10, byte b10) {
        if (zzgnu.zzb) {
            zzgnu.zzG(obj, j10, b10);
        } else {
            zzgnu.zzH(obj, j10, b10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgnt
    public final void zzg(Object obj, long j10, double d10) {
        zzq(obj, j10, Double.doubleToLongBits(d10));
    }

    @Override // com.google.android.gms.internal.ads.zzgnt
    public final void zzh(Object obj, long j10, float f10) {
        zzp(obj, j10, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.ads.zzgnt
    public final boolean zzi(Object obj, long j10) {
        if (zzgnu.zzb) {
            return zzgnu.zzw(obj, j10);
        }
        return zzgnu.zzx(obj, j10);
    }
}
