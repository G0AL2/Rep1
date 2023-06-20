package com.google.android.gms.internal.ads;

import com.inmobi.media.fq;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzago implements zzaga {
    private final zzdy zza;
    private final zzzk zzb;
    private final String zzc;
    private zzzy zzd;
    private String zze;
    private int zzf;
    private int zzg;
    private boolean zzh;
    private boolean zzi;
    private long zzj;
    private int zzk;
    private long zzl;

    public zzago() {
        this(null);
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zza(zzdy zzdyVar) {
        zzzk zzzkVar;
        zzcw.zzb(this.zzd);
        while (zzdyVar.zza() > 0) {
            int i10 = this.zzf;
            if (i10 == 0) {
                byte[] zzH = zzdyVar.zzH();
                int zzc = zzdyVar.zzc();
                int zzd = zzdyVar.zzd();
                while (true) {
                    if (zzc < zzd) {
                        byte b10 = zzH[zzc];
                        boolean z10 = (b10 & fq.i.NETWORK_LOAD_LIMIT_DISABLED) == 255;
                        boolean z11 = this.zzi && (b10 & 224) == 224;
                        this.zzi = z10;
                        if (z11) {
                            zzdyVar.zzF(zzc + 1);
                            this.zzi = false;
                            this.zza.zzH()[1] = zzH[zzc];
                            this.zzg = 2;
                            this.zzf = 1;
                            break;
                        }
                        zzc++;
                    } else {
                        zzdyVar.zzF(zzd);
                        break;
                    }
                }
            } else if (i10 != 1) {
                int min = Math.min(zzdyVar.zza(), this.zzk - this.zzg);
                zzzw.zzb(this.zzd, zzdyVar, min);
                int i11 = this.zzg + min;
                this.zzg = i11;
                int i12 = this.zzk;
                if (i11 >= i12) {
                    long j10 = this.zzl;
                    if (j10 != -9223372036854775807L) {
                        this.zzd.zzs(j10, 1, i12, 0, null);
                        this.zzl += this.zzj;
                    }
                    this.zzg = 0;
                    this.zzf = 0;
                }
            } else {
                int min2 = Math.min(zzdyVar.zza(), 4 - this.zzg);
                zzdyVar.zzB(this.zza.zzH(), this.zzg, min2);
                int i13 = this.zzg + min2;
                this.zzg = i13;
                if (i13 >= 4) {
                    this.zza.zzF(0);
                    if (this.zzb.zza(this.zza.zze())) {
                        this.zzk = this.zzb.zzc;
                        if (!this.zzh) {
                            this.zzj = (zzzkVar.zzg * 1000000) / zzzkVar.zzd;
                            zzab zzabVar = new zzab();
                            zzabVar.zzH(this.zze);
                            zzabVar.zzS(this.zzb.zzb);
                            zzabVar.zzL(4096);
                            zzabVar.zzw(this.zzb.zze);
                            zzabVar.zzT(this.zzb.zzd);
                            zzabVar.zzK(this.zzc);
                            this.zzd.zzk(zzabVar.zzY());
                            this.zzh = true;
                        }
                        this.zza.zzF(0);
                        zzzw.zzb(this.zzd, this.zza, 4);
                        this.zzf = 2;
                    } else {
                        this.zzg = 0;
                        this.zzf = 1;
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzb(zzyu zzyuVar, zzahm zzahmVar) {
        zzahmVar.zzc();
        this.zze = zzahmVar.zzb();
        this.zzd = zzyuVar.zzv(zzahmVar.zza(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzd(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.zzl = j10;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zze() {
        this.zzf = 0;
        this.zzg = 0;
        this.zzi = false;
        this.zzl = -9223372036854775807L;
    }

    public zzago(String str) {
        this.zzf = 0;
        zzdy zzdyVar = new zzdy(4);
        this.zza = zzdyVar;
        zzdyVar.zzH()[0] = -1;
        this.zzb = new zzzk();
        this.zzl = -9223372036854775807L;
        this.zzc = str;
    }
}
