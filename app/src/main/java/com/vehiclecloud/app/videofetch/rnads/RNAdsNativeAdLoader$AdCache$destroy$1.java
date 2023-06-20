package com.vehiclecloud.app.videofetch.rnads;

import androidx.recyclerview.widget.RecyclerView;
import com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RNAdsNativeAdLoader.kt */
@f(c = "com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader$AdCache", f = "RNAdsNativeAdLoader.kt", l = {459}, m = "destroy")
/* loaded from: classes3.dex */
public final class RNAdsNativeAdLoader$AdCache$destroy$1 extends d {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RNAdsNativeAdLoader.AdCache this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RNAdsNativeAdLoader$AdCache$destroy$1(RNAdsNativeAdLoader.AdCache adCache, ie.d<? super RNAdsNativeAdLoader$AdCache$destroy$1> dVar) {
        super(dVar);
        this.this$0 = adCache;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.destroy(this);
    }
}
