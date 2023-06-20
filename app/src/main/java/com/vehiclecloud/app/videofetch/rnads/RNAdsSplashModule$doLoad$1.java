package com.vehiclecloud.app.videofetch.rnads;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RNAdsSplashModule.kt */
@f(c = "com.vehiclecloud.app.videofetch.rnads.RNAdsSplashModule", f = "RNAdsSplashModule.kt", l = {103, 104}, m = "doLoad")
/* loaded from: classes3.dex */
public final class RNAdsSplashModule$doLoad$1 extends d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RNAdsSplashModule this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RNAdsSplashModule$doLoad$1(RNAdsSplashModule rNAdsSplashModule, ie.d<? super RNAdsSplashModule$doLoad$1> dVar) {
        super(dVar);
        this.this$0 = rNAdsSplashModule;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object doLoad;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        doLoad = this.this$0.doLoad(this);
        return doLoad;
    }
}
