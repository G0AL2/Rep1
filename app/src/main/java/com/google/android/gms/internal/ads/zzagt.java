package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzagt implements zzyg {
    private final zzee zza;
    private final zzdy zzb = new zzdy();

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzagt(zzee zzeeVar, zzags zzagsVar) {
        this.zza = zzeeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzyg
    public final zzyf zza(zzys zzysVar, long j10) throws IOException {
        int zzh;
        long j11;
        long zzf = zzysVar.zzf();
        int min = (int) Math.min(20000L, zzysVar.zzd() - zzf);
        this.zzb.zzC(min);
        ((zzyl) zzysVar).zzm(this.zzb.zzH(), 0, min, false);
        zzdy zzdyVar = this.zzb;
        int i10 = -1;
        long j12 = -9223372036854775807L;
        int i11 = -1;
        while (zzdyVar.zza() >= 4) {
            if (zzagu.zzh(zzdyVar.zzH(), zzdyVar.zzc()) != 442) {
                zzdyVar.zzG(1);
            } else {
                zzdyVar.zzG(4);
                long zzc = zzagv.zzc(zzdyVar);
                if (zzc != -9223372036854775807L) {
                    long zzb = this.zza.zzb(zzc);
                    if (zzb > j10) {
                        if (j12 == -9223372036854775807L) {
                            return zzyf.zzd(zzb, zzf);
                        }
                        j11 = i11;
                    } else if (100000 + zzb > j10) {
                        j11 = zzdyVar.zzc();
                    } else {
                        i11 = zzdyVar.zzc();
                        j12 = zzb;
                    }
                    return zzyf.zze(zzf + j11);
                }
                int zzd = zzdyVar.zzd();
                if (zzdyVar.zza() < 10) {
                    zzdyVar.zzF(zzd);
                } else {
                    zzdyVar.zzG(9);
                    int zzk = zzdyVar.zzk() & 7;
                    if (zzdyVar.zza() < zzk) {
                        zzdyVar.zzF(zzd);
                    } else {
                        zzdyVar.zzG(zzk);
                        if (zzdyVar.zza() < 4) {
                            zzdyVar.zzF(zzd);
                        } else {
                            if (zzagu.zzh(zzdyVar.zzH(), zzdyVar.zzc()) == 443) {
                                zzdyVar.zzG(4);
                                int zzo = zzdyVar.zzo();
                                if (zzdyVar.zza() < zzo) {
                                    zzdyVar.zzF(zzd);
                                } else {
                                    zzdyVar.zzG(zzo);
                                }
                            }
                            while (true) {
                                if (zzdyVar.zza() < 4 || (zzh = zzagu.zzh(zzdyVar.zzH(), zzdyVar.zzc())) == 442 || zzh == 441 || (zzh >>> 8) != 1) {
                                    break;
                                }
                                zzdyVar.zzG(4);
                                if (zzdyVar.zza() < 2) {
                                    zzdyVar.zzF(zzd);
                                    break;
                                }
                                zzdyVar.zzF(Math.min(zzdyVar.zzd(), zzdyVar.zzc() + zzdyVar.zzo()));
                            }
                        }
                    }
                }
                i10 = zzdyVar.zzc();
            }
        }
        return j12 != -9223372036854775807L ? zzyf.zzf(j12, zzf + i10) : zzyf.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzyg
    public final void zzb() {
        zzdy zzdyVar = this.zzb;
        byte[] bArr = zzeg.zzf;
        int length = bArr.length;
        zzdyVar.zzD(bArr, 0);
    }
}
