package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzavj implements zzatw, zzaud {
    public static final zzaty zza = new zzavh();
    private static final int zzb = zzazo.zzg("qt  ");
    private int zzg;
    private int zzh;
    private long zzi;
    private int zzj;
    private zzazh zzk;
    private int zzl;
    private int zzm;
    private zzatx zzn;
    private zzavi[] zzo;
    private long zzp;
    private boolean zzq;
    private final zzazh zze = new zzazh(16);
    private final Stack zzf = new Stack();
    private final zzazh zzc = new zzazh(zzazf.zza);
    private final zzazh zzd = new zzazh(4);

    private final void zzh() {
        this.zzg = 0;
        this.zzj = 0;
    }

    private final void zzi(long j10) throws zzarw {
        zzawe zzaweVar;
        zzaua zzauaVar;
        zzawe zzaweVar2;
        zzavl zza2;
        while (!this.zzf.isEmpty() && ((zzaur) this.zzf.peek()).zza == j10) {
            zzaur zzaurVar = (zzaur) this.zzf.pop();
            if (zzaurVar.zzaR == zzaut.zzE) {
                ArrayList arrayList = new ArrayList();
                zzaua zzauaVar2 = new zzaua();
                zzaus zzb2 = zzaurVar.zzb(zzaut.zzaC);
                if (zzb2 != null) {
                    zzaweVar = zzava.zzc(zzb2, this.zzq);
                    if (zzaweVar != null) {
                        zzauaVar2.zzb(zzaweVar);
                    }
                } else {
                    zzaweVar = null;
                }
                long j11 = -9223372036854775807L;
                long j12 = Long.MAX_VALUE;
                int i10 = 0;
                while (i10 < zzaurVar.zzc.size()) {
                    zzaur zzaurVar2 = (zzaur) zzaurVar.zzc.get(i10);
                    if (zzaurVar2.zzaR == zzaut.zzG && (zza2 = zzava.zza(zzaurVar2, zzaurVar.zzb(zzaut.zzF), -9223372036854775807L, null, this.zzq)) != null) {
                        zzavo zzb3 = zzava.zzb(zza2, zzaurVar2.zza(zzaut.zzH).zza(zzaut.zzI).zza(zzaut.zzJ), zzauaVar2);
                        if (zzb3.zza != 0) {
                            zzavi zzaviVar = new zzavi(zza2, zzb3, this.zzn.zzbi(i10, zza2.zzb));
                            zzart zze = zza2.zzf.zze(zzb3.zzd + 30);
                            if (zza2.zzb == 1) {
                                if (zzauaVar2.zza()) {
                                    zze = zze.zzd(zzauaVar2.zzb, zzauaVar2.zzc);
                                }
                                if (zzaweVar != null) {
                                    zze = zze.zzf(zzaweVar);
                                }
                            }
                            zzaviVar.zzc.zza(zze);
                            zzauaVar = zzauaVar2;
                            zzaweVar2 = zzaweVar;
                            long max = Math.max(j11, zza2.zze);
                            arrayList.add(zzaviVar);
                            long j13 = zzb3.zzb[0];
                            if (j13 < j12) {
                                j11 = max;
                                j12 = j13;
                            } else {
                                j11 = max;
                            }
                            i10++;
                            zzauaVar2 = zzauaVar;
                            zzaweVar = zzaweVar2;
                        }
                    }
                    zzauaVar = zzauaVar2;
                    zzaweVar2 = zzaweVar;
                    i10++;
                    zzauaVar2 = zzauaVar;
                    zzaweVar = zzaweVar2;
                }
                this.zzp = j11;
                this.zzo = (zzavi[]) arrayList.toArray(new zzavi[arrayList.size()]);
                this.zzn.zzb();
                this.zzn.zzc(this);
                this.zzf.clear();
                this.zzg = 2;
            } else if (!this.zzf.isEmpty()) {
                ((zzaur) this.zzf.peek()).zzc(zzaurVar);
            }
        }
        if (this.zzg != 2) {
            zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaud
    public final long zza() {
        return this.zzp;
    }

    @Override // com.google.android.gms.internal.ads.zzaud
    public final long zzb(long j10) {
        long j11 = Long.MAX_VALUE;
        for (zzavi zzaviVar : this.zzo) {
            zzavo zzavoVar = zzaviVar.zzb;
            int zza2 = zzavoVar.zza(j10);
            if (zza2 == -1) {
                zza2 = zzavoVar.zzb(j10);
            }
            long j12 = zzavoVar.zzb[zza2];
            if (j12 < j11) {
                j11 = j12;
            }
        }
        return j11;
    }

    @Override // com.google.android.gms.internal.ads.zzaud
    public final boolean zzc() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzatw
    public final void zzd(zzatx zzatxVar) {
        this.zzn = zzatxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzatw
    public final void zze(long j10, long j11) {
        this.zzf.clear();
        this.zzj = 0;
        this.zzl = 0;
        this.zzm = 0;
        if (j10 == 0) {
            zzh();
            return;
        }
        zzavi[] zzaviVarArr = this.zzo;
        if (zzaviVarArr != null) {
            for (zzavi zzaviVar : zzaviVarArr) {
                zzavo zzavoVar = zzaviVar.zzb;
                int zza2 = zzavoVar.zza(j11);
                if (zza2 == -1) {
                    zza2 = zzavoVar.zzb(j11);
                }
                zzaviVar.zzd = zza2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatw
    public final int zzf(zzatv zzatvVar, zzaub zzaubVar) throws IOException, InterruptedException {
        zzavi[] zzaviVarArr;
        boolean z10;
        boolean z11;
        while (true) {
            int i10 = this.zzg;
            if (i10 == 0) {
                if (this.zzj == 0) {
                    if (!zzatvVar.zzh(this.zze.zza, 0, 8, true)) {
                        return -1;
                    }
                    this.zzj = 8;
                    this.zze.zzv(0);
                    this.zzi = this.zze.zzm();
                    this.zzh = this.zze.zze();
                }
                if (this.zzi == 1) {
                    zzatvVar.zzh(this.zze.zza, 8, 8, false);
                    this.zzj += 8;
                    this.zzi = this.zze.zzn();
                }
                int i11 = this.zzh;
                if (i11 != zzaut.zzE && i11 != zzaut.zzG && i11 != zzaut.zzH && i11 != zzaut.zzI && i11 != zzaut.zzJ && i11 != zzaut.zzS) {
                    if (i11 != zzaut.zzU && i11 != zzaut.zzF && i11 != zzaut.zzV && i11 != zzaut.zzW && i11 != zzaut.zzao && i11 != zzaut.zzap && i11 != zzaut.zzaq && i11 != zzaut.zzT && i11 != zzaut.zzar && i11 != zzaut.zzas && i11 != zzaut.zzat && i11 != zzaut.zzau && i11 != zzaut.zzav && i11 != zzaut.zzR && i11 != zzaut.zzd && i11 != zzaut.zzaC) {
                        this.zzk = null;
                    } else {
                        zzayz.zze(this.zzj == 8);
                        zzayz.zze(this.zzi <= 2147483647L);
                        zzazh zzazhVar = new zzazh((int) this.zzi);
                        this.zzk = zzazhVar;
                        System.arraycopy(this.zze.zza, 0, zzazhVar.zza, 0, 8);
                    }
                    this.zzg = 1;
                } else {
                    long zzd = (zzatvVar.zzd() + this.zzi) - this.zzj;
                    this.zzf.add(new zzaur(this.zzh, zzd));
                    if (this.zzi == this.zzj) {
                        zzi(zzd);
                    } else {
                        zzh();
                    }
                }
            } else if (i10 != 1) {
                long j10 = Long.MAX_VALUE;
                int i12 = 0;
                int i13 = -1;
                while (true) {
                    zzaviVarArr = this.zzo;
                    if (i12 >= zzaviVarArr.length) {
                        break;
                    }
                    zzavi zzaviVar = zzaviVarArr[i12];
                    int i14 = zzaviVar.zzd;
                    zzavo zzavoVar = zzaviVar.zzb;
                    if (i14 != zzavoVar.zza) {
                        long j11 = zzavoVar.zzb[i14];
                        if (j11 < j10) {
                            i13 = i12;
                            j10 = j11;
                        }
                    }
                    i12++;
                }
                if (i13 == -1) {
                    return -1;
                }
                zzavi zzaviVar2 = zzaviVarArr[i13];
                zzauf zzaufVar = zzaviVar2.zzc;
                int i15 = zzaviVar2.zzd;
                zzavo zzavoVar2 = zzaviVar2.zzb;
                long j12 = zzavoVar2.zzb[i15];
                int i16 = zzavoVar2.zzc[i15];
                if (zzaviVar2.zza.zzg == 1) {
                    j12 += 8;
                    i16 -= 8;
                }
                long zzd2 = (j12 - zzatvVar.zzd()) + this.zzl;
                if (zzd2 >= 0 && zzd2 < 262144) {
                    int i17 = (int) zzd2;
                    boolean z12 = false;
                    zzatvVar.zzi(i17, false);
                    int i18 = zzaviVar2.zza.zzk;
                    if (i18 == 0) {
                        while (true) {
                            int i19 = this.zzl;
                            if (i19 >= i16) {
                                break;
                            }
                            int zzd3 = zzaufVar.zzd(zzatvVar, i16 - i19, false);
                            this.zzl += zzd3;
                            this.zzm -= zzd3;
                        }
                    } else {
                        byte[] bArr = this.zzd.zza;
                        bArr[0] = 0;
                        bArr[1] = 0;
                        bArr[2] = 0;
                        int i20 = 4 - i18;
                        while (this.zzl < i16) {
                            int i21 = this.zzm;
                            if (i21 == 0) {
                                zzatvVar.zzh(this.zzd.zza, i20, i18, z12);
                                this.zzd.zzv(z12 ? 1 : 0);
                                this.zzm = this.zzd.zzi();
                                this.zzc.zzv(z12 ? 1 : 0);
                                zzaufVar.zzb(this.zzc, 4);
                                this.zzl += 4;
                                i16 += i20;
                            } else {
                                int zzd4 = zzaufVar.zzd(zzatvVar, i21, z12);
                                this.zzl += zzd4;
                                this.zzm -= zzd4;
                                z12 = false;
                            }
                        }
                    }
                    int i22 = i16;
                    zzavo zzavoVar3 = zzaviVar2.zzb;
                    zzaufVar.zzc(zzavoVar3.zze[i15], zzavoVar3.zzf[i15], i22, 0, null);
                    zzaviVar2.zzd++;
                    this.zzl = 0;
                    this.zzm = 0;
                    return 0;
                }
                zzaubVar.zza = j12;
                return 1;
            } else {
                long j13 = this.zzi;
                int i23 = this.zzj;
                long j14 = j13 - i23;
                long zzd5 = zzatvVar.zzd() + j14;
                zzazh zzazhVar2 = this.zzk;
                if (zzazhVar2 != null) {
                    zzatvVar.zzh(zzazhVar2.zza, i23, (int) j14, false);
                    if (this.zzh == zzaut.zzd) {
                        zzazh zzazhVar3 = this.zzk;
                        zzazhVar3.zzv(8);
                        if (zzazhVar3.zze() == zzb) {
                            z11 = true;
                            break;
                        }
                        zzazhVar3.zzw(4);
                        while (zzazhVar3.zza() > 0) {
                            if (zzazhVar3.zze() == zzb) {
                                z11 = true;
                                break;
                            }
                        }
                        z11 = false;
                        this.zzq = z11;
                    } else if (!this.zzf.isEmpty()) {
                        ((zzaur) this.zzf.peek()).zzd(new zzaus(this.zzh, this.zzk));
                    }
                } else if (j14 < 262144) {
                    zzatvVar.zzi((int) j14, false);
                } else {
                    zzaubVar.zza = zzatvVar.zzd() + j14;
                    z10 = true;
                    zzi(zzd5);
                    if (z10 && this.zzg != 2) {
                        return 1;
                    }
                }
                z10 = false;
                zzi(zzd5);
                if (z10) {
                    return 1;
                }
                continue;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatw
    public final boolean zzg(zzatv zzatvVar) throws IOException, InterruptedException {
        return zzavk.zzb(zzatvVar);
    }
}
