package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzzk {
    public int zza;
    public String zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public int zzg;

    public final boolean zza(int i10) {
        boolean zzm;
        int i11;
        int i12;
        int i13;
        int i14;
        String[] strArr;
        int[] iArr;
        int zzl;
        int[] iArr2;
        int[] iArr3;
        int i15;
        int[] iArr4;
        int[] iArr5;
        int i16;
        int[] iArr6;
        zzm = zzzl.zzm(i10);
        if (!zzm || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return false;
        }
        this.zza = i11;
        strArr = zzzl.zza;
        this.zzb = strArr[3 - i12];
        iArr = zzzl.zzb;
        int i17 = iArr[i14];
        this.zzd = i17;
        if (i11 == 2) {
            i17 /= 2;
            this.zzd = i17;
        } else if (i11 == 0) {
            i17 /= 4;
            this.zzd = i17;
        }
        int i18 = (i10 >>> 9) & 1;
        zzl = zzzl.zzl(i11, i12);
        this.zzg = zzl;
        if (i12 == 3) {
            if (i11 == 3) {
                iArr6 = zzzl.zzc;
                i16 = iArr6[i13 - 1];
            } else {
                iArr5 = zzzl.zzd;
                i16 = iArr5[i13 - 1];
            }
            this.zzf = i16;
            this.zzc = (((i16 * 12) / i17) + i18) * 4;
        } else {
            if (i11 == 3) {
                if (i12 == 2) {
                    iArr4 = zzzl.zze;
                    i15 = iArr4[i13 - 1];
                } else {
                    iArr3 = zzzl.zzf;
                    i15 = iArr3[i13 - 1];
                }
                this.zzf = i15;
                this.zzc = ((i15 * 144) / i17) + i18;
            } else {
                iArr2 = zzzl.zzg;
                int i19 = iArr2[i13 - 1];
                this.zzf = i19;
                this.zzc = (((i12 == 1 ? 72 : 144) * i19) / i17) + i18;
            }
        }
        this.zze = ((i10 >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }
}
