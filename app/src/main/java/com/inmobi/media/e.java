package com.inmobi.media;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiInterstitial;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.ads.listeners.InterstitialAdEventListener;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: InterstitialPreloadCallbacks.java */
/* loaded from: classes3.dex */
public class e extends PublisherCallbacks {

    /* renamed from: a  reason: collision with root package name */
    protected WeakReference<InMobiInterstitial> f25191a;

    public e(InMobiInterstitial inMobiInterstitial) {
        this.f25191a = new WeakReference<>(inMobiInterstitial);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public byte getType() {
        return (byte) 1;
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdClicked(Map<Object, Object> map) {
        InterstitialAdEventListener interstitialAdEventListener;
        InMobiInterstitial inMobiInterstitial = this.f25191a.get();
        if (inMobiInterstitial == null || (interstitialAdEventListener = inMobiInterstitial.f24387a) == null) {
            return;
        }
        interstitialAdEventListener.onAdClicked(inMobiInterstitial, map);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdDismissed() {
        InterstitialAdEventListener interstitialAdEventListener;
        InMobiInterstitial inMobiInterstitial = this.f25191a.get();
        if (inMobiInterstitial == null || (interstitialAdEventListener = inMobiInterstitial.f24387a) == null) {
            return;
        }
        interstitialAdEventListener.onAdDismissed(inMobiInterstitial);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdDisplayFailed() {
        InterstitialAdEventListener interstitialAdEventListener;
        InMobiInterstitial inMobiInterstitial = this.f25191a.get();
        if (inMobiInterstitial == null || (interstitialAdEventListener = inMobiInterstitial.f24387a) == null) {
            return;
        }
        interstitialAdEventListener.onAdDisplayFailed(inMobiInterstitial);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdDisplayed(AdMetaInfo adMetaInfo) {
        InterstitialAdEventListener interstitialAdEventListener;
        InterstitialAdEventListener interstitialAdEventListener2;
        InMobiInterstitial inMobiInterstitial = this.f25191a.get();
        if (inMobiInterstitial != null && (interstitialAdEventListener2 = inMobiInterstitial.f24387a) != null) {
            interstitialAdEventListener2.onAdDisplayed(inMobiInterstitial);
        }
        if (inMobiInterstitial == null || (interstitialAdEventListener = inMobiInterstitial.f24387a) == null) {
            return;
        }
        interstitialAdEventListener.onAdDisplayed(inMobiInterstitial, adMetaInfo);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdFetchFailed(InMobiAdRequestStatus inMobiAdRequestStatus) {
        InterstitialAdEventListener interstitialAdEventListener;
        InMobiInterstitial inMobiInterstitial = this.f25191a.get();
        if (inMobiInterstitial == null || (interstitialAdEventListener = inMobiInterstitial.f24387a) == null) {
            return;
        }
        interstitialAdEventListener.onAdFetchFailed(inMobiInterstitial, inMobiAdRequestStatus);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdFetchSuccessful(AdMetaInfo adMetaInfo) {
        InterstitialAdEventListener interstitialAdEventListener;
        InterstitialAdEventListener interstitialAdEventListener2;
        InMobiInterstitial inMobiInterstitial = this.f25191a.get();
        if (inMobiInterstitial != null && (interstitialAdEventListener2 = inMobiInterstitial.f24387a) != null) {
            interstitialAdEventListener2.onAdReceived(inMobiInterstitial);
        }
        if (inMobiInterstitial == null || (interstitialAdEventListener = inMobiInterstitial.f24387a) == null) {
            return;
        }
        interstitialAdEventListener.onAdFetchSuccessful(inMobiInterstitial, adMetaInfo);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdLoadFailed(InMobiAdRequestStatus inMobiAdRequestStatus) {
        InterstitialAdEventListener interstitialAdEventListener;
        InMobiInterstitial inMobiInterstitial = this.f25191a.get();
        if (inMobiInterstitial == null || (interstitialAdEventListener = inMobiInterstitial.f24387a) == null) {
            return;
        }
        interstitialAdEventListener.onAdLoadFailed(inMobiInterstitial, inMobiAdRequestStatus);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdLoadSucceeded(AdMetaInfo adMetaInfo) {
        InterstitialAdEventListener interstitialAdEventListener;
        InterstitialAdEventListener interstitialAdEventListener2;
        InMobiInterstitial inMobiInterstitial = this.f25191a.get();
        if (inMobiInterstitial != null && (interstitialAdEventListener2 = inMobiInterstitial.f24387a) != null) {
            interstitialAdEventListener2.onAdLoadSucceeded(inMobiInterstitial);
        }
        if (inMobiInterstitial == null || (interstitialAdEventListener = inMobiInterstitial.f24387a) == null) {
            return;
        }
        interstitialAdEventListener.onAdLoadSucceeded(inMobiInterstitial, adMetaInfo);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdWillDisplay() {
        InterstitialAdEventListener interstitialAdEventListener;
        InMobiInterstitial inMobiInterstitial = this.f25191a.get();
        if (inMobiInterstitial == null || (interstitialAdEventListener = inMobiInterstitial.f24387a) == null) {
            return;
        }
        interstitialAdEventListener.onAdWillDisplay(inMobiInterstitial);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRequestPayloadCreated(byte[] bArr) {
        InterstitialAdEventListener interstitialAdEventListener;
        InMobiInterstitial inMobiInterstitial = this.f25191a.get();
        if (inMobiInterstitial == null || (interstitialAdEventListener = inMobiInterstitial.f24387a) == null) {
            return;
        }
        interstitialAdEventListener.onRequestPayloadCreated(bArr);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRequestPayloadCreationFailed(InMobiAdRequestStatus inMobiAdRequestStatus) {
        InterstitialAdEventListener interstitialAdEventListener;
        InMobiInterstitial inMobiInterstitial = this.f25191a.get();
        if (inMobiInterstitial == null || (interstitialAdEventListener = inMobiInterstitial.f24387a) == null) {
            return;
        }
        interstitialAdEventListener.onRequestPayloadCreationFailed(inMobiAdRequestStatus);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRewardsUnlocked(Map<Object, Object> map) {
        InterstitialAdEventListener interstitialAdEventListener;
        InMobiInterstitial inMobiInterstitial = this.f25191a.get();
        if (inMobiInterstitial == null || (interstitialAdEventListener = inMobiInterstitial.f24387a) == null) {
            return;
        }
        interstitialAdEventListener.onRewardsUnlocked(inMobiInterstitial, map);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onUserLeftApplication() {
        InterstitialAdEventListener interstitialAdEventListener;
        InMobiInterstitial inMobiInterstitial = this.f25191a.get();
        if (inMobiInterstitial == null || (interstitialAdEventListener = inMobiInterstitial.f24387a) == null) {
            return;
        }
        interstitialAdEventListener.onUserLeftApplication(inMobiInterstitial);
    }
}
