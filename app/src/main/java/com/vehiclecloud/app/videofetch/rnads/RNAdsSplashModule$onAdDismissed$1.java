package com.vehiclecloud.app.videofetch.rnads;

import android.os.Bundle;
import com.vehiclecloud.app.videofetch.rnads.api.RNAdsEvents;
import ee.o;
import ee.u;
import ie.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import pe.p;
import we.e0;
import we.f0;

/* compiled from: RNAdsSplashModule.kt */
@f(c = "com.vehiclecloud.app.videofetch.rnads.RNAdsSplashModule$onAdDismissed$1", f = "RNAdsSplashModule.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RNAdsSplashModule$onAdDismissed$1 extends k implements p<e0, d<? super u>, Object> {
    int label;
    final /* synthetic */ RNAdsSplashModule this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RNAdsSplashModule$onAdDismissed$1(RNAdsSplashModule rNAdsSplashModule, d<? super RNAdsSplashModule$onAdDismissed$1> dVar) {
        super(2, dVar);
        this.this$0 = rNAdsSplashModule;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<u> create(Object obj, d<?> dVar) {
        return new RNAdsSplashModule$onAdDismissed$1(this.this$0, dVar);
    }

    @Override // pe.p
    public final Object invoke(e0 e0Var, d<? super u> dVar) {
        return ((RNAdsSplashModule$onAdDismissed$1) create(e0Var, dVar)).invokeSuspend(u.f29813a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        Bundle analyticsCommonParams;
        je.d.c();
        if (this.label == 0) {
            o.b(obj);
            RNAdsSplashModule rNAdsSplashModule = this.this$0;
            str = rNAdsSplashModule.adUnitId;
            if (str == null) {
                qe.k.s("adUnitId");
                str2 = null;
            } else {
                str2 = str;
            }
            RNAdsSplashModule.sendSplashEvent$default(rNAdsSplashModule, RNAdsEvents.EVENT_CLOSED, str2, null, 4, null);
            RNAdsSplashModule rNAdsSplashModule2 = this.this$0;
            analyticsCommonParams = rNAdsSplashModule2.getAnalyticsCommonParams();
            rNAdsSplashModule2.logEvent("iads_close", analyticsCommonParams);
            e0 scope = this.this$0.getScope();
            if (scope != null) {
                f0.c(scope, null, 1, null);
            }
            this.this$0.setScope(null);
            return u.f29813a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
