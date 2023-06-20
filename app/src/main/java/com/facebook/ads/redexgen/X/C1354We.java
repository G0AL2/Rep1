package com.facebook.ads.redexgen.X;

import android.util.SparseArray;
import com.facebook.ads.internal.exoplayer2.drm.DrmInitData;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;

/* renamed from: com.facebook.ads.redexgen.X.We  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1354We implements InterfaceC0860Cc {
    public static byte[] A0p;
    public static String[] A0q = {"PtjeSixlQpPnp33LbTolurfrF5aBxWMN", "zsPWFAYo6WN4WLRLivc6JVSph6JkIRth", "XheyHWRN6othIFLpaes4AkwCM0c9DMBL", "WLz3vbqVAvFNW8GJMAEq6yPWbMM9CaUw", "Xodlb2gLYburpvZCOlf7Ugos4D", "3NxGJ5nCydCtg30cLxHhJHXlDiPWCbyN", "QrznFntGQRtbXA7cSaAHWbiKbufqFBbd", "iW7nVRcCTDgQKTtcLRaOezFHTOIda"};
    public static final InterfaceC0863Cf A0r;
    public static final UUID A0s;
    public static final byte[] A0t;
    public static final byte[] A0u;
    public static final byte[] A0v;
    public static final byte[] A0w;
    public static final byte[] A0x;
    public byte A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public long A0C;
    public long A0D;
    public long A0E;
    public long A0F;
    public long A0G;
    public long A0H;
    public long A0I;
    public long A0J;
    public long A0K;
    public long A0L;
    public long A0M;
    public InterfaceC0862Ce A0N;
    public Cy A0O;
    public IZ A0P;
    public IZ A0Q;
    public ByteBuffer A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public int[] A0b;
    public final SparseArray<Cy> A0c;
    public final Cu A0d;
    public final D1 A0e;
    public final C1004Ij A0f;
    public final C1004Ij A0g;
    public final C1004Ij A0h;
    public final C1004Ij A0i;
    public final C1004Ij A0j;
    public final C1004Ij A0k;
    public final C1004Ij A0l;
    public final C1004Ij A0m;
    public final C1004Ij A0n;
    public final boolean A0o;

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0p, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 58);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A0p = new byte[]{34, 108, 109, 118, 34, 113, 119, 114, 114, 109, 112, 118, 103, 102, 104, 125, 124, 41, 119, 104, 125, Byte.MAX_VALUE, 41, 119, 104, 125, Byte.MAX_VALUE, 41, 119, 104, 125, Byte.MAX_VALUE, 41, 84, 65, 67, 21, 75, 84, 65, 67, 21, 75, 84, 65, 67, 21, 93, 84, 65, 66, 21, 86, 82, 68, 68, 114, 99, 99, 126, 121, 112, 100, 84, 126, 103, Byte.MAX_VALUE, 114, 101, 90, 120, 115, 114, 55, 25, 7, 25, 25, 27, 55, 41, 55, 53, 69, 57, 39, 60, 44, 43, 73, 87, 76, 92, 91, 39, 77, 80, 88, 90, 77, 91, 91, 111, 113, 106, 122, 125, 1, 98, 97, 125, 125, 98, 107, 125, 125, 28, 2, 24, 28, 30, 110, 9, 23, 14, 4, 9, 11, 58, 36, 54, 43, 62, 60, 84, 55, 73, 80, 78, 92, 65, 84, 86, 62, 93, 34, 8, 22, 4, 26, 102, 8, 10, 4, 27, 5, 21, 10, 15, 9, 37, 59, 52, 39, 41, 75, 45, 42, 48, 75, 40, 45, 48, 6, 24, 19, 21, 18, 2, 15, 3, 74, 84, 93, 68, 89, 73, 66, 88, 88, 122, 117, 60, 111, 59, 104, 120, 122, 119, 126, 59, 111, 114, 118, 126, 120, 116, Byte.MAX_VALUE, 126, 59, 107, 105, 114, 116, 105, 59, 111, 116, 59, 111, 114, 118, 126, 120, 116, Byte.MAX_VALUE, 126, 72, 120, 122, 119, 126, 59, 121, 126, 114, 117, 124, 59, 104, 126, 111, 53, 34, 14, 12, 3, 8, 15, 8, 15, 6, 65, 4, 15, 2, 19, 24, 17, 21, 8, 14, 15, 65, 0, 15, 5, 65, 2, 14, 12, 17, 19, 4, 18, 18, 8, 14, 15, 65, 8, 18, 65, 15, 14, 21, 65, 18, 20, 17, 17, 14, 19, 21, 4, 5, 9, 37, 36, 62, 47, 36, 62, 9, 37, 39, 58, 11, 38, 45, 37, 106, 99, 79, 78, 84, 69, 78, 84, 101, 78, 67, 97, 76, 71, 79, 0, 79, 99, 98, 120, 105, 98, 120, 73, 98, 111, 99, 104, 101, 98, 107, 67, 126, 104, 105, 126, 44, 75, 103, 102, 124, 109, 102, 124, 77, 102, 107, 103, 108, 97, 102, 111, 91, 107, 103, 120, 109, 40, 40, 3, 15, 56, 21, 28, 9, 76, 1, 42, 38, 17, 60, 53, 32, 23, 32, 36, 33, 19, 32, 55, 54, 44, 42, 43, 101, 16, 23, 24, 25, 117, 57, 52, 54, 60, 59, 50, 117, 38, 52, 56, 37, 57, 48, 117, 38, 60, 47, 48, 117, 58, 32, 33, 117, 58, 51, 117, 39, 52, 59, 50, 48, 123, 74, 77, 66, 67, 93, 106, 110, 107, 89, 106, 125, 124, 102, 96, 97, 47, 61, 22, 27, 10, 1, 8, 12, 29, 28, 88, 44, 10, 25, 27, 19, 88, 30, 23, 13, 22, 28, 88, 26, 13, 12, 88, 59, 23, 22, 12, 29, 22, 12, 61, 22, 27, 51, 29, 1, 49, 60, 88, 15, 25, 11, 88, 22, 23, 12, 88, 30, 23, 13, 22, 28, 95, 98, 110, Byte.MAX_VALUE, 116, 105, 115, 117, 116, 58, 120, 115, 110, 58, 115, 105, 58, 105, Byte.MAX_VALUE, 110, 58, 115, 116, 58, 105, 115, 125, 116, 123, 118, 58, 120, 99, 110, Byte.MAX_VALUE, 105, 64, 93, 66, 78, 91, 21, 15, 124, 91, 78, 93, 91, 3, 15, 106, 65, 75, 3, 15, 125, 74, 78, 75, 96, 93, 75, 74, 93, 3, 15, 99, 78, 86, 74, 93, 3, 15, 124, 91, 86, 67, 74, 3, 15, 97, 78, 66, 74, 3, 15, 98, 78, 93, 72, 70, 65, 99, 3, 15, 98, 78, 93, 72, 70, 65, 125, 3, 15, 98, 78, 93, 72, 70, 65, 121, 3, 15, 106, 73, 73, 74, 76, 91, 3, 15, 123, 74, 87, 91, 48, 29, 31, 21, 18, 27, 92, 19, 18, 16, 5, 92, 15, 9, 12, 12, 19, 14, 8, 25, 24, 92, 21, 18, 92, 47, 21, 17, 12, 16, 25, 62, 16, 19, 31, 23, 15, 82, 31, 51, 60, 54, 51, 38, 61, 32, 43, 114, 55, 62, 55, 63, 55, 60, 38, 114, 1, 55, 55, 57, 27, 22, 114, 61, 32, 114, 1, 55, 55, 57, 2, 61, 33, 59, 38, 59, 61, 60, 114, 60, 61, 38, 114, 52, 61, 39, 60, 54, 122, 66, 91, 67, 94, 71, 91, 82, 23, 100, 82, 80, 90, 82, 89, 67, 23, 82, 91, 82, 90, 82, 89, 67, 68, 23, 89, 88, 67, 23, 68, 66, 71, 71, 88, 69, 67, 82, 83, 54, 23, 88, 14, 25, 20, 17, 28, 88, 12, 10, 25, 27, 19, 11, 88, 15, 29, 10, 29, 88, 30, 23, 13, 22, 28, 68, 101, 42, 124, 107, 102, 99, 110, 42, 124, 107, 120, 99, 100, 126, 42, 102, 111, 100, 109, 126, 98, 42, 103, 107, 121, 97, 42, 108, 101, Byte.MAX_VALUE, 100, 110, 96, 108, 119, 101, 113, 96, 102, 113, 43, 39, 48, 60, 53, 46, 87, 40, 63, 43, 68, 72, 67, 82, 79, 67, 56, 86, 68, 68, 81, 93, 86, 71, 90, 86, 45, 87, 86, 68, 58, 69, 73, 64, 89, 84, 69, 67, 84, 51, 8, 3, 30, 22, 3, 5, 18, 3, 2, 70, 15, 2, 92, 70, 24, 35, 40, 53, 61, 40, 46, 57, 40, 41, 109, 33, 44, 46, 36, 35, 42, 109, 59, 44, 33, 56, 40, 119, 109, 60, 53, 39, 58, 47, 45, 88, 5, 12, 30, 3, 22, 20, 103, 124, 26, 0, 28, 124, 18, 3, 75, 66, 80, 77, 88, 90, 41, 50, 84, 78, 82, 50, 92, 78, 77, 44, 37, 55, 42, 63, 61, 78, 85, 51, 41, 53, 85, 59, 44, 57, 86, 95, 77, 80, 69, 71, 52, 47, 73, 83, 79, 47, 83, 80, 6, 15, 29, 0, 21, 23, 24, Byte.MAX_VALUE, 25, 3, 31, Byte.MAX_VALUE, 24, 21, 6, 19, 53, 60, 46, 48, 76, 53, 37, 52, 76, 37, 44, 54, 49, 32, 32, 97, 104, 
        99, Byte.MAX_VALUE, 114, 120, 101, 118, 68, 77, 68, 66, 42, 12, 5, 12, 10, 99, 113, 125, 104, 110, 115, 111, 119, 125, 116, 107, 102, 103, 109, 45, 117, 103, 96, 111, 63, 45, 42, 37};
    }

    static {
        A06();
        A0r = new C1356Wg();
        A0w = new byte[]{49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
        A0x = new byte[]{32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};
        A0t = C1020Iz.A0i(A03(539, 90, 21));
        A0u = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        A0v = new byte[]{32, 32, 32, 32, 32, 32, 32, 32, 32, 32};
        A0s = new UUID(72057594037932032L, -9223371306706625679L);
    }

    public C1354We() {
        this(0);
    }

    public C1354We(int i10) {
        this(new C1357Wh(), i10);
    }

    public C1354We(Cu cu, int i10) {
        this.A0K = -1L;
        this.A0M = -9223372036854775807L;
        this.A0G = -9223372036854775807L;
        this.A0H = -9223372036854775807L;
        this.A0F = -1L;
        this.A0J = -1L;
        this.A0E = -9223372036854775807L;
        this.A0d = cu;
        this.A0d.A8J(new C1355Wf(this, null));
        this.A0o = (i10 & 1) == 0;
        this.A0e = new D1();
        this.A0c = new SparseArray<>();
        this.A0k = new C1004Ij(4);
        this.A0n = new C1004Ij(ByteBuffer.allocate(4).putInt(-1).array());
        this.A0l = new C1004Ij(4);
        this.A0i = new C1004Ij(C1000If.A03);
        this.A0h = new C1004Ij(4);
        this.A0j = new C1004Ij();
        this.A0m = new C1004Ij();
        this.A0f = new C1004Ij(8);
        this.A0g = new C1004Ij();
    }

    private int A00(InterfaceC0861Cd interfaceC0861Cd, InterfaceC0870Co interfaceC0870Co, int i10) throws IOException, InterruptedException {
        int AEF;
        int A04 = this.A0j.A04();
        if (A04 > 0) {
            AEF = Math.min(i10, A04);
            if (A0q[7].length() == 22) {
                throw new RuntimeException();
            }
            String[] strArr = A0q;
            strArr[2] = "aDvj6xsBYLtfkWvKOvjAJhuXcdkZRgYf";
            strArr[6] = "uG0ceA84GetZ2PjOc8Op6VIqDQh3bhN9";
            interfaceC0870Co.AEG(this.A0j, AEF);
        } else {
            AEF = interfaceC0870Co.AEF(interfaceC0861Cd, i10, false);
        }
        this.A07 += AEF;
        this.A08 += AEF;
        return AEF;
    }

    private long A01(long j10) throws C0813Af {
        long j11 = this.A0M;
        if (j11 != -9223372036854775807L) {
            return C1020Iz.A0F(j10, j11, 1000L);
        }
        throw new C0813Af(A03(189, 54, 33));
    }

    /* JADX WARN: Incorrect condition in loop: B:21:0x0064 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.facebook.ads.redexgen.X.InterfaceC0867Cl A02() {
        /*
            r11 = this;
            long r3 = r11.A0K
            r8 = 0
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L2e
            long r3 = r11.A0H
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L2e
            com.facebook.ads.redexgen.X.IZ r0 = r11.A0Q
            if (r0 == 0) goto L2e
            int r0 = r0.A02()
            if (r0 == 0) goto L2e
            com.facebook.ads.redexgen.X.IZ r0 = r11.A0P
            if (r0 == 0) goto L2e
            int r1 = r0.A02()
            com.facebook.ads.redexgen.X.IZ r0 = r11.A0Q
            int r0 = r0.A02()
            if (r1 == r0) goto L3a
        L2e:
            r11.A0Q = r8
            r11.A0P = r8
            long r1 = r11.A0H
            com.facebook.ads.redexgen.X.Wq r0 = new com.facebook.ads.redexgen.X.Wq
            r0.<init>(r1)
            return r0
        L3a:
            com.facebook.ads.redexgen.X.IZ r0 = r11.A0Q
            int r7 = r0.A02()
            int[] r9 = new int[r7]
            long[] r6 = new long[r7]
            long[] r5 = new long[r7]
            long[] r4 = new long[r7]
            r10 = 0
        L49:
            if (r10 >= r7) goto L61
            com.facebook.ads.redexgen.X.IZ r0 = r11.A0Q
            long r0 = r0.A03(r10)
            r4[r10] = r0
            long r0 = r11.A0K
            com.facebook.ads.redexgen.X.IZ r2 = r11.A0P
            long r2 = r2.A03(r10)
            long r0 = r0 + r2
            r6[r10] = r0
            int r10 = r10 + 1
            goto L49
        L61:
            r10 = 0
        L62:
            int r0 = r7 + (-1)
            if (r10 >= r0) goto L7c
            int r0 = r10 + 1
            r0 = r6[r0]
            r2 = r6[r10]
            long r0 = r0 - r2
            int r2 = (int) r0
            r9[r10] = r2
            int r0 = r10 + 1
            r2 = r4[r0]
            r0 = r4[r10]
            long r2 = r2 - r0
            r5[r10] = r2
            int r10 = r10 + 1
            goto L62
        L7c:
            int r10 = r7 + (-1)
            long r2 = r11.A0K
            long r0 = r11.A0L
            long r2 = r2 + r0
            int r0 = r7 + (-1)
            r0 = r6[r0]
            long r2 = r2 - r0
            int r0 = (int) r2
            r9[r10] = r0
            int r10 = r7 + (-1)
            long r0 = r11.A0H
            int r2 = r7 + (-1)
            r2 = r4[r2]
            long r0 = r0 - r2
            r5[r10] = r0
            r11.A0Q = r8
            r11.A0P = r8
            com.facebook.ads.redexgen.X.Wv r0 = new com.facebook.ads.redexgen.X.Wv
            r0.<init>(r9, r6, r5, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1354We.A02():com.facebook.ads.redexgen.X.Cl");
    }

    private void A05() {
        this.A07 = 0;
        this.A08 = 0;
        this.A09 = 0;
        this.A0S = false;
        this.A0X = false;
        this.A0U = false;
        this.A0A = 0;
        this.A00 = (byte) 0;
        this.A0T = false;
        this.A0j.A0V();
    }

    private void A07(InterfaceC0861Cd interfaceC0861Cd, int i10) throws IOException, InterruptedException {
        if (this.A0k.A07() >= i10) {
            return;
        }
        if (this.A0k.A05() < i10) {
            C1004Ij c1004Ij = this.A0k;
            c1004Ij.A0b(Arrays.copyOf(c1004Ij.A00, Math.max(this.A0k.A00.length * 2, i10)), this.A0k.A07());
        }
        interfaceC0861Cd.readFully(this.A0k.A00, this.A0k.A07(), i10 - this.A0k.A07());
        this.A0k.A0X(i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0102, code lost:
        if (r0 < r6) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0281  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A08(com.facebook.ads.redexgen.X.InterfaceC0861Cd r11, com.facebook.ads.redexgen.X.Cy r12, int r13) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 659
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1354We.A08(com.facebook.ads.redexgen.X.Cd, com.facebook.ads.redexgen.X.Cy, int):void");
    }

    private void A09(InterfaceC0861Cd interfaceC0861Cd, byte[] bArr, int i10) throws IOException, InterruptedException {
        int length = bArr.length + i10;
        if (this.A0m.A05() < length) {
            this.A0m.A00 = Arrays.copyOf(bArr, length + i10);
        } else {
            System.arraycopy(bArr, 0, this.A0m.A00, 0, bArr.length);
        }
        interfaceC0861Cd.readFully(this.A0m.A00, bArr.length, i10);
        this.A0m.A0W(length);
    }

    private void A0A(InterfaceC0861Cd interfaceC0861Cd, byte[] bArr, int i10, int i11) throws IOException, InterruptedException {
        int min = Math.min(i11, this.A0j.A04());
        interfaceC0861Cd.readFully(bArr, i10 + min, i11 - min);
        if (min > 0) {
            this.A0j.A0c(bArr, i10, min);
        }
        this.A07 += i11;
    }

    private void A0B(Cy cy, long j10) {
        if (cy.A0X != null) {
            cy.A0X.A03(cy, j10);
        } else {
            if (A03(843, 11, 56).equals(cy.A0Y)) {
                A0C(cy, A03(33, 19, 75), 19, 1000L, A0x);
            } else {
                if (A03(833, 10, 45).equals(cy.A0Y)) {
                    A0C(cy, A03(14, 19, 119), 21, 10000L, A0v);
                }
            }
            cy.A0W.AEH(j10, this.A01, this.A08, 0, cy.A0V);
        }
        this.A0V = true;
        A05();
    }

    private void A0C(Cy cy, String str, int i10, long j10, byte[] bArr) {
        A0D(this.A0m.A00, this.A0C, str, i10, j10, bArr);
        InterfaceC0870Co interfaceC0870Co = cy.A0W;
        C1004Ij c1004Ij = this.A0m;
        interfaceC0870Co.AEG(c1004Ij, c1004Ij.A07());
        this.A08 += this.A0m.A07();
    }

    public static void A0D(byte[] bArr, long j10, String str, int i10, long j11, byte[] bArr2) {
        byte[] A0i;
        if (j10 == -9223372036854775807L) {
            A0i = bArr2;
        } else {
            int i11 = (int) (j10 / 3600000000L);
            long j12 = j10 - ((i11 * 3600) * 1000000);
            int i12 = (int) (j12 / 60000000);
            long j13 = j12 - ((i12 * 60) * 1000000);
            int lastValue = (int) (j13 / 1000000);
            A0i = C1020Iz.A0i(String.format(Locale.US, str, Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(lastValue), Integer.valueOf((int) ((j13 - (lastValue * 1000000)) / j11))));
        }
        System.arraycopy(A0i, 0, bArr, i10, bArr2.length);
    }

    private boolean A0E(C0865Cj c0865Cj, long j10) {
        if (this.A0Y) {
            this.A0J = j10;
            c0865Cj.A00 = this.A0F;
            this.A0Y = false;
            return true;
        }
        if (this.A0a) {
            long j11 = this.A0J;
            if (j11 != -1) {
                c0865Cj.A00 = j11;
                this.A0J = -1L;
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x018a, code lost:
        if (r3.equals(r4) == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0199, code lost:
        if (A03(122, 6, 114).equals(r4) != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01a9, code lost:
        if (A03(146, 8, 115).equals(r4) != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01b9, code lost:
        if (A03(160, 13, 94).equals(r4) != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01c9, code lost:
        if (A03(843, 11, 56).equals(r4) != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01d9, code lost:
        if (A03(833, 10, 45).equals(r4) != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01e9, code lost:
        if (A03(854, 8, 44).equals(r4) != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01f9, code lost:
        if (A03(823, 10, 66).equals(r4) != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0209, code lost:
        if (A03(815, 8, 9).equals(r4) == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x020d, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x021f, code lost:
        if (r3.equals(r4) == false) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0F(java.lang.String r4) {
        /*
            Method dump skipped, instructions count: 547
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1354We.A0F(java.lang.String):boolean");
    }

    public static int[] A0H(int[] iArr, int i10) {
        if (iArr == null) {
            return new int[i10];
        }
        if (iArr.length >= i10) {
            return iArr;
        }
        return new int[Math.max(iArr.length * 2, i10)];
    }

    public final void A0I(int i10) throws C0813Af {
        if (i10 == 160) {
            if (this.A04 != 2) {
                return;
            }
            if (!this.A0W) {
                this.A01 |= 1;
            }
            A0B(this.A0c.get(this.A05), this.A0D);
            this.A04 = 0;
            return;
        }
        if (A0q[3].charAt(28) == 'C') {
            String[] strArr = A0q;
            strArr[2] = "rbl1Q01lKztgjfT5AU1HA1uCy8pKF6Jb";
            strArr[6] = "0IgewP00Z0tSvfgvmyCD0no1Nhaiy8Yj";
            if (i10 == 174) {
                if (A0F(this.A0O.A0Y)) {
                    Cy cy = this.A0O;
                    cy.A09(this.A0N, cy.A0N);
                    this.A0c.put(this.A0O.A0N, this.A0O);
                }
                this.A0O = null;
                return;
            } else if (i10 == 19899) {
                int i11 = this.A0B;
                if (i11 != -1) {
                    long j10 = this.A0I;
                    if (j10 != -1) {
                        if (i11 != 475249515) {
                            return;
                        }
                        this.A0F = j10;
                        return;
                    }
                }
                throw new C0813Af(A03(667, 50, 104));
            } else if (i10 == 25152) {
                if (!this.A0O.A0c) {
                    return;
                }
                if (this.A0O.A0V != null) {
                    this.A0O.A0U = new DrmInitData(new DrmInitData.SchemeData(AG.A04, A03(IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES, 10, 56), this.A0O.A0V.A03));
                    return;
                }
                throw new C0813Af(A03(449, 55, 66));
            } else if (A0q[7].length() != 22) {
                A0q[4] = "mvRw2Aey0bC26pGUqGZgnnTCCn";
                if (i10 == 28032) {
                    if (!this.A0O.A0c || this.A0O.A0f == null) {
                        return;
                    }
                    throw new C0813Af(A03(243, 53, 91));
                } else if (i10 == 357149030) {
                    if (this.A0M == -9223372036854775807L) {
                        this.A0M = 1000000L;
                    }
                    long j11 = this.A0G;
                    if (j11 == -9223372036854775807L) {
                        return;
                    }
                    this.A0H = A01(j11);
                    return;
                } else if (i10 != 374648427) {
                    if (i10 != 475249515 || this.A0a) {
                        return;
                    }
                    this.A0N.AEM(A02());
                    this.A0a = true;
                    return;
                } else if (this.A0c.size() != 0) {
                    this.A0N.A5D();
                    return;
                } else {
                    throw new C0813Af(A03(756, 26, 66));
                }
            }
        }
        throw new RuntimeException();
    }

    public final void A0J(int i10, double d10) {
        if (i10 == 181) {
            this.A0O.A0O = (int) d10;
        } else if (i10 != 17545) {
            switch (i10) {
                case 21969:
                    this.A0O.A06 = (float) d10;
                    return;
                case 21970:
                    this.A0O.A07 = (float) d10;
                    return;
                case 21971:
                    this.A0O.A04 = (float) d10;
                    return;
                case 21972:
                    this.A0O.A05 = (float) d10;
                    return;
                case 21973:
                    this.A0O.A02 = (float) d10;
                    return;
                case 21974:
                    this.A0O.A03 = (float) d10;
                    return;
                case 21975:
                    this.A0O.A08 = (float) d10;
                    return;
                case 21976:
                    this.A0O.A09 = (float) d10;
                    return;
                case 21977:
                    this.A0O.A00 = (float) d10;
                    return;
                case 21978:
                    this.A0O.A01 = (float) d10;
                    return;
                default:
                    return;
            }
        } else {
            this.A0G = (long) d10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e6, code lost:
        if (r5 == 8) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e8, code lost:
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x016f, code lost:
        if (r5 == 8) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0173, code lost:
        r2 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0K(int r19, int r20, com.facebook.ads.redexgen.X.InterfaceC0861Cd r21) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 914
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1354We.A0K(int, int, com.facebook.ads.redexgen.X.Cd):void");
    }

    public final void A0L(int i10, long j10) throws C0813Af {
        String A03 = A03(0, 14, 56);
        if (i10 == 20529) {
            if (j10 == 0) {
                return;
            }
            throw new C0813Af(A03(327, 21, 54) + j10 + A03);
        } else if (i10 != 20530) {
            switch (i10) {
                case 131:
                    this.A0O.A0Q = (int) j10;
                    return;
                case 136:
                    this.A0O.A0Z = j10 == 1;
                    return;
                case 155:
                    this.A0C = A01(j10);
                    return;
                case 159:
                    this.A0O.A0B = (int) j10;
                    return;
                case 176:
                    this.A0O.A0R = (int) j10;
                    return;
                case 179:
                    this.A0Q.A04(A01(j10));
                    return;
                case 186:
                    this.A0O.A0J = (int) j10;
                    return;
                case 215:
                    this.A0O.A0N = (int) j10;
                    return;
                case 231:
                    this.A0E = A01(j10);
                    return;
                case 241:
                    if (this.A0Z) {
                        return;
                    }
                    this.A0P.A04(j10);
                    this.A0Z = true;
                    return;
                case 251:
                    this.A0W = true;
                    return;
                case 16980:
                    if (j10 == 3) {
                        return;
                    }
                    throw new C0813Af(A03(296, 16, 112) + j10 + A03);
                case 17029:
                    if (j10 >= 1 && j10 <= 2) {
                        return;
                    }
                    throw new C0813Af(A03(377, 19, 127) + j10 + A03);
                case 17143:
                    if (j10 == 1) {
                        return;
                    }
                    throw new C0813Af(A03(433, 16, 53) + j10 + A03);
                case 18401:
                    if (j10 == 5) {
                        return;
                    }
                    throw new C0813Af(A03(312, 15, 26) + j10 + A03);
                case 18408:
                    if (j10 == 1) {
                        return;
                    }
                    throw new C0813Af(A03(52, 22, 45) + j10 + A03);
                case 21420:
                    this.A0I = this.A0K + j10;
                    return;
                case 21432:
                    int i11 = (int) j10;
                    if (i11 == 0) {
                        this.A0O.A0P = 0;
                        return;
                    } else if (i11 == 1) {
                        this.A0O.A0P = 2;
                        return;
                    } else if (i11 == 3) {
                        this.A0O.A0P = 1;
                        return;
                    } else if (i11 != 15) {
                        return;
                    } else {
                        this.A0O.A0P = 3;
                        return;
                    }
                case 21680:
                    this.A0O.A0I = (int) j10;
                    return;
                case 21682:
                    this.A0O.A0H = (int) j10;
                    return;
                case 21690:
                    this.A0O.A0G = (int) j10;
                    return;
                case 21930:
                    this.A0O.A0a = j10 == 1;
                    return;
                case 22186:
                    this.A0O.A0S = j10;
                    return;
                case 22203:
                    this.A0O.A0T = j10;
                    return;
                case 25188:
                    this.A0O.A0A = (int) j10;
                    return;
                case 2352003:
                    this.A0O.A0F = (int) j10;
                    return;
                case 2807729:
                    this.A0M = j10;
                    return;
                default:
                    switch (i10) {
                        case 21945:
                            int i12 = (int) j10;
                            if (i12 == 1) {
                                this.A0O.A0C = 2;
                                return;
                            } else if (i12 != 2) {
                                return;
                            } else {
                                this.A0O.A0C = 1;
                                return;
                            }
                        case 21946:
                            int i13 = (int) j10;
                            if (i13 != 1) {
                                if (i13 == 16) {
                                    this.A0O.A0E = 6;
                                    return;
                                } else if (i13 == 18) {
                                    this.A0O.A0E = 7;
                                    return;
                                } else if (i13 != 6 && i13 != 7) {
                                    return;
                                }
                            }
                            this.A0O.A0E = 3;
                            return;
                        case 21947:
                            Cy cy = this.A0O;
                            cy.A0b = true;
                            if (A0q[4].length() != 26) {
                                throw new RuntimeException();
                            }
                            A0q[7] = "BNY";
                            int i14 = (int) j10;
                            if (i14 == 1) {
                                cy.A0D = 1;
                                return;
                            } else if (i14 == 9) {
                                cy.A0D = 6;
                                return;
                            } else if (i14 != 4 && i14 != 5 && i14 != 6 && i14 != 7) {
                                return;
                            } else {
                                this.A0O.A0D = 2;
                                return;
                            }
                        case 21948:
                            this.A0O.A0K = (int) j10;
                            return;
                        case 21949:
                            Cy cy2 = this.A0O;
                            String[] strArr = A0q;
                            if (strArr[5].charAt(31) != strArr[0].charAt(31)) {
                                cy2.A0L = (int) j10;
                                return;
                            }
                            A0q[1] = "syCXJsWqdpX1qkuhAX2xE5R3ro0aMiDN";
                            cy2.A0L = (int) j10;
                            return;
                        default:
                            return;
                    }
            }
        } else if (j10 == 1) {
        } else {
            throw new C0813Af(A03(348, 21, 50) + j10 + A03);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b3, code lost:
        if (r5 != 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b5, code lost:
        r5 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c2, code lost:
        if (com.facebook.ads.redexgen.X.C1354We.A0q[7].length() == 22) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c4, code lost:
        com.facebook.ads.redexgen.X.C1354We.A0q[4] = "xUjpTE6fi698I1UVKMv3yTWS8T";
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cb, code lost:
        if (r5 != 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00cd, code lost:
        r7.A0K = r9;
        r7.A0L = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d9, code lost:
        if (r5 != 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00eb, code lost:
        throw new com.facebook.ads.redexgen.X.C0813Af(A03(717, 39, 13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f1, code lost:
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0M(int r8, long r9, long r11) throws com.facebook.ads.redexgen.X.C0813Af {
        /*
            Method dump skipped, instructions count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1354We.A0M(int, long, long):void");
    }

    public final void A0N(int i10, String str) throws C0813Af {
        if (i10 == 134) {
            this.A0O.A0Y = str;
        } else if (i10 != 17026) {
            if (i10 != 2274716) {
                return;
            }
            Cy.A02(this.A0O, str);
        } else if (A03(IronSourceError.ERROR_RV_LOAD_UNEXPECTED_CALLBACK, 4, 114).equals(str) || A03(1016, 8, 38).equals(str)) {
        } else {
            throw new C0813Af(A03(369, 8, 86) + str + A03(0, 14, 56));
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0860Cc
    public final void A8I(InterfaceC0862Ce interfaceC0862Ce) {
        this.A0N = interfaceC0862Ce;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0860Cc
    public final int ADX(InterfaceC0861Cd interfaceC0861Cd, C0865Cj c0865Cj) throws IOException, InterruptedException {
        this.A0V = false;
        boolean z10 = true;
        while (z10 && !this.A0V) {
            z10 = this.A0d.ADZ(interfaceC0861Cd);
            if (z10 && A0E(c0865Cj, interfaceC0861Cd.A7F())) {
                return 1;
            }
        }
        if (z10) {
            return 0;
        }
        for (int i10 = 0; i10 < this.A0c.size(); i10++) {
            this.A0c.valueAt(i10).A07();
        }
        return -1;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0860Cc
    public final void AEL(long j10, long j11) {
        this.A0E = -9223372036854775807L;
        this.A04 = 0;
        this.A0d.reset();
        this.A0e.A06();
        A05();
        for (int i10 = 0; i10 < this.A0c.size(); i10++) {
            this.A0c.valueAt(i10).A08();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0860Cc
    public final boolean AEv(InterfaceC0861Cd interfaceC0861Cd) throws IOException, InterruptedException {
        return new D0().A01(interfaceC0861Cd);
    }
}
