package k7;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.ads.Ad;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdView;
import com.facebook.ads.ExtraHints;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;

/* compiled from: FacebookRtbBannerAd.java */
/* loaded from: classes2.dex */
public class a implements MediationBannerAd, AdListener {

    /* renamed from: a  reason: collision with root package name */
    private final MediationBannerAdConfiguration f33162a;

    /* renamed from: b  reason: collision with root package name */
    private final MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> f33163b;

    /* renamed from: c  reason: collision with root package name */
    private AdView f33164c;

    /* renamed from: d  reason: collision with root package name */
    private FrameLayout f33165d;

    /* renamed from: e  reason: collision with root package name */
    private MediationBannerAdCallback f33166e;

    public a(MediationBannerAdConfiguration mediationBannerAdConfiguration, MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        this.f33162a = mediationBannerAdConfiguration;
        this.f33163b = mediationAdLoadCallback;
    }

    public void a() {
        String placementID = FacebookMediationAdapter.getPlacementID(this.f33162a.getServerParameters());
        if (TextUtils.isEmpty(placementID)) {
            AdError adError = new AdError(101, "Failed to request ad. PlacementID is null or empty.", FacebookMediationAdapter.ERROR_DOMAIN);
            Log.e(FacebookMediationAdapter.TAG, adError.getMessage());
            this.f33163b.onFailure(adError);
            return;
        }
        FacebookMediationAdapter.setMixedAudience(this.f33162a);
        try {
            this.f33164c = new AdView(this.f33162a.getContext(), placementID, this.f33162a.getBidResponse());
            if (!TextUtils.isEmpty(this.f33162a.getWatermark())) {
                this.f33164c.setExtraHints(new ExtraHints.Builder().mediationData(this.f33162a.getWatermark()).build());
            }
            Context context = this.f33162a.getContext();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f33162a.getAdSize().getWidthInPixels(context), -2);
            this.f33165d = new FrameLayout(context);
            this.f33164c.setLayoutParams(layoutParams);
            this.f33165d.addView(this.f33164c);
            AdView adView = this.f33164c;
            adView.loadAd(adView.buildLoadAdConfig().withAdListener(this).withBid(this.f33162a.getBidResponse()).build());
        } catch (Exception e10) {
            AdError adError2 = new AdError(111, "Failed to create banner ad: " + e10.getMessage(), FacebookMediationAdapter.ERROR_DOMAIN);
            Log.e(FacebookMediationAdapter.TAG, adError2.getMessage());
            this.f33163b.onFailure(adError2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAd
    public View getView() {
        return this.f33165d;
    }

    @Override // com.facebook.ads.AdListener
    public void onAdClicked(Ad ad2) {
        MediationBannerAdCallback mediationBannerAdCallback = this.f33166e;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdClicked();
            this.f33166e.onAdOpened();
            this.f33166e.onAdLeftApplication();
        }
    }

    @Override // com.facebook.ads.AdListener
    public void onAdLoaded(Ad ad2) {
        this.f33166e = this.f33163b.onSuccess(this);
    }

    @Override // com.facebook.ads.AdListener
    public void onError(Ad ad2, com.facebook.ads.AdError adError) {
        AdError adError2 = FacebookMediationAdapter.getAdError(adError);
        Log.w(FacebookMediationAdapter.TAG, adError2.getMessage());
        this.f33163b.onFailure(adError2);
    }

    @Override // com.facebook.ads.AdListener
    public void onLoggingImpression(Ad ad2) {
        MediationBannerAdCallback mediationBannerAdCallback = this.f33166e;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdImpression();
        }
    }
}
