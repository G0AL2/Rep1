package com.google.android.gms.internal.measurement;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzmm {
    private static final zzmm zza = new zzmm(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzmm() {
        this(0, new int[8], new Object[8], true);
    }

    private zzmm(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.zze = -1;
        this.zzb = i10;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z10;
    }

    public static zzmm zzc() {
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzmm zzd(zzmm zzmmVar, zzmm zzmmVar2) {
        int i10 = zzmmVar.zzb + zzmmVar2.zzb;
        int[] copyOf = Arrays.copyOf(zzmmVar.zzc, i10);
        System.arraycopy(zzmmVar2.zzc, 0, copyOf, zzmmVar.zzb, zzmmVar2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzmmVar.zzd, i10);
        System.arraycopy(zzmmVar2.zzd, 0, copyOf2, zzmmVar.zzb, zzmmVar2.zzb);
        return new zzmm(i10, copyOf, copyOf2, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzmm zze() {
        return new zzmm(0, new int[8], new Object[8], true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof zzmm)) {
            zzmm zzmmVar = (zzmm) obj;
            int i10 = this.zzb;
            if (i10 == zzmmVar.zzb) {
                int[] iArr = this.zzc;
                int[] iArr2 = zzmmVar.zzc;
                int i11 = 0;
                while (true) {
                    if (i11 >= i10) {
                        Object[] objArr = this.zzd;
                        Object[] objArr2 = zzmmVar.zzd;
                        int i12 = this.zzb;
                        for (int i13 = 0; i13 < i12; i13++) {
                            if (objArr[i13].equals(objArr2[i13])) {
                            }
                        }
                        return true;
                    } else if (iArr[i11] != iArr2[i11]) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzb;
        int i11 = (i10 + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        int[] iArr = this.zzc;
        int i12 = 17;
        int i13 = 17;
        for (int i14 = 0; i14 < i10; i14++) {
            i13 = (i13 * 31) + iArr[i14];
        }
        int i15 = (i11 + i13) * 31;
        Object[] objArr = this.zzd;
        int i16 = this.zzb;
        for (int i17 = 0; i17 < i16; i17++) {
            i12 = (i12 * 31) + objArr[i17].hashCode();
        }
        return i15 + i12;
    }

    public final int zza() {
        int zzA;
        int zzB;
        int i10;
        int i11 = this.zze;
        if (i11 == -1) {
            int i12 = 0;
            for (int i13 = 0; i13 < this.zzb; i13++) {
                int i14 = this.zzc[i13];
                int i15 = i14 >>> 3;
                int i16 = i14 & 7;
                if (i16 != 0) {
                    if (i16 == 1) {
                        ((Long) this.zzd[i13]).longValue();
                        i10 = zzjj.zzA(i15 << 3) + 8;
                    } else if (i16 == 2) {
                        int zzA2 = zzjj.zzA(i15 << 3);
                        int zzd = ((zzjb) this.zzd[i13]).zzd();
                        i12 += zzA2 + zzjj.zzA(zzd) + zzd;
                    } else if (i16 == 3) {
                        int zzz = zzjj.zzz(i15);
                        zzA = zzz + zzz;
                        zzB = ((zzmm) this.zzd[i13]).zza();
                    } else if (i16 == 5) {
                        ((Integer) this.zzd[i13]).intValue();
                        i10 = zzjj.zzA(i15 << 3) + 4;
                    } else {
                        throw new IllegalStateException(zzkm.zza());
                    }
                    i12 += i10;
                } else {
                    long longValue = ((Long) this.zzd[i13]).longValue();
                    zzA = zzjj.zzA(i15 << 3);
                    zzB = zzjj.zzB(longValue);
                }
                i10 = zzA + zzB;
                i12 += i10;
            }
            this.zze = i12;
            return i12;
        }
        return i11;
    }

    public final int zzb() {
        int i10 = this.zze;
        if (i10 == -1) {
            int i11 = 0;
            for (int i12 = 0; i12 < this.zzb; i12++) {
                int i13 = this.zzc[i12];
                int zzA = zzjj.zzA(8);
                int zzd = ((zzjb) this.zzd[i12]).zzd();
                i11 += zzA + zzA + zzjj.zzA(16) + zzjj.zzA(i13 >>> 3) + zzjj.zzA(24) + zzjj.zzA(zzd) + zzd;
            }
            this.zze = i11;
            return i11;
        }
        return i10;
    }

    public final void zzf() {
        this.zzf = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzg(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.zzb; i11++) {
            zzll.zzb(sb2, i10, String.valueOf(this.zzc[i11] >>> 3), this.zzd[i11]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzh(int i10, Object obj) {
        if (this.zzf) {
            int i11 = this.zzb;
            int[] iArr = this.zzc;
            if (i11 == iArr.length) {
                int i12 = i11 + (i11 < 4 ? 8 : i11 >> 1);
                this.zzc = Arrays.copyOf(iArr, i12);
                this.zzd = Arrays.copyOf(this.zzd, i12);
            }
            int[] iArr2 = this.zzc;
            int i13 = this.zzb;
            iArr2[i13] = i10;
            this.zzd[i13] = obj;
            this.zzb = i13 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void zzi(zznd zzndVar) throws IOException {
        if (this.zzb != 0) {
            for (int i10 = 0; i10 < this.zzb; i10++) {
                int i11 = this.zzc[i10];
                Object obj = this.zzd[i10];
                int i12 = i11 >>> 3;
                int i13 = i11 & 7;
                if (i13 == 0) {
                    zzndVar.zzt(i12, ((Long) obj).longValue());
                } else if (i13 == 1) {
                    zzndVar.zzm(i12, ((Long) obj).longValue());
                } else if (i13 == 2) {
                    zzndVar.zzd(i12, (zzjb) obj);
                } else if (i13 == 3) {
                    zzndVar.zzE(i12);
                    ((zzmm) obj).zzi(zzndVar);
                    zzndVar.zzh(i12);
                } else if (i13 == 5) {
                    zzndVar.zzk(i12, ((Integer) obj).intValue());
                } else {
                    throw new RuntimeException(zzkm.zza());
                }
            }
        }
    }
}
