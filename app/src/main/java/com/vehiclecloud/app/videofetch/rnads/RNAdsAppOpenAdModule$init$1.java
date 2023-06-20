package com.vehiclecloud.app.videofetch.rnads;

import androidx.lifecycle.z;
import ee.o;
import ee.u;
import ie.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import pe.p;
import we.e0;
import we.n0;

/* compiled from: RNAdsAppOpenAdModule.kt */
@f(c = "com.vehiclecloud.app.videofetch.rnads.RNAdsAppOpenAdModule$init$1", f = "RNAdsAppOpenAdModule.kt", l = {44}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RNAdsAppOpenAdModule$init$1 extends k implements p<e0, d<? super u>, Object> {
    final /* synthetic */ String $adUnitId;
    int label;
    final /* synthetic */ RNAdsAppOpenAdModule this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RNAdsAppOpenAdModule$init$1(RNAdsAppOpenAdModule rNAdsAppOpenAdModule, String str, d<? super RNAdsAppOpenAdModule$init$1> dVar) {
        super(2, dVar);
        this.this$0 = rNAdsAppOpenAdModule;
        this.$adUnitId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<u> create(Object obj, d<?> dVar) {
        return new RNAdsAppOpenAdModule$init$1(this.this$0, this.$adUnitId, dVar);
    }

    @Override // pe.p
    public final Object invoke(e0 e0Var, d<? super u> dVar) {
        return ((RNAdsAppOpenAdModule$init$1) create(e0Var, dVar)).invokeSuspend(u.f29813a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object c10;
        c10 = je.d.c();
        int i10 = this.label;
        if (i10 == 0) {
            o.b(obj);
            this.this$0.mAdUnitId = this.$adUnitId;
            this.label = 1;
            if (n0.a(3000L, this) == c10) {
                return c10;
            }
        } else if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            o.b(obj);
        }
        this.this$0.loadAd();
        z.h().getLifecycle().a(this.this$0);
        return u.f29813a;
    }
}
