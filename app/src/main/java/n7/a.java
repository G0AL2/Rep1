package n7;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.TTNativeExpressAd;
import com.google.ads.mediation.pangle.PangleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.MediationUtils;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PangleRtbBannerAd.java */
/* loaded from: classes2.dex */
public class a implements MediationBannerAd, TTNativeExpressAd.ExpressAdInteractionListener {

    /* renamed from: a  reason: collision with root package name */
    private final MediationBannerAdConfiguration f34665a;

    /* renamed from: b  reason: collision with root package name */
    private final MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> f34666b;

    /* renamed from: c  reason: collision with root package name */
    private MediationBannerAdCallback f34667c;

    /* renamed from: d  reason: collision with root package name */
    private FrameLayout f34668d;

    /* compiled from: PangleRtbBannerAd.java */
    /* renamed from: n7.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    class C0458a implements TTAdNative.NativeExpressAdListener {
        C0458a() {
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdNative.NativeExpressAdListener, com.bytedance.sdk.openadsdk.common.b
        public void onError(int i10, String str) {
            AdError b10 = m7.a.b(i10, str);
            Log.w(PangleMediationAdapter.TAG, b10.toString());
            a.this.f34666b.onFailure(b10);
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdNative.NativeExpressAdListener
        public void onNativeExpressAdLoad(List<TTNativeExpressAd> list) {
            TTNativeExpressAd tTNativeExpressAd = list.get(0);
            tTNativeExpressAd.setExpressInteractionListener(a.this);
            tTNativeExpressAd.render();
        }
    }

    public a(MediationBannerAdConfiguration mediationBannerAdConfiguration, MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        this.f34665a = mediationBannerAdConfiguration;
        this.f34666b = mediationAdLoadCallback;
    }

    public void b() {
        PangleMediationAdapter.setCoppa(this.f34665a.taggedForChildDirectedTreatment());
        String string = this.f34665a.getServerParameters().getString("placementid");
        if (TextUtils.isEmpty(string)) {
            AdError a10 = m7.a.a(101, "Failed to load banner ad from Pangle. Missing or invalid Placement ID.");
            Log.e(PangleMediationAdapter.TAG, a10.toString());
            this.f34666b.onFailure(a10);
            return;
        }
        String bidResponse = this.f34665a.getBidResponse();
        if (TextUtils.isEmpty(bidResponse)) {
            AdError a11 = m7.a.a(103, "Failed to load banner ad from Pangle. Missing or invalid bid response.");
            Log.w(PangleMediationAdapter.TAG, a11.toString());
            this.f34666b.onFailure(a11);
            return;
        }
        Context context = this.f34665a.getContext();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(new AdSize(320, 50));
        arrayList.add(new AdSize(ms.bd.o.Pgl.c.COLLECT_MODE_FINANCE, IronSourceConstants.INTERSTITIAL_DAILY_CAPPED));
        arrayList.add(new AdSize(728, 90));
        AdSize findClosestSize = MediationUtils.findClosestSize(context, this.f34665a.getAdSize(), arrayList);
        if (findClosestSize == null) {
            AdError a12 = m7.a.a(102, "Failed to request banner ad from Pangle. Invalid banner size.");
            Log.w(PangleMediationAdapter.TAG, a12.toString());
            this.f34666b.onFailure(a12);
            return;
        }
        this.f34668d = new FrameLayout(context);
        PangleMediationAdapter.getPangleSdkManager().createAdNative(context.getApplicationContext()).loadBannerExpressAd(new AdSlot.Builder().setCodeId(string).setAdCount(1).setExpressViewAcceptedSize(findClosestSize.getWidth(), findClosestSize.getHeight()).withBid(bidResponse).build(), new C0458a());
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAd
    public View getView() {
        return this.f34668d;
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd.ExpressAdInteractionListener
    public void onAdClicked(View view, int i10) {
        MediationBannerAdCallback mediationBannerAdCallback = this.f34667c;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd.ExpressAdInteractionListener
    public void onAdShow(View view, int i10) {
        MediationBannerAdCallback mediationBannerAdCallback = this.f34667c;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdImpression();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd.ExpressAdInteractionListener
    public void onRenderFail(View view, String str, int i10) {
        this.f34666b.onFailure(m7.a.b(i10, str));
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd.ExpressAdInteractionListener
    public void onRenderSuccess(View view, float f10, float f11) {
        this.f34668d.addView(view);
        this.f34667c = this.f34666b.onSuccess(this);
    }
}
