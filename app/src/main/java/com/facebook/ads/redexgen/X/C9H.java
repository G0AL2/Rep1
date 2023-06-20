package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.9H  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C9H {
    public static byte[] A05;
    public C9I A01;
    @Nullable
    public String A02;
    @Nullable
    public String A03;
    public int A00 = 0;
    public List<C9F> A04 = new ArrayList();

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 109);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{79, 88};
    }

    public C9H(C9I c9i, @Nullable String str, @Nullable String str2) {
        this.A01 = c9i;
        this.A03 = str;
        this.A02 = str2;
    }

    public final int A02() {
        return this.A04.size();
    }

    public final long A03() {
        C9I c9i = this.A01;
        if (c9i != null) {
            return c9i.A0C() + this.A01.A03();
        }
        return -1L;
    }

    public final C9F A04() {
        if (this.A00 < this.A04.size()) {
            this.A00++;
            return this.A04.get(this.A00 - 1);
        }
        return null;
    }

    public final C9I A05() {
        return this.A01;
    }

    @Nullable
    public final String A06() {
        return this.A02;
    }

    @Nullable
    public final String A07() {
        int i10 = this.A00;
        if (i10 > 0 && i10 <= this.A04.size()) {
            return this.A04.get(this.A00 - 1).A04().optString(A00(0, 2, 65));
        }
        return null;
    }

    @Nullable
    public final String A08() {
        return this.A03;
    }

    public final void A09(C9F c9f) {
        this.A04.add(c9f);
    }

    public final boolean A0A() {
        return this.A01 == null || MJ.A00() > this.A01.A0C() + ((long) this.A01.A03());
    }
}
