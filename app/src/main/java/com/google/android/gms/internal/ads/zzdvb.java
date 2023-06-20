package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdvb implements zzdeo, zzddh, zzdbw, zzdcn, com.google.android.gms.ads.internal.client.zza, zzdgz {
    private final zzbdm zza;
    private boolean zzb = false;

    public zzdvb(zzbdm zzbdmVar, zzezg zzezgVar) {
        this.zza = zzbdmVar;
        zzbdmVar.zzc(2);
        if (zzezgVar != null) {
            zzbdmVar.zzc(IronSourceConstants.RV_API_HAS_AVAILABILITY_TRUE);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final synchronized void onAdClicked() {
        if (this.zzb) {
            this.zza.zzc(8);
            return;
        }
        this.zza.zzc(7);
        this.zzb = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdbw
    public final void zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        switch (zzeVar.zza) {
            case 1:
                this.zza.zzc(101);
                return;
            case 2:
                this.zza.zzc(102);
                return;
            case 3:
                this.zza.zzc(5);
                return;
            case 4:
                this.zza.zzc(103);
                return;
            case 5:
                this.zza.zzc(104);
                return;
            case 6:
                this.zza.zzc(105);
                return;
            case 7:
                this.zza.zzc(106);
                return;
            default:
                this.zza.zzc(4);
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdeo
    public final void zzb(final zzfbx zzfbxVar) {
        this.zza.zzb(new zzbdl() { // from class: com.google.android.gms.internal.ads.zzdux
            @Override // com.google.android.gms.internal.ads.zzbdl
            public final void zza(zzbfb zzbfbVar) {
                zzfbx zzfbxVar2 = zzfbx.this;
                zzbdx zzbdxVar = (zzbdx) zzbfbVar.zza().zzaz();
                zzbep zzbepVar = (zzbep) zzbfbVar.zza().zzd().zzaz();
                zzbepVar.zza(zzfbxVar2.zzb.zzb.zzb);
                zzbdxVar.zzb(zzbepVar);
                zzbfbVar.zze(zzbdxVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdeo
    public final void zzbE(zzbzv zzbzvVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdgz
    public final void zzd() {
        this.zza.zzc(1109);
    }

    @Override // com.google.android.gms.internal.ads.zzdgz
    public final void zze(final zzbeh zzbehVar) {
        this.zza.zzb(new zzbdl() { // from class: com.google.android.gms.internal.ads.zzdva
            @Override // com.google.android.gms.internal.ads.zzbdl
            public final void zza(zzbfb zzbfbVar) {
                zzbfbVar.zzf(zzbeh.this);
            }
        });
        this.zza.zzc(1103);
    }

    @Override // com.google.android.gms.internal.ads.zzdgz
    public final void zzf(final zzbeh zzbehVar) {
        this.zza.zzb(new zzbdl() { // from class: com.google.android.gms.internal.ads.zzduz
            @Override // com.google.android.gms.internal.ads.zzbdl
            public final void zza(zzbfb zzbfbVar) {
                zzbfbVar.zzf(zzbeh.this);
            }
        });
        this.zza.zzc(IronSourceConstants.RV_API_HAS_AVAILABILITY_FALSE);
    }

    @Override // com.google.android.gms.internal.ads.zzdgz
    public final void zzh(boolean z10) {
        this.zza.zzc(true != z10 ? 1108 : 1107);
    }

    @Override // com.google.android.gms.internal.ads.zzdgz
    public final void zzi(final zzbeh zzbehVar) {
        this.zza.zzb(new zzbdl() { // from class: com.google.android.gms.internal.ads.zzduy
            @Override // com.google.android.gms.internal.ads.zzbdl
            public final void zza(zzbfb zzbfbVar) {
                zzbfbVar.zzf(zzbeh.this);
            }
        });
        this.zza.zzc(1104);
    }

    @Override // com.google.android.gms.internal.ads.zzdgz
    public final void zzk(boolean z10) {
        this.zza.zzc(true != z10 ? 1106 : 1105);
    }

    @Override // com.google.android.gms.internal.ads.zzdcn
    public final synchronized void zzl() {
        this.zza.zzc(6);
    }

    @Override // com.google.android.gms.internal.ads.zzddh
    public final void zzn() {
        this.zza.zzc(3);
    }
}
