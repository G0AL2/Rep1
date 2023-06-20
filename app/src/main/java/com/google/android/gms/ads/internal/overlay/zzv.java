package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzbxu;
import com.google.android.gms.internal.ads.zzdjg;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzv extends zzbxu {
    private final AdOverlayInfoParcel zza;
    private final Activity zzb;
    private boolean zzc = false;
    private boolean zzd = false;

    public zzv(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.zza = adOverlayInfoParcel;
        this.zzb = activity;
    }

    private final synchronized void zzb() {
        if (this.zzd) {
            return;
        }
        zzo zzoVar = this.zza.zzc;
        if (zzoVar != null) {
            zzoVar.zzf(4);
        }
        this.zzd = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbxv
    public final boolean zzE() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbxv
    public final void zzg(int i10, int i11, Intent intent) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbxv
    public final void zzh() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbxv
    public final void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbxv
    public final void zzk(Bundle bundle) {
        zzo zzoVar;
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzht)).booleanValue()) {
            this.zzb.requestWindowFeature(1);
        }
        boolean z10 = false;
        if (bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
            z10 = true;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.zza;
        if (adOverlayInfoParcel == null) {
            this.zzb.finish();
        } else if (z10) {
            this.zzb.finish();
        } else {
            if (bundle == null) {
                com.google.android.gms.ads.internal.client.zza zzaVar = adOverlayInfoParcel.zzb;
                if (zzaVar != null) {
                    zzaVar.onAdClicked();
                }
                zzdjg zzdjgVar = this.zza.zzy;
                if (zzdjgVar != null) {
                    zzdjgVar.zzq();
                }
                if (this.zzb.getIntent() != null && this.zzb.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) && (zzoVar = this.zza.zzc) != null) {
                    zzoVar.zzb();
                }
            }
            com.google.android.gms.ads.internal.zzt.zzi();
            Activity activity = this.zzb;
            AdOverlayInfoParcel adOverlayInfoParcel2 = this.zza;
            zzc zzcVar = adOverlayInfoParcel2.zza;
            if (zza.zzb(activity, zzcVar, adOverlayInfoParcel2.zzi, zzcVar.zzi)) {
                return;
            }
            this.zzb.finish();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxv
    public final void zzl() throws RemoteException {
        if (this.zzb.isFinishing()) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxv
    public final void zzn() throws RemoteException {
        zzo zzoVar = this.zza.zzc;
        if (zzoVar != null) {
            zzoVar.zzbr();
        }
        if (this.zzb.isFinishing()) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxv
    public final void zzo() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbxv
    public final void zzp() throws RemoteException {
        if (this.zzc) {
            this.zzb.finish();
            return;
        }
        this.zzc = true;
        zzo zzoVar = this.zza.zzc;
        if (zzoVar != null) {
            zzoVar.zzbK();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxv
    public final void zzq(Bundle bundle) throws RemoteException {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzbxv
    public final void zzr() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbxv
    public final void zzs() throws RemoteException {
        if (this.zzb.isFinishing()) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxv
    public final void zzt() throws RemoteException {
        zzo zzoVar = this.zza.zzc;
        if (zzoVar != null) {
            zzoVar.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxv
    public final void zzv() throws RemoteException {
    }
}
