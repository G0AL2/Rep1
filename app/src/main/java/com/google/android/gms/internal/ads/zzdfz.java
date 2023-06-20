package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdfz extends zzfko implements zzdbt, com.google.android.gms.ads.internal.client.zza, zzarc, zzdee, zzdcn, zzdds, com.google.android.gms.ads.internal.overlay.zzo, zzdcj, zzdjg {
    private final zzdfx zza = new zzdfx(this, null);
    private zzemh zzb;
    private zzeml zzc;
    private zzexh zzd;
    private zzfao zze;

    public static /* bridge */ /* synthetic */ void zzn(zzdfz zzdfzVar, zzemh zzemhVar) {
        zzdfzVar.zzb = zzemhVar;
    }

    public static /* bridge */ /* synthetic */ void zzs(zzdfz zzdfzVar, zzexh zzexhVar) {
        zzdfzVar.zzd = zzexhVar;
    }

    public static /* bridge */ /* synthetic */ void zzt(zzdfz zzdfzVar, zzeml zzemlVar) {
        zzdfzVar.zzc = zzemlVar;
    }

    public static /* bridge */ /* synthetic */ void zzu(zzdfz zzdfzVar, zzfao zzfaoVar) {
        zzdfzVar.zze = zzfaoVar;
    }

    private static void zzw(Object obj, zzdfy zzdfyVar) {
        if (obj != null) {
            zzdfyVar.zza(obj);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzw(this.zzb, new zzdfy() { // from class: com.google.android.gms.internal.ads.zzdfn
            @Override // com.google.android.gms.internal.ads.zzdfy
            public final void zza(Object obj) {
                ((zzemh) obj).onAdClicked();
            }
        });
        zzw(this.zzc, new zzdfy() { // from class: com.google.android.gms.internal.ads.zzdfo
            @Override // com.google.android.gms.internal.ads.zzdfy
            public final void zza(Object obj) {
                ((zzeml) obj).onAdClicked();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzb() {
        zzw(this.zzd, new zzdfy() { // from class: com.google.android.gms.internal.ads.zzdft
            @Override // com.google.android.gms.internal.ads.zzdfy
            public final void zza(Object obj) {
                ((zzexh) obj).zzb();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbC() {
        zzw(this.zzd, new zzdfy() { // from class: com.google.android.gms.internal.ads.zzdew
            @Override // com.google.android.gms.internal.ads.zzdfy
            public final void zza(Object obj) {
                ((zzexh) obj).zzbC();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbK() {
        zzw(this.zzd, new zzdfy() { // from class: com.google.android.gms.internal.ads.zzdfm
            @Override // com.google.android.gms.internal.ads.zzdfy
            public final void zza(Object obj) {
                zzexh zzexhVar = (zzexh) obj;
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbr() {
        zzw(this.zzd, new zzdfy() { // from class: com.google.android.gms.internal.ads.zzdet
            @Override // com.google.android.gms.internal.ads.zzdfy
            public final void zza(Object obj) {
                zzexh zzexhVar = (zzexh) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzarc
    public final void zzbu(final String str, final String str2) {
        zzw(this.zzb, new zzdfy() { // from class: com.google.android.gms.internal.ads.zzdeq
            @Override // com.google.android.gms.internal.ads.zzdfy
            public final void zza(Object obj) {
                ((zzemh) obj).zzbu(str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    public final void zzbv() {
        zzw(this.zzb, new zzdfy() { // from class: com.google.android.gms.internal.ads.zzder
            @Override // com.google.android.gms.internal.ads.zzdfy
            public final void zza(Object obj) {
                zzemh zzemhVar = (zzemh) obj;
            }
        });
        zzw(this.zze, new zzdfy() { // from class: com.google.android.gms.internal.ads.zzdes
            @Override // com.google.android.gms.internal.ads.zzdfy
            public final void zza(Object obj) {
                ((zzfao) obj).zzbv();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zze() {
        zzw(this.zzd, new zzdfy() { // from class: com.google.android.gms.internal.ads.zzdep
            @Override // com.google.android.gms.internal.ads.zzdfy
            public final void zza(Object obj) {
                ((zzexh) obj).zze();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzf(final int i10) {
        zzw(this.zzd, new zzdfy() { // from class: com.google.android.gms.internal.ads.zzdfk
            @Override // com.google.android.gms.internal.ads.zzdfy
            public final void zza(Object obj) {
                ((zzexh) obj).zzf(i10);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdee
    public final void zzg(final com.google.android.gms.ads.internal.client.zzs zzsVar) {
        zzw(this.zzb, new zzdfy() { // from class: com.google.android.gms.internal.ads.zzdfq
            @Override // com.google.android.gms.internal.ads.zzdfy
            public final void zza(Object obj) {
                ((zzemh) obj).zzg(com.google.android.gms.ads.internal.client.zzs.this);
            }
        });
        zzw(this.zze, new zzdfy() { // from class: com.google.android.gms.internal.ads.zzdfr
            @Override // com.google.android.gms.internal.ads.zzdfy
            public final void zza(Object obj) {
                ((zzfao) obj).zzg(com.google.android.gms.ads.internal.client.zzs.this);
            }
        });
        zzw(this.zzd, new zzdfy() { // from class: com.google.android.gms.internal.ads.zzdfs
            @Override // com.google.android.gms.internal.ads.zzdfy
            public final void zza(Object obj) {
                ((zzexh) obj).zzg(com.google.android.gms.ads.internal.client.zzs.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdds
    public final void zzh() {
        zzw(this.zzd, new zzdfy() { // from class: com.google.android.gms.internal.ads.zzdfc
            @Override // com.google.android.gms.internal.ads.zzdfy
            public final void zza(Object obj) {
                ((zzexh) obj).zzh();
            }
        });
    }

    public final zzdfx zzi() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    public final void zzj() {
        zzw(this.zzb, new zzdfy() { // from class: com.google.android.gms.internal.ads.zzdfi
            @Override // com.google.android.gms.internal.ads.zzdfy
            public final void zza(Object obj) {
                ((zzemh) obj).zzj();
            }
        });
        zzw(this.zze, new zzdfy() { // from class: com.google.android.gms.internal.ads.zzdfj
            @Override // com.google.android.gms.internal.ads.zzdfy
            public final void zza(Object obj) {
                ((zzfao) obj).zzj();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdcj
    public final void zzk(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzw(this.zze, new zzdfy() { // from class: com.google.android.gms.internal.ads.zzdex
            @Override // com.google.android.gms.internal.ads.zzdfy
            public final void zza(Object obj) {
                ((zzfao) obj).zzk(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
        zzw(this.zzb, new zzdfy() { // from class: com.google.android.gms.internal.ads.zzdey
            @Override // com.google.android.gms.internal.ads.zzdfy
            public final void zza(Object obj) {
                ((zzemh) obj).zzk(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdcn
    public final void zzl() {
        zzw(this.zzb, new zzdfy() { // from class: com.google.android.gms.internal.ads.zzdfa
            @Override // com.google.android.gms.internal.ads.zzdfy
            public final void zza(Object obj) {
                ((zzemh) obj).zzl();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    public final void zzm() {
        zzw(this.zzb, new zzdfy() { // from class: com.google.android.gms.internal.ads.zzdfl
            @Override // com.google.android.gms.internal.ads.zzdfy
            public final void zza(Object obj) {
                ((zzemh) obj).zzm();
            }
        });
        zzw(this.zze, new zzdfy() { // from class: com.google.android.gms.internal.ads.zzdfp
            @Override // com.google.android.gms.internal.ads.zzdfy
            public final void zza(Object obj) {
                ((zzfao) obj).zzm();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    public final void zzo() {
        zzw(this.zzb, new zzdfy() { // from class: com.google.android.gms.internal.ads.zzdfu
            @Override // com.google.android.gms.internal.ads.zzdfy
            public final void zza(Object obj) {
                ((zzemh) obj).zzo();
            }
        });
        zzw(this.zze, new zzdfy() { // from class: com.google.android.gms.internal.ads.zzdfv
            @Override // com.google.android.gms.internal.ads.zzdfy
            public final void zza(Object obj) {
                ((zzfao) obj).zzo();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    public final void zzp(final zzcal zzcalVar, final String str, final String str2) {
        zzw(this.zzb, new zzdfy() { // from class: com.google.android.gms.internal.ads.zzdez
            @Override // com.google.android.gms.internal.ads.zzdfy
            public final void zza(Object obj) {
                zzemh zzemhVar = (zzemh) obj;
            }
        });
        zzw(this.zze, new zzdfy() { // from class: com.google.android.gms.internal.ads.zzdfb
            @Override // com.google.android.gms.internal.ads.zzdfy
            public final void zza(Object obj) {
                ((zzfao) obj).zzp(zzcal.this, str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzq() {
        zzw(this.zzb, new zzdfy() { // from class: com.google.android.gms.internal.ads.zzdfd
            @Override // com.google.android.gms.internal.ads.zzdfy
            public final void zza(Object obj) {
                ((zzemh) obj).zzq();
            }
        });
        zzw(this.zzc, new zzdfy() { // from class: com.google.android.gms.internal.ads.zzdfe
            @Override // com.google.android.gms.internal.ads.zzdfy
            public final void zza(Object obj) {
                ((zzeml) obj).zzq();
            }
        });
        zzw(this.zze, new zzdfy() { // from class: com.google.android.gms.internal.ads.zzdff
            @Override // com.google.android.gms.internal.ads.zzdfy
            public final void zza(Object obj) {
                ((zzfao) obj).zzq();
            }
        });
        zzw(this.zzd, new zzdfy() { // from class: com.google.android.gms.internal.ads.zzdfg
            @Override // com.google.android.gms.internal.ads.zzdfy
            public final void zza(Object obj) {
                ((zzexh) obj).zzq();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    public final void zzr() {
        zzw(this.zzb, new zzdfy() { // from class: com.google.android.gms.internal.ads.zzdeu
            @Override // com.google.android.gms.internal.ads.zzdfy
            public final void zza(Object obj) {
                zzemh zzemhVar = (zzemh) obj;
            }
        });
        zzw(this.zze, new zzdfy() { // from class: com.google.android.gms.internal.ads.zzdev
            @Override // com.google.android.gms.internal.ads.zzdfy
            public final void zza(Object obj) {
                ((zzfao) obj).zzr();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfko
    public final void zzv() {
        zzw(this.zze, new zzdfy() { // from class: com.google.android.gms.internal.ads.zzdfh
            @Override // com.google.android.gms.internal.ads.zzdfy
            public final void zza(Object obj) {
                ((zzfao) obj).zzv();
            }
        });
    }
}
