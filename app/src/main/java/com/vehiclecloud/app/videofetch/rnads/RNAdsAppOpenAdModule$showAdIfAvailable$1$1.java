package com.vehiclecloud.app.videofetch.rnads;

import android.app.Activity;
import com.vehiclecloud.app.videofetch.rnads.api.RNAdsAppOpenAd;
import ee.o;
import ee.u;
import ie.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import pe.p;
import we.e0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RNAdsAppOpenAdModule.kt */
@f(c = "com.vehiclecloud.app.videofetch.rnads.RNAdsAppOpenAdModule$showAdIfAvailable$1$1", f = "RNAdsAppOpenAdModule.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class RNAdsAppOpenAdModule$showAdIfAvailable$1$1 extends k implements p<e0, d<? super u>, Object> {
    final /* synthetic */ Activity $activity;
    int label;
    final /* synthetic */ RNAdsAppOpenAdModule this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RNAdsAppOpenAdModule$showAdIfAvailable$1$1(RNAdsAppOpenAdModule rNAdsAppOpenAdModule, Activity activity, d<? super RNAdsAppOpenAdModule$showAdIfAvailable$1$1> dVar) {
        super(2, dVar);
        this.this$0 = rNAdsAppOpenAdModule;
        this.$activity = activity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<u> create(Object obj, d<?> dVar) {
        return new RNAdsAppOpenAdModule$showAdIfAvailable$1$1(this.this$0, this.$activity, dVar);
    }

    @Override // pe.p
    public final Object invoke(e0 e0Var, d<? super u> dVar) {
        return ((RNAdsAppOpenAdModule$showAdIfAvailable$1$1) create(e0Var, dVar)).invokeSuspend(u.f29813a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        long j10;
        RNAdsAppOpenAd rNAdsAppOpenAd;
        Object obj2;
        je.d.c();
        if (this.label == 0) {
            o.b(obj);
            this.this$0.isShowingAd = true;
            RNAdsAppOpenAdModule rNAdsAppOpenAdModule = this.this$0;
            j10 = rNAdsAppOpenAdModule.readyToShowTimes;
            rNAdsAppOpenAdModule.readyToShowTimes = j10 + 1;
            try {
                rNAdsAppOpenAd = this.this$0.mAppOpenAd;
                Activity activity = this.$activity;
                RNAdsAppOpenAdModule rNAdsAppOpenAdModule2 = this.this$0;
                obj2 = rNAdsAppOpenAdModule2.appOpenAd;
                rNAdsAppOpenAd.showByObject(activity, rNAdsAppOpenAdModule2, obj2);
            } catch (Exception unused) {
                this.this$0.isShowingAd = false;
            }
            return u.f29813a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
