package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.browser.customtabs.d;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbwk implements MediationInterstitialAdapter {
    private Activity zza;
    private MediationInterstitialListener zzb;
    private Uri zzc;

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public final void onDestroy() {
        zzcfi.zze("Destroying AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public final void onPause() {
        zzcfi.zze("Pausing AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public final void onResume() {
        zzcfi.zze("Resuming AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void requestInterstitialAd(Context context, MediationInterstitialListener mediationInterstitialListener, Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.zzb = mediationInterstitialListener;
        if (mediationInterstitialListener == null) {
            zzcfi.zzj("Listener not set for mediation. Returning.");
        } else if (context instanceof Activity) {
            if (!zzbix.zzg(context)) {
                zzcfi.zzj("Default browser does not support custom tabs. Bailing out.");
                this.zzb.onAdFailedToLoad(this, 0);
                return;
            }
            String string = bundle.getString("tab_url");
            if (TextUtils.isEmpty(string)) {
                zzcfi.zzj("The tab_url retrieved from mediation metadata is empty. Bailing out.");
                this.zzb.onAdFailedToLoad(this, 0);
                return;
            }
            this.zza = (Activity) context;
            this.zzc = Uri.parse(string);
            this.zzb.onAdLoaded(this);
        } else {
            zzcfi.zzj("AdMobCustomTabs can only work with Activity context. Bailing out.");
            this.zzb.onAdFailedToLoad(this, 0);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void showInterstitial() {
        d a10 = new d.a().a();
        a10.f1796a.setData(this.zzc);
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzbwj(this, new AdOverlayInfoParcel(new com.google.android.gms.ads.internal.overlay.zzc(a10.f1796a, null), null, new zzbwi(this), null, new zzcfo(0, 0, false, false, false), null, null)));
        com.google.android.gms.ads.internal.zzt.zzo().zzo();
    }
}
