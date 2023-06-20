package com.facebook.ads.redexgen.X;

import com.inmobi.media.fq;
import java.nio.charset.Charset;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Ij  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1004Ij {
    public static byte[] A03;
    public static String[] A04 = {"HJCnnsvFRKCxDDAbEWuhDIcdg3xeT1pm", "aXWy8CvsRXCMVcJtmBA1wVRdgUuSFZpH", "GQPvM", "pDI65rPXKWggiakX8tUTXOsWDv9apWvH", "LM6A01RjpialbK5Oi", "vEfQavrNrAXrkYYeEOthMrPonFtv4Upj", "EEXi7u9hiAizt85cGACEO5SSNblzx1I5", "5Jpn3XfqvoPj"};
    public byte[] A00;
    public int A01;
    public int A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 24);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-33, 4, 12, -9, 2, -1, -6, -74, -21, -22, -36, -61, -50, -74, 9, -5, 7, 11, -5, 4, -7, -5, -74, -7, 5, 4, 10, -1, 4, 11, -9, 10, -1, 5, 4, -74, -8, 15, 10, -5, -48, -74, -67, -30, -22, -43, -32, -35, -40, -108, -55, -56, -70, -95, -84, -108, -25, -39, -27, -23, -39, -30, -41, -39, -108, -38, -35, -26, -25, -24, -108, -42, -19, -24, -39, -82, -108, -113, -86, -85, 91, -99, -92, -81, 91, -87, -86, -81, 91, -75, -96, -83, -86, 117, 91, -49, -50, -64, -89, -78};
    }

    static {
        A01();
    }

    public C1004Ij() {
    }

    public C1004Ij(int i10) {
        this.A00 = new byte[i10];
        this.A01 = i10;
    }

    public C1004Ij(byte[] bArr) {
        this.A00 = bArr;
        this.A01 = bArr.length;
    }

    public C1004Ij(byte[] bArr, int i10) {
        this.A00 = bArr;
        this.A01 = i10;
    }

    public final char A02() {
        byte[] bArr = this.A00;
        int i10 = this.A02;
        return (char) ((bArr[i10 + 1] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[i10] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 8));
    }

    public final double A03() {
        return Double.longBitsToDouble(A0L());
    }

    public final int A04() {
        return this.A01 - this.A02;
    }

    public final int A05() {
        byte[] bArr = this.A00;
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    public final int A06() {
        return this.A02;
    }

    public final int A07() {
        return this.A01;
    }

    public final int A08() {
        byte[] bArr = this.A00;
        int i10 = this.A02;
        this.A02 = i10 + 1;
        int i11 = (bArr[i10] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 24;
        int i12 = this.A02;
        this.A02 = i12 + 1;
        int i13 = i11 | ((bArr[i12] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 16);
        int i14 = this.A02;
        this.A02 = i14 + 1;
        int i15 = i13 | ((bArr[i14] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 8);
        int i16 = this.A02;
        this.A02 = i16 + 1;
        return (bArr[i16] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) | i15;
    }

    public final int A09() {
        byte[] bArr = this.A00;
        int i10 = this.A02;
        this.A02 = i10 + 1;
        int i11 = ((bArr[i10] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 24) >> 8;
        int i12 = this.A02;
        this.A02 = i12 + 1;
        int i13 = i11 | ((bArr[i12] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 8);
        int i14 = this.A02;
        this.A02 = i14 + 1;
        return (bArr[i14] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) | i13;
    }

    public final int A0A() {
        byte[] bArr = this.A00;
        int i10 = this.A02;
        this.A02 = i10 + 1;
        int i11 = bArr[i10] & fq.i.NETWORK_LOAD_LIMIT_DISABLED;
        int i12 = this.A02;
        this.A02 = i12 + 1;
        int i13 = i11 | ((bArr[i12] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 8);
        int i14 = this.A02;
        this.A02 = i14 + 1;
        int i15 = i13 | ((bArr[i14] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 16);
        int i16 = this.A02;
        this.A02 = i16 + 1;
        return ((bArr[i16] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 24) | i15;
    }

    public final int A0B() {
        int A0A = A0A();
        if (A0A >= 0) {
            return A0A;
        }
        throw new IllegalStateException(A00(77, 18, 35) + A0A);
    }

    public final int A0C() {
        byte[] bArr = this.A00;
        int i10 = this.A02;
        this.A02 = i10 + 1;
        int i11 = bArr[i10] & fq.i.NETWORK_LOAD_LIMIT_DISABLED;
        int i12 = this.A02;
        this.A02 = i12 + 1;
        return ((bArr[i12] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 8) | i11;
    }

    public final int A0D() {
        int b22 = A0E();
        int b32 = A0E();
        int b42 = A0E();
        int b23 = (b22 << 21) | (b32 << 14);
        int b33 = b42 << 7;
        return b23 | b33 | A0E();
    }

    public final int A0E() {
        byte[] bArr = this.A00;
        int i10 = this.A02;
        this.A02 = i10 + 1;
        return bArr[i10] & fq.i.NETWORK_LOAD_LIMIT_DISABLED;
    }

    public final int A0F() {
        byte[] bArr = this.A00;
        int i10 = this.A02;
        this.A02 = i10 + 1;
        int i11 = (bArr[i10] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 8;
        int i12 = this.A02;
        this.A02 = i12 + 1;
        int i13 = (bArr[i12] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) | i11;
        this.A02 += 2;
        return i13;
    }

    public final int A0G() {
        byte[] bArr = this.A00;
        int i10 = this.A02;
        this.A02 = i10 + 1;
        int i11 = (bArr[i10] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 16;
        int i12 = this.A02;
        this.A02 = i12 + 1;
        int i13 = i11 | ((bArr[i12] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 8);
        int i14 = this.A02;
        this.A02 = i14 + 1;
        return (bArr[i14] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) | i13;
    }

    public final int A0H() {
        int A08 = A08();
        if (A08 >= 0) {
            return A08;
        }
        throw new IllegalStateException(A00(77, 18, 35) + A08);
    }

    public final int A0I() {
        byte[] bArr = this.A00;
        int i10 = this.A02;
        this.A02 = i10 + 1;
        int i11 = (bArr[i10] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 8;
        int i12 = this.A02;
        this.A02 = i12 + 1;
        return (bArr[i12] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) | i11;
    }

    public final long A0J() {
        byte[] bArr = this.A00;
        int i10 = this.A02;
        this.A02 = i10 + 1;
        int i11 = this.A02;
        this.A02 = i11 + 1;
        int i12 = this.A02;
        this.A02 = i12 + 1;
        int i13 = this.A02;
        this.A02 = i13 + 1;
        int i14 = this.A02;
        this.A02 = i14 + 1;
        int i15 = this.A02;
        this.A02 = i15 + 1;
        int i16 = this.A02;
        this.A02 = i16 + 1;
        int i17 = this.A02;
        this.A02 = i17 + 1;
        return (bArr[i10] & 255) | ((bArr[i11] & 255) << 8) | ((bArr[i12] & 255) << 16) | ((bArr[i13] & 255) << 24) | ((bArr[i14] & 255) << 32) | ((bArr[i15] & 255) << 40) | ((bArr[i16] & 255) << 48) | ((255 & bArr[i17]) << 56);
    }

    public final long A0K() {
        byte[] bArr = this.A00;
        int i10 = this.A02;
        this.A02 = i10 + 1;
        int i11 = this.A02;
        this.A02 = i11 + 1;
        int i12 = this.A02;
        this.A02 = i12 + 1;
        int i13 = this.A02;
        this.A02 = i13 + 1;
        return (bArr[i10] & 255) | ((bArr[i11] & 255) << 8) | ((bArr[i12] & 255) << 16) | ((255 & bArr[i13]) << 24);
    }

    public final long A0L() {
        byte[] bArr = this.A00;
        int i10 = this.A02;
        this.A02 = i10 + 1;
        int i11 = this.A02;
        this.A02 = i11 + 1;
        int i12 = this.A02;
        this.A02 = i12 + 1;
        int i13 = this.A02;
        this.A02 = i13 + 1;
        int i14 = this.A02;
        this.A02 = i14 + 1;
        int i15 = this.A02;
        this.A02 = i15 + 1;
        int i16 = this.A02;
        this.A02 = i16 + 1;
        int i17 = this.A02;
        this.A02 = i17 + 1;
        return ((bArr[i10] & 255) << 56) | ((bArr[i11] & 255) << 48) | ((bArr[i12] & 255) << 40) | ((bArr[i13] & 255) << 32) | ((bArr[i14] & 255) << 24) | ((bArr[i15] & 255) << 16) | ((bArr[i16] & 255) << 8) | (255 & bArr[i17]);
    }

    public final long A0M() {
        byte[] bArr = this.A00;
        int i10 = this.A02;
        this.A02 = i10 + 1;
        int i11 = this.A02;
        this.A02 = i11 + 1;
        int i12 = this.A02;
        this.A02 = i12 + 1;
        int i13 = this.A02;
        this.A02 = i13 + 1;
        return ((bArr[i10] & 255) << 24) | ((bArr[i11] & 255) << 16) | ((bArr[i12] & 255) << 8) | (255 & bArr[i13]);
    }

    public final long A0N() {
        long A0L = A0L();
        if (A0L >= 0) {
            return A0L;
        }
        throw new IllegalStateException(A00(77, 18, 35) + A0L);
    }

    public final long A0O() {
        int i10 = 0;
        long j10 = this.A00[this.A02];
        int i11 = 7;
        while (true) {
            if (i11 < 0) {
                break;
            }
            int j11 = 1 << i11;
            int i12 = ((j11 & j10) > 0L ? 1 : ((j11 & j10) == 0L ? 0 : -1));
            if (A04[3].charAt(7) == 'H') {
                throw new RuntimeException();
            }
            A04[7] = "lhGNf9ZIwuKG";
            if (i12 != 0) {
                i11--;
            } else if (i11 < 6) {
                int j12 = 1 << i11;
                j10 &= j12 - 1;
                i10 = 7 - i11;
            } else if (i11 == 7) {
                i10 = 1;
            }
        }
        if (i10 != 0) {
            int i13 = 1;
            while (i13 < i10) {
                byte[] bArr = this.A00;
                int i14 = this.A02;
                byte b10 = bArr[i14 + i13];
                if ((b10 & 192) == 128) {
                    long j13 = j10 << 6;
                    String[] strArr = A04;
                    String str = strArr[5];
                    String str2 = strArr[6];
                    int charAt = str.charAt(9);
                    int i15 = str2.charAt(9);
                    if (charAt != i15) {
                        A04[7] = "BvJ8XuqLfWkj";
                        int i16 = b10 & 63;
                        j10 = j13 | i16;
                        i13 += 0;
                    } else {
                        A04[7] = "bl64THqm1YbP";
                        int i17 = b10 & 63;
                        j10 = j13 | i17;
                        i13++;
                    }
                } else {
                    throw new NumberFormatException(A00(0, 42, 126) + j10);
                }
            }
            int i18 = this.A02;
            this.A02 = i18 + i10;
            return j10;
        }
        throw new NumberFormatException(A00(42, 35, 92) + j10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0096, code lost:
        if (r6.A02 == r3) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0098, code lost:
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a2, code lost:
        if (r6.A02 == r3) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String A0P() {
        /*
            r6 = this;
            int r0 = r6.A04()
            if (r0 != 0) goto L28
            r3 = 0
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C1004Ij.A04
            r0 = 3
            r1 = r1[r0]
            r0 = 7
            char r1 = r1.charAt(r0)
            r0 = 72
            if (r1 == r0) goto L22
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1004Ij.A04
            java.lang.String r1 = "Lp13SRVWSAlchtHB237WPpHnlSgF4gaJ"
            r0 = 5
            r2[r0] = r1
            java.lang.String r1 = "rKST0dS6uAv5sauBNsTeIX1rNmAgPgcE"
            r0 = 6
            r2[r0] = r1
            return r3
        L22:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L28:
            int r5 = r6.A02
        L2a:
            int r0 = r6.A01
            if (r5 >= r0) goto L3b
            byte[] r0 = r6.A00
            r0 = r0[r5]
            boolean r0 = com.facebook.ads.redexgen.X.C1020Iz.A0d(r0)
            if (r0 != 0) goto L3b
            int r5 = r5 + 1
            goto L2a
        L3b:
            int r4 = r6.A02
            int r0 = r5 - r4
            r3 = 3
            if (r0 < r3) goto L5d
            byte[] r2 = r6.A00
            r1 = r2[r4]
            r0 = -17
            if (r1 != r0) goto L5d
            int r0 = r4 + 1
            r1 = r2[r0]
            r0 = -69
            if (r1 != r0) goto L5d
            int r0 = r4 + 2
            r1 = r2[r0]
            r0 = -65
            if (r1 != r0) goto L5d
            int r4 = r4 + r3
            r6.A02 = r4
        L5d:
            byte[] r2 = r6.A00
            int r1 = r6.A02
            int r0 = r5 - r1
            java.lang.String r4 = com.facebook.ads.redexgen.X.C1020Iz.A0R(r2, r1, r0)
            r6.A02 = r5
            int r2 = r6.A02
            int r3 = r6.A01
            if (r2 != r3) goto L70
            return r4
        L70:
            byte[] r0 = r6.A00
            r1 = r0[r2]
            r0 = 13
            if (r1 != r0) goto La5
            int r0 = r2 + 1
            r6.A02 = r0
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C1004Ij.A04
            r0 = 2
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 5
            if (r1 == r0) goto L99
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1004Ij.A04
            java.lang.String r1 = "7WLwSFEg60VT5h1w5xCSRnUKgnyD8yNS"
            r0 = 1
            r2[r0] = r1
            java.lang.String r1 = "aRAvn4znRhpfiIQyr1UPz3MngzOxDO2U"
            r0 = 0
            r2[r0] = r1
            int r0 = r6.A02
            if (r0 != r3) goto La5
        L98:
            return r4
        L99:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1004Ij.A04
            java.lang.String r1 = "q7voCOqIwzwrpNWuoMFHLwpJUMmmskbB"
            r0 = 3
            r2[r0] = r1
            int r0 = r6.A02
            if (r0 != r3) goto La5
            goto L98
        La5:
            byte[] r0 = r6.A00
            int r2 = r6.A02
            r1 = r0[r2]
            r0 = 10
            if (r1 != r0) goto Lb3
            int r0 = r2 + 1
            r6.A02 = r0
        Lb3:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1004Ij.A0P():java.lang.String");
    }

    public final String A0Q() {
        if (A04() == 0) {
            return null;
        }
        int i10 = this.A02;
        while (i10 < this.A01 && this.A00[i10] != 0) {
            i10++;
        }
        byte[] bArr = this.A00;
        int i11 = this.A02;
        String A0R = C1020Iz.A0R(bArr, i11, i10 - i11);
        this.A02 = i10;
        int i12 = this.A02;
        if (i12 < this.A01) {
            this.A02 = i12 + 1;
        }
        return A0R;
    }

    public final String A0R(int lastIndex) {
        if (lastIndex == 0) {
            return A00(0, 0, 47);
        }
        int i10 = lastIndex;
        int i11 = (this.A02 + lastIndex) - 1;
        if (i11 < this.A01 && this.A00[i11] == 0) {
            i10--;
        }
        String A0R = C1020Iz.A0R(this.A00, this.A02, i10);
        this.A02 += lastIndex;
        return A0R;
    }

    public final String A0S(int i10) {
        return A0T(i10, Charset.forName(A00(95, 5, 98)));
    }

    public final String A0T(int i10, Charset charset) {
        String str = new String(this.A00, this.A02, i10, charset);
        this.A02 += i10;
        return str;
    }

    public final short A0U() {
        byte[] bArr = this.A00;
        int i10 = this.A02;
        this.A02 = i10 + 1;
        int i11 = (bArr[i10] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 8;
        int i12 = this.A02;
        this.A02 = i12 + 1;
        return (short) ((bArr[i12] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) | i11);
    }

    public final void A0V() {
        this.A02 = 0;
        this.A01 = 0;
    }

    public final void A0W(int i10) {
        A0b(A05() < i10 ? new byte[i10] : this.A00, i10);
    }

    public final void A0X(int i10) {
        IK.A03(i10 >= 0 && i10 <= this.A00.length);
        this.A01 = i10;
    }

    public final void A0Y(int i10) {
        IK.A03(i10 >= 0 && i10 <= this.A01);
        this.A02 = i10;
    }

    public final void A0Z(int i10) {
        A0Y(this.A02 + i10);
    }

    public final void A0a(C1003Ii c1003Ii, int i10) {
        A0c(c1003Ii.A00, 0, i10);
        c1003Ii.A07(0);
    }

    public final void A0b(byte[] bArr, int i10) {
        this.A00 = bArr;
        this.A01 = i10;
        this.A02 = 0;
    }

    public final void A0c(byte[] bArr, int i10, int i11) {
        System.arraycopy(this.A00, this.A02, bArr, i10, i11);
        this.A02 += i11;
    }
}
