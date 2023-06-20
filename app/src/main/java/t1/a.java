package t1;

import cl.json.RNShareModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.t;
import com.facebook.react.uimanager.ViewManager;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: RNSharePackage.java */
/* loaded from: classes.dex */
public class a implements t {
    @Override // com.facebook.react.t
    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        return Arrays.asList(new RNShareModule(reactApplicationContext));
    }

    @Override // com.facebook.react.t
    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }
}
