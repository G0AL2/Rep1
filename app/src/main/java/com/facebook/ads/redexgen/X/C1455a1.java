package com.facebook.ads.redexgen.X;

import android.os.Build;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.a1  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1455a1 implements InterfaceC07386v {
    public final /* synthetic */ C1435Zh A00;

    public C1455a1(C1435Zh c1435Zh) {
        this.A00 = c1435Zh;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07386v
    public final C7A A5J() {
        if (Build.VERSION.SDK_INT < 21) {
            return this.A00.A07(AnonymousClass76.A05);
        }
        String[] strArr = Build.SUPPORTED_ABIS;
        if (strArr != null) {
            return this.A00.A0E(Arrays.asList(strArr));
        }
        return this.A00.A07(AnonymousClass76.A07);
    }
}
