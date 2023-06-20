package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzvj extends zzvm {
    private zzvi zza;

    protected abstract Pair zzb(zzvi zzviVar, int[][][] iArr, int[] iArr2, zzsa zzsaVar, zzci zzciVar) throws zzgt;

    @Override // com.google.android.gms.internal.ads.zzvm
    public final zzvn zzj(zzju[] zzjuVarArr, zzty zztyVar, zzsa zzsaVar, zzci zzciVar) throws zzgt {
        boolean z10;
        int[] iArr;
        int[] iArr2 = new int[3];
        zzck[][] zzckVarArr = new zzck[3];
        int[][][] iArr3 = new int[3][];
        for (int i10 = 0; i10 < 3; i10++) {
            int i11 = zztyVar.zzc;
            zzckVarArr[i10] = new zzck[i11];
            iArr3[i10] = new int[i11];
        }
        int i12 = 2;
        int[] iArr4 = new int[2];
        for (int i13 = 0; i13 < 2; i13++) {
            iArr4[i13] = zzjuVarArr[i13].zze();
        }
        int i14 = 0;
        while (i14 < zztyVar.zzc) {
            zzck zzb = zztyVar.zzb(i14);
            int i15 = zzb.zzd;
            int i16 = 0;
            int i17 = 2;
            int i18 = 0;
            boolean z11 = true;
            while (i16 < i12) {
                zzju zzjuVar = zzjuVarArr[i16];
                int i19 = 0;
                for (int i20 = 0; i20 <= 0; i20++) {
                    i19 = Math.max(i19, zzjuVar.zzO(zzb.zzb(i20)) & 7);
                }
                boolean z12 = iArr2[i16] == 0;
                if (i19 > i18) {
                    z11 = z12;
                    i17 = i16;
                    i18 = i19;
                } else if (i19 == i18 && i15 == 5 && !z11 && z12) {
                    i17 = i16;
                    i18 = i19;
                    z11 = true;
                }
                i16++;
                i12 = 2;
            }
            if (i17 == i12) {
                iArr = new int[1];
            } else {
                zzju zzjuVar2 = zzjuVarArr[i17];
                int[] iArr5 = new int[1];
                for (int i21 = 0; i21 <= 0; i21++) {
                    iArr5[i21] = zzjuVar2.zzO(zzb.zzb(i21));
                }
                iArr = iArr5;
            }
            int i22 = iArr2[i17];
            zzckVarArr[i17][i22] = zzb;
            iArr3[i17][i22] = iArr;
            iArr2[i17] = i22 + 1;
            i14++;
            i12 = 2;
        }
        zzty[] zztyVarArr = new zzty[i12];
        String[] strArr = new String[i12];
        int[] iArr6 = new int[i12];
        int i23 = 0;
        while (i23 < i12) {
            int i24 = iArr2[i23];
            zztyVarArr[i23] = new zzty((zzck[]) zzeg.zzad(zzckVarArr[i23], i24));
            iArr3[i23] = (int[][]) zzeg.zzad(iArr3[i23], i24);
            strArr[i23] = zzjuVarArr[i23].zzK();
            iArr6[i23] = zzjuVarArr[i23].zzb();
            i23++;
            i12 = 2;
        }
        zzvi zzviVar = new zzvi(strArr, iArr6, zztyVarArr, iArr4, iArr3, new zzty((zzck[]) zzeg.zzad(zzckVarArr[2], iArr2[2])));
        Pair zzb2 = zzb(zzviVar, iArr3, iArr4, zzsaVar, zzciVar);
        zzvk[] zzvkVarArr = (zzvk[]) zzb2.second;
        List[] listArr = new List[zzvkVarArr.length];
        for (int i25 = 0; i25 < zzvkVarArr.length; i25++) {
            zzvk zzvkVar = zzvkVarArr[i25];
            listArr[i25] = zzvkVar != null ? zzfrj.zzp(zzvkVar) : zzfrj.zzo();
        }
        zzfrg zzfrgVar = new zzfrg();
        for (int i26 = 0; i26 < 2; i26++) {
            zzty zzd = zzviVar.zzd(i26);
            List list = listArr[i26];
            for (int i27 = 0; i27 < zzd.zzc; i27++) {
                zzck zzb3 = zzd.zzb(i27);
                boolean z13 = zzviVar.zza(i26, i27, false) != 0;
                int i28 = zzb3.zzb;
                int[] iArr7 = new int[1];
                boolean[] zArr = new boolean[1];
                for (int i29 = 0; i29 <= 0; i29++) {
                    iArr7[i29] = zzviVar.zzb(i26, i27, i29) & 7;
                    int i30 = 0;
                    while (true) {
                        if (i30 >= list.size()) {
                            z10 = false;
                            break;
                        }
                        zzvk zzvkVar2 = (zzvk) list.get(i30);
                        if (zzvkVar2.zze().equals(zzb3) && zzvkVar2.zzb(i29) != -1) {
                            z10 = true;
                            break;
                        }
                        i30++;
                    }
                    zArr[i29] = z10;
                }
                zzfrgVar.zze(new zzcs(zzb3, z13, iArr7, zArr));
            }
        }
        zzty zze = zzviVar.zze();
        for (int i31 = 0; i31 < zze.zzc; i31++) {
            zzck zzb4 = zze.zzb(i31);
            int i32 = zzb4.zzb;
            int[] iArr8 = new int[1];
            Arrays.fill(iArr8, 0);
            zzfrgVar.zze(new zzcs(zzb4, false, iArr8, new boolean[1]));
        }
        return new zzvn((zzjv[]) zzb2.first, (zzvg[]) zzb2.second, new zzct(zzfrgVar.zzg()), zzviVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final void zzk(Object obj) {
        this.zza = (zzvi) obj;
    }
}
