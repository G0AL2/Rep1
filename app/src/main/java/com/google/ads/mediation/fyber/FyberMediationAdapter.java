package com.google.ads.mediation.fyber;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListenerAdapter;
import com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListenerAdapter;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.external.InneractiveMediationName;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.MediationUtils;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.VersionInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes2.dex */
public class FyberMediationAdapter extends Adapter implements MediationBannerAdapter, MediationInterstitialAdapter {
    public static final int ERROR_AD_NOT_READY = 106;
    public static final int ERROR_BANNER_SIZE_MISMATCH = 103;
    public static final int ERROR_CONTEXT_NOT_ACTIVITY_INSTANCE = 107;
    public static final String ERROR_DOMAIN = "com.google.ads.mediation.fyber";
    public static final int ERROR_INVALID_SERVER_PARAMETERS = 101;
    public static final int ERROR_WRONG_CONTROLLER_TYPE = 105;

    /* renamed from: i  reason: collision with root package name */
    static final String f20552i = "FyberMediationAdapter";

    /* renamed from: j  reason: collision with root package name */
    private static final InneractiveMediationName f20553j = InneractiveMediationName.ADMOB;

    /* renamed from: a  reason: collision with root package name */
    private AdSize f20554a;

    /* renamed from: b  reason: collision with root package name */
    private InneractiveAdSpot f20555b;

    /* renamed from: c  reason: collision with root package name */
    private ViewGroup f20556c;

    /* renamed from: d  reason: collision with root package name */
    private MediationBannerListener f20557d;

    /* renamed from: e  reason: collision with root package name */
    private MediationInterstitialListener f20558e;

    /* renamed from: f  reason: collision with root package name */
    private WeakReference<Activity> f20559f;

    /* renamed from: g  reason: collision with root package name */
    private InneractiveAdSpot f20560g;

    /* renamed from: h  reason: collision with root package name */
    private com.google.ads.mediation.fyber.b f20561h;

    /* loaded from: classes2.dex */
    class a implements OnFyberMarketplaceInitializedListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MediationAdLoadCallback f20562a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MediationRewardedAdConfiguration f20563b;

        a(MediationAdLoadCallback mediationAdLoadCallback, MediationRewardedAdConfiguration mediationRewardedAdConfiguration) {
            this.f20562a = mediationAdLoadCallback;
            this.f20563b = mediationRewardedAdConfiguration;
        }

        @Override // com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener
        public void onFyberMarketplaceInitialized(OnFyberMarketplaceInitializedListener.FyberInitStatus fyberInitStatus) {
            if (fyberInitStatus != OnFyberMarketplaceInitializedListener.FyberInitStatus.SUCCESSFULLY) {
                AdError b10 = com.google.ads.mediation.fyber.a.b(fyberInitStatus);
                Log.w(FyberMediationAdapter.f20552i, b10.getMessage());
                this.f20562a.onFailure(b10);
                return;
            }
            FyberMediationAdapter.this.f20561h = new com.google.ads.mediation.fyber.b(this.f20563b, this.f20562a);
            FyberMediationAdapter.this.f20561h.j();
        }
    }

    /* loaded from: classes2.dex */
    class b implements OnFyberMarketplaceInitializedListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InitializationCompleteCallback f20565a;

        b(FyberMediationAdapter fyberMediationAdapter, InitializationCompleteCallback initializationCompleteCallback) {
            this.f20565a = initializationCompleteCallback;
        }

        @Override // com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener
        public void onFyberMarketplaceInitialized(OnFyberMarketplaceInitializedListener.FyberInitStatus fyberInitStatus) {
            if (fyberInitStatus != OnFyberMarketplaceInitializedListener.FyberInitStatus.SUCCESSFULLY) {
                AdError b10 = com.google.ads.mediation.fyber.a.b(fyberInitStatus);
                Log.w(FyberMediationAdapter.f20552i, b10.getMessage());
                this.f20565a.onInitializationFailed(b10.getMessage());
                return;
            }
            this.f20565a.onInitializationSucceeded();
        }
    }

    /* loaded from: classes2.dex */
    class c implements OnFyberMarketplaceInitializedListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Bundle f20566a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f20567b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ AdSize f20568c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Bundle f20569d;

        c(Bundle bundle, Context context, AdSize adSize, Bundle bundle2) {
            this.f20566a = bundle;
            this.f20567b = context;
            this.f20568c = adSize;
            this.f20569d = bundle2;
        }

        @Override // com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener
        public void onFyberMarketplaceInitialized(OnFyberMarketplaceInitializedListener.FyberInitStatus fyberInitStatus) {
            if (fyberInitStatus != OnFyberMarketplaceInitializedListener.FyberInitStatus.SUCCESSFULLY) {
                AdError b10 = com.google.ads.mediation.fyber.a.b(fyberInitStatus);
                Log.w(FyberMediationAdapter.f20552i, b10.getMessage());
                FyberMediationAdapter.this.f20557d.onAdFailedToLoad(FyberMediationAdapter.this, b10);
                return;
            }
            String string = this.f20566a.getString("spotId");
            if (TextUtils.isEmpty(string)) {
                AdError adError = new AdError(101, "Cannot render banner ad. Please define a valid spot id on the AdMob UI.", FyberMediationAdapter.ERROR_DOMAIN);
                Log.w(FyberMediationAdapter.f20552i, adError.getMessage());
                FyberMediationAdapter.this.f20557d.onAdFailedToLoad(FyberMediationAdapter.this, adError);
                return;
            }
            FyberMediationAdapter.this.f20555b = InneractiveAdSpotManager.get().createSpot();
            FyberMediationAdapter.this.f20555b.setMediationName(FyberMediationAdapter.f20553j);
            FyberMediationAdapter.this.f20555b.addUnitController(new InneractiveAdViewUnitController());
            FyberMediationAdapter.this.f20556c = new RelativeLayout(this.f20567b);
            FyberMediationAdapter.this.f20555b.setRequestListener(FyberMediationAdapter.this.t());
            FyberMediationAdapter.this.f20554a = this.f20568c;
            com.google.ads.mediation.fyber.a.c(this.f20569d);
            FyberMediationAdapter.this.f20555b.requestAd(new InneractiveAdRequest(string));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class d implements InneractiveAdSpot.RequestListener {
        d() {
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
        public void onInneractiveFailedAdRequest(InneractiveAdSpot inneractiveAdSpot, InneractiveErrorCode inneractiveErrorCode) {
            AdError a10 = com.google.ads.mediation.fyber.a.a(inneractiveErrorCode);
            Log.w(FyberMediationAdapter.f20552i, a10.getMessage());
            FyberMediationAdapter.this.f20557d.onAdFailedToLoad(FyberMediationAdapter.this, a10);
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
        public void onInneractiveSuccessfulAdRequest(InneractiveAdSpot inneractiveAdSpot) {
            if (!(FyberMediationAdapter.this.f20555b.getSelectedUnitController() instanceof InneractiveAdViewUnitController)) {
                AdError adError = new AdError(105, String.format("Unexpected controller type. Expected: %s. Actual: %s", InneractiveUnitController.class.getName(), FyberMediationAdapter.this.f20555b.getSelectedUnitController().getClass().getName()), FyberMediationAdapter.ERROR_DOMAIN);
                Log.w(FyberMediationAdapter.f20552i, adError.getMessage());
                FyberMediationAdapter.this.f20557d.onAdFailedToLoad(FyberMediationAdapter.this, adError);
                FyberMediationAdapter.this.f20555b.destroy();
            }
            InneractiveAdViewUnitController inneractiveAdViewUnitController = (InneractiveAdViewUnitController) FyberMediationAdapter.this.f20555b.getSelectedUnitController();
            inneractiveAdViewUnitController.setEventsListener(FyberMediationAdapter.this.s());
            inneractiveAdViewUnitController.bindView(FyberMediationAdapter.this.f20556c);
            Context context = FyberMediationAdapter.this.f20556c.getContext();
            float f10 = context.getResources().getDisplayMetrics().density;
            int round = Math.round(inneractiveAdViewUnitController.getAdContentWidth() / f10);
            int round2 = Math.round(inneractiveAdViewUnitController.getAdContentHeight() / f10);
            ArrayList arrayList = new ArrayList();
            arrayList.add(new AdSize(round, round2));
            if (MediationUtils.findClosestSize(context, FyberMediationAdapter.this.f20554a, arrayList) != null) {
                FyberMediationAdapter.this.f20557d.onAdLoaded(FyberMediationAdapter.this);
                return;
            }
            AdError adError2 = new AdError(103, String.format("The loaded ad size did not match the requested ad size. Requested ad size: %dx%d. Loaded ad size: %dx%d.", Integer.valueOf(Math.round(FyberMediationAdapter.this.f20554a.getWidthInPixels(context) / f10)), Integer.valueOf(Math.round(FyberMediationAdapter.this.f20554a.getHeightInPixels(context) / f10)), Integer.valueOf(round), Integer.valueOf(round2)), FyberMediationAdapter.ERROR_DOMAIN);
            Log.w(FyberMediationAdapter.f20552i, adError2.getMessage());
            FyberMediationAdapter.this.f20557d.onAdFailedToLoad(FyberMediationAdapter.this, adError2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class e extends InneractiveAdViewEventsListenerAdapter {
        e() {
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListenerAdapter, com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
        public void onAdClicked(InneractiveAdSpot inneractiveAdSpot) {
            FyberMediationAdapter.this.f20557d.onAdClicked(FyberMediationAdapter.this);
            FyberMediationAdapter.this.f20557d.onAdOpened(FyberMediationAdapter.this);
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListenerAdapter, com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
        public void onAdImpression(InneractiveAdSpot inneractiveAdSpot) {
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListenerAdapter, com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
        public void onAdWillCloseInternalBrowser(InneractiveAdSpot inneractiveAdSpot) {
            FyberMediationAdapter.this.f20557d.onAdClosed(FyberMediationAdapter.this);
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListenerAdapter, com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
        public void onAdWillOpenExternalApp(InneractiveAdSpot inneractiveAdSpot) {
            FyberMediationAdapter.this.f20557d.onAdLeftApplication(FyberMediationAdapter.this);
        }
    }

    /* loaded from: classes2.dex */
    class f implements OnFyberMarketplaceInitializedListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Bundle f20573a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f20574b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Bundle f20575c;

        f(Bundle bundle, Context context, Bundle bundle2) {
            this.f20573a = bundle;
            this.f20574b = context;
            this.f20575c = bundle2;
        }

        @Override // com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener
        public void onFyberMarketplaceInitialized(OnFyberMarketplaceInitializedListener.FyberInitStatus fyberInitStatus) {
            if (fyberInitStatus != OnFyberMarketplaceInitializedListener.FyberInitStatus.SUCCESSFULLY) {
                AdError b10 = com.google.ads.mediation.fyber.a.b(fyberInitStatus);
                Log.w(FyberMediationAdapter.f20552i, b10.getMessage());
                FyberMediationAdapter.this.f20558e.onAdFailedToLoad(FyberMediationAdapter.this, b10);
                return;
            }
            String string = this.f20573a.getString("spotId");
            if (TextUtils.isEmpty(string)) {
                AdError adError = new AdError(101, "Cannot render interstitial ad. Please define a valid spot id on the AdMob UI.", FyberMediationAdapter.ERROR_DOMAIN);
                Log.w(FyberMediationAdapter.f20552i, adError.getMessage());
                FyberMediationAdapter.this.f20558e.onAdFailedToLoad(FyberMediationAdapter.this, adError);
            } else if (!(this.f20574b instanceof Activity)) {
                AdError adError2 = new AdError(107, "Cannot request an interstitial ad without an activity context.", FyberMediationAdapter.ERROR_DOMAIN);
                Log.w(FyberMediationAdapter.f20552i, adError2.getMessage());
                if (FyberMediationAdapter.this.f20558e != null) {
                    FyberMediationAdapter.this.f20558e.onAdFailedToLoad(FyberMediationAdapter.this, adError2);
                }
            } else {
                FyberMediationAdapter.this.f20559f = new WeakReference((Activity) this.f20574b);
                FyberMediationAdapter.this.f20560g = InneractiveAdSpotManager.get().createSpot();
                FyberMediationAdapter.this.f20560g.setMediationName(FyberMediationAdapter.f20553j);
                FyberMediationAdapter.this.f20560g.addUnitController(new InneractiveFullscreenUnitController());
                FyberMediationAdapter.this.f20560g.setRequestListener(FyberMediationAdapter.this.u());
                com.google.ads.mediation.fyber.a.c(this.f20575c);
                FyberMediationAdapter.this.f20560g.requestAd(new InneractiveAdRequest(string));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class g implements InneractiveAdSpot.RequestListener {
        g() {
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
        public void onInneractiveFailedAdRequest(InneractiveAdSpot inneractiveAdSpot, InneractiveErrorCode inneractiveErrorCode) {
            AdError a10 = com.google.ads.mediation.fyber.a.a(inneractiveErrorCode);
            Log.w(FyberMediationAdapter.f20552i, a10.getMessage());
            FyberMediationAdapter.this.f20558e.onAdFailedToLoad(FyberMediationAdapter.this, a10);
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
        public void onInneractiveSuccessfulAdRequest(InneractiveAdSpot inneractiveAdSpot) {
            if (!(FyberMediationAdapter.this.f20560g.getSelectedUnitController() instanceof InneractiveFullscreenUnitController)) {
                AdError adError = new AdError(105, String.format("Unexpected controller type. Expected: %s. Actual: %s", InneractiveUnitController.class.getName(), FyberMediationAdapter.this.f20555b.getSelectedUnitController().getClass().getName()), FyberMediationAdapter.ERROR_DOMAIN);
                Log.w(FyberMediationAdapter.f20552i, adError.getMessage());
                FyberMediationAdapter.this.f20558e.onAdFailedToLoad(FyberMediationAdapter.this, adError);
                FyberMediationAdapter.this.f20560g.destroy();
            }
            ((InneractiveFullscreenUnitController) FyberMediationAdapter.this.f20560g.getSelectedUnitController()).setEventsListener(FyberMediationAdapter.this.v());
            FyberMediationAdapter.this.f20558e.onAdLoaded(FyberMediationAdapter.this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class h extends InneractiveFullscreenAdEventsListenerAdapter {
        h() {
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListenerAdapter, com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
        public void onAdClicked(InneractiveAdSpot inneractiveAdSpot) {
            FyberMediationAdapter.this.f20558e.onAdClicked(FyberMediationAdapter.this);
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListenerAdapter, com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener
        public void onAdDismissed(InneractiveAdSpot inneractiveAdSpot) {
            FyberMediationAdapter.this.f20558e.onAdClosed(FyberMediationAdapter.this);
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListenerAdapter, com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
        public void onAdImpression(InneractiveAdSpot inneractiveAdSpot) {
            FyberMediationAdapter.this.f20558e.onAdOpened(FyberMediationAdapter.this);
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListenerAdapter, com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
        public void onAdWillOpenExternalApp(InneractiveAdSpot inneractiveAdSpot) {
            FyberMediationAdapter.this.f20558e.onAdLeftApplication(FyberMediationAdapter.this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InneractiveAdViewEventsListener s() {
        return new e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InneractiveAdSpot.RequestListener t() {
        return new d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InneractiveAdSpot.RequestListener u() {
        return new g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InneractiveFullscreenAdEventsListener v() {
        return new h();
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public View getBannerView() {
        return this.f20556c;
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public VersionInfo getSDKVersionInfo() {
        String version = InneractiveAdManager.getVersion();
        String[] split = version.split("\\.");
        if (split.length >= 3) {
            return new VersionInfo(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]));
        }
        Log.w(f20552i, String.format("Unexpected SDK version format: %s. Returning 0.0.0 for SDK version.", version));
        return new VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public VersionInfo getVersionInfo() {
        String[] split = "8.1.5.0".split("\\.");
        if (split.length >= 4) {
            return new VersionInfo(Integer.parseInt(split[0]), Integer.parseInt(split[1]), (Integer.parseInt(split[2]) * 100) + Integer.parseInt(split[3]));
        }
        Log.w(f20552i, String.format("Unexpected adapter version format: %s. Returning 0.0.0 for adapter version.", "8.1.5.0"));
        return new VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void initialize(Context context, InitializationCompleteCallback initializationCompleteCallback, List<MediationConfiguration> list) {
        if (InneractiveAdManager.wasInitialized()) {
            initializationCompleteCallback.onInitializationSucceeded();
            return;
        }
        HashSet hashSet = new HashSet();
        for (MediationConfiguration mediationConfiguration : list) {
            String string = mediationConfiguration.getServerParameters().getString("applicationId");
            if (!TextUtils.isEmpty(string)) {
                hashSet.add(string);
            }
        }
        if (hashSet.isEmpty()) {
            AdError adError = new AdError(101, "Fyber Marketplace SDK requires an appId to be configured on the AdMob UI.", ERROR_DOMAIN);
            Log.w(f20552i, adError.getMessage());
            initializationCompleteCallback.onInitializationFailed(adError.getMessage());
            return;
        }
        String str = (String) hashSet.iterator().next();
        if (hashSet.size() > 1) {
            Log.w(f20552i, String.format("Multiple '%s' entries found: %s. Using '%s' to initialize the Fyber Marketplace SDK.", "applicationId", hashSet, str));
        }
        InneractiveAdManager.initialize(context, str, new b(this, initializationCompleteCallback));
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        String string = mediationRewardedAdConfiguration.getServerParameters().getString("applicationId");
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(101, "App ID is null or empty.", ERROR_DOMAIN);
            Log.w(f20552i, adError.getMessage());
            mediationAdLoadCallback.onFailure(adError);
            return;
        }
        InneractiveAdManager.initialize(mediationRewardedAdConfiguration.getContext(), string, new a(mediationAdLoadCallback, mediationRewardedAdConfiguration));
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onDestroy() {
        InneractiveAdSpot inneractiveAdSpot = this.f20555b;
        if (inneractiveAdSpot != null) {
            inneractiveAdSpot.destroy();
            this.f20555b = null;
        }
        InneractiveAdSpot inneractiveAdSpot2 = this.f20560g;
        if (inneractiveAdSpot2 != null) {
            inneractiveAdSpot2.destroy();
            this.f20560g = null;
        }
        WeakReference<Activity> weakReference = this.f20559f;
        if (weakReference != null) {
            weakReference.clear();
            this.f20559f = null;
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onPause() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onResume() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(Context context, MediationBannerListener mediationBannerListener, Bundle bundle, AdSize adSize, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.f20557d = mediationBannerListener;
        String string = bundle.getString("applicationId");
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(101, "App ID is null or empty.", ERROR_DOMAIN);
            Log.w(f20552i, adError.getMessage());
            this.f20557d.onAdFailedToLoad(this, adError);
            return;
        }
        InneractiveAdManager.initialize(context, string, new c(bundle, context, adSize, bundle2));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(Context context, MediationInterstitialListener mediationInterstitialListener, Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.f20558e = mediationInterstitialListener;
        String string = bundle.getString("applicationId");
        AdError adError = new AdError(101, "App ID is null or empty.", ERROR_DOMAIN);
        if (TextUtils.isEmpty(string)) {
            Log.w(f20552i, adError.getMessage());
            this.f20558e.onAdFailedToLoad(this, adError);
            return;
        }
        InneractiveAdManager.initialize(context, string, new f(bundle, context, bundle2));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        WeakReference<Activity> weakReference = this.f20559f;
        Activity activity = weakReference == null ? null : weakReference.get();
        if (activity == null) {
            Log.w(f20552i, "showInterstitial called, but activity reference was lost.");
            this.f20558e.onAdOpened(this);
            this.f20558e.onAdClosed(this);
        } else if (!(this.f20560g.getSelectedUnitController() instanceof InneractiveFullscreenUnitController)) {
            Log.w(f20552i, "showInterstitial called, but wrong spot has been used (should not happen).");
            this.f20558e.onAdOpened(this);
            this.f20558e.onAdClosed(this);
        } else {
            InneractiveFullscreenUnitController inneractiveFullscreenUnitController = (InneractiveFullscreenUnitController) this.f20560g.getSelectedUnitController();
            if (!this.f20560g.isReady()) {
                Log.w(f20552i, "showInterstitial called, but Ad has expired.");
                this.f20558e.onAdOpened(this);
                this.f20558e.onAdClosed(this);
                return;
            }
            inneractiveFullscreenUnitController.show(activity);
        }
    }
}
