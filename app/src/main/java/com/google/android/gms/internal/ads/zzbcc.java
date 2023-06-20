package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbcc extends AppOpenAd {
    FullScreenContentCallback zza;
    private final zzbcg zzb;
    private final String zzc;
    private final zzbcd zzd = new zzbcd();
    private OnPaidEventListener zze;

    public zzbcc(zzbcg zzbcgVar, String str) {
        this.zzb = zzbcgVar;
        this.zzc = str;
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final String getAdUnitId() {
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final OnPaidEventListener getOnPaidEventListener() {
        return this.zze;
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final ResponseInfo getResponseInfo() {
        com.google.android.gms.ads.internal.client.zzdh zzdhVar;
        try {
            zzdhVar = this.zzb.zzf();
        } catch (RemoteException e10) {
            zzcfi.zzl("#007 Could not call remote method.", e10);
            zzdhVar = null;
        }
        return ResponseInfo.zzb(zzdhVar);
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback) {
        this.zza = fullScreenContentCallback;
        this.zzd.zzg(fullScreenContentCallback);
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final void setImmersiveMode(boolean z10) {
        try {
            this.zzb.zzg(z10);
        } catch (RemoteException e10) {
            zzcfi.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        this.zze = onPaidEventListener;
        try {
            this.zzb.zzh(new com.google.android.gms.ads.internal.client.zzey(onPaidEventListener));
        } catch (RemoteException e10) {
            zzcfi.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final void show(Activity activity) {
        try {
            this.zzb.zzi(ObjectWrapper.wrap(activity), this.zzd);
        } catch (RemoteException e10) {
            zzcfi.zzl("#007 Could not call remote method.", e10);
        }
    }
}
