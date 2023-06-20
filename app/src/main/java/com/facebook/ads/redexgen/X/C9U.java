package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.9U  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C9U {
    public static C9U A00 = new C9U();

    public static C9U A00() {
        return A00;
    }

    @SuppressLint({"InstanceMethodCanBeStatic"})
    public final C9T A01(C8U c8u, boolean z10) {
        return new XT(c8u, z10, new AnonymousClass66());
    }

    @SuppressLint({"CatchGeneralException"})
    public final Map<String, String> A02(C8U c8u) {
        try {
            return A01(c8u, false).A6W();
        } catch (Throwable th) {
            c8u.A06().A3R(th);
            return C9Q.A01(c8u);
        }
    }
}
