package com.google.android.gms.internal.ads;

import com.inmobi.media.fq;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzazg {
    public byte[] zza;
    private int zzb;
    private int zzc;
    private int zzd;

    public zzazg() {
    }

    public zzazg(byte[] bArr, int i10) {
        this.zza = bArr;
        this.zzd = i10;
    }

    public final int zza(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = i10 >> 3;
        boolean z10 = false;
        int i16 = 0;
        for (int i17 = 0; i17 < i15; i17++) {
            int i18 = this.zzc;
            if (i18 != 0) {
                byte[] bArr = this.zza;
                int i19 = this.zzb;
                i14 = ((bArr[i19 + 1] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) >>> (8 - i18)) | ((bArr[i19] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << i18);
            } else {
                i14 = this.zza[this.zzb];
            }
            i10 -= 8;
            i16 |= (255 & i14) << i10;
            this.zzb++;
        }
        if (i10 > 0) {
            int i20 = this.zzc + i10;
            byte b10 = (byte) (255 >> (8 - i10));
            if (i20 > 8) {
                byte[] bArr2 = this.zza;
                int i21 = this.zzb;
                int i22 = i21 + 1;
                i13 = (b10 & (((255 & bArr2[i22]) >> (16 - i20)) | ((bArr2[i21] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << (i20 - 8)))) | i16;
                this.zzb = i22;
            } else {
                byte[] bArr3 = this.zza;
                int i23 = this.zzb;
                i13 = (b10 & ((255 & bArr3[i23]) >> (8 - i20))) | i16;
                if (i20 == 8) {
                    this.zzb = i23 + 1;
                }
            }
            i16 = i13;
            this.zzc = i20 % 8;
        }
        int i24 = this.zzb;
        if (i24 >= 0 && (i11 = this.zzc) >= 0 && (i24 < (i12 = this.zzd) || (i24 == i12 && i11 == 0))) {
            z10 = true;
        }
        zzayz.zze(z10);
        return i16;
    }
}
