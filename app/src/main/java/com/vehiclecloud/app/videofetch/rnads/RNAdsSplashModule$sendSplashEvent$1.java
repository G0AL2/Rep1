package com.vehiclecloud.app.videofetch.rnads;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import ee.o;
import ee.u;
import ie.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import pe.p;
import we.e0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RNAdsSplashModule.kt */
@f(c = "com.vehiclecloud.app.videofetch.rnads.RNAdsSplashModule$sendSplashEvent$1", f = "RNAdsSplashModule.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class RNAdsSplashModule$sendSplashEvent$1 extends k implements p<e0, d<? super u>, Object> {
    final /* synthetic */ String $adUnitId;
    final /* synthetic */ String $error;
    final /* synthetic */ String $type;
    int label;
    final /* synthetic */ RNAdsSplashModule this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RNAdsSplashModule$sendSplashEvent$1(String str, String str2, String str3, RNAdsSplashModule rNAdsSplashModule, d<? super RNAdsSplashModule$sendSplashEvent$1> dVar) {
        super(2, dVar);
        this.$type = str;
        this.$adUnitId = str2;
        this.$error = str3;
        this.this$0 = rNAdsSplashModule;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<u> create(Object obj, d<?> dVar) {
        return new RNAdsSplashModule$sendSplashEvent$1(this.$type, this.$adUnitId, this.$error, this.this$0, dVar);
    }

    @Override // pe.p
    public final Object invoke(e0 e0Var, d<? super u> dVar) {
        return ((RNAdsSplashModule$sendSplashEvent$1) create(e0Var, dVar)).invokeSuspend(u.f29813a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ReactApplicationContext reactApplicationContext;
        je.d.c();
        if (this.label == 0) {
            o.b(obj);
            WritableMap createMap = Arguments.createMap();
            createMap.putString("type", this.$type);
            createMap.putString("adUnitId", this.$adUnitId);
            String str = this.$error;
            if (str != null) {
                createMap.putString("error", str);
            }
            reactApplicationContext = this.this$0.getReactApplicationContext();
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("RNAdsSplashEvent", createMap);
            return u.f29813a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
