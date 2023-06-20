package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.IdentityHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzaxc implements zzawz, zzawy {
    public final zzawz[] zza;
    private final IdentityHashMap zzb = new IdentityHashMap();
    private zzawy zzc;
    private int zzd;
    private zzaxq zze;
    private zzawz[] zzf;
    private zzaxn zzg;

    public zzaxc(zzawz... zzawzVarArr) {
        this.zza = zzawzVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzawz
    public final long zzB(zzaxu[] zzaxuVarArr, boolean[] zArr, zzaxl[] zzaxlVarArr, boolean[] zArr2, long j10) {
        int length;
        zzaxl[] zzaxlVarArr2 = zzaxlVarArr;
        int length2 = zzaxuVarArr.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i10 = 0;
        while (true) {
            length = zzaxuVarArr.length;
            if (i10 >= length) {
                break;
            }
            zzaxl zzaxlVar = zzaxlVarArr2[i10];
            iArr[i10] = zzaxlVar == null ? -1 : ((Integer) this.zzb.get(zzaxlVar)).intValue();
            iArr2[i10] = -1;
            zzaxu zzaxuVar = zzaxuVarArr[i10];
            if (zzaxuVar != null) {
                zzaxp zzd = zzaxuVar.zzd();
                int i11 = 0;
                while (true) {
                    zzawz[] zzawzVarArr = this.zza;
                    if (i11 >= zzawzVarArr.length) {
                        break;
                    } else if (zzawzVarArr[i11].zzn().zza(zzd) != -1) {
                        iArr2[i10] = i11;
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            i10++;
        }
        this.zzb.clear();
        zzaxl[] zzaxlVarArr3 = new zzaxl[length];
        zzaxl[] zzaxlVarArr4 = new zzaxl[length];
        zzaxu[] zzaxuVarArr2 = new zzaxu[length];
        ArrayList arrayList = new ArrayList(this.zza.length);
        long j11 = j10;
        int i12 = 0;
        while (i12 < this.zza.length) {
            for (int i13 = 0; i13 < zzaxuVarArr.length; i13++) {
                zzaxu zzaxuVar2 = null;
                zzaxlVarArr4[i13] = iArr[i13] == i12 ? zzaxlVarArr2[i13] : null;
                if (iArr2[i13] == i12) {
                    zzaxuVar2 = zzaxuVarArr[i13];
                }
                zzaxuVarArr2[i13] = zzaxuVar2;
            }
            int i14 = i12;
            zzaxu[] zzaxuVarArr3 = zzaxuVarArr2;
            ArrayList arrayList2 = arrayList;
            long zzB = this.zza[i12].zzB(zzaxuVarArr2, zArr, zzaxlVarArr4, zArr2, j11);
            if (i14 == 0) {
                j11 = zzB;
            } else if (zzB != j11) {
                throw new IllegalStateException("Children enabled at different positions");
            }
            boolean z10 = false;
            for (int i15 = 0; i15 < zzaxuVarArr.length; i15++) {
                if (iArr2[i15] == i14) {
                    zzayz.zze(zzaxlVarArr4[i15] != null);
                    zzaxl zzaxlVar2 = zzaxlVarArr4[i15];
                    zzaxlVarArr3[i15] = zzaxlVar2;
                    this.zzb.put(zzaxlVar2, Integer.valueOf(i14));
                    z10 = true;
                } else if (iArr[i15] == i14) {
                    zzayz.zze(zzaxlVarArr4[i15] == null);
                }
            }
            if (z10) {
                arrayList2.add(this.zza[i14]);
            }
            i12 = i14 + 1;
            arrayList = arrayList2;
            zzaxuVarArr2 = zzaxuVarArr3;
            zzaxlVarArr2 = zzaxlVarArr;
        }
        zzaxl[] zzaxlVarArr5 = zzaxlVarArr2;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(zzaxlVarArr3, 0, zzaxlVarArr5, 0, length);
        zzawz[] zzawzVarArr2 = new zzawz[arrayList3.size()];
        this.zzf = zzawzVarArr2;
        arrayList3.toArray(zzawzVarArr2);
        this.zzg = new zzawn(this.zzf);
        return j11;
    }

    @Override // com.google.android.gms.internal.ads.zzawz, com.google.android.gms.internal.ads.zzaxn
    public final long zza() {
        return this.zzg.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzawz, com.google.android.gms.internal.ads.zzaxn
    public final boolean zzbj(long j10) {
        return this.zzg.zzbj(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzaxm
    public final /* bridge */ /* synthetic */ void zze(zzaxn zzaxnVar) {
        zzawz zzawzVar = (zzawz) zzaxnVar;
        if (this.zze == null) {
            return;
        }
        this.zzc.zze(this);
    }

    @Override // com.google.android.gms.internal.ads.zzawy
    public final void zzf(zzawz zzawzVar) {
        int i10 = this.zzd - 1;
        this.zzd = i10;
        if (i10 > 0) {
            return;
        }
        int i11 = 0;
        for (zzawz zzawzVar2 : this.zza) {
            i11 += zzawzVar2.zzn().zzb;
        }
        zzaxp[] zzaxpVarArr = new zzaxp[i11];
        int i12 = 0;
        for (zzawz zzawzVar3 : this.zza) {
            zzaxq zzn = zzawzVar3.zzn();
            int i13 = zzn.zzb;
            int i14 = 0;
            while (i14 < i13) {
                zzaxpVarArr[i12] = zzn.zzb(i14);
                i14++;
                i12++;
            }
        }
        this.zze = new zzaxq(zzaxpVarArr);
        this.zzc.zzf(this);
    }

    @Override // com.google.android.gms.internal.ads.zzawz
    public final long zzg() {
        long j10 = Long.MAX_VALUE;
        for (zzawz zzawzVar : this.zzf) {
            long zzg = zzawzVar.zzg();
            if (zzg != Long.MIN_VALUE) {
                j10 = Math.min(j10, zzg);
            }
        }
        if (j10 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j10;
    }

    @Override // com.google.android.gms.internal.ads.zzawz
    public final long zzh() {
        zzawz[] zzawzVarArr;
        long zzh = this.zza[0].zzh();
        int i10 = 1;
        while (true) {
            zzawz[] zzawzVarArr2 = this.zza;
            if (i10 >= zzawzVarArr2.length) {
                if (zzh != -9223372036854775807L) {
                    for (zzawz zzawzVar : this.zzf) {
                        if (zzawzVar != this.zza[0] && zzawzVar.zzi(zzh) != zzh) {
                            throw new IllegalStateException("Children seeked to different positions");
                        }
                    }
                }
                return zzh;
            } else if (zzawzVarArr2[i10].zzh() != -9223372036854775807L) {
                throw new IllegalStateException("Child reported discontinuity");
            } else {
                i10++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzawz
    public final long zzi(long j10) {
        long zzi = this.zzf[0].zzi(j10);
        int i10 = 1;
        while (true) {
            zzawz[] zzawzVarArr = this.zzf;
            if (i10 >= zzawzVarArr.length) {
                return zzi;
            }
            if (zzawzVarArr[i10].zzi(zzi) != zzi) {
                throw new IllegalStateException("Children seeked to different positions");
            }
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzawz
    public final zzaxq zzn() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzawz
    public final void zzq(long j10) {
        for (zzawz zzawzVar : this.zzf) {
            zzawzVar.zzq(j10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzawz
    public final void zzs() throws IOException {
        for (zzawz zzawzVar : this.zza) {
            zzawzVar.zzs();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzawz
    public final void zzw(zzawy zzawyVar, long j10) {
        this.zzc = zzawyVar;
        zzawz[] zzawzVarArr = this.zza;
        this.zzd = zzawzVarArr.length;
        for (zzawz zzawzVar : zzawzVarArr) {
            zzawzVar.zzw(this, j10);
        }
    }
}
