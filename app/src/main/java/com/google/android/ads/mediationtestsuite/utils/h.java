package com.google.android.ads.mediationtestsuite.utils;

import android.app.Activity;
import android.content.Context;
import com.google.android.ads.mediationtestsuite.dataobjects.NetworkConfig;
import com.google.android.ads.mediationtestsuite.dataobjects.TestResult;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdOptions;

/* compiled from: NativeAdManager.java */
/* loaded from: classes2.dex */
public class h extends com.google.android.ads.mediationtestsuite.utils.a {

    /* renamed from: f  reason: collision with root package name */
    private NativeAd f20932f;

    /* compiled from: NativeAdManager.java */
    /* loaded from: classes2.dex */
    class a implements NativeAd.OnNativeAdLoadedListener {
        a() {
        }

        @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
        public void onNativeAdLoaded(NativeAd nativeAd) {
            h.this.f20932f = nativeAd;
            h.this.f20902a.H(TestResult.SUCCESS);
            h.this.f20905d.onAdLoaded();
        }
    }

    public h(NetworkConfig networkConfig, com.google.android.ads.mediationtestsuite.a aVar) {
        super(networkConfig, aVar);
    }

    @Override // com.google.android.ads.mediationtestsuite.utils.a
    protected String c() {
        NativeAd nativeAd = this.f20932f;
        if (nativeAd == null) {
            return null;
        }
        return nativeAd.getResponseInfo().getMediationAdapterClassName();
    }

    @Override // com.google.android.ads.mediationtestsuite.utils.a
    public void e(Context context) {
        new AdLoader.Builder(context, this.f20902a.h()).forNativeAd(new a()).withNativeAdOptions(new NativeAdOptions.Builder().build()).withAdListener(this.f20905d).build().loadAd(this.f20904c);
    }

    @Override // com.google.android.ads.mediationtestsuite.utils.a
    public void f(Activity activity) {
    }

    public NativeAd h() {
        return this.f20932f;
    }
}
