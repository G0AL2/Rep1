package com.vehiclecloud.app.videofetch.rnads;

import android.app.Activity;
import com.vehiclecloud.app.videofetch.rnads.RNAdsInterstitialModule;
import com.vehiclecloud.app.videofetch.rnads.api.RNAdsInterstitial;
import ee.o;
import ee.u;
import ie.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import pe.p;
import we.e;
import we.e0;
import we.i1;
import we.n0;
import we.s0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RNAdsInterstitialModule.kt */
@f(c = "com.vehiclecloud.app.videofetch.rnads.RNAdsInterstitialModule$InterstitialAdManager$show$1$1$1", f = "RNAdsInterstitialModule.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class RNAdsInterstitialModule$InterstitialAdManager$show$1$1$1 extends k implements p<e0, d<? super u>, Object> {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ Object $it;
    int label;
    final /* synthetic */ RNAdsInterstitialModule this$0;
    final /* synthetic */ RNAdsInterstitialModule.InterstitialAdManager this$1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RNAdsInterstitialModule.kt */
    @f(c = "com.vehiclecloud.app.videofetch.rnads.RNAdsInterstitialModule$InterstitialAdManager$show$1$1$1$1", f = "RNAdsInterstitialModule.kt", l = {249}, m = "invokeSuspend")
    /* renamed from: com.vehiclecloud.app.videofetch.rnads.RNAdsInterstitialModule$InterstitialAdManager$show$1$1$1$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends k implements p<e0, d<? super u>, Object> {
        int label;
        final /* synthetic */ RNAdsInterstitialModule.InterstitialAdManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(RNAdsInterstitialModule.InterstitialAdManager interstitialAdManager, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = interstitialAdManager;
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
            Object c10;
            c10 = je.d.c();
            int i10 = this.label;
            if (i10 == 0) {
                o.b(obj);
                this.label = 1;
                if (n0.a(40000L, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                o.b(obj);
            }
            this.this$0.onAdDismissed();
            return u.f29813a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RNAdsInterstitialModule$InterstitialAdManager$show$1$1$1(RNAdsInterstitialModule rNAdsInterstitialModule, Activity activity, RNAdsInterstitialModule.InterstitialAdManager interstitialAdManager, Object obj, d<? super RNAdsInterstitialModule$InterstitialAdManager$show$1$1$1> dVar) {
        super(2, dVar);
        this.this$0 = rNAdsInterstitialModule;
        this.$activity = activity;
        this.this$1 = interstitialAdManager;
        this.$it = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<u> create(Object obj, d<?> dVar) {
        return new RNAdsInterstitialModule$InterstitialAdManager$show$1$1$1(this.this$0, this.$activity, this.this$1, this.$it, dVar);
    }

    @Override // pe.p
    public final Object invoke(e0 e0Var, d<? super u> dVar) {
        return ((RNAdsInterstitialModule$InterstitialAdManager$show$1$1$1) create(e0Var, dVar)).invokeSuspend(u.f29813a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        RNAdsInterstitial rNAdsInterstitial;
        je.d.c();
        if (this.label == 0) {
            o.b(obj);
            this.this$0.isShowingAd = true;
            try {
                rNAdsInterstitial = this.this$0.interstitialAd;
                rNAdsInterstitial.showByObject(this.$activity, this.this$1, this.$it);
                RNAdsInterstitialModule rNAdsInterstitialModule = this.this$0;
                e0 scope = rNAdsInterstitialModule.getScope();
                i1 i1Var = null;
                if (scope != null) {
                    i1Var = e.b(scope, s0.b(), null, new AnonymousClass1(this.this$1, null), 2, null);
                }
                rNAdsInterstitialModule.showingTimeoutJob = i1Var;
            } catch (Exception e10) {
                this.this$0.isShowingAd = false;
                timber.log.a.f37331a.e(e10, "show ad get ex:", new Object[0]);
            }
            return u.f29813a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
