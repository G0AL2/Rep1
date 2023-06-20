package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.widget.EdgeEffect;

/* renamed from: com.facebook.ads.redexgen.X.3i  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C06493i {
    public static final C06483h A00;

    static {
        if (Build.VERSION.SDK_INT >= 21) {
            A00 = new C1591cE();
        } else {
            A00 = new C06483h();
        }
    }

    public static void A00(EdgeEffect edgeEffect, float f10, float f11) {
        A00.A00(edgeEffect, f10, f11);
    }
}
