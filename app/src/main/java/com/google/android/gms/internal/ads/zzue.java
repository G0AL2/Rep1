package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzue extends zzug {
    private final zzvu zzd;
    private final zzfrj zze;
    private final zzcx zzf;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzue(zzck zzckVar, int[] iArr, int i10, zzvu zzvuVar, long j10, long j11, long j12, int i11, int i12, float f10, float f11, List list, zzcx zzcxVar) {
        super(zzckVar, iArr, 0);
        this.zzd = zzvuVar;
        this.zze = zzfrj.zzm(list);
        this.zzf = zzcxVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ zzfrj zzf(zzvf[] zzvfVarArr) {
        int i10;
        int i11;
        int[] iArr;
        ArrayList arrayList = new ArrayList();
        char c10 = 0;
        int i12 = 0;
        while (true) {
            i10 = 2;
            i11 = 1;
            if (i12 >= 2) {
                break;
            }
            zzvf zzvfVar = zzvfVarArr[i12];
            if (zzvfVar != null && zzvfVar.zzb.length > 1) {
                zzfrg zzi = zzfrj.zzi();
                zzi.zze(new zzuc(0L, 0L));
                arrayList.add(zzi);
            } else {
                arrayList.add(null);
            }
            i12++;
        }
        long[][] jArr = new long[2];
        for (int i13 = 0; i13 < 2; i13++) {
            zzvf zzvfVar2 = zzvfVarArr[i13];
            if (zzvfVar2 == null) {
                jArr[i13] = new long[0];
            } else {
                jArr[i13] = new long[zzvfVar2.zzb.length];
                int i14 = 0;
                while (true) {
                    if (i14 >= zzvfVar2.zzb.length) {
                        break;
                    }
                    jArr[i13][i14] = zzvfVar2.zza.zzb(iArr[i14]).zzi;
                    i14++;
                }
                Arrays.sort(jArr[i13]);
            }
        }
        int[] iArr2 = new int[2];
        long[] jArr2 = new long[2];
        for (int i15 = 0; i15 < 2; i15++) {
            long[] jArr3 = jArr[i15];
            jArr2[i15] = jArr3.length == 0 ? 0L : jArr3[0];
        }
        zzg(arrayList, jArr2);
        zzfru zza = zzfsm.zzc(zzfsr.zzc()).zzb(2).zza();
        int i16 = 0;
        while (i16 < i10) {
            int length = jArr[i16].length;
            if (length > i11) {
                double[] dArr = new double[length];
                int i17 = 0;
                while (true) {
                    long[] jArr4 = jArr[i16];
                    double d10 = 0.0d;
                    if (i17 >= jArr4.length) {
                        break;
                    }
                    long j10 = jArr4[i17];
                    if (j10 != -1) {
                        d10 = Math.log(j10);
                    }
                    dArr[i17] = d10;
                    i17++;
                }
                int i18 = length - 1;
                double d11 = dArr[i18] - dArr[c10];
                int i19 = 0;
                while (i19 < i18) {
                    int i20 = i19 + 1;
                    zza.zzs(Double.valueOf(d11 == 0.0d ? 1.0d : (((dArr[i19] + dArr[i20]) * 0.5d) - dArr[c10]) / d11), Integer.valueOf(i16));
                    i19 = i20;
                    c10 = 0;
                }
            }
            i16++;
            c10 = 0;
            i10 = 2;
            i11 = 1;
        }
        zzfrj zzm = zzfrj.zzm(zza.zzt());
        for (int i21 = 0; i21 < zzm.size(); i21++) {
            int intValue = ((Integer) zzm.get(i21)).intValue();
            int i22 = iArr2[intValue] + 1;
            iArr2[intValue] = i22;
            jArr2[intValue] = jArr[intValue][i22];
            zzg(arrayList, jArr2);
        }
        for (int i23 = 0; i23 < 2; i23++) {
            if (arrayList.get(i23) != null) {
                long j11 = jArr2[i23];
                jArr2[i23] = j11 + j11;
            }
        }
        zzg(arrayList, jArr2);
        zzfrg zzi2 = zzfrj.zzi();
        for (int i24 = 0; i24 < arrayList.size(); i24++) {
            zzfrg zzfrgVar = (zzfrg) arrayList.get(i24);
            zzi2.zze(zzfrgVar == null ? zzfrj.zzo() : zzfrgVar.zzg());
        }
        return zzi2.zzg();
    }

    private static void zzg(List list, long[] jArr) {
        long j10 = 0;
        for (int i10 = 0; i10 < 2; i10++) {
            j10 += jArr[i10];
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            zzfrg zzfrgVar = (zzfrg) list.get(i11);
            if (zzfrgVar != null) {
                zzfrgVar.zze(new zzuc(j10, jArr[i11]));
            }
        }
    }
}
