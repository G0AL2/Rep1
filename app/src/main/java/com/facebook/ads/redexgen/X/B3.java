package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.ArrayList;

/* loaded from: assets/audience_network.dex */
public final class B3 {
    public static String[] A06 = {"KiEP2P9b6TLdkEYwaN5ndNVtk9NQ5Y9p", "yrQkoPMIPCp0FUw5bDslSTdDJuyK", "OV0qCkDU4pR0s48LAW0LoXOWDo4ZunO9", "CNzCLbPvty9jTQMUswZxpqZWQtb7JEv9", "Vf", "ol3MR5ayifXszMqJK7WjfrE4Lr8bJhi8", "Hh8EscwfVF04VFT3j4sJSJqD2SmetI3K", "DN3PdRai96zSFxDytd4qNigxYecPuw8S"};
    public B4 A01;
    public B4 A02;
    public boolean A03;
    public final ArrayList<B4> A05 = new ArrayList<>();
    public final C0832Az A04 = new C0832Az();
    public B1 A00 = B1.A01;

    private B4 A00(B4 b42, B1 b12) {
        if (b12.A0E() || this.A00.A0E()) {
            return b42;
        }
        int A04 = b12.A04(this.A00.A0A(b42.A01.A02, this.A04, true).A03);
        if (A04 == -1) {
            return b42;
        }
        return new B4(b12.A09(A04, this.A04).A00, b42.A01.A00(A04));
    }

    private void A02() {
        if (!this.A05.isEmpty()) {
            this.A01 = this.A05.get(0);
        }
    }

    @Nullable
    public final B4 A03() {
        return this.A01;
    }

    @Nullable
    public final B4 A04() {
        if (this.A05.isEmpty()) {
            return null;
        }
        ArrayList<B4> arrayList = this.A05;
        return arrayList.get(arrayList.size() - 1);
    }

    @Nullable
    public final B4 A05() {
        if (this.A05.isEmpty() || this.A00.A0E() || this.A03) {
            return null;
        }
        return this.A05.get(0);
    }

    @Nullable
    public final B4 A06() {
        return this.A02;
    }

    @Nullable
    public final FY A07(int timelinePeriodCount) {
        FY fy = null;
        B1 b12 = this.A00;
        if (b12 != null) {
            int periodIndex = b12.A00();
            for (int i10 = 0; i10 < this.A05.size(); i10++) {
                B4 b42 = this.A05.get(i10);
                int i11 = b42.A01.A02;
                if (i11 < periodIndex && this.A00.A09(i11, this.A04).A00 == timelinePeriodCount) {
                    if (fy != null) {
                        return null;
                    }
                    fy = b42.A01;
                }
            }
        }
        return fy;
    }

    public final void A08() {
        this.A03 = false;
        A02();
    }

    public final void A09() {
        this.A03 = true;
    }

    public final void A0A(int i10) {
        A02();
    }

    public final void A0B(int i10, FY fy) {
        this.A05.add(new B4(i10, fy));
        if (this.A05.size() == 1) {
            boolean A0E = this.A00.A0E();
            if (A06[0].charAt(21) == 'U') {
                throw new RuntimeException();
            }
            A06[0] = "SFS5Xb2c2LrmqtbhPrHYALinOi1MehvJ";
            if (!A0E) {
                A02();
            }
        }
    }

    public final void A0C(int i10, FY fy) {
        B4 b42 = new B4(i10, fy);
        this.A05.remove(b42);
        if (!b42.equals(this.A02)) {
            return;
        }
        this.A02 = this.A05.isEmpty() ? null : this.A05.get(0);
    }

    public final void A0D(int i10, FY fy) {
        this.A02 = new B4(i10, fy);
    }

    public final void A0E(B1 b12) {
        for (int i10 = 0; i10 < this.A05.size(); i10++) {
            ArrayList<B4> arrayList = this.A05;
            arrayList.set(i10, A00(arrayList.get(i10), b12));
        }
        B4 b42 = this.A02;
        if (A06[0].charAt(21) == 'U') {
            throw new RuntimeException();
        }
        A06[1] = "OE27bQwCbSc4SHZoCTNTYydrCDTv";
        if (b42 != null) {
            this.A02 = A00(b42, b12);
        }
        this.A00 = b12;
        A02();
    }

    public final boolean A0F() {
        return this.A03;
    }
}
