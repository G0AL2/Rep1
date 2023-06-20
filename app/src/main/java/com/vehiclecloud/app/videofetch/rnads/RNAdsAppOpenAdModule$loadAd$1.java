package com.vehiclecloud.app.videofetch.rnads;

import android.os.Bundle;
import com.facebook.react.bridge.ReactApplicationContext;
import com.vehiclecloud.app.videofetch.rnads.api.RNAdsAppOpenAd;
import ee.o;
import ee.u;
import ie.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import pe.p;
import we.e;
import we.e0;
import we.n0;
import we.s0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RNAdsAppOpenAdModule.kt */
@f(c = "com.vehiclecloud.app.videofetch.rnads.RNAdsAppOpenAdModule$loadAd$1", f = "RNAdsAppOpenAdModule.kt", l = {121}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class RNAdsAppOpenAdModule$loadAd$1 extends k implements p<e0, d<? super u>, Object> {
    int label;
    final /* synthetic */ RNAdsAppOpenAdModule this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RNAdsAppOpenAdModule.kt */
    @f(c = "com.vehiclecloud.app.videofetch.rnads.RNAdsAppOpenAdModule$loadAd$1$1", f = "RNAdsAppOpenAdModule.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.vehiclecloud.app.videofetch.rnads.RNAdsAppOpenAdModule$loadAd$1$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends k implements p<e0, d<? super u>, Object> {
        int label;
        final /* synthetic */ RNAdsAppOpenAdModule this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(RNAdsAppOpenAdModule rNAdsAppOpenAdModule, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = rNAdsAppOpenAdModule;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<u> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.this$0, dVar);
        }

        @Override // pe.p
        public final Object invoke(e0 e0Var, d<? super u> dVar) {
            return ((AnonymousClass1) create(e0Var, dVar)).invokeSuspend(u.f29813a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            RNAdsAppOpenAd rNAdsAppOpenAd;
            ReactApplicationContext reactApplicationContext;
            String str;
            Bundle bundle;
            je.d.c();
            if (this.label == 0) {
                o.b(obj);
                this.this$0.cancelRelLoadSchedule();
                rNAdsAppOpenAd = this.this$0.mAppOpenAd;
                reactApplicationContext = this.this$0.getReactApplicationContext();
                str = this.this$0.mAdUnitId;
                if (str == null) {
                    qe.k.s("mAdUnitId");
                    str = null;
                }
                rNAdsAppOpenAd.load(reactApplicationContext, str, this.this$0);
                RNAdsAppOpenAdModule rNAdsAppOpenAdModule = this.this$0;
                bundle = RNAdsAppOpenAdModule.ANALYTICS_COMMON_PARAMS;
                rNAdsAppOpenAdModule.logEvent("oads_load", bundle);
                return u.f29813a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RNAdsAppOpenAdModule$loadAd$1(RNAdsAppOpenAdModule rNAdsAppOpenAdModule, d<? super RNAdsAppOpenAdModule$loadAd$1> dVar) {
        super(2, dVar);
        this.this$0 = rNAdsAppOpenAdModule;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<u> create(Object obj, d<?> dVar) {
        return new RNAdsAppOpenAdModule$loadAd$1(this.this$0, dVar);
    }

    @Override // pe.p
    public final Object invoke(e0 e0Var, d<? super u> dVar) {
        return ((RNAdsAppOpenAdModule$loadAd$1) create(e0Var, dVar)).invokeSuspend(u.f29813a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object c10;
        c10 = je.d.c();
        int i10 = this.label;
        if (i10 == 0) {
            o.b(obj);
            this.label = 1;
            if (n0.a(200L, this) == c10) {
                return c10;
            }
        } else if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            o.b(obj);
        }
        e0 scope = this.this$0.getScope();
        if (scope != null) {
            e.b(scope, s0.c(), null, new AnonymousClass1(this.this$0, null), 2, null);
        }
        return u.f29813a;
    }
}
