package com.facebook.react;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.List;

/* compiled from: ReactInstancePackage.java */
@Deprecated
/* loaded from: classes.dex */
public abstract class r implements t {
    public abstract List<NativeModule> a(ReactApplicationContext reactApplicationContext, p pVar);

    @Override // com.facebook.react.t
    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        throw new RuntimeException("ReactInstancePackage must be passed in the ReactInstanceManager.");
    }
}
