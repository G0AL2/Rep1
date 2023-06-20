package com.vehiclecloud.app.videofetch.rnads;

import android.app.Activity;
import com.vehiclecloud.app.videofetch.rnads.api.RNAdsEvents;
import com.vehiclecloud.app.videofetch.rnads.api.RNAdsInterstitial;
import ee.o;
import ee.u;
import ie.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import pe.p;
import we.e0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RNAdsSplashModule.kt */
@f(c = "com.vehiclecloud.app.videofetch.rnads.RNAdsSplashModule$showAd$1$1", f = "RNAdsSplashModule.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class RNAdsSplashModule$showAd$1$1 extends k implements p<e0, d<? super u>, Object> {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ Object $ad;
    int label;
    final /* synthetic */ RNAdsSplashModule this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RNAdsSplashModule$showAd$1$1(RNAdsSplashModule rNAdsSplashModule, Activity activity, Object obj, d<? super RNAdsSplashModule$showAd$1$1> dVar) {
        super(2, dVar);
        this.this$0 = rNAdsSplashModule;
        this.$activity = activity;
        this.$ad = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<u> create(Object obj, d<?> dVar) {
        return new RNAdsSplashModule$showAd$1$1(this.this$0, this.$activity, this.$ad, dVar);
    }

    @Override // pe.p
    public final Object invoke(e0 e0Var, d<? super u> dVar) {
        return ((RNAdsSplashModule$showAd$1$1) create(e0Var, dVar)).invokeSuspend(u.f29813a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        String str;
        RNAdsInterstitial rNAdsInterstitial;
        je.d.c();
        if (this.label == 0) {
            o.b(obj);
            try {
                RNAdsSplashModule rNAdsSplashModule = this.this$0;
                str = rNAdsSplashModule.adUnitId;
                if (str == null) {
                    qe.k.s("adUnitId");
                    str = null;
                }
                RNAdsSplashModule.sendSplashEvent$default(rNAdsSplashModule, RNAdsEvents.EVENT_LOADED, str, null, 4, null);
                rNAdsInterstitial = this.this$0.interstitialAd;
                rNAdsInterstitial.showByObject(this.$activity, this.this$0, this.$ad);
            } catch (Exception e10) {
                timber.log.a.f37331a.e(e10, "show ad get ex:", new Object[0]);
            }
            return u.f29813a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
