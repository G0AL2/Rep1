package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaeo implements zzyr, zzzu {
    public static final zzyy zza = new zzyy() { // from class: com.google.android.gms.internal.ads.zzael
        @Override // com.google.android.gms.internal.ads.zzyy
        public final zzyr[] zza() {
            zzyy zzyyVar = zzaeo.zza;
            return new zzyr[]{new zzaeo(0)};
        }

        @Override // com.google.android.gms.internal.ads.zzyy
        public final /* synthetic */ zzyr[] zzb(Uri uri, Map map) {
            return zzyx.zza(this, uri, map);
        }
    };
    private final zzdy zzb;
    private final zzdy zzc;
    private final zzdy zzd;
    private final zzdy zze;
    private final ArrayDeque zzf;
    private final zzaer zzg;
    private final List zzh;
    private int zzi;
    private int zzj;
    private long zzk;
    private int zzl;
    private zzdy zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private zzyu zzr;
    private zzaen[] zzs;
    private long[][] zzt;
    private int zzu;
    private long zzv;
    private int zzw;
    private zzacr zzx;

    public zzaeo() {
        this(0);
    }

    private static int zzf(int i10) {
        if (i10 != 1751476579) {
            return i10 != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    private static int zzi(zzaew zzaewVar, long j10) {
        int zza2 = zzaewVar.zza(j10);
        return zza2 == -1 ? zzaewVar.zzb(j10) : zza2;
    }

    private static long zzj(zzaew zzaewVar, long j10, long j11) {
        int zzi = zzi(zzaewVar, j10);
        return zzi == -1 ? j11 : Math.min(zzaewVar.zzc[zzi], j11);
    }

    private final void zzk() {
        this.zzi = 0;
        this.zzl = 0;
    }

    private final void zzl(long j10) throws zzbp {
        zzbl zzblVar;
        zzbl zzblVar2;
        long j11;
        List list;
        int i10;
        int i11;
        int i12;
        while (!this.zzf.isEmpty() && ((zzadt) this.zzf.peek()).zza == j10) {
            zzadt zzadtVar = (zzadt) this.zzf.pop();
            if (zzadtVar.zzd == 1836019574) {
                ArrayList arrayList = new ArrayList();
                boolean z10 = this.zzw == 1;
                zzzg zzzgVar = new zzzg();
                zzadu zzb = zzadtVar.zzb(1969517665);
                if (zzb != null) {
                    Pair zza2 = zzaed.zza(zzb);
                    zzbl zzblVar3 = (zzbl) zza2.first;
                    zzbl zzblVar4 = (zzbl) zza2.second;
                    if (zzblVar3 != null) {
                        zzzgVar.zzb(zzblVar3);
                    }
                    zzblVar = zzblVar4;
                    zzblVar2 = zzblVar3;
                } else {
                    zzblVar = null;
                    zzblVar2 = null;
                }
                zzadt zza3 = zzadtVar.zza(1835365473);
                long j12 = -9223372036854775807L;
                zzbl zzb2 = zza3 != null ? zzaed.zzb(zza3) : null;
                List zzc = zzaed.zzc(zzadtVar, zzzgVar, -9223372036854775807L, null, false, z10, new zzfok() { // from class: com.google.android.gms.internal.ads.zzaem
                    @Override // com.google.android.gms.internal.ads.zzfok
                    public final Object apply(Object obj) {
                        zzaet zzaetVar = (zzaet) obj;
                        zzyy zzyyVar = zzaeo.zza;
                        return zzaetVar;
                    }
                });
                int size = zzc.size();
                long j13 = -9223372036854775807L;
                int i13 = 0;
                int i14 = -1;
                while (true) {
                    j11 = 0;
                    if (i13 >= size) {
                        break;
                    }
                    zzaew zzaewVar = (zzaew) zzc.get(i13);
                    if (zzaewVar.zzb == 0) {
                        list = zzc;
                        i10 = size;
                    } else {
                        zzaet zzaetVar = zzaewVar.zza;
                        list = zzc;
                        long j14 = zzaetVar.zze;
                        if (j14 == j12) {
                            j14 = zzaewVar.zzh;
                        }
                        long max = Math.max(j13, j14);
                        i10 = size;
                        zzaen zzaenVar = new zzaen(zzaetVar, zzaewVar, this.zzr.zzv(i13, zzaetVar.zzb));
                        if ("audio/true-hd".equals(zzaetVar.zzf.zzm)) {
                            i11 = zzaewVar.zze * 16;
                        } else {
                            i11 = zzaewVar.zze + 30;
                        }
                        zzab zzb3 = zzaetVar.zzf.zzb();
                        zzb3.zzL(i11);
                        if (zzaetVar.zzb == 2 && j14 > 0 && (i12 = zzaewVar.zzb) > 1) {
                            zzb3.zzE(i12 / (((float) j14) / 1000000.0f));
                        }
                        int i15 = zzaetVar.zzb;
                        int i16 = zzaek.zzb;
                        if (i15 == 1 && zzzgVar.zza()) {
                            zzb3.zzC(zzzgVar.zza);
                            zzb3.zzD(zzzgVar.zzb);
                        }
                        int i17 = zzaetVar.zzb;
                        zzbl[] zzblVarArr = new zzbl[2];
                        zzblVarArr[0] = zzblVar;
                        zzblVarArr[1] = this.zzh.isEmpty() ? null : new zzbl(this.zzh);
                        zzbl zzblVar5 = new zzbl(new zzbk[0]);
                        if (i17 == 1) {
                            if (zzblVar2 != null) {
                                zzblVar5 = zzblVar2;
                            }
                        } else if (i17 == 2 && zzb2 != null) {
                            int i18 = 0;
                            while (true) {
                                if (i18 >= zzb2.zza()) {
                                    break;
                                }
                                zzbk zzb4 = zzb2.zzb(i18);
                                if (zzb4 instanceof zzaco) {
                                    zzaco zzacoVar = (zzaco) zzb4;
                                    if ("com.android.capture.fps".equals(zzacoVar.zza)) {
                                        zzblVar5 = new zzbl(zzacoVar);
                                        break;
                                    }
                                }
                                i18++;
                            }
                        }
                        for (int i19 = 0; i19 < 2; i19++) {
                            zzblVar5 = zzblVar5.zzd(zzblVarArr[i19]);
                        }
                        if (zzblVar5.zza() > 0) {
                            zzb3.zzM(zzblVar5);
                        }
                        zzaenVar.zzc.zzk(zzb3.zzY());
                        if (zzaetVar.zzb == 2 && i14 == -1) {
                            i14 = arrayList.size();
                        }
                        arrayList.add(zzaenVar);
                        j13 = max;
                    }
                    i13++;
                    zzc = list;
                    size = i10;
                    j12 = -9223372036854775807L;
                }
                this.zzu = i14;
                this.zzv = j13;
                zzaen[] zzaenVarArr = (zzaen[]) arrayList.toArray(new zzaen[0]);
                this.zzs = zzaenVarArr;
                int length = zzaenVarArr.length;
                long[][] jArr = new long[length];
                int[] iArr = new int[length];
                long[] jArr2 = new long[length];
                boolean[] zArr = new boolean[length];
                for (int i20 = 0; i20 < zzaenVarArr.length; i20++) {
                    jArr[i20] = new long[zzaenVarArr[i20].zzb.zzb];
                    jArr2[i20] = zzaenVarArr[i20].zzb.zzf[0];
                }
                int i21 = 0;
                while (i21 < zzaenVarArr.length) {
                    long j15 = Long.MAX_VALUE;
                    int i22 = -1;
                    for (int i23 = 0; i23 < zzaenVarArr.length; i23++) {
                        if (!zArr[i23]) {
                            long j16 = jArr2[i23];
                            if (j16 <= j15) {
                                i22 = i23;
                                j15 = j16;
                            }
                        }
                    }
                    int i24 = iArr[i22];
                    long[] jArr3 = jArr[i22];
                    jArr3[i24] = j11;
                    zzaew zzaewVar2 = zzaenVarArr[i22].zzb;
                    j11 += zzaewVar2.zzd[i24];
                    int i25 = i24 + 1;
                    iArr[i22] = i25;
                    if (i25 < jArr3.length) {
                        jArr2[i22] = zzaewVar2.zzf[i25];
                    } else {
                        zArr[i22] = true;
                        i21++;
                    }
                }
                this.zzt = jArr;
                this.zzr.zzB();
                this.zzr.zzL(this);
                this.zzf.clear();
                this.zzi = 2;
            } else if (!this.zzf.isEmpty()) {
                ((zzadt) this.zzf.peek()).zzc(zzadtVar);
            }
        }
        if (this.zzi != 2) {
            zzk();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:194:0x037e, code lost:
        r3 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007f  */
    @Override // com.google.android.gms.internal.ads.zzyr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(com.google.android.gms.internal.ads.zzys r33, com.google.android.gms.internal.ads.zzzr r34) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1033
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaeo.zza(com.google.android.gms.internal.ads.zzys, com.google.android.gms.internal.ads.zzzr):int");
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final void zzb(zzyu zzyuVar) {
        this.zzr = zzyuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final void zzc(long j10, long j11) {
        zzaen[] zzaenVarArr;
        this.zzf.clear();
        this.zzl = 0;
        this.zzn = -1;
        this.zzo = 0;
        this.zzp = 0;
        this.zzq = 0;
        if (j10 == 0) {
            zzk();
            return;
        }
        for (zzaen zzaenVar : this.zzs) {
            zzaew zzaewVar = zzaenVar.zzb;
            int zza2 = zzaewVar.zza(j11);
            if (zza2 == -1) {
                zza2 = zzaewVar.zzb(j11);
            }
            zzaenVar.zze = zza2;
            zzzz zzzzVar = zzaenVar.zzd;
            if (zzzzVar != null) {
                zzzzVar.zzb();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final boolean zzd(zzys zzysVar) throws IOException {
        return zzaes.zzb(zzysVar, false);
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final long zze() {
        return this.zzv;
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final zzzs zzg(long j10) {
        long j11;
        long j12;
        int zzb;
        zzaen[] zzaenVarArr = this.zzs;
        if (zzaenVarArr.length == 0) {
            zzzv zzzvVar = zzzv.zza;
            return new zzzs(zzzvVar, zzzvVar);
        }
        int i10 = this.zzu;
        long j13 = -1;
        if (i10 != -1) {
            zzaew zzaewVar = zzaenVarArr[i10].zzb;
            int zzi = zzi(zzaewVar, j10);
            if (zzi == -1) {
                zzzv zzzvVar2 = zzzv.zza;
                return new zzzs(zzzvVar2, zzzvVar2);
            }
            long j14 = zzaewVar.zzf[zzi];
            j11 = zzaewVar.zzc[zzi];
            if (j14 >= j10 || zzi >= zzaewVar.zzb - 1 || (zzb = zzaewVar.zzb(j10)) == -1 || zzb == zzi) {
                j12 = -9223372036854775807L;
            } else {
                j12 = zzaewVar.zzf[zzb];
                j13 = zzaewVar.zzc[zzb];
            }
            j10 = j14;
        } else {
            j11 = Long.MAX_VALUE;
            j12 = -9223372036854775807L;
        }
        int i11 = 0;
        while (true) {
            zzaen[] zzaenVarArr2 = this.zzs;
            if (i11 >= zzaenVarArr2.length) {
                break;
            }
            if (i11 != this.zzu) {
                zzaew zzaewVar2 = zzaenVarArr2[i11].zzb;
                long zzj = zzj(zzaewVar2, j10, j11);
                if (j12 != -9223372036854775807L) {
                    j13 = zzj(zzaewVar2, j12, j13);
                }
                j11 = zzj;
            }
            i11++;
        }
        zzzv zzzvVar3 = new zzzv(j10, j11);
        return j12 == -9223372036854775807L ? new zzzs(zzzvVar3, zzzvVar3) : new zzzs(zzzvVar3, new zzzv(j12, j13));
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final boolean zzh() {
        return true;
    }

    public zzaeo(int i10) {
        this.zzi = 0;
        this.zzg = new zzaer();
        this.zzh = new ArrayList();
        this.zze = new zzdy(16);
        this.zzf = new ArrayDeque();
        this.zzb = new zzdy(zzzo.zza);
        this.zzc = new zzdy(4);
        this.zzd = new zzdy();
        this.zzn = -1;
        this.zzr = zzyu.zza;
        this.zzs = new zzaen[0];
    }
}
