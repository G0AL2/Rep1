package com.vehiclecloud.app.videofetch.rnactivity;

import androidx.appcompat.app.f;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.vehiclecloud.app.videofetch.rndownloader.util.Scopes;
import qe.g;

/* compiled from: RNActivityModule.kt */
/* loaded from: classes3.dex */
public final class RNActivityModule extends ReactContextBaseJavaModule {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "RNActivity";

    /* compiled from: RNActivityModule.kt */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return TAG;
    }

    @ReactMethod
    public final void setDefaultNightMode(int i10) {
        Scopes.main();
        f.G(i10);
    }
}
