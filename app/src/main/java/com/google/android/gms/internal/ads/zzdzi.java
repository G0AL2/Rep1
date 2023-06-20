package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdzi implements com.google.android.gms.ads.internal.overlay.zzo, zzcmt {
    private final Context zza;
    private final zzcfo zzb;
    private zzdzb zzc;
    private zzcli zzd;
    private boolean zze;
    private boolean zzf;
    private long zzg;
    private com.google.android.gms.ads.internal.client.zzcy zzh;
    private boolean zzi;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdzi(Context context, zzcfo zzcfoVar) {
        this.zza = context;
        this.zzb = zzcfoVar;
    }

    private final synchronized void zzj() {
        if (this.zze && this.zzf) {
            zzcfv.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdzh
                @Override // java.lang.Runnable
                public final void run() {
                    zzdzi.this.zzh();
                }
            });
        }
    }

    private final synchronized boolean zzk(com.google.android.gms.ads.internal.client.zzcy zzcyVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhv)).booleanValue()) {
            zzcfi.zzj("Ad inspector had an internal error.");
            try {
                zzcyVar.zze(zzfdc.zzd(16, null, null));
            } catch (RemoteException unused) {
            }
            return false;
        } else if (this.zzc == null) {
            zzcfi.zzj("Ad inspector had an internal error.");
            try {
                zzcyVar.zze(zzfdc.zzd(16, null, null));
            } catch (RemoteException unused2) {
            }
            return false;
        } else {
            if (!this.zze && !this.zzf) {
                if (com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis() >= this.zzg + ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhy)).intValue()) {
                    return true;
                }
            }
            zzcfi.zzj("Ad inspector cannot be opened because it is already open.");
            try {
                zzcyVar.zze(zzfdc.zzd(19, null, null));
            } catch (RemoteException unused3) {
            }
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcmt
    public final synchronized void zza(boolean z10) {
        if (z10) {
            com.google.android.gms.ads.internal.util.zze.zza("Ad inspector loaded.");
            this.zze = true;
            zzj();
            return;
        }
        zzcfi.zzj("Ad inspector failed to load.");
        try {
            com.google.android.gms.ads.internal.client.zzcy zzcyVar = this.zzh;
            if (zzcyVar != null) {
                zzcyVar.zze(zzfdc.zzd(17, null, null));
            }
        } catch (RemoteException unused) {
        }
        this.zzi = true;
        this.zzd.destroy();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzb() {
        this.zzf = true;
        zzj();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbC() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbK() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbr() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zze() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzf(int i10) {
        this.zzd.destroy();
        if (!this.zzi) {
            com.google.android.gms.ads.internal.util.zze.zza("Inspector closed.");
            com.google.android.gms.ads.internal.client.zzcy zzcyVar = this.zzh;
            if (zzcyVar != null) {
                try {
                    zzcyVar.zze(null);
                } catch (RemoteException unused) {
                }
            }
        }
        this.zzf = false;
        this.zze = false;
        this.zzg = 0L;
        this.zzi = false;
        this.zzh = null;
    }

    public final void zzg(zzdzb zzdzbVar) {
        this.zzc = zzdzbVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzh() {
        this.zzd.zzb("window.inspectorInfo", this.zzc.zzd().toString());
    }

    public final synchronized void zzi(com.google.android.gms.ads.internal.client.zzcy zzcyVar, zzbon zzbonVar) {
        if (zzk(zzcyVar)) {
            try {
                com.google.android.gms.ads.internal.zzt.zzz();
                zzcli zza = zzclu.zza(this.zza, zzcmx.zza(), "", false, false, null, null, this.zzb, null, null, null, zzbdm.zza(), null, null);
                this.zzd = zza;
                zzcmv zzP = zza.zzP();
                if (zzP == null) {
                    zzcfi.zzj("Failed to obtain a web view for the ad inspector");
                    try {
                        zzcyVar.zze(zzfdc.zzd(17, "Failed to obtain a web view for the ad inspector", null));
                        return;
                    } catch (RemoteException unused) {
                        return;
                    }
                }
                this.zzh = zzcyVar;
                zzP.zzL(null, null, null, null, null, false, null, null, null, null, null, null, null, null, zzbonVar, null);
                zzP.zzz(this);
                this.zzd.loadUrl((String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhw));
                com.google.android.gms.ads.internal.zzt.zzj();
                com.google.android.gms.ads.internal.overlay.zzm.zza(this.zza, new AdOverlayInfoParcel(this, this.zzd, 1, this.zzb), true);
                this.zzg = com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis();
            } catch (zzclt e10) {
                zzcfi.zzk("Failed to obtain a web view for the ad inspector", e10);
                try {
                    zzcyVar.zze(zzfdc.zzd(17, "Failed to obtain a web view for the ad inspector", null));
                } catch (RemoteException unused2) {
                }
            }
        }
    }
}
