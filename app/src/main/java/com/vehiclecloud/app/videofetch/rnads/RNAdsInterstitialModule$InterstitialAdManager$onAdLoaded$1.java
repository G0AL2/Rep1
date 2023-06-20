package com.vehiclecloud.app.videofetch.rnads;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.vehiclecloud.app.videofetch.rnads.RNAdsInterstitialModule;
import com.vehiclecloud.app.videofetch.rnads.api.RNAdsEvents;
import com.vehiclecloud.app.videofetch.rnbillingclient.Analytics;
import ee.o;
import ee.u;
import ie.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import pe.p;
import we.e0;

/* compiled from: RNAdsInterstitialModule.kt */
@f(c = "com.vehiclecloud.app.videofetch.rnads.RNAdsInterstitialModule$InterstitialAdManager$onAdLoaded$1", f = "RNAdsInterstitialModule.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RNAdsInterstitialModule$InterstitialAdManager$onAdLoaded$1 extends k implements p<e0, d<? super u>, Object> {
    int label;
    final /* synthetic */ RNAdsInterstitialModule this$0;
    final /* synthetic */ RNAdsInterstitialModule.InterstitialAdManager this$1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RNAdsInterstitialModule$InterstitialAdManager$onAdLoaded$1(RNAdsInterstitialModule rNAdsInterstitialModule, RNAdsInterstitialModule.InterstitialAdManager interstitialAdManager, d<? super RNAdsInterstitialModule$InterstitialAdManager$onAdLoaded$1> dVar) {
        super(2, dVar);
        this.this$0 = rNAdsInterstitialModule;
        this.this$1 = interstitialAdManager;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<u> create(Object obj, d<?> dVar) {
        return new RNAdsInterstitialModule$InterstitialAdManager$onAdLoaded$1(this.this$0, this.this$1, dVar);
    }

    @Override // pe.p
    public final Object invoke(e0 e0Var, d<? super u> dVar) {
        return ((RNAdsInterstitialModule$InterstitialAdManager$onAdLoaded$1) create(e0Var, dVar)).invokeSuspend(u.f29813a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        String str3;
        long j10;
        je.d.c();
        if (this.label == 0) {
            o.b(obj);
            RNAdsInterstitialModule rNAdsInterstitialModule = this.this$0;
            str = this.this$1.adUnitId;
            RNAdsInterstitialModule.sendInterstitialEvent$default(rNAdsInterstitialModule, RNAdsEvents.EVENT_LOADED, str, null, 4, null);
            RNAdsInterstitialModule rNAdsInterstitialModule2 = this.this$0;
            Bundle bundle = new Bundle();
            RNAdsInterstitialModule.InterstitialAdManager interstitialAdManager = this.this$1;
            str2 = interstitialAdManager.screen;
            bundle.putString("item_category", str2);
            str3 = interstitialAdManager.screen;
            bundle.putString(Analytics.Param.ITEM_NAME, str3);
            long currentTimeMillis = System.currentTimeMillis();
            j10 = interstitialAdManager.loadTime;
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.VALUE, currentTimeMillis - j10);
            u uVar = u.f29813a;
            rNAdsInterstitialModule2.logEvent("iads_loaded", bundle);
            return uVar;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
