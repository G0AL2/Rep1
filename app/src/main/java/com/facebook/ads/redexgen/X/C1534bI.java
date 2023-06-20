package com.facebook.ads.redexgen.X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.bI  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1534bI implements AnonymousClass62 {
    public final Map<String, AnonymousClass60> A00 = new HashMap();

    @Override // com.facebook.ads.redexgen.X.AnonymousClass62
    public final synchronized String AE2() {
        StringBuilder sb2;
        sb2 = new StringBuilder();
        for (AnonymousClass60 stat : this.A00.values()) {
            sb2.append(stat.toString());
            sb2.append('\n');
        }
        return sb2.toString();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass62
    public final synchronized void reset() {
        this.A00.clear();
    }
}
