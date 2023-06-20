package com.facebook.ads.redexgen.X;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Wl  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1361Wl implements InterfaceC0860Cc {
    public static byte[] A0F;
    public static String[] A0G = {"F9KwQMNMxiTjkayDhPM6gvDLkPvUNcLn", "Em4FZTw9NeUBCVsnasMEsqdbQrmSbGq", "", "tDq5h6G1X4d5RY1LfaFLZXWqT85DrCya", "B5R7X", "Y", "Zp00UWtElOmikRSXEs37FpNUTZ5eWL9Y", "wqRNyyxlEoRi9"};
    public static final InterfaceC0863Cf A0H;
    public static final int A0I;
    public int A00;
    public int A02;
    public int A03;
    public long A05;
    public InterfaceC0862Ce A06;
    public C1363Wn A07;
    public C1358Wi A08;
    public boolean A09;
    public final C1004Ij A0C = new C1004Ij(4);
    public final C1004Ij A0B = new C1004Ij(9);
    public final C1004Ij A0E = new C1004Ij(11);
    public final C1004Ij A0D = new C1004Ij();
    public final C1360Wk A0A = new C1360Wk();
    public int A01 = 1;
    public long A04 = -9223372036854775807L;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0F, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 60);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A0F = new byte[]{-117, -111, -101};
    }

    static {
        A03();
        A0H = new C1362Wm();
        A0I = C1020Iz.A08(A01(0, 3, 9));
    }

    private C1004Ij A00(InterfaceC0861Cd interfaceC0861Cd) throws IOException, InterruptedException {
        if (this.A02 > this.A0D.A05()) {
            C1004Ij c1004Ij = this.A0D;
            c1004Ij.A0b(new byte[Math.max(c1004Ij.A05() * 2, this.A02)], 0);
        } else {
            this.A0D.A0Y(0);
        }
        this.A0D.A0X(this.A02);
        interfaceC0861Cd.readFully(this.A0D.A00, 0, this.A02);
        return this.A0D;
    }

    private void A02() {
        if (!this.A09) {
            this.A06.AEM(new C1366Wq(-9223372036854775807L));
            this.A09 = true;
        }
        if (this.A04 != -9223372036854775807L) {
            return;
        }
        this.A04 = this.A0A.A0D() == -9223372036854775807L ? -this.A05 : 0L;
    }

    private void A04(InterfaceC0861Cd interfaceC0861Cd) throws IOException, InterruptedException {
        interfaceC0861Cd.AEt(this.A00);
        this.A00 = 0;
        this.A01 = 3;
    }

    private boolean A05(InterfaceC0861Cd interfaceC0861Cd) throws IOException, InterruptedException {
        if (interfaceC0861Cd.ADc(this.A0B.A00, 0, 9, true)) {
            C1004Ij c1004Ij = this.A0B;
            if (A0G[4].length() != 15) {
                String[] strArr = A0G;
                strArr[3] = "xxv79KM5VyarLmUhQqEOMlbbyGFtPWOG";
                strArr[6] = "n0W8PrJEyrqWl4lCbLWkK9bcjvpbO2Fn";
                c1004Ij.A0Y(0);
                this.A0B.A0Z(4);
                int A0E = this.A0B.A0E();
                boolean z10 = (A0E & 4) != 0;
                boolean hasAudio = (A0E & 1) != 0;
                if (z10 && this.A07 == null) {
                    this.A07 = new C1363Wn(this.A06.AFD(8, 1));
                }
                if (hasAudio && this.A08 == null) {
                    this.A08 = new C1358Wi(this.A06.AFD(9, 2));
                }
                this.A06.A5D();
                this.A00 = (this.A0B.A08() - 9) + 4;
                this.A01 = 2;
                return true;
            }
            throw new RuntimeException();
        }
        return false;
    }

    private boolean A06(InterfaceC0861Cd interfaceC0861Cd) throws IOException, InterruptedException {
        boolean z10 = true;
        if (this.A03 == 8 && this.A07 != null) {
            A02();
            this.A07.A00(A00(interfaceC0861Cd), this.A04 + this.A05);
        } else if (this.A03 == 9 && this.A08 != null) {
            A02();
            this.A08.A00(A00(interfaceC0861Cd), this.A04 + this.A05);
        } else if (this.A03 == 18 && !this.A09) {
            this.A0A.A00(A00(interfaceC0861Cd), this.A05);
            long A0D = this.A0A.A0D();
            if (A0D != -9223372036854775807L) {
                this.A06.AEM(new C1366Wq(A0D));
                this.A09 = true;
            }
        } else {
            int i10 = this.A02;
            if (A0G[4].length() == 15) {
                throw new RuntimeException();
            }
            A0G[0] = "mShHrd4Vu2jNkvRJUK8UrhhXjzgbGKl1";
            interfaceC0861Cd.AEt(i10);
            z10 = false;
        }
        this.A00 = 4;
        this.A01 = 2;
        return z10;
    }

    private boolean A07(InterfaceC0861Cd interfaceC0861Cd) throws IOException, InterruptedException {
        if (interfaceC0861Cd.ADc(this.A0E.A00, 0, 11, true)) {
            this.A0E.A0Y(0);
            this.A03 = this.A0E.A0E();
            this.A02 = this.A0E.A0G();
            this.A05 = this.A0E.A0G();
            this.A05 = ((this.A0E.A0E() << 24) | this.A05) * 1000;
            this.A0E.A0Z(3);
            this.A01 = 4;
            return true;
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0860Cc
    public final void A8I(InterfaceC0862Ce interfaceC0862Ce) {
        this.A06 = interfaceC0862Ce;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0860Cc
    public final int ADX(InterfaceC0861Cd interfaceC0861Cd, C0865Cj c0865Cj) throws IOException, InterruptedException {
        while (true) {
            int i10 = this.A01;
            if (i10 != 1) {
                if (i10 == 2) {
                    A04(interfaceC0861Cd);
                } else if (A0G[4].length() == 15) {
                    throw new RuntimeException();
                } else {
                    A0G[4] = "ncW0XwKX3pgCRaaT";
                    if (i10 != 3) {
                        if (i10 == 4) {
                            if (A06(interfaceC0861Cd)) {
                                if (A0G[0].charAt(18) != 'j') {
                                    A0G[7] = "5";
                                    return 0;
                                }
                                A0G[7] = "DR5iBP2XCUKx659t";
                                return 0;
                            }
                        } else {
                            throw new IllegalStateException();
                        }
                    } else if (!A07(interfaceC0861Cd)) {
                        return -1;
                    }
                }
            } else if (!A05(interfaceC0861Cd)) {
                return -1;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0860Cc
    public final void AEL(long j10, long j11) {
        this.A01 = 1;
        this.A04 = -9223372036854775807L;
        this.A00 = 0;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0860Cc
    public final boolean AEv(InterfaceC0861Cd interfaceC0861Cd) throws IOException, InterruptedException {
        interfaceC0861Cd.AD7(this.A0C.A00, 0, 3);
        this.A0C.A0Y(0);
        if (this.A0C.A0G() != A0I) {
            return false;
        }
        interfaceC0861Cd.AD7(this.A0C.A00, 0, 2);
        this.A0C.A0Y(0);
        if ((this.A0C.A0I() & IronSourceConstants.INTERSTITIAL_DAILY_CAPPED) != 0) {
            return false;
        }
        interfaceC0861Cd.AD7(this.A0C.A00, 0, 4);
        this.A0C.A0Y(0);
        int A08 = this.A0C.A08();
        interfaceC0861Cd.AEB();
        interfaceC0861Cd.A3K(A08);
        interfaceC0861Cd.AD7(this.A0C.A00, 0, 4);
        this.A0C.A0Y(0);
        return this.A0C.A08() == 0;
    }
}
