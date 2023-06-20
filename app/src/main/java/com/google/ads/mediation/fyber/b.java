package com.google.ads.mediation.fyber;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveFullScreenAdRewardedListener;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListenerAdapter;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenVideoContentController;
import com.fyber.inneractive.sdk.external.InneractiveMediationName;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.rewarded.RewardItem;

/* compiled from: FyberRewardedVideoRenderer.java */
/* loaded from: classes2.dex */
public class b implements MediationRewardedAd {

    /* renamed from: a  reason: collision with root package name */
    private final MediationRewardedAdConfiguration f20581a;

    /* renamed from: b  reason: collision with root package name */
    private final MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> f20582b;

    /* renamed from: c  reason: collision with root package name */
    private MediationRewardedAdCallback f20583c;

    /* renamed from: d  reason: collision with root package name */
    private InneractiveAdSpot f20584d;

    /* renamed from: e  reason: collision with root package name */
    private InneractiveFullscreenUnitController f20585e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FyberRewardedVideoRenderer.java */
    /* loaded from: classes2.dex */
    public class a implements InneractiveAdSpot.RequestListener {
        a() {
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
        public void onInneractiveFailedAdRequest(InneractiveAdSpot inneractiveAdSpot, InneractiveErrorCode inneractiveErrorCode) {
            AdError a10 = com.google.ads.mediation.fyber.a.a(inneractiveErrorCode);
            Log.w(FyberMediationAdapter.f20552i, a10.getMessage());
            b.this.f20582b.onFailure(a10);
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
        public void onInneractiveSuccessfulAdRequest(InneractiveAdSpot inneractiveAdSpot) {
            b bVar = b.this;
            bVar.f20583c = (MediationRewardedAdCallback) bVar.f20582b.onSuccess(b.this);
            b bVar2 = b.this;
            bVar2.i(bVar2.f20585e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FyberRewardedVideoRenderer.java */
    /* renamed from: com.google.ads.mediation.fyber.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0278b extends InneractiveFullscreenAdEventsListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InneractiveFullscreenUnitController f20587a;

        C0278b(InneractiveFullscreenUnitController inneractiveFullscreenUnitController) {
            this.f20587a = inneractiveFullscreenUnitController;
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListenerAdapter, com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
        public void onAdClicked(InneractiveAdSpot inneractiveAdSpot) {
            b.this.f20583c.reportAdClicked();
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListenerAdapter, com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener
        public void onAdDismissed(InneractiveAdSpot inneractiveAdSpot) {
            b.this.f20583c.onAdClosed();
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListenerAdapter, com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
        public void onAdImpression(InneractiveAdSpot inneractiveAdSpot) {
            b.this.f20583c.onAdOpened();
            if (b.this.h(this.f20587a)) {
                b.this.f20583c.onVideoStart();
            }
            b.this.f20583c.reportAdImpression();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FyberRewardedVideoRenderer.java */
    /* loaded from: classes2.dex */
    public class c implements InneractiveFullScreenAdRewardedListener {
        c() {
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveFullScreenAdRewardedListener
        public void onAdRewarded(InneractiveAdSpot inneractiveAdSpot) {
            b.this.f20583c.onUserEarnedReward(RewardItem.DEFAULT_REWARD);
            b.this.f20583c.onVideoComplete();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        this.f20581a = mediationRewardedAdConfiguration;
        this.f20582b = mediationAdLoadCallback;
    }

    private InneractiveAdSpot.RequestListener g() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean h(InneractiveFullscreenUnitController inneractiveFullscreenUnitController) {
        return (inneractiveFullscreenUnitController == null || inneractiveFullscreenUnitController.getSelectedContentController() == null || !(inneractiveFullscreenUnitController.getSelectedContentController() instanceof InneractiveFullscreenVideoContentController)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(InneractiveFullscreenUnitController inneractiveFullscreenUnitController) {
        C0278b c0278b = new C0278b(inneractiveFullscreenUnitController);
        InneractiveFullscreenVideoContentController inneractiveFullscreenVideoContentController = new InneractiveFullscreenVideoContentController();
        inneractiveFullscreenUnitController.setEventsListener(c0278b);
        inneractiveFullscreenUnitController.setRewardedListener(new c());
        inneractiveFullscreenUnitController.addContentController(inneractiveFullscreenVideoContentController);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j() {
        String string = this.f20581a.getServerParameters().getString("spotId");
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(101, "Spot ID is null or empty.", FyberMediationAdapter.ERROR_DOMAIN);
            Log.w(FyberMediationAdapter.f20552i, adError.getMessage());
            this.f20582b.onFailure(adError);
            return;
        }
        InneractiveAdSpot createSpot = InneractiveAdSpotManager.get().createSpot();
        this.f20584d = createSpot;
        createSpot.setMediationName(InneractiveMediationName.ADMOB);
        InneractiveFullscreenUnitController inneractiveFullscreenUnitController = new InneractiveFullscreenUnitController();
        this.f20585e = inneractiveFullscreenUnitController;
        this.f20584d.addUnitController(inneractiveFullscreenUnitController);
        this.f20584d.setRequestListener(g());
        com.google.ads.mediation.fyber.a.c(this.f20581a.getMediationExtras());
        this.f20584d.requestAd(new InneractiveAdRequest(string));
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(Context context) {
        if (!(context instanceof Activity)) {
            AdError adError = new AdError(107, "Cannot show a rewarded ad without an activity context.", FyberMediationAdapter.ERROR_DOMAIN);
            Log.w(FyberMediationAdapter.f20552i, adError.getMessage());
            MediationRewardedAdCallback mediationRewardedAdCallback = this.f20583c;
            if (mediationRewardedAdCallback != null) {
                mediationRewardedAdCallback.onAdFailedToShow(adError);
                return;
            }
            return;
        }
        InneractiveAdSpot inneractiveAdSpot = this.f20584d;
        if (inneractiveAdSpot != null && this.f20585e != null && inneractiveAdSpot.isReady()) {
            this.f20585e.show((Activity) context);
        } else if (this.f20583c != null) {
            AdError adError2 = new AdError(106, "Fyber's rewarded spot is not ready.", FyberMediationAdapter.ERROR_DOMAIN);
            Log.w(FyberMediationAdapter.f20552i, adError2.getMessage());
            this.f20583c.onAdFailedToShow(adError2);
        }
    }
}
