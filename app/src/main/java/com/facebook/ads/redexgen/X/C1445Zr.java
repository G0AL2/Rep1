package com.facebook.ads.redexgen.X;

import android.os.Build;

/* renamed from: com.facebook.ads.redexgen.X.Zr  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1445Zr implements InterfaceC07386v {
    public final /* synthetic */ C1435Zh A00;

    public C1445Zr(C1435Zh c1435Zh) {
        this.A00 = c1435Zh;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07386v
    public final C7A A5J() {
        if (Build.VERSION.SDK_INT < 23) {
            return this.A00.A07(AnonymousClass76.A05);
        }
        return this.A00.A08(Build.VERSION.BASE_OS);
    }
}
