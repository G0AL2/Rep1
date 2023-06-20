package com.inmobi.ads.listeners;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiInterstitial;
import com.inmobi.media.bs;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class InterstitialAdEventListener extends bs<InMobiInterstitial> {
    @Override // com.inmobi.media.bs
    public /* bridge */ /* synthetic */ void onAdClicked(InMobiInterstitial inMobiInterstitial, Map map) {
        super.onAdClicked(inMobiInterstitial, map);
    }

    public void onAdDismissed(InMobiInterstitial inMobiInterstitial) {
    }

    public void onAdDisplayFailed(InMobiInterstitial inMobiInterstitial) {
    }

    @Deprecated
    public void onAdDisplayed(InMobiInterstitial inMobiInterstitial) {
    }

    public void onAdDisplayed(InMobiInterstitial inMobiInterstitial, AdMetaInfo adMetaInfo) {
    }

    public void onAdFetchFailed(InMobiInterstitial inMobiInterstitial, InMobiAdRequestStatus inMobiAdRequestStatus) {
    }

    @Override // com.inmobi.media.bs
    public /* bridge */ /* synthetic */ void onAdFetchSuccessful(InMobiInterstitial inMobiInterstitial, AdMetaInfo adMetaInfo) {
        super.onAdFetchSuccessful(inMobiInterstitial, adMetaInfo);
    }

    @Override // com.inmobi.media.bs
    public /* bridge */ /* synthetic */ void onAdLoadFailed(InMobiInterstitial inMobiInterstitial, InMobiAdRequestStatus inMobiAdRequestStatus) {
        super.onAdLoadFailed(inMobiInterstitial, inMobiAdRequestStatus);
    }

    @Override // com.inmobi.media.bs
    @Deprecated
    public /* bridge */ /* synthetic */ void onAdLoadSucceeded(InMobiInterstitial inMobiInterstitial) {
        super.onAdLoadSucceeded(inMobiInterstitial);
    }

    @Deprecated
    public void onAdReceived(InMobiInterstitial inMobiInterstitial) {
    }

    public void onAdWillDisplay(InMobiInterstitial inMobiInterstitial) {
    }

    @Override // com.inmobi.media.bs
    public /* bridge */ /* synthetic */ void onRequestPayloadCreated(byte[] bArr) {
        super.onRequestPayloadCreated(bArr);
    }

    @Override // com.inmobi.media.bs
    public /* bridge */ /* synthetic */ void onRequestPayloadCreationFailed(InMobiAdRequestStatus inMobiAdRequestStatus) {
        super.onRequestPayloadCreationFailed(inMobiAdRequestStatus);
    }

    public void onRewardsUnlocked(InMobiInterstitial inMobiInterstitial, Map<Object, Object> map) {
    }

    public void onUserLeftApplication(InMobiInterstitial inMobiInterstitial) {
    }

    @Override // com.inmobi.media.bs
    public /* bridge */ /* synthetic */ void onAdLoadSucceeded(InMobiInterstitial inMobiInterstitial, AdMetaInfo adMetaInfo) {
        super.onAdLoadSucceeded(inMobiInterstitial, adMetaInfo);
    }
}
