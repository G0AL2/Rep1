package com.reactnativepagerview;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.t;
import com.facebook.react.uimanager.ViewManager;
import fe.o;
import fe.p;
import java.util.List;
import qe.k;

/* compiled from: PagerViewPackage.kt */
/* loaded from: classes3.dex */
public final class b implements t {
    @Override // com.facebook.react.t
    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        List<NativeModule> h10;
        k.f(reactApplicationContext, "reactContext");
        h10 = p.h();
        return h10;
    }

    @Override // com.facebook.react.t
    public List<ViewManager<?, ?>> createViewManagers(ReactApplicationContext reactApplicationContext) {
        List<ViewManager<?, ?>> d10;
        k.f(reactApplicationContext, "reactContext");
        d10 = o.d(new PagerViewViewManager());
        return d10;
    }
}
