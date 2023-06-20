package com.vehiclecloud.app.videofetch.rnads;

import com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader;
import ee.o;
import ee.u;
import ie.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import pe.p;
import we.e0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RNAdsNativeAdLoader.kt */
@f(c = "com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader$destroy$1", f = "RNAdsNativeAdLoader.kt", l = {101, 102}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class RNAdsNativeAdLoader$destroy$1 extends k implements p<e0, d<? super u>, Object> {
    int label;
    final /* synthetic */ RNAdsNativeAdLoader this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RNAdsNativeAdLoader$destroy$1(RNAdsNativeAdLoader rNAdsNativeAdLoader, d<? super RNAdsNativeAdLoader$destroy$1> dVar) {
        super(2, dVar);
        this.this$0 = rNAdsNativeAdLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<u> create(Object obj, d<?> dVar) {
        return new RNAdsNativeAdLoader$destroy$1(this.this$0, dVar);
    }

    @Override // pe.p
    public final Object invoke(e0 e0Var, d<? super u> dVar) {
        return ((RNAdsNativeAdLoader$destroy$1) create(e0Var, dVar)).invokeSuspend(u.f29813a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object c10;
        RNAdsNativeAdLoader.AdCache adCache;
        RNAdsNativeAdLoader.AdCache adCache2;
        c10 = je.d.c();
        int i10 = this.label;
        if (i10 == 0) {
            o.b(obj);
            timber.log.a.f37331a.v("destroy begin", new Object[0]);
            adCache = this.this$0.nativeCache;
            this.label = 1;
            if (adCache.destroy(this) == c10) {
                return c10;
            }
        } else if (i10 != 1) {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            timber.log.a.f37331a.v("destroy end", new Object[0]);
            return u.f29813a;
        } else {
            o.b(obj);
        }
        adCache2 = this.this$0.nativeBannerCache;
        this.label = 2;
        if (adCache2.destroy(this) == c10) {
            return c10;
        }
        timber.log.a.f37331a.v("destroy end", new Object[0]);
        return u.f29813a;
    }
}
