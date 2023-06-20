package com.google.android.gms.internal.ads;

import com.inmobi.media.fq;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzazi {
    private final byte[] zza;
    private final int zzb;
    private int zzc;
    private int zzd = 0;

    public zzazi(byte[] bArr, int i10, int i11) {
        this.zza = bArr;
        this.zzc = i10;
        this.zzb = i11;
        zzg();
    }

    private final int zzf() {
        int i10 = 0;
        while (!zze()) {
            i10++;
        }
        return ((1 << i10) - 1) + (i10 > 0 ? zza(i10) : 0);
    }

    private final void zzg() {
        int i10;
        int i11;
        int i12 = this.zzc;
        boolean z10 = true;
        if (i12 < 0 || (i10 = this.zzd) < 0 || i10 >= 8 || (i12 >= (i11 = this.zzb) && (i12 != i11 || i10 != 0))) {
            z10 = false;
        }
        zzayz.zze(z10);
    }

    private final boolean zzh(int i10) {
        if (i10 < 2 || i10 >= this.zzb) {
            return false;
        }
        byte[] bArr = this.zza;
        return bArr[i10] == 3 && bArr[i10 + (-2)] == 0 && bArr[i10 + (-1)] == 0;
    }

    public final int zza(int i10) {
        int i11;
        int i12;
        int i13 = i10 >> 3;
        int i14 = 0;
        for (int i15 = 0; i15 < i13; i15++) {
            int i16 = zzh(this.zzc + 1) ? this.zzc + 2 : this.zzc + 1;
            int i17 = this.zzd;
            if (i17 != 0) {
                byte[] bArr = this.zza;
                i12 = ((bArr[i16] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) >>> (8 - i17)) | ((bArr[this.zzc] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << i17);
            } else {
                i12 = this.zza[this.zzc];
            }
            i10 -= 8;
            i14 |= (255 & i12) << i10;
            this.zzc = i16;
        }
        if (i10 > 0) {
            int i18 = this.zzd + i10;
            byte b10 = (byte) (255 >> (8 - i10));
            int i19 = zzh(this.zzc + 1) ? this.zzc + 2 : this.zzc + 1;
            if (i18 > 8) {
                byte[] bArr2 = this.zza;
                i11 = (b10 & (((255 & bArr2[i19]) >> (16 - i18)) | ((bArr2[this.zzc] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << (i18 - 8)))) | i14;
                this.zzc = i19;
            } else {
                i11 = (b10 & ((255 & this.zza[this.zzc]) >> (8 - i18))) | i14;
                if (i18 == 8) {
                    this.zzc = i19;
                }
            }
            i14 = i11;
            this.zzd = i18 % 8;
        }
        zzg();
        return i14;
    }

    public final int zzb() {
        int zzf = zzf();
        return (zzf % 2 == 0 ? -1 : 1) * ((zzf + 1) / 2);
    }

    public final int zzc() {
        return zzf();
    }

    public final void zzd(int i10) {
        int i11 = this.zzc;
        int i12 = (i10 >> 3) + i11;
        this.zzc = i12;
        int i13 = this.zzd + (i10 & 7);
        this.zzd = i13;
        if (i13 > 7) {
            this.zzc = i12 + 1;
            this.zzd = i13 - 8;
        }
        while (true) {
            i11++;
            if (i11 > this.zzc) {
                zzg();
                return;
            } else if (zzh(i11)) {
                this.zzc++;
                i11 += 2;
            }
        }
    }

    public final boolean zze() {
        return zza(1) == 1;
    }
}
