package com.vehiclecloud.app.videofetch.rnads;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RNAdsNativeAdLoader.kt */
@f(c = "com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader", f = "RNAdsNativeAdLoader.kt", l = {55}, m = "cacheAd")
/* loaded from: classes3.dex */
public final class RNAdsNativeAdLoader$cacheAd$1 extends d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RNAdsNativeAdLoader this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RNAdsNativeAdLoader$cacheAd$1(RNAdsNativeAdLoader rNAdsNativeAdLoader, ie.d<? super RNAdsNativeAdLoader$cacheAd$1> dVar) {
        super(dVar);
        this.this$0 = rNAdsNativeAdLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object cacheAd;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        cacheAd = this.this$0.cacheAd(null, 0, this);
        return cacheAd;
    }
}
