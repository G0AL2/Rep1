package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzve extends zzvj {
    public static final /* synthetic */ int zza = 0;
    private static final zzfsr zzb = zzfsr.zzb(new Comparator() { // from class: com.google.android.gms.internal.ads.zzun
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            Integer num = (Integer) obj;
            Integer num2 = (Integer) obj2;
            int i10 = zzve.zza;
            if (num.intValue() == -1) {
                return num2.intValue() == -1 ? 0 : -1;
            } else if (num2.intValue() == -1) {
                return 1;
            } else {
                return num.intValue() - num2.intValue();
            }
        }
    });
    private static final zzfsr zzc = zzfsr.zzb(new Comparator() { // from class: com.google.android.gms.internal.ads.zzuo
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            Integer num = (Integer) obj;
            Integer num2 = (Integer) obj2;
            int i10 = zzve.zza;
            return 0;
        }
    });
    private final AtomicReference zzd;
    private final zzud zze;

    @Deprecated
    public zzve() {
        zzut zzutVar = zzut.zzD;
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static int zza(zzad zzadVar, String str, boolean z10) {
        if (TextUtils.isEmpty(str) || !str.equals(zzadVar.zzd)) {
            String zzf = zzf(str);
            String zzf2 = zzf(zzadVar.zzd);
            if (zzf2 == null || zzf == null) {
                return (z10 && zzf2 == null) ? 1 : 0;
            } else if (zzf2.startsWith(zzf) || zzf.startsWith(zzf2)) {
                return 3;
            } else {
                return zzeg.zzag(zzf2, Constants.FILENAME_SEQUENCE_SEPARATOR)[0].equals(zzeg.zzag(zzf, Constants.FILENAME_SEQUENCE_SEPARATOR)[0]) ? 2 : 0;
            }
        }
        return 4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static String zzf(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean zzi(int i10, boolean z10) {
        int i11 = i10 & 7;
        return i11 == 4 || (z10 && i11 == 3);
    }

    private static void zzp(zzty zztyVar, zzcp zzcpVar, Map map) {
        for (int i10 = 0; i10 < zztyVar.zzc; i10++) {
            if (((zzcm) zzcpVar.zzB.get(zztyVar.zzb(i10))) != null) {
                throw null;
            }
        }
    }

    private static final Pair zzq(int i10, zzvi zzviVar, int[][][] iArr, zzuz zzuzVar, Comparator comparator) {
        RandomAccess randomAccess;
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < 2; i11++) {
            if (i10 == zzviVar.zzc(i11)) {
                zzty zzd = zzviVar.zzd(i11);
                for (int i12 = 0; i12 < zzd.zzc; i12++) {
                    zzck zzb2 = zzd.zzb(i12);
                    List zza2 = zzuzVar.zza(i11, zzb2, iArr[i11][i12]);
                    int i13 = zzb2.zzb;
                    int i14 = 1;
                    boolean[] zArr = new boolean[1];
                    int i15 = 0;
                    while (i15 <= 0) {
                        zzva zzvaVar = (zzva) zza2.get(i15);
                        int zzb3 = zzvaVar.zzb();
                        if (!zArr[i15] && zzb3 != 0) {
                            if (zzb3 == i14) {
                                randomAccess = zzfrj.zzp(zzvaVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(zzvaVar);
                                for (int i16 = i15 + 1; i16 <= 0; i16++) {
                                    zzva zzvaVar2 = (zzva) zza2.get(i16);
                                    if (zzvaVar2.zzb() == 2 && zzvaVar.zzc(zzvaVar2)) {
                                        arrayList2.add(zzvaVar2);
                                        zArr[i16] = true;
                                    }
                                }
                                randomAccess = arrayList2;
                            }
                            arrayList.add(randomAccess);
                        }
                        i15++;
                        i14 = 1;
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i17 = 0; i17 < list.size(); i17++) {
            iArr2[i17] = ((zzva) list.get(i17)).zzc;
        }
        zzva zzvaVar3 = (zzva) list.get(0);
        return Pair.create(new zzvf(zzvaVar3.zzb, iArr2, 0), Integer.valueOf(zzvaVar3.zza));
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    protected final Pair zzb(zzvi zzviVar, int[][][] iArr, final int[] iArr2, zzsa zzsaVar, zzci zzciVar) throws zzgt {
        int i10;
        final boolean z10;
        final String str;
        int[] iArr3;
        int length;
        zzvg zza2;
        int[][][] iArr4 = iArr;
        final zzut zzutVar = (zzut) this.zzd.get();
        int i11 = 2;
        zzvf[] zzvfVarArr = new zzvf[2];
        Pair zzq = zzq(2, zzviVar, iArr4, new zzuz() { // from class: com.google.android.gms.internal.ads.zzuj
            /* JADX WARN: Removed duplicated region for block: B:25:0x0048  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
            @Override // com.google.android.gms.internal.ads.zzuz
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.util.List zza(int r17, com.google.android.gms.internal.ads.zzck r18, int[] r19) {
                /*
                    r16 = this;
                    r0 = r16
                    r9 = r18
                    com.google.android.gms.internal.ads.zzut r10 = com.google.android.gms.internal.ads.zzut.this
                    int[] r1 = r2
                    int r2 = com.google.android.gms.internal.ads.zzve.zza
                    r11 = r1[r17]
                    int r1 = r10.zzl
                    int r2 = r10.zzm
                    boolean r3 = r10.zzn
                    r14 = 2147483647(0x7fffffff, float:NaN)
                    if (r1 == r14) goto L80
                    if (r2 != r14) goto L1b
                    goto L83
                L1b:
                    r4 = 0
                    r5 = 2147483647(0x7fffffff, float:NaN)
                L1f:
                    int r6 = r9.zzb
                    if (r4 > 0) goto L7e
                    com.google.android.gms.internal.ads.zzad r6 = r9.zzb(r4)
                    int r7 = r6.zzr
                    if (r7 <= 0) goto L78
                    int r8 = r6.zzs
                    if (r8 <= 0) goto L78
                    if (r3 == 0) goto L40
                    if (r7 > r8) goto L35
                    r15 = 0
                    goto L36
                L35:
                    r15 = 1
                L36:
                    if (r1 > r2) goto L3a
                    r12 = 0
                    goto L3b
                L3a:
                    r12 = 1
                L3b:
                    if (r15 == r12) goto L40
                    r12 = r1
                    r15 = r2
                    goto L42
                L40:
                    r15 = r1
                    r12 = r2
                L42:
                    int r13 = r7 * r12
                    int r14 = r8 * r15
                    if (r13 < r14) goto L52
                    android.graphics.Point r8 = new android.graphics.Point
                    int r7 = com.google.android.gms.internal.ads.zzeg.zze(r14, r7)
                    r8.<init>(r15, r7)
                    goto L5c
                L52:
                    android.graphics.Point r7 = new android.graphics.Point
                    int r8 = com.google.android.gms.internal.ads.zzeg.zze(r13, r8)
                    r7.<init>(r8, r12)
                    r8 = r7
                L5c:
                    int r7 = r6.zzr
                    int r6 = r6.zzs
                    int r12 = r7 * r6
                    int r13 = r8.x
                    float r13 = (float) r13
                    r14 = 1065017672(0x3f7ae148, float:0.98)
                    float r13 = r13 * r14
                    int r13 = (int) r13
                    if (r7 < r13) goto L78
                    int r7 = r8.y
                    float r7 = (float) r7
                    float r7 = r7 * r14
                    int r7 = (int) r7
                    if (r6 < r7) goto L78
                    if (r12 >= r5) goto L78
                    r5 = r12
                L78:
                    int r4 = r4 + 1
                    r14 = 2147483647(0x7fffffff, float:NaN)
                    goto L1f
                L7e:
                    r14 = r5
                    goto L83
                L80:
                    r14 = 2147483647(0x7fffffff, float:NaN)
                L83:
                    com.google.android.gms.internal.ads.zzfrg r12 = com.google.android.gms.internal.ads.zzfrj.zzi()
                    r13 = 0
                L88:
                    int r1 = r9.zzb
                    if (r13 > 0) goto Lb8
                    com.google.android.gms.internal.ads.zzad r1 = r9.zzb(r13)
                    int r1 = r1.zza()
                    r15 = 2147483647(0x7fffffff, float:NaN)
                    if (r14 == r15) goto La1
                    r2 = -1
                    if (r1 == r2) goto L9f
                    if (r1 > r14) goto L9f
                    goto La1
                L9f:
                    r8 = 0
                    goto La2
                La1:
                    r8 = 1
                La2:
                    com.google.android.gms.internal.ads.zzvd r7 = new com.google.android.gms.internal.ads.zzvd
                    r6 = r19[r13]
                    r1 = r7
                    r2 = r17
                    r3 = r18
                    r4 = r13
                    r5 = r10
                    r15 = r7
                    r7 = r11
                    r1.<init>(r2, r3, r4, r5, r6, r7, r8)
                    r12.zze(r15)
                    int r13 = r13 + 1
                    goto L88
                Lb8:
                    com.google.android.gms.internal.ads.zzfrj r1 = r12.zzg()
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzuj.zza(int, com.google.android.gms.internal.ads.zzck, int[]):java.util.List");
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzuk
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                List list = (List) obj;
                List list2 = (List) obj2;
                zzfqy zzj = zzfqy.zzj();
                zzvb zzvbVar = new Comparator() { // from class: com.google.android.gms.internal.ads.zzvb
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzvd.zzd((zzvd) obj3, (zzvd) obj4);
                    }
                };
                zzfqy zzb2 = zzj.zzc((zzvd) Collections.max(list, zzvbVar), (zzvd) Collections.max(list2, zzvbVar), zzvbVar).zzb(list.size(), list2.size());
                zzvc zzvcVar = new Comparator() { // from class: com.google.android.gms.internal.ads.zzvc
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzvd.zza((zzvd) obj3, (zzvd) obj4);
                    }
                };
                return zzb2.zzc((zzvd) Collections.max(list, zzvcVar), (zzvd) Collections.max(list2, zzvcVar), zzvcVar).zza();
            }
        });
        if (zzq != null) {
            zzvfVarArr[((Integer) zzq.second).intValue()] = (zzvf) zzq.first;
        }
        int i12 = 0;
        while (true) {
            i10 = 1;
            if (i12 >= 2) {
                z10 = false;
                break;
            } else if (zzviVar.zzc(i12) == 2 && zzviVar.zzd(i12).zzc > 0) {
                z10 = true;
                break;
            } else {
                i12++;
            }
        }
        Pair zzq2 = zzq(1, zzviVar, iArr4, new zzuz() { // from class: com.google.android.gms.internal.ads.zzuh
            @Override // com.google.android.gms.internal.ads.zzuz
            public final List zza(int i13, zzck zzckVar, int[] iArr5) {
                zzut zzutVar2 = zzut.this;
                boolean z11 = z10;
                int i14 = zzve.zza;
                zzfrg zzi = zzfrj.zzi();
                int i15 = 0;
                while (true) {
                    int i16 = zzckVar.zzb;
                    if (i15 <= 0) {
                        zzi.zze(new zzup(i13, zzckVar, i15, zzutVar2, iArr5[i15], z11));
                        i15++;
                    } else {
                        return zzi.zzg();
                    }
                }
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzui
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((zzup) Collections.max((List) obj)).compareTo((zzup) Collections.max((List) obj2));
            }
        });
        if (zzq2 != null) {
            zzvfVarArr[((Integer) zzq2.second).intValue()] = (zzvf) zzq2.first;
        }
        if (zzq2 == null) {
            str = null;
        } else {
            Object obj = zzq2.first;
            str = ((zzvf) obj).zza.zzb(((zzvf) obj).zzb[0]).zzd;
        }
        int i13 = 3;
        Pair zzq3 = zzq(3, zzviVar, iArr4, new zzuz() { // from class: com.google.android.gms.internal.ads.zzul
            @Override // com.google.android.gms.internal.ads.zzuz
            public final List zza(int i14, zzck zzckVar, int[] iArr5) {
                zzut zzutVar2 = zzut.this;
                String str2 = str;
                int i15 = zzve.zza;
                zzfrg zzi = zzfrj.zzi();
                int i16 = 0;
                while (true) {
                    int i17 = zzckVar.zzb;
                    if (i16 <= 0) {
                        zzi.zze(new zzuy(i14, zzckVar, i16, zzutVar2, iArr5[i16], str2));
                        i16++;
                    } else {
                        return zzi.zzg();
                    }
                }
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzum
            @Override // java.util.Comparator
            public final int compare(Object obj2, Object obj3) {
                return ((zzuy) ((List) obj2).get(0)).compareTo((zzuy) ((List) obj3).get(0));
            }
        });
        if (zzq3 != null) {
            zzvfVarArr[((Integer) zzq3.second).intValue()] = (zzvf) zzq3.first;
        }
        int i14 = 0;
        while (i14 < i11) {
            int zzc2 = zzviVar.zzc(i14);
            if (zzc2 != i11 && zzc2 != i10 && zzc2 != i13) {
                zzty zzd = zzviVar.zzd(i14);
                int[][] iArr5 = iArr4[i14];
                int i15 = 0;
                zzck zzckVar = null;
                int i16 = 0;
                zzuq zzuqVar = null;
                while (i15 < zzd.zzc) {
                    zzck zzb2 = zzd.zzb(i15);
                    int[] iArr6 = iArr5[i15];
                    zzuq zzuqVar2 = zzuqVar;
                    int i17 = 0;
                    while (true) {
                        int i18 = zzb2.zzb;
                        if (i17 <= 0) {
                            if (zzi(iArr6[i17], zzutVar.zzP)) {
                                zzuq zzuqVar3 = new zzuq(zzb2.zzb(i17), iArr6[i17]);
                                if (zzuqVar2 == null || zzuqVar3.compareTo(zzuqVar2) > 0) {
                                    i16 = i17;
                                    zzuqVar2 = zzuqVar3;
                                    zzckVar = zzb2;
                                }
                            }
                            i17++;
                        }
                    }
                    i15++;
                    zzuqVar = zzuqVar2;
                }
                zzvfVarArr[i14] = zzckVar == null ? null : new zzvf(zzckVar, new int[]{i16}, 0);
            }
            i14++;
            iArr4 = iArr;
            i11 = 2;
            i10 = 1;
            i13 = 3;
        }
        HashMap hashMap = new HashMap();
        for (int i19 = 0; i19 < 2; i19++) {
            zzp(zzviVar.zzd(i19), zzutVar, hashMap);
        }
        zzp(zzviVar.zze(), zzutVar, hashMap);
        for (int i20 = 0; i20 < 2; i20++) {
            if (((zzcm) hashMap.get(Integer.valueOf(zzviVar.zzc(i20)))) != null) {
                throw null;
            }
        }
        int i21 = 0;
        for (int i22 = 2; i21 < i22; i22 = 2) {
            zzty zzd2 = zzviVar.zzd(i21);
            if (zzutVar.zzg(i21, zzd2)) {
                if (zzutVar.zze(i21, zzd2) == null) {
                    zzvfVarArr[i21] = null;
                } else {
                    throw null;
                }
            }
            i21++;
        }
        int i23 = 0;
        for (int i24 = 2; i23 < i24; i24 = 2) {
            int zzc3 = zzviVar.zzc(i23);
            if (zzutVar.zzf(i23) || zzutVar.zzC.contains(Integer.valueOf(zzc3))) {
                zzvfVarArr[i23] = null;
            }
            i23++;
        }
        zzud zzudVar = this.zze;
        zzvu zzl = zzl();
        zzfrj zzf = zzue.zzf(zzvfVarArr);
        int i25 = 2;
        zzvg[] zzvgVarArr = new zzvg[2];
        int i26 = 0;
        while (i26 < i25) {
            zzvf zzvfVar = zzvfVarArr[i26];
            if (zzvfVar != null && (length = (iArr3 = zzvfVar.zzb).length) != 0) {
                if (length == 1) {
                    zza2 = new zzvh(zzvfVar.zza, iArr3[0], 0, 0, null);
                } else {
                    zza2 = zzudVar.zza(zzvfVar.zza, iArr3, 0, zzl, (zzfrj) zzf.get(i26));
                }
                zzvgVarArr[i26] = zza2;
            }
            i26++;
            i25 = 2;
        }
        zzjv[] zzjvVarArr = new zzjv[i25];
        for (int i27 = 0; i27 < i25; i27++) {
            zzjvVarArr[i27] = (zzutVar.zzf(i27) || zzutVar.zzC.contains(Integer.valueOf(zzviVar.zzc(i27))) || (zzviVar.zzc(i27) != -2 && zzvgVarArr[i27] == null)) ? null : zzjv.zza;
        }
        boolean z11 = zzutVar.zzQ;
        return Pair.create(zzjvVarArr, zzvgVarArr);
    }

    public final zzut zzc() {
        return (zzut) this.zzd.get();
    }

    public final void zzg(zzuv zzuvVar) {
        zzut zzutVar = new zzut(zzuvVar);
        if (((zzut) this.zzd.getAndSet(zzutVar)).equals(zzutVar)) {
            return;
        }
        zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final boolean zzh() {
        return true;
    }

    public zzve(Context context) {
        zzud zzudVar = new zzud();
        zzut zzc2 = zzut.zzc(context);
        this.zze = zzudVar;
        this.zzd = new AtomicReference(zzc2);
    }
}
