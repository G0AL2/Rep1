package com.vehiclecloud.app.videofetch.rnads;

import com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader;
import ee.o;
import ee.u;
import ie.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import pe.p;
import we.e0;
import we.n0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RNAdsNativeAdLoader.kt */
@f(c = "com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader$RNAdsNativeManager$scheduleReload$1", f = "RNAdsNativeAdLoader.kt", l = {428}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class RNAdsNativeAdLoader$RNAdsNativeManager$scheduleReload$1 extends k implements p<e0, d<? super u>, Object> {
    int label;
    final /* synthetic */ RNAdsNativeAdLoader.RNAdsNativeManager this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RNAdsNativeAdLoader$RNAdsNativeManager$scheduleReload$1(RNAdsNativeAdLoader.RNAdsNativeManager rNAdsNativeManager, d<? super RNAdsNativeAdLoader$RNAdsNativeManager$scheduleReload$1> dVar) {
        super(2, dVar);
        this.this$0 = rNAdsNativeManager;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<u> create(Object obj, d<?> dVar) {
        return new RNAdsNativeAdLoader$RNAdsNativeManager$scheduleReload$1(this.this$0, dVar);
    }

    @Override // pe.p
    public final Object invoke(e0 e0Var, d<? super u> dVar) {
        return ((RNAdsNativeAdLoader$RNAdsNativeManager$scheduleReload$1) create(e0Var, dVar)).invokeSuspend(u.f29813a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object c10;
        long j10;
        long j11;
        c10 = je.d.c();
        int i10 = this.label;
        if (i10 == 0) {
            o.b(obj);
            j10 = this.this$0.mReloadStartAt;
            long j12 = 20000;
            if (j10 != 0) {
                long currentTimeMillis = System.currentTimeMillis();
                j11 = this.this$0.mReloadStartAt;
                j12 = se.f.c(20000 - (currentTimeMillis - j11), 200L);
            }
            this.this$0.mReloadStartAt = System.currentTimeMillis();
            this.label = 1;
            if (n0.a(j12, this) == c10) {
                return c10;
            }
        } else if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            o.b(obj);
        }
        this.this$0.mReloadStartAt = 0L;
        this.this$0.loadAd();
        return u.f29813a;
    }
}
