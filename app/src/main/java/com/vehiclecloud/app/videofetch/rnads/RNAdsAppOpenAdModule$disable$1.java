package com.vehiclecloud.app.videofetch.rnads;

import androidx.lifecycle.z;
import ee.o;
import ee.u;
import ie.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import pe.p;
import we.e0;

/* compiled from: RNAdsAppOpenAdModule.kt */
@f(c = "com.vehiclecloud.app.videofetch.rnads.RNAdsAppOpenAdModule$disable$1", f = "RNAdsAppOpenAdModule.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RNAdsAppOpenAdModule$disable$1 extends k implements p<e0, d<? super u>, Object> {
    int label;
    final /* synthetic */ RNAdsAppOpenAdModule this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RNAdsAppOpenAdModule$disable$1(RNAdsAppOpenAdModule rNAdsAppOpenAdModule, d<? super RNAdsAppOpenAdModule$disable$1> dVar) {
        super(2, dVar);
        this.this$0 = rNAdsAppOpenAdModule;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<u> create(Object obj, d<?> dVar) {
        return new RNAdsAppOpenAdModule$disable$1(this.this$0, dVar);
    }

    @Override // pe.p
    public final Object invoke(e0 e0Var, d<? super u> dVar) {
        return ((RNAdsAppOpenAdModule$disable$1) create(e0Var, dVar)).invokeSuspend(u.f29813a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        je.d.c();
        if (this.label == 0) {
            o.b(obj);
            z.h().getLifecycle().c(this.this$0);
            return u.f29813a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
