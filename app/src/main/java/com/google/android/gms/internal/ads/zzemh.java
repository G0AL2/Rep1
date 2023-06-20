package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.util.Pair;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzemh implements zzdeo, zzddh, zzdbw, zzdcn, com.google.android.gms.ads.internal.client.zza, zzdbt, zzdee, zzarc, zzdcj, zzdjg {
    private final zzfgp zzj;
    private final AtomicReference zzb = new AtomicReference();
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicBoolean zzg = new AtomicBoolean(true);
    private final AtomicBoolean zzh = new AtomicBoolean(false);
    private final AtomicBoolean zzi = new AtomicBoolean(false);
    @VisibleForTesting
    final BlockingQueue zza = new ArrayBlockingQueue(((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhs)).intValue());

    public zzemh(zzfgp zzfgpVar) {
        this.zzj = zzfgpVar;
    }

    @TargetApi(5)
    private final void zzt() {
        if (this.zzh.get() && this.zzi.get()) {
            for (final Pair pair : this.zza) {
                zzeyo.zza(this.zzc, new zzeyn() { // from class: com.google.android.gms.internal.ads.zzely
                    @Override // com.google.android.gms.internal.ads.zzeyn
                    public final void zza(Object obj) {
                        Pair pair2 = pair;
                        ((com.google.android.gms.ads.internal.client.zzbz) obj).zzc((String) pair2.first, (String) pair2.second);
                    }
                });
            }
            this.zza.clear();
            this.zzg.set(false);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzij)).booleanValue()) {
            return;
        }
        zzeyo.zza(this.zzb, zzelz.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdbw
    public final void zza(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzeyo.zza(this.zzb, new zzeyn() { // from class: com.google.android.gms.internal.ads.zzemb
            @Override // com.google.android.gms.internal.ads.zzeyn
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbf) obj).zzf(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
        zzeyo.zza(this.zzb, new zzeyn() { // from class: com.google.android.gms.internal.ads.zzemc
            @Override // com.google.android.gms.internal.ads.zzeyn
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbf) obj).zze(com.google.android.gms.ads.internal.client.zze.this.zza);
            }
        });
        zzeyo.zza(this.zze, new zzeyn() { // from class: com.google.android.gms.internal.ads.zzemd
            @Override // com.google.android.gms.internal.ads.zzeyn
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbi) obj).zzb(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
        this.zzg.set(false);
        this.zza.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzdeo
    public final void zzb(zzfbx zzfbxVar) {
        this.zzg.set(true);
        this.zzi.set(false);
    }

    @Override // com.google.android.gms.internal.ads.zzdeo
    public final void zzbE(zzbzv zzbzvVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzarc
    @TargetApi(5)
    public final synchronized void zzbu(final String str, final String str2) {
        if (this.zzg.get()) {
            if (!this.zza.offer(new Pair(str, str2))) {
                zzcfi.zze("The queue for app events is full, dropping the new event.");
                zzfgp zzfgpVar = this.zzj;
                if (zzfgpVar != null) {
                    zzfgo zzb = zzfgo.zzb("dae_action");
                    zzb.zza("dae_name", str);
                    zzb.zza("dae_data", str2);
                    zzfgpVar.zzb(zzb);
                    return;
                }
            }
            return;
        }
        zzeyo.zza(this.zzc, new zzeyn() { // from class: com.google.android.gms.internal.ads.zzelu
            @Override // com.google.android.gms.internal.ads.zzeyn
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbz) obj).zzc(str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    public final void zzbv() {
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzbf zzc() {
        return (com.google.android.gms.ads.internal.client.zzbf) this.zzb.get();
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzbz zzd() {
        return (com.google.android.gms.ads.internal.client.zzbz) this.zzc.get();
    }

    public final void zze(com.google.android.gms.ads.internal.client.zzbf zzbfVar) {
        this.zzb.set(zzbfVar);
    }

    public final void zzf(com.google.android.gms.ads.internal.client.zzbi zzbiVar) {
        this.zze.set(zzbiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdee
    public final void zzg(final com.google.android.gms.ads.internal.client.zzs zzsVar) {
        zzeyo.zza(this.zzd, new zzeyn() { // from class: com.google.android.gms.internal.ads.zzelw
            @Override // com.google.android.gms.internal.ads.zzeyn
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzde) obj).zze(com.google.android.gms.ads.internal.client.zzs.this);
            }
        });
    }

    public final void zzh(com.google.android.gms.ads.internal.client.zzde zzdeVar) {
        this.zzd.set(zzdeVar);
    }

    public final void zzi(com.google.android.gms.ads.internal.client.zzbz zzbzVar) {
        this.zzc.set(zzbzVar);
        this.zzh.set(true);
        zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    public final void zzj() {
        zzeyo.zza(this.zzb, new zzeyn() { // from class: com.google.android.gms.internal.ads.zzemg
            @Override // com.google.android.gms.internal.ads.zzeyn
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbf) obj).zzd();
            }
        });
        zzeyo.zza(this.zzf, new zzeyn() { // from class: com.google.android.gms.internal.ads.zzelq
            @Override // com.google.android.gms.internal.ads.zzeyn
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzcg) obj).zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdcj
    public final void zzk(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzeyo.zza(this.zzf, new zzeyn() { // from class: com.google.android.gms.internal.ads.zzelv
            @Override // com.google.android.gms.internal.ads.zzeyn
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzcg) obj).zzd(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdcn
    public final void zzl() {
        zzeyo.zza(this.zzb, new zzeyn() { // from class: com.google.android.gms.internal.ads.zzelp
            @Override // com.google.android.gms.internal.ads.zzeyn
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbf) obj).zzg();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    public final void zzm() {
        zzeyo.zza(this.zzb, new zzeyn() { // from class: com.google.android.gms.internal.ads.zzelx
            @Override // com.google.android.gms.internal.ads.zzeyn
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbf) obj).zzh();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzddh
    public final synchronized void zzn() {
        zzeyo.zza(this.zzb, new zzeyn() { // from class: com.google.android.gms.internal.ads.zzeme
            @Override // com.google.android.gms.internal.ads.zzeyn
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbf) obj).zzi();
            }
        });
        zzeyo.zza(this.zze, new zzeyn() { // from class: com.google.android.gms.internal.ads.zzemf
            @Override // com.google.android.gms.internal.ads.zzeyn
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbi) obj).zzc();
            }
        });
        this.zzi.set(true);
        zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    public final void zzo() {
        zzeyo.zza(this.zzb, new zzeyn() { // from class: com.google.android.gms.internal.ads.zzelr
            @Override // com.google.android.gms.internal.ads.zzeyn
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbf) obj).zzj();
            }
        });
        zzeyo.zza(this.zzf, new zzeyn() { // from class: com.google.android.gms.internal.ads.zzels
            @Override // com.google.android.gms.internal.ads.zzeyn
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzcg) obj).zzf();
            }
        });
        zzeyo.zza(this.zzf, new zzeyn() { // from class: com.google.android.gms.internal.ads.zzelt
            @Override // com.google.android.gms.internal.ads.zzeyn
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzcg) obj).zze();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    public final void zzp(zzcal zzcalVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzq() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzij)).booleanValue()) {
            zzeyo.zza(this.zzb, zzelz.zza);
        }
        zzeyo.zza(this.zzf, new zzeyn() { // from class: com.google.android.gms.internal.ads.zzema
            @Override // com.google.android.gms.internal.ads.zzeyn
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzcg) obj).zzb();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    public final void zzr() {
    }

    public final void zzs(com.google.android.gms.ads.internal.client.zzcg zzcgVar) {
        this.zzf.set(zzcgVar);
    }
}
