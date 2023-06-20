package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class PB {
    public static final Map<String, WeakReference<PA>> A00 = new HashMap();

    public static int A00() {
        return A00.size();
    }

    public static PA A01(C1400Xy c1400Xy, AnonymousClass18 anonymousClass18, int i10, P8 p82) {
        PA pa2 = new PA(c1400Xy, anonymousClass18, c1400Xy.A00().A08(), i10);
        pa2.A0b(p82);
        pa2.A0X();
        A00.put(anonymousClass18.A0Z(), new WeakReference<>(pa2));
        return pa2;
    }

    @Nullable
    public static PA A02(String str) {
        WeakReference<PA> weakReference = A00.get(str);
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public static void A03(AnonymousClass18 anonymousClass18, PA pa2) {
        A00.put(anonymousClass18.A0Z(), new WeakReference<>(pa2));
    }

    public static void A04(String str) {
        A00.remove(str);
    }
}
