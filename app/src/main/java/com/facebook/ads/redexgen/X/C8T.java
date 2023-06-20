package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.8T  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C8T {
    public static final AtomicReference<C1399Xx> A00 = new AtomicReference<>();

    @Nullable
    public static C1399Xx A00() {
        return A00.get();
    }

    public static void A01(C1399Xx c1399Xx) {
        if (c1399Xx == null) {
            return;
        }
        A00.compareAndSet(null, c1399Xx);
    }
}
