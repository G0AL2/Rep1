package com.vehiclecloud.app.videofetch.rnnotification;

import androidx.work.v;
import com.facebook.react.bridge.ReactApplicationContext;
import qe.k;
import qe.l;

/* compiled from: RNNotificationModule.kt */
/* loaded from: classes3.dex */
final class RNNotificationModule$workManager$2 extends l implements pe.a<v> {
    final /* synthetic */ ReactApplicationContext $reactContext;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RNNotificationModule$workManager$2(ReactApplicationContext reactApplicationContext) {
        super(0);
        this.$reactContext = reactApplicationContext;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // pe.a
    public final v invoke() {
        v g10 = v.g(this.$reactContext);
        k.e(g10, "getInstance(reactContext)");
        return g10;
    }
}
