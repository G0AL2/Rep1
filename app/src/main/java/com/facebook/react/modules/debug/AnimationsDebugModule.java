package com.facebook.react.modules.debug;

import android.widget.Toast;
import com.facebook.fbreact.specs.NativeAnimationsDebugModuleSpec;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.debug.b;
import java.util.Locale;

@o6.a(name = AnimationsDebugModule.NAME)
/* loaded from: classes.dex */
public class AnimationsDebugModule extends NativeAnimationsDebugModuleSpec {
    protected static final String NAME = "AnimationsDebugModule";
    private final q6.a mCatalystSettings;
    private b mFrameCallback;

    public AnimationsDebugModule(ReactApplicationContext reactApplicationContext, q6.a aVar) {
        super(reactApplicationContext);
        this.mCatalystSettings = aVar;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        b bVar = this.mFrameCallback;
        if (bVar != null) {
            bVar.n();
            this.mFrameCallback = null;
        }
    }

    @Override // com.facebook.fbreact.specs.NativeAnimationsDebugModuleSpec
    public void startRecordingFps() {
        q6.a aVar = this.mCatalystSettings;
        if (aVar == null || !aVar.b()) {
            return;
        }
        if (this.mFrameCallback == null) {
            b bVar = new b(getReactApplicationContext());
            this.mFrameCallback = bVar;
            bVar.m();
            return;
        }
        throw new JSApplicationCausedNativeException("Already recording FPS!");
    }

    @Override // com.facebook.fbreact.specs.NativeAnimationsDebugModuleSpec
    public void stopRecordingFps(double d10) {
        b bVar = this.mFrameCallback;
        if (bVar == null) {
            return;
        }
        bVar.n();
        b.C0212b g10 = this.mFrameCallback.g((long) d10);
        if (g10 == null) {
            Toast.makeText(getReactApplicationContext(), "Unable to get FPS info", 1);
        } else {
            Locale locale = Locale.US;
            String str = String.format(locale, "FPS: %.2f, %d frames (%d expected)", Double.valueOf(g10.f15543d), Integer.valueOf(g10.f15540a), Integer.valueOf(g10.f15542c)) + "\n" + String.format(locale, "JS FPS: %.2f, %d frames (%d expected)", Double.valueOf(g10.f15544e), Integer.valueOf(g10.f15541b), Integer.valueOf(g10.f15542c)) + "\nTotal Time MS: " + String.format(locale, "%d", Integer.valueOf(g10.f15545f));
            z3.a.b("ReactNative", str);
            Toast.makeText(getReactApplicationContext(), str, 1).show();
        }
        this.mFrameCallback = null;
    }
}
