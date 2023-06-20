package com.facebook.react.devsupport;

import com.facebook.fbreact.specs.NativeLogBoxSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;

@o6.a(name = LogBoxModule.NAME)
/* loaded from: classes.dex */
public class LogBoxModule extends NativeLogBoxSpec {
    public static final String NAME = "LogBox";
    private final k6.d mDevSupportManager;
    private final h6.h mSurfaceDelegate;

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LogBoxModule.this.mSurfaceDelegate.b(LogBoxModule.NAME);
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LogBoxModule.this.mSurfaceDelegate.show();
        }
    }

    /* loaded from: classes.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LogBoxModule.this.mSurfaceDelegate.d();
        }
    }

    /* loaded from: classes.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LogBoxModule.this.mSurfaceDelegate.c();
        }
    }

    public LogBoxModule(ReactApplicationContext reactApplicationContext, k6.d dVar) {
        super(reactApplicationContext);
        this.mDevSupportManager = dVar;
        h6.h g10 = dVar.g(NAME);
        if (g10 != null) {
            this.mSurfaceDelegate = g10;
        } else {
            this.mSurfaceDelegate = new f(dVar);
        }
        UiThreadUtil.runOnUiThread(new a());
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.fbreact.specs.NativeLogBoxSpec
    public void hide() {
        UiThreadUtil.runOnUiThread(new c());
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        UiThreadUtil.runOnUiThread(new d());
    }

    @Override // com.facebook.fbreact.specs.NativeLogBoxSpec
    public void show() {
        if (this.mSurfaceDelegate.a()) {
            UiThreadUtil.runOnUiThread(new b());
        }
    }
}
