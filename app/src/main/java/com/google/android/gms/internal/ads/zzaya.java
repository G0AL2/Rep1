package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Arrays;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzaya extends zzaye {
    private final SparseArray zza = new SparseArray();
    private final SparseBooleanArray zzb = new SparseBooleanArray();
    private zzaxy zzc;

    protected abstract zzaxu[] zzb(zzarz[] zzarzVarArr, zzaxq[] zzaxqVarArr, int[][][] iArr) throws zzarf;

    @Override // com.google.android.gms.internal.ads.zzaye
    public final zzayf zzc(zzarz[] zzarzVarArr, zzaxq zzaxqVar) throws zzarf {
        int[] iArr;
        int[] iArr2 = new int[3];
        zzaxp[][] zzaxpVarArr = new zzaxp[3];
        int[][][] iArr3 = new int[3][];
        for (int i10 = 0; i10 < 3; i10++) {
            int i11 = zzaxqVar.zzb;
            zzaxpVarArr[i10] = new zzaxp[i11];
            iArr3[i10] = new int[i11];
        }
        int i12 = 2;
        int[] iArr4 = new int[2];
        for (int i13 = 0; i13 < 2; i13++) {
            zzarzVarArr[i13].zze();
            iArr4[i13] = 4;
        }
        int i14 = 0;
        while (i14 < zzaxqVar.zzb) {
            zzaxp zzb = zzaxqVar.zzb(i14);
            int i15 = 0;
            int i16 = 0;
            int i17 = 2;
            while (true) {
                if (i15 >= i12) {
                    i15 = i17;
                    break;
                }
                zzarz zzarzVar = zzarzVarArr[i15];
                int i18 = 0;
                while (true) {
                    int i19 = zzb.zza;
                    if (i18 <= 0) {
                        int zzG = zzarzVar.zzG(zzb.zzb(i18)) & 3;
                        if (zzG > i16) {
                            if (zzG == 3) {
                                break;
                            }
                            i17 = i15;
                            i16 = zzG;
                        }
                        i18++;
                    }
                }
                i15++;
                i12 = 2;
            }
            if (i15 == 2) {
                int i20 = zzb.zza;
                iArr = new int[1];
            } else {
                zzarz zzarzVar2 = zzarzVarArr[i15];
                int i21 = zzb.zza;
                int[] iArr5 = new int[1];
                for (int i22 = 0; i22 <= 0; i22++) {
                    iArr5[i22] = zzarzVar2.zzG(zzb.zzb(i22));
                }
                iArr = iArr5;
            }
            int i23 = iArr2[i15];
            zzaxpVarArr[i15][i23] = zzb;
            iArr3[i15][i23] = iArr;
            iArr2[i15] = i23 + 1;
            i14++;
            i12 = 2;
        }
        zzaxq[] zzaxqVarArr = new zzaxq[2];
        int[] iArr6 = new int[2];
        int i24 = 0;
        for (int i25 = 2; i24 < i25; i25 = 2) {
            int i26 = iArr2[i24];
            zzaxqVarArr[i24] = new zzaxq((zzaxp[]) Arrays.copyOf(zzaxpVarArr[i24], i26));
            iArr3[i24] = (int[][]) Arrays.copyOf(iArr3[i24], i26);
            iArr6[i24] = zzarzVarArr[i24].zzc();
            i24++;
        }
        zzaxq zzaxqVar2 = new zzaxq((zzaxp[]) Arrays.copyOf(zzaxpVarArr[2], iArr2[2]));
        zzaxu[] zzb2 = zzb(zzarzVarArr, zzaxqVarArr, iArr3);
        int i27 = 0;
        for (int i28 = 2; i27 < i28; i28 = 2) {
            if (this.zzb.get(i27)) {
                zzb2[i27] = null;
            } else {
                zzaxq zzaxqVar3 = zzaxqVarArr[i27];
                Map map = (Map) this.zza.get(i27);
                if ((map == null ? null : (zzaxz) map.get(zzaxqVar3)) != null) {
                    throw null;
                }
            }
            i27++;
        }
        zzaxy zzaxyVar = new zzaxy(iArr6, zzaxqVarArr, iArr4, iArr3, zzaxqVar2);
        zzasa[] zzasaVarArr = new zzasa[2];
        for (int i29 = 0; i29 < 2; i29++) {
            zzasaVarArr[i29] = zzb2[i29] != null ? zzasa.zza : null;
        }
        return new zzayf(zzaxqVar, new zzayc(zzb2, null), zzaxyVar, zzasaVarArr);
    }

    @Override // com.google.android.gms.internal.ads.zzaye
    public final void zzd(Object obj) {
        this.zzc = (zzaxy) obj;
    }

    public final void zze(int i10, boolean z10) {
        if (this.zzb.get(i10) == z10) {
            return;
        }
        this.zzb.put(i10, z10);
        zzg();
    }
}
