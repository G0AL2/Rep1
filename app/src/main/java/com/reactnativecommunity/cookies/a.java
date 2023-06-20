package com.reactnativecommunity.cookies;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.t;
import com.facebook.react.uimanager.ViewManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: CookieManagerPackage.java */
/* loaded from: classes3.dex */
public class a implements t {
    @Override // com.facebook.react.t
    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new CookieManagerModule(reactApplicationContext));
        return arrayList;
    }

    @Override // com.facebook.react.t
    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Arrays.asList(new ViewManager[0]);
    }
}
