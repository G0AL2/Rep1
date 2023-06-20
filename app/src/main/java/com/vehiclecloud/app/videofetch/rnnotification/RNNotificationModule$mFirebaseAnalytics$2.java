package com.vehiclecloud.app.videofetch.rnnotification;

import com.facebook.react.bridge.ReactApplicationContext;
import com.google.firebase.analytics.FirebaseAnalytics;
import qe.k;
import qe.l;

/* compiled from: RNNotificationModule.kt */
/* loaded from: classes3.dex */
final class RNNotificationModule$mFirebaseAnalytics$2 extends l implements pe.a<FirebaseAnalytics> {
    final /* synthetic */ ReactApplicationContext $reactContext;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RNNotificationModule$mFirebaseAnalytics$2(ReactApplicationContext reactApplicationContext) {
        super(0);
        this.$reactContext = reactApplicationContext;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // pe.a
    public final FirebaseAnalytics invoke() {
        FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(this.$reactContext);
        k.e(firebaseAnalytics, "getInstance(reactContext)");
        return firebaseAnalytics;
    }
}
