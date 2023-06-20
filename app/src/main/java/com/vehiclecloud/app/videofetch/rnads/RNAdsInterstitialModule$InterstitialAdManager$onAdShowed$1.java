package com.vehiclecloud.app.videofetch.rnads;

import android.os.Bundle;
import com.vehiclecloud.app.videofetch.rnads.RNAdsInterstitialModule;
import com.vehiclecloud.app.videofetch.rnads.api.RNAdsEvents;
import ee.o;
import ee.u;
import ie.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import pe.p;
import we.e0;

/* compiled from: RNAdsInterstitialModule.kt */
@f(c = "com.vehiclecloud.app.videofetch.rnads.RNAdsInterstitialModule$InterstitialAdManager$onAdShowed$1", f = "RNAdsInterstitialModule.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RNAdsInterstitialModule$InterstitialAdManager$onAdShowed$1 extends k implements p<e0, d<? super u>, Object> {
    int label;
    final /* synthetic */ RNAdsInterstitialModule this$0;
    final /* synthetic */ RNAdsInterstitialModule.InterstitialAdManager this$1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RNAdsInterstitialModule$InterstitialAdManager$onAdShowed$1(RNAdsInterstitialModule rNAdsInterstitialModule, RNAdsInterstitialModule.InterstitialAdManager interstitialAdManager, d<? super RNAdsInterstitialModule$InterstitialAdManager$onAdShowed$1> dVar) {
        super(2, dVar);
        this.this$0 = rNAdsInterstitialModule;
        this.this$1 = interstitialAdManager;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<u> create(Object obj, d<?> dVar) {
        return new RNAdsInterstitialModule$InterstitialAdManager$onAdShowed$1(this.this$0, this.this$1, dVar);
    }

    @Override // pe.p
    public final Object invoke(e0 e0Var, d<? super u> dVar) {
        return ((RNAdsInterstitialModule$InterstitialAdManager$onAdShowed$1) create(e0Var, dVar)).invokeSuspend(u.f29813a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        String str;
        Bundle analyticsCommonParams;
        je.d.c();
        if (this.label == 0) {
            o.b(obj);
            RNAdsInterstitialModule rNAdsInterstitialModule = this.this$0;
            str = this.this$1.adUnitId;
            RNAdsInterstitialModule.sendInterstitialEvent$default(rNAdsInterstitialModule, RNAdsEvents.EVENT_OPENED, str, null, 4, null);
            RNAdsInterstitialModule rNAdsInterstitialModule2 = this.this$0;
            analyticsCommonParams = this.this$1.getAnalyticsCommonParams();
            rNAdsInterstitialModule2.logEvent("iads_imp", analyticsCommonParams);
            return u.f29813a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
