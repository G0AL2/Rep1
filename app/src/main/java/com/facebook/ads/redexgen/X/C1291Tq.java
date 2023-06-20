package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Collection;

/* renamed from: com.facebook.ads.redexgen.X.Tq  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1291Tq implements M8 {
    public final Collection<String> A00;

    public C1291Tq() {
        this.A00 = new ArrayList();
    }

    @Override // com.facebook.ads.redexgen.X.M8
    public final void ADK(String str) {
        this.A00.add(str);
    }

    @Override // com.facebook.ads.redexgen.X.M8
    public final void flush() {
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        for (String line : this.A00) {
            sb2.append(line);
            sb2.append('\n');
        }
        return sb2.toString();
    }
}
