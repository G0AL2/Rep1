package s2;

import com.brentvatne.exoplayer.ReactExoplayerViewManager;
import com.brentvatne.exoplayer.e;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.t;
import com.facebook.react.uimanager.ViewManager;
import java.util.Collections;
import java.util.List;

/* compiled from: ReactVideoPackage.java */
/* loaded from: classes.dex */
public class c implements t {

    /* renamed from: a  reason: collision with root package name */
    private e f36715a;

    @Override // com.facebook.react.t
    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }

    @Override // com.facebook.react.t
    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        if (this.f36715a == null) {
            this.f36715a = new com.brentvatne.exoplayer.c(reactApplicationContext);
        }
        return Collections.singletonList(new ReactExoplayerViewManager(this.f36715a));
    }
}
