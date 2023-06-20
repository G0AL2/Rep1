package com.inmobi.media;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.DecelerateInterpolator;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.ads.listeners.BannerAdEventListener;
import com.inmobi.media.a;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: BannerPreloadCallbacks.java */
/* loaded from: classes3.dex */
public class b extends PublisherCallbacks {

    /* renamed from: a  reason: collision with root package name */
    protected WeakReference<InMobiBanner> f24660a;

    public b(InMobiBanner inMobiBanner) {
        this.f24660a = new WeakReference<>(inMobiBanner);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public byte getType() {
        return (byte) 1;
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdClicked(Map<Object, Object> map) {
        BannerAdEventListener bannerAdEventListener;
        InMobiBanner inMobiBanner = this.f24660a.get();
        if (inMobiBanner == null || (bannerAdEventListener = inMobiBanner.f24367b) == null) {
            return;
        }
        bannerAdEventListener.onAdClicked(inMobiBanner, map);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdDismissed() {
        InMobiBanner inMobiBanner = this.f24660a.get();
        if (inMobiBanner == null) {
            return;
        }
        BannerAdEventListener bannerAdEventListener = inMobiBanner.f24367b;
        if (bannerAdEventListener != null) {
            bannerAdEventListener.onAdDismissed(inMobiBanner);
        }
        inMobiBanner.b();
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdDisplayed(AdMetaInfo adMetaInfo) {
        BannerAdEventListener bannerAdEventListener;
        InMobiBanner inMobiBanner = this.f24660a.get();
        if (inMobiBanner == null || (bannerAdEventListener = inMobiBanner.f24367b) == null) {
            return;
        }
        bannerAdEventListener.onAdDisplayed(inMobiBanner);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdFetchFailed(InMobiAdRequestStatus inMobiAdRequestStatus) {
        BannerAdEventListener bannerAdEventListener;
        InMobiBanner inMobiBanner = this.f24660a.get();
        if (inMobiBanner == null || (bannerAdEventListener = inMobiBanner.f24367b) == null) {
            return;
        }
        bannerAdEventListener.onAdFetchFailed(inMobiBanner, inMobiAdRequestStatus);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdFetchSuccessful(AdMetaInfo adMetaInfo) {
        BannerAdEventListener bannerAdEventListener;
        InMobiBanner inMobiBanner = this.f24660a.get();
        if (inMobiBanner == null || (bannerAdEventListener = inMobiBanner.f24367b) == null) {
            return;
        }
        bannerAdEventListener.onAdFetchSuccessful(inMobiBanner, adMetaInfo);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdLoadFailed(InMobiAdRequestStatus inMobiAdRequestStatus) {
        InMobiBanner inMobiBanner = this.f24660a.get();
        if (inMobiBanner == null) {
            return;
        }
        BannerAdEventListener bannerAdEventListener = inMobiBanner.f24367b;
        if (bannerAdEventListener != null) {
            bannerAdEventListener.onAdLoadFailed(inMobiBanner, inMobiAdRequestStatus);
        }
        inMobiBanner.b();
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdLoadSucceeded(AdMetaInfo adMetaInfo) {
        InMobiBanner inMobiBanner = this.f24660a.get();
        if (inMobiBanner == null || inMobiBanner.f24368c.t() || !inMobiBanner.f24368c.b(inMobiBanner)) {
            return;
        }
        inMobiBanner.f24368c.p();
        try {
            InMobiBanner.AnimationType animationType = inMobiBanner.f24369d;
            float width = inMobiBanner.getWidth();
            float height = inMobiBanner.getHeight();
            AlphaAnimation alphaAnimation = null;
            if (animationType == InMobiBanner.AnimationType.ANIMATION_ALPHA) {
                AlphaAnimation alphaAnimation2 = new AlphaAnimation(0.0f, 0.5f);
                alphaAnimation2.setDuration(1000L);
                alphaAnimation2.setFillAfter(false);
                alphaAnimation2.setInterpolator(new DecelerateInterpolator());
                alphaAnimation = alphaAnimation2;
            } else if (animationType == InMobiBanner.AnimationType.ROTATE_HORIZONTAL_AXIS) {
                a.C0327a c0327a = new a.C0327a(width / 2.0f, height / 2.0f);
                c0327a.setDuration(500L);
                c0327a.setFillAfter(false);
                c0327a.setInterpolator(new AccelerateInterpolator());
                alphaAnimation = c0327a;
            } else if (animationType == InMobiBanner.AnimationType.ROTATE_VERTICAL_AXIS) {
                a.b bVar = new a.b(width / 2.0f, height / 2.0f);
                bVar.setDuration(500L);
                bVar.setFillAfter(false);
                bVar.setInterpolator(new AccelerateInterpolator());
                alphaAnimation = bVar;
            }
            inMobiBanner.f24368c.a(inMobiBanner);
            if (alphaAnimation != null) {
                inMobiBanner.startAnimation(alphaAnimation);
            }
        } catch (Exception unused) {
            hu.a((byte) 1, InMobiBanner.f24366a, "Unexpected error while displaying Banner Ad.");
        }
        BannerAdEventListener bannerAdEventListener = inMobiBanner.f24367b;
        if (bannerAdEventListener != null) {
            bannerAdEventListener.onAdLoadSucceeded(inMobiBanner);
        }
        BannerAdEventListener bannerAdEventListener2 = inMobiBanner.f24367b;
        if (bannerAdEventListener2 != null) {
            bannerAdEventListener2.onAdLoadSucceeded(inMobiBanner, adMetaInfo);
        }
        inMobiBanner.b();
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRequestPayloadCreated(byte[] bArr) {
        BannerAdEventListener bannerAdEventListener;
        InMobiBanner inMobiBanner = this.f24660a.get();
        if (inMobiBanner == null || (bannerAdEventListener = inMobiBanner.f24367b) == null) {
            return;
        }
        bannerAdEventListener.onRequestPayloadCreated(bArr);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRequestPayloadCreationFailed(InMobiAdRequestStatus inMobiAdRequestStatus) {
        BannerAdEventListener bannerAdEventListener;
        InMobiBanner inMobiBanner = this.f24660a.get();
        if (inMobiBanner == null || (bannerAdEventListener = inMobiBanner.f24367b) == null) {
            return;
        }
        bannerAdEventListener.onRequestPayloadCreationFailed(inMobiAdRequestStatus);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRewardsUnlocked(Map<Object, Object> map) {
        BannerAdEventListener bannerAdEventListener;
        InMobiBanner inMobiBanner = this.f24660a.get();
        if (inMobiBanner == null || (bannerAdEventListener = inMobiBanner.f24367b) == null) {
            return;
        }
        bannerAdEventListener.onRewardsUnlocked(inMobiBanner, map);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onUserLeftApplication() {
        BannerAdEventListener bannerAdEventListener;
        InMobiBanner inMobiBanner = this.f24660a.get();
        if (inMobiBanner == null || (bannerAdEventListener = inMobiBanner.f24367b) == null) {
            return;
        }
        bannerAdEventListener.onUserLeftApplication(inMobiBanner);
    }
}
