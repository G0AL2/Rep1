package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
@VisibleForTesting
/* loaded from: classes2.dex */
public final class zzdsh implements com.google.android.gms.ads.internal.client.zza, zzbnm, com.google.android.gms.ads.internal.overlay.zzo, zzbno, com.google.android.gms.ads.internal.overlay.zzw, zzdjg {
    private com.google.android.gms.ads.internal.client.zza zza;
    private zzbnm zzb;
    private com.google.android.gms.ads.internal.overlay.zzo zzc;
    private zzbno zzd;
    private com.google.android.gms.ads.internal.overlay.zzw zze;
    private zzdjg zzf;

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzi(com.google.android.gms.ads.internal.client.zza zzaVar, zzbnm zzbnmVar, com.google.android.gms.ads.internal.overlay.zzo zzoVar, zzbno zzbnoVar, com.google.android.gms.ads.internal.overlay.zzw zzwVar, zzdjg zzdjgVar) {
        this.zza = zzaVar;
        this.zzb = zzbnmVar;
        this.zzc = zzoVar;
        this.zzd = zzbnoVar;
        this.zze = zzwVar;
        this.zzf = zzdjgVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final synchronized void onAdClicked() {
        com.google.android.gms.ads.internal.client.zza zzaVar = this.zza;
        if (zzaVar != null) {
            zzaVar.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final synchronized void zza(String str, Bundle bundle) {
        zzbnm zzbnmVar = this.zzb;
        if (zzbnmVar != null) {
            zzbnmVar.zza(str, bundle);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzb() {
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.zzc;
        if (zzoVar != null) {
            zzoVar.zzb();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbC() {
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.zzc;
        if (zzoVar != null) {
            zzoVar.zzbC();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbno
    public final synchronized void zzbD(String str, String str2) {
        zzbno zzbnoVar = this.zzd;
        if (zzbnoVar != null) {
            zzbnoVar.zzbD(str, str2);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbK() {
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.zzc;
        if (zzoVar != null) {
            zzoVar.zzbK();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbr() {
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.zzc;
        if (zzoVar != null) {
            zzoVar.zzbr();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zze() {
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.zzc;
        if (zzoVar != null) {
            zzoVar.zze();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzf(int i10) {
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.zzc;
        if (zzoVar != null) {
            zzoVar.zzf(i10);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzw
    public final synchronized void zzg() {
        com.google.android.gms.ads.internal.overlay.zzw zzwVar = this.zze;
        if (zzwVar != null) {
            ((zzdsi) zzwVar).zza.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final synchronized void zzq() {
        zzdjg zzdjgVar = this.zzf;
        if (zzdjgVar != null) {
            zzdjgVar.zzq();
        }
    }
}
