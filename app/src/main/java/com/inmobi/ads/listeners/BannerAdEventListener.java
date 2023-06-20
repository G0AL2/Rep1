package com.inmobi.ads.listeners;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.media.bs;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class BannerAdEventListener extends bs<InMobiBanner> {
    @Override // com.inmobi.media.bs
    public /* bridge */ /* synthetic */ void onAdClicked(InMobiBanner inMobiBanner, Map map) {
        super.onAdClicked(inMobiBanner, map);
    }

    public void onAdDismissed(InMobiBanner inMobiBanner) {
    }

    public void onAdDisplayed(InMobiBanner inMobiBanner) {
    }

    public void onAdFetchFailed(InMobiBanner inMobiBanner, InMobiAdRequestStatus inMobiAdRequestStatus) {
    }

    @Override // com.inmobi.media.bs
    public /* bridge */ /* synthetic */ void onAdFetchSuccessful(InMobiBanner inMobiBanner, AdMetaInfo adMetaInfo) {
        super.onAdFetchSuccessful(inMobiBanner, adMetaInfo);
    }

    @Override // com.inmobi.media.bs
    public /* bridge */ /* synthetic */ void onAdLoadFailed(InMobiBanner inMobiBanner, InMobiAdRequestStatus inMobiAdRequestStatus) {
        super.onAdLoadFailed(inMobiBanner, inMobiAdRequestStatus);
    }

    @Override // com.inmobi.media.bs
    @Deprecated
    public /* bridge */ /* synthetic */ void onAdLoadSucceeded(InMobiBanner inMobiBanner) {
        super.onAdLoadSucceeded(inMobiBanner);
    }

    @Override // com.inmobi.media.bs
    public /* bridge */ /* synthetic */ void onRequestPayloadCreated(byte[] bArr) {
        super.onRequestPayloadCreated(bArr);
    }

    @Override // com.inmobi.media.bs
    public /* bridge */ /* synthetic */ void onRequestPayloadCreationFailed(InMobiAdRequestStatus inMobiAdRequestStatus) {
        super.onRequestPayloadCreationFailed(inMobiAdRequestStatus);
    }

    public void onRewardsUnlocked(InMobiBanner inMobiBanner, Map<Object, Object> map) {
    }

    public void onUserLeftApplication(InMobiBanner inMobiBanner) {
    }

    @Override // com.inmobi.media.bs
    public /* bridge */ /* synthetic */ void onAdLoadSucceeded(InMobiBanner inMobiBanner, AdMetaInfo adMetaInfo) {
        super.onAdLoadSucceeded(inMobiBanner, adMetaInfo);
    }
}
