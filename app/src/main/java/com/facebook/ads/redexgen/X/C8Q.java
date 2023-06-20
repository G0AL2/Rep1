package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.facebook.ads.redexgen.X.8Q  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C8Q extends N4 {
    public final /* synthetic */ C8N A00;

    public C8Q(C8N c8n) {
        this.A00 = c8n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC07859c
    /* renamed from: A00 */
    public final void A03(N5 n52) {
        new Handler(Looper.getMainLooper()).post(new PS(this));
    }
}
