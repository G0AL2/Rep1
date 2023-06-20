package k7;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import com.facebook.ads.Ad;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.MediaView;
import com.facebook.ads.MediaViewListener;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeBannerAd;
import com.google.ads.mediation.facebook.FacebookAdapter;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: FacebookRtbNativeAd.java */
/* loaded from: classes2.dex */
public class c extends UnifiedNativeAdMapper {

    /* renamed from: a  reason: collision with root package name */
    private final MediationNativeAdConfiguration f33173a;

    /* renamed from: b  reason: collision with root package name */
    private final MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> f33174b;

    /* renamed from: c  reason: collision with root package name */
    private NativeAdBase f33175c;

    /* renamed from: d  reason: collision with root package name */
    private MediationNativeAdCallback f33176d;

    /* renamed from: e  reason: collision with root package name */
    private MediaView f33177e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FacebookRtbNativeAd.java */
    /* loaded from: classes2.dex */
    public class a implements MediaViewListener {
        a() {
        }

        @Override // com.facebook.ads.MediaViewListener
        public void onComplete(MediaView mediaView) {
            if (c.this.f33176d != null) {
                c.this.f33176d.onVideoComplete();
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

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FacebookRtbNativeAd.java */
    /* loaded from: classes2.dex */
    public class b extends NativeAd.Image {

        /* renamed from: a  reason: collision with root package name */
        private Drawable f33179a;

        /* renamed from: b  reason: collision with root package name */
        private Uri f33180b;

        public b(c cVar) {
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public Drawable getDrawable() {
            return this.f33179a;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public double getScale() {
            return 1.0d;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public Uri getUri() {
            return this.f33180b;
        }

        public b(c cVar, Uri uri) {
            this.f33180b = uri;
        }

        public b(c cVar, Drawable drawable) {
            this.f33179a = drawable;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FacebookRtbNativeAd.java */
    /* renamed from: k7.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0428c {
        void a(AdError adError);

        void b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FacebookRtbNativeAd.java */
    /* loaded from: classes2.dex */
    public class d implements AdListener, NativeAdListener {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<Context> f33181a;

        /* renamed from: b  reason: collision with root package name */
        private final NativeAdBase f33182b;

        /* compiled from: FacebookRtbNativeAd.java */
        /* loaded from: classes2.dex */
        class a implements InterfaceC0428c {
            a() {
            }

            @Override // k7.c.InterfaceC0428c
            public void a(AdError adError) {
                Log.w(FacebookMediationAdapter.TAG, adError.getMessage());
                c.this.f33174b.onFailure(adError);
            }

            @Override // k7.c.InterfaceC0428c
            public void b() {
                c cVar = c.this;
                cVar.f33176d = (MediationNativeAdCallback) cVar.f33174b.onSuccess(c.this);
            }
        }

        d(Context context, NativeAdBase nativeAdBase) {
            this.f33182b = nativeAdBase;
            this.f33181a = new WeakReference<>(context);
        }

        @Override // com.facebook.ads.AdListener
        public void onAdClicked(Ad ad2) {
            c.this.f33176d.reportAdClicked();
            c.this.f33176d.onAdOpened();
            c.this.f33176d.onAdLeftApplication();
        }

        @Override // com.facebook.ads.AdListener
        public void onAdLoaded(Ad ad2) {
            if (ad2 != this.f33182b) {
                AdError adError = new AdError(106, "Ad Loaded is not a Native Ad.", FacebookMediationAdapter.ERROR_DOMAIN);
                Log.e(FacebookMediationAdapter.TAG, adError.getMessage());
                c.this.f33174b.onFailure(adError);
                return;
            }
            Context context = this.f33181a.get();
            if (context == null) {
                AdError adError2 = new AdError(107, "Context is null.", FacebookMediationAdapter.ERROR_DOMAIN);
                Log.e(FacebookMediationAdapter.TAG, adError2.getMessage());
                c.this.f33174b.onFailure(adError2);
                return;
            }
            c.this.e(context, new a());
        }

        @Override // com.facebook.ads.AdListener
        public void onError(Ad ad2, com.facebook.ads.AdError adError) {
            AdError adError2 = FacebookMediationAdapter.getAdError(adError);
            Log.w(FacebookMediationAdapter.TAG, adError2.getMessage());
            c.this.f33174b.onFailure(adError2);
        }

        @Override // com.facebook.ads.AdListener
        public void onLoggingImpression(Ad ad2) {
        }

        @Override // com.facebook.ads.NativeAdListener
        public void onMediaDownloaded(Ad ad2) {
            Log.d(FacebookMediationAdapter.TAG, "onMediaDownloaded");
        }
    }

    public c(MediationNativeAdConfiguration mediationNativeAdConfiguration, MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        this.f33174b = mediationAdLoadCallback;
        this.f33173a = mediationNativeAdConfiguration;
    }

    private boolean d(NativeAdBase nativeAdBase) {
        boolean z10 = (nativeAdBase.getAdHeadline() == null || nativeAdBase.getAdBodyText() == null || nativeAdBase.getAdIcon() == null || nativeAdBase.getAdCallToAction() == null) ? false : true;
        return nativeAdBase instanceof NativeBannerAd ? z10 : (!z10 || nativeAdBase.getAdCoverImage() == null || this.f33177e == null) ? false : true;
    }

    public void e(Context context, InterfaceC0428c interfaceC0428c) {
        if (!d(this.f33175c)) {
            AdError adError = new AdError(108, "Ad from Facebook doesn't have all required assets.", FacebookMediationAdapter.ERROR_DOMAIN);
            Log.w(FacebookMediationAdapter.TAG, adError.getMessage());
            interfaceC0428c.a(adError);
            return;
        }
        setHeadline(this.f33175c.getAdHeadline());
        if (this.f33175c.getAdCoverImage() != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new b(this, Uri.parse(this.f33175c.getAdCoverImage().getUrl())));
            setImages(arrayList);
        }
        setBody(this.f33175c.getAdBodyText());
        if (this.f33175c.getPreloadedIconViewDrawable() == null) {
            if (this.f33175c.getAdIcon() == null) {
                setIcon(new b(this));
            } else {
                setIcon(new b(this, Uri.parse(this.f33175c.getAdIcon().getUrl())));
            }
        } else {
            setIcon(new b(this, this.f33175c.getPreloadedIconViewDrawable()));
        }
        setCallToAction(this.f33175c.getAdCallToAction());
        setAdvertiser(this.f33175c.getAdvertiserName());
        this.f33177e.setListener(new a());
        setHasVideoContent(true);
        setMediaView(this.f33177e);
        setStarRating(null);
        Bundle bundle = new Bundle();
        bundle.putCharSequence("id", this.f33175c.getId());
        bundle.putCharSequence(FacebookAdapter.KEY_SOCIAL_CONTEXT_ASSET, this.f33175c.getAdSocialContext());
        setExtras(bundle);
        setAdChoicesContent(new AdOptionsView(context, this.f33175c, null));
        interfaceC0428c.b();
    }

    public void f() {
        String placementID = FacebookMediationAdapter.getPlacementID(this.f33173a.getServerParameters());
        if (TextUtils.isEmpty(placementID)) {
            AdError adError = new AdError(101, "Failed to request ad. PlacementID is null or empty.", FacebookMediationAdapter.ERROR_DOMAIN);
            Log.e(FacebookMediationAdapter.TAG, adError.getMessage());
            this.f33174b.onFailure(adError);
            return;
        }
        FacebookMediationAdapter.setMixedAudience(this.f33173a);
        this.f33177e = new MediaView(this.f33173a.getContext());
        try {
            this.f33175c = NativeAdBase.fromBidPayload(this.f33173a.getContext(), placementID, this.f33173a.getBidResponse());
            if (!TextUtils.isEmpty(this.f33173a.getWatermark())) {
                this.f33175c.setExtraHints(new ExtraHints.Builder().mediationData(this.f33173a.getWatermark()).build());
            }
            NativeAdBase nativeAdBase = this.f33175c;
            nativeAdBase.loadAd(nativeAdBase.buildLoadAdConfig().withAdListener(new d(this.f33173a.getContext(), this.f33175c)).withBid(this.f33173a.getBidResponse()).withMediaCacheFlag(NativeAdBase.MediaCacheFlag.ALL).withPreloadedIconView(-1, -1).build());
        } catch (Exception e10) {
            AdError adError2 = new AdError(109, "Failed to create native ad from bid payload: " + e10.getMessage(), FacebookMediationAdapter.ERROR_DOMAIN);
            Log.w(FacebookMediationAdapter.TAG, adError2.getMessage());
            this.f33174b.onFailure(adError2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public void trackViews(View view, Map<String, View> map, Map<String, View> map2) {
        setOverrideClickHandling(true);
        ArrayList arrayList = new ArrayList(map.values());
        View view2 = map.get("3003");
        NativeAdBase nativeAdBase = this.f33175c;
        if (nativeAdBase instanceof NativeBannerAd) {
            if (view2 == null) {
                Log.w(FacebookMediationAdapter.TAG, "Missing or invalid native ad icon asset. Facebook impression recording might be impacted for this ad.");
            } else if (!(view2 instanceof ImageView)) {
                Log.w(FacebookMediationAdapter.TAG, String.format("Native ad icon asset is rendered with an incompatible class type. Facebook impression recording might be impacted for this ad. Expected: ImageView, actual: %s.", view2.getClass()));
            } else {
                ((NativeBannerAd) nativeAdBase).registerViewForInteraction(view, (ImageView) view2, arrayList);
            }
        } else if (nativeAdBase instanceof com.facebook.ads.NativeAd) {
            com.facebook.ads.NativeAd nativeAd = (com.facebook.ads.NativeAd) nativeAdBase;
            if (view2 instanceof ImageView) {
                nativeAd.registerViewForInteraction(view, this.f33177e, (ImageView) view2, arrayList);
                return;
            }
            Log.w(FacebookMediationAdapter.TAG, "Native icon asset is not of type ImageView. Calling registerViewForInteraction() without a reference to the icon view.");
            nativeAd.registerViewForInteraction(view, this.f33177e, arrayList);
        } else {
            Log.w(FacebookMediationAdapter.TAG, "Native ad type is not of type NativeAd or NativeBannerAd. It is not currently supported by the Facebook Adapter. Facebook impression recording might be impacted for this ad.");
        }
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public void untrackView(View view) {
        NativeAdBase nativeAdBase = this.f33175c;
        if (nativeAdBase != null) {
            nativeAdBase.unregisterView();
        }
        super.untrackView(view);
    }
}
