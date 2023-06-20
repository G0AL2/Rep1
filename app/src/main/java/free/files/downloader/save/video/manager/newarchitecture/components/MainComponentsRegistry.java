package free.files.downloader.save.video.manager.newarchitecture.components;

import com.facebook.jni.HybridData;
import com.facebook.react.fabric.ComponentFactory;
import com.facebook.soloader.SoLoader;
import g6.a;

@a
/* loaded from: classes3.dex */
public class MainComponentsRegistry {
    @a
    private final HybridData mHybridData;

    static {
        SoLoader.p("fabricjni");
    }

    @a
    private MainComponentsRegistry(ComponentFactory componentFactory) {
        this.mHybridData = initHybrid(componentFactory);
    }

    @a
    private native HybridData initHybrid(ComponentFactory componentFactory);

    @a
    public static MainComponentsRegistry register(ComponentFactory componentFactory) {
        return new MainComponentsRegistry(componentFactory);
    }
}
