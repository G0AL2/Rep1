package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfbi extends zzcan {
    private final zzfay zza;
    private final zzfao zzb;
    private final zzfby zzc;
    private zzdst zzd;
    private boolean zze = false;

    public zzfbi(zzfay zzfayVar, zzfao zzfaoVar, zzfby zzfbyVar) {
        this.zza = zzfayVar;
        this.zzb = zzfaoVar;
        this.zzc = zzfbyVar;
    }

    private final synchronized boolean zzx() {
        boolean z10;
        zzdst zzdstVar = this.zzd;
        if (zzdstVar != null) {
            z10 = zzdstVar.zzd() ? false : true;
        }
        return z10;
    }

    @Override // com.google.android.gms.internal.ads.zzcao
    public final Bundle zzb() {
        Preconditions.checkMainThread("getAdMetadata can only be called from the UI thread.");
        zzdst zzdstVar = this.zzd;
        return zzdstVar != null ? zzdstVar.zza() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzcao
    public final synchronized com.google.android.gms.ads.internal.client.zzdh zzc() throws RemoteException {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzfK)).booleanValue()) {
            zzdst zzdstVar = this.zzd;
            if (zzdstVar != null) {
                return zzdstVar.zzl();
            }
            return null;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcao
    public final synchronized String zzd() throws RemoteException {
        zzdst zzdstVar = this.zzd;
        if (zzdstVar == null || zzdstVar.zzl() == null) {
            return null;
        }
        return zzdstVar.zzl().zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcao
    public final void zze() throws RemoteException {
        zzf(null);
    }

    @Override // com.google.android.gms.internal.ads.zzcao
    public final synchronized void zzf(IObjectWrapper iObjectWrapper) {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        Context context = null;
        this.zzb.zzb(null);
        if (this.zzd != null) {
            if (iObjectWrapper != null) {
                context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
            }
            this.zzd.zzm().zza(context);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcao
    public final synchronized void zzg(zzcas zzcasVar) throws RemoteException {
        Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        String str = zzcasVar.zzb;
        String str2 = (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzes);
        if (str2 != null && str != null) {
            try {
                if (Pattern.matches(str2, str)) {
                    return;
                }
            } catch (RuntimeException e10) {
                com.google.android.gms.ads.internal.zzt.zzo().zzt(e10, "NonagonUtil.isPatternMatched");
            }
        }
        if (zzx()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzeu)).booleanValue()) {
                return;
            }
        }
        zzfaq zzfaqVar = new zzfaq(null);
        this.zzd = null;
        this.zza.zzj(1);
        this.zza.zzb(zzcasVar.zza, zzcasVar.zzb, zzfaqVar, new zzfbg(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcao
    public final void zzh() {
        zzi(null);
    }

    @Override // com.google.android.gms.internal.ads.zzcao
    public final synchronized void zzi(IObjectWrapper iObjectWrapper) {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
        if (this.zzd != null) {
            this.zzd.zzm().zzb(iObjectWrapper == null ? null : (Context) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcao
    public final void zzj() {
        zzk(null);
    }

    @Override // com.google.android.gms.internal.ads.zzcao
    public final synchronized void zzk(IObjectWrapper iObjectWrapper) {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
        if (this.zzd != null) {
            this.zzd.zzm().zzc(iObjectWrapper == null ? null : (Context) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcao
    public final void zzl(com.google.android.gms.ads.internal.client.zzbw zzbwVar) {
        Preconditions.checkMainThread("setAdMetadataListener can only be called from the UI thread.");
        if (zzbwVar == null) {
            this.zzb.zzb(null);
        } else {
            this.zzb.zzb(new zzfbh(this, zzbwVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcao
    public final synchronized void zzm(String str) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setCustomData");
        this.zzc.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzcao
    public final synchronized void zzn(boolean z10) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.zze = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzcao
    public final void zzo(zzcar zzcarVar) throws RemoteException {
        Preconditions.checkMainThread("setRewardedVideoAdListener can only be called from the UI thread.");
        this.zzb.zzf(zzcarVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcao
    public final synchronized void zzp(String str) throws RemoteException {
        Preconditions.checkMainThread("setUserId must be called on the main UI thread.");
        this.zzc.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzcao
    public final synchronized void zzq() throws RemoteException {
        zzr(null);
    }

    @Override // com.google.android.gms.internal.ads.zzcao
    public final synchronized void zzr(IObjectWrapper iObjectWrapper) throws RemoteException {
        Preconditions.checkMainThread("showAd must be called on the main UI thread.");
        if (this.zzd != null) {
            Activity activity = null;
            if (iObjectWrapper != null) {
                Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
                if (unwrap instanceof Activity) {
                    activity = (Activity) unwrap;
                }
            }
            this.zzd.zzg(this.zze, activity);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcao
    public final boolean zzs() throws RemoteException {
        Preconditions.checkMainThread("isLoaded must be called on the main UI thread.");
        return zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzcao
    public final boolean zzt() {
        zzdst zzdstVar = this.zzd;
        return zzdstVar != null && zzdstVar.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzcao
    public final void zzu(zzcam zzcamVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.zzb.zzh(zzcamVar);
    }
}
