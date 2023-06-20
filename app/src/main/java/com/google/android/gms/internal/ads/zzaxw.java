package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaxw extends zzaya {
    private final AtomicReference zza;

    public zzaxw() {
        this(null);
    }

    protected static boolean zza(int i10, boolean z10) {
        int i11 = i10 & 3;
        return i11 == 3 || (z10 && i11 == 2);
    }

    private static int zzh(int i10, int i11) {
        if (i10 == -1) {
            return i11 != -1 ? -1 : 0;
        } else if (i11 == -1) {
            return 1;
        } else {
            return i10 - i11;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    protected final zzaxu[] zzb(zzarz[] zzarzVarArr, zzaxq[] zzaxqVarArr, int[][][] iArr) throws zzarf {
        zzaxp zzaxpVar;
        int[] iArr2;
        ArrayList arrayList;
        boolean z10;
        boolean z11;
        int i10;
        int zzh;
        int i11 = 2;
        zzaxu[] zzaxuVarArr = new zzaxu[2];
        zzaxv zzaxvVar = (zzaxv) this.zza.get();
        int i12 = 0;
        boolean z12 = false;
        while (true) {
            int i13 = -1;
            int i14 = 1;
            if (i12 >= i11) {
                break;
            }
            if (zzarzVarArr[i12].zzc() == i11) {
                if (!z12) {
                    zzarz zzarzVar = zzarzVarArr[i12];
                    zzaxq zzaxqVar = zzaxqVarArr[i12];
                    int[][] iArr3 = iArr[i12];
                    int i15 = zzaxvVar.zzd;
                    int i16 = -1;
                    int i17 = 0;
                    zzaxp zzaxpVar2 = null;
                    int i18 = 0;
                    int i19 = 0;
                    while (i17 < zzaxqVar.zzb) {
                        zzaxp zzb = zzaxqVar.zzb(i17);
                        int i20 = zzb.zza;
                        ArrayList arrayList2 = new ArrayList(i14);
                        for (int i21 = 0; i21 <= 0; i21++) {
                            arrayList2.add(Integer.valueOf(i21));
                        }
                        int[] iArr4 = iArr3[i17];
                        int i22 = 0;
                        while (i22 <= 0) {
                            zzaxq zzaxqVar2 = zzaxqVar;
                            if (zza(iArr4[i22], true)) {
                                zzart zzb2 = zzb.zzb(i22);
                                if (arrayList2.contains(Integer.valueOf(i22))) {
                                    int i23 = zzb2.zzj;
                                    zzaxpVar = zzb;
                                    z10 = true;
                                    z11 = true;
                                } else {
                                    zzaxpVar = zzb;
                                    z10 = true;
                                    z11 = false;
                                }
                                if (z10 != z11) {
                                    arrayList = arrayList2;
                                    i10 = 1;
                                } else {
                                    arrayList = arrayList2;
                                    i10 = 2;
                                }
                                iArr2 = iArr4;
                                boolean zza = zza(iArr4[i22], false);
                                if (zza) {
                                    i10 += 1000;
                                }
                                boolean z13 = i10 > i19;
                                if (i10 == i19) {
                                    if (zzb2.zza() != i16) {
                                        zzh = zzh(zzb2.zza(), i16);
                                    } else {
                                        zzh = zzh(zzb2.zzb, i13);
                                    }
                                    z13 = !(zza && z11) ? zzh >= 0 : zzh <= 0;
                                }
                                if (z13) {
                                    i13 = zzb2.zzb;
                                    i16 = zzb2.zza();
                                    i19 = i10;
                                    i18 = i22;
                                    zzaxpVar2 = zzaxpVar;
                                }
                            } else {
                                zzaxpVar = zzb;
                                iArr2 = iArr4;
                                arrayList = arrayList2;
                            }
                            i22++;
                            zzaxqVar = zzaxqVar2;
                            zzb = zzaxpVar;
                            arrayList2 = arrayList;
                            iArr4 = iArr2;
                        }
                        i17++;
                        i14 = 1;
                    }
                    zzaxx zzaxxVar = zzaxpVar2 == null ? null : new zzaxx(zzaxpVar2, i18, 0, null);
                    zzaxuVarArr[i12] = zzaxxVar;
                    z12 = zzaxxVar != null;
                }
                int i24 = zzaxqVarArr[i12].zzb;
            }
            i12++;
            i11 = 2;
        }
        int i25 = 0;
        boolean z14 = false;
        while (i25 < i11) {
            if (zzarzVarArr[i25].zzc() == 1 && !z14) {
                zzaxq zzaxqVar3 = zzaxqVarArr[i25];
                int[][] iArr5 = iArr[i25];
                String str = zzaxvVar.zza;
                int i26 = 0;
                int i27 = 0;
                int i28 = -1;
                int i29 = -1;
                while (i26 < zzaxqVar3.zzb) {
                    zzaxp zzb3 = zzaxqVar3.zzb(i26);
                    int[] iArr6 = iArr5[i26];
                    int i30 = i29;
                    int i31 = i28;
                    int i32 = i27;
                    int i33 = 0;
                    while (true) {
                        int i34 = zzb3.zza;
                        if (i33 <= 0) {
                            if (zza(iArr6[i33], true)) {
                                zzart zzb4 = zzb3.zzb(i33);
                                int i35 = iArr6[i33];
                                int i36 = 1 != (zzb4.zzx & 1) ? 1 : 2;
                                if (zza(i35, false)) {
                                    i36 += 1000;
                                }
                                if (i36 > i32) {
                                    i31 = i26;
                                    i30 = i33;
                                    i32 = i36;
                                }
                            }
                            i33++;
                        }
                    }
                    i26++;
                    i27 = i32;
                    i28 = i31;
                    i29 = i30;
                }
                zzaxx zzaxxVar2 = i28 == -1 ? null : new zzaxx(zzaxqVar3.zzb(i28), i29, 0, null);
                zzaxuVarArr[i25] = zzaxxVar2;
                z14 = zzaxxVar2 != null;
            }
            i25++;
            i11 = 2;
        }
        return zzaxuVarArr;
    }

    public zzaxw(zzayb zzaybVar) {
        this.zza = new AtomicReference(new zzaxv());
    }
}
