package com.google.android.gms.internal.p002firebaseauthapi;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabu  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzabu {
    private static final zzabu zza = new zzabu(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzabu() {
        this(0, new int[8], new Object[8], true);
    }

    private zzabu(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.zze = -1;
        this.zzb = i10;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z10;
    }

    public static zzabu zzc() {
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzabu zzd(zzabu zzabuVar, zzabu zzabuVar2) {
        int i10 = zzabuVar.zzb + zzabuVar2.zzb;
        int[] copyOf = Arrays.copyOf(zzabuVar.zzc, i10);
        System.arraycopy(zzabuVar2.zzc, 0, copyOf, zzabuVar.zzb, zzabuVar2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzabuVar.zzd, i10);
        System.arraycopy(zzabuVar2.zzd, 0, copyOf2, zzabuVar.zzb, zzabuVar2.zzb);
        return new zzabu(i10, copyOf, copyOf2, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzabu zze() {
        return new zzabu(0, new int[8], new Object[8], true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof zzabu)) {
            zzabu zzabuVar = (zzabu) obj;
            int i10 = this.zzb;
            if (i10 == zzabuVar.zzb) {
                int[] iArr = this.zzc;
                int[] iArr2 = zzabuVar.zzc;
                int i11 = 0;
                while (true) {
                    if (i11 >= i10) {
                        Object[] objArr = this.zzd;
                        Object[] objArr2 = zzabuVar.zzd;
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
                        i10 = zzyt.zzE(i15 << 3) + 8;
                    } else if (i16 == 2) {
                        int zzE2 = zzyt.zzE(i15 << 3);
                        int zzd = ((zzyi) this.zzd[i13]).zzd();
                        i12 += zzE2 + zzyt.zzE(zzd) + zzd;
                    } else if (i16 == 3) {
                        int zzD = zzyt.zzD(i15);
                        zzE = zzD + zzD;
                        zzF = ((zzabu) this.zzd[i13]).zza();
                    } else if (i16 == 5) {
                        ((Integer) this.zzd[i13]).intValue();
                        i10 = zzyt.zzE(i15 << 3) + 4;
                    } else {
                        throw new IllegalStateException(zzzt.zza());
                    }
                    i12 += i10;
                } else {
                    long longValue = ((Long) this.zzd[i13]).longValue();
                    zzE = zzyt.zzE(i15 << 3);
                    zzF = zzyt.zzF(longValue);
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
                int zzE = zzyt.zzE(8);
                int zzd = ((zzyi) this.zzd[i12]).zzd();
                i11 += zzE + zzE + zzyt.zzE(16) + zzyt.zzE(i13 >>> 3) + zzyt.zzE(24) + zzyt.zzE(zzd) + zzd;
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
            zzaas.zzb(sb2, i10, String.valueOf(this.zzc[i11] >>> 3), this.zzd[i11]);
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

    public final void zzi(zzyu zzyuVar) throws IOException {
        if (this.zzb != 0) {
            for (int i10 = 0; i10 < this.zzb; i10++) {
                int i11 = this.zzc[i10];
                Object obj = this.zzd[i10];
                int i12 = i11 >>> 3;
                int i13 = i11 & 7;
                if (i13 == 0) {
                    zzyuVar.zzt(i12, ((Long) obj).longValue());
                } else if (i13 == 1) {
                    zzyuVar.zzm(i12, ((Long) obj).longValue());
                } else if (i13 == 2) {
                    zzyuVar.zzd(i12, (zzyi) obj);
                } else if (i13 == 3) {
                    zzyuVar.zzE(i12);
                    ((zzabu) obj).zzi(zzyuVar);
                    zzyuVar.zzh(i12);
                } else if (i13 == 5) {
                    zzyuVar.zzk(i12, ((Integer) obj).intValue());
                } else {
                    throw new RuntimeException(zzzt.zza());
                }
            }
        }
    }
}
