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
@f(c = "com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader$getLoaderAndBind$1", f = "RNAdsNativeAdLoader.kt", l = {88}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class RNAdsNativeAdLoader$getLoaderAndBind$1 extends k implements p<e0, d<? super u>, Object> {
    final /* synthetic */ RNAdsNativeView $view;
    Object L$0;
    int label;
    final /* synthetic */ RNAdsNativeAdLoader this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RNAdsNativeAdLoader$getLoaderAndBind$1(RNAdsNativeView rNAdsNativeView, RNAdsNativeAdLoader rNAdsNativeAdLoader, d<? super RNAdsNativeAdLoader$getLoaderAndBind$1> dVar) {
        super(2, dVar);
        this.$view = rNAdsNativeView;
        this.this$0 = rNAdsNativeAdLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<u> create(Object obj, d<?> dVar) {
        return new RNAdsNativeAdLoader$getLoaderAndBind$1(this.$view, this.this$0, dVar);
    }

    @Override // pe.p
    public final Object invoke(e0 e0Var, d<? super u> dVar) {
        return ((RNAdsNativeAdLoader$getLoaderAndBind$1) create(e0Var, dVar)).invokeSuspend(u.f29813a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object c10;
        Object loader;
        RNAdsNativeView rNAdsNativeView;
        c10 = je.d.c();
        int i10 = this.label;
        if (i10 == 0) {
            o.b(obj);
            RNAdsNativeView rNAdsNativeView2 = this.$view;
            RNAdsNativeAdLoader rNAdsNativeAdLoader = this.this$0;
            String str = rNAdsNativeView2.mAdUnitId;
            qe.k.e(str, "view.mAdUnitId");
            int i11 = this.$view.mHeight;
            this.L$0 = rNAdsNativeView2;
            this.label = 1;
            loader = rNAdsNativeAdLoader.getLoader(str, i11, this);
            if (loader == c10) {
                return c10;
            }
            rNAdsNativeView = rNAdsNativeView2;
            obj = loader;
        } else if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            rNAdsNativeView = (RNAdsNativeView) this.L$0;
            o.b(obj);
        }
        rNAdsNativeView.mAdsNativeManager = (RNAdsNativeAdLoader.RNAdsNativeManager) obj;
        RNAdsNativeView rNAdsNativeView3 = this.$view;
        RNAdsNativeAdLoader.RNAdsNativeManager rNAdsNativeManager = rNAdsNativeView3.mAdsNativeManager;
        String str2 = rNAdsNativeView3.mScreen;
        qe.k.e(str2, "view.mScreen");
        RNAdsNativeView rNAdsNativeView4 = this.$view;
        rNAdsNativeManager.bind(str2, rNAdsNativeView4.mWidth, rNAdsNativeView4);
        return u.f29813a;
    }
}
