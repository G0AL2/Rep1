package com.facebook.ads.redexgen.X;

import androidx.annotation.NonNull;

/* loaded from: assets/audience_network.dex */
public final class HA implements Comparable<HA> {
    public final int A00;
    public final H6 A01;

    public HA(int i10, H6 h62) {
        this.A00 = i10;
        this.A01 = h62;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: A00 */
    public final int compareTo(@NonNull HA ha2) {
        return this.A00 - ha2.A00;
    }
}
