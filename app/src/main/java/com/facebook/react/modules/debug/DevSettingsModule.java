package com.facebook.react.modules.debug;

import com.facebook.fbreact.specs.NativeDevSettingsSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import k6.d;

@o6.a(name = DevSettingsModule.NAME)
/* loaded from: classes.dex */
public class DevSettingsModule extends NativeDevSettingsSpec {
    public static final String NAME = "DevSettings";
    private final d mDevSupportManager;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DevSettingsModule.this.mDevSupportManager.s();
        }
    }

    /* loaded from: classes.dex */
    class b implements k6.b {
        b(DevSettingsModule devSettingsModule, String str) {
        }
    }

    public DevSettingsModule(ReactApplicationContext reactApplicationContext, d dVar) {
        super(reactApplicationContext);
        this.mDevSupportManager = dVar;
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void addListener(String str) {
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void addMenuItem(String str) {
        this.mDevSupportManager.x(str, new b(this, str));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void onFastRefresh() {
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void reload() {
        if (this.mDevSupportManager.e()) {
            UiThreadUtil.runOnUiThread(new a());
        }
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void reloadWithReason(String str) {
        reload();
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void removeListeners(double d10) {
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void setHotLoadingEnabled(boolean z10) {
        this.mDevSupportManager.f(z10);
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void setIsDebuggingRemotely(boolean z10) {
        this.mDevSupportManager.a(z10);
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void setIsShakeToShowDevMenuEnabled(boolean z10) {
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void setProfilingEnabled(boolean z10) {
        this.mDevSupportManager.t(z10);
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void toggleElementInspector() {
        this.mDevSupportManager.m();
    }
}
