package com.applovin.impl.mediation.ads;

import android.text.TextUtils;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.a.d;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.g;
import com.applovin.impl.sdk.utils.j;
import com.applovin.impl.sdk.v;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public class MaxNativeAdLoaderImpl extends com.applovin.impl.mediation.ads.a {

    /* renamed from: a  reason: collision with root package name */
    private final a f7309a;

    /* renamed from: b  reason: collision with root package name */
    private String f7310b;

    /* renamed from: c  reason: collision with root package name */
    private String f7311c;

    /* renamed from: d  reason: collision with root package name */
    private MaxNativeAdListener f7312d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<String, MaxNativeAdView> f7313e;

    /* renamed from: f  reason: collision with root package name */
    private final Object f7314f;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a implements a.InterfaceC0115a {
        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(MaxNativeAdView maxNativeAdView) {
            d c10;
            b adViewTracker = maxNativeAdView.getAdViewTracker();
            if (adViewTracker == null || (c10 = adViewTracker.c()) == null) {
                return;
            }
            MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
            maxNativeAdLoaderImpl.logger.b(maxNativeAdLoaderImpl.tag, "Destroying previous ad");
            MaxNativeAdLoaderImpl.this.destroy(c10);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
            j.a(MaxNativeAdLoaderImpl.this.f7312d, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            MaxNativeAdLoaderImpl.this.a(((MaxErrorImpl) maxError).getLoadTag());
            j.a(MaxNativeAdLoaderImpl.this.f7312d, str, maxError, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(final MaxAd maxAd) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl.a.1
                @Override // java.lang.Runnable
                public void run() {
                    MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                    maxNativeAdLoaderImpl.logger.b(maxNativeAdLoaderImpl.tag, "Native ad loaded");
                    d dVar = (d) maxAd;
                    dVar.d(MaxNativeAdLoaderImpl.this.f7310b);
                    dVar.e(MaxNativeAdLoaderImpl.this.f7311c);
                    MaxNativeAdView a10 = MaxNativeAdLoaderImpl.this.a(dVar.a());
                    if (a10 == null) {
                        MaxNativeAdLoaderImpl maxNativeAdLoaderImpl2 = MaxNativeAdLoaderImpl.this;
                        maxNativeAdLoaderImpl2.logger.b(maxNativeAdLoaderImpl2.tag, "No custom view provided, checking template");
                        String v10 = dVar.v();
                        if (StringUtils.isValidString(v10)) {
                            MaxNativeAdLoaderImpl maxNativeAdLoaderImpl3 = MaxNativeAdLoaderImpl.this;
                            v vVar = maxNativeAdLoaderImpl3.logger;
                            String str = maxNativeAdLoaderImpl3.tag;
                            vVar.b(str, "Using template: " + v10 + "...");
                            a10 = new MaxNativeAdView(v10, MaxNativeAdLoaderImpl.this.sdk.L());
                        }
                    }
                    if (a10 == null) {
                        MaxNativeAdLoaderImpl maxNativeAdLoaderImpl4 = MaxNativeAdLoaderImpl.this;
                        maxNativeAdLoaderImpl4.logger.b(maxNativeAdLoaderImpl4.tag, "No native ad view to render. Returning the native ad to be rendered later.");
                        j.a(MaxNativeAdLoaderImpl.this.f7312d, (MaxNativeAdView) null, maxAd, true);
                        return;
                    }
                    a.this.a(a10);
                    MaxNativeAdLoaderImpl.this.a(a10, dVar, dVar.getNativeAd());
                    j.a(MaxNativeAdLoaderImpl.this.f7312d, a10, maxAd, true);
                    MaxNativeAdLoaderImpl.this.a(a10);
                }
            });
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
            j.a(MaxNativeAdLoaderImpl.this.revenueListener, maxAd, true);
        }
    }

    public MaxNativeAdLoaderImpl(String str, m mVar) {
        super(str, MaxAdFormat.NATIVE, "MaxNativeAdLoader", mVar);
        this.f7309a = new a();
        this.f7313e = new HashMap();
        this.f7314f = new Object();
        if (v.a()) {
            v vVar = this.logger;
            String str2 = this.tag;
            vVar.b(str2, "Created new MaxNativeAdLoader (" + this + ")");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MaxNativeAdView a(String str) {
        MaxNativeAdView remove;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.f7314f) {
            remove = this.f7313e.remove(str);
        }
        return remove;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MaxNativeAdView maxNativeAdView) {
        b adViewTracker = maxNativeAdView.getAdViewTracker();
        if (adViewTracker != null) {
            if (g.c()) {
                if (!maxNativeAdView.isAttachedToWindow()) {
                    return;
                }
            } else if (maxNativeAdView.getParent() == null) {
                return;
            }
            adViewTracker.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final MaxNativeAdView maxNativeAdView, final d dVar, final MaxNativeAd maxNativeAd) {
        dVar.a(maxNativeAdView);
        a(dVar);
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl.1
            @Override // java.lang.Runnable
            public void run() {
                maxNativeAdView.render(dVar, MaxNativeAdLoaderImpl.this.f7309a, MaxNativeAdLoaderImpl.this.sdk);
                maxNativeAd.setNativeAdView(maxNativeAdView);
                maxNativeAd.prepareViewForInteraction(maxNativeAdView);
            }
        });
    }

    private void a(String str, MaxNativeAdView maxNativeAdView) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.f7314f) {
            this.f7313e.put(str, maxNativeAdView);
        }
    }

    @Override // com.applovin.impl.mediation.ads.a
    public void destroy() {
        this.f7312d = null;
        super.destroy();
    }

    public void destroy(MaxAd maxAd) {
        if (!(maxAd instanceof d)) {
            if (v.a()) {
                v vVar = this.logger;
                String str = this.tag;
                vVar.b(str, "Destroy failed on non-native ad(" + maxAd + ")");
                return;
            }
            return;
        }
        d dVar = (d) maxAd;
        if (dVar.w()) {
            if (v.a()) {
                v vVar2 = this.logger;
                String str2 = this.tag;
                vVar2.b(str2, "Native ad(" + dVar + ") has already been destroyed");
                return;
            }
            return;
        }
        MaxNativeAdView u10 = dVar.u();
        if (u10 != null) {
            b adViewTracker = u10.getAdViewTracker();
            if (adViewTracker != null && maxAd.equals(adViewTracker.c())) {
                u10.recycle();
            }
        } else if (v.a()) {
            v vVar3 = this.logger;
            String str3 = this.tag;
            vVar3.b(str3, "Destroy failed on native ad(" + dVar + "): native ad view not found");
        }
        this.sdk.E().destroyAd(dVar);
    }

    public String getPlacement() {
        return this.f7310b;
    }

    public void loadAd(MaxNativeAdView maxNativeAdView) {
        if (v.a()) {
            v vVar = this.logger;
            String str = this.tag;
            vVar.b(str, "Loading native ad for '" + this.adUnitId + "' and notifying " + this.f7309a + "...");
        }
        this.extraParameters.put("integration_type", maxNativeAdView != null ? "custom_ad_view" : "no_ad_view");
        String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
        a(lowerCase, maxNativeAdView);
        this.sdk.E().loadAd(this.adUnitId, lowerCase, MaxAdFormat.NATIVE, this.localExtraParameters, this.extraParameters, this.sdk.L(), this.f7309a);
    }

    public boolean render(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        if (!(maxAd instanceof d)) {
            v.i(this.tag, "Failed to render native ad. `ad` needs to be of type `MediatedNativeAd` to render.");
            return false;
        } else if (maxNativeAdView == null) {
            v.i(this.tag, "Failed to render native ad. `adView` to render cannot be null.");
            return false;
        } else {
            d dVar = (d) maxAd;
            MaxNativeAd nativeAd = dVar.getNativeAd();
            if (nativeAd == null) {
                this.logger.e(this.tag, "Failed to render native ad. Could not retrieve MaxNativeAd. The ad may have already been destroyed.");
                return false;
            }
            a(maxNativeAdView, dVar, nativeAd);
            a(maxNativeAdView);
            return true;
        }
    }

    public void setCustomData(String str) {
        Utils.maybeLogCustomDataSizeLimit(str, this.tag);
        this.f7311c = str;
    }

    public void setNativeAdListener(MaxNativeAdListener maxNativeAdListener) {
        if (v.a()) {
            v vVar = this.logger;
            String str = this.tag;
            vVar.b(str, "Setting native ad listener: " + maxNativeAdListener);
        }
        this.f7312d = maxNativeAdListener;
    }

    public void setPlacement(String str) {
        this.f7310b = str;
    }

    public String toString() {
        return "MaxNativeAdLoader{adUnitId='" + this.adUnitId + "', nativeAdListener=" + this.f7312d + ", revenueListener=" + this.revenueListener + '}';
    }
}
