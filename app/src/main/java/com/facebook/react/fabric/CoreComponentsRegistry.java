package com.facebook.react.fabric;

import com.facebook.jni.HybridData;
import com.facebook.soloader.SoLoader;

@g6.a
/* loaded from: classes.dex */
public class CoreComponentsRegistry {
    @g6.a
    private final HybridData mHybridData;

    static {
        SoLoader.p("fabricjni");
    }

    @g6.a
    private CoreComponentsRegistry(ComponentFactory componentFactory) {
        this.mHybridData = initHybrid(componentFactory);
    }

    @g6.a
    private native HybridData initHybrid(ComponentFactory componentFactory);

    @g6.a
    public static CoreComponentsRegistry register(ComponentFactory componentFactory) {
        return new CoreComponentsRegistry(componentFactory);
    }
}
