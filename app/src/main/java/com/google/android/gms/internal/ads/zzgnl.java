package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgnl {
    private static final zzgnl zza = new zzgnl(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzgnl() {
        this(0, new int[8], new Object[8], true);
    }

    private zzgnl(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.zze = -1;
        this.zzb = i10;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z10;
    }

    public static zzgnl zzc() {
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzgnl zzd(zzgnl zzgnlVar, zzgnl zzgnlVar2) {
        int i10 = zzgnlVar.zzb + zzgnlVar2.zzb;
        int[] copyOf = Arrays.copyOf(zzgnlVar.zzc, i10);
        System.arraycopy(zzgnlVar2.zzc, 0, copyOf, zzgnlVar.zzb, zzgnlVar2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzgnlVar.zzd, i10);
        System.arraycopy(zzgnlVar2.zzd, 0, copyOf2, zzgnlVar.zzb, zzgnlVar2.zzb);
        return new zzgnl(i10, copyOf, copyOf2, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzgnl zze() {
        return new zzgnl(0, new int[8], new Object[8], true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof zzgnl)) {
            zzgnl zzgnlVar = (zzgnl) obj;
            int i10 = this.zzb;
            if (i10 == zzgnlVar.zzb) {
                int[] iArr = this.zzc;
                int[] iArr2 = zzgnlVar.zzc;
                int i11 = 0;
                while (true) {
                    if (i11 >= i10) {
                        Object[] objArr = this.zzd;
                        Object[] objArr2 = zzgnlVar.zzd;
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
        int zzE;
        int zzF;
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
                        i10 = zzgjx.zzE(i15 << 3) + 8;
                    } else if (i16 == 2) {
                        int zzE2 = zzgjx.zzE(i15 << 3);
                        int zzd = ((zzgji) this.zzd[i13]).zzd();
                        i12 += zzE2 + zzgjx.zzE(zzd) + zzd;
                    } else if (i16 == 3) {
                        int zzD = zzgjx.zzD(i15);
                        zzE = zzD + zzD;
                        zzF = ((zzgnl) this.zzd[i13]).zza();
                    } else if (i16 == 5) {
                        ((Integer) this.zzd[i13]).intValue();
                        i10 = zzgjx.zzE(i15 << 3) + 4;
                    } else {
                        throw new IllegalStateException(zzglc.zza());
                    }
                    i12 += i10;
                } else {
                    long longValue = ((Long) this.zzd[i13]).longValue();
                    zzE = zzgjx.zzE(i15 << 3);
                    zzF = zzgjx.zzF(longValue);
                }
                i10 = zzE + zzF;
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
                int zzE = zzgjx.zzE(8);
                int zzd = ((zzgji) this.zzd[i12]).zzd();
                i11 += zzE + zzE + zzgjx.zzE(16) + zzgjx.zzE(i13 >>> 3) + zzgjx.zzE(24) + zzgjx.zzE(zzd) + zzd;
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
            zzgmc.zzb(sb2, i10, String.valueOf(this.zzc[i11] >>> 3), this.zzd[i11]);
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

    public final void zzi(zzgjy zzgjyVar) throws IOException {
        if (this.zzb != 0) {
            for (int i10 = 0; i10 < this.zzb; i10++) {
                int i11 = this.zzc[i10];
                Object obj = this.zzd[i10];
                int i12 = i11 >>> 3;
                int i13 = i11 & 7;
                if (i13 == 0) {
                    zzgjyVar.zzt(i12, ((Long) obj).longValue());
                } else if (i13 == 1) {
                    zzgjyVar.zzm(i12, ((Long) obj).longValue());
                } else if (i13 == 2) {
                    zzgjyVar.zzd(i12, (zzgji) obj);
                } else if (i13 == 3) {
                    zzgjyVar.zzE(i12);
                    ((zzgnl) obj).zzi(zzgjyVar);
                    zzgjyVar.zzh(i12);
                } else if (i13 == 5) {
                    zzgjyVar.zzk(i12, ((Integer) obj).intValue());
                } else {
                    throw new RuntimeException(zzglc.zza());
                }
            }
        }
    }
}
