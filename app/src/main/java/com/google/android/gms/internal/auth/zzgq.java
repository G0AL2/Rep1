package com.google.android.gms.internal.auth;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes2.dex */
public final class zzgq {
    private static final zzgq zza = new zzgq(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private boolean zze;

    private zzgq() {
        this(0, new int[8], new Object[8], true);
    }

    private zzgq(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.zzb = i10;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = z10;
    }

    public static zzgq zza() {
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzgq zzb(zzgq zzgqVar, zzgq zzgqVar2) {
        int i10 = zzgqVar.zzb + zzgqVar2.zzb;
        int[] copyOf = Arrays.copyOf(zzgqVar.zzc, i10);
        System.arraycopy(zzgqVar2.zzc, 0, copyOf, zzgqVar.zzb, zzgqVar2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzgqVar.zzd, i10);
        System.arraycopy(zzgqVar2.zzd, 0, copyOf2, zzgqVar.zzb, zzgqVar2.zzb);
        return new zzgq(i10, copyOf, copyOf2, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzgq zzc() {
        return new zzgq(0, new int[8], new Object[8], true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof zzgq)) {
            zzgq zzgqVar = (zzgq) obj;
            int i10 = this.zzb;
            if (i10 == zzgqVar.zzb) {
                int[] iArr = this.zzc;
                int[] iArr2 = zzgqVar.zzc;
                int i11 = 0;
                while (true) {
                    if (i11 >= i10) {
                        Object[] objArr = this.zzd;
                        Object[] objArr2 = zzgqVar.zzd;
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

    public final void zzd() {
        this.zze = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zze(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.zzb; i11++) {
            zzfs.zzb(sb2, i10, String.valueOf(this.zzc[i11] >>> 3), this.zzd[i11]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzf(int i10, Object obj) {
        if (this.zze) {
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
}
