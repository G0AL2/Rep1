package com.google.android.gms.internal.ads;

import com.inmobi.media.fq;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzzq {
    private byte[] zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    public zzzq(byte[] bArr, int i10, int i11) {
        this.zza = bArr;
        this.zzc = i10;
        this.zzb = i11;
        zzh();
    }

    private final int zzg() {
        int i10 = 0;
        while (!zzf()) {
            i10++;
        }
        return ((1 << i10) - 1) + (i10 > 0 ? zza(i10) : 0);
    }

    private final void zzh() {
        int i10;
        int i11 = this.zzc;
        boolean z10 = true;
        if (i11 < 0 || (i11 >= (i10 = this.zzb) && (i11 != i10 || this.zzd != 0))) {
            z10 = false;
        }
        zzcw.zzf(z10);
    }

    private final boolean zzi(int i10) {
        if (i10 < 2 || i10 >= this.zzb) {
            return false;
        }
        byte[] bArr = this.zza;
        return bArr[i10] == 3 && bArr[i10 + (-2)] == 0 && bArr[i10 + (-1)] == 0;
    }

    public final int zza(int i10) {
        int i11;
        this.zzd += i10;
        int i12 = 0;
        while (true) {
            i11 = this.zzd;
            if (i11 <= 8) {
                break;
            }
            int i13 = i11 - 8;
            this.zzd = i13;
            byte[] bArr = this.zza;
            int i14 = this.zzc;
            i12 |= (bArr[i14] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << i13;
            if (true != zzi(i14 + 1)) {
                r3 = 1;
            }
            this.zzc = i14 + r3;
        }
        byte[] bArr2 = this.zza;
        int i15 = this.zzc;
        int i16 = ((-1) >>> (32 - i10)) & (i12 | ((bArr2[i15] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) >> (8 - i11)));
        if (i11 == 8) {
            this.zzd = 0;
            this.zzc = i15 + (true != zzi(i15 + 1) ? 1 : 2);
        }
        zzh();
        return i16;
    }

    public final int zzb() {
        int zzg = zzg();
        return (zzg % 2 == 0 ? -1 : 1) * ((zzg + 1) / 2);
    }

    public final int zzc() {
        return zzg();
    }

    public final void zzd() {
        int i10 = this.zzd + 1;
        this.zzd = i10;
        if (i10 == 8) {
            this.zzd = 0;
            int i11 = this.zzc;
            this.zzc = i11 + (true == zzi(i11 + 1) ? 2 : 1);
        }
        zzh();
    }

    public final void zze(int i10) {
        int i11 = this.zzc;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        this.zzc = i13;
        int i14 = this.zzd + (i10 - (i12 * 8));
        this.zzd = i14;
        if (i14 > 7) {
            this.zzc = i13 + 1;
            this.zzd = i14 - 8;
        }
        while (true) {
            i11++;
            if (i11 > this.zzc) {
                zzh();
                return;
            } else if (zzi(i11)) {
                this.zzc++;
                i11 += 2;
            }
        }
    }

    public final boolean zzf() {
        boolean z10 = (this.zza[this.zzc] & (128 >> this.zzd)) != 0;
        zzd();
        return z10;
    }
}
