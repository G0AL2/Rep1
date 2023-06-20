package com.vehiclecloud.app.videofetch.rnads;

import com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader;
import ee.u;
import ie.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import pe.p;
import we.e0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RNAdsNativeAdLoader.kt */
@f(c = "com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader$RNAdsNativeManager$loadAd$1", f = "RNAdsNativeAdLoader.kt", l = {249}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class RNAdsNativeAdLoader$RNAdsNativeManager$loadAd$1 extends k implements p<e0, d<? super u>, Object> {
    int label;
    final /* synthetic */ RNAdsNativeAdLoader.RNAdsNativeManager this$0;
    final /* synthetic */ RNAdsNativeAdLoader this$1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RNAdsNativeAdLoader$RNAdsNativeManager$loadAd$1(RNAdsNativeAdLoader.RNAdsNativeManager rNAdsNativeManager, RNAdsNativeAdLoader rNAdsNativeAdLoader, d<? super RNAdsNativeAdLoader$RNAdsNativeManager$loadAd$1> dVar) {
        super(2, dVar);
        this.this$0 = rNAdsNativeManager;
        this.this$1 = rNAdsNativeAdLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<u> create(Object obj, d<?> dVar) {
        return new RNAdsNativeAdLoader$RNAdsNativeManager$loadAd$1(this.this$0, this.this$1, dVar);
    }

    @Override // pe.p
    public final Object invoke(e0 e0Var, d<? super u> dVar) {
        return ((RNAdsNativeAdLoader$RNAdsNativeManager$loadAd$1) create(e0Var, dVar)).invokeSuspend(u.f29813a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = je.b.c()
            int r1 = r5.label
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            ee.o.b(r6)
            goto L4d
        Lf:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L17:
            ee.o.b(r6)
            com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader$RNAdsNativeManager r6 = r5.this$0
            boolean r6 = com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader.RNAdsNativeManager.access$getMIsActive$p(r6)
            if (r6 == 0) goto La6
            com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader$RNAdsNativeManager r6 = r5.this$0
            java.lang.Object r6 = com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader.RNAdsNativeManager.access$getAd$p(r6)
            if (r6 == 0) goto La6
            com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader r6 = r5.this$1
            java.util.Map r6 = com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader.access$getCache$p(r6)
            com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader$RNAdsNativeManager r1 = r5.this$0
            int r1 = r1.getHeight()
            java.lang.Integer r1 = kotlin.coroutines.jvm.internal.b.b(r1)
            java.lang.Object r6 = r6.get(r1)
            com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader$AdCache r6 = (com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader.AdCache) r6
            if (r6 != 0) goto L44
            r6 = 0
            goto L4f
        L44:
            r5.label = r2
            java.lang.Object r6 = r6.getLoaded(r5)
            if (r6 != r0) goto L4d
            return r0
        L4d:
            com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader$RNAdsNativeManager r6 = (com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader.RNAdsNativeManager) r6
        L4f:
            if (r6 == 0) goto La6
            timber.log.a$b r0 = timber.log.a.f37331a
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r3 = 0
            com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader$RNAdsNativeManager r4 = r5.this$0
            java.lang.String r4 = com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader.RNAdsNativeManager.access$getMScreen$p(r4)
            r1[r3] = r4
            com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader$RNAdsNativeManager r3 = r5.this$0
            java.lang.String r3 = r3.getAdUnitId$app_orangeRelease()
            r1[r2] = r3
            r2 = 2
            com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader$RNAdsNativeManager r3 = r5.this$0
            int r3 = r3.getHeight()
            java.lang.Integer r3 = kotlin.coroutines.jvm.internal.b.b(r3)
            r1[r2] = r3
            java.lang.String r2 = "loadAd from cache:[%s] - %s;size: %d"
            r0.v(r2, r1)
            com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader$RNAdsNativeManager r0 = r5.this$0
            com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader.RNAdsNativeManager.access$cancelReLoadSchedule(r0)
            com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader$RNAdsNativeManager r0 = r5.this$0
            java.lang.String r0 = com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader.RNAdsNativeManager.access$getMScreen$p(r0)
            com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader.RNAdsNativeManager.access$setMScreen$p(r6, r0)
            com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader$RNAdsNativeManager r0 = r5.this$0
            android.widget.LinearLayout r0 = com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader.RNAdsNativeManager.access$getMView$p(r0)
            com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader.RNAdsNativeManager.access$setMView$p(r6, r0)
            boolean r0 = com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader.RNAdsNativeManager.access$getMIsActive$p(r6)
            com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader.RNAdsNativeManager.access$setMIsActive$p(r6, r0)
            com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader$RNAdsNativeManager r0 = r5.this$0
            java.lang.Object r6 = com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader.RNAdsNativeManager.access$getAd$p(r6)
            qe.k.c(r6)
            com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader.RNAdsNativeManager.access$doOnAdLoaded(r0, r6)
            ee.u r6 = ee.u.f29813a
            return r6
        La6:
            com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader$RNAdsNativeManager r6 = r5.this$0
            long r0 = java.lang.System.currentTimeMillis()
            com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader.RNAdsNativeManager.access$setLoadTime$p(r6, r0)
            com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader$RNAdsNativeManager r6 = r5.this$0
            com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader.RNAdsNativeManager.access$cancelReLoadSchedule(r6)
            com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader r6 = r5.this$1
            com.vehiclecloud.app.videofetch.rnads.api.RNAdsNative r6 = com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader.access$getMNative$p(r6)
            com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader r0 = r5.this$1
            com.facebook.react.bridge.ReactApplicationContext r0 = com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader.access$getReactContext$p(r0)
            com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader$RNAdsNativeManager r1 = r5.this$0
            java.lang.String r1 = r1.getAdUnitId$app_orangeRelease()
            com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader$RNAdsNativeManager r2 = r5.this$0
            int r2 = r2.getHeight()
            com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader$RNAdsNativeManager r3 = r5.this$0
            r6.loadAd(r0, r1, r2, r3)
            com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader r6 = r5.this$1
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader$RNAdsNativeManager r1 = r5.this$0
            java.lang.String r2 = com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader.RNAdsNativeManager.access$getMScreen$p(r1)
            java.lang.String r3 = "item_category"
            r0.putString(r3, r2)
            java.lang.String r1 = com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader.RNAdsNativeManager.access$getMScreen$p(r1)
            java.lang.String r2 = "item_name"
            r0.putString(r2, r1)
            ee.u r1 = ee.u.f29813a
            java.lang.String r2 = "bads_load"
            com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader.access$logEvent(r6, r2, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader$RNAdsNativeManager$loadAd$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
