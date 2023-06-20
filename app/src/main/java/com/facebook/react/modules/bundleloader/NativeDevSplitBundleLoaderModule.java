package com.facebook.react.modules.bundleloader;

import com.facebook.fbreact.specs.NativeDevSplitBundleLoaderSpec;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import k6.c;
import k6.d;

@o6.a(name = NativeDevSplitBundleLoaderModule.NAME)
/* loaded from: classes.dex */
public class NativeDevSplitBundleLoaderModule extends NativeDevSplitBundleLoaderSpec {
    public static final String NAME = "DevSplitBundleLoader";
    private static final String REJECTION_CODE = "E_BUNDLE_LOAD_ERROR";
    private final d mDevSupportManager;

    /* loaded from: classes.dex */
    class a implements c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Promise f15462a;

        a(NativeDevSplitBundleLoaderModule nativeDevSplitBundleLoaderModule, Promise promise) {
            this.f15462a = promise;
        }
    }

    public NativeDevSplitBundleLoaderModule(ReactApplicationContext reactApplicationContext, d dVar) {
        super(reactApplicationContext);
        this.mDevSupportManager = dVar;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.fbreact.specs.NativeDevSplitBundleLoaderSpec
    public void loadBundle(String str, Promise promise) {
        this.mDevSupportManager.k(str, new a(this, promise));
    }
}
