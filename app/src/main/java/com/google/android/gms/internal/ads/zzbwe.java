package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbSignalData;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.vehiclecloud.app.videofetch.rnads.api.RNAdsEvents;
import fm.castbox.mediation.widget.AdView;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbwe extends zzbvs {
    private final RtbAdapter zza;
    private MediationInterstitialAd zzb;
    private MediationRewardedAd zzc;
    private String zzd = "";

    public zzbwe(RtbAdapter rtbAdapter) {
        this.zza = rtbAdapter;
    }

    private final Bundle zzs(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        Bundle bundle;
        Bundle bundle2 = zzlVar.zzm;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.zza.getClass().getName())) == null) ? new Bundle() : bundle;
    }

    private static final Bundle zzt(String str) throws RemoteException {
        zzcfi.zzj("Server parameters: ".concat(String.valueOf(str)));
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    bundle2.putString(next, jSONObject.getString(next));
                }
                return bundle2;
            }
            return bundle;
        } catch (JSONException e10) {
            zzcfi.zzh("", e10);
            throw new RemoteException();
        }
    }

    private static final boolean zzu(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        if (zzlVar.zzf) {
            return true;
        }
        com.google.android.gms.ads.internal.client.zzaw.zzb();
        return zzcfb.zzq();
    }

    private static final String zzv(String str, com.google.android.gms.ads.internal.client.zzl zzlVar) {
        String str2 = zzlVar.zzu;
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return str2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvt
    public final com.google.android.gms.ads.internal.client.zzdk zze() {
        RtbAdapter rtbAdapter = this.zza;
        if (rtbAdapter instanceof com.google.android.gms.ads.mediation.zzb) {
            try {
                return ((com.google.android.gms.ads.mediation.zzb) rtbAdapter).getVideoController();
            } catch (Throwable th) {
                zzcfi.zzh("", th);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvt
    public final zzbwg zzf() throws RemoteException {
        return zzbwg.zza(this.zza.getVersionInfo());
    }

    @Override // com.google.android.gms.internal.ads.zzbvt
    public final zzbwg zzg() throws RemoteException {
        return zzbwg.zza(this.zza.getSDKVersionInfo());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzbvt
    public final void zzh(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, com.google.android.gms.ads.internal.client.zzq zzqVar, zzbvw zzbvwVar) throws RemoteException {
        char c10;
        AdFormat adFormat;
        try {
            zzbwc zzbwcVar = new zzbwc(this, zzbvwVar);
            RtbAdapter rtbAdapter = this.zza;
            switch (str.hashCode()) {
                case -1396342996:
                    if (str.equals(AdView.AdType.BANNER)) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1052618729:
                    if (str.equals("native")) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -239580146:
                    if (str.equals(RNAdsEvents.EVENT_REWARDED)) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 604727084:
                    if (str.equals("interstitial")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1911491517:
                    if (str.equals("rewarded_interstitial")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            if (c10 == 0) {
                adFormat = AdFormat.BANNER;
            } else if (c10 == 1) {
                adFormat = AdFormat.INTERSTITIAL;
            } else if (c10 == 2) {
                adFormat = AdFormat.REWARDED;
            } else if (c10 == 3) {
                adFormat = AdFormat.REWARDED_INTERSTITIAL;
            } else if (c10 == 4) {
                adFormat = AdFormat.NATIVE;
            } else {
                throw new IllegalArgumentException("Internal Error");
            }
            MediationConfiguration mediationConfiguration = new MediationConfiguration(adFormat, bundle2);
            ArrayList arrayList = new ArrayList();
            arrayList.add(mediationConfiguration);
            rtbAdapter.collectSignals(new RtbSignalData((Context) ObjectWrapper.unwrap(iObjectWrapper), arrayList, bundle, com.google.android.gms.ads.zzb.zzc(zzqVar.zze, zzqVar.zzb, zzqVar.zza)), zzbwcVar);
        } catch (Throwable th) {
            zzcfi.zzh("Error generating signals for RTB", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvt
    public final void zzi(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbvh zzbvhVar, zzbug zzbugVar, com.google.android.gms.ads.internal.client.zzq zzqVar) throws RemoteException {
        try {
            this.zza.loadRtbBannerAd(new MediationBannerAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzt(str2), zzs(zzlVar), zzu(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, zzv(str2, zzlVar), com.google.android.gms.ads.zzb.zzc(zzqVar.zze, zzqVar.zzb, zzqVar.zza), this.zzd), new zzbvy(this, zzbvhVar, zzbugVar));
        } catch (Throwable th) {
            zzcfi.zzh("Adapter failed to render banner ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvt
    public final void zzj(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbvh zzbvhVar, zzbug zzbugVar, com.google.android.gms.ads.internal.client.zzq zzqVar) throws RemoteException {
        try {
            this.zza.loadRtbInterscrollerAd(new MediationBannerAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzt(str2), zzs(zzlVar), zzu(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, zzv(str2, zzlVar), com.google.android.gms.ads.zzb.zzc(zzqVar.zze, zzqVar.zzb, zzqVar.zza), this.zzd), new zzbvz(this, zzbvhVar, zzbugVar));
        } catch (Throwable th) {
            zzcfi.zzh("Adapter failed to render interscroller ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvt
    public final void zzk(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbvk zzbvkVar, zzbug zzbugVar) throws RemoteException {
        try {
            this.zza.loadRtbInterstitialAd(new MediationInterstitialAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzt(str2), zzs(zzlVar), zzu(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, zzv(str2, zzlVar), this.zzd), new zzbwa(this, zzbvkVar, zzbugVar));
        } catch (Throwable th) {
            zzcfi.zzh("Adapter failed to render interstitial ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvt
    public final void zzl(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbvn zzbvnVar, zzbug zzbugVar) throws RemoteException {
        zzm(str, str2, zzlVar, iObjectWrapper, zzbvnVar, zzbugVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbvt
    public final void zzm(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbvn zzbvnVar, zzbug zzbugVar, zzbkp zzbkpVar) throws RemoteException {
        try {
            this.zza.loadRtbNativeAd(new MediationNativeAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzt(str2), zzs(zzlVar), zzu(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, zzv(str2, zzlVar), this.zzd, zzbkpVar), new zzbwb(this, zzbvnVar, zzbugVar));
        } catch (Throwable th) {
            zzcfi.zzh("Adapter failed to render native ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvt
    public final void zzn(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbvq zzbvqVar, zzbug zzbugVar) throws RemoteException {
        try {
            this.zza.loadRtbRewardedInterstitialAd(new MediationRewardedAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzt(str2), zzs(zzlVar), zzu(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, zzv(str2, zzlVar), this.zzd), new zzbwd(this, zzbvqVar, zzbugVar));
        } catch (Throwable th) {
            zzcfi.zzh("Adapter failed to render rewarded interstitial ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvt
    public final void zzo(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbvq zzbvqVar, zzbug zzbugVar) throws RemoteException {
        try {
            this.zza.loadRtbRewardedAd(new MediationRewardedAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzt(str2), zzs(zzlVar), zzu(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, zzv(str2, zzlVar), this.zzd), new zzbwd(this, zzbvqVar, zzbugVar));
        } catch (Throwable th) {
            zzcfi.zzh("Adapter failed to render rewarded ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvt
    public final void zzp(String str) {
        this.zzd = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbvt
    public final boolean zzq(IObjectWrapper iObjectWrapper) throws RemoteException {
        MediationInterstitialAd mediationInterstitialAd = this.zzb;
        if (mediationInterstitialAd != null) {
            try {
                mediationInterstitialAd.showAd((Context) ObjectWrapper.unwrap(iObjectWrapper));
                return true;
            } catch (Throwable th) {
                zzcfi.zzh("", th);
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbvt
    public final boolean zzr(IObjectWrapper iObjectWrapper) throws RemoteException {
        MediationRewardedAd mediationRewardedAd = this.zzc;
        if (mediationRewardedAd != null) {
            try {
                mediationRewardedAd.showAd((Context) ObjectWrapper.unwrap(iObjectWrapper));
                return true;
            } catch (Throwable th) {
                zzcfi.zzh("", th);
                return true;
            }
        }
        return false;
    }
}
