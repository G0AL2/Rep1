package com.vehiclecloud.app.videofetch.rnads;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.vehiclecloud.app.videofetch.rnbillingclient.Analytics;
import ee.o;
import ee.u;
import ie.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import pe.p;
import we.e0;

/* compiled from: RNAdsSplashModule.kt */
@f(c = "com.vehiclecloud.app.videofetch.rnads.RNAdsSplashModule$onAdLoaded$1", f = "RNAdsSplashModule.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RNAdsSplashModule$onAdLoaded$1 extends k implements p<e0, d<? super u>, Object> {
    int label;
    final /* synthetic */ RNAdsSplashModule this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RNAdsSplashModule$onAdLoaded$1(RNAdsSplashModule rNAdsSplashModule, d<? super RNAdsSplashModule$onAdLoaded$1> dVar) {
        super(2, dVar);
        this.this$0 = rNAdsSplashModule;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<u> create(Object obj, d<?> dVar) {
        return new RNAdsSplashModule$onAdLoaded$1(this.this$0, dVar);
    }

    @Override // pe.p
    public final Object invoke(e0 e0Var, d<? super u> dVar) {
        return ((RNAdsSplashModule$onAdLoaded$1) create(e0Var, dVar)).invokeSuspend(u.f29813a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        long j10;
        je.d.c();
        if (this.label == 0) {
            o.b(obj);
            RNAdsSplashModule rNAdsSplashModule = this.this$0;
            Bundle bundle = new Bundle();
            RNAdsSplashModule rNAdsSplashModule2 = this.this$0;
            str = rNAdsSplashModule2.screen;
            bundle.putString("item_category", str);
            str2 = rNAdsSplashModule2.screen;
            bundle.putString(Analytics.Param.ITEM_NAME, str2);
            long currentTimeMillis = System.currentTimeMillis();
            j10 = rNAdsSplashModule2.loadTime;
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.VALUE, currentTimeMillis - j10);
            u uVar = u.f29813a;
            rNAdsSplashModule.logEvent("iads_loaded", bundle);
            return uVar;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
