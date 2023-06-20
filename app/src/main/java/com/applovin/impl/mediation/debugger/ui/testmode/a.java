package com.applovin.impl.mediation.debugger.ui.testmode;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.amazon.device.ads.AdError;
import com.amazon.device.ads.AdRegistration;
import com.amazon.device.ads.DTBAdResponse;
import com.applovin.impl.mediation.debugger.a.a;
import com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.v;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.mediation.ads.MaxInterstitialAd;
import com.applovin.mediation.ads.MaxRewardedAd;
import com.applovin.mediation.ads.MaxRewardedInterstitialAd;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdLoader;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class a extends com.applovin.impl.mediation.debugger.ui.a implements a.InterfaceC0118a, AdControlButton.a, MaxAdRevenueListener, MaxAdViewAdListener, MaxRewardedAdListener {

    /* renamed from: a  reason: collision with root package name */
    private com.applovin.impl.mediation.debugger.b.b.b f7751a;

    /* renamed from: b  reason: collision with root package name */
    private m f7752b;

    /* renamed from: c  reason: collision with root package name */
    private MaxAdView f7753c;

    /* renamed from: d  reason: collision with root package name */
    private MaxAdView f7754d;

    /* renamed from: e  reason: collision with root package name */
    private MaxInterstitialAd f7755e;

    /* renamed from: f  reason: collision with root package name */
    private MaxRewardedInterstitialAd f7756f;

    /* renamed from: g  reason: collision with root package name */
    private MaxRewardedAd f7757g;

    /* renamed from: h  reason: collision with root package name */
    private MaxAd f7758h;

    /* renamed from: i  reason: collision with root package name */
    private MaxNativeAdLoader f7759i;

    /* renamed from: j  reason: collision with root package name */
    private String f7760j;

    /* renamed from: k  reason: collision with root package name */
    private AdControlButton f7761k;

    /* renamed from: l  reason: collision with root package name */
    private AdControlButton f7762l;

    /* renamed from: m  reason: collision with root package name */
    private AdControlButton f7763m;

    /* renamed from: n  reason: collision with root package name */
    private AdControlButton f7764n;

    /* renamed from: o  reason: collision with root package name */
    private AdControlButton f7765o;

    /* renamed from: p  reason: collision with root package name */
    private AdControlButton f7766p;

    /* renamed from: q  reason: collision with root package name */
    private Button f7767q;

    /* renamed from: r  reason: collision with root package name */
    private Button f7768r;

    /* renamed from: s  reason: collision with root package name */
    private FrameLayout f7769s;

    /* renamed from: t  reason: collision with root package name */
    private FrameLayout f7770t;

    /* renamed from: u  reason: collision with root package name */
    private Map<MaxAdFormat, com.applovin.impl.mediation.debugger.a.a> f7771u;

    private AdControlButton a(String str) {
        if (str.equals("test_mode_banner") || str.equals("test_mode_leader")) {
            return this.f7761k;
        }
        if (str.equals("test_mode_mrec")) {
            return this.f7762l;
        }
        if (str.equals("test_mode_interstitial")) {
            return this.f7763m;
        }
        if (str.equals("test_mode_rewarded_interstitial")) {
            return this.f7764n;
        }
        if (str.equals(this.f7760j)) {
            return this.f7765o;
        }
        if (str.equals("test_mode_native")) {
            return this.f7766p;
        }
        throw new IllegalArgumentException("Invalid test mode ad unit identifier provided " + str);
    }

    private void a() {
        MaxAdFormat maxAdFormat;
        String str;
        boolean isTablet = AppLovinSdkUtils.isTablet(this);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.banner_ad_view_container);
        if (isTablet) {
            maxAdFormat = MaxAdFormat.LEADER;
            ((TextView) findViewById(R.id.banner_label)).setText("Leader");
            str = "test_mode_leader";
        } else {
            maxAdFormat = MaxAdFormat.BANNER;
            str = "test_mode_banner";
        }
        if (!this.f7751a.p().contains(maxAdFormat)) {
            findViewById(R.id.banner_control_view).setVisibility(8);
            frameLayout.setVisibility(8);
            return;
        }
        MaxAdView maxAdView = new MaxAdView(str, maxAdFormat, this.f7752b.Y(), this);
        this.f7753c = maxAdView;
        maxAdView.setListener(this);
        frameLayout.addView(this.f7753c, new FrameLayout.LayoutParams(AppLovinSdkUtils.dpToPx(this, maxAdFormat.getSize().getWidth()), AppLovinSdkUtils.dpToPx(this, maxAdFormat.getSize().getHeight())));
        AdControlButton adControlButton = (AdControlButton) findViewById(R.id.banner_control_button);
        this.f7761k = adControlButton;
        adControlButton.setOnClickListener(this);
        this.f7761k.setFormat(maxAdFormat);
    }

    private void a(MaxAdFormat maxAdFormat) {
        MaxAdView maxAdView;
        this.f7752b.J().a(this.f7751a.h());
        if (MaxAdFormat.BANNER == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) {
            maxAdView = this.f7753c;
        } else if (MaxAdFormat.MREC != maxAdFormat) {
            if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
                this.f7755e.loadAd();
                return;
            } else if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
                this.f7756f.loadAd();
                return;
            } else if (MaxAdFormat.REWARDED == maxAdFormat) {
                this.f7757g.loadAd();
                return;
            } else if (MaxAdFormat.NATIVE == maxAdFormat) {
                this.f7759i.loadAd();
                return;
            } else {
                return;
            }
        } else {
            maxAdView = this.f7754d;
        }
        maxAdView.loadAd();
    }

    private void b() {
        this.f7769s = (FrameLayout) findViewById(R.id.mrec_ad_view_container);
        List<MaxAdFormat> p10 = this.f7751a.p();
        MaxAdFormat maxAdFormat = MaxAdFormat.MREC;
        if (!p10.contains(maxAdFormat)) {
            findViewById(R.id.mrec_control_view).setVisibility(8);
            this.f7769s.setVisibility(8);
            return;
        }
        MaxAdView maxAdView = new MaxAdView("test_mode_mrec", maxAdFormat, this.f7752b.Y(), this);
        this.f7754d = maxAdView;
        maxAdView.setListener(this);
        this.f7769s.addView(this.f7754d, new FrameLayout.LayoutParams(-1, -1));
        AdControlButton adControlButton = (AdControlButton) findViewById(R.id.mrec_control_button);
        this.f7762l = adControlButton;
        adControlButton.setOnClickListener(this);
        this.f7762l.setFormat(maxAdFormat);
    }

    private void b(MaxAdFormat maxAdFormat) {
        if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f7755e.showAd();
        } else if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
            this.f7756f.showAd();
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f7757g.showAd();
        }
    }

    private void c() {
        List<MaxAdFormat> p10 = this.f7751a.p();
        MaxAdFormat maxAdFormat = MaxAdFormat.INTERSTITIAL;
        if (!p10.contains(maxAdFormat)) {
            findViewById(R.id.interstitial_control_view).setVisibility(8);
            return;
        }
        MaxInterstitialAd maxInterstitialAd = new MaxInterstitialAd("test_mode_interstitial", this.f7752b.Y(), this);
        this.f7755e = maxInterstitialAd;
        maxInterstitialAd.setListener(this);
        AdControlButton adControlButton = (AdControlButton) findViewById(R.id.interstitial_control_button);
        this.f7763m = adControlButton;
        adControlButton.setOnClickListener(this);
        this.f7763m.setFormat(maxAdFormat);
    }

    private void d() {
        List<MaxAdFormat> p10 = this.f7751a.p();
        MaxAdFormat maxAdFormat = MaxAdFormat.REWARDED;
        if (!p10.contains(maxAdFormat)) {
            findViewById(R.id.rewarded_control_view).setVisibility(8);
            return;
        }
        String str = "test_mode_rewarded_" + this.f7751a.h();
        this.f7760j = str;
        MaxRewardedAd maxRewardedAd = MaxRewardedAd.getInstance(str, this.f7752b.Y(), this);
        this.f7757g = maxRewardedAd;
        maxRewardedAd.setListener(this);
        AdControlButton adControlButton = (AdControlButton) findViewById(R.id.rewarded_control_button);
        this.f7765o = adControlButton;
        adControlButton.setOnClickListener(this);
        this.f7765o.setFormat(maxAdFormat);
    }

    private void e() {
        this.f7770t = (FrameLayout) findViewById(R.id.native_ad_view_container);
        if (!this.f7751a.q()) {
            findViewById(R.id.native_control_view).setVisibility(8);
            this.f7770t.setVisibility(8);
            return;
        }
        MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader("test_mode_native", this.f7752b.Y(), this);
        this.f7759i = maxNativeAdLoader;
        maxNativeAdLoader.setNativeAdListener(new MaxNativeAdListener() { // from class: com.applovin.impl.mediation.debugger.ui.testmode.a.3
            @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
            public void onNativeAdClicked(MaxAd maxAd) {
                a.this.onAdClicked(maxAd);
            }

            @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
            public void onNativeAdLoadFailed(String str, MaxError maxError) {
                a.this.onAdLoadFailed(str, maxError);
            }

            @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
            public void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
                if (a.this.f7758h != null) {
                    a.this.f7759i.destroy(a.this.f7758h);
                }
                a.this.f7758h = maxAd;
                a.this.f7770t.removeAllViews();
                a.this.f7770t.addView(maxNativeAdView);
                a.this.onAdLoaded(maxAd);
            }
        });
        this.f7759i.setRevenueListener(this);
        AdControlButton adControlButton = (AdControlButton) findViewById(R.id.native_control_button);
        this.f7766p = adControlButton;
        adControlButton.setOnClickListener(this);
        this.f7766p.setFormat(MaxAdFormat.NATIVE);
    }

    @Override // com.applovin.impl.mediation.debugger.ui.a
    protected m getSdk() {
        return this.f7752b;
    }

    public void initialize(com.applovin.impl.mediation.debugger.b.b.b bVar) {
        this.f7751a = bVar;
        this.f7752b = bVar.v();
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdClicked(MaxAd maxAd) {
        Utils.showToast("onAdClicked", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdCollapsed(MaxAd maxAd) {
        Utils.showToast("onAdCollapsed", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        a(maxAd.getAdUnitId()).setControlState(AdControlButton.b.LOAD);
        Utils.showAlert("Failed to display " + maxAd.getFormat().getDisplayName(), "MAX Error\nCode: " + maxError.getCode() + "\nMessage: " + maxError.getMessage() + "\n\n" + maxAd.getNetworkName() + " Display Error\nCode: " + maxError.getMediatedNetworkErrorCode() + "\nMessage: " + maxError.getMediatedNetworkErrorMessage(), this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayed(MaxAd maxAd) {
        Utils.showToast("onAdDisplayed", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdExpanded(MaxAd maxAd) {
        Utils.showToast("onAdExpanded", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdHidden(MaxAd maxAd) {
        Utils.showToast("onAdHidden", maxAd, this);
    }

    @Override // com.applovin.impl.mediation.debugger.a.a.InterfaceC0118a
    public void onAdLoadFailed(AdError adError, MaxAdFormat maxAdFormat) {
        MaxAdView maxAdView;
        if (MaxAdFormat.BANNER == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) {
            maxAdView = this.f7753c;
        } else if (MaxAdFormat.MREC != maxAdFormat) {
            if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
                this.f7755e.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
                this.f7756f.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.REWARDED == maxAdFormat) {
                this.f7757g.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.NATIVE == maxAdFormat) {
                this.f7759i.setLocalExtraParameter("amazon_ad_error", adError);
            }
            a(maxAdFormat);
        } else {
            maxAdView = this.f7754d;
        }
        maxAdView.setLocalExtraParameter("amazon_ad_error", adError);
        a(maxAdFormat);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoadFailed(String str, MaxError maxError) {
        AdControlButton a10 = a(str);
        a10.setControlState(AdControlButton.b.LOAD);
        Utils.showAlert("", "Failed to load " + a10.getFormat().getLabel() + " with error code: " + maxError.getCode(), this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoaded(MaxAd maxAd) {
        a(maxAd.getAdUnitId()).setControlState((maxAd.getFormat().isAdViewAd() || maxAd.getFormat().equals(MaxAdFormat.NATIVE)) ? AdControlButton.b.LOAD : AdControlButton.b.SHOW);
    }

    @Override // com.applovin.impl.mediation.debugger.a.a.InterfaceC0118a
    public void onAdResponseLoaded(DTBAdResponse dTBAdResponse, MaxAdFormat maxAdFormat) {
        MaxAdView maxAdView;
        if (MaxAdFormat.BANNER == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) {
            maxAdView = this.f7753c;
        } else if (MaxAdFormat.MREC != maxAdFormat) {
            if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
                this.f7755e.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
            } else if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
                this.f7756f.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
            } else if (MaxAdFormat.REWARDED == maxAdFormat) {
                this.f7757g.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
            } else if (MaxAdFormat.NATIVE == maxAdFormat) {
                this.f7759i.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
            }
            a(maxAdFormat);
        } else {
            maxAdView = this.f7754d;
        }
        maxAdView.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        a(maxAdFormat);
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(MaxAd maxAd) {
        Utils.showToast("onAdRevenuePaid", maxAd, this);
    }

    @Override // com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton.a
    public void onClick(AdControlButton adControlButton) {
        MaxAdFormat format = adControlButton.getFormat();
        AdControlButton.b bVar = AdControlButton.b.LOAD;
        if (bVar != adControlButton.getControlState()) {
            if (AdControlButton.b.SHOW == adControlButton.getControlState()) {
                adControlButton.setControlState(bVar);
                b(format);
                return;
            }
            return;
        }
        adControlButton.setControlState(AdControlButton.b.LOADING);
        Map<MaxAdFormat, com.applovin.impl.mediation.debugger.a.a> map = this.f7771u;
        if (map == null || map.get(format) == null) {
            a(format);
        } else {
            this.f7771u.get(format).a();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.mediation.debugger.ui.a, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.f7751a == null) {
            v.i("MaxDebuggerMultiAdActivity", "Failed to initialize activity with a network model.");
            return;
        }
        setContentView(R.layout.mediation_debugger_multi_ad_activity);
        setTitle(this.f7751a.i() + " Test Ads");
        a();
        b();
        c();
        d();
        e();
        findViewById(R.id.rewarded_interstitial_control_view).setVisibility(8);
        this.f7767q = (Button) findViewById(R.id.show_mrec_button);
        this.f7768r = (Button) findViewById(R.id.show_native_button);
        if (this.f7751a.q() && this.f7751a.p().contains(MaxAdFormat.MREC)) {
            this.f7770t.setVisibility(8);
            this.f7767q.setBackgroundColor(-1);
            this.f7768r.setBackgroundColor(-3355444);
            this.f7767q.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.mediation.debugger.ui.testmode.a.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    a.this.f7769s.setVisibility(0);
                    a.this.f7770t.setVisibility(8);
                    a.this.f7767q.setBackgroundColor(-1);
                    a.this.f7768r.setBackgroundColor(-3355444);
                }
            });
            this.f7768r.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.mediation.debugger.ui.testmode.a.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    a.this.f7770t.setVisibility(0);
                    a.this.f7769s.setVisibility(8);
                    a.this.f7768r.setBackgroundColor(-1);
                    a.this.f7767q.setBackgroundColor(-3355444);
                }
            });
        } else {
            this.f7767q.setVisibility(8);
            this.f7768r.setVisibility(8);
        }
        if (StringUtils.isValidString(this.f7751a.y()) && this.f7751a.z() != null && this.f7751a.z().size() > 0) {
            AdRegistration.getInstance(this.f7751a.y(), this);
            AdRegistration.enableTesting(true);
            AdRegistration.enableLogging(true);
            HashMap hashMap = new HashMap(this.f7751a.z().size());
            for (MaxAdFormat maxAdFormat : this.f7751a.z().keySet()) {
                hashMap.put(maxAdFormat, new com.applovin.impl.mediation.debugger.a.a(this.f7751a.z().get(maxAdFormat), maxAdFormat, this));
            }
            this.f7771u = hashMap;
        }
        try {
            setRequestedOrientation(7);
        } catch (Throwable th) {
            v.c("AppLovinSdk", "Failed to set portrait orientation", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.mediation.debugger.ui.a, android.app.Activity
    public void onDestroy() {
        MaxAd maxAd;
        super.onDestroy();
        this.f7752b.J().a((String) null);
        MaxAdView maxAdView = this.f7753c;
        if (maxAdView != null) {
            maxAdView.destroy();
        }
        MaxAdView maxAdView2 = this.f7754d;
        if (maxAdView2 != null) {
            maxAdView2.destroy();
        }
        MaxInterstitialAd maxInterstitialAd = this.f7755e;
        if (maxInterstitialAd != null) {
            maxInterstitialAd.destroy();
        }
        MaxRewardedAd maxRewardedAd = this.f7757g;
        if (maxRewardedAd != null) {
            maxRewardedAd.destroy();
        }
        MaxNativeAdLoader maxNativeAdLoader = this.f7759i;
        if (maxNativeAdLoader == null || (maxAd = this.f7758h) == null) {
            return;
        }
        maxNativeAdLoader.destroy(maxAd);
    }

    @Override // com.applovin.mediation.MaxRewardedAdListener
    public void onRewardedVideoCompleted(MaxAd maxAd) {
        Utils.showToast("onRewardedVideoCompleted", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxRewardedAdListener
    public void onRewardedVideoStarted(MaxAd maxAd) {
        Utils.showToast("onRewardedVideoStarted", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxRewardedAdListener
    public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
        Utils.showToast("onUserRewarded", maxAd, this);
    }
}
