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
import we.n0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RNAdsInterstitialModule.kt */
@f(c = "com.vehiclecloud.app.videofetch.rnads.RNAdsInterstitialModule$InterstitialAdManager$onAdDismissed$1", f = "RNAdsInterstitialModule.kt", l = {207}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class RNAdsInterstitialModule$InterstitialAdManager$onAdDismissed$1 extends k implements p<e0, d<? super u>, Object> {
    int label;
    final /* synthetic */ RNAdsInterstitialModule this$0;
    final /* synthetic */ RNAdsInterstitialModule.InterstitialAdManager this$1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RNAdsInterstitialModule$InterstitialAdManager$onAdDismissed$1(RNAdsInterstitialModule rNAdsInterstitialModule, RNAdsInterstitialModule.InterstitialAdManager interstitialAdManager, d<? super RNAdsInterstitialModule$InterstitialAdManager$onAdDismissed$1> dVar) {
        super(2, dVar);
        this.this$0 = rNAdsInterstitialModule;
        this.this$1 = interstitialAdManager;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<u> create(Object obj, d<?> dVar) {
        return new RNAdsInterstitialModule$InterstitialAdManager$onAdDismissed$1(this.this$0, this.this$1, dVar);
    }

    @Override // pe.p
    public final Object invoke(e0 e0Var, d<? super u> dVar) {
        return ((RNAdsInterstitialModule$InterstitialAdManager$onAdDismissed$1) create(e0Var, dVar)).invokeSuspend(u.f29813a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object c10;
        String str;
        Bundle analyticsCommonParams;
        c10 = je.d.c();
        int i10 = this.label;
        if (i10 == 0) {
            o.b(obj);
            RNAdsInterstitialModule rNAdsInterstitialModule = this.this$0;
            str = this.this$1.adUnitId;
            RNAdsInterstitialModule.sendInterstitialEvent$default(rNAdsInterstitialModule, RNAdsEvents.EVENT_CLOSED, str, null, 4, null);
            RNAdsInterstitialModule rNAdsInterstitialModule2 = this.this$0;
            analyticsCommonParams = this.this$1.getAnalyticsCommonParams();
            rNAdsInterstitialModule2.logEvent("iads_close", analyticsCommonParams);
            this.label = 1;
            if (n0.a(150L, this) == c10) {
                return c10;
            }
        } else if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            o.b(obj);
        }
        this.this$1.loadAd();
        return u.f29813a;
    }
}
