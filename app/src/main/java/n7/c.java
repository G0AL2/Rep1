package n7;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.TTFeedAd;
import com.bytedance.sdk.openadsdk.TTImage;
import com.bytedance.sdk.openadsdk.TTNativeAd;
import com.bytedance.sdk.openadsdk.adapter.MediaView;
import com.bytedance.sdk.openadsdk.adapter.MediationAdapterUtil;
import com.google.ads.mediation.pangle.PangleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PangleRtbNativeAd.java */
/* loaded from: classes2.dex */
public class c extends UnifiedNativeAdMapper {

    /* renamed from: a  reason: collision with root package name */
    private final MediationNativeAdConfiguration f34676a;

    /* renamed from: b  reason: collision with root package name */
    private final MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> f34677b;

    /* renamed from: c  reason: collision with root package name */
    private MediationNativeAdCallback f34678c;

    /* renamed from: d  reason: collision with root package name */
    private TTFeedAd f34679d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PangleRtbNativeAd.java */
    /* loaded from: classes2.dex */
    public class a implements TTAdNative.FeedAdListener {
        a() {
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdNative.FeedAdListener, com.bytedance.sdk.openadsdk.common.b
        public void onError(int i10, String str) {
            AdError b10 = m7.a.b(i10, str);
            Log.w(PangleMediationAdapter.TAG, b10.toString());
            c.this.f34677b.onFailure(b10);
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdNative.FeedAdListener
        public void onFeedAdLoad(List<TTFeedAd> list) {
            c.this.f(list.get(0));
            c cVar = c.this;
            cVar.f34678c = (MediationNativeAdCallback) cVar.f34677b.onSuccess(c.this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PangleRtbNativeAd.java */
    /* loaded from: classes2.dex */
    public class b implements TTFeedAd.VideoAdListener {
        b(c cVar) {
        }

        @Override // com.bytedance.sdk.openadsdk.TTFeedAd.VideoAdListener
        public void onProgressUpdate(long j10, long j11) {
        }

        @Override // com.bytedance.sdk.openadsdk.TTFeedAd.VideoAdListener
        public void onVideoAdComplete(TTFeedAd tTFeedAd) {
        }

        @Override // com.bytedance.sdk.openadsdk.TTFeedAd.VideoAdListener
        public void onVideoAdContinuePlay(TTFeedAd tTFeedAd) {
        }

        @Override // com.bytedance.sdk.openadsdk.TTFeedAd.VideoAdListener
        public void onVideoAdPaused(TTFeedAd tTFeedAd) {
        }

        @Override // com.bytedance.sdk.openadsdk.TTFeedAd.VideoAdListener
        public void onVideoAdStartPlay(TTFeedAd tTFeedAd) {
        }

        @Override // com.bytedance.sdk.openadsdk.TTFeedAd.VideoAdListener
        public void onVideoError(int i10, int i11) {
            Log.d(PangleMediationAdapter.TAG, String.format("Native ad video playback error, errorCode: %s, extraCode: %s.", Integer.valueOf(i10), Integer.valueOf(i11)));
        }

        @Override // com.bytedance.sdk.openadsdk.TTFeedAd.VideoAdListener
        public void onVideoLoad(TTFeedAd tTFeedAd) {
        }
    }

    /* compiled from: PangleRtbNativeAd.java */
    /* renamed from: n7.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    class C0460c implements TTNativeAd.AdInteractionListener {
        C0460c() {
        }

        @Override // com.bytedance.sdk.openadsdk.TTNativeAd.AdInteractionListener
        public void onAdClicked(View view, TTNativeAd tTNativeAd) {
        }

        @Override // com.bytedance.sdk.openadsdk.TTNativeAd.AdInteractionListener
        public void onAdCreativeClick(View view, TTNativeAd tTNativeAd) {
            if (c.this.f34678c != null) {
                c.this.f34678c.reportAdClicked();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.TTNativeAd.AdInteractionListener
        public void onAdShow(TTNativeAd tTNativeAd) {
            if (c.this.f34678c != null) {
                c.this.f34678c.reportAdImpression();
            }
        }
    }

    /* compiled from: PangleRtbNativeAd.java */
    /* loaded from: classes2.dex */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c.this.f34679d.showPrivacyActivity();
        }
    }

    /* compiled from: PangleRtbNativeAd.java */
    /* loaded from: classes2.dex */
    public class e extends NativeAd.Image {

        /* renamed from: a  reason: collision with root package name */
        private final Drawable f34683a;

        /* renamed from: b  reason: collision with root package name */
        private final Uri f34684b;

        /* renamed from: c  reason: collision with root package name */
        private final double f34685c;

        /* synthetic */ e(c cVar, Drawable drawable, Uri uri, double d10, a aVar) {
            this(cVar, drawable, uri, d10);
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public Drawable getDrawable() {
            return this.f34683a;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public double getScale() {
            return this.f34685c;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public Uri getUri() {
            return this.f34684b;
        }

        private e(c cVar, Drawable drawable, Uri uri, double d10) {
            this.f34683a = drawable;
            this.f34684b = uri;
            this.f34685c = d10;
        }
    }

    public c(MediationNativeAdConfiguration mediationNativeAdConfiguration, MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        this.f34676a = mediationNativeAdConfiguration;
        this.f34677b = mediationAdLoadCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(TTFeedAd tTFeedAd) {
        this.f34679d = tTFeedAd;
        setHeadline(tTFeedAd.getTitle());
        setBody(this.f34679d.getDescription());
        setCallToAction(this.f34679d.getButtonText());
        if (this.f34679d.getIcon() != null && this.f34679d.getIcon().isValid()) {
            setIcon(new e(this, null, Uri.parse(this.f34679d.getIcon().getImageUrl()), 1.0d, null));
        }
        if (this.f34679d.getImageList() != null && this.f34679d.getImageList().size() != 0) {
            List<NativeAd.Image> arrayList = new ArrayList<>();
            for (TTImage tTImage : this.f34679d.getImageList()) {
                if (tTImage.isValid()) {
                    arrayList.add(new e(this, null, Uri.parse(tTImage.getImageUrl()), 1.0d, null));
                }
            }
            setImages(arrayList);
        }
        setOverrideClickHandling(true);
        MediaView mediaView = new MediaView(this.f34676a.getContext());
        MediationAdapterUtil.addNativeFeedMainView(this.f34676a.getContext(), this.f34679d.getImageMode(), mediaView, this.f34679d.getAdView(), this.f34679d.getImageList());
        setMediaView(mediaView);
        setAdChoicesContent(this.f34679d.getAdLogoView());
        if (this.f34679d.getImageMode() == 5 || this.f34679d.getImageMode() == 15 || this.f34679d.getImageMode() == 50) {
            setHasVideoContent(true);
            this.f34679d.setVideoAdListener(new b(this));
        }
    }

    public void g() {
        PangleMediationAdapter.setCoppa(this.f34676a.taggedForChildDirectedTreatment());
        String string = this.f34676a.getServerParameters().getString("placementid");
        if (TextUtils.isEmpty(string)) {
            AdError a10 = m7.a.a(101, "Failed to load native ad from Pangle. Missing or invalid Placement ID.");
            Log.e(PangleMediationAdapter.TAG, a10.toString());
            this.f34677b.onFailure(a10);
            return;
        }
        String bidResponse = this.f34676a.getBidResponse();
        if (TextUtils.isEmpty(bidResponse)) {
            AdError a11 = m7.a.a(103, "Failed to load native ad from Pangle. Missing or invalid bid response.");
            Log.w(PangleMediationAdapter.TAG, a11.toString());
            this.f34677b.onFailure(a11);
            return;
        }
        PangleMediationAdapter.getPangleSdkManager().createAdNative(this.f34676a.getContext().getApplicationContext()).loadFeedAd(new AdSlot.Builder().setCodeId(string).setAdCount(1).withBid(bidResponse).build(), new a());
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public void trackViews(View view, Map<String, View> map, Map<String, View> map2) {
        HashMap hashMap = new HashMap(map);
        hashMap.remove("3011");
        hashMap.remove("3012");
        ArrayList arrayList = new ArrayList(hashMap.values());
        View view2 = (View) hashMap.get("3002");
        ArrayList arrayList2 = new ArrayList();
        if (view2 != null) {
            arrayList2.add(view2);
        }
        this.f34679d.registerViewForInteraction((ViewGroup) view, arrayList, arrayList2, new C0460c());
        getAdChoicesContent().setOnClickListener(new d());
    }
}
