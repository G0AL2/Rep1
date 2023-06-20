package com.vehiclecloud.app.videofetch.rnads;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import ee.o;
import ee.u;
import ie.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import pe.p;
import we.e0;
import we.n0;

/* compiled from: RNAdsInterstitialModule.kt */
@f(c = "com.vehiclecloud.app.videofetch.rnads.RNAdsInterstitialModule$load$1", f = "RNAdsInterstitialModule.kt", l = {44}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RNAdsInterstitialModule$load$1 extends k implements p<e0, d<? super u>, Object> {
    final /* synthetic */ ReadableArray $adUnits;
    final /* synthetic */ Promise $promise;
    int I$0;
    int I$1;
    Object L$0;
    int label;
    final /* synthetic */ RNAdsInterstitialModule this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RNAdsInterstitialModule$load$1(ReadableArray readableArray, RNAdsInterstitialModule rNAdsInterstitialModule, Promise promise, d<? super RNAdsInterstitialModule$load$1> dVar) {
        super(2, dVar);
        this.$adUnits = readableArray;
        this.this$0 = rNAdsInterstitialModule;
        this.$promise = promise;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<u> create(Object obj, d<?> dVar) {
        return new RNAdsInterstitialModule$load$1(this.$adUnits, this.this$0, this.$promise, dVar);
    }

    @Override // pe.p
    public final Object invoke(e0 e0Var, d<? super u> dVar) {
        return ((RNAdsInterstitialModule$load$1) create(e0Var, dVar)).invokeSuspend(u.f29813a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object c10;
        int size;
        RNAdsInterstitialModule$load$1 rNAdsInterstitialModule$load$1;
        WritableArray writableArray;
        int i10;
        int loadAd;
        c10 = je.d.c();
        int i11 = this.label;
        if (i11 == 0) {
            o.b(obj);
            WritableArray createArray = Arguments.createArray();
            size = this.$adUnits.size();
            rNAdsInterstitialModule$load$1 = this;
            writableArray = createArray;
            i10 = 0;
        } else if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            size = this.I$1;
            int i12 = this.I$0;
            writableArray = (WritableArray) this.L$0;
            o.b(obj);
            i10 = i12;
            rNAdsInterstitialModule$load$1 = this;
        }
        while (i10 < size) {
            int i13 = i10 + 1;
            ReadableMap map = rNAdsInterstitialModule$load$1.$adUnits.getMap(i10);
            qe.k.e(map, "adUnits.getMap(i)");
            String string = map.getString("unitId");
            String string2 = map.getString("screen");
            if (string != null && string2 != null) {
                loadAd = rNAdsInterstitialModule$load$1.this$0.loadAd(string, string2);
                writableArray.pushInt(loadAd);
            } else {
                writableArray.pushInt(0);
            }
            rNAdsInterstitialModule$load$1.L$0 = writableArray;
            rNAdsInterstitialModule$load$1.I$0 = i13;
            rNAdsInterstitialModule$load$1.I$1 = size;
            rNAdsInterstitialModule$load$1.label = 1;
            if (n0.a(Constants.MIN_PROGRESS_TIME, rNAdsInterstitialModule$load$1) == c10) {
                return c10;
            }
            i10 = i13;
        }
        rNAdsInterstitialModule$load$1.$promise.resolve(writableArray);
        return u.f29813a;
    }
}
