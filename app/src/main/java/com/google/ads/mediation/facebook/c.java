package com.google.ads.mediation.facebook;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.ads.Ad;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdExtendedListener;
import com.google.ads.mediation.facebook.a;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: FacebookRewardedAd.java */
/* loaded from: classes2.dex */
public class c implements MediationRewardedAd, RewardedVideoAdExtendedListener {

    /* renamed from: a  reason: collision with root package name */
    private final MediationRewardedAdConfiguration f20542a;

    /* renamed from: b  reason: collision with root package name */
    private final MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> f20543b;

    /* renamed from: c  reason: collision with root package name */
    private RewardedVideoAd f20544c;

    /* renamed from: e  reason: collision with root package name */
    private MediationRewardedAdCallback f20546e;

    /* renamed from: d  reason: collision with root package name */
    private final AtomicBoolean f20545d = new AtomicBoolean();

    /* renamed from: f  reason: collision with root package name */
    private boolean f20547f = false;

    /* renamed from: g  reason: collision with root package name */
    private final AtomicBoolean f20548g = new AtomicBoolean();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FacebookRewardedAd.java */
    /* loaded from: classes2.dex */
    public class a implements a.InterfaceC0276a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f20549a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f20550b;

        a(Context context, String str) {
            this.f20549a = context;
            this.f20550b = str;
        }

        @Override // com.google.ads.mediation.facebook.a.InterfaceC0276a
        public void a(AdError adError) {
            Log.w(FacebookMediationAdapter.TAG, adError.getMessage());
            if (c.this.f20543b != null) {
                c.this.f20543b.onFailure(adError);
            }
        }

        @Override // com.google.ads.mediation.facebook.a.InterfaceC0276a
        public void b() {
            c.this.c(this.f20549a, this.f20550b);
        }
    }

    public c(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        this.f20542a = mediationRewardedAdConfiguration;
        this.f20543b = mediationAdLoadCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Context context, String str) {
        RewardedVideoAd rewardedVideoAd = new RewardedVideoAd(context, str);
        this.f20544c = rewardedVideoAd;
        rewardedVideoAd.loadAd(rewardedVideoAd.buildLoadAdConfig().withAdListener(this).withAdExperience(d()).build());
    }

    AdExperienceType d() {
        return AdExperienceType.AD_EXPERIENCE_TYPE_REWARDED;
    }

    public void e() {
        Context context = this.f20542a.getContext();
        String placementID = FacebookMediationAdapter.getPlacementID(this.f20542a.getServerParameters());
        if (TextUtils.isEmpty(placementID)) {
            AdError adError = new AdError(101, "Failed to request ad. PlacementID is null or empty.", FacebookMediationAdapter.ERROR_DOMAIN);
            Log.e(FacebookMediationAdapter.TAG, adError.getMessage());
            this.f20543b.onFailure(adError);
            return;
        }
        String bidResponse = this.f20542a.getBidResponse();
        if (!TextUtils.isEmpty(bidResponse)) {
            this.f20547f = true;
        }
        FacebookMediationAdapter.setMixedAudience(this.f20542a);
        if (this.f20547f) {
            this.f20544c = new RewardedVideoAd(context, placementID);
            if (!TextUtils.isEmpty(this.f20542a.getWatermark())) {
                this.f20544c.setExtraHints(new ExtraHints.Builder().mediationData(this.f20542a.getWatermark()).build());
            }
            RewardedVideoAd rewardedVideoAd = this.f20544c;
            rewardedVideoAd.loadAd(rewardedVideoAd.buildLoadAdConfig().withAdListener(this).withBid(bidResponse).withAdExperience(d()).build());
            return;
        }
        com.google.ads.mediation.facebook.a.a().b(context, placementID, new a(context, placementID));
    }

    @Override // com.facebook.ads.AdListener
    public void onAdClicked(Ad ad2) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f20546e;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.reportAdClicked();
        }
    }

    @Override // com.facebook.ads.AdListener
    public void onAdLoaded(Ad ad2) {
        MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback = this.f20543b;
        if (mediationAdLoadCallback != null) {
            this.f20546e = mediationAdLoadCallback.onSuccess(this);
        }
    }

    @Override // com.facebook.ads.AdListener
    public void onError(Ad ad2, com.facebook.ads.AdError adError) {
        AdError adError2 = FacebookMediationAdapter.getAdError(adError);
        if (this.f20545d.get()) {
            Log.w(FacebookMediationAdapter.TAG, adError2.getMessage());
            MediationRewardedAdCallback mediationRewardedAdCallback = this.f20546e;
            if (mediationRewardedAdCallback != null) {
                mediationRewardedAdCallback.onAdFailedToShow(adError2);
            }
        } else {
            Log.w(FacebookMediationAdapter.TAG, adError2.getMessage());
            MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback = this.f20543b;
            if (mediationAdLoadCallback != null) {
                mediationAdLoadCallback.onFailure(adError2);
            }
        }
        this.f20544c.destroy();
    }

    @Override // com.facebook.ads.AdListener
    public void onLoggingImpression(Ad ad2) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f20546e;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.reportAdImpression();
        }
    }

    @Override // com.facebook.ads.RewardedVideoAdExtendedListener
    public void onRewardedVideoActivityDestroyed() {
        MediationRewardedAdCallback mediationRewardedAdCallback;
        if (!this.f20548g.getAndSet(true) && (mediationRewardedAdCallback = this.f20546e) != null) {
            mediationRewardedAdCallback.onAdClosed();
        }
        RewardedVideoAd rewardedVideoAd = this.f20544c;
        if (rewardedVideoAd != null) {
            rewardedVideoAd.destroy();
        }
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public void onRewardedVideoClosed() {
        MediationRewardedAdCallback mediationRewardedAdCallback;
        if (!this.f20548g.getAndSet(true) && (mediationRewardedAdCallback = this.f20546e) != null) {
            mediationRewardedAdCallback.onAdClosed();
        }
        RewardedVideoAd rewardedVideoAd = this.f20544c;
        if (rewardedVideoAd != null) {
            rewardedVideoAd.destroy();
        }
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public void onRewardedVideoCompleted() {
        this.f20546e.onVideoComplete();
        this.f20546e.onUserEarnedReward(new b());
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(Context context) {
        this.f20545d.set(true);
        if (!this.f20544c.show()) {
            AdError adError = new AdError(110, "Failed to present rewarded ad.", FacebookMediationAdapter.ERROR_DOMAIN);
            Log.w(FacebookMediationAdapter.TAG, adError.getMessage());
            MediationRewardedAdCallback mediationRewardedAdCallback = this.f20546e;
            if (mediationRewardedAdCallback != null) {
                mediationRewardedAdCallback.onAdFailedToShow(adError);
            }
            this.f20544c.destroy();
            return;
        }
        MediationRewardedAdCallback mediationRewardedAdCallback2 = this.f20546e;
        if (mediationRewardedAdCallback2 != null) {
            mediationRewardedAdCallback2.onVideoStart();
            this.f20546e.onAdOpened();
        }
    }
}
