package be;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.t;
import com.facebook.react.uimanager.ViewManager;
import fr.greweb.reactnativeviewshot.RNViewShotModule;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: RNViewShotPackage.java */
/* loaded from: classes3.dex */
public class b implements t {
    @Override // com.facebook.react.t
    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        return Arrays.asList(new RNViewShotModule(reactApplicationContext));
    }

    @Override // com.facebook.react.t
    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }
}
