package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class WJ extends DY {
    public static byte[] A05;
    public static String[] A06 = {"Wz5kpI", "Qu4rCXWHGrZxyCLJ91nJYm9HwbbNBaAB", "jcFxTUNQ9mBSPSNjMUJY07wGvzfGS2C0", "wRecpgZSCUfboq2e81nqZjs5B", "2wu5mHiieWPMNFHGOEN0thCm6IWO9Xya", "P54DBngSoaRE6HRNMaW6H3WNUnBy8S0x", "u1kez8Hi5IXqm6uzKKQ3Ad3inAYpSzVQ", "yOq9tmgmQLY5WHe8QvjpkSndY9PHYfSY"};
    public int A00;
    public C0873Da A01;
    public C0875Dc A02;
    public C0876De A03;
    public boolean A04;

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 51);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A05 = new byte[]{61, 41, 56, 53, 51, 115, 42, 51, 46, 62, 53, 47};
    }

    static {
        A04();
    }

    public static int A00(byte b10, int i10, int i11) {
        return (b10 >> i11) & (255 >>> (8 - i10));
    }

    public static int A01(byte b10, C0873Da c0873Da) {
        if (!c0873Da.A04[A00(b10, c0873Da.A00, 1)].A03) {
            return c0873Da.A02.A03;
        }
        return c0873Da.A02.A04;
    }

    private final C0873Da A02(C1004Ij c1004Ij) throws IOException {
        if (this.A03 == null) {
            this.A03 = C0877Df.A04(c1004Ij);
            return null;
        }
        C0875Dc c0875Dc = this.A02;
        if (A06[7].charAt(1) != 'O') {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[3] = "EnVW7ymY5FyvrkHYKpVAYit2P";
        strArr[0] = "59lsEN";
        if (c0875Dc == null) {
            this.A02 = C0877Df.A03(c1004Ij);
            return null;
        }
        byte[] bArr = new byte[c1004Ij.A07()];
        System.arraycopy(c1004Ij.A00, 0, bArr, 0, c1004Ij.A07());
        Dd[] A0C = C0877Df.A0C(c1004Ij, this.A03.A05);
        return new C0873Da(this.A03, this.A02, bArr, A0C, C0877Df.A00(A0C.length - 1));
    }

    public static void A05(C1004Ij c1004Ij, long j10) {
        c1004Ij.A0X(c1004Ij.A07() + 4);
        c1004Ij.A00[c1004Ij.A07() - 4] = (byte) (j10 & 255);
        c1004Ij.A00[c1004Ij.A07() - 3] = (byte) ((j10 >>> 8) & 255);
        c1004Ij.A00[c1004Ij.A07() - 2] = (byte) ((j10 >>> 16) & 255);
        c1004Ij.A00[c1004Ij.A07() - 1] = (byte) (255 & (j10 >>> 24));
    }

    public static boolean A06(C1004Ij c1004Ij) {
        try {
            return C0877Df.A0A(1, c1004Ij, true);
        } catch (C0813Af unused) {
            return false;
        }
    }

    @Override // com.facebook.ads.redexgen.X.DY
    public final long A07(C1004Ij c1004Ij) {
        if ((c1004Ij.A00[0] & 1) == 1) {
            return -1L;
        }
        int A01 = A01(c1004Ij.A00[0], this.A01);
        int i10 = this.A04 ? (this.A00 + A01) / 4 : 0;
        A05(c1004Ij, i10);
        this.A04 = true;
        this.A00 = A01;
        return i10;
    }

    @Override // com.facebook.ads.redexgen.X.DY
    public final void A08(long j10) {
        super.A08(j10);
        this.A04 = j10 != 0;
        C0876De c0876De = this.A03;
        this.A00 = c0876De != null ? c0876De.A03 : 0;
    }

    @Override // com.facebook.ads.redexgen.X.DY
    public final void A09(boolean z10) {
        super.A09(z10);
        if (z10) {
            this.A01 = null;
            this.A03 = null;
            this.A02 = null;
        }
        this.A00 = 0;
        this.A04 = false;
    }

    @Override // com.facebook.ads.redexgen.X.DY
    public final boolean A0A(C1004Ij c1004Ij, long j10, DX dx) throws IOException, InterruptedException {
        if (this.A01 != null) {
            String[] strArr = A06;
            if (strArr[5].charAt(2) != strArr[1].charAt(2)) {
                throw new RuntimeException();
            }
            A06[2] = "mO0nJ77ourwQSXFSw31DnFJId1Q3DZ07";
            return false;
        }
        this.A01 = A02(c1004Ij);
        if (this.A01 == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.A01.A02.A09);
        arrayList.add(this.A01.A03);
        dx.A00 = Format.A07(null, A03(0, 12, 111), null, this.A01.A02.A02, -1, this.A01.A02.A05, (int) this.A01.A02.A06, arrayList, null, 0, null);
        return true;
    }
}
