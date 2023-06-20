package com.vehiclecloud.app.videofetch.rnads;

import android.app.Activity;
import android.os.Bundle;
import androidx.appcompat.app.d;
import androidx.lifecycle.i;
import androidx.lifecycle.n;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.google.firebase.analytics.FirebaseAnalytics;
import qe.k;
import we.e0;
import we.s0;

/* compiled from: RNAdsReactContextBaseModule.kt */
/* loaded from: classes3.dex */
public abstract class RNAdsReactContextBaseModule extends ReactContextBaseJavaModule {
    private final FirebaseAnalytics mAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RNAdsReactContextBaseModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        k.f(reactApplicationContext, "reactContext");
        FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(reactApplicationContext);
        k.e(firebaseAnalytics, "getInstance(reactContext)");
        this.mAnalytics = firebaseAnalytics;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public e0 getScope() {
        i lifecycle;
        Activity currentActivity = getCurrentActivity();
        d dVar = currentActivity instanceof d ? (d) currentActivity : null;
        if (dVar == null || (lifecycle = dVar.getLifecycle()) == null) {
            return null;
        }
        return n.a(lifecycle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void logEvent(String str, Bundle bundle) {
        k.f(str, "name");
        k.f(bundle, "params");
        e0 scope = getScope();
        if (scope == null) {
            return;
        }
        we.d.b(scope, s0.b(), null, new RNAdsReactContextBaseModule$logEvent$1(this, str, bundle, null), 2, null);
    }
}
