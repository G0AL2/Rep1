package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzsq implements zzry, zzrx {
    private final zzry[] zza;
    private zzrx zze;
    private zzty zzf;
    private final zzrl zzi;
    private final ArrayList zzc = new ArrayList();
    private final HashMap zzd = new HashMap();
    private zzts zzh = new zzrk(new zzts[0]);
    private final IdentityHashMap zzb = new IdentityHashMap();
    private zzry[] zzg = new zzry[0];

    public zzsq(zzrl zzrlVar, long[] jArr, zzry[] zzryVarArr, byte... bArr) {
        this.zzi = zzrlVar;
        this.zza = zzryVarArr;
        for (int i10 = 0; i10 < zzryVarArr.length; i10++) {
            long j10 = jArr[i10];
            if (j10 != 0) {
                this.zza[i10] = new zzso(zzryVarArr[i10], j10);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzry
    public final long zza(long j10, zzjw zzjwVar) {
        zzry[] zzryVarArr = this.zzg;
        return (zzryVarArr.length > 0 ? zzryVarArr[0] : this.zza[0]).zza(j10, zzjwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzry, com.google.android.gms.internal.ads.zzts
    public final long zzb() {
        return this.zzh.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzry, com.google.android.gms.internal.ads.zzts
    public final long zzc() {
        return this.zzh.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzry
    public final long zzd() {
        zzry[] zzryVarArr;
        zzry[] zzryVarArr2;
        long j10 = -9223372036854775807L;
        for (zzry zzryVar : this.zzg) {
            long zzd = zzryVar.zzd();
            if (zzd != -9223372036854775807L) {
                if (j10 == -9223372036854775807L) {
                    for (zzry zzryVar2 : this.zzg) {
                        if (zzryVar2 == zzryVar) {
                            break;
                        } else if (zzryVar2.zze(zzd) != zzd) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j10 = zzd;
                } else if (zzd != j10) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j10 != -9223372036854775807L && zzryVar.zze(j10) != j10) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j10;
    }

    @Override // com.google.android.gms.internal.ads.zzry
    public final long zze(long j10) {
        long zze = this.zzg[0].zze(j10);
        int i10 = 1;
        while (true) {
            zzry[] zzryVarArr = this.zzg;
            if (i10 >= zzryVarArr.length) {
                return zze;
            }
            if (zzryVarArr[i10].zze(zze) != zze) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzry
    public final long zzf(zzvg[] zzvgVarArr, boolean[] zArr, zztq[] zztqVarArr, boolean[] zArr2, long j10) {
        int length;
        zzvg zzvgVar;
        int length2 = zzvgVarArr.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i10 = 0;
        while (true) {
            length = zzvgVarArr.length;
            zzvgVar = null;
            if (i10 >= length) {
                break;
            }
            zztq zztqVar = zztqVarArr[i10];
            Integer num = zztqVar != null ? (Integer) this.zzb.get(zztqVar) : null;
            iArr[i10] = num == null ? -1 : num.intValue();
            iArr2[i10] = -1;
            zzvg zzvgVar2 = zzvgVarArr[i10];
            if (zzvgVar2 != null) {
                zzck zzckVar = (zzck) this.zzd.get(zzvgVar2.zze());
                Objects.requireNonNull(zzckVar);
                int i11 = 0;
                while (true) {
                    zzry[] zzryVarArr = this.zza;
                    if (i11 >= zzryVarArr.length) {
                        break;
                    } else if (zzryVarArr[i11].zzh().zza(zzckVar) != -1) {
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
        zztq[] zztqVarArr2 = new zztq[length];
        zztq[] zztqVarArr3 = new zztq[length];
        zzvg[] zzvgVarArr2 = new zzvg[length];
        ArrayList arrayList = new ArrayList(this.zza.length);
        long j11 = j10;
        int i12 = 0;
        while (i12 < this.zza.length) {
            for (int i13 = 0; i13 < zzvgVarArr.length; i13++) {
                zztqVarArr3[i13] = iArr[i13] == i12 ? zztqVarArr[i13] : zzvgVar;
                if (iArr2[i13] == i12) {
                    zzvg zzvgVar3 = zzvgVarArr[i13];
                    Objects.requireNonNull(zzvgVar3);
                    zzck zzckVar2 = (zzck) this.zzd.get(zzvgVar3.zze());
                    Objects.requireNonNull(zzckVar2);
                    zzvgVarArr2[i13] = new zzsn(zzvgVar3, zzckVar2);
                } else {
                    zzvgVarArr2[i13] = zzvgVar;
                }
            }
            int i14 = i12;
            ArrayList arrayList2 = arrayList;
            zztq[] zztqVarArr4 = zztqVarArr3;
            zzvg[] zzvgVarArr3 = zzvgVarArr2;
            long zzf = this.zza[i12].zzf(zzvgVarArr2, zArr, zztqVarArr3, zArr2, j11);
            if (i14 == 0) {
                j11 = zzf;
            } else if (zzf != j11) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z10 = false;
            for (int i15 = 0; i15 < zzvgVarArr.length; i15++) {
                if (iArr2[i15] == i14) {
                    zztq zztqVar2 = zztqVarArr4[i15];
                    Objects.requireNonNull(zztqVar2);
                    zztqVarArr2[i15] = zztqVar2;
                    this.zzb.put(zztqVar2, Integer.valueOf(i14));
                    z10 = true;
                } else if (iArr[i15] == i14) {
                    zzcw.zzf(zztqVarArr4[i15] == null);
                }
            }
            if (z10) {
                arrayList2.add(this.zza[i14]);
            }
            i12 = i14 + 1;
            arrayList = arrayList2;
            zztqVarArr3 = zztqVarArr4;
            zzvgVarArr2 = zzvgVarArr3;
            zzvgVar = null;
        }
        System.arraycopy(zztqVarArr2, 0, zztqVarArr, 0, length);
        zzry[] zzryVarArr2 = (zzry[]) arrayList.toArray(new zzry[0]);
        this.zzg = zzryVarArr2;
        this.zzh = new zzrk(zzryVarArr2);
        return j11;
    }

    @Override // com.google.android.gms.internal.ads.zztr
    public final /* bridge */ /* synthetic */ void zzg(zzts zztsVar) {
        zzry zzryVar = (zzry) zztsVar;
        zzrx zzrxVar = this.zze;
        Objects.requireNonNull(zzrxVar);
        zzrxVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zzry
    public final zzty zzh() {
        zzty zztyVar = this.zzf;
        Objects.requireNonNull(zztyVar);
        return zztyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzrx
    public final void zzi(zzry zzryVar) {
        this.zzc.remove(zzryVar);
        if (!this.zzc.isEmpty()) {
            return;
        }
        int i10 = 0;
        for (zzry zzryVar2 : this.zza) {
            i10 += zzryVar2.zzh().zzc;
        }
        zzck[] zzckVarArr = new zzck[i10];
        int i11 = 0;
        int i12 = 0;
        while (true) {
            zzry[] zzryVarArr = this.zza;
            if (i11 < zzryVarArr.length) {
                zzty zzh = zzryVarArr[i11].zzh();
                int i13 = zzh.zzc;
                int i14 = 0;
                while (i14 < i13) {
                    zzck zzb = zzh.zzb(i14);
                    zzck zzc = zzb.zzc(i11 + ":" + zzb.zzc);
                    this.zzd.put(zzc, zzb);
                    zzckVarArr[i12] = zzc;
                    i14++;
                    i12++;
                }
                i11++;
            } else {
                this.zzf = new zzty(zzckVarArr);
                zzrx zzrxVar = this.zze;
                Objects.requireNonNull(zzrxVar);
                zzrxVar.zzi(this);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzry
    public final void zzj(long j10, boolean z10) {
        for (zzry zzryVar : this.zzg) {
            zzryVar.zzj(j10, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzry
    public final void zzk() throws IOException {
        for (zzry zzryVar : this.zza) {
            zzryVar.zzk();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzry
    public final void zzl(zzrx zzrxVar, long j10) {
        this.zze = zzrxVar;
        Collections.addAll(this.zzc, this.zza);
        for (zzry zzryVar : this.zza) {
            zzryVar.zzl(this, j10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzry, com.google.android.gms.internal.ads.zzts
    public final void zzm(long j10) {
        this.zzh.zzm(j10);
    }

    public final zzry zzn(int i10) {
        zzry zzryVar;
        zzry zzryVar2 = this.zza[i10];
        if (zzryVar2 instanceof zzso) {
            zzryVar = ((zzso) zzryVar2).zza;
            return zzryVar;
        }
        return zzryVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzry, com.google.android.gms.internal.ads.zzts
    public final boolean zzo(long j10) {
        if (!this.zzc.isEmpty()) {
            int size = this.zzc.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((zzry) this.zzc.get(i10)).zzo(j10);
            }
            return false;
        }
        return this.zzh.zzo(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzry, com.google.android.gms.internal.ads.zzts
    public final boolean zzp() {
        return this.zzh.zzp();
    }
}
