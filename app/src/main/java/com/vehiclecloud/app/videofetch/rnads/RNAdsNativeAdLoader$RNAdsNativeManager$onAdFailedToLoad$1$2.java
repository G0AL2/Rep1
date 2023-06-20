package com.vehiclecloud.app.videofetch.rnads;

import android.os.Bundle;
import com.vehiclecloud.app.videofetch.extensions.FirebaseAnalyticsExtensionsKt;
import com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader;
import com.vehiclecloud.app.videofetch.rnbillingclient.Analytics;
import ee.o;
import ee.u;
import ie.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import pe.p;
import we.e0;

/* compiled from: RNAdsNativeAdLoader.kt */
@f(c = "com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader$RNAdsNativeManager$onAdFailedToLoad$1$2", f = "RNAdsNativeAdLoader.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RNAdsNativeAdLoader$RNAdsNativeManager$onAdFailedToLoad$1$2 extends k implements p<e0, d<? super u>, Object> {
    final /* synthetic */ String $cause;
    int label;
    final /* synthetic */ RNAdsNativeAdLoader this$0;
    final /* synthetic */ RNAdsNativeAdLoader.RNAdsNativeManager this$1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RNAdsNativeAdLoader$RNAdsNativeManager$onAdFailedToLoad$1$2(RNAdsNativeAdLoader rNAdsNativeAdLoader, RNAdsNativeAdLoader.RNAdsNativeManager rNAdsNativeManager, String str, d<? super RNAdsNativeAdLoader$RNAdsNativeManager$onAdFailedToLoad$1$2> dVar) {
        super(2, dVar);
        this.this$0 = rNAdsNativeAdLoader;
        this.this$1 = rNAdsNativeManager;
        this.$cause = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<u> create(Object obj, d<?> dVar) {
        return new RNAdsNativeAdLoader$RNAdsNativeManager$onAdFailedToLoad$1$2(this.this$0, this.this$1, this.$cause, dVar);
    }

    @Override // pe.p
    public final Object invoke(e0 e0Var, d<? super u> dVar) {
        return ((RNAdsNativeAdLoader$RNAdsNativeManager$onAdFailedToLoad$1$2) create(e0Var, dVar)).invokeSuspend(u.f29813a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        je.d.c();
        if (this.label == 0) {
            o.b(obj);
            RNAdsNativeAdLoader rNAdsNativeAdLoader = this.this$0;
            Bundle bundle = new Bundle();
            RNAdsNativeAdLoader.RNAdsNativeManager rNAdsNativeManager = this.this$1;
            String str3 = this.$cause;
            str = rNAdsNativeManager.mScreen;
            bundle.putString("item_category", str);
            str2 = rNAdsNativeManager.mScreen;
            bundle.putString(Analytics.Param.ITEM_NAME, str2);
            FirebaseAnalyticsExtensionsKt.putAnalyticsString(bundle, "error_code", str3);
            u uVar = u.f29813a;
            rNAdsNativeAdLoader.logEvent("bads_failed", bundle);
            return uVar;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
