package n7;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.TTRewardVideoAd;
import com.google.ads.mediation.pangle.PangleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.rewarded.RewardItem;

/* compiled from: PangleRtbRewardedAd.java */
/* loaded from: classes2.dex */
public class d implements MediationRewardedAd {

    /* renamed from: a  reason: collision with root package name */
    private final MediationRewardedAdConfiguration f34686a;

    /* renamed from: b  reason: collision with root package name */
    private final MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> f34687b;

    /* renamed from: c  reason: collision with root package name */
    private MediationRewardedAdCallback f34688c;

    /* renamed from: d  reason: collision with root package name */
    private TTRewardVideoAd f34689d;

    /* compiled from: PangleRtbRewardedAd.java */
    /* loaded from: classes2.dex */
    class a implements TTAdNative.RewardVideoAdListener {
        a() {
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdNative.RewardVideoAdListener, com.bytedance.sdk.openadsdk.common.b
        public void onError(int i10, String str) {
            AdError b10 = m7.a.b(i10, str);
            Log.w(PangleMediationAdapter.TAG, b10.toString());
            d.this.f34687b.onFailure(b10);
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdNative.RewardVideoAdListener
        public void onRewardVideoAdLoad(TTRewardVideoAd tTRewardVideoAd) {
            d dVar = d.this;
            dVar.f34688c = (MediationRewardedAdCallback) dVar.f34687b.onSuccess(d.this);
            d.this.f34689d = tTRewardVideoAd;
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdNative.RewardVideoAdListener
        public void onRewardVideoCached() {
        }
    }

    /* compiled from: PangleRtbRewardedAd.java */
    /* loaded from: classes2.dex */
    class b implements TTRewardVideoAd.RewardAdInteractionListener {

        /* compiled from: PangleRtbRewardedAd.java */
        /* loaded from: classes2.dex */
        class a implements RewardItem {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f34692a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f34693b;

            a(b bVar, String str, int i10) {
                this.f34692a = str;
                this.f34693b = i10;
            }

            @Override // com.google.android.gms.ads.rewarded.RewardItem
            public int getAmount() {
                return this.f34693b;
            }

            @Override // com.google.android.gms.ads.rewarded.RewardItem
            public String getType() {
                return this.f34692a;
            }
        }

        b() {
        }

        @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd.RewardAdInteractionListener
        public void onAdClose() {
            if (d.this.f34688c != null) {
                d.this.f34688c.onAdClosed();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd.RewardAdInteractionListener
        public void onAdShow() {
            if (d.this.f34688c != null) {
                d.this.f34688c.onAdOpened();
                d.this.f34688c.reportAdImpression();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd.RewardAdInteractionListener
        public void onAdVideoBarClick() {
            if (d.this.f34688c != null) {
                d.this.f34688c.reportAdClicked();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd.RewardAdInteractionListener
        public void onRewardVerify(boolean z10, int i10, String str, int i11, String str2) {
            if (!z10) {
                Log.d(PangleMediationAdapter.TAG, m7.a.b(i11, String.format("Failed to request rewarded ad from Pangle. The reward isn't valid. The specific reason is: %s", str2)).toString());
                return;
            }
            a aVar = new a(this, str, i10);
            if (d.this.f34688c != null) {
                d.this.f34688c.onUserEarnedReward(aVar);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd.RewardAdInteractionListener
        public void onSkippedVideo() {
        }

        @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd.RewardAdInteractionListener
        public void onVideoComplete() {
        }

        @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd.RewardAdInteractionListener
        public void onVideoError() {
        }
    }

    public d(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        this.f34686a = mediationRewardedAdConfiguration;
        this.f34687b = mediationAdLoadCallback;
    }

    public void e() {
        PangleMediationAdapter.setCoppa(this.f34686a.taggedForChildDirectedTreatment());
        String string = this.f34686a.getServerParameters().getString("placementid");
        if (TextUtils.isEmpty(string)) {
            AdError a10 = m7.a.a(101, "Failed to load rewarded ad from Pangle. Missing or invalid Placement ID.");
            Log.e(PangleMediationAdapter.TAG, a10.toString());
            this.f34687b.onFailure(a10);
            return;
        }
        String bidResponse = this.f34686a.getBidResponse();
        if (TextUtils.isEmpty(bidResponse)) {
            AdError a11 = m7.a.a(103, "Failed to load rewarded ad from Pangle. Missing or invalid bid response.");
            Log.w(PangleMediationAdapter.TAG, a11.toString());
            this.f34687b.onFailure(a11);
            return;
        }
        PangleMediationAdapter.getPangleSdkManager().createAdNative(this.f34686a.getContext().getApplicationContext()).loadRewardVideoAd(new AdSlot.Builder().setCodeId(string).withBid(bidResponse).build(), new a());
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(Context context) {
        this.f34689d.setRewardAdInteractionListener(new b());
        if (context instanceof Activity) {
            this.f34689d.showRewardVideoAd((Activity) context);
        } else {
            this.f34689d.showRewardVideoAd(null);
        }
    }
}
