package com.vehiclecloud.app.videofetch.rnads;

import android.app.Activity;
import android.view.View;
import android.widget.LinearLayout;
import com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader;
import com.vehiclecloud.app.videofetch.rnads.api.RNAdsNative;
import ee.o;
import ee.u;
import ie.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import pe.p;
import we.e0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RNAdsNativeAdLoader.kt */
@f(c = "com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader$RNAdsNativeManager$renderAd$1$1$1$1", f = "RNAdsNativeAdLoader.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class RNAdsNativeAdLoader$RNAdsNativeManager$renderAd$1$1$1$1 extends k implements p<e0, d<? super u>, Object> {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ Object $nativeAd;
    final /* synthetic */ LinearLayout $parent;
    int label;
    final /* synthetic */ RNAdsNativeAdLoader.RNAdsNativeManager this$0;
    final /* synthetic */ RNAdsNativeAdLoader this$1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RNAdsNativeAdLoader$RNAdsNativeManager$renderAd$1$1$1$1(RNAdsNativeAdLoader.RNAdsNativeManager rNAdsNativeManager, RNAdsNativeAdLoader rNAdsNativeAdLoader, Activity activity, Object obj, LinearLayout linearLayout, d<? super RNAdsNativeAdLoader$RNAdsNativeManager$renderAd$1$1$1$1> dVar) {
        super(2, dVar);
        this.this$0 = rNAdsNativeManager;
        this.this$1 = rNAdsNativeAdLoader;
        this.$activity = activity;
        this.$nativeAd = obj;
        this.$parent = linearLayout;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<u> create(Object obj, d<?> dVar) {
        return new RNAdsNativeAdLoader$RNAdsNativeManager$renderAd$1$1$1$1(this.this$0, this.this$1, this.$activity, this.$nativeAd, this.$parent, dVar);
    }

    @Override // pe.p
    public final Object invoke(e0 e0Var, d<? super u> dVar) {
        return ((RNAdsNativeAdLoader$RNAdsNativeManager$renderAd$1$1$1$1) create(e0Var, dVar)).invokeSuspend(u.f29813a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        int i10;
        je.d.c();
        if (this.label == 0) {
            o.b(obj);
            this.this$0.renderStartTime = System.currentTimeMillis();
            try {
                this.this$0.setState$app_orangeRelease(4);
                RNAdsNative rNAdsNative = this.this$1.mNative;
                Activity activity = this.$activity;
                Object obj2 = this.$nativeAd;
                i10 = this.this$0.mWidth;
                View inflateAdViewByObject = rNAdsNative.inflateAdViewByObject(activity, obj2, i10, this.this$0.getHeight());
                this.$parent.removeAllViewsInLayout();
                this.$parent.addView(inflateAdViewByObject);
                this.$parent.requestLayout();
                inflateAdViewByObject.requestLayout();
                RNAdsNativeAdLoader.emitRNEvent$default(this.this$1, this.$parent.getId(), "onLoad", null, 4, null);
            } catch (Exception unused) {
            }
            this.this$0.scheduleReload();
            return u.f29813a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
