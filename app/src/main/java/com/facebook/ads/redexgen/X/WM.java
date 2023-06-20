package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class WM implements InterfaceC0860Cc {
    public static byte[] A03;
    public static final InterfaceC0863Cf A04;
    public InterfaceC0862Ce A00;
    public DY A01;
    public boolean A02;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 114);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{95, 120, 112, 117, 124, 125, 57, 109, 118, 57, 125, 124, 109, 124, 107, 116, 112, 119, 124, 57, 123, 112, 109, 106, 109, 107, 124, 120, 116, 57, 109, 96, 105, 124};
    }

    static {
        A02();
        A04 = new WN();
    }

    public static C1004Ij A00(C1004Ij c1004Ij) {
        c1004Ij.A0Y(0);
        return c1004Ij;
    }

    private boolean A03(InterfaceC0861Cd interfaceC0861Cd) throws IOException, InterruptedException {
        DU du = new DU();
        if (du.A03(interfaceC0861Cd, true) && (du.A04 & 2) == 2) {
            int length = Math.min(du.A00, 8);
            C1004Ij c1004Ij = new C1004Ij(length);
            interfaceC0861Cd.AD7(c1004Ij.A00, 0, length);
            C1004Ij scratch = A00(c1004Ij);
            if (WO.A04(scratch)) {
                this.A01 = new WO();
            } else {
                C1004Ij scratch2 = A00(c1004Ij);
                if (WJ.A06(scratch2)) {
                    this.A01 = new WJ();
                } else {
                    C1004Ij scratch3 = A00(c1004Ij);
                    if (!WL.A04(scratch3)) {
                        return false;
                    }
                    this.A01 = new WL();
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0860Cc
    public final void A8I(InterfaceC0862Ce interfaceC0862Ce) {
        this.A00 = interfaceC0862Ce;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0860Cc
    public final int ADX(InterfaceC0861Cd interfaceC0861Cd, C0865Cj c0865Cj) throws IOException, InterruptedException {
        if (this.A01 == null) {
            if (A03(interfaceC0861Cd)) {
                interfaceC0861Cd.AEB();
            } else {
                throw new C0813Af(A01(0, 34, 107));
            }
        }
        if (!this.A02) {
            InterfaceC0870Co AFD = this.A00.AFD(0, 1);
            this.A00.A5D();
            this.A01.A06(this.A00, AFD);
            this.A02 = true;
        }
        return this.A01.A02(interfaceC0861Cd, c0865Cj);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0860Cc
    public final void AEL(long j10, long j11) {
        DY dy = this.A01;
        if (dy != null) {
            dy.A05(j10, j11);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0860Cc
    public final boolean AEv(InterfaceC0861Cd interfaceC0861Cd) throws IOException, InterruptedException {
        try {
            return A03(interfaceC0861Cd);
        } catch (C0813Af unused) {
            return false;
        }
    }
}
