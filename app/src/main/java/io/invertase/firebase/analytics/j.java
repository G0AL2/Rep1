package io.invertase.firebase.analytics;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.t;
import com.facebook.react.uimanager.ViewManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: ReactNativeFirebaseAnalyticsPackage.java */
/* loaded from: classes3.dex */
public class j implements t {
    @Override // com.facebook.react.t
    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ReactNativeFirebaseAnalyticsModule(reactApplicationContext));
        return arrayList;
    }

    @Override // com.facebook.react.t
    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }
}
