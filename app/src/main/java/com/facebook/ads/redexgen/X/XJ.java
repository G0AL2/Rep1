package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class XJ implements InterfaceC0995Ia {
    public static byte[] A04;
    @Nullable
    public XG A00;
    @Nullable
    public InterfaceC0995Ia A01;
    public final AJ A02;
    public final C1311Uk A03;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 59);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{95, 103, 126, 102, 123, 98, 126, 119, 50, 96, 119, 124, 118, 119, 96, 119, 96, 50, Byte.MAX_VALUE, 119, 118, 123, 115, 50, 113, 126, 125, 113, 121, 97, 50, 119, 124, 115, 112, 126, 119, 118, 60};
    }

    public XJ(AJ aj, IN in) {
        this.A02 = aj;
        this.A03 = new C1311Uk(in);
    }

    private void A01() {
        this.A03.A02(this.A01.A7H());
        C0815Ah playbackParameters = this.A01.A7E();
        if (!playbackParameters.equals(this.A03.A7E())) {
            this.A03.AEf(playbackParameters);
            this.A02.ABo(playbackParameters);
        }
    }

    private boolean A03() {
        XG xg = this.A00;
        return (xg == null || xg.A8R() || (!this.A00.A8c() && this.A00.A84())) ? false : true;
    }

    public final long A04() {
        if (A03()) {
            A01();
            return this.A01.A7H();
        }
        return this.A03.A7H();
    }

    public final void A05() {
        this.A03.A00();
    }

    public final void A06() {
        this.A03.A01();
    }

    public final void A07(long j10) {
        this.A03.A02(j10);
    }

    public final void A08(XG xg) {
        if (xg == this.A00) {
            this.A01 = null;
            this.A00 = null;
        }
    }

    public final void A09(XG xg) throws AM {
        InterfaceC0995Ia interfaceC0995Ia;
        InterfaceC0995Ia A6w = xg.A6w();
        if (A6w != null && A6w != (interfaceC0995Ia = this.A01)) {
            if (interfaceC0995Ia == null) {
                this.A01 = A6w;
                this.A00 = xg;
                this.A01.AEf(this.A03.A7E());
                A01();
                return;
            }
            throw AM.A02(new IllegalStateException(A00(0, 39, 41)));
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0995Ia
    public final C0815Ah A7E() {
        InterfaceC0995Ia interfaceC0995Ia = this.A01;
        if (interfaceC0995Ia != null) {
            return interfaceC0995Ia.A7E();
        }
        return this.A03.A7E();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0995Ia
    public final long A7H() {
        if (A03()) {
            return this.A01.A7H();
        }
        return this.A03.A7H();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0995Ia
    public final C0815Ah AEf(C0815Ah c0815Ah) {
        InterfaceC0995Ia interfaceC0995Ia = this.A01;
        if (interfaceC0995Ia != null) {
            c0815Ah = interfaceC0995Ia.AEf(c0815Ah);
        }
        this.A03.AEf(c0815Ah);
        this.A02.ABo(c0815Ah);
        return c0815Ah;
    }
}
