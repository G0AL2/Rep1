package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaha implements zzahn {
    private final zzagz zza;
    private final zzdy zzb = new zzdy(32);
    private int zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    public zzaha(zzagz zzagzVar) {
        this.zza = zzagzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zza(zzdy zzdyVar, int i10) {
        int i11 = i10 & 1;
        int zzc = i11 != 0 ? zzdyVar.zzc() + zzdyVar.zzk() : -1;
        if (this.zzf) {
            if (i11 == 0) {
                return;
            }
            this.zzf = false;
            zzdyVar.zzF(zzc);
            this.zzd = 0;
        }
        while (zzdyVar.zza() > 0) {
            int i12 = this.zzd;
            if (i12 < 3) {
                if (i12 == 0) {
                    int zzk = zzdyVar.zzk();
                    zzdyVar.zzF(zzdyVar.zzc() - 1);
                    if (zzk == 255) {
                        this.zzf = true;
                        return;
                    }
                }
                int min = Math.min(zzdyVar.zza(), 3 - this.zzd);
                zzdyVar.zzB(this.zzb.zzH(), this.zzd, min);
                int i13 = this.zzd + min;
                this.zzd = i13;
                if (i13 == 3) {
                    this.zzb.zzF(0);
                    this.zzb.zzE(3);
                    this.zzb.zzG(1);
                    int zzk2 = this.zzb.zzk();
                    int zzk3 = this.zzb.zzk();
                    this.zze = (zzk2 & 128) != 0;
                    this.zzc = (((zzk2 & 15) << 8) | zzk3) + 3;
                    int zzb = this.zzb.zzb();
                    int i14 = this.zzc;
                    if (zzb < i14) {
                        int zzb2 = this.zzb.zzb();
                        this.zzb.zzz(Math.min(4098, Math.max(i14, zzb2 + zzb2)));
                    }
                }
            } else {
                int min2 = Math.min(zzdyVar.zza(), this.zzc - i12);
                zzdyVar.zzB(this.zzb.zzH(), this.zzd, min2);
                int i15 = this.zzd + min2;
                this.zzd = i15;
                int i16 = this.zzc;
                if (i15 != i16) {
                    continue;
                } else {
                    if (this.zze) {
                        if (zzeg.zzg(this.zzb.zzH(), 0, i16, -1) != 0) {
                            this.zzf = true;
                            return;
                        }
                        this.zzb.zzE(this.zzc - 4);
                    } else {
                        this.zzb.zzE(i16);
                    }
                    this.zzb.zzF(0);
                    this.zza.zza(this.zzb);
                    this.zzd = 0;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zzb(zzee zzeeVar, zzyu zzyuVar, zzahm zzahmVar) {
        this.zza.zzb(zzeeVar, zzyuVar, zzahmVar);
        this.zzf = true;
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zzc() {
        this.zzf = true;
    }
}
