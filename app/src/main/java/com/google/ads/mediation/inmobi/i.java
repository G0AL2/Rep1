package com.google.ads.mediation.inmobi;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import com.google.ads.mediation.inmobi.a;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.inmobi.ads.InMobiNative;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: InMobiUnifiedNativeAdMapper.java */
/* loaded from: classes2.dex */
class i extends UnifiedNativeAdMapper {

    /* renamed from: a  reason: collision with root package name */
    private final InMobiNative f20648a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f20649b;

    /* renamed from: c  reason: collision with root package name */
    private final MediationNativeListener f20650c;

    /* renamed from: d  reason: collision with root package name */
    private final InMobiAdapter f20651d;

    /* compiled from: InMobiUnifiedNativeAdMapper.java */
    /* loaded from: classes2.dex */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f20652a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RelativeLayout f20653b;

        a(Context context, RelativeLayout relativeLayout) {
            this.f20652a = context;
            this.f20653b = relativeLayout;
        }

        @Override // java.lang.Runnable
        public void run() {
            InMobiNative inMobiNative = i.this.f20648a;
            Context context = this.f20652a;
            RelativeLayout relativeLayout = this.f20653b;
            View primaryViewOfWidth = inMobiNative.getPrimaryViewOfWidth(context, null, relativeLayout, relativeLayout.getWidth());
            if (primaryViewOfWidth == null) {
                return;
            }
            this.f20653b.addView(primaryViewOfWidth);
            int i10 = primaryViewOfWidth.getLayoutParams().height;
            if (i10 > 0) {
                i.this.setMediaContentAspectRatio(primaryViewOfWidth.getLayoutParams().width / i10);
            }
        }
    }

    /* compiled from: InMobiUnifiedNativeAdMapper.java */
    /* loaded from: classes2.dex */
    class b implements a.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Uri f20655a;

        b(Uri uri) {
            this.f20655a = uri;
        }

        @Override // com.google.ads.mediation.inmobi.a.b
        public void a(HashMap<String, Drawable> hashMap) {
            Drawable drawable = hashMap.get("icon_key");
            i.this.setIcon(new f(drawable, this.f20655a, 1.0d));
            ArrayList arrayList = new ArrayList();
            arrayList.add(new f(new ColorDrawable(0), null, 1.0d));
            i.this.setImages(arrayList);
            if (drawable != null) {
                i.this.f20650c.onAdLoaded(i.this.f20651d, i.this);
                return;
            }
            AdError adError = new AdError(109, "Failed to download image assets.", InMobiMediationAdapter.ERROR_DOMAIN);
            Log.w(InMobiMediationAdapter.TAG, adError.getMessage());
            i.this.f20650c.onAdFailedToLoad(i.this.f20651d, adError);
        }

        @Override // com.google.ads.mediation.inmobi.a.b
        public void b() {
            AdError adError = new AdError(109, "Failed to download image assets.", InMobiMediationAdapter.ERROR_DOMAIN);
            Log.w(InMobiMediationAdapter.TAG, adError.getMessage());
            i.this.f20650c.onAdFailedToLoad(i.this.f20651d, adError);
        }
    }

    public i(InMobiAdapter inMobiAdapter, InMobiNative inMobiNative, Boolean bool, MediationNativeListener mediationNativeListener) {
        this.f20651d = inMobiAdapter;
        this.f20648a = inMobiNative;
        this.f20649b = bool.booleanValue();
        this.f20650c = mediationNativeListener;
        setOverrideImpressionRecording(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(Context context) {
        if (!com.google.ads.mediation.inmobi.b.i(this.f20648a)) {
            AdError adError = new AdError(107, "InMobi native ad returned with a missing asset.", InMobiMediationAdapter.ERROR_DOMAIN);
            Log.w(InMobiMediationAdapter.TAG, adError.getMessage());
            this.f20650c.onAdFailedToLoad(this.f20651d, adError);
            return;
        }
        setHeadline(this.f20648a.getAdTitle());
        setBody(this.f20648a.getAdDescription());
        setCallToAction(this.f20648a.getAdCtaText());
        try {
            URL url = new URL(this.f20648a.getAdIconUrl());
            Uri parse = Uri.parse(url.toURI().toString());
            HashMap hashMap = new HashMap();
            String adLandingPageUrl = this.f20648a.getAdLandingPageUrl();
            Bundle bundle = new Bundle();
            bundle.putString("landingURL", adLandingPageUrl);
            setExtras(bundle);
            if (!this.f20649b) {
                hashMap.put("icon_key", url);
            } else {
                setIcon(new f(null, parse, 1.0d));
                List<NativeAd.Image> arrayList = new ArrayList<>();
                arrayList.add(new f(new ColorDrawable(0), null, 1.0d));
                setImages(arrayList);
            }
            if (this.f20648a.getCustomAdContent() != null) {
                JSONObject customAdContent = this.f20648a.getCustomAdContent();
                try {
                    if (customAdContent.has("rating")) {
                        setStarRating(Double.valueOf(Double.parseDouble(customAdContent.getString("rating"))));
                    }
                    if (customAdContent.has(InAppPurchaseMetaData.KEY_PRICE)) {
                        setPrice(customAdContent.getString(InAppPurchaseMetaData.KEY_PRICE));
                    }
                } catch (JSONException unused) {
                    Log.w(InMobiMediationAdapter.TAG, "InMobi custom native ad content payload could not be parsed. The returned native ad will not have star rating or price values.");
                }
                if (customAdContent.has("package_name")) {
                    setStore("Google Play");
                } else {
                    setStore("Others");
                }
            }
            l7.a aVar = new l7.a(context);
            aVar.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            aVar.setGravity(17);
            aVar.post(new a(context, aVar));
            setMediaView(aVar);
            setHasVideoContent(this.f20648a.isVideo() == null ? false : this.f20648a.isVideo().booleanValue());
            if (!this.f20649b) {
                new com.google.ads.mediation.inmobi.a(new b(parse)).execute(hashMap);
            } else {
                this.f20650c.onAdLoaded(this.f20651d, this);
            }
        } catch (MalformedURLException | URISyntaxException e10) {
            AdError adError2 = new AdError(108, e10.getLocalizedMessage(), InMobiMediationAdapter.ERROR_DOMAIN);
            Log.w(InMobiMediationAdapter.TAG, adError2.getMessage());
            this.f20650c.onAdFailedToLoad(this.f20651d, adError2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public void handleClick(View view) {
        this.f20648a.reportAdClickAndOpenLandingPage();
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public void trackViews(View view, Map<String, View> map, Map<String, View> map2) {
        this.f20648a.resume();
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public void untrackView(View view) {
        this.f20648a.pause();
    }
}
