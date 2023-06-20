package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzelo extends com.google.android.gms.ads.internal.client.zzbr implements zzdej {
    private final Context zza;
    private final zzexv zzb;
    private final String zzc;
    private final zzemh zzd;
    private com.google.android.gms.ads.internal.client.zzq zze;
    private final zzfcb zzf;
    private final zzcfo zzg;
    private zzcvv zzh;

    public zzelo(Context context, com.google.android.gms.ads.internal.client.zzq zzqVar, String str, zzexv zzexvVar, zzemh zzemhVar, zzcfo zzcfoVar) {
        this.zza = context;
        this.zzb = zzexvVar;
        this.zze = zzqVar;
        this.zzc = str;
        this.zzd = zzemhVar;
        this.zzf = zzexvVar.zzi();
        this.zzg = zzcfoVar;
        zzexvVar.zzp(this);
    }

    private final synchronized void zze(com.google.android.gms.ads.internal.client.zzq zzqVar) {
        this.zzf.zzr(zzqVar);
        this.zzf.zzw(this.zze.zzn);
    }

    private final synchronized boolean zzf(com.google.android.gms.ads.internal.client.zzl zzlVar) throws RemoteException {
        if (zzh()) {
            Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        }
        com.google.android.gms.ads.internal.zzt.zzp();
        if (com.google.android.gms.ads.internal.util.zzs.zzD(this.zza) && zzlVar.zzs == null) {
            zzcfi.zzg("Failed to load the ad because app ID is missing.");
            zzemh zzemhVar = this.zzd;
            if (zzemhVar != null) {
                zzemhVar.zza(zzfdc.zzd(4, null, null));
            }
            return false;
        }
        zzfcx.zza(this.zza, zzlVar.zzf);
        return this.zzb.zzb(zzlVar, this.zzc, null, new zzeln(this));
    }

    private final boolean zzh() {
        boolean z10;
        if (((Boolean) zzbjn.zze.zze()).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zziv)).booleanValue()) {
                z10 = true;
                return this.zzg.zzc >= ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zziw)).intValue() || !z10;
            }
        }
        z10 = false;
        if (this.zzg.zzc >= ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zziw)).intValue()) {
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzA() {
        Preconditions.checkMainThread("recordManualImpression must be called on the main UI thread.");
        zzcvv zzcvvVar = this.zzh;
        if (zzcvvVar != null) {
            zzcvvVar.zzg();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzB() {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
        zzcvv zzcvvVar = this.zzh;
        if (zzcvvVar != null) {
            zzcvvVar.zzm().zzc(null);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzC(com.google.android.gms.ads.internal.client.zzbc zzbcVar) {
        if (zzh()) {
            Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        }
        this.zzb.zzo(zzbcVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzD(com.google.android.gms.ads.internal.client.zzbf zzbfVar) {
        if (zzh()) {
            Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        }
        this.zzd.zze(zzbfVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzE(com.google.android.gms.ads.internal.client.zzbw zzbwVar) {
        Preconditions.checkMainThread("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzF(com.google.android.gms.ads.internal.client.zzq zzqVar) {
        Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
        this.zzf.zzr(zzqVar);
        this.zze = zzqVar;
        zzcvv zzcvvVar = this.zzh;
        if (zzcvvVar != null) {
            zzcvvVar.zzh(this.zzb.zzd(), zzqVar);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzG(com.google.android.gms.ads.internal.client.zzbz zzbzVar) {
        if (zzh()) {
            Preconditions.checkMainThread("setAppEventListener must be called on the main UI thread.");
        }
        this.zzd.zzi(zzbzVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzH(zzbcj zzbcjVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzI(com.google.android.gms.ads.internal.client.zzw zzwVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzJ(com.google.android.gms.ads.internal.client.zzcg zzcgVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzK(com.google.android.gms.ads.internal.client.zzdo zzdoVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzL(boolean z10) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzM(zzbye zzbyeVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzN(boolean z10) {
        if (zzh()) {
            Preconditions.checkMainThread("setManualImpressionsEnabled must be called from the main thread.");
        }
        this.zzf.zzy(z10);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzO(zzbiu zzbiuVar) {
        Preconditions.checkMainThread("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.zzb.zzq(zzbiuVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzP(com.google.android.gms.ads.internal.client.zzde zzdeVar) {
        if (zzh()) {
            Preconditions.checkMainThread("setPaidEventListener must be called on the main UI thread.");
        }
        this.zzd.zzh(zzdeVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzQ(zzbyh zzbyhVar, String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzR(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzS(zzcar zzcarVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzT(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzU(com.google.android.gms.ads.internal.client.zzff zzffVar) {
        if (zzh()) {
            Preconditions.checkMainThread("setVideoOptions must be called on the main UI thread.");
        }
        this.zzf.zzF(zzffVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzW(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzX() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized boolean zzY() {
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final boolean zzZ() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzdej
    public final synchronized void zza() {
        if (this.zzb.zzr()) {
            com.google.android.gms.ads.internal.client.zzq zzg = this.zzf.zzg();
            zzcvv zzcvvVar = this.zzh;
            if (zzcvvVar != null && zzcvvVar.zzf() != null && this.zzf.zzO()) {
                zzg = zzfch.zza(this.zza, Collections.singletonList(this.zzh.zzf()));
            }
            zze(zzg);
            try {
                zzf(this.zzf.zze());
                return;
            } catch (RemoteException unused) {
                zzcfi.zzj("Failed to refresh the banner ad.");
                return;
            }
        }
        this.zzb.zzn();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized boolean zzaa(com.google.android.gms.ads.internal.client.zzl zzlVar) throws RemoteException {
        zze(this.zze);
        return zzf(zzlVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzab(com.google.android.gms.ads.internal.client.zzcd zzcdVar) {
        Preconditions.checkMainThread("setCorrelationIdProvider must be called on the main UI thread");
        this.zzf.zzQ(zzcdVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final Bundle zzd() {
        Preconditions.checkMainThread("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized com.google.android.gms.ads.internal.client.zzq zzg() {
        Preconditions.checkMainThread("getAdSize must be called on the main UI thread.");
        zzcvv zzcvvVar = this.zzh;
        if (zzcvvVar != null) {
            return zzfch.zza(this.zza, Collections.singletonList(zzcvvVar.zze()));
        }
        return this.zzf.zzg();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final com.google.android.gms.ads.internal.client.zzbf zzi() {
        return this.zzd.zzc();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final com.google.android.gms.ads.internal.client.zzbz zzj() {
        return this.zzd.zzd();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized com.google.android.gms.ads.internal.client.zzdh zzk() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzfK)).booleanValue()) {
            zzcvv zzcvvVar = this.zzh;
            if (zzcvvVar == null) {
                return null;
            }
            return zzcvvVar.zzl();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized com.google.android.gms.ads.internal.client.zzdk zzl() {
        Preconditions.checkMainThread("getVideoController must be called from the main thread.");
        zzcvv zzcvvVar = this.zzh;
        if (zzcvvVar != null) {
            return zzcvvVar.zzd();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final IObjectWrapper zzn() {
        if (zzh()) {
            Preconditions.checkMainThread("getAdFrame must be called on the main UI thread.");
        }
        return ObjectWrapper.wrap(this.zzb.zzd());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized String zzr() {
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized String zzs() {
        zzcvv zzcvvVar = this.zzh;
        if (zzcvvVar == null || zzcvvVar.zzl() == null) {
            return null;
        }
        return zzcvvVar.zzl().zzg();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized String zzt() {
        zzcvv zzcvvVar = this.zzh;
        if (zzcvvVar == null || zzcvvVar.zzl() == null) {
            return null;
        }
        return zzcvvVar.zzl().zzg();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzx() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        zzcvv zzcvvVar = this.zzh;
        if (zzcvvVar != null) {
            zzcvvVar.zzV();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzy(com.google.android.gms.ads.internal.client.zzl zzlVar, com.google.android.gms.ads.internal.client.zzbi zzbiVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzz() {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
        zzcvv zzcvvVar = this.zzh;
        if (zzcvvVar != null) {
            zzcvvVar.zzm().zzb(null);
        }
    }
}
