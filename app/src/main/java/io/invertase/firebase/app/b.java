package io.invertase.firebase.app;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.t;
import com.facebook.react.uimanager.ViewManager;
import io.invertase.firebase.utils.ReactNativeFirebaseUtilsModule;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: ReactNativeFirebaseAppPackage.java */
/* loaded from: classes3.dex */
public class b implements t {
    @Override // com.facebook.react.t
    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        if (a.a() == null) {
            a.b(reactApplicationContext.getApplicationContext());
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ReactNativeFirebaseAppModule(reactApplicationContext));
        arrayList.add(new ReactNativeFirebaseUtilsModule(reactApplicationContext));
        return arrayList;
    }

    @Override // com.facebook.react.t
    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }
}
