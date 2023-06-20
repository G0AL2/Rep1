package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzexh implements zzdbw, zzdds, zzeyx, com.google.android.gms.ads.internal.overlay.zzo, zzdee, zzdcj, zzdjg {
    private final zzfdk zza;
    private final AtomicReference zzb = new AtomicReference();
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();
    private zzexh zzh = null;

    public zzexh(zzfdk zzfdkVar) {
        this.zza = zzfdkVar;
    }

    public static zzexh zzi(zzexh zzexhVar) {
        zzexh zzexhVar2 = new zzexh(zzexhVar.zza);
        zzexhVar2.zzh = zzexhVar;
        return zzexhVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzdbw
    public final void zza(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzexh zzexhVar = this.zzh;
        if (zzexhVar != null) {
            zzexhVar.zza(zzeVar);
            return;
        }
        zzeyo.zza(this.zzb, new zzeyn() { // from class: com.google.android.gms.internal.ads.zzews
            @Override // com.google.android.gms.internal.ads.zzeyn
            public final void zza(Object obj) {
                ((zzbcj) obj).zzc(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
        zzeyo.zza(this.zzb, new zzeyn() { // from class: com.google.android.gms.internal.ads.zzewy
            @Override // com.google.android.gms.internal.ads.zzeyn
            public final void zza(Object obj) {
                ((zzbcj) obj).zzb(com.google.android.gms.ads.internal.client.zze.this.zza);
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzb() {
        zzexh zzexhVar = this.zzh;
        if (zzexhVar != null) {
            zzexhVar.zzb();
            return;
        }
        zzeyo.zza(this.zzf, new zzeyn() { // from class: com.google.android.gms.internal.ads.zzexa
            @Override // com.google.android.gms.internal.ads.zzeyn
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.overlay.zzo) obj).zzb();
            }
        });
        zzeyo.zza(this.zzd, new zzeyn() { // from class: com.google.android.gms.internal.ads.zzexb
            @Override // com.google.android.gms.internal.ads.zzeyn
            public final void zza(Object obj) {
                ((zzbcn) obj).zzf();
            }
        });
        zzeyo.zza(this.zzd, new zzeyn() { // from class: com.google.android.gms.internal.ads.zzexc
            @Override // com.google.android.gms.internal.ads.zzeyn
            public final void zza(Object obj) {
                ((zzbcn) obj).zze();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbC() {
        zzexh zzexhVar = this.zzh;
        if (zzexhVar != null) {
            zzexhVar.zzbC();
        } else {
            zzeyo.zza(this.zzf, new zzeyn() { // from class: com.google.android.gms.internal.ads.zzewx
                @Override // com.google.android.gms.internal.ads.zzeyn
                public final void zza(Object obj) {
                    ((com.google.android.gms.ads.internal.overlay.zzo) obj).zzbC();
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbK() {
    }

    @Override // com.google.android.gms.internal.ads.zzeyx
    public final void zzbL(zzeyx zzeyxVar) {
        this.zzh = (zzexh) zzeyxVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbr() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zze() {
        zzexh zzexhVar = this.zzh;
        if (zzexhVar != null) {
            zzexhVar.zze();
        } else {
            zzeyo.zza(this.zzf, new zzeyn() { // from class: com.google.android.gms.internal.ads.zzexe
                @Override // com.google.android.gms.internal.ads.zzeyn
                public final void zza(Object obj) {
                    ((com.google.android.gms.ads.internal.overlay.zzo) obj).zze();
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzf(final int i10) {
        zzexh zzexhVar = this.zzh;
        if (zzexhVar != null) {
            zzexhVar.zzf(i10);
        } else {
            zzeyo.zza(this.zzf, new zzeyn() { // from class: com.google.android.gms.internal.ads.zzeww
                @Override // com.google.android.gms.internal.ads.zzeyn
                public final void zza(Object obj) {
                    ((com.google.android.gms.ads.internal.overlay.zzo) obj).zzf(i10);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdee
    public final void zzg(final com.google.android.gms.ads.internal.client.zzs zzsVar) {
        zzexh zzexhVar = this.zzh;
        if (zzexhVar != null) {
            zzexhVar.zzg(zzsVar);
        } else {
            zzeyo.zza(this.zzg, new zzeyn() { // from class: com.google.android.gms.internal.ads.zzewv
                @Override // com.google.android.gms.internal.ads.zzeyn
                public final void zza(Object obj) {
                    ((com.google.android.gms.ads.internal.client.zzde) obj).zze(com.google.android.gms.ads.internal.client.zzs.this);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdds
    public final void zzh() {
        zzexh zzexhVar = this.zzh;
        if (zzexhVar != null) {
            zzexhVar.zzh();
        } else {
            zzeyo.zza(this.zze, new zzeyn() { // from class: com.google.android.gms.internal.ads.zzexg
                @Override // com.google.android.gms.internal.ads.zzeyn
                public final void zza(Object obj) {
                    ((zzdds) obj).zzh();
                }
            });
        }
    }

    public final void zzj() {
        zzexh zzexhVar = this.zzh;
        if (zzexhVar != null) {
            zzexhVar.zzj();
            return;
        }
        this.zza.zza();
        zzeyo.zza(this.zzc, new zzeyn() { // from class: com.google.android.gms.internal.ads.zzewt
            @Override // com.google.android.gms.internal.ads.zzeyn
            public final void zza(Object obj) {
                ((zzbck) obj).zze();
            }
        });
        zzeyo.zza(this.zzd, new zzeyn() { // from class: com.google.android.gms.internal.ads.zzewu
            @Override // com.google.android.gms.internal.ads.zzeyn
            public final void zza(Object obj) {
                ((zzbcn) obj).zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdcj
    public final void zzk(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzexh zzexhVar = this.zzh;
        if (zzexhVar != null) {
            zzexhVar.zzk(zzeVar);
        } else {
            zzeyo.zza(this.zzd, new zzeyn() { // from class: com.google.android.gms.internal.ads.zzexd
                @Override // com.google.android.gms.internal.ads.zzeyn
                public final void zza(Object obj) {
                    ((zzbcn) obj).zzd(com.google.android.gms.ads.internal.client.zze.this);
                }
            });
        }
    }

    public final void zzl(final zzbcg zzbcgVar) {
        zzexh zzexhVar = this.zzh;
        if (zzexhVar != null) {
            zzexhVar.zzl(zzbcgVar);
        } else {
            zzeyo.zza(this.zzb, new zzeyn() { // from class: com.google.android.gms.internal.ads.zzewz
                @Override // com.google.android.gms.internal.ads.zzeyn
                public final void zza(Object obj) {
                    ((zzbcj) obj).zzd(zzbcg.this);
                }
            });
        }
    }

    public final void zzn(zzdds zzddsVar) {
        this.zze.set(zzddsVar);
    }

    public final void zzo(com.google.android.gms.ads.internal.overlay.zzo zzoVar) {
        this.zzf.set(zzoVar);
    }

    public final void zzp(com.google.android.gms.ads.internal.client.zzde zzdeVar) {
        this.zzg.set(zzdeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzq() {
        zzexh zzexhVar = this.zzh;
        if (zzexhVar != null) {
            zzexhVar.zzq();
        } else {
            zzeyo.zza(this.zzd, new zzeyn() { // from class: com.google.android.gms.internal.ads.zzexf
                @Override // com.google.android.gms.internal.ads.zzeyn
                public final void zza(Object obj) {
                    ((zzbcn) obj).zzb();
                }
            });
        }
    }

    public final void zzr(zzbcj zzbcjVar) {
        this.zzb.set(zzbcjVar);
    }

    public final void zzs(zzbcn zzbcnVar) {
        this.zzd.set(zzbcnVar);
    }

    public final void zzt(zzbck zzbckVar) {
        this.zzc.set(zzbckVar);
    }
}
