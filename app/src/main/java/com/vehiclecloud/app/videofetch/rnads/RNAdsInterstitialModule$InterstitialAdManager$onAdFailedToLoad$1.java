package com.vehiclecloud.app.videofetch.rnads;

import android.os.Bundle;
import com.vehiclecloud.app.videofetch.extensions.FirebaseAnalyticsExtensionsKt;
import com.vehiclecloud.app.videofetch.rnads.RNAdsInterstitialModule;
import com.vehiclecloud.app.videofetch.rnbillingclient.Analytics;
import ee.o;
import ee.u;
import ie.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import pe.p;
import we.e0;

/* compiled from: RNAdsInterstitialModule.kt */
@f(c = "com.vehiclecloud.app.videofetch.rnads.RNAdsInterstitialModule$InterstitialAdManager$onAdFailedToLoad$1", f = "RNAdsInterstitialModule.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RNAdsInterstitialModule$InterstitialAdManager$onAdFailedToLoad$1 extends k implements p<e0, d<? super u>, Object> {
    final /* synthetic */ String $cause;
    int label;
    final /* synthetic */ RNAdsInterstitialModule this$0;
    final /* synthetic */ RNAdsInterstitialModule.InterstitialAdManager this$1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RNAdsInterstitialModule$InterstitialAdManager$onAdFailedToLoad$1(RNAdsInterstitialModule rNAdsInterstitialModule, RNAdsInterstitialModule.InterstitialAdManager interstitialAdManager, String str, d<? super RNAdsInterstitialModule$InterstitialAdManager$onAdFailedToLoad$1> dVar) {
        super(2, dVar);
        this.this$0 = rNAdsInterstitialModule;
        this.this$1 = interstitialAdManager;
        this.$cause = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<u> create(Object obj, d<?> dVar) {
        return new RNAdsInterstitialModule$InterstitialAdManager$onAdFailedToLoad$1(this.this$0, this.this$1, this.$cause, dVar);
    }

    @Override // pe.p
    public final Object invoke(e0 e0Var, d<? super u> dVar) {
        return ((RNAdsInterstitialModule$InterstitialAdManager$onAdFailedToLoad$1) create(e0Var, dVar)).invokeSuspend(u.f29813a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        String str3;
        je.d.c();
        if (this.label == 0) {
            o.b(obj);
            RNAdsInterstitialModule rNAdsInterstitialModule = this.this$0;
            str = this.this$1.adUnitId;
            rNAdsInterstitialModule.sendInterstitialEvent("error", str, this.$cause);
            RNAdsInterstitialModule rNAdsInterstitialModule2 = this.this$0;
            Bundle bundle = new Bundle();
            RNAdsInterstitialModule.InterstitialAdManager interstitialAdManager = this.this$1;
            String str4 = this.$cause;
            str2 = interstitialAdManager.screen;
            bundle.putString("item_category", str2);
            str3 = interstitialAdManager.screen;
            bundle.putString(Analytics.Param.ITEM_NAME, str3);
            FirebaseAnalyticsExtensionsKt.putAnalyticsString(bundle, "error_code", str4);
            u uVar = u.f29813a;
            rNAdsInterstitialModule2.logEvent("iads_failed", bundle);
            return uVar;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
