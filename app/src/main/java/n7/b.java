package n7;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.TTFullScreenVideoAd;
import com.google.ads.mediation.pangle.PangleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;

/* compiled from: PangleRtbInterstitialAd.java */
/* loaded from: classes2.dex */
public class b implements MediationInterstitialAd {

    /* renamed from: a  reason: collision with root package name */
    private final MediationInterstitialAdConfiguration f34670a;

    /* renamed from: b  reason: collision with root package name */
    private final MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> f34671b;

    /* renamed from: c  reason: collision with root package name */
    private MediationInterstitialAdCallback f34672c;

    /* renamed from: d  reason: collision with root package name */
    private TTFullScreenVideoAd f34673d;

    /* compiled from: PangleRtbInterstitialAd.java */
    /* loaded from: classes2.dex */
    class a implements TTAdNative.FullScreenVideoAdListener {
        a() {
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdNative.FullScreenVideoAdListener, com.bytedance.sdk.openadsdk.common.b
        public void onError(int i10, String str) {
            AdError b10 = m7.a.b(i10, str);
            Log.w(PangleMediationAdapter.TAG, b10.toString());
            b.this.f34671b.onFailure(b10);
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdNative.FullScreenVideoAdListener
        public void onFullScreenVideoAdLoad(TTFullScreenVideoAd tTFullScreenVideoAd) {
            b bVar = b.this;
            bVar.f34672c = (MediationInterstitialAdCallback) bVar.f34671b.onSuccess(b.this);
            b.this.f34673d = tTFullScreenVideoAd;
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdNative.FullScreenVideoAdListener
        public void onFullScreenVideoCached() {
        }
    }

    /* compiled from: PangleRtbInterstitialAd.java */
    /* renamed from: n7.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    class C0459b implements TTFullScreenVideoAd.FullScreenVideoAdInteractionListener {
        C0459b() {
        }

        @Override // com.bytedance.sdk.openadsdk.TTFullScreenVideoAd.FullScreenVideoAdInteractionListener
        public void onAdClose() {
            if (b.this.f34672c != null) {
                b.this.f34672c.onAdClosed();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.TTFullScreenVideoAd.FullScreenVideoAdInteractionListener
        public void onAdShow() {
            if (b.this.f34672c != null) {
                b.this.f34672c.onAdOpened();
                b.this.f34672c.reportAdImpression();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.TTFullScreenVideoAd.FullScreenVideoAdInteractionListener
        public void onAdVideoBarClick() {
            if (b.this.f34672c != null) {
                b.this.f34672c.reportAdClicked();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.TTFullScreenVideoAd.FullScreenVideoAdInteractionListener
        public void onSkippedVideo() {
        }

        @Override // com.bytedance.sdk.openadsdk.TTFullScreenVideoAd.FullScreenVideoAdInteractionListener
        public void onVideoComplete() {
        }
    }

    public b(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        this.f34670a = mediationInterstitialAdConfiguration;
        this.f34671b = mediationAdLoadCallback;
    }

    public void e() {
        PangleMediationAdapter.setCoppa(this.f34670a.taggedForChildDirectedTreatment());
        String string = this.f34670a.getServerParameters().getString("placementid");
        if (TextUtils.isEmpty(string)) {
            AdError a10 = m7.a.a(101, "Failed to load interstitial ad from Pangle. Missing or invalid Placement ID.");
            Log.e(PangleMediationAdapter.TAG, a10.toString());
            this.f34671b.onFailure(a10);
            return;
        }
        String bidResponse = this.f34670a.getBidResponse();
        if (TextUtils.isEmpty(bidResponse)) {
            AdError a11 = m7.a.a(103, "Failed to load interstitial ad from Pangle. Missing or invalid bid response.");
            Log.w(PangleMediationAdapter.TAG, a11.toString());
            this.f34671b.onFailure(a11);
            return;
        }
        PangleMediationAdapter.getPangleSdkManager().createAdNative(this.f34670a.getContext().getApplicationContext()).loadFullScreenVideoAd(new AdSlot.Builder().setCodeId(string).withBid(bidResponse).build(), new a());
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public void showAd(Context context) {
        this.f34673d.setFullScreenVideoAdInteractionListener(new C0459b());
        if (context instanceof Activity) {
            this.f34673d.showFullScreenVideoAd((Activity) context);
        } else {
            this.f34673d.showFullScreenVideoAd(null);
        }
    }
}
