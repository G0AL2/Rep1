package com.facebook.ads.redexgen.X;

import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: assets/audience_network.dex */
public class cV<K, V> extends AbstractC06202d<K, V> {
    public final /* synthetic */ C1604cU A00;

    public cV(C1604cU c1604cU) {
        this.A00 = c1604cU;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC06202d
    public final int A04() {
        return ((C06232g) this.A00).A00;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC06202d
    public final int A05(Object obj) {
        return this.A00.A08(obj);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC06202d
    public final int A06(Object obj) {
        return this.A00.A07(obj);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC06202d
    public final Object A07(int i10, int i11) {
        return this.A00.A02[(i10 << 1) + i11];
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC06202d
    public final V A08(int i10, V v10) {
        V value = this.A00.A0C(i10, v10);
        return value;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC06202d
    public final Map<K, V> A0A() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC06202d
    public final void A0D() {
        this.A00.clear();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC06202d
    public final void A0E(int i10) {
        this.A00.A0A(i10);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC06202d
    public final void A0F(K k10, V v10) {
        this.A00.put(k10, v10);
    }
}
