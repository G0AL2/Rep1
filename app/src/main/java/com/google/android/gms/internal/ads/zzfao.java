package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfao extends zzfko implements zzddh, zzdbw, zzdbt, zzdcj, zzdee, zzeyx, zzdjg {
    private final zzfdk zza;
    private final AtomicReference zzb = new AtomicReference();
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();
    private final AtomicReference zzh = new AtomicReference();

    public zzfao(zzfdk zzfdkVar) {
        this.zza = zzfdkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdbw
    public final void zza(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        final int i10 = zzeVar.zza;
        zzeyo.zza(this.zzc, new zzeyn() { // from class: com.google.android.gms.internal.ads.zzezu
            @Override // com.google.android.gms.internal.ads.zzeyn
            public final void zza(Object obj) {
                ((zzcbl) obj).zzf(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
        zzeyo.zza(this.zzc, new zzeyn() { // from class: com.google.android.gms.internal.ads.zzezv
            @Override // com.google.android.gms.internal.ads.zzeyn
            public final void zza(Object obj) {
                ((zzcbl) obj).zze(i10);
            }
        });
        zzeyo.zza(this.zze, new zzeyn() { // from class: com.google.android.gms.internal.ads.zzezw
            @Override // com.google.android.gms.internal.ads.zzeyn
            public final void zza(Object obj) {
                ((zzcar) obj).zzg(i10);
            }
        });
    }

    public final void zzb(zzfko zzfkoVar) {
        this.zzb.set(zzfkoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeyx
    public final void zzbL(zzeyx zzeyxVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    public final void zzbv() {
        zzeyo.zza(this.zze, new zzeyn() { // from class: com.google.android.gms.internal.ads.zzezz
            @Override // com.google.android.gms.internal.ads.zzeyn
            public final void zza(Object obj) {
                ((zzcar) obj).zzk();
            }
        });
    }

    public final void zzc(com.google.android.gms.ads.internal.client.zzde zzdeVar) {
        this.zzh.set(zzdeVar);
    }

    public final void zzd(zzcbh zzcbhVar) {
        this.zzd.set(zzcbhVar);
    }

    public final void zze(zzcbl zzcblVar) {
        this.zzc.set(zzcblVar);
    }

    @Deprecated
    public final void zzf(zzcar zzcarVar) {
        this.zze.set(zzcarVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdee
    public final void zzg(final com.google.android.gms.ads.internal.client.zzs zzsVar) {
        zzeyo.zza(this.zzh, new zzeyn() { // from class: com.google.android.gms.internal.ads.zzezt
            @Override // com.google.android.gms.internal.ads.zzeyn
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzde) obj).zze(com.google.android.gms.ads.internal.client.zzs.this);
            }
        });
    }

    @Deprecated
    public final void zzh(zzcam zzcamVar) {
        this.zzg.set(zzcamVar);
    }

    public final void zzi(zzcbm zzcbmVar) {
        this.zzf.set(zzcbmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    public final void zzj() {
        this.zza.zza();
        zzeyo.zza(this.zzd, new zzeyn() { // from class: com.google.android.gms.internal.ads.zzfaa
            @Override // com.google.android.gms.internal.ads.zzeyn
            public final void zza(Object obj) {
                ((zzcbh) obj).zzg();
            }
        });
        zzeyo.zza(this.zze, new zzeyn() { // from class: com.google.android.gms.internal.ads.zzfab
            @Override // com.google.android.gms.internal.ads.zzeyn
            public final void zza(Object obj) {
                ((zzcar) obj).zzf();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdcj
    public final void zzk(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzeyo.zza(this.zzd, new zzeyn() { // from class: com.google.android.gms.internal.ads.zzezx
            @Override // com.google.android.gms.internal.ads.zzeyn
            public final void zza(Object obj) {
                ((zzcbh) obj).zzi(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
        zzeyo.zza(this.zzd, new zzeyn() { // from class: com.google.android.gms.internal.ads.zzezy
            @Override // com.google.android.gms.internal.ads.zzeyn
            public final void zza(Object obj) {
                ((zzcbh) obj).zzh(com.google.android.gms.ads.internal.client.zze.this.zza);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    public final void zzm() {
        zzeyo.zza(this.zze, new zzeyn() { // from class: com.google.android.gms.internal.ads.zzfaj
            @Override // com.google.android.gms.internal.ads.zzeyn
            public final void zza(Object obj) {
                ((zzcar) obj).zzh();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzddh
    public final void zzn() {
        zzeyo.zza(this.zzc, new zzeyn() { // from class: com.google.android.gms.internal.ads.zzfag
            @Override // com.google.android.gms.internal.ads.zzeyn
            public final void zza(Object obj) {
                ((zzcbl) obj).zzg();
            }
        });
        zzeyo.zza(this.zze, new zzeyn() { // from class: com.google.android.gms.internal.ads.zzfah
            @Override // com.google.android.gms.internal.ads.zzeyn
            public final void zza(Object obj) {
                ((zzcar) obj).zzi();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    public final void zzo() {
        zzeyo.zza(this.zzd, new zzeyn() { // from class: com.google.android.gms.internal.ads.zzfac
            @Override // com.google.android.gms.internal.ads.zzeyn
            public final void zza(Object obj) {
                ((zzcbh) obj).zzj();
            }
        });
        zzeyo.zza(this.zze, new zzeyn() { // from class: com.google.android.gms.internal.ads.zzfae
            @Override // com.google.android.gms.internal.ads.zzeyn
            public final void zza(Object obj) {
                ((zzcar) obj).zzj();
            }
        });
        zzeyo.zza(this.zzd, new zzeyn() { // from class: com.google.android.gms.internal.ads.zzfaf
            @Override // com.google.android.gms.internal.ads.zzeyn
            public final void zza(Object obj) {
                ((zzcbh) obj).zzf();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    public final void zzp(final zzcal zzcalVar, final String str, final String str2) {
        zzeyo.zza(this.zzd, new zzeyn() { // from class: com.google.android.gms.internal.ads.zzfak
            @Override // com.google.android.gms.internal.ads.zzeyn
            public final void zza(Object obj) {
                zzcal zzcalVar2 = zzcal.this;
                ((zzcbh) obj).zzk(new zzcbv(zzcalVar2.zzc(), zzcalVar2.zzb()));
            }
        });
        zzeyo.zza(this.zzf, new zzeyn() { // from class: com.google.android.gms.internal.ads.zzfal
            @Override // com.google.android.gms.internal.ads.zzeyn
            public final void zza(Object obj) {
                zzcal zzcalVar2 = zzcal.this;
                ((zzcbm) obj).zze(new zzcbv(zzcalVar2.zzc(), zzcalVar2.zzb()), str, str2);
            }
        });
        zzeyo.zza(this.zze, new zzeyn() { // from class: com.google.android.gms.internal.ads.zzfam
            @Override // com.google.android.gms.internal.ads.zzeyn
            public final void zza(Object obj) {
                ((zzcar) obj).zze(zzcal.this);
            }
        });
        zzeyo.zza(this.zzg, new zzeyn() { // from class: com.google.android.gms.internal.ads.zzfan
            @Override // com.google.android.gms.internal.ads.zzeyn
            public final void zza(Object obj) {
                ((zzcam) obj).zze(zzcal.this, str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzq() {
        zzeyo.zza(this.zzd, new zzeyn() { // from class: com.google.android.gms.internal.ads.zzezs
            @Override // com.google.android.gms.internal.ads.zzeyn
            public final void zza(Object obj) {
                ((zzcbh) obj).zze();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    public final void zzr() {
        zzeyo.zza(this.zze, new zzeyn() { // from class: com.google.android.gms.internal.ads.zzfad
            @Override // com.google.android.gms.internal.ads.zzeyn
            public final void zza(Object obj) {
                ((zzcar) obj).zzl();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfko
    public final void zzv() {
        zzeyo.zza(this.zzb, new zzeyn() { // from class: com.google.android.gms.internal.ads.zzfai
            @Override // com.google.android.gms.internal.ads.zzeyn
            public final void zza(Object obj) {
                ((zzfko) obj).zzv();
            }
        });
    }
}
