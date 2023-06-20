package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.ads.AdRequest;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaej implements zzyr {
    public static final zzyy zza = new zzyy() { // from class: com.google.android.gms.internal.ads.zzaef
        @Override // com.google.android.gms.internal.ads.zzyy
        public final zzyr[] zza() {
            zzyy zzyyVar = zzaej.zza;
            return new zzyr[]{new zzaej(0, null)};
        }

        @Override // com.google.android.gms.internal.ads.zzyy
        public final /* synthetic */ zzyr[] zzb(Uri uri, Map map) {
            return zzyx.zza(this, uri, map);
        }
    };
    private static final byte[] zzb = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final zzad zzc;
    private int zzA;
    private int zzB;
    private boolean zzC;
    private zzyu zzD;
    private zzzy[] zzE;
    private zzzy[] zzF;
    private boolean zzG;
    private final List zzd;
    private final SparseArray zze;
    private final zzdy zzf;
    private final zzdy zzg;
    private final zzdy zzh;
    private final byte[] zzi;
    private final zzdy zzj;
    private final zzabe zzk;
    private final zzdy zzl;
    private final ArrayDeque zzm;
    private final ArrayDeque zzn;
    private int zzo;
    private int zzp;
    private long zzq;
    private int zzr;
    private zzdy zzs;
    private long zzt;
    private int zzu;
    private long zzv;
    private long zzw;
    private long zzx;
    private zzaei zzy;
    private int zzz;

    static {
        zzab zzabVar = new zzab();
        zzabVar.zzS("application/x-emsg");
        zzc = zzabVar.zzY();
    }

    public zzaej() {
        this(0, null);
    }

    private static int zze(int i10) throws zzbp {
        if (i10 >= 0) {
            return i10;
        }
        throw zzbp.zza("Unexpected negative value: " + i10, null);
    }

    private static zzv zzf(List list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            zzadu zzaduVar = (zzadu) list.get(i10);
            if (zzaduVar.zzd == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] zzH = zzaduVar.zza.zzH();
                UUID zza2 = zzaeq.zza(zzH);
                if (zza2 == null) {
                    Log.w("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new zzu(zza2, null, "video/mp4", zzH));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new zzv(arrayList);
    }

    private final void zzg() {
        this.zzo = 0;
        this.zzr = 0;
    }

    private static void zzh(zzdy zzdyVar, int i10, zzaev zzaevVar) throws zzbp {
        zzdyVar.zzF(i10 + 8);
        int zze = zzdyVar.zze() & 16777215;
        if ((zze & 1) == 0) {
            boolean z10 = (zze & 2) != 0;
            int zzn = zzdyVar.zzn();
            if (zzn == 0) {
                Arrays.fill(zzaevVar.zzl, 0, zzaevVar.zze, false);
                return;
            }
            int i11 = zzaevVar.zze;
            if (zzn == i11) {
                Arrays.fill(zzaevVar.zzl, 0, zzn, z10);
                zzaevVar.zza(zzdyVar.zza());
                zzdy zzdyVar2 = zzaevVar.zzn;
                zzdyVar.zzB(zzdyVar2.zzH(), 0, zzdyVar2.zzd());
                zzaevVar.zzn.zzF(0);
                zzaevVar.zzo = false;
                return;
            }
            throw zzbp.zza("Senc sample count " + zzn + " is different from fragment sample count" + i11, null);
        }
        throw zzbp.zzc("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    private final void zzi(long j10) throws zzbp {
        zzaej zzaejVar;
        SparseArray sparseArray;
        zzadt zzadtVar;
        int i10;
        int i11;
        byte[] bArr;
        int i12;
        int i13;
        int i14;
        int i15;
        byte[] bArr2;
        byte[] bArr3;
        int i16;
        boolean z10;
        int i17;
        zzadt zzadtVar2;
        byte[] bArr4;
        zzaev zzaevVar;
        List list;
        int i18;
        int i19;
        int i20;
        zzadt zzadtVar3;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        zzaee zzaeeVar;
        long j11;
        zzaej zzaejVar2 = this;
        while (!zzaejVar2.zzm.isEmpty() && ((zzadt) zzaejVar2.zzm.peek()).zza == j10) {
            zzadt zzadtVar4 = (zzadt) zzaejVar2.zzm.pop();
            int i31 = zzadtVar4.zzd;
            int i32 = 12;
            int i33 = 8;
            if (i31 == 1836019574) {
                zzv zzf = zzf(zzadtVar4.zzb);
                zzadt zza2 = zzadtVar4.zza(1836475768);
                Objects.requireNonNull(zza2);
                SparseArray sparseArray2 = new SparseArray();
                int size = zza2.zzb.size();
                long j12 = -9223372036854775807L;
                int i34 = 0;
                while (i34 < size) {
                    zzadu zzaduVar = (zzadu) zza2.zzb.get(i34);
                    int i35 = zzaduVar.zzd;
                    if (i35 == 1953654136) {
                        zzdy zzdyVar = zzaduVar.zza;
                        zzdyVar.zzF(i32);
                        Pair create = Pair.create(Integer.valueOf(zzdyVar.zze()), new zzaee(zzdyVar.zze() - 1, zzdyVar.zze(), zzdyVar.zze(), zzdyVar.zze()));
                        sparseArray2.put(((Integer) create.first).intValue(), (zzaee) create.second);
                    } else if (i35 == 1835362404) {
                        zzdy zzdyVar2 = zzaduVar.zza;
                        zzdyVar2.zzF(8);
                        j12 = zzadv.zze(zzdyVar2.zze()) == 0 ? zzdyVar2.zzs() : zzdyVar2.zzt();
                    }
                    i34++;
                    i32 = 12;
                }
                List zzc2 = zzaed.zzc(zzadtVar4, new zzzg(), j12, zzf, false, false, new zzfok() { // from class: com.google.android.gms.internal.ads.zzaeg
                    @Override // com.google.android.gms.internal.ads.zzfok
                    public final Object apply(Object obj) {
                        return (zzaet) obj;
                    }
                });
                int size2 = zzc2.size();
                if (zzaejVar2.zze.size() == 0) {
                    for (int i36 = 0; i36 < size2; i36++) {
                        zzaew zzaewVar = (zzaew) zzc2.get(i36);
                        zzaet zzaetVar = zzaewVar.zza;
                        zzaejVar2.zze.put(zzaetVar.zza, new zzaei(zzaejVar2.zzD.zzv(i36, zzaetVar.zzb), zzaewVar, zzj(sparseArray2, zzaetVar.zza)));
                        zzaejVar2.zzw = Math.max(zzaejVar2.zzw, zzaetVar.zze);
                    }
                    zzaejVar2.zzD.zzB();
                } else {
                    zzcw.zzf(zzaejVar2.zze.size() == size2);
                    for (int i37 = 0; i37 < size2; i37++) {
                        zzaew zzaewVar2 = (zzaew) zzc2.get(i37);
                        zzaet zzaetVar2 = zzaewVar2.zza;
                        ((zzaei) zzaejVar2.zze.get(zzaetVar2.zza)).zzh(zzaewVar2, zzj(sparseArray2, zzaetVar2.zza));
                    }
                }
            } else {
                if (i31 == 1836019558) {
                    SparseArray sparseArray3 = zzaejVar2.zze;
                    byte[] bArr5 = zzaejVar2.zzi;
                    int size3 = zzadtVar4.zzc.size();
                    int i38 = 0;
                    while (i38 < size3) {
                        zzadt zzadtVar5 = (zzadt) zzadtVar4.zzc.get(i38);
                        if (zzadtVar5.zzd == 1953653094) {
                            zzadu zzb2 = zzadtVar5.zzb(1952868452);
                            Objects.requireNonNull(zzb2);
                            zzdy zzdyVar3 = zzb2.zza;
                            zzdyVar3.zzF(i33);
                            int zze = zzdyVar3.zze() & 16777215;
                            zzaei zzaeiVar = (zzaei) sparseArray3.get(zzdyVar3.zze());
                            if (zzaeiVar == null) {
                                zzaeiVar = null;
                            } else {
                                if ((zze & 1) != 0) {
                                    long zzt = zzdyVar3.zzt();
                                    zzaev zzaevVar2 = zzaeiVar.zzb;
                                    zzaevVar2.zzb = zzt;
                                    zzaevVar2.zzc = zzt;
                                }
                                zzaee zzaeeVar2 = zzaeiVar.zze;
                                int zze2 = (zze & 2) != 0 ? zzdyVar3.zze() - 1 : zzaeeVar2.zza;
                                if ((zze & 8) != 0) {
                                    i12 = zzdyVar3.zze();
                                } else {
                                    i12 = zzaeeVar2.zzb;
                                }
                                if ((zze & 16) != 0) {
                                    i13 = zzdyVar3.zze();
                                } else {
                                    i13 = zzaeeVar2.zzc;
                                }
                                if ((zze & 32) != 0) {
                                    i14 = zzdyVar3.zze();
                                } else {
                                    i14 = zzaeeVar2.zzd;
                                }
                                zzaeiVar.zzb.zza = new zzaee(zze2, i12, i13, i14);
                            }
                            if (zzaeiVar != null) {
                                zzaev zzaevVar3 = zzaeiVar.zzb;
                                long j13 = zzaevVar3.zzp;
                                boolean z11 = zzaevVar3.zzq;
                                zzaeiVar.zzi();
                                zzaeiVar.zzl = true;
                                zzadu zzb3 = zzadtVar5.zzb(1952867444);
                                if (zzb3 != null) {
                                    zzdy zzdyVar4 = zzb3.zza;
                                    zzdyVar4.zzF(i33);
                                    zzaevVar3.zzp = zzadv.zze(zzdyVar4.zze()) == 1 ? zzdyVar4.zzt() : zzdyVar4.zzs();
                                    zzaevVar3.zzq = true;
                                } else {
                                    zzaevVar3.zzp = j13;
                                    zzaevVar3.zzq = z11;
                                }
                                List list2 = zzadtVar5.zzb;
                                int size4 = list2.size();
                                int i39 = 0;
                                int i40 = 0;
                                int i41 = 0;
                                while (true) {
                                    i15 = 1953658222;
                                    if (i39 >= size4) {
                                        break;
                                    }
                                    zzadu zzaduVar2 = (zzadu) list2.get(i39);
                                    SparseArray sparseArray4 = sparseArray3;
                                    if (zzaduVar2.zzd == 1953658222) {
                                        zzdy zzdyVar5 = zzaduVar2.zza;
                                        zzdyVar5.zzF(12);
                                        int zzn = zzdyVar5.zzn();
                                        if (zzn > 0) {
                                            i41 += zzn;
                                            i40++;
                                        }
                                    }
                                    i39++;
                                    sparseArray3 = sparseArray4;
                                }
                                sparseArray = sparseArray3;
                                zzaeiVar.zzh = 0;
                                zzaeiVar.zzg = 0;
                                zzaeiVar.zzf = 0;
                                zzaev zzaevVar4 = zzaeiVar.zzb;
                                zzaevVar4.zzd = i40;
                                zzaevVar4.zze = i41;
                                if (zzaevVar4.zzg.length < i40) {
                                    zzaevVar4.zzf = new long[i40];
                                    zzaevVar4.zzg = new int[i40];
                                }
                                if (zzaevVar4.zzh.length < i41) {
                                    int i42 = (i41 * 125) / 100;
                                    zzaevVar4.zzh = new int[i42];
                                    zzaevVar4.zzi = new long[i42];
                                    zzaevVar4.zzj = new boolean[i42];
                                    zzaevVar4.zzl = new boolean[i42];
                                }
                                int i43 = 0;
                                int i44 = 0;
                                int i45 = 0;
                                while (true) {
                                    long j14 = 0;
                                    if (i43 >= size4) {
                                        break;
                                    }
                                    zzadu zzaduVar3 = (zzadu) list2.get(i43);
                                    if (zzaduVar3.zzd == i15) {
                                        int i46 = i45 + 1;
                                        zzdy zzdyVar6 = zzaduVar3.zza;
                                        zzdyVar6.zzF(8);
                                        int zze3 = zzdyVar6.zze() & 16777215;
                                        list = list2;
                                        zzaet zzaetVar3 = zzaeiVar.zzd.zza;
                                        i18 = size3;
                                        zzaev zzaevVar5 = zzaeiVar.zzb;
                                        i20 = size4;
                                        zzaee zzaeeVar3 = zzaevVar5.zza;
                                        int i47 = zzeg.zza;
                                        zzaevVar5.zzg[i45] = zzdyVar6.zzn();
                                        long[] jArr = zzaevVar5.zzf;
                                        zzadtVar2 = zzadtVar4;
                                        bArr4 = bArr5;
                                        long j15 = zzaevVar5.zzb;
                                        jArr[i45] = j15;
                                        if ((zze3 & 1) != 0) {
                                            i17 = i43;
                                            jArr[i45] = j15 + zzdyVar6.zze();
                                        } else {
                                            i17 = i43;
                                        }
                                        int i48 = zze3 & 4;
                                        int i49 = zzaeeVar3.zzd;
                                        if (i48 != 0) {
                                            i49 = zzdyVar6.zze();
                                        }
                                        int i50 = zze3 & 256;
                                        int i51 = zze3 & AdRequest.MAX_CONTENT_URL_LENGTH;
                                        int i52 = zze3 & IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES;
                                        int i53 = zze3 & 2048;
                                        int i54 = i49;
                                        long[] jArr2 = zzaetVar3.zzh;
                                        if (jArr2 != null) {
                                            i19 = i38;
                                            zzadtVar3 = zzadtVar5;
                                            if (jArr2.length == 1 && jArr2[0] == 0) {
                                                j14 = ((long[]) zzeg.zzG(zzaetVar3.zzi))[0];
                                            }
                                        } else {
                                            i19 = i38;
                                            zzadtVar3 = zzadtVar5;
                                        }
                                        int[] iArr = zzaevVar5.zzh;
                                        long[] jArr3 = zzaevVar5.zzi;
                                        boolean[] zArr = zzaevVar5.zzj;
                                        zzaevVar = zzaevVar3;
                                        int i55 = zzaevVar5.zzg[i45] + i44;
                                        long j16 = zzaetVar3.zzc;
                                        int i56 = i44;
                                        long j17 = zzaevVar5.zzp;
                                        while (i56 < i55) {
                                            if (i50 != 0) {
                                                i21 = i50;
                                                i22 = zzdyVar6.zze();
                                            } else {
                                                i21 = i50;
                                                i22 = zzaeeVar3.zzb;
                                            }
                                            zze(i22);
                                            if (i51 != 0) {
                                                i23 = i51;
                                                i24 = zzdyVar6.zze();
                                            } else {
                                                i23 = i51;
                                                i24 = zzaeeVar3.zzc;
                                            }
                                            zze(i24);
                                            if (i52 != 0) {
                                                i25 = i48;
                                                i26 = zzdyVar6.zze();
                                            } else {
                                                i25 = i48;
                                                if (i56 == 0) {
                                                    if (i48 != 0) {
                                                        i26 = i54;
                                                        i56 = 0;
                                                    } else {
                                                        i56 = 0;
                                                    }
                                                }
                                                i26 = zzaeeVar3.zzd;
                                            }
                                            if (i53 != 0) {
                                                i27 = i55;
                                                i28 = i52;
                                                i29 = i53;
                                                i30 = zzdyVar6.zze();
                                            } else {
                                                i27 = i55;
                                                i28 = i52;
                                                i29 = i53;
                                                i30 = 0;
                                            }
                                            long zzw = zzeg.zzw((i30 + j17) - j14, 1000000L, j16);
                                            jArr3[i56] = zzw;
                                            if (zzaevVar5.zzq) {
                                                zzaeeVar = zzaeeVar3;
                                                j11 = j16;
                                            } else {
                                                zzaeeVar = zzaeeVar3;
                                                j11 = j16;
                                                jArr3[i56] = zzw + zzaeiVar.zzd.zzh;
                                            }
                                            iArr[i56] = i24;
                                            zArr[i56] = 1 == (((i26 >> 16) & 1) ^ 1);
                                            j17 += i22;
                                            i56++;
                                            zzaeeVar3 = zzaeeVar;
                                            j16 = j11;
                                            i50 = i21;
                                            i51 = i23;
                                            i48 = i25;
                                            i55 = i27;
                                            i52 = i28;
                                            i53 = i29;
                                        }
                                        zzaevVar5.zzp = j17;
                                        i45 = i46;
                                        i44 = i55;
                                    } else {
                                        i17 = i43;
                                        zzadtVar2 = zzadtVar4;
                                        bArr4 = bArr5;
                                        zzaevVar = zzaevVar3;
                                        list = list2;
                                        i18 = size3;
                                        i19 = i38;
                                        i20 = size4;
                                        zzadtVar3 = zzadtVar5;
                                    }
                                    i43 = i17 + 1;
                                    list2 = list;
                                    size3 = i18;
                                    size4 = i20;
                                    zzadtVar4 = zzadtVar2;
                                    bArr5 = bArr4;
                                    i38 = i19;
                                    zzadtVar5 = zzadtVar3;
                                    zzaevVar3 = zzaevVar;
                                    i15 = 1953658222;
                                }
                                zzadtVar = zzadtVar4;
                                byte[] bArr6 = bArr5;
                                zzaev zzaevVar6 = zzaevVar3;
                                i10 = size3;
                                i11 = i38;
                                zzadt zzadtVar6 = zzadtVar5;
                                zzaet zzaetVar4 = zzaeiVar.zzd.zza;
                                zzaee zzaeeVar4 = zzaevVar6.zza;
                                Objects.requireNonNull(zzaeeVar4);
                                zzaeu zza3 = zzaetVar4.zza(zzaeeVar4.zza);
                                zzadu zzb4 = zzadtVar6.zzb(1935763834);
                                if (zzb4 != null) {
                                    Objects.requireNonNull(zza3);
                                    zzdy zzdyVar7 = zzb4.zza;
                                    int i57 = zza3.zzd;
                                    zzdyVar7.zzF(8);
                                    if ((zzdyVar7.zze() & 1) == 1) {
                                        zzdyVar7.zzG(8);
                                    }
                                    int zzk = zzdyVar7.zzk();
                                    int zzn2 = zzdyVar7.zzn();
                                    int i58 = zzaevVar6.zze;
                                    if (zzn2 > i58) {
                                        throw zzbp.zza("Saiz sample count " + zzn2 + " is greater than fragment sample count" + i58, null);
                                    }
                                    if (zzk == 0) {
                                        boolean[] zArr2 = zzaevVar6.zzl;
                                        i16 = 0;
                                        for (int i59 = 0; i59 < zzn2; i59++) {
                                            int zzk2 = zzdyVar7.zzk();
                                            i16 += zzk2;
                                            zArr2[i59] = zzk2 > i57;
                                        }
                                        z10 = false;
                                    } else {
                                        boolean z12 = zzk > i57;
                                        i16 = zzk * zzn2;
                                        z10 = false;
                                        Arrays.fill(zzaevVar6.zzl, 0, zzn2, z12);
                                    }
                                    Arrays.fill(zzaevVar6.zzl, zzn2, zzaevVar6.zze, z10);
                                    if (i16 > 0) {
                                        zzaevVar6.zza(i16);
                                    }
                                }
                                zzadu zzb5 = zzadtVar6.zzb(1935763823);
                                if (zzb5 != null) {
                                    zzdy zzdyVar8 = zzb5.zza;
                                    zzdyVar8.zzF(8);
                                    int zze4 = zzdyVar8.zze();
                                    if ((zze4 & 1) == 1) {
                                        zzdyVar8.zzG(8);
                                    }
                                    int zzn3 = zzdyVar8.zzn();
                                    if (zzn3 != 1) {
                                        throw zzbp.zza("Unexpected saio entry count: " + zzn3, null);
                                    }
                                    zzaevVar6.zzc += zzadv.zze(zze4) == 0 ? zzdyVar8.zzs() : zzdyVar8.zzt();
                                }
                                zzadu zzb6 = zzadtVar6.zzb(1936027235);
                                if (zzb6 != null) {
                                    zzh(zzb6.zza, 0, zzaevVar6);
                                }
                                String str = zza3 != null ? zza3.zzb : null;
                                zzdy zzdyVar9 = null;
                                zzdy zzdyVar10 = null;
                                for (int i60 = 0; i60 < zzadtVar6.zzb.size(); i60++) {
                                    zzadu zzaduVar4 = (zzadu) zzadtVar6.zzb.get(i60);
                                    zzdy zzdyVar11 = zzaduVar4.zza;
                                    int i61 = zzaduVar4.zzd;
                                    if (i61 == 1935828848) {
                                        zzdyVar11.zzF(12);
                                        if (zzdyVar11.zze() == 1936025959) {
                                            zzdyVar9 = zzdyVar11;
                                        }
                                    } else if (i61 == 1936158820) {
                                        zzdyVar11.zzF(12);
                                        if (zzdyVar11.zze() == 1936025959) {
                                            zzdyVar10 = zzdyVar11;
                                        }
                                    }
                                }
                                if (zzdyVar9 != null && zzdyVar10 != null) {
                                    zzdyVar9.zzF(8);
                                    int zze5 = zzdyVar9.zze();
                                    zzdyVar9.zzG(4);
                                    if (zzadv.zze(zze5) == 1) {
                                        zzdyVar9.zzG(4);
                                    }
                                    if (zzdyVar9.zze() == 1) {
                                        zzdyVar10.zzF(8);
                                        int zze6 = zzadv.zze(zzdyVar10.zze());
                                        zzdyVar10.zzG(4);
                                        if (zze6 == 1) {
                                            if (zzdyVar10.zzs() == 0) {
                                                throw zzbp.zzc("Variable length description in sgpd found (unsupported)");
                                            }
                                        } else if (zze6 >= 2) {
                                            zzdyVar10.zzG(4);
                                        }
                                        if (zzdyVar10.zzs() == 1) {
                                            zzdyVar10.zzG(1);
                                            int zzk3 = zzdyVar10.zzk();
                                            int i62 = (zzk3 & 240) >> 4;
                                            int i63 = zzk3 & 15;
                                            if (zzdyVar10.zzk() == 1) {
                                                int zzk4 = zzdyVar10.zzk();
                                                byte[] bArr7 = new byte[16];
                                                zzdyVar10.zzB(bArr7, 0, 16);
                                                if (zzk4 == 0) {
                                                    int zzk5 = zzdyVar10.zzk();
                                                    byte[] bArr8 = new byte[zzk5];
                                                    zzdyVar10.zzB(bArr8, 0, zzk5);
                                                    bArr3 = bArr8;
                                                } else {
                                                    bArr3 = null;
                                                }
                                                zzaevVar6.zzk = true;
                                                zzaevVar6.zzm = new zzaeu(true, str, zzk4, bArr7, i62, i63, bArr3);
                                            }
                                        } else {
                                            throw zzbp.zzc("Entry count in sgpd != 1 (unsupported).");
                                        }
                                    } else {
                                        throw zzbp.zzc("Entry count in sbgp != 1 (unsupported).");
                                    }
                                }
                                int size5 = zzadtVar6.zzb.size();
                                int i64 = 0;
                                while (i64 < size5) {
                                    zzadu zzaduVar5 = (zzadu) zzadtVar6.zzb.get(i64);
                                    if (zzaduVar5.zzd == 1970628964) {
                                        zzdy zzdyVar12 = zzaduVar5.zza;
                                        zzdyVar12.zzF(8);
                                        bArr2 = bArr6;
                                        zzdyVar12.zzB(bArr2, 0, 16);
                                        if (Arrays.equals(bArr2, zzb)) {
                                            zzh(zzdyVar12, 16, zzaevVar6);
                                        }
                                    } else {
                                        bArr2 = bArr6;
                                    }
                                    i64++;
                                    bArr6 = bArr2;
                                }
                                bArr = bArr6;
                                bArr5 = bArr;
                                size3 = i10;
                                zzadtVar4 = zzadtVar;
                                i33 = 8;
                                i38 = i11 + 1;
                                sparseArray3 = sparseArray;
                            }
                        }
                        sparseArray = sparseArray3;
                        zzadtVar = zzadtVar4;
                        i10 = size3;
                        i11 = i38;
                        bArr = bArr5;
                        bArr5 = bArr;
                        size3 = i10;
                        zzadtVar4 = zzadtVar;
                        i33 = 8;
                        i38 = i11 + 1;
                        sparseArray3 = sparseArray;
                    }
                    zzv zzf2 = zzf(zzadtVar4.zzb);
                    zzaejVar = this;
                    if (zzf2 != null) {
                        int size6 = zzaejVar.zze.size();
                        for (int i65 = 0; i65 < size6; i65++) {
                            zzaei zzaeiVar2 = (zzaei) zzaejVar.zze.valueAt(i65);
                            zzaet zzaetVar5 = zzaeiVar2.zzd.zza;
                            zzaee zzaeeVar5 = zzaeiVar2.zzb.zza;
                            int i66 = zzeg.zza;
                            zzaeu zza4 = zzaetVar5.zza(zzaeeVar5.zza);
                            zzv zzb7 = zzf2.zzb(zza4 != null ? zza4.zzb : null);
                            zzab zzb8 = zzaeiVar2.zzd.zza.zzf.zzb();
                            zzb8.zzB(zzb7);
                            zzaeiVar2.zza.zzk(zzb8.zzY());
                        }
                    }
                    if (zzaejVar.zzv != -9223372036854775807L) {
                        int size7 = zzaejVar.zze.size();
                        for (int i67 = 0; i67 < size7; i67++) {
                            zzaei zzaeiVar3 = (zzaei) zzaejVar.zze.valueAt(i67);
                            long j18 = zzaejVar.zzv;
                            int i68 = zzaeiVar3.zzf;
                            while (true) {
                                zzaev zzaevVar7 = zzaeiVar3.zzb;
                                if (i68 < zzaevVar7.zze && zzaevVar7.zzi[i68] < j18) {
                                    if (zzaevVar7.zzj[i68]) {
                                        zzaeiVar3.zzi = i68;
                                    }
                                    i68++;
                                }
                            }
                        }
                        zzaejVar.zzv = -9223372036854775807L;
                    }
                } else {
                    zzaejVar = zzaejVar2;
                    if (!zzaejVar.zzm.isEmpty()) {
                        ((zzadt) zzaejVar.zzm.peek()).zzc(zzadtVar4);
                    }
                }
                zzaejVar2 = zzaejVar;
            }
        }
        zzg();
    }

    private static final zzaee zzj(SparseArray sparseArray, int i10) {
        if (sparseArray.size() == 1) {
            return (zzaee) sparseArray.valueAt(0);
        }
        zzaee zzaeeVar = (zzaee) sparseArray.get(i10);
        Objects.requireNonNull(zzaeeVar);
        return zzaeeVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0246, code lost:
        r23 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0248, code lost:
        r5.zzs(r10, r20, r33.zzz, 0, r23);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x025b, code lost:
        if (r33.zzn.isEmpty() != false) goto L354;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x025d, code lost:
        r1 = (com.google.android.gms.internal.ads.zzaeh) r33.zzn.removeFirst();
        r33.zzu -= r1.zzc;
        r3 = r1.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0270, code lost:
        if (r1.zzb == false) goto L348;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0272, code lost:
        r3 = r3 + r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0273, code lost:
        r5 = r33.zzE;
        r6 = r5.length;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0277, code lost:
        if (r8 >= r6) goto L353;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0279, code lost:
        r5[r8].zzs(r3, 1, r1.zzc, r33.zzu, null);
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0291, code lost:
        if (r2.zzk() != false) goto L358;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0293, code lost:
        r33.zzy = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0295, code lost:
        r33.zzo = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0099, code lost:
        r4 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009c, code lost:
        if (r33.zzo != 3) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009e, code lost:
        r3 = r2.zzb();
        r33.zzz = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a8, code lost:
        if (r2.zzf >= r2.zzi) goto L325;
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:?, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00aa, code lost:
        ((com.google.android.gms.internal.ads.zzyl) r1).zzo(r3, false);
        r1 = r2.zzf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b3, code lost:
        if (r1 != null) goto L314;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b6, code lost:
        r3 = r2.zzb.zzn;
        r1 = r1.zzd;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00bc, code lost:
        if (r1 == 0) goto L317;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00be, code lost:
        r3.zzG(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c9, code lost:
        if (r2.zzb.zzb(r2.zzf) == false) goto L320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00cb, code lost:
        r3.zzG(r3.zzo() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d8, code lost:
        if (r2.zzk() != false) goto L323;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00da, code lost:
        r33.zzy = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00dc, code lost:
        r33.zzo = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00de, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e7, code lost:
        if (r2.zzd.zza.zzg != 1) goto L328;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e9, code lost:
        r33.zzz = r3 - 8;
        ((com.google.android.gms.internal.ads.zzyl) r1).zzo(8, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0103, code lost:
        if ("audio/ac4".equals(r2.zzd.zza.zzf.zzm) == false) goto L332;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0105, code lost:
        r33.zzA = r2.zzc(r33.zzz, 7);
        com.google.android.gms.internal.ads.zzxz.zzb(r33.zzz, r33.zzj);
        com.google.android.gms.internal.ads.zzzw.zzb(r2.zza, r33.zzj, 7);
        r3 = r33.zzA + 7;
        r33.zzA = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0122, code lost:
        r3 = r2.zzc(r33.zzz, 0);
        r33.zzA = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x012a, code lost:
        r33.zzz += r3;
        r33.zzo = 4;
        r33.zzB = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0134, code lost:
        r3 = r2.zzd.zza;
        r5 = r2.zza;
        r10 = r2.zze();
        r6 = r3.zzj;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0140, code lost:
        if (r6 != 0) goto L361;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0142, code lost:
        r3 = r33.zzA;
        r4 = r33.zzz;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0146, code lost:
        if (r3 >= r4) goto L338;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0148, code lost:
        r33.zzA += com.google.android.gms.internal.ads.zzzw.zza(r5, r1, r4 - r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0153, code lost:
        r13 = r33.zzg.zzH();
        r13[0] = 0;
        r13[1] = 0;
        r13[2] = 0;
        r14 = r6 + 1;
        r6 = 4 - r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0169, code lost:
        if (r33.zzA >= r33.zzz) goto L392;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x016b, code lost:
        r12 = r33.zzB;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x016f, code lost:
        if (r12 != 0) goto L386;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0171, code lost:
        ((com.google.android.gms.internal.ads.zzyl) r1).zzn(r13, r6, r14, r9);
        r33.zzg.zzF(r9);
        r12 = r33.zzg.zze();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0182, code lost:
        if (r12 <= 0) goto L383;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0184, code lost:
        r33.zzB = r12 - 1;
        r33.zzf.zzF(r9);
        com.google.android.gms.internal.ads.zzzw.zzb(r5, r33.zzf, 4);
        com.google.android.gms.internal.ads.zzzw.zzb(r5, r33.zzg, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x019b, code lost:
        if (r33.zzF.length <= 0) goto L382;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x019d, code lost:
        r12 = r3.zzf.zzm;
        r17 = r13[4];
        r9 = com.google.android.gms.internal.ads.zzzo.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01ab, code lost:
        if ("video/avc".equals(r12) == false) goto L378;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01af, code lost:
        if ((r17 & 31) == r4) goto L374;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01b2, code lost:
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01b8, code lost:
        if ("video/hevc".equals(r12) == false) goto L382;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01bf, code lost:
        if (((r17 & 126) >> r8) != 39) goto L382;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01c2, code lost:
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01c3, code lost:
        r33.zzC = r9;
        r33.zzA += 5;
        r33.zzz += r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01d7, code lost:
        throw com.google.android.gms.internal.ads.zzbp.zza("Invalid NAL length", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01da, code lost:
        if (r33.zzC == false) goto L391;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01dc, code lost:
        r33.zzh.zzC(r12);
        ((com.google.android.gms.internal.ads.zzyl) r1).zzn(r33.zzh.zzH(), 0, r33.zzB, false);
        com.google.android.gms.internal.ads.zzzw.zzb(r5, r33.zzh, r33.zzB);
        r4 = r33.zzB;
        r8 = r33.zzh;
        r8 = com.google.android.gms.internal.ads.zzzo.zzb(r8.zzH(), r8.zzd());
        r33.zzh.zzF("video/hevc".equals(r3.zzf.zzm) ? 1 : 0);
        r33.zzh.zzE(r8);
        com.google.android.gms.internal.ads.zzyi.zza(r10, r33.zzh, r33.zzF);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0221, code lost:
        r4 = com.google.android.gms.internal.ads.zzzw.zza(r5, r1, r12, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0227, code lost:
        r33.zzA += r4;
        r33.zzB -= r4;
        r4 = 6;
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0233, code lost:
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0237, code lost:
        r20 = r2.zza();
        r1 = r2.zzf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x023f, code lost:
        if (r1 == null) goto L360;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0241, code lost:
        r23 = r1.zzc;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v10 */
    @Override // com.google.android.gms.internal.ads.zzyr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(com.google.android.gms.internal.ads.zzys r34, com.google.android.gms.internal.ads.zzzr r35) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1866
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaej.zza(com.google.android.gms.internal.ads.zzys, com.google.android.gms.internal.ads.zzzr):int");
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final void zzb(zzyu zzyuVar) {
        this.zzD = zzyuVar;
        zzg();
        zzzy[] zzzyVarArr = new zzzy[2];
        this.zzE = zzzyVarArr;
        int i10 = 0;
        zzzy[] zzzyVarArr2 = (zzzy[]) zzeg.zzad(zzzyVarArr, 0);
        this.zzE = zzzyVarArr2;
        for (zzzy zzzyVar : zzzyVarArr2) {
            zzzyVar.zzk(zzc);
        }
        this.zzF = new zzzy[this.zzd.size()];
        int i11 = 100;
        while (i10 < this.zzF.length) {
            int i12 = i11 + 1;
            zzzy zzv = this.zzD.zzv(i11, 3);
            zzv.zzk((zzad) this.zzd.get(i10));
            this.zzF[i10] = zzv;
            i10++;
            i11 = i12;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final void zzc(long j10, long j11) {
        int size = this.zze.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((zzaei) this.zze.valueAt(i10)).zzi();
        }
        this.zzn.clear();
        this.zzu = 0;
        this.zzv = j11;
        this.zzm.clear();
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final boolean zzd(zzys zzysVar) throws IOException {
        return zzaes.zza(zzysVar);
    }

    public zzaej(int i10, zzee zzeeVar) {
        this.zzd = Collections.unmodifiableList(Collections.emptyList());
        this.zzk = new zzabe();
        this.zzl = new zzdy(16);
        this.zzf = new zzdy(zzzo.zza);
        this.zzg = new zzdy(5);
        this.zzh = new zzdy();
        byte[] bArr = new byte[16];
        this.zzi = bArr;
        this.zzj = new zzdy(bArr);
        this.zzm = new ArrayDeque();
        this.zzn = new ArrayDeque();
        this.zze = new SparseArray();
        this.zzw = -9223372036854775807L;
        this.zzv = -9223372036854775807L;
        this.zzx = -9223372036854775807L;
        this.zzD = zzyu.zza;
        this.zzE = new zzzy[0];
        this.zzF = new zzzy[0];
    }
}
