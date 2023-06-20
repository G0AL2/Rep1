package com.vehiclecloud.app.videofetch.rnactivity;

import android.view.View;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.t;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.d0;
import fe.o;
import fe.p;
import java.util.List;
import qe.k;

/* compiled from: RNActivityPackage.kt */
/* loaded from: classes3.dex */
public final class RNActivityPackage implements t {
    @Override // com.facebook.react.t
    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        List<NativeModule> d10;
        k.f(reactApplicationContext, "reactContext");
        d10 = o.d(new RNActivityModule());
        return d10;
    }

    @Override // com.facebook.react.t
    public List<ViewManager<View, d0<?>>> createViewManagers(ReactApplicationContext reactApplicationContext) {
        List<ViewManager<View, d0<?>>> h10;
        k.f(reactApplicationContext, "reactContext");
        h10 = p.h();
        return h10;
    }
}
