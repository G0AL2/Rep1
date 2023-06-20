package com.facebook.ads.redexgen.X;

import android.view.View;
import com.facebook.infer.annotation.Nullsafe;
import java.util.Collection;
import java.util.Map;
import java.util.WeakHashMap;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* renamed from: com.facebook.ads.redexgen.X.eN  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1713eN {
    public final Map<View, C1720eU> A00 = new WeakHashMap();

    public final synchronized C1720eU A00(View view) {
        C1720eU c1720eU = this.A00.get(view);
        if (c1720eU == null) {
            return C1720eU.A06;
        }
        return c1720eU;
    }

    public final synchronized void A01(View view) {
        this.A00.remove(view);
    }

    public final synchronized void A02(View view, C1720eU c1720eU) {
        this.A00.put(view, c1720eU);
    }

    public final synchronized void A03(Collection<View> collection) {
        for (View view : this.A00.keySet()) {
            collection.add(view);
        }
    }
}
