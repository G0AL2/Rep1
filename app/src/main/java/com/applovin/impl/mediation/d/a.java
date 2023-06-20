package com.applovin.impl.mediation.d;

import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.utils.j;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;

/* loaded from: classes.dex */
public class a implements a.InterfaceC0115a, MaxAdListener, MaxAdRevenueListener, MaxAdViewAdListener, MaxRewardedAdListener {

    /* renamed from: a  reason: collision with root package name */
    private final a.InterfaceC0115a f7436a;

    public a(a.InterfaceC0115a interfaceC0115a) {
        this.f7436a = interfaceC0115a;
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdClicked(MaxAd maxAd) {
        j.d(this.f7436a, maxAd);
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdCollapsed(MaxAd maxAd) {
        j.h(this.f7436a, maxAd);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        j.a(this.f7436a, maxAd, maxError);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayed(MaxAd maxAd) {
        j.b(this.f7436a, maxAd);
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdExpanded(MaxAd maxAd) {
        j.g(this.f7436a, maxAd);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdHidden(MaxAd maxAd) {
        j.c(this.f7436a, maxAd);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoadFailed(String str, MaxError maxError) {
        j.a(this.f7436a, str, maxError);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoaded(MaxAd maxAd) {
        j.a((MaxAdListener) this.f7436a, maxAd);
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(MaxAd maxAd) {
        j.a((MaxAdRevenueListener) this.f7436a, maxAd);
    }

    @Override // com.applovin.mediation.MaxRewardedAdListener
    public void onRewardedVideoCompleted(MaxAd maxAd) {
        j.f(this.f7436a, maxAd);
    }

    @Override // com.applovin.mediation.MaxRewardedAdListener
    public void onRewardedVideoStarted(MaxAd maxAd) {
        j.e(this.f7436a, maxAd);
    }

    @Override // com.applovin.mediation.MaxRewardedAdListener
    public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
        j.a(this.f7436a, maxAd, maxReward);
    }
}
