package com.vehiclecloud.app.videofetch.rnads;

import com.vehiclecloud.app.videofetch.rnads.RNAdsInterstitialModule;
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
@f(c = "com.vehiclecloud.app.videofetch.rnads.RNAdsInterstitialModule$InterstitialAdManager$scheduleReload$1", f = "RNAdsInterstitialModule.kt", l = {275}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class RNAdsInterstitialModule$InterstitialAdManager$scheduleReload$1 extends k implements p<e0, d<? super u>, Object> {
    int label;
    final /* synthetic */ RNAdsInterstitialModule.InterstitialAdManager this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RNAdsInterstitialModule$InterstitialAdManager$scheduleReload$1(RNAdsInterstitialModule.InterstitialAdManager interstitialAdManager, d<? super RNAdsInterstitialModule$InterstitialAdManager$scheduleReload$1> dVar) {
        super(2, dVar);
        this.this$0 = interstitialAdManager;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<u> create(Object obj, d<?> dVar) {
        return new RNAdsInterstitialModule$InterstitialAdManager$scheduleReload$1(this.this$0, dVar);
    }

    @Override // pe.p
    public final Object invoke(e0 e0Var, d<? super u> dVar) {
        return ((RNAdsInterstitialModule$InterstitialAdManager$scheduleReload$1) create(e0Var, dVar)).invokeSuspend(u.f29813a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object c10;
        int i10;
        c10 = je.d.c();
        int i11 = this.label;
        if (i11 == 0) {
            o.b(obj);
            i10 = this.this$0.retryTimes;
            this.label = 1;
            if (n0.a(i10 * 5000, this) == c10) {
                return c10;
            }
        } else if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            o.b(obj);
        }
        this.this$0.loadAd();
        return u.f29813a;
    }
}
