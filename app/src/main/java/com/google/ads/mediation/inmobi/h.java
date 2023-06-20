package com.google.ads.mediation.inmobi;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.ads.mediation.inmobi.d;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiInterstitial;
import com.inmobi.ads.exceptions.SdkNotInitializedException;
import com.inmobi.ads.listeners.InterstitialAdEventListener;
import java.util.Map;

/* compiled from: InMobiRewardedAd.java */
/* loaded from: classes2.dex */
public class h implements MediationRewardedAd {

    /* renamed from: a  reason: collision with root package name */
    private InMobiInterstitial f20639a;

    /* renamed from: b  reason: collision with root package name */
    private final MediationRewardedAdConfiguration f20640b;

    /* renamed from: c  reason: collision with root package name */
    private final MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> f20641c;

    /* renamed from: d  reason: collision with root package name */
    private MediationRewardedAdCallback f20642d;

    /* compiled from: InMobiRewardedAd.java */
    /* loaded from: classes2.dex */
    class a implements d.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f20643a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f20644b;

        a(Context context, long j10) {
            this.f20643a = context;
            this.f20644b = j10;
        }

        @Override // com.google.ads.mediation.inmobi.d.b
        public void a(AdError adError) {
            Log.w(InMobiMediationAdapter.TAG, adError.getMessage());
            if (h.this.f20641c != null) {
                h.this.f20641c.onFailure(adError);
            }
        }

        @Override // com.google.ads.mediation.inmobi.d.b
        public void b() {
            h hVar = h.this;
            hVar.e(this.f20643a, this.f20644b, hVar.f20641c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: InMobiRewardedAd.java */
    /* loaded from: classes2.dex */
    public class b extends InterstitialAdEventListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MediationAdLoadCallback f20646a;

        b(MediationAdLoadCallback mediationAdLoadCallback) {
            this.f20646a = mediationAdLoadCallback;
        }

        @Override // com.inmobi.ads.listeners.InterstitialAdEventListener, com.inmobi.media.bs
        /* renamed from: a */
        public void onAdClicked(InMobiInterstitial inMobiInterstitial, Map<Object, Object> map) {
            Log.d(InMobiMediationAdapter.TAG, "InMobi rewarded ad has been clicked.");
            if (h.this.f20642d != null) {
                h.this.f20642d.reportAdClicked();
            }
        }

        @Override // com.inmobi.ads.listeners.InterstitialAdEventListener, com.inmobi.media.bs
        /* renamed from: b */
        public void onAdFetchSuccessful(InMobiInterstitial inMobiInterstitial, AdMetaInfo adMetaInfo) {
            Log.d(InMobiMediationAdapter.TAG, "InMobi rewarded ad fetched from server, but ad contents still need to be loaded.");
        }

        @Override // com.inmobi.ads.listeners.InterstitialAdEventListener, com.inmobi.media.bs
        /* renamed from: c */
        public void onAdLoadFailed(InMobiInterstitial inMobiInterstitial, InMobiAdRequestStatus inMobiAdRequestStatus) {
            AdError adError = new AdError(com.google.ads.mediation.inmobi.b.g(inMobiAdRequestStatus), inMobiAdRequestStatus.getMessage(), InMobiMediationAdapter.INMOBI_SDK_ERROR_DOMAIN);
            Log.w(InMobiMediationAdapter.TAG, adError.getMessage());
            MediationAdLoadCallback mediationAdLoadCallback = this.f20646a;
            if (mediationAdLoadCallback != null) {
                mediationAdLoadCallback.onFailure(adError);
            }
        }

        @Override // com.inmobi.ads.listeners.InterstitialAdEventListener, com.inmobi.media.bs
        /* renamed from: d */
        public void onAdLoadSucceeded(InMobiInterstitial inMobiInterstitial, AdMetaInfo adMetaInfo) {
            Log.d(InMobiMediationAdapter.TAG, "InMobi rewaded ad has been loaded.");
            MediationAdLoadCallback mediationAdLoadCallback = this.f20646a;
            if (mediationAdLoadCallback != null) {
                h hVar = h.this;
                hVar.f20642d = (MediationRewardedAdCallback) mediationAdLoadCallback.onSuccess(hVar);
            }
        }

        @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
        public void onAdDismissed(InMobiInterstitial inMobiInterstitial) {
            Log.d(InMobiMediationAdapter.TAG, "InMobi rewarded ad has been dismissed.");
            if (h.this.f20642d != null) {
                h.this.f20642d.onAdClosed();
            }
        }

        @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
        public void onAdDisplayFailed(InMobiInterstitial inMobiInterstitial) {
            AdError adError = new AdError(106, "InMobi ad failed to show.", InMobiMediationAdapter.ERROR_DOMAIN);
            Log.w(InMobiMediationAdapter.TAG, adError.getMessage());
            if (h.this.f20642d != null) {
                h.this.f20642d.onAdFailedToShow(adError);
            }
        }

        @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
        public void onAdDisplayed(InMobiInterstitial inMobiInterstitial, AdMetaInfo adMetaInfo) {
            Log.d(InMobiMediationAdapter.TAG, "InMobi rewarded ad has been shown.");
            if (h.this.f20642d != null) {
                h.this.f20642d.onAdOpened();
                h.this.f20642d.onVideoStart();
                h.this.f20642d.reportAdImpression();
            }
        }

        @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
        public void onAdWillDisplay(InMobiInterstitial inMobiInterstitial) {
            Log.d(InMobiMediationAdapter.TAG, "InMobi rewarded ad will be shown.");
        }

        @Override // com.inmobi.ads.listeners.InterstitialAdEventListener, com.inmobi.media.bs
        public void onRequestPayloadCreated(byte[] bArr) {
        }

        @Override // com.inmobi.ads.listeners.InterstitialAdEventListener, com.inmobi.media.bs
        public void onRequestPayloadCreationFailed(InMobiAdRequestStatus inMobiAdRequestStatus) {
        }

        @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
        public void onRewardsUnlocked(InMobiInterstitial inMobiInterstitial, Map<Object, Object> map) {
            String str;
            int i10;
            Log.d(InMobiMediationAdapter.TAG, "InMobi rewarded ad user earned a reward.");
            String str2 = "";
            if (map != null) {
                String str3 = "";
                for (Object obj : map.keySet()) {
                    str2 = obj.toString();
                    str3 = map.get(str2).toString();
                    if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                        break;
                    }
                }
                str = str2;
                str2 = str3;
            } else {
                str = "";
            }
            if (TextUtils.isEmpty(str2)) {
                i10 = 0;
            } else {
                try {
                    i10 = Integer.parseInt(str2);
                } catch (NumberFormatException unused) {
                    String str4 = InMobiMediationAdapter.TAG;
                    Log.w(str4, "Expected an integer reward value. Got " + str2 + " instead. Using reward value of 1.");
                    i10 = 1;
                }
            }
            if (h.this.f20642d != null) {
                h.this.f20642d.onVideoComplete();
                h.this.f20642d.onUserEarnedReward(new g(str, i10));
            }
        }

        @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
        public void onUserLeftApplication(InMobiInterstitial inMobiInterstitial) {
            Log.d(InMobiMediationAdapter.TAG, "InMobi rewarded ad left application.");
        }
    }

    public h(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        this.f20640b = mediationRewardedAdConfiguration;
        this.f20641c = mediationAdLoadCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Context context, long j10, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        if (j10 <= 0) {
            AdError adError = new AdError(100, "Missing or Invalid Placement ID.", InMobiMediationAdapter.ERROR_DOMAIN);
            Log.w(InMobiMediationAdapter.TAG, adError.getMessage());
            mediationAdLoadCallback.onFailure(adError);
            return;
        }
        try {
            this.f20639a = new InMobiInterstitial(context, j10, new b(mediationAdLoadCallback));
            Bundle mediationExtras = this.f20640b.getMediationExtras();
            this.f20639a.setExtras(com.google.ads.mediation.inmobi.b.b(this.f20640b));
            com.google.ads.mediation.inmobi.b.a(mediationExtras);
            this.f20639a.load();
        } catch (SdkNotInitializedException e10) {
            AdError adError2 = new AdError(104, e10.getLocalizedMessage(), InMobiMediationAdapter.ERROR_DOMAIN);
            Log.w(InMobiMediationAdapter.TAG, adError2.getMessage());
            mediationAdLoadCallback.onFailure(adError2);
        }
    }

    public void f() {
        Context context = this.f20640b.getContext();
        Bundle serverParameters = this.f20640b.getServerParameters();
        String string = serverParameters.getString("accountid");
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(100, "Missing or Invalid Account ID.", InMobiMediationAdapter.ERROR_DOMAIN);
            Log.w(InMobiMediationAdapter.TAG, adError.getMessage());
            this.f20641c.onFailure(adError);
            return;
        }
        d.c().d(context, string, new a(context, com.google.ads.mediation.inmobi.b.h(serverParameters)));
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(Context context) {
        if (!this.f20639a.isReady()) {
            AdError adError = new AdError(105, "InMobi Rewarded ad is not yet ready to be shown.", InMobiMediationAdapter.ERROR_DOMAIN);
            Log.w(InMobiMediationAdapter.TAG, adError.getMessage());
            MediationRewardedAdCallback mediationRewardedAdCallback = this.f20642d;
            if (mediationRewardedAdCallback != null) {
                mediationRewardedAdCallback.onAdFailedToShow(adError);
                return;
            }
            return;
        }
        this.f20639a.show();
    }
}
