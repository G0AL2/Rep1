package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.media.MediaCrypto;

@TargetApi(16)
/* renamed from: com.facebook.ads.redexgen.X.Ww  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1372Ww implements CN {
    public final MediaCrypto A00;
    public final boolean A01;

    public final MediaCrypto A00() {
        return this.A00;
    }

    public final boolean A01(String str) {
        return !this.A01 && this.A00.requiresSecureDecoderComponent(str);
    }
}
