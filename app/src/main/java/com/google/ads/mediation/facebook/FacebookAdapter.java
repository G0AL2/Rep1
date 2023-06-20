package com.google.ads.mediation.facebook;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.Keep;
import com.facebook.ads.Ad;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.AdSettings;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdExtendedListener;
import com.facebook.ads.MediaView;
import com.facebook.ads.MediaViewListener;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeBannerAd;
import com.google.ads.mediation.facebook.a;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.MediationUtils;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

@Keep
/* loaded from: classes2.dex */
public final class FacebookAdapter extends FacebookMediationAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter {
    public static final String KEY_ID = "id";
    public static final String KEY_SOCIAL_CONTEXT_ASSET = "social_context";
    private static final int MAX_STAR_RATING = 5;
    private boolean isNativeBanner;
    private AdView mAdView;
    private MediationBannerListener mBannerListener;
    private InterstitialAd mInterstitialAd;
    private MediationInterstitialListener mInterstitialListener;
    private boolean mIsImpressionRecorded;
    private MediaView mMediaView;
    private NativeAd mNativeAd;
    private NativeBannerAd mNativeBannerAd;
    private MediationNativeListener mNativeListener;
    private FrameLayout mWrappedAdView;
    private final AtomicBoolean showInterstitialCalled = new AtomicBoolean();
    private final AtomicBoolean didInterstitialAdClose = new AtomicBoolean();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements a.InterfaceC0276a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f20504a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f20505b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ AdSize f20506c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ MediationAdRequest f20507d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ com.google.android.gms.ads.AdSize f20508e;

        a(Context context, String str, AdSize adSize, MediationAdRequest mediationAdRequest, com.google.android.gms.ads.AdSize adSize2) {
            this.f20504a = context;
            this.f20505b = str;
            this.f20506c = adSize;
            this.f20507d = mediationAdRequest;
            this.f20508e = adSize2;
        }

        @Override // com.google.ads.mediation.facebook.a.InterfaceC0276a
        public void a(AdError adError) {
            if (FacebookAdapter.this.mBannerListener != null) {
                FacebookAdapter.this.mBannerListener.onAdFailedToLoad(FacebookAdapter.this, adError);
            }
        }

        @Override // com.google.ads.mediation.facebook.a.InterfaceC0276a
        public void b() {
            FacebookAdapter.this.mAdView = new AdView(this.f20504a, this.f20505b, this.f20506c);
            FacebookAdapter.this.buildAdRequest(this.f20507d);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f20508e.getWidthInPixels(this.f20504a), -2);
            FacebookAdapter.this.mWrappedAdView = new FrameLayout(this.f20504a);
            FacebookAdapter.this.mAdView.setLayoutParams(layoutParams);
            FacebookAdapter.this.mWrappedAdView.addView(FacebookAdapter.this.mAdView);
            FacebookAdapter.this.mAdView.loadAd(FacebookAdapter.this.mAdView.buildLoadAdConfig().withAdListener(new d(FacebookAdapter.this, null)).build());
        }
    }

    /* loaded from: classes2.dex */
    class b implements a.InterfaceC0276a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f20510a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f20511b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ MediationAdRequest f20512c;

        b(Context context, String str, MediationAdRequest mediationAdRequest) {
            this.f20510a = context;
            this.f20511b = str;
            this.f20512c = mediationAdRequest;
        }

        @Override // com.google.ads.mediation.facebook.a.InterfaceC0276a
        public void a(AdError adError) {
            if (FacebookAdapter.this.mInterstitialListener != null) {
                FacebookAdapter.this.mInterstitialListener.onAdFailedToLoad(FacebookAdapter.this, adError);
            }
        }

        @Override // com.google.ads.mediation.facebook.a.InterfaceC0276a
        public void b() {
            FacebookAdapter.this.createAndLoadInterstitial(this.f20510a, this.f20511b, this.f20512c);
        }
    }

    /* loaded from: classes2.dex */
    class c implements a.InterfaceC0276a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f20514a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f20515b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ NativeMediationAdRequest f20516c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Bundle f20517d;

        c(Context context, String str, NativeMediationAdRequest nativeMediationAdRequest, Bundle bundle) {
            this.f20514a = context;
            this.f20515b = str;
            this.f20516c = nativeMediationAdRequest;
            this.f20517d = bundle;
        }

        @Override // com.google.ads.mediation.facebook.a.InterfaceC0276a
        public void a(AdError adError) {
            Log.w(FacebookMediationAdapter.TAG, adError.getMessage());
            if (FacebookAdapter.this.mNativeListener != null) {
                FacebookAdapter.this.mNativeListener.onAdFailedToLoad(FacebookAdapter.this, adError);
            }
        }

        @Override // com.google.ads.mediation.facebook.a.InterfaceC0276a
        public void b() {
            FacebookAdapter.this.createAndLoadNativeAd(this.f20514a, this.f20515b, this.f20516c, this.f20517d);
        }
    }

    /* loaded from: classes2.dex */
    private class d implements AdListener {
        /* synthetic */ d(FacebookAdapter facebookAdapter, a aVar) {
            this();
        }

        @Override // com.facebook.ads.AdListener
        public void onAdClicked(Ad ad2) {
            FacebookAdapter.this.mBannerListener.onAdClicked(FacebookAdapter.this);
            FacebookAdapter.this.mBannerListener.onAdOpened(FacebookAdapter.this);
            FacebookAdapter.this.mBannerListener.onAdLeftApplication(FacebookAdapter.this);
        }

        @Override // com.facebook.ads.AdListener
        public void onAdLoaded(Ad ad2) {
            FacebookAdapter.this.mBannerListener.onAdLoaded(FacebookAdapter.this);
        }

        @Override // com.facebook.ads.AdListener
        public void onError(Ad ad2, com.facebook.ads.AdError adError) {
            AdError adError2 = FacebookMediationAdapter.getAdError(adError);
            Log.w(FacebookMediationAdapter.TAG, adError2.getMessage());
            FacebookAdapter.this.mBannerListener.onAdFailedToLoad(FacebookAdapter.this, adError2);
        }

        @Override // com.facebook.ads.AdListener
        public void onLoggingImpression(Ad ad2) {
        }

        private d() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class e extends NativeAd.Image {

        /* renamed from: a  reason: collision with root package name */
        private Drawable f20520a;

        /* renamed from: b  reason: collision with root package name */
        private Uri f20521b;

        public e(FacebookAdapter facebookAdapter) {
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public Drawable getDrawable() {
            return this.f20520a;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public double getScale() {
            return 1.0d;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public Uri getUri() {
            return this.f20521b;
        }

        public e(FacebookAdapter facebookAdapter, Uri uri) {
            this.f20521b = uri;
        }

        public e(FacebookAdapter facebookAdapter, Drawable drawable) {
            this.f20520a = drawable;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class f implements InterstitialAdExtendedListener {
        /* synthetic */ f(FacebookAdapter facebookAdapter, a aVar) {
            this();
        }

        @Override // com.facebook.ads.AdListener
        public void onAdClicked(Ad ad2) {
            FacebookAdapter.this.mInterstitialListener.onAdClicked(FacebookAdapter.this);
            FacebookAdapter.this.mInterstitialListener.onAdLeftApplication(FacebookAdapter.this);
        }

        @Override // com.facebook.ads.AdListener
        public void onAdLoaded(Ad ad2) {
            FacebookAdapter.this.mInterstitialListener.onAdLoaded(FacebookAdapter.this);
        }

        @Override // com.facebook.ads.AdListener
        public void onError(Ad ad2, com.facebook.ads.AdError adError) {
            Log.w(FacebookMediationAdapter.TAG, FacebookMediationAdapter.getAdError(adError).getMessage());
            if (FacebookAdapter.this.showInterstitialCalled.get()) {
                FacebookAdapter.this.mInterstitialListener.onAdOpened(FacebookAdapter.this);
                FacebookAdapter.this.mInterstitialListener.onAdClosed(FacebookAdapter.this);
                return;
            }
            FacebookAdapter.this.mInterstitialListener.onAdFailedToLoad(FacebookAdapter.this, adError.getErrorCode());
        }

        @Override // com.facebook.ads.InterstitialAdExtendedListener
        public void onInterstitialActivityDestroyed() {
            if (FacebookAdapter.this.didInterstitialAdClose.getAndSet(true)) {
                return;
            }
            FacebookAdapter.this.mInterstitialListener.onAdClosed(FacebookAdapter.this);
        }

        @Override // com.facebook.ads.InterstitialAdListener
        public void onInterstitialDismissed(Ad ad2) {
            if (FacebookAdapter.this.didInterstitialAdClose.getAndSet(true)) {
                return;
            }
            FacebookAdapter.this.mInterstitialListener.onAdClosed(FacebookAdapter.this);
        }

        @Override // com.facebook.ads.InterstitialAdListener
        public void onInterstitialDisplayed(Ad ad2) {
            FacebookAdapter.this.mInterstitialListener.onAdOpened(FacebookAdapter.this);
        }

        @Override // com.facebook.ads.AdListener
        public void onLoggingImpression(Ad ad2) {
        }

        @Override // com.facebook.ads.RewardedAdListener
        public void onRewardedAdCompleted() {
        }

        @Override // com.facebook.ads.RewardedAdListener
        public void onRewardedAdServerFailed() {
        }

        @Override // com.facebook.ads.RewardedAdListener
        public void onRewardedAdServerSucceeded() {
        }

        private f() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public interface g {
        void a(AdError adError);

        void b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class h implements AdListener, NativeAdListener {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<Context> f20523a;

        /* renamed from: b  reason: collision with root package name */
        private final NativeBannerAd f20524b;

        /* loaded from: classes2.dex */
        class a implements g {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ j f20526a;

            a(j jVar) {
                this.f20526a = jVar;
            }

            @Override // com.google.ads.mediation.facebook.FacebookAdapter.g
            public void a(AdError adError) {
                Log.w(FacebookMediationAdapter.TAG, adError.getMessage());
                FacebookAdapter.this.mNativeListener.onAdFailedToLoad(FacebookAdapter.this, adError);
            }

            @Override // com.google.ads.mediation.facebook.FacebookAdapter.g
            public void b() {
                FacebookAdapter.this.mNativeListener.onAdLoaded(FacebookAdapter.this, this.f20526a);
            }
        }

        /* synthetic */ h(FacebookAdapter facebookAdapter, Context context, NativeBannerAd nativeBannerAd, a aVar) {
            this(context, nativeBannerAd);
        }

        @Override // com.facebook.ads.AdListener
        public void onAdClicked(Ad ad2) {
            FacebookAdapter.this.mNativeListener.onAdClicked(FacebookAdapter.this);
            FacebookAdapter.this.mNativeListener.onAdOpened(FacebookAdapter.this);
            FacebookAdapter.this.mNativeListener.onAdLeftApplication(FacebookAdapter.this);
        }

        @Override // com.facebook.ads.AdListener
        public void onAdLoaded(Ad ad2) {
            if (ad2 != this.f20524b) {
                FacebookAdapter.this.mNativeListener.onAdFailedToLoad(FacebookAdapter.this, new AdError(106, "Ad loaded is not a native banner ad.", FacebookMediationAdapter.ERROR_DOMAIN));
                return;
            }
            Context context = this.f20523a.get();
            if (context == null) {
                FacebookAdapter.this.mNativeListener.onAdFailedToLoad(FacebookAdapter.this, new AdError(107, "Failed to create ad options view. Context is null.", FacebookMediationAdapter.ERROR_DOMAIN));
                return;
            }
            j jVar = new j(this.f20524b);
            jVar.d(context, new a(jVar));
        }

        @Override // com.facebook.ads.AdListener
        public void onError(Ad ad2, com.facebook.ads.AdError adError) {
            AdError adError2 = FacebookMediationAdapter.getAdError(adError);
            Log.w(FacebookMediationAdapter.TAG, adError2.getMessage());
            FacebookAdapter.this.mNativeListener.onAdFailedToLoad(FacebookAdapter.this, adError2);
        }

        @Override // com.facebook.ads.AdListener
        public void onLoggingImpression(Ad ad2) {
            if (!FacebookAdapter.this.mIsImpressionRecorded) {
                FacebookAdapter.this.mNativeListener.onAdImpression(FacebookAdapter.this);
                FacebookAdapter.this.mIsImpressionRecorded = true;
                return;
            }
            Log.d(FacebookMediationAdapter.TAG, "Received onLoggingImpression callback for a native whose impression is already recorded. Ignoring the duplicate callback.");
        }

        @Override // com.facebook.ads.NativeAdListener
        public void onMediaDownloaded(Ad ad2) {
            Log.d(FacebookMediationAdapter.TAG, "onMediaDownloaded");
        }

        private h(Context context, NativeBannerAd nativeBannerAd) {
            this.f20523a = new WeakReference<>(context);
            this.f20524b = nativeBannerAd;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class i implements AdListener, NativeAdListener {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<Context> f20528a;

        /* renamed from: b  reason: collision with root package name */
        private final com.facebook.ads.NativeAd f20529b;

        /* loaded from: classes2.dex */
        class a implements g {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ j f20531a;

            a(j jVar) {
                this.f20531a = jVar;
            }

            @Override // com.google.ads.mediation.facebook.FacebookAdapter.g
            public void a(AdError adError) {
                Log.w(FacebookMediationAdapter.TAG, adError.getMessage());
                FacebookAdapter.this.mNativeListener.onAdFailedToLoad(FacebookAdapter.this, adError);
            }

            @Override // com.google.ads.mediation.facebook.FacebookAdapter.g
            public void b() {
                FacebookAdapter.this.mNativeListener.onAdLoaded(FacebookAdapter.this, this.f20531a);
            }
        }

        /* synthetic */ i(FacebookAdapter facebookAdapter, Context context, com.facebook.ads.NativeAd nativeAd, a aVar) {
            this(context, nativeAd);
        }

        @Override // com.facebook.ads.AdListener
        public void onAdClicked(Ad ad2) {
            FacebookAdapter.this.mNativeListener.onAdClicked(FacebookAdapter.this);
            FacebookAdapter.this.mNativeListener.onAdOpened(FacebookAdapter.this);
            FacebookAdapter.this.mNativeListener.onAdLeftApplication(FacebookAdapter.this);
        }

        @Override // com.facebook.ads.AdListener
        public void onAdLoaded(Ad ad2) {
            if (ad2 != this.f20529b) {
                AdError adError = new AdError(106, "Ad loaded is not a native ad.", FacebookMediationAdapter.ERROR_DOMAIN);
                Log.w(FacebookMediationAdapter.TAG, adError.getMessage());
                FacebookAdapter.this.mNativeListener.onAdFailedToLoad(FacebookAdapter.this, adError);
                return;
            }
            Context context = this.f20528a.get();
            if (context == null) {
                AdError adError2 = new AdError(107, "Failed to create ad options view. Context is null", FacebookMediationAdapter.ERROR_DOMAIN);
                Log.w(FacebookMediationAdapter.TAG, adError2.getMessage());
                FacebookAdapter.this.mNativeListener.onAdFailedToLoad(FacebookAdapter.this, adError2);
                return;
            }
            j jVar = new j(this.f20529b);
            jVar.d(context, new a(jVar));
        }

        @Override // com.facebook.ads.AdListener
        public void onError(Ad ad2, com.facebook.ads.AdError adError) {
            AdError adError2 = FacebookMediationAdapter.getAdError(adError);
            if (!TextUtils.isEmpty(adError.getErrorMessage())) {
                Log.w(FacebookMediationAdapter.TAG, adError2.getMessage());
            }
            FacebookAdapter.this.mNativeListener.onAdFailedToLoad(FacebookAdapter.this, adError.getErrorCode());
        }

        @Override // com.facebook.ads.AdListener
        public void onLoggingImpression(Ad ad2) {
            if (!FacebookAdapter.this.mIsImpressionRecorded) {
                FacebookAdapter.this.mNativeListener.onAdImpression(FacebookAdapter.this);
                FacebookAdapter.this.mIsImpressionRecorded = true;
                return;
            }
            Log.d(FacebookMediationAdapter.TAG, "Received onLoggingImpression callback for a native whose impression is already recorded. Ignoring the duplicate callback.");
        }

        @Override // com.facebook.ads.NativeAdListener
        public void onMediaDownloaded(Ad ad2) {
            Log.d(FacebookMediationAdapter.TAG, "onMediaDownloaded");
        }

        private i(Context context, com.facebook.ads.NativeAd nativeAd) {
            this.f20528a = new WeakReference<>(context);
            this.f20529b = nativeAd;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void buildAdRequest(MediationAdRequest mediationAdRequest) {
        if (mediationAdRequest != null) {
            if (mediationAdRequest.taggedForChildDirectedTreatment() == 1) {
                AdSettings.setMixedAudience(true);
            } else if (mediationAdRequest.taggedForChildDirectedTreatment() == 0) {
                AdSettings.setMixedAudience(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createAndLoadInterstitial(Context context, String str, MediationAdRequest mediationAdRequest) {
        this.mInterstitialAd = new InterstitialAd(context, str);
        buildAdRequest(mediationAdRequest);
        InterstitialAd interstitialAd = this.mInterstitialAd;
        interstitialAd.loadAd(interstitialAd.buildLoadAdConfig().withAdListener(new f(this, null)).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createAndLoadNativeAd(Context context, String str, NativeMediationAdRequest nativeMediationAdRequest, Bundle bundle) {
        if (bundle != null) {
            this.isNativeBanner = bundle.getBoolean("native_banner");
        }
        if (this.isNativeBanner) {
            this.mNativeBannerAd = new NativeBannerAd(context, str);
            buildAdRequest(nativeMediationAdRequest);
            NativeBannerAd nativeBannerAd = this.mNativeBannerAd;
            nativeBannerAd.loadAd(nativeBannerAd.buildLoadAdConfig().withAdListener(new h(this, context, this.mNativeBannerAd, null)).withMediaCacheFlag(NativeAdBase.MediaCacheFlag.ALL).withPreloadedIconView(-1, -1).build());
            return;
        }
        this.mMediaView = new MediaView(context);
        this.mNativeAd = new com.facebook.ads.NativeAd(context, str);
        buildAdRequest(nativeMediationAdRequest);
        com.facebook.ads.NativeAd nativeAd = this.mNativeAd;
        nativeAd.loadAd(nativeAd.buildLoadAdConfig().withAdListener(new i(this, context, this.mNativeAd, null)).withMediaCacheFlag(NativeAdBase.MediaCacheFlag.ALL).withPreloadedIconView(-1, -1).build());
    }

    private AdSize getAdSize(Context context, com.google.android.gms.ads.AdSize adSize) {
        int width = adSize.getWidth();
        if (width < 0) {
            width = Math.round(adSize.getWidthInPixels(context) / context.getResources().getDisplayMetrics().density);
        }
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(0, new com.google.android.gms.ads.AdSize(width, 50));
        arrayList.add(1, new com.google.android.gms.ads.AdSize(width, 90));
        arrayList.add(2, new com.google.android.gms.ads.AdSize(width, IronSourceConstants.INTERSTITIAL_DAILY_CAPPED));
        String str = FacebookMediationAdapter.TAG;
        Log.i(str, "Potential ad sizes: " + arrayList);
        com.google.android.gms.ads.AdSize findClosestSize = MediationUtils.findClosestSize(context, adSize, arrayList);
        if (findClosestSize == null) {
            return null;
        }
        Log.i(str, "Found closest ad size: " + findClosestSize);
        int height = findClosestSize.getHeight();
        AdSize adSize2 = AdSize.BANNER_HEIGHT_50;
        if (height == adSize2.getHeight()) {
            return adSize2;
        }
        AdSize adSize3 = AdSize.BANNER_HEIGHT_90;
        if (height == adSize3.getHeight()) {
            return adSize3;
        }
        AdSize adSize4 = AdSize.RECTANGLE_HEIGHT_250;
        if (height == adSize4.getHeight()) {
            return adSize4;
        }
        return null;
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public View getBannerView() {
        return this.mWrappedAdView;
    }

    @Override // com.google.ads.mediation.facebook.FacebookMediationAdapter, com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        Log.w(FacebookMediationAdapter.TAG, "Facebook waterfall mediation is deprecated and will be removed in a future adapter version. Please update to serve bidding ads instead. See https://fb.me/bNFn7qt6Z0sKtF for more information.");
        super.loadRewardedAd(mediationRewardedAdConfiguration, mediationAdLoadCallback);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onDestroy() {
        AdView adView = this.mAdView;
        if (adView != null) {
            adView.destroy();
        }
        InterstitialAd interstitialAd = this.mInterstitialAd;
        if (interstitialAd != null) {
            interstitialAd.destroy();
        }
        com.facebook.ads.NativeAd nativeAd = this.mNativeAd;
        if (nativeAd != null) {
            nativeAd.unregisterView();
            this.mNativeAd.destroy();
        }
        MediaView mediaView = this.mMediaView;
        if (mediaView != null) {
            mediaView.destroy();
        }
        NativeBannerAd nativeBannerAd = this.mNativeBannerAd;
        if (nativeBannerAd != null) {
            nativeBannerAd.unregisterView();
            this.mNativeBannerAd.destroy();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onPause() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onResume() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(Context context, MediationBannerListener mediationBannerListener, Bundle bundle, com.google.android.gms.ads.AdSize adSize, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        String str = FacebookMediationAdapter.TAG;
        Log.w(str, "Facebook waterfall mediation is deprecated and will be removed in a future adapter version. Please update to serve bidding ads instead. See https://fb.me/bNFn7qt6Z0sKtF for more information.");
        this.mBannerListener = mediationBannerListener;
        String placementID = FacebookMediationAdapter.getPlacementID(bundle);
        if (TextUtils.isEmpty(placementID)) {
            AdError adError = new AdError(101, "Failed to request ad. PlacementID is null or empty.", FacebookMediationAdapter.ERROR_DOMAIN);
            Log.w(str, adError.getMessage());
            this.mBannerListener.onAdFailedToLoad(this, adError);
            return;
        }
        AdSize adSize2 = getAdSize(context, adSize);
        if (adSize2 == null) {
            AdError adError2 = new AdError(102, "There is no matching Facebook ad size for Google ad size.", FacebookMediationAdapter.ERROR_DOMAIN);
            Log.w(str, adError2.getMessage());
            this.mBannerListener.onAdFailedToLoad(this, adError2);
            return;
        }
        com.google.ads.mediation.facebook.a.a().b(context, placementID, new a(context, placementID, adSize2, mediationAdRequest, adSize));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(Context context, MediationInterstitialListener mediationInterstitialListener, Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        Log.w(FacebookMediationAdapter.TAG, "Facebook waterfall mediation is deprecated and will be removed in a future adapter version. Please update to serve bidding ads instead. See https://fb.me/bNFn7qt6Z0sKtF for more information.");
        this.mInterstitialListener = mediationInterstitialListener;
        String placementID = FacebookMediationAdapter.getPlacementID(bundle);
        if (TextUtils.isEmpty(placementID)) {
            this.mInterstitialListener.onAdFailedToLoad(this, new AdError(101, "Failed to request ad. PlacementID is null or empty.", FacebookMediationAdapter.ERROR_DOMAIN));
            return;
        }
        com.google.ads.mediation.facebook.a.a().b(context, placementID, new b(context, placementID, mediationAdRequest));
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void requestNativeAd(Context context, MediationNativeListener mediationNativeListener, Bundle bundle, NativeMediationAdRequest nativeMediationAdRequest, Bundle bundle2) {
        String str = FacebookMediationAdapter.TAG;
        Log.w(str, "Facebook waterfall mediation is deprecated and will be removed in a future adapter version. Please update to serve bidding ads instead. See https://fb.me/bNFn7qt6Z0sKtF for more information.");
        this.mNativeListener = mediationNativeListener;
        String placementID = FacebookMediationAdapter.getPlacementID(bundle);
        if (TextUtils.isEmpty(placementID)) {
            AdError adError = new AdError(101, "Failed to request ad. PlacementID is null or empty.", FacebookMediationAdapter.ERROR_DOMAIN);
            Log.w(str, adError.getMessage());
            this.mNativeListener.onAdFailedToLoad(this, adError);
        } else if (!nativeMediationAdRequest.isUnifiedNativeAdRequested()) {
            AdError adError2 = new AdError(105, "Unified Native Ads should be requested.", FacebookMediationAdapter.ERROR_DOMAIN);
            Log.w(str, adError2.getMessage());
            this.mNativeListener.onAdFailedToLoad(this, adError2);
        } else {
            com.google.ads.mediation.facebook.a.a().b(context, placementID, new c(context, placementID, nativeMediationAdRequest, bundle2));
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        this.showInterstitialCalled.set(true);
        if (this.mInterstitialAd.show()) {
            return;
        }
        Log.w(FacebookMediationAdapter.TAG, new AdError(110, "Failed to present interstitial ad.", FacebookMediationAdapter.ERROR_DOMAIN).getMessage());
        MediationInterstitialListener mediationInterstitialListener = this.mInterstitialListener;
        if (mediationInterstitialListener != null) {
            mediationInterstitialListener.onAdOpened(this);
            this.mInterstitialListener.onAdClosed(this);
        }
    }

    /* loaded from: classes2.dex */
    class j extends UnifiedNativeAdMapper {

        /* renamed from: a  reason: collision with root package name */
        private com.facebook.ads.NativeAd f20533a;

        /* renamed from: b  reason: collision with root package name */
        private NativeBannerAd f20534b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes2.dex */
        public class a implements MediaViewListener {
            a() {
            }

            @Override // com.facebook.ads.MediaViewListener
            public void onComplete(MediaView mediaView) {
                if (FacebookAdapter.this.mNativeListener != null) {
                    FacebookAdapter.this.mNativeListener.onVideoEnd(FacebookAdapter.this);
                }
            }

            @Override // com.facebook.ads.MediaViewListener
            public void onEnterFullscreen(MediaView mediaView) {
            }

            @Override // com.facebook.ads.MediaViewListener
            public void onExitFullscreen(MediaView mediaView) {
            }

            @Override // com.facebook.ads.MediaViewListener
            public void onFullscreenBackground(MediaView mediaView) {
            }

            @Override // com.facebook.ads.MediaViewListener
            public void onFullscreenForeground(MediaView mediaView) {
            }

            @Override // com.facebook.ads.MediaViewListener
            public void onPause(MediaView mediaView) {
            }

            @Override // com.facebook.ads.MediaViewListener
            public void onPlay(MediaView mediaView) {
            }

            @Override // com.facebook.ads.MediaViewListener
            public void onVolumeChange(MediaView mediaView, float f10) {
            }
        }

        public j(com.facebook.ads.NativeAd nativeAd) {
            this.f20533a = nativeAd;
        }

        private boolean a(NativeBannerAd nativeBannerAd) {
            return (nativeBannerAd.getAdHeadline() == null || nativeBannerAd.getAdBodyText() == null || nativeBannerAd.getAdIcon() == null || nativeBannerAd.getAdCallToAction() == null) ? false : true;
        }

        private boolean b(com.facebook.ads.NativeAd nativeAd) {
            return (nativeAd.getAdHeadline() == null || nativeAd.getAdCoverImage() == null || nativeAd.getAdBodyText() == null || nativeAd.getAdIcon() == null || nativeAd.getAdCallToAction() == null || FacebookAdapter.this.mMediaView == null) ? false : true;
        }

        private Double c(NativeAdBase.Rating rating) {
            if (rating == null) {
                return null;
            }
            return Double.valueOf((rating.getValue() * 5.0d) / rating.getScale());
        }

        public void d(Context context, g gVar) {
            AdOptionsView adOptionsView;
            if (FacebookAdapter.this.isNativeBanner) {
                if (!a(this.f20534b)) {
                    AdError adError = new AdError(108, "Ad from Facebook doesn't have all assets required for the Native Banner Ad format.", FacebookMediationAdapter.ERROR_DOMAIN);
                    Log.w(FacebookMediationAdapter.TAG, adError.getMessage());
                    gVar.a(adError);
                    return;
                }
                setHeadline(this.f20534b.getAdHeadline());
                setBody(this.f20534b.getAdBodyText());
                if (this.f20534b.getPreloadedIconViewDrawable() == null) {
                    if (this.f20534b.getAdIcon() == null) {
                        setIcon(new e(FacebookAdapter.this));
                    } else {
                        setIcon(new e(FacebookAdapter.this, Uri.parse(this.f20534b.getAdIcon().getUrl())));
                    }
                } else {
                    setIcon(new e(FacebookAdapter.this, this.f20534b.getPreloadedIconViewDrawable()));
                }
                setCallToAction(this.f20534b.getAdCallToAction());
                setAdvertiser(this.f20534b.getAdvertiserName());
                Bundle bundle = new Bundle();
                bundle.putCharSequence("id", this.f20534b.getId());
                bundle.putCharSequence(FacebookAdapter.KEY_SOCIAL_CONTEXT_ASSET, this.f20534b.getAdSocialContext());
                setExtras(bundle);
            } else if (!b(this.f20533a)) {
                AdError adError2 = new AdError(108, "Ad from Facebook doesn't have all assets required for the Native Banner Ad format.", FacebookMediationAdapter.ERROR_DOMAIN);
                Log.w(FacebookMediationAdapter.TAG, adError2.getMessage());
                gVar.a(adError2);
                return;
            } else {
                setHeadline(this.f20533a.getAdHeadline());
                ArrayList arrayList = new ArrayList();
                arrayList.add(new e(FacebookAdapter.this, Uri.parse(this.f20533a.getAdCoverImage().getUrl())));
                setImages(arrayList);
                setBody(this.f20533a.getAdBodyText());
                if (this.f20533a.getPreloadedIconViewDrawable() == null) {
                    if (this.f20533a.getAdIcon() == null) {
                        setIcon(new e(FacebookAdapter.this));
                    } else {
                        setIcon(new e(FacebookAdapter.this, Uri.parse(this.f20533a.getAdIcon().getUrl())));
                    }
                } else {
                    setIcon(new e(FacebookAdapter.this, this.f20533a.getPreloadedIconViewDrawable()));
                }
                setCallToAction(this.f20533a.getAdCallToAction());
                setAdvertiser(this.f20533a.getAdvertiserName());
                FacebookAdapter.this.mMediaView.setListener(new a());
                setMediaView(FacebookAdapter.this.mMediaView);
                setHasVideoContent(true);
                Double c10 = c(this.f20533a.getAdStarRating());
                if (c10 != null) {
                    setStarRating(c10);
                }
                Bundle bundle2 = new Bundle();
                bundle2.putCharSequence("id", this.f20533a.getId());
                bundle2.putCharSequence(FacebookAdapter.KEY_SOCIAL_CONTEXT_ASSET, this.f20533a.getAdSocialContext());
                setExtras(bundle2);
            }
            NativeAdLayout nativeAdLayout = new NativeAdLayout(context);
            if (FacebookAdapter.this.isNativeBanner) {
                adOptionsView = new AdOptionsView(context, this.f20534b, nativeAdLayout);
            } else {
                adOptionsView = new AdOptionsView(context, this.f20533a, nativeAdLayout);
            }
            setAdChoicesContent(adOptionsView);
            gVar.b();
        }

        @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
        public void trackViews(View view, Map<String, View> map, Map<String, View> map2) {
            setOverrideImpressionRecording(true);
            setOverrideClickHandling(true);
            ArrayList arrayList = new ArrayList();
            View view2 = null;
            for (Map.Entry<String, View> entry : map.entrySet()) {
                arrayList.add(entry.getValue());
                if (entry.getKey().equals("3003")) {
                    view2 = entry.getValue();
                }
            }
            if (!FacebookAdapter.this.isNativeBanner) {
                if (view2 instanceof ImageView) {
                    this.f20533a.registerViewForInteraction(view, FacebookAdapter.this.mMediaView, (ImageView) view2, arrayList);
                    return;
                }
                Log.w(FacebookMediationAdapter.TAG, "Native icon asset is not of type ImageView.Calling registerViewForInteraction() without a reference to the icon view.");
                this.f20533a.registerViewForInteraction(view, FacebookAdapter.this.mMediaView, arrayList);
            } else if (view2 == null) {
                Log.w(FacebookMediationAdapter.TAG, "Missing or invalid native ad icon asset. Facebook impression recording might be impacted for this ad.");
            } else if (!(view2 instanceof ImageView)) {
                Log.w(FacebookMediationAdapter.TAG, String.format("Native ad icon asset is rendered with an incompatible class type. Facebook impression recording might be impacted for this ad. Expected: ImageView, actual: %s.", view2.getClass()));
            } else {
                this.f20534b.registerViewForInteraction(view, (ImageView) view2);
            }
        }

        @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
        public void untrackView(View view) {
            NativeBannerAd nativeBannerAd;
            if (FacebookAdapter.this.isNativeBanner && (nativeBannerAd = this.f20534b) != null) {
                nativeBannerAd.unregisterView();
            } else {
                com.facebook.ads.NativeAd nativeAd = this.f20533a;
                if (nativeAd != null) {
                    nativeAd.unregisterView();
                }
            }
            super.untrackView(view);
        }

        public j(NativeBannerAd nativeBannerAd) {
            this.f20534b = nativeBannerAd;
        }
    }
}
