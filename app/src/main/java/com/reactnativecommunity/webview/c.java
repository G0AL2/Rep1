package com.reactnativecommunity.webview;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.t;
import fe.o;
import java.util.List;
import qe.k;

/* compiled from: RNCWebViewPackage.kt */
/* loaded from: classes3.dex */
public final class c implements t {
    @Override // com.facebook.react.t
    public List<RNCWebViewModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        List<RNCWebViewModule> d10;
        k.f(reactApplicationContext, "reactContext");
        d10 = o.d(new RNCWebViewModule(reactApplicationContext));
        return d10;
    }

    @Override // com.facebook.react.t
    public List<RNCWebViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        List<RNCWebViewManager> d10;
        k.f(reactApplicationContext, "reactContext");
        d10 = o.d(new RNCWebViewManager());
        return d10;
    }
}
