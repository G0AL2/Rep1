package com.vehiclecloud.app.videofetch.rnads;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RNAdsNativeAdLoader.kt */
@f(c = "com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader", f = "RNAdsNativeAdLoader.kt", l = {62}, m = "getLoader")
/* loaded from: classes3.dex */
public final class RNAdsNativeAdLoader$getLoader$1 extends d {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RNAdsNativeAdLoader this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RNAdsNativeAdLoader$getLoader$1(RNAdsNativeAdLoader rNAdsNativeAdLoader, ie.d<? super RNAdsNativeAdLoader$getLoader$1> dVar) {
        super(dVar);
        this.this$0 = rNAdsNativeAdLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object loader;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        loader = this.this$0.getLoader(null, 0, this);
        return loader;
    }
}
