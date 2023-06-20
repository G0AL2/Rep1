package com.vehiclecloud.app.videofetch.rnads;

import android.app.Activity;
import com.vehiclecloud.app.videofetch.rnads.api.RNAdsReward;
import ee.o;
import ee.u;
import ie.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import pe.p;
import we.e0;

/* compiled from: RNAdsRewardModule.kt */
@f(c = "com.vehiclecloud.app.videofetch.rnads.RNAdsRewardModule$show$1$1", f = "RNAdsRewardModule.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RNAdsRewardModule$show$1$1 extends k implements p<e0, d<? super u>, Object> {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ String $adUnitId;
    int label;
    final /* synthetic */ RNAdsRewardModule this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RNAdsRewardModule$show$1$1(RNAdsRewardModule rNAdsRewardModule, String str, Activity activity, d<? super RNAdsRewardModule$show$1$1> dVar) {
        super(2, dVar);
        this.this$0 = rNAdsRewardModule;
        this.$adUnitId = str;
        this.$activity = activity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<u> create(Object obj, d<?> dVar) {
        return new RNAdsRewardModule$show$1$1(this.this$0, this.$adUnitId, this.$activity, dVar);
    }

    @Override // pe.p
    public final Object invoke(e0 e0Var, d<? super u> dVar) {
        return ((RNAdsRewardModule$show$1$1) create(e0Var, dVar)).invokeSuspend(u.f29813a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        RNAdsReward rNAdsReward;
        Object obj2;
        je.d.c();
        if (this.label == 0) {
            o.b(obj);
            this.this$0.isShowingAd = true;
            this.this$0.mAdUnitId = this.$adUnitId;
            try {
                rNAdsReward = this.this$0.mReward;
                Activity activity = this.$activity;
                RNAdsRewardModule rNAdsRewardModule = this.this$0;
                obj2 = rNAdsRewardModule.f28540ad;
                rNAdsReward.showByObject(activity, rNAdsRewardModule, obj2);
            } catch (Exception e10) {
                this.this$0.isShowingAd = false;
                timber.log.a.f37331a.e(e10, "show ad get ex:", new Object[0]);
            }
            return u.f29813a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
