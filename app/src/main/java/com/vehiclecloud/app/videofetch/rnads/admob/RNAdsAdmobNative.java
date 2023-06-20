package com.vehiclecloud.app.videofetch.rnads.admob;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReactApplicationContext;
import com.google.ads.mediation.facebook.FacebookAdapter;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import com.google.android.gms.ads.nativead.NativeAd;
import com.vehiclecloud.app.videofetch.rnads.api.ContextHelper;
import com.vehiclecloud.app.videofetch.rnads.api.RNAdsNative;
import t7.a;

/* loaded from: classes3.dex */
public class RNAdsAdmobNative implements RNAdsNative<NativeAd> {
    private static Class<? extends MediationExtrasReceiver> FB_ADAPTER_CLASS;
    private static Bundle FB_NETWORK_EXTRAS_BUNDLE;

    static {
        try {
            String str = FacebookAdapter.KEY_ID;
            FB_ADAPTER_CLASS = FacebookAdapter.class;
            Bundle bundle = new Bundle();
            bundle.putBoolean("native_banner", true);
            FB_NETWORK_EXTRAS_BUNDLE = bundle;
        } catch (Exception unused) {
        }
    }

    public static /* synthetic */ void a(RNAdsNative.Listener listener, NativeAd nativeAd) {
        lambda$loadAd$0(listener, nativeAd);
    }

    public static /* synthetic */ void lambda$loadAd$0(RNAdsNative.Listener listener, NativeAd nativeAd) {
        OnPaidEventListener onPaidEventListener = RNAdsAdmobIlrd.onPaidEventListener;
        if (onPaidEventListener != null) {
            nativeAd.setOnPaidEventListener(onPaidEventListener);
        }
        listener.onAdLoaded(nativeAd);
    }

    @Override // com.vehiclecloud.app.videofetch.rnads.api.RNAdsNative
    public /* synthetic */ void destroyByObject(Object obj) {
        zd.d.b(this, obj);
    }

    @Override // com.vehiclecloud.app.videofetch.rnads.api.RNAdsNative
    public /* synthetic */ View inflateAdViewByObject(Activity activity, Object obj, int i10, int i11) {
        return zd.d.c(this, activity, obj, i10, i11);
    }

    @Override // com.vehiclecloud.app.videofetch.rnads.api.RNAdsNative
    public void loadAd(ReactApplicationContext reactApplicationContext, String str, int i10, final RNAdsNative.Listener listener) {
        AdLoader build = new AdLoader.Builder(ContextHelper.getActivity(reactApplicationContext), str).forNativeAd(new NativeAd.OnNativeAdLoadedListener() { // from class: com.vehiclecloud.app.videofetch.rnads.admob.b
            @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
            public final void onNativeAdLoaded(NativeAd nativeAd) {
                RNAdsAdmobNative.a(RNAdsNative.Listener.this, nativeAd);
            }
        }).withAdListener(new AdListener() { // from class: com.vehiclecloud.app.videofetch.rnads.admob.RNAdsAdmobNative.1
            {
                RNAdsAdmobNative.this = this;
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdClicked() {
                listener.onAdClicked();
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdFailedToLoad(LoadAdError loadAdError) {
                timber.log.a.d("onAdFailedToLoad: %s", loadAdError);
                listener.onAdFailedToLoad(String.valueOf(loadAdError.getCode()));
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdImpression() {
                listener.onAdImpression();
            }
        }).build();
        AdRequest.Builder builder = new AdRequest.Builder();
        Class<? extends MediationExtrasReceiver> cls = FB_ADAPTER_CLASS;
        if (cls != null && i10 <= 200) {
            builder.addNetworkExtrasBundle(cls, FB_NETWORK_EXTRAS_BUNDLE);
        }
        try {
            build.loadAd(builder.build());
        } catch (Exception e10) {
            timber.log.a.e(e10, "makeRequest get ex:", new Object[0]);
        }
    }

    @Override // com.vehiclecloud.app.videofetch.rnads.api.RNAdsNative
    public void destroy(NativeAd nativeAd) {
        nativeAd.destroy();
    }

    @Override // com.vehiclecloud.app.videofetch.rnads.api.RNAdsNative
    public View inflateAdView(Activity activity, NativeAd nativeAd, int i10, int i11) {
        int i12;
        t7.d dVar = new t7.d(activity);
        float f10 = activity.getResources().getDisplayMetrics().density;
        dVar.setLayoutParams(new ViewGroup.LayoutParams((int) (i10 * f10), (int) (i11 * f10)));
        LayoutInflater layoutInflater = activity.getLayoutInflater();
        if (i11 > 200) {
            i12 = R.layout.gnt_medium_template_view;
        } else {
            i12 = R.layout.gnt_small_template_view;
        }
        layoutInflater.inflate(i12, dVar);
        dVar.onFinishInflate();
        dVar.setStyles(new a.C0504a().b(new ColorDrawable(0)).a());
        dVar.setNativeAd(nativeAd);
        View childAt = dVar.getChildAt(0);
        dVar.removeView(childAt);
        return childAt;
    }
}
