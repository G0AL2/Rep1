package com.applovin.impl.mediation.debugger.ui.a;

import android.content.DialogInterface;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.amazon.device.ads.AdError;
import com.amazon.device.ads.DTBAdResponse;
import com.applovin.impl.mediation.debugger.a.a;
import com.applovin.impl.mediation.debugger.ui.a;
import com.applovin.impl.mediation.debugger.ui.a.b;
import com.applovin.impl.mediation.debugger.ui.d.d;
import com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxDebuggerAdUnitDetailActivity;
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
import java.util.List;

/* loaded from: classes.dex */
public class a extends com.applovin.impl.mediation.debugger.ui.a implements a.InterfaceC0118a, AdControlButton.a, MaxAdRevenueListener, MaxAdViewAdListener, MaxRewardedAdListener {

    /* renamed from: a  reason: collision with root package name */
    private m f7551a;

    /* renamed from: b  reason: collision with root package name */
    private com.applovin.impl.mediation.debugger.b.a.a f7552b;

    /* renamed from: c  reason: collision with root package name */
    private b f7553c;

    /* renamed from: d  reason: collision with root package name */
    private com.applovin.impl.mediation.debugger.b.a.b f7554d;

    /* renamed from: e  reason: collision with root package name */
    private MaxAdView f7555e;

    /* renamed from: f  reason: collision with root package name */
    private MaxInterstitialAd f7556f;

    /* renamed from: g  reason: collision with root package name */
    private MaxRewardedInterstitialAd f7557g;

    /* renamed from: h  reason: collision with root package name */
    private MaxRewardedAd f7558h;

    /* renamed from: i  reason: collision with root package name */
    private MaxNativeAdView f7559i;

    /* renamed from: j  reason: collision with root package name */
    private MaxNativeAdLoader f7560j;

    /* renamed from: k  reason: collision with root package name */
    private d f7561k;

    /* renamed from: l  reason: collision with root package name */
    private ListView f7562l;

    /* renamed from: m  reason: collision with root package name */
    private View f7563m;

    /* renamed from: n  reason: collision with root package name */
    private AdControlButton f7564n;

    /* renamed from: o  reason: collision with root package name */
    private TextView f7565o;

    /* renamed from: p  reason: collision with root package name */
    private com.applovin.impl.mediation.debugger.a.a f7566p;

    private void a() {
        String a10 = this.f7552b.a();
        if (this.f7552b.d().isAdViewAd()) {
            MaxAdView maxAdView = new MaxAdView(a10, this.f7552b.d(), this.f7551a.Y(), this);
            this.f7555e = maxAdView;
            maxAdView.setListener(this);
        } else if (MaxAdFormat.INTERSTITIAL == this.f7552b.d()) {
            MaxInterstitialAd maxInterstitialAd = new MaxInterstitialAd(a10, this.f7551a.Y(), this);
            this.f7556f = maxInterstitialAd;
            maxInterstitialAd.setListener(this);
        } else if (MaxAdFormat.REWARDED_INTERSTITIAL == this.f7552b.d()) {
            MaxRewardedInterstitialAd maxRewardedInterstitialAd = new MaxRewardedInterstitialAd(a10, this.f7551a.Y(), this);
            this.f7557g = maxRewardedInterstitialAd;
            maxRewardedInterstitialAd.setListener(this);
        } else if (MaxAdFormat.REWARDED == this.f7552b.d()) {
            MaxRewardedAd maxRewardedAd = MaxRewardedAd.getInstance(a10, this.f7551a.Y(), this);
            this.f7558h = maxRewardedAd;
            maxRewardedAd.setListener(this);
        } else if (MaxAdFormat.NATIVE == this.f7552b.d()) {
            MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader(a10, this.f7551a.Y(), this);
            this.f7560j = maxNativeAdLoader;
            maxNativeAdLoader.setNativeAdListener(new MaxNativeAdListener() { // from class: com.applovin.impl.mediation.debugger.ui.a.a.2
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
                    a.this.f7559i = maxNativeAdView;
                    a.this.onAdLoaded(maxAd);
                }
            });
            this.f7560j.setRevenueListener(this);
        }
    }

    private void a(final ViewGroup viewGroup, AppLovinSdkUtils.Size size, DialogInterface.OnShowListener onShowListener) {
        if (this.f7561k != null) {
            return;
        }
        d dVar = new d(viewGroup, size, this);
        this.f7561k = dVar;
        dVar.setOnShowListener(onShowListener);
        this.f7561k.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.applovin.impl.mediation.debugger.ui.a.a.4
            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(DialogInterface dialogInterface) {
                ViewGroup viewGroup2 = viewGroup;
                if (viewGroup2 instanceof MaxAdView) {
                    ((MaxAdView) viewGroup2).stopAutoRefresh();
                }
                a.this.f7561k = null;
            }
        });
        this.f7561k.show();
    }

    private void a(MaxAdFormat maxAdFormat) {
        if (this.f7554d != null) {
            this.f7551a.J().a(this.f7554d.a().a());
            this.f7551a.J().a(true);
        }
        if (maxAdFormat.isAdViewAd()) {
            this.f7555e.setPlacement("[Mediation Debugger Live Ad]");
            this.f7555e.loadAd();
        } else if (MaxAdFormat.INTERSTITIAL == this.f7552b.d()) {
            this.f7556f.loadAd();
        } else if (MaxAdFormat.REWARDED_INTERSTITIAL == this.f7552b.d()) {
            this.f7557g.loadAd();
        } else if (MaxAdFormat.REWARDED == this.f7552b.d()) {
            this.f7558h.loadAd();
        } else if (MaxAdFormat.NATIVE != this.f7552b.d()) {
            Utils.showToast("Live ads currently unavailable for ad format", this);
        } else {
            this.f7560j.setPlacement("[Mediation Debugger Live Ad]");
            this.f7560j.loadAd();
        }
    }

    private void b(MaxAdFormat maxAdFormat) {
        if (maxAdFormat.isAdViewAd()) {
            a(this.f7555e, maxAdFormat.getSize(), new DialogInterface.OnShowListener() { // from class: com.applovin.impl.mediation.debugger.ui.a.a.3
                @Override // android.content.DialogInterface.OnShowListener
                public void onShow(DialogInterface dialogInterface) {
                    a.this.f7555e.startAutoRefresh();
                }
            });
        } else if (MaxAdFormat.INTERSTITIAL == this.f7552b.d()) {
            this.f7556f.showAd("[Mediation Debugger Live Ad]");
        } else if (MaxAdFormat.REWARDED_INTERSTITIAL == this.f7552b.d()) {
            this.f7557g.showAd("[Mediation Debugger Live Ad]");
        } else if (MaxAdFormat.REWARDED == this.f7552b.d()) {
            this.f7558h.showAd("[Mediation Debugger Live Ad]");
        } else if (MaxAdFormat.NATIVE == this.f7552b.d()) {
            a(this.f7559i, MaxAdFormat.MREC.getSize(), null);
        }
    }

    @Override // com.applovin.impl.mediation.debugger.ui.a
    protected m getSdk() {
        return this.f7551a;
    }

    public void initialize(final com.applovin.impl.mediation.debugger.b.a.a aVar, com.applovin.impl.mediation.debugger.b.a.b bVar, final m mVar) {
        this.f7551a = mVar;
        this.f7552b = aVar;
        this.f7554d = bVar;
        b bVar2 = new b(aVar, bVar, this);
        this.f7553c = bVar2;
        bVar2.a(new d.a() { // from class: com.applovin.impl.mediation.debugger.ui.a.a.1
            @Override // com.applovin.impl.mediation.debugger.ui.d.d.a
            public void a(com.applovin.impl.mediation.debugger.ui.d.a aVar2, final com.applovin.impl.mediation.debugger.ui.d.c cVar) {
                if (cVar instanceof b.a) {
                    a.this.startActivity(MaxDebuggerAdUnitDetailActivity.class, mVar.af(), new a.InterfaceC0120a<MaxDebuggerAdUnitDetailActivity>() { // from class: com.applovin.impl.mediation.debugger.ui.a.a.1.1
                        @Override // com.applovin.impl.mediation.debugger.ui.a.InterfaceC0120a
                        public void a(MaxDebuggerAdUnitDetailActivity maxDebuggerAdUnitDetailActivity) {
                            com.applovin.impl.mediation.debugger.b.a.b a10 = ((b.a) cVar).a();
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            maxDebuggerAdUnitDetailActivity.initialize(aVar, a10, mVar);
                        }
                    });
                }
            }
        });
        a();
        List<com.applovin.impl.mediation.debugger.a.b> d10 = aVar.e().d();
        if (d10 == null || d10.size() <= 0) {
            return;
        }
        if (bVar == null || bVar.a().c().x()) {
            this.f7566p = new com.applovin.impl.mediation.debugger.a.a(d10, aVar.d(), this);
        }
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
        this.f7564n.setControlState(AdControlButton.b.LOAD);
        this.f7565o.setText("");
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
        if (maxAdFormat.isAdViewAd()) {
            this.f7555e.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f7556f.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
            this.f7557g.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f7558h.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.f7560j.setLocalExtraParameter("amazon_ad_error", adError);
        }
        a(maxAdFormat);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoadFailed(String str, MaxError maxError) {
        this.f7564n.setControlState(AdControlButton.b.LOAD);
        this.f7565o.setText("");
        if (204 == maxError.getCode()) {
            Utils.showAlert("No Fill", "No fills often happen in live environments. Please make sure to use the Mediation Debugger test mode before you go live.", this);
            return;
        }
        Utils.showAlert("", "Failed to load with error code: " + maxError.getCode(), this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoaded(MaxAd maxAd) {
        TextView textView = this.f7565o;
        textView.setText(maxAd.getNetworkName() + " ad loaded");
        this.f7564n.setControlState(AdControlButton.b.SHOW);
        if (maxAd.getFormat().isAdViewAd()) {
            a(this.f7555e, maxAd.getFormat().getSize(), null);
        } else if (MaxAdFormat.NATIVE == this.f7552b.d()) {
            a(this.f7559i, MaxAdFormat.MREC.getSize(), null);
        }
    }

    @Override // com.applovin.impl.mediation.debugger.a.a.InterfaceC0118a
    public void onAdResponseLoaded(DTBAdResponse dTBAdResponse, MaxAdFormat maxAdFormat) {
        if (maxAdFormat.isAdViewAd()) {
            this.f7555e.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f7556f.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
            this.f7557g.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f7558h.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.f7560j.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        }
        a(maxAdFormat);
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(MaxAd maxAd) {
        Utils.showToast("onAdRevenuePaid", maxAd, this);
    }

    @Override // com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton.a
    public void onClick(AdControlButton adControlButton) {
        if (this.f7551a.J().a()) {
            Utils.showAlert("Not Supported", "Ad loads are not supported while Test Mode is enabled. Please restart the app.", this);
            return;
        }
        MaxAdFormat d10 = this.f7552b.d();
        AdControlButton.b bVar = AdControlButton.b.LOAD;
        if (bVar == adControlButton.getControlState()) {
            adControlButton.setControlState(AdControlButton.b.LOADING);
            com.applovin.impl.mediation.debugger.a.a aVar = this.f7566p;
            if (aVar != null) {
                aVar.a();
            } else {
                a(d10);
            }
        } else if (AdControlButton.b.SHOW == adControlButton.getControlState()) {
            if (!d10.isAdViewAd() && d10 != MaxAdFormat.NATIVE) {
                adControlButton.setControlState(bVar);
            }
            b(d10);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.mediation.debugger.ui.a, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_ad_unit_detail_activity);
        setTitle(this.f7553c.a());
        this.f7562l = (ListView) findViewById(R.id.listView);
        this.f7563m = findViewById(R.id.ad_presenter_view);
        this.f7564n = (AdControlButton) findViewById(R.id.ad_control_button);
        this.f7565o = (TextView) findViewById(R.id.status_textview);
        this.f7562l.setAdapter((ListAdapter) this.f7553c);
        this.f7565o.setText(this.f7551a.J().a() ? "Not Supported while Test Mode is enabled" : "Tap to load an ad");
        this.f7565o.setTypeface(Typeface.DEFAULT_BOLD);
        this.f7564n.setOnClickListener(this);
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setPadding(0, 10, 0, 0);
        shapeDrawable.getPaint().setColor(-1);
        shapeDrawable.getPaint().setShadowLayer(10, 0.0f, -10, 855638016);
        shapeDrawable.setShape(new RectShape());
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable});
        layerDrawable.setLayerInset(0, 0, 10, 0, 0);
        this.f7563m.setBackground(layerDrawable);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.mediation.debugger.ui.a, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.f7554d != null) {
            this.f7551a.J().a((String) null);
            this.f7551a.J().a(false);
        }
        MaxAdView maxAdView = this.f7555e;
        if (maxAdView != null) {
            maxAdView.destroy();
        }
        MaxInterstitialAd maxInterstitialAd = this.f7556f;
        if (maxInterstitialAd != null) {
            maxInterstitialAd.destroy();
        }
        MaxRewardedAd maxRewardedAd = this.f7558h;
        if (maxRewardedAd != null) {
            maxRewardedAd.destroy();
        }
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
