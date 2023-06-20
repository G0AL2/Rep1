package com.vehiclecloud.app.videofetch.rnads;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.common.util.concurrent.b;
import com.vehiclecloud.app.videofetch.rnads.RNAdsIlrdModule;
import ee.o;
import ee.u;
import ie.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import pe.p;
import we.e0;

/* compiled from: RNAdsIlrdModule.kt */
@f(c = "com.vehiclecloud.app.videofetch.rnads.RNAdsIlrdModule$ILRDDataUploader$onPaidEvent$1", f = "RNAdsIlrdModule.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RNAdsIlrdModule$ILRDDataUploader$onPaidEvent$1 extends k implements p<e0, d<? super u>, Object> {
    final /* synthetic */ double $adValue;
    final /* synthetic */ String $currency;
    int label;
    final /* synthetic */ RNAdsIlrdModule.ILRDDataUploader this$0;
    final /* synthetic */ RNAdsIlrdModule this$1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RNAdsIlrdModule$ILRDDataUploader$onPaidEvent$1(RNAdsIlrdModule.ILRDDataUploader iLRDDataUploader, double d10, RNAdsIlrdModule rNAdsIlrdModule, String str, d<? super RNAdsIlrdModule$ILRDDataUploader$onPaidEvent$1> dVar) {
        super(2, dVar);
        this.this$0 = iLRDDataUploader;
        this.$adValue = d10;
        this.this$1 = rNAdsIlrdModule;
        this.$currency = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<u> create(Object obj, d<?> dVar) {
        return new RNAdsIlrdModule$ILRDDataUploader$onPaidEvent$1(this.this$0, this.$adValue, this.this$1, this.$currency, dVar);
    }

    @Override // pe.p
    public final Object invoke(e0 e0Var, d<? super u> dVar) {
        return ((RNAdsIlrdModule$ILRDDataUploader$onPaidEvent$1) create(e0Var, dVar)).invokeSuspend(u.f29813a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        b bVar;
        double d10;
        b bVar2;
        b bVar3;
        u uVar;
        String str;
        je.d.c();
        if (this.label == 0) {
            o.b(obj);
            bVar = this.this$0.mValue;
            double a10 = bVar.a(this.$adValue);
            d10 = this.this$0.mValueThreshold;
            if (a10 >= d10) {
                bVar2 = this.this$0.mValue;
                RNAdsIlrdModule.ILRDDataUploader iLRDDataUploader = this.this$0;
                synchronized (bVar2) {
                    bVar3 = iLRDDataUploader.mValue;
                    bVar3.c(0.0d);
                    uVar = u.f29813a;
                }
                RNAdsIlrdModule rNAdsIlrdModule = this.this$1;
                Bundle bundle = new Bundle();
                RNAdsIlrdModule.ILRDDataUploader iLRDDataUploader2 = this.this$0;
                String str2 = this.$currency;
                str = iLRDDataUploader2.mAdPlatform;
                bundle.putString("ad_platform", str);
                bundle.putDouble(AppMeasurementSdk.ConditionalUserProperty.VALUE, a10);
                bundle.putString("currency", str2);
                rNAdsIlrdModule.logEvent("tch_ad_rev_roas_001", bundle);
                return uVar;
            }
            return u.f29813a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
