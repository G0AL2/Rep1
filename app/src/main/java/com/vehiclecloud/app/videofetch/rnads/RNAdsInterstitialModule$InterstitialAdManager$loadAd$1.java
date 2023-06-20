package com.vehiclecloud.app.videofetch.rnads;

import android.os.Bundle;
import com.facebook.react.bridge.ReactApplicationContext;
import com.vehiclecloud.app.videofetch.rnads.RNAdsInterstitialModule;
import com.vehiclecloud.app.videofetch.rnads.api.RNAdsInterstitial;
import ee.o;
import ee.u;
import ie.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import pe.p;
import we.e0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RNAdsInterstitialModule.kt */
@f(c = "com.vehiclecloud.app.videofetch.rnads.RNAdsInterstitialModule$InterstitialAdManager$loadAd$1", f = "RNAdsInterstitialModule.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class RNAdsInterstitialModule$InterstitialAdManager$loadAd$1 extends k implements p<e0, d<? super u>, Object> {
    int label;
    final /* synthetic */ RNAdsInterstitialModule.InterstitialAdManager this$0;
    final /* synthetic */ RNAdsInterstitialModule this$1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RNAdsInterstitialModule$InterstitialAdManager$loadAd$1(RNAdsInterstitialModule.InterstitialAdManager interstitialAdManager, RNAdsInterstitialModule rNAdsInterstitialModule, d<? super RNAdsInterstitialModule$InterstitialAdManager$loadAd$1> dVar) {
        super(2, dVar);
        this.this$0 = interstitialAdManager;
        this.this$1 = rNAdsInterstitialModule;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<u> create(Object obj, d<?> dVar) {
        return new RNAdsInterstitialModule$InterstitialAdManager$loadAd$1(this.this$0, this.this$1, dVar);
    }

    @Override // pe.p
    public final Object invoke(e0 e0Var, d<? super u> dVar) {
        return ((RNAdsInterstitialModule$InterstitialAdManager$loadAd$1) create(e0Var, dVar)).invokeSuspend(u.f29813a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        RNAdsInterstitial rNAdsInterstitial;
        ReactApplicationContext reactApplicationContext;
        String str;
        Bundle analyticsCommonParams;
        je.d.c();
        if (this.label == 0) {
            o.b(obj);
            this.this$0.loadTime = System.currentTimeMillis();
            this.this$0.cancelReLoadSchedule();
            rNAdsInterstitial = this.this$1.interstitialAd;
            reactApplicationContext = this.this$1.getReactApplicationContext();
            str = this.this$0.adUnitId;
            rNAdsInterstitial.load(reactApplicationContext, str, this.this$0);
            RNAdsInterstitialModule rNAdsInterstitialModule = this.this$1;
            analyticsCommonParams = this.this$0.getAnalyticsCommonParams();
            rNAdsInterstitialModule.logEvent("iads_load", analyticsCommonParams);
            return u.f29813a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
