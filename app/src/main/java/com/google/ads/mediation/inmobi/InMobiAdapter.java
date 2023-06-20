package com.google.ads.mediation.inmobi;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.ads.mediation.inmobi.d;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.MediationUtils;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.InMobiInterstitial;
import com.inmobi.ads.InMobiNative;
import com.inmobi.ads.exceptions.SdkNotInitializedException;
import com.inmobi.ads.listeners.BannerAdEventListener;
import com.inmobi.ads.listeners.InterstitialAdEventListener;
import com.inmobi.ads.listeners.NativeAdEventListener;
import com.inmobi.ads.listeners.VideoEventListener;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class InMobiAdapter extends InMobiMediationAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter {

    /* renamed from: j  reason: collision with root package name */
    private static final String f20590j = "InMobiAdapter";

    /* renamed from: k  reason: collision with root package name */
    private static final Boolean f20591k = Boolean.FALSE;

    /* renamed from: c  reason: collision with root package name */
    private MediationBannerListener f20592c;

    /* renamed from: d  reason: collision with root package name */
    private MediationInterstitialListener f20593d;

    /* renamed from: e  reason: collision with root package name */
    private MediationNativeListener f20594e;

    /* renamed from: f  reason: collision with root package name */
    private InMobiInterstitial f20595f;

    /* renamed from: g  reason: collision with root package name */
    private FrameLayout f20596g;

    /* renamed from: h  reason: collision with root package name */
    private NativeMediationAdRequest f20597h;

    /* renamed from: i  reason: collision with root package name */
    private InMobiNative f20598i;

    /* loaded from: classes2.dex */
    class a implements d.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f20599a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f20600b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ AdSize f20601c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ MediationAdRequest f20602d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Bundle f20603e;

        a(Context context, long j10, AdSize adSize, MediationAdRequest mediationAdRequest, Bundle bundle) {
            this.f20599a = context;
            this.f20600b = j10;
            this.f20601c = adSize;
            this.f20602d = mediationAdRequest;
            this.f20603e = bundle;
        }

        @Override // com.google.ads.mediation.inmobi.d.b
        public void a(AdError adError) {
            Log.w(InMobiAdapter.f20590j, adError.getMessage());
            if (InMobiAdapter.this.f20592c != null) {
                InMobiAdapter.this.f20592c.onAdFailedToLoad(InMobiAdapter.this, adError);
            }
        }

        @Override // com.google.ads.mediation.inmobi.d.b
        public void b() {
            InMobiAdapter.this.i(this.f20599a, this.f20600b, this.f20601c, this.f20602d, this.f20603e);
        }
    }

    /* loaded from: classes2.dex */
    class b implements d.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f20605a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f20606b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ MediationAdRequest f20607c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Bundle f20608d;

        b(Context context, long j10, MediationAdRequest mediationAdRequest, Bundle bundle) {
            this.f20605a = context;
            this.f20606b = j10;
            this.f20607c = mediationAdRequest;
            this.f20608d = bundle;
        }

        @Override // com.google.ads.mediation.inmobi.d.b
        public void a(AdError adError) {
            Log.w(InMobiAdapter.f20590j, adError.getMessage());
            if (InMobiAdapter.this.f20593d != null) {
                InMobiAdapter.this.f20593d.onAdFailedToLoad(InMobiAdapter.this, adError);
            }
        }

        @Override // com.google.ads.mediation.inmobi.d.b
        public void b() {
            InMobiAdapter.this.j(this.f20605a, this.f20606b, this.f20607c, this.f20608d);
        }
    }

    /* loaded from: classes2.dex */
    class c implements d.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f20610a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f20611b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Bundle f20612c;

        c(Context context, long j10, Bundle bundle) {
            this.f20610a = context;
            this.f20611b = j10;
            this.f20612c = bundle;
        }

        @Override // com.google.ads.mediation.inmobi.d.b
        public void a(AdError adError) {
            Log.w(InMobiAdapter.f20590j, adError.getMessage());
            if (InMobiAdapter.this.f20594e != null) {
                InMobiAdapter.this.f20594e.onAdFailedToLoad(InMobiAdapter.this, adError);
            }
        }

        @Override // com.google.ads.mediation.inmobi.d.b
        public void b() {
            InMobiAdapter inMobiAdapter = InMobiAdapter.this;
            inMobiAdapter.k(this.f20610a, this.f20611b, inMobiAdapter.f20597h, this.f20612c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class d extends BannerAdEventListener {
        d() {
        }

        @Override // com.inmobi.ads.listeners.BannerAdEventListener, com.inmobi.media.bs
        /* renamed from: a */
        public void onAdClicked(InMobiBanner inMobiBanner, Map<Object, Object> map) {
            Log.d(InMobiAdapter.f20590j, "InMobi banner has been clicked.");
            InMobiAdapter.this.f20592c.onAdClicked(InMobiAdapter.this);
        }

        @Override // com.inmobi.ads.listeners.BannerAdEventListener, com.inmobi.media.bs
        /* renamed from: b */
        public void onAdLoadFailed(InMobiBanner inMobiBanner, InMobiAdRequestStatus inMobiAdRequestStatus) {
            AdError adError = new AdError(com.google.ads.mediation.inmobi.b.g(inMobiAdRequestStatus), inMobiAdRequestStatus.getMessage(), InMobiMediationAdapter.INMOBI_SDK_ERROR_DOMAIN);
            Log.w(InMobiAdapter.f20590j, adError.getMessage());
            InMobiAdapter.this.f20592c.onAdFailedToLoad(InMobiAdapter.this, adError);
        }

        @Override // com.inmobi.ads.listeners.BannerAdEventListener, com.inmobi.media.bs
        /* renamed from: c */
        public void onAdLoadSucceeded(InMobiBanner inMobiBanner, AdMetaInfo adMetaInfo) {
            Log.d(InMobiAdapter.f20590j, "InMobi banner has been loaded.");
            InMobiAdapter.this.f20592c.onAdLoaded(InMobiAdapter.this);
        }

        @Override // com.inmobi.ads.listeners.BannerAdEventListener
        public void onAdDismissed(InMobiBanner inMobiBanner) {
            Log.d(InMobiAdapter.f20590j, "InMobi banner has been dismissed.");
            InMobiAdapter.this.f20592c.onAdClosed(InMobiAdapter.this);
        }

        @Override // com.inmobi.ads.listeners.BannerAdEventListener
        public void onAdDisplayed(InMobiBanner inMobiBanner) {
            Log.d(InMobiAdapter.f20590j, "InMobi banner opened a full screen view.");
            InMobiAdapter.this.f20592c.onAdOpened(InMobiAdapter.this);
        }

        @Override // com.inmobi.ads.listeners.BannerAdEventListener
        public void onRewardsUnlocked(InMobiBanner inMobiBanner, Map<Object, Object> map) {
        }

        @Override // com.inmobi.ads.listeners.BannerAdEventListener
        public void onUserLeftApplication(InMobiBanner inMobiBanner) {
            Log.d(InMobiAdapter.f20590j, "InMobi banner left application.");
            InMobiAdapter.this.f20592c.onAdLeftApplication(InMobiAdapter.this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class e extends InterstitialAdEventListener {
        e() {
        }

        @Override // com.inmobi.ads.listeners.InterstitialAdEventListener, com.inmobi.media.bs
        /* renamed from: a */
        public void onAdClicked(InMobiInterstitial inMobiInterstitial, Map<Object, Object> map) {
            Log.d(InMobiAdapter.f20590j, "InMobi interstitial ad has been clicked.");
            InMobiAdapter.this.f20593d.onAdClicked(InMobiAdapter.this);
        }

        @Override // com.inmobi.ads.listeners.InterstitialAdEventListener, com.inmobi.media.bs
        /* renamed from: b */
        public void onAdFetchSuccessful(InMobiInterstitial inMobiInterstitial, AdMetaInfo adMetaInfo) {
            Log.d(InMobiAdapter.f20590j, "InMobi interstitial ad fetched from server, but ad contents still need to be loaded.");
        }

        @Override // com.inmobi.ads.listeners.InterstitialAdEventListener, com.inmobi.media.bs
        /* renamed from: c */
        public void onAdLoadFailed(InMobiInterstitial inMobiInterstitial, InMobiAdRequestStatus inMobiAdRequestStatus) {
            AdError adError = new AdError(com.google.ads.mediation.inmobi.b.g(inMobiAdRequestStatus), inMobiAdRequestStatus.getMessage(), InMobiMediationAdapter.INMOBI_SDK_ERROR_DOMAIN);
            Log.w(InMobiAdapter.f20590j, adError.getMessage());
            InMobiAdapter.this.f20593d.onAdFailedToLoad(InMobiAdapter.this, adError);
        }

        @Override // com.inmobi.ads.listeners.InterstitialAdEventListener, com.inmobi.media.bs
        /* renamed from: d */
        public void onAdLoadSucceeded(InMobiInterstitial inMobiInterstitial, AdMetaInfo adMetaInfo) {
            Log.d(InMobiAdapter.f20590j, "InMobi interstitial ad has been loaded.");
            InMobiAdapter.this.f20593d.onAdLoaded(InMobiAdapter.this);
        }

        @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
        public void onAdDismissed(InMobiInterstitial inMobiInterstitial) {
            Log.d(InMobiAdapter.f20590j, "InMobi interstitial ad has been dismissed.");
            InMobiAdapter.this.f20593d.onAdClosed(InMobiAdapter.this);
        }

        @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
        public void onAdDisplayFailed(InMobiInterstitial inMobiInterstitial) {
            Log.w(InMobiAdapter.f20590j, new AdError(106, "InMobi ad failed to show.", InMobiMediationAdapter.ERROR_DOMAIN).getMessage());
        }

        @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
        public void onAdDisplayed(InMobiInterstitial inMobiInterstitial, AdMetaInfo adMetaInfo) {
            Log.d(InMobiAdapter.f20590j, "InMobi interstitial has been shown.");
            InMobiAdapter.this.f20593d.onAdOpened(InMobiAdapter.this);
        }

        @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
        public void onAdWillDisplay(InMobiInterstitial inMobiInterstitial) {
            Log.d(InMobiAdapter.f20590j, "InMobi interstitial ad will be shown.");
        }

        @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
        public void onRewardsUnlocked(InMobiInterstitial inMobiInterstitial, Map<Object, Object> map) {
        }

        @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
        public void onUserLeftApplication(InMobiInterstitial inMobiInterstitial) {
            Log.d(InMobiAdapter.f20590j, "InMobi interstitial left application.");
            InMobiAdapter.this.f20593d.onAdLeftApplication(InMobiAdapter.this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class f extends NativeAdEventListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f20616a;

        f(Context context) {
            this.f20616a = context;
        }

        @Override // com.inmobi.ads.listeners.NativeAdEventListener, com.inmobi.media.bs
        /* renamed from: a */
        public void onAdLoadFailed(InMobiNative inMobiNative, InMobiAdRequestStatus inMobiAdRequestStatus) {
            AdError adError = new AdError(com.google.ads.mediation.inmobi.b.g(inMobiAdRequestStatus), inMobiAdRequestStatus.getMessage(), InMobiMediationAdapter.INMOBI_SDK_ERROR_DOMAIN);
            Log.w(InMobiAdapter.f20590j, adError.getMessage());
            InMobiAdapter.this.f20594e.onAdFailedToLoad(InMobiAdapter.this, adError);
        }

        @Override // com.inmobi.ads.listeners.NativeAdEventListener, com.inmobi.media.bs
        /* renamed from: b */
        public void onAdLoadSucceeded(InMobiNative inMobiNative, AdMetaInfo adMetaInfo) {
            Log.d(InMobiAdapter.f20590j, "InMobi native ad has been loaded.");
            new i(InMobiAdapter.this, inMobiNative, Boolean.valueOf(InMobiAdapter.this.f20597h.getNativeAdRequestOptions().shouldReturnUrlsForImageAssets()), InMobiAdapter.this.f20594e).d(this.f20616a);
        }

        @Override // com.inmobi.ads.listeners.NativeAdEventListener
        public void onAdClicked(InMobiNative inMobiNative) {
            Log.d(InMobiAdapter.f20590j, "InMobi native ad has been clicked.");
            InMobiAdapter.this.f20594e.onAdClicked(InMobiAdapter.this);
        }

        @Override // com.inmobi.ads.listeners.NativeAdEventListener
        public void onAdFullScreenDismissed(InMobiNative inMobiNative) {
            Log.d(InMobiAdapter.f20590j, "InMobi native ad has been dismissed.");
            InMobiAdapter.this.f20594e.onAdClosed(InMobiAdapter.this);
        }

        @Override // com.inmobi.ads.listeners.NativeAdEventListener
        public void onAdFullScreenDisplayed(InMobiNative inMobiNative) {
            Log.d(InMobiAdapter.f20590j, "InMobi native ad opened.");
            InMobiAdapter.this.f20594e.onAdOpened(InMobiAdapter.this);
        }

        @Override // com.inmobi.ads.listeners.NativeAdEventListener
        public void onAdFullScreenWillDisplay(InMobiNative inMobiNative) {
        }

        @Override // com.inmobi.ads.listeners.NativeAdEventListener
        public void onAdImpressed(InMobiNative inMobiNative) {
            Log.d(InMobiAdapter.f20590j, "InMobi native ad impression occurred.");
            InMobiAdapter.this.f20594e.onAdImpression(InMobiAdapter.this);
        }

        @Override // com.inmobi.ads.listeners.NativeAdEventListener
        public void onAdStatusChanged(InMobiNative inMobiNative) {
        }

        @Override // com.inmobi.ads.listeners.NativeAdEventListener
        public void onUserWillLeaveApplication(InMobiNative inMobiNative) {
            Log.d(InMobiAdapter.f20590j, "InMobi native ad left application.");
            InMobiAdapter.this.f20594e.onAdLeftApplication(InMobiAdapter.this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class g extends VideoEventListener {
        g() {
        }

        @Override // com.inmobi.ads.listeners.VideoEventListener
        public void onVideoCompleted(InMobiNative inMobiNative) {
            super.onVideoCompleted(inMobiNative);
            Log.d(InMobiAdapter.f20590j, "InMobi native video ad completed.");
            InMobiAdapter.this.f20594e.onVideoEnd(InMobiAdapter.this);
        }

        @Override // com.inmobi.ads.listeners.VideoEventListener
        public void onVideoSkipped(InMobiNative inMobiNative) {
            super.onVideoSkipped(inMobiNative);
            Log.d(InMobiAdapter.f20590j, "InMobi native video ad skipped.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(Context context, long j10, AdSize adSize, MediationAdRequest mediationAdRequest, Bundle bundle) {
        if (j10 <= 0) {
            AdError adError = new AdError(100, "Missing or Invalid Placement ID.", InMobiMediationAdapter.ERROR_DOMAIN);
            Log.w(f20590j, adError.getMessage());
            this.f20592c.onAdFailedToLoad(this, adError);
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(adSize.getWidthInPixels(context), adSize.getHeightInPixels(context));
        try {
            InMobiBanner inMobiBanner = new InMobiBanner(context, j10);
            inMobiBanner.setEnableAutoRefresh(false);
            inMobiBanner.setAnimationType(InMobiBanner.AnimationType.ANIMATION_OFF);
            Set<String> keywords = mediationAdRequest.getKeywords();
            if (keywords != null) {
                inMobiBanner.setKeywords(TextUtils.join(", ", keywords));
            }
            inMobiBanner.setExtras(com.google.ads.mediation.inmobi.b.c(mediationAdRequest));
            if (bundle == null) {
                bundle = new Bundle();
            }
            inMobiBanner.setListener(new d());
            if (f20591k.booleanValue()) {
                inMobiBanner.disableHardwareAcceleration();
            }
            FrameLayout frameLayout = new FrameLayout(context);
            this.f20596g = frameLayout;
            frameLayout.setLayoutParams(layoutParams);
            inMobiBanner.setLayoutParams(new LinearLayout.LayoutParams(adSize.getWidthInPixels(context), adSize.getHeightInPixels(context)));
            this.f20596g.addView(inMobiBanner);
            com.google.ads.mediation.inmobi.b.a(bundle);
            String str = f20590j;
            Log.d(str, "Requesting banner with ad size: " + adSize);
            inMobiBanner.load();
        } catch (SdkNotInitializedException e10) {
            AdError adError2 = new AdError(104, e10.getLocalizedMessage(), InMobiMediationAdapter.ERROR_DOMAIN);
            Log.w(f20590j, adError2.getMessage());
            this.f20592c.onAdFailedToLoad(this, adError2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(Context context, long j10, MediationAdRequest mediationAdRequest, Bundle bundle) {
        if (j10 <= 0) {
            AdError adError = new AdError(100, "Missing or Invalid Placement ID.", InMobiMediationAdapter.ERROR_DOMAIN);
            Log.w(f20590j, adError.getMessage());
            this.f20593d.onAdFailedToLoad(this, adError);
            return;
        }
        try {
            this.f20595f = new InMobiInterstitial(context, j10, new e());
            Set<String> keywords = mediationAdRequest.getKeywords();
            if (keywords != null) {
                this.f20595f.setKeywords(TextUtils.join(", ", keywords));
            }
            this.f20595f.setExtras(com.google.ads.mediation.inmobi.b.c(mediationAdRequest));
            if (f20591k.booleanValue()) {
                this.f20595f.disableHardwareAcceleration();
            }
            com.google.ads.mediation.inmobi.b.a(bundle);
            this.f20595f.load();
        } catch (SdkNotInitializedException e10) {
            AdError adError2 = new AdError(104, e10.getLocalizedMessage(), InMobiMediationAdapter.ERROR_DOMAIN);
            Log.w(f20590j, adError2.getMessage());
            this.f20593d.onAdFailedToLoad(this, adError2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(Context context, long j10, NativeMediationAdRequest nativeMediationAdRequest, Bundle bundle) {
        if (j10 <= 0) {
            AdError adError = new AdError(100, "Missing or Invalid Placement ID.", InMobiMediationAdapter.ERROR_DOMAIN);
            Log.w(f20590j, adError.getMessage());
            this.f20594e.onAdFailedToLoad(this, adError);
            return;
        }
        try {
            InMobiNative inMobiNative = new InMobiNative(context, j10, new f(context));
            this.f20598i = inMobiNative;
            inMobiNative.setVideoEventListener(new g());
            Set<String> keywords = nativeMediationAdRequest.getKeywords();
            if (keywords != null) {
                this.f20598i.setKeywords(TextUtils.join(", ", keywords));
            }
            this.f20598i.setExtras(com.google.ads.mediation.inmobi.b.c(nativeMediationAdRequest));
            com.google.ads.mediation.inmobi.b.a(bundle);
            this.f20598i.load();
        } catch (SdkNotInitializedException e10) {
            AdError adError2 = new AdError(104, e10.getLocalizedMessage(), InMobiMediationAdapter.ERROR_DOMAIN);
            Log.w(f20590j, adError2.getMessage());
            this.f20594e.onAdFailedToLoad(this, adError2);
        }
    }

    private AdSize l(Context context, AdSize adSize) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new AdSize(320, 50));
        arrayList.add(new AdSize(ms.bd.o.Pgl.c.COLLECT_MODE_FINANCE, IronSourceConstants.INTERSTITIAL_DAILY_CAPPED));
        arrayList.add(new AdSize(728, 90));
        return MediationUtils.findClosestSize(context, adSize, arrayList);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public View getBannerView() {
        return this.f20596g;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onDestroy() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onPause() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onResume() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(Context context, MediationBannerListener mediationBannerListener, Bundle bundle, AdSize adSize, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        AdSize l10 = l(context, adSize);
        if (l10 == null) {
            String format = String.format("InMobi SDK supported banner sizes are not valid for the requested size: %s", adSize);
            AdError adError = new AdError(102, format, InMobiMediationAdapter.ERROR_DOMAIN);
            Log.w(f20590j, format);
            mediationBannerListener.onAdFailedToLoad(this, adError);
            return;
        }
        String string = bundle.getString("accountid");
        if (TextUtils.isEmpty(string)) {
            AdError adError2 = new AdError(100, "Missing or Invalid Account ID.", InMobiMediationAdapter.ERROR_DOMAIN);
            Log.w(f20590j, adError2.getMessage());
            mediationBannerListener.onAdFailedToLoad(this, adError2);
            return;
        }
        this.f20592c = mediationBannerListener;
        com.google.ads.mediation.inmobi.d.c().d(context, string, new a(context, com.google.ads.mediation.inmobi.b.h(bundle), l10, mediationAdRequest, bundle2));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(Context context, MediationInterstitialListener mediationInterstitialListener, Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        String string = bundle.getString("accountid");
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(100, "Missing or Invalid Account ID.", InMobiMediationAdapter.ERROR_DOMAIN);
            Log.w(f20590j, adError.getMessage());
            mediationInterstitialListener.onAdFailedToLoad(this, adError);
            return;
        }
        this.f20593d = mediationInterstitialListener;
        com.google.ads.mediation.inmobi.d.c().d(context, string, new b(context, com.google.ads.mediation.inmobi.b.h(bundle), mediationAdRequest, bundle2));
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void requestNativeAd(Context context, MediationNativeListener mediationNativeListener, Bundle bundle, NativeMediationAdRequest nativeMediationAdRequest, Bundle bundle2) {
        if (!nativeMediationAdRequest.isUnifiedNativeAdRequested()) {
            AdError adError = new AdError(103, "Unified Native Ad should be requested.", InMobiMediationAdapter.ERROR_DOMAIN);
            Log.w(f20590j, adError.getMessage());
            mediationNativeListener.onAdFailedToLoad(this, adError);
            return;
        }
        String string = bundle.getString("accountid");
        if (TextUtils.isEmpty(string)) {
            AdError adError2 = new AdError(100, "Missing or Invalid Account ID.", InMobiMediationAdapter.ERROR_DOMAIN);
            Log.w(f20590j, adError2.getMessage());
            mediationNativeListener.onAdFailedToLoad(this, adError2);
            return;
        }
        this.f20594e = mediationNativeListener;
        this.f20597h = nativeMediationAdRequest;
        com.google.ads.mediation.inmobi.d.c().d(context, string, new c(context, com.google.ads.mediation.inmobi.b.h(bundle), bundle2));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        if (!this.f20595f.isReady()) {
            Log.w(f20590j, new AdError(105, "InMobi Interstitial ad is not yet ready to be shown.", InMobiMediationAdapter.ERROR_DOMAIN).getMessage());
            return;
        }
        this.f20595f.show();
    }
}
