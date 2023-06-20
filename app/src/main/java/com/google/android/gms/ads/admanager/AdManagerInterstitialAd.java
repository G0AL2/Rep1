package com.google.android.gms.ads.admanager;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzbjn;
import com.google.android.gms.internal.ads.zzbrc;
import com.google.android.gms.internal.ads.zzbyy;
import com.google.android.gms.internal.ads.zzcex;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class AdManagerInterstitialAd extends InterstitialAd {
    public static void load(final Context context, final String str, final AdManagerAdRequest adManagerAdRequest, final AdManagerInterstitialAdLoadCallback adManagerInterstitialAdLoadCallback) {
        Preconditions.checkNotNull(context, "Context cannot be null.");
        Preconditions.checkNotNull(str, "AdUnitId cannot be null.");
        Preconditions.checkNotNull(adManagerAdRequest, "AdManagerAdRequest cannot be null.");
        Preconditions.checkNotNull(adManagerInterstitialAdLoadCallback, "LoadCallback cannot be null.");
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzbhz.zzc(context);
        if (((Boolean) zzbjn.zzf.zze()).booleanValue()) {
            if (((Boolean) zzay.zzc().zzb(zzbhz.zziv)).booleanValue()) {
                zzcex.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.admanager.zzc
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        AdManagerAdRequest adManagerAdRequest2 = adManagerAdRequest;
                        try {
                            new zzbrc(context2, str2).zza(adManagerAdRequest2.zza(), adManagerInterstitialAdLoadCallback);
                        } catch (IllegalStateException e10) {
                            zzbyy.zza(context2).zzd(e10, "AdManagerInterstitialAd.load");
                        }
                    }
                });
                return;
            }
        }
        new zzbrc(context, str).zza(adManagerAdRequest.zza(), adManagerInterstitialAdLoadCallback);
    }

    public abstract AppEventListener getAppEventListener();

    public abstract void setAppEventListener(AppEventListener appEventListener);
}
