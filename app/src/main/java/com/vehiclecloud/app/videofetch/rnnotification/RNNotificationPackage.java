package com.vehiclecloud.app.videofetch.rnnotification;

import android.view.View;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.t;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.d0;
import fe.p;
import java.util.Collections;
import java.util.List;
import qe.k;

/* compiled from: RNNotificationPackage.kt */
/* loaded from: classes3.dex */
public final class RNNotificationPackage implements t {
    @Override // com.facebook.react.t
    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        List<NativeModule> l10;
        k.f(reactApplicationContext, "reactContext");
        l10 = p.l(new RNNotificationModule(reactApplicationContext));
        return l10;
    }

    @Override // com.facebook.react.t
    public List<ViewManager<View, d0<?>>> createViewManagers(ReactApplicationContext reactApplicationContext) {
        k.f(reactApplicationContext, "reactContext");
        List<ViewManager<View, d0<?>>> emptyList = Collections.emptyList();
        k.e(emptyList, "emptyList()");
        return emptyList;
    }
}
