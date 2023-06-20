package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.2H  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C2H implements Serializable {
    public static final long serialVersionUID = -3209129042070173126L;
    public C2H A00;
    public final int A01;
    public final String A02;
    @Nullable
    public final String A03;
    public final List<C2H> A04;

    public C2H(int i10, @Nullable String str, String str2) {
        this.A04 = new ArrayList();
        this.A01 = i10;
        this.A03 = str;
        this.A02 = str2;
    }

    public C2H(String str) {
        this(0, null, str);
    }

    private void A00(C2H c2h) {
        this.A00 = c2h;
    }

    public final int A01() {
        return this.A01;
    }

    public final C2H A02() {
        return this.A00;
    }

    @Nullable
    public final String A03() {
        return this.A02;
    }

    public final String A04() {
        return this.A03;
    }

    public final List<C2H> A05() {
        return this.A04;
    }

    public final void A06(C2H c2h) {
        c2h.A00(this);
        this.A04.add(c2h);
    }
}
