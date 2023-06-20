package com.vehiclecloud.app.videofetch.rnnotification;

import com.facebook.react.bridge.ReactApplicationContext;
import qe.l;

/* compiled from: RNNotificationModule.kt */
/* loaded from: classes3.dex */
final class RNNotificationModule$notificationManager$2 extends l implements pe.a<androidx.core.app.l> {
    final /* synthetic */ ReactApplicationContext $reactContext;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RNNotificationModule$notificationManager$2(ReactApplicationContext reactApplicationContext) {
        super(0);
        this.$reactContext = reactApplicationContext;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // pe.a
    public final androidx.core.app.l invoke() {
        return androidx.core.app.l.f(this.$reactContext);
    }
}
