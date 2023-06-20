package com.vehiclecloud.app.videofetch.rnads;

import android.os.Bundle;
import com.vehiclecloud.app.videofetch.extensions.FirebaseAnalyticsExtensionsKt;
import com.vehiclecloud.app.videofetch.rnbillingclient.Analytics;
import ee.o;
import ee.u;
import ie.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import pe.p;
import we.e0;

/* compiled from: RNAdsSplashModule.kt */
@f(c = "com.vehiclecloud.app.videofetch.rnads.RNAdsSplashModule$onAdFailedToLoad$1", f = "RNAdsSplashModule.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RNAdsSplashModule$onAdFailedToLoad$1 extends k implements p<e0, d<? super u>, Object> {
    final /* synthetic */ String $cause;
    int label;
    final /* synthetic */ RNAdsSplashModule this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RNAdsSplashModule$onAdFailedToLoad$1(RNAdsSplashModule rNAdsSplashModule, String str, d<? super RNAdsSplashModule$onAdFailedToLoad$1> dVar) {
        super(2, dVar);
        this.this$0 = rNAdsSplashModule;
        this.$cause = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<u> create(Object obj, d<?> dVar) {
        return new RNAdsSplashModule$onAdFailedToLoad$1(this.this$0, this.$cause, dVar);
    }

    @Override // pe.p
    public final Object invoke(e0 e0Var, d<? super u> dVar) {
        return ((RNAdsSplashModule$onAdFailedToLoad$1) create(e0Var, dVar)).invokeSuspend(u.f29813a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        int i10;
        String str;
        String str2;
        String str3;
        je.d.c();
        if (this.label == 0) {
            o.b(obj);
            i10 = this.this$0.state;
            if (i10 == 1) {
                RNAdsSplashModule rNAdsSplashModule = this.this$0;
                str3 = rNAdsSplashModule.adUnitId;
                if (str3 == null) {
                    qe.k.s("adUnitId");
                    str3 = null;
                }
                rNAdsSplashModule.sendSplashEvent("error", str3, this.$cause);
            } else {
                this.this$0.mFailedCause = this.$cause;
            }
            RNAdsSplashModule rNAdsSplashModule2 = this.this$0;
            Bundle bundle = new Bundle();
            RNAdsSplashModule rNAdsSplashModule3 = this.this$0;
            String str4 = this.$cause;
            str = rNAdsSplashModule3.screen;
            bundle.putString("item_category", str);
            str2 = rNAdsSplashModule3.screen;
            bundle.putString(Analytics.Param.ITEM_NAME, str2);
            FirebaseAnalyticsExtensionsKt.putAnalyticsString(bundle, "error_code", str4);
            u uVar = u.f29813a;
            rNAdsSplashModule2.logEvent("iads_failed", bundle);
            return uVar;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
