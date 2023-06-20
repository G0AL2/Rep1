package com.facebook.react.modules.fresco;

import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.modules.network.c;
import com.facebook.react.modules.network.g;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import fm.castbox.mediation.BuildConfig;
import java.util.HashSet;
import r5.h;
import r5.i;
import r6.b;
import ye.w;
import ye.z;

@o6.a(name = FrescoModule.NAME, needsEagerInit = BuildConfig.SHOULD_GZIP_HTTP_REQUEST)
/* loaded from: classes.dex */
public class FrescoModule extends ReactContextBaseJavaModule implements LifecycleEventListener, TurboModule {
    public static final String NAME = "FrescoModule";
    private static boolean sHasBeenInitialized = false;
    private final boolean mClearOnDestroy;
    private i mConfig;
    private h mImagePipeline;

    public FrescoModule(ReactApplicationContext reactApplicationContext) {
        this(reactApplicationContext, true, (i) null);
    }

    private static i getDefaultConfig(ReactContext reactContext) {
        return getDefaultConfigBuilder(reactContext).K();
    }

    public static i.b getDefaultConfigBuilder(ReactContext reactContext) {
        HashSet hashSet = new HashSet();
        hashSet.add(new b());
        z a10 = g.a();
        ((com.facebook.react.modules.network.a) a10.o()).d(new w(new c(reactContext)));
        return n5.a.a(reactContext.getApplicationContext(), a10).M(new a(a10)).L(false).N(hashSet);
    }

    private h getImagePipeline() {
        if (this.mImagePipeline == null) {
            this.mImagePipeline = m4.c.a();
        }
        return this.mImagePipeline;
    }

    public static boolean hasBeenInitialized() {
        return sHasBeenInitialized;
    }

    public void clearSensitiveData() {
        getImagePipeline().a();
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
        getReactApplicationContext().addLifecycleEventListener(this);
        if (!hasBeenInitialized()) {
            if (this.mConfig == null) {
                this.mConfig = getDefaultConfig(getReactApplicationContext());
            }
            m4.c.c(getReactApplicationContext().getApplicationContext(), this.mConfig);
            sHasBeenInitialized = true;
        } else if (this.mConfig != null) {
            z3.a.G("ReactNative", "Fresco has already been initialized with a different config. The new Fresco configuration will be ignored!");
        }
        this.mConfig = null;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        super.invalidate();
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            reactApplicationContextIfActiveOrWarn.removeLifecycleEventListener(this);
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        if (hasBeenInitialized() && this.mClearOnDestroy) {
            getImagePipeline().c();
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
    }

    public FrescoModule(ReactApplicationContext reactApplicationContext, boolean z10) {
        this(reactApplicationContext, z10, (i) null);
    }

    public FrescoModule(ReactApplicationContext reactApplicationContext, h hVar, boolean z10) {
        this(reactApplicationContext, z10);
        this.mImagePipeline = hVar;
    }

    public FrescoModule(ReactApplicationContext reactApplicationContext, boolean z10, i iVar) {
        super(reactApplicationContext);
        this.mClearOnDestroy = z10;
        this.mConfig = iVar;
    }
}
