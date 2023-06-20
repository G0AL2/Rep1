package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class WE implements InterfaceC0860Cc {
    public static byte[] A04;
    public static String[] A05 = {"6Yd3MlxO6zs0On0JMF5Pwnois3aNTjpE", "MmQBoaYzrmdPmtEAYQ3R1Y6Mcsh6By7B", "7RUBoC8KCwVWfiCX9SWb", "GS41ND25W7ytYawGpGonJQP9IOOENLXr", "lL4oomLzy5vPLaNFQ0K", "J26", "emQAR3GMgLzBn72fJq6a", "GcSIxJRAUXsHB0u2DOmppTTbOqtsj228"};
    public static final InterfaceC0863Cf A06;
    public static final int A07;
    public boolean A00;
    public final long A01;
    public final WD A02;
    public final C1004Ij A03;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 120);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{27, 22, 97};
    }

    static {
        A01();
        A06 = new WF();
        A07 = C1020Iz.A08(A00(0, 3, 42));
    }

    public WE() {
        this(0L);
    }

    public WE(long j10) {
        this.A01 = j10;
        this.A02 = new WD(true);
        this.A03 = new C1004Ij(200);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0860Cc
    public final void A8I(InterfaceC0862Ce interfaceC0862Ce) {
        this.A02.A4V(interfaceC0862Ce, new C0893Dw(0, 1));
        interfaceC0862Ce.A5D();
        interfaceC0862Ce.AEM(new C1366Wq(-9223372036854775807L));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0860Cc
    public final int ADX(InterfaceC0861Cd interfaceC0861Cd, C0865Cj c0865Cj) throws IOException, InterruptedException {
        int read = interfaceC0861Cd.read(this.A03.A00, 0, 200);
        if (read == -1) {
            return -1;
        }
        this.A03.A0Y(0);
        this.A03.A0X(read);
        if (!this.A00) {
            this.A02.AD4(this.A01, true);
            this.A00 = true;
        }
        this.A02.A48(this.A03);
        return 0;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0860Cc
    public final void AEL(long j10, long j11) {
        this.A00 = false;
        this.A02.AEK();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0860Cc
    public final boolean AEv(InterfaceC0861Cd interfaceC0861Cd) throws IOException, InterruptedException {
        C1004Ij c1004Ij = new C1004Ij(10);
        C1003Ii c1003Ii = new C1003Ii(c1004Ij.A00);
        int validFramesCount = 0;
        while (true) {
            interfaceC0861Cd.AD7(c1004Ij.A00, 0, 10);
            c1004Ij.A0Y(0);
            if (c1004Ij.A0G() != A07) {
                break;
            }
            c1004Ij.A0Z(3);
            int A0D = c1004Ij.A0D();
            int length = A0D + 10;
            validFramesCount += length;
            interfaceC0861Cd.A3K(A0D);
        }
        interfaceC0861Cd.AEB();
        interfaceC0861Cd.A3K(validFramesCount);
        int i10 = validFramesCount;
        int i11 = 0;
        if (A05[4].length() == 20) {
            throw new RuntimeException();
        }
        A05[1] = "mY90xJHLqPMDpFXgmiZe2UkYD68ZyI7P";
        int i12 = 0;
        while (true) {
            interfaceC0861Cd.AD7(c1004Ij.A00, 0, 2);
            c1004Ij.A0Y(0);
            int validFramesSize = c1004Ij.A0I();
            if ((65526 & validFramesSize) != 65520) {
                i12 = 0;
                i11 = 0;
                interfaceC0861Cd.AEB();
                i10++;
                if (i10 - validFramesCount >= 8192) {
                    return false;
                }
                interfaceC0861Cd.A3K(i10);
            } else {
                i12++;
                if (i12 >= 4 && i11 > 188) {
                    return true;
                }
                interfaceC0861Cd.AD7(c1004Ij.A00, 0, 4);
                c1003Ii.A07(14);
                int A042 = c1003Ii.A04(13);
                if (A042 <= 6) {
                    return false;
                }
                int syncBytes = A042 - 6;
                interfaceC0861Cd.A3K(syncBytes);
                i11 += A042;
            }
        }
    }
}
