package com.vehiclecloud.app.videofetch.rnads;

import com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader;
import ee.o;
import ee.u;
import ie.d;
import java.util.Map;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import pe.p;
import we.e0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RNAdsNativeAdLoader.kt */
@f(c = "com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader$restoreLoader$1", f = "RNAdsNativeAdLoader.kt", l = {75, 79}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class RNAdsNativeAdLoader$restoreLoader$1 extends k implements p<e0, d<? super u>, Object> {
    final /* synthetic */ RNAdsNativeAdLoader.RNAdsNativeManager $loader;
    int label;
    final /* synthetic */ RNAdsNativeAdLoader this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RNAdsNativeAdLoader$restoreLoader$1(RNAdsNativeAdLoader.RNAdsNativeManager rNAdsNativeManager, RNAdsNativeAdLoader rNAdsNativeAdLoader, d<? super RNAdsNativeAdLoader$restoreLoader$1> dVar) {
        super(2, dVar);
        this.$loader = rNAdsNativeManager;
        this.this$0 = rNAdsNativeAdLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<u> create(Object obj, d<?> dVar) {
        return new RNAdsNativeAdLoader$restoreLoader$1(this.$loader, this.this$0, dVar);
    }

    @Override // pe.p
    public final Object invoke(e0 e0Var, d<? super u> dVar) {
        return ((RNAdsNativeAdLoader$restoreLoader$1) create(e0Var, dVar)).invokeSuspend(u.f29813a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object c10;
        Map map;
        c10 = je.d.c();
        int i10 = this.label;
        if (i10 == 0) {
            o.b(obj);
            timber.log.a.f37331a.v("restoreLoader adUnitId: %s, height: %d, %b", this.$loader.getAdUnitId$app_orangeRelease(), b.b(this.$loader.getHeight()), b.a(this.$loader.isCacheable()));
            map = this.this$0.cache;
            RNAdsNativeAdLoader.AdCache adCache = (RNAdsNativeAdLoader.AdCache) map.get(b.b(this.$loader.getHeight()));
            if (adCache != null) {
                RNAdsNativeAdLoader.RNAdsNativeManager rNAdsNativeManager = this.$loader;
                RNAdsNativeAdLoader rNAdsNativeAdLoader = this.this$0;
                if (rNAdsNativeManager.isCacheable()) {
                    this.label = 1;
                    if (adCache.put(rNAdsNativeManager, this) == c10) {
                        return c10;
                    }
                } else {
                    rNAdsNativeManager.destroyAd$app_orangeRelease();
                    if (adCache.isEmpty()) {
                        RNAdsNativeAdLoader.RNAdsNativeManager rNAdsNativeManager2 = new RNAdsNativeAdLoader.RNAdsNativeManager(rNAdsNativeAdLoader, rNAdsNativeManager.getAdUnitId$app_orangeRelease(), rNAdsNativeManager.getHeight());
                        this.label = 2;
                        if (adCache.put(rNAdsNativeManager2, this) == c10) {
                            return c10;
                        }
                    }
                }
            }
        } else if (i10 != 1 && i10 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            o.b(obj);
        }
        return u.f29813a;
    }
}
