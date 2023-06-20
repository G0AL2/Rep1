package com.facebook.ads.redexgen.X;

import android.view.View;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class JX {
    public final View A00;
    public final C1399Xx A01;
    public final InterfaceC1028Jh A02;
    public final String A03;
    public final HashMap<String, String> A04 = new HashMap<>();
    public final boolean A05;
    public final boolean A06;

    public JX(C1399Xx c1399Xx, View view, String str, boolean z10, boolean z11) {
        this.A03 = str;
        this.A01 = c1399Xx;
        this.A02 = c1399Xx.A08();
        this.A00 = view;
        this.A05 = z11;
        this.A06 = z10;
    }

    public final View A00() {
        return this.A00;
    }

    public final C1399Xx A01() {
        return this.A01;
    }

    public final InterfaceC1028Jh A02() {
        return this.A02;
    }

    public final String A03() {
        return this.A03;
    }

    public final Map<String, String> A04() {
        return Collections.unmodifiableMap(this.A04);
    }

    public final boolean A05() {
        return this.A05;
    }

    public final boolean A06() {
        return this.A06;
    }
}
