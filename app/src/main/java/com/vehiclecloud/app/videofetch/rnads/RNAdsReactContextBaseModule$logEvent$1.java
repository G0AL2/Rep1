package com.vehiclecloud.app.videofetch.rnads;

import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import ee.o;
import ee.u;
import ie.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import pe.p;
import we.e0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RNAdsReactContextBaseModule.kt */
@f(c = "com.vehiclecloud.app.videofetch.rnads.RNAdsReactContextBaseModule$logEvent$1", f = "RNAdsReactContextBaseModule.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class RNAdsReactContextBaseModule$logEvent$1 extends k implements p<e0, d<? super u>, Object> {
    final /* synthetic */ String $name;
    final /* synthetic */ Bundle $params;
    int label;
    final /* synthetic */ RNAdsReactContextBaseModule this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RNAdsReactContextBaseModule$logEvent$1(RNAdsReactContextBaseModule rNAdsReactContextBaseModule, String str, Bundle bundle, d<? super RNAdsReactContextBaseModule$logEvent$1> dVar) {
        super(2, dVar);
        this.this$0 = rNAdsReactContextBaseModule;
        this.$name = str;
        this.$params = bundle;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<u> create(Object obj, d<?> dVar) {
        return new RNAdsReactContextBaseModule$logEvent$1(this.this$0, this.$name, this.$params, dVar);
    }

    @Override // pe.p
    public final Object invoke(e0 e0Var, d<? super u> dVar) {
        return ((RNAdsReactContextBaseModule$logEvent$1) create(e0Var, dVar)).invokeSuspend(u.f29813a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        FirebaseAnalytics firebaseAnalytics;
        je.d.c();
        if (this.label == 0) {
            o.b(obj);
            firebaseAnalytics = this.this$0.mAnalytics;
            firebaseAnalytics.b(this.$name, this.$params);
            return u.f29813a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
