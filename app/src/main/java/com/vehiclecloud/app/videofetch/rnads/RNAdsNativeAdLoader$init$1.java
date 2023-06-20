package com.vehiclecloud.app.videofetch.rnads;

import com.facebook.react.bridge.ReadableArray;
import ee.u;
import ie.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import pe.p;
import we.e0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RNAdsNativeAdLoader.kt */
@f(c = "com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader$init$1", f = "RNAdsNativeAdLoader.kt", l = {41, 45}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class RNAdsNativeAdLoader$init$1 extends k implements p<e0, d<? super u>, Object> {
    final /* synthetic */ ReadableArray $adUnits;
    int I$0;
    int I$1;
    int I$2;
    int label;
    final /* synthetic */ RNAdsNativeAdLoader this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RNAdsNativeAdLoader$init$1(ReadableArray readableArray, RNAdsNativeAdLoader rNAdsNativeAdLoader, d<? super RNAdsNativeAdLoader$init$1> dVar) {
        super(2, dVar);
        this.$adUnits = readableArray;
        this.this$0 = rNAdsNativeAdLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<u> create(Object obj, d<?> dVar) {
        return new RNAdsNativeAdLoader$init$1(this.$adUnits, this.this$0, dVar);
    }

    @Override // pe.p
    public final Object invoke(e0 e0Var, d<? super u> dVar) {
        return ((RNAdsNativeAdLoader$init$1) create(e0Var, dVar)).invokeSuspend(u.f29813a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x007a -> B:11:0x003a). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = je.b.c()
            int r1 = r10.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L2d
            if (r1 == r3) goto L21
            if (r1 != r2) goto L19
            int r1 = r10.I$1
            int r4 = r10.I$0
            ee.o.b(r11)
            r11 = r1
            r1 = r4
            r4 = r10
            goto L3a
        L19:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L21:
            int r1 = r10.I$2
            int r4 = r10.I$1
            int r5 = r10.I$0
            ee.o.b(r11)
            r11 = r4
            r4 = r10
            goto L52
        L2d:
            ee.o.b(r11)
            r11 = 0
            com.facebook.react.bridge.ReadableArray r1 = r10.$adUnits
            int r1 = r1.size()
            r4 = r10
            r11 = r1
            r1 = 0
        L3a:
            if (r1 >= r11) goto L7c
            int r5 = r1 + 1
            long r6 = (long) r1
            r8 = 2000(0x7d0, double:9.88E-321)
            long r6 = r6 * r8
            r4.I$0 = r5
            r4.I$1 = r11
            r4.I$2 = r1
            r4.label = r3
            java.lang.Object r6 = we.n0.a(r6, r4)
            if (r6 != r0) goto L52
            return r0
        L52:
            com.facebook.react.bridge.ReadableArray r6 = r4.$adUnits
            com.facebook.react.bridge.ReadableMap r1 = r6.getMap(r1)
            java.lang.String r6 = "adUnits.getMap(i)"
            qe.k.e(r1, r6)
            java.lang.String r6 = "unitId"
            java.lang.String r6 = r1.getString(r6)
            if (r6 == 0) goto L7a
            com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader r7 = r4.this$0
            java.lang.String r8 = "height"
            int r1 = r1.getInt(r8)
            r4.I$0 = r5
            r4.I$1 = r11
            r4.label = r2
            java.lang.Object r1 = com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader.access$cacheAd(r7, r6, r1, r4)
            if (r1 != r0) goto L7a
            return r0
        L7a:
            r1 = r5
            goto L3a
        L7c:
            ee.u r11 = ee.u.f29813a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader$init$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
