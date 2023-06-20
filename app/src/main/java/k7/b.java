package k7;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.ads.Ad;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdExtendedListener;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: FacebookRtbInterstitialAd.java */
/* loaded from: classes2.dex */
public class b implements MediationInterstitialAd, InterstitialAdExtendedListener {

    /* renamed from: a  reason: collision with root package name */
    private final MediationInterstitialAdConfiguration f33167a;

    /* renamed from: b  reason: collision with root package name */
    private final MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> f33168b;

    /* renamed from: c  reason: collision with root package name */
    private InterstitialAd f33169c;

    /* renamed from: d  reason: collision with root package name */
    private MediationInterstitialAdCallback f33170d;

    /* renamed from: e  reason: collision with root package name */
    private final AtomicBoolean f33171e = new AtomicBoolean();

    /* renamed from: f  reason: collision with root package name */
    private final AtomicBoolean f33172f = new AtomicBoolean();

    public b(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        this.f33167a = mediationInterstitialAdConfiguration;
        this.f33168b = mediationAdLoadCallback;
    }

    public void a() {
        String placementID = FacebookMediationAdapter.getPlacementID(this.f33167a.getServerParameters());
        if (TextUtils.isEmpty(placementID)) {
            AdError adError = new AdError(101, "Failed to request ad. PlacementID is null or empty. ", FacebookMediationAdapter.ERROR_DOMAIN);
            Log.e(FacebookMediationAdapter.TAG, adError.getMessage());
            this.f33168b.onFailure(adError);
            return;
        }
        FacebookMediationAdapter.setMixedAudience(this.f33167a);
        this.f33169c = new InterstitialAd(this.f33167a.getContext(), placementID);
        if (!TextUtils.isEmpty(this.f33167a.getWatermark())) {
            this.f33169c.setExtraHints(new ExtraHints.Builder().mediationData(this.f33167a.getWatermark()).build());
        }
        InterstitialAd interstitialAd = this.f33169c;
        interstitialAd.loadAd(interstitialAd.buildLoadAdConfig().withBid(this.f33167a.getBidResponse()).withAdListener(this).build());
    }

    @Override // com.facebook.ads.AdListener
    public void onAdClicked(Ad ad2) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f33170d;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.reportAdClicked();
            this.f33170d.onAdLeftApplication();
        }
    }

    @Override // com.facebook.ads.AdListener
    public void onAdLoaded(Ad ad2) {
        this.f33170d = this.f33168b.onSuccess(this);
    }

    @Override // com.facebook.ads.AdListener
    public void onError(Ad ad2, com.facebook.ads.AdError adError) {
        AdError adError2 = FacebookMediationAdapter.getAdError(adError);
        Log.w(FacebookMediationAdapter.TAG, adError2.getMessage());
        if (this.f33171e.get()) {
            MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f33170d;
            if (mediationInterstitialAdCallback != null) {
                mediationInterstitialAdCallback.onAdOpened();
                this.f33170d.onAdClosed();
                return;
            }
            return;
        }
        this.f33168b.onFailure(adError2);
    }

    @Override // com.facebook.ads.InterstitialAdExtendedListener
    public void onInterstitialActivityDestroyed() {
        MediationInterstitialAdCallback mediationInterstitialAdCallback;
        if (this.f33172f.getAndSet(true) || (mediationInterstitialAdCallback = this.f33170d) == null) {
            return;
        }
        mediationInterstitialAdCallback.onAdClosed();
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public void onInterstitialDismissed(Ad ad2) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback;
        if (this.f33172f.getAndSet(true) || (mediationInterstitialAdCallback = this.f33170d) == null) {
            return;
        }
        mediationInterstitialAdCallback.onAdClosed();
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public void onInterstitialDisplayed(Ad ad2) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f33170d;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdOpened();
        }
    }

    @Override // com.facebook.ads.AdListener
    public void onLoggingImpression(Ad ad2) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f33170d;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.reportAdImpression();
        }
    }

    @Override // com.facebook.ads.RewardedAdListener
    public void onRewardedAdCompleted() {
    }

    @Override // com.facebook.ads.RewardedAdListener
    public void onRewardedAdServerFailed() {
    }

    @Override // com.facebook.ads.RewardedAdListener
    public void onRewardedAdServerSucceeded() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public void showAd(Context context) {
        this.f33171e.set(true);
        if (this.f33169c.show()) {
            return;
        }
        AdError adError = new AdError(110, "Failed to present interstitial ad.", FacebookMediationAdapter.ERROR_DOMAIN);
        Log.w(FacebookMediationAdapter.TAG, adError.toString());
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f33170d;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdFailedToShow(adError);
        }
    }
}
