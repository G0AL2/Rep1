package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzelj extends com.google.android.gms.ads.internal.client.zzbr {
    private final Context zza;
    private final com.google.android.gms.ads.internal.client.zzbf zzb;
    private final zzfcd zzc;
    private final zzcvv zzd;
    private final ViewGroup zze;

    public zzelj(Context context, com.google.android.gms.ads.internal.client.zzbf zzbfVar, zzfcd zzfcdVar, zzcvv zzcvvVar) {
        this.zza = context;
        this.zzb = zzbfVar;
        this.zzc = zzfcdVar;
        this.zzd = zzcvvVar;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.removeAllViews();
        View zzc = zzcvvVar.zzc();
        com.google.android.gms.ads.internal.zzt.zzp();
        frameLayout.addView(zzc, com.google.android.gms.ads.internal.util.zzs.zzn());
        frameLayout.setMinimumHeight(zzg().zzc);
        frameLayout.setMinimumWidth(zzg().zzf);
        this.zze = frameLayout;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzA() throws RemoteException {
        this.zzd.zzg();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzB() throws RemoteException {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.zzd.zzm().zzc(null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzC(com.google.android.gms.ads.internal.client.zzbc zzbcVar) throws RemoteException {
        zzcfi.zzi("setAdClickListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzD(com.google.android.gms.ads.internal.client.zzbf zzbfVar) throws RemoteException {
        zzcfi.zzi("setAdListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzE(com.google.android.gms.ads.internal.client.zzbw zzbwVar) throws RemoteException {
        zzcfi.zzi("setAdMetadataListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzF(com.google.android.gms.ads.internal.client.zzq zzqVar) throws RemoteException {
        Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
        zzcvv zzcvvVar = this.zzd;
        if (zzcvvVar != null) {
            zzcvvVar.zzh(this.zze, zzqVar);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzG(com.google.android.gms.ads.internal.client.zzbz zzbzVar) throws RemoteException {
        zzemh zzemhVar = this.zzc.zzc;
        if (zzemhVar != null) {
            zzemhVar.zzi(zzbzVar);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzH(zzbcj zzbcjVar) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzI(com.google.android.gms.ads.internal.client.zzw zzwVar) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzJ(com.google.android.gms.ads.internal.client.zzcg zzcgVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzK(com.google.android.gms.ads.internal.client.zzdo zzdoVar) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzL(boolean z10) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzM(zzbye zzbyeVar) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzN(boolean z10) throws RemoteException {
        zzcfi.zzi("setManualImpressionsEnabled is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzO(zzbiu zzbiuVar) throws RemoteException {
        zzcfi.zzi("setOnCustomRenderedAdLoadedListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzP(com.google.android.gms.ads.internal.client.zzde zzdeVar) {
        zzcfi.zzi("setOnPaidEventListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzQ(zzbyh zzbyhVar, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzR(String str) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzS(zzcar zzcarVar) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzT(String str) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzU(com.google.android.gms.ads.internal.client.zzff zzffVar) throws RemoteException {
        zzcfi.zzi("setVideoOptions is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzW(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzX() throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final boolean zzY() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final boolean zzZ() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final boolean zzaa(com.google.android.gms.ads.internal.client.zzl zzlVar) throws RemoteException {
        zzcfi.zzi("loadAd is not supported for an Ad Manager AdView returned from AdLoader.");
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzab(com.google.android.gms.ads.internal.client.zzcd zzcdVar) throws RemoteException {
        zzcfi.zzi("setCorrelationIdProvider is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final Bundle zzd() throws RemoteException {
        zzcfi.zzi("getAdMetadata is not supported in Ad Manager AdView returned by AdLoader.");
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final com.google.android.gms.ads.internal.client.zzq zzg() {
        Preconditions.checkMainThread("getAdSize must be called on the main UI thread.");
        return zzfch.zza(this.zza, Collections.singletonList(this.zzd.zze()));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final com.google.android.gms.ads.internal.client.zzbf zzi() throws RemoteException {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final com.google.android.gms.ads.internal.client.zzbz zzj() throws RemoteException {
        return this.zzc.zzn;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final com.google.android.gms.ads.internal.client.zzdh zzk() {
        return this.zzd.zzl();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final com.google.android.gms.ads.internal.client.zzdk zzl() throws RemoteException {
        return this.zzd.zzd();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final IObjectWrapper zzn() throws RemoteException {
        return ObjectWrapper.wrap(this.zze);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final String zzr() throws RemoteException {
        return this.zzc.zzf;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final String zzs() throws RemoteException {
        if (this.zzd.zzl() != null) {
            return this.zzd.zzl().zzg();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final String zzt() throws RemoteException {
        if (this.zzd.zzl() != null) {
            return this.zzd.zzl().zzg();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzx() throws RemoteException {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.zzd.zzV();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzy(com.google.android.gms.ads.internal.client.zzl zzlVar, com.google.android.gms.ads.internal.client.zzbi zzbiVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzz() throws RemoteException {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.zzd.zzm().zzb(null);
    }
}
