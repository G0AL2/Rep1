package com.inmobi.ads.listeners;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiNative;
import com.inmobi.media.bs;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class NativeAdEventListener extends bs<InMobiNative> {
    public void onAdClicked(InMobiNative inMobiNative) {
    }

    @Override // com.inmobi.media.bs
    public /* bridge */ /* synthetic */ void onAdClicked(InMobiNative inMobiNative, Map map) {
        super.onAdClicked(inMobiNative, map);
    }

    @Override // com.inmobi.media.bs
    public /* bridge */ /* synthetic */ void onAdFetchSuccessful(InMobiNative inMobiNative, AdMetaInfo adMetaInfo) {
        super.onAdFetchSuccessful(inMobiNative, adMetaInfo);
    }

    public void onAdFullScreenDismissed(InMobiNative inMobiNative) {
    }

    public void onAdFullScreenDisplayed(InMobiNative inMobiNative) {
    }

    public void onAdFullScreenWillDisplay(InMobiNative inMobiNative) {
    }

    public void onAdImpressed(InMobiNative inMobiNative) {
    }

    @Override // com.inmobi.media.bs
    public /* bridge */ /* synthetic */ void onAdLoadFailed(InMobiNative inMobiNative, InMobiAdRequestStatus inMobiAdRequestStatus) {
        super.onAdLoadFailed(inMobiNative, inMobiAdRequestStatus);
    }

    @Override // com.inmobi.media.bs
    @Deprecated
    public /* bridge */ /* synthetic */ void onAdLoadSucceeded(InMobiNative inMobiNative) {
        super.onAdLoadSucceeded(inMobiNative);
    }

    @Deprecated
    public void onAdReceived(InMobiNative inMobiNative) {
    }

    public void onAdStatusChanged(InMobiNative inMobiNative) {
    }

    @Override // com.inmobi.media.bs
    public /* bridge */ /* synthetic */ void onRequestPayloadCreated(byte[] bArr) {
        super.onRequestPayloadCreated(bArr);
    }

    @Override // com.inmobi.media.bs
    public /* bridge */ /* synthetic */ void onRequestPayloadCreationFailed(InMobiAdRequestStatus inMobiAdRequestStatus) {
        super.onRequestPayloadCreationFailed(inMobiAdRequestStatus);
    }

    public void onUserWillLeaveApplication(InMobiNative inMobiNative) {
    }

    @Override // com.inmobi.media.bs
    public /* bridge */ /* synthetic */ void onAdLoadSucceeded(InMobiNative inMobiNative, AdMetaInfo adMetaInfo) {
        super.onAdLoadSucceeded(inMobiNative, adMetaInfo);
    }
}
