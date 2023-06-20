package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.metadata.Metadata;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class WS implements InterfaceC0860Cc, InterfaceC0867Cl {
    public static byte[] A0J;
    public static String[] A0K = {"0jSfxoXEMfCjtmnyDugkNcQJRjSOySMa", "bnCyjA5DcUmWUqivzOXdDI", "awYt8cnKxKdhDKIItvFTiUYUED9yM0q1", "Luabopmg5NHaS5SoCXeHIbwAQFsLRvJ0", "odfzLqPoxtdmNhQ8QVXSS2", "Wo8IxRBaFRXe4oQbEdt7BomqryNllMGC", "1wQy", "sEQm6Nsu4XqoPKwwi3EdYrJfunZcOKFC"};
    public static final InterfaceC0863Cf A0L;
    public static final int A0M;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public InterfaceC0862Ce A09;
    public C1004Ij A0A;
    public boolean A0B;
    public DI[] A0C;
    public long[][] A0D;
    public final int A0E;
    public final C1004Ij A0F;
    public final C1004Ij A0G;
    public final C1004Ij A0H;
    public final ArrayDeque<C1350Wa> A0I;

    public static String A04(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0J, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 28);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A0J = new byte[]{57, 12, 23, 21, 88, 11, 17, 2, 29, 88, 20, 29, 11, 11, 88, 12, 16, 25, 22, 88, 16, 29, 25, 28, 29, 10, 88, 20, 29, 22, 31, 12, 16, 88, 80, 13, 22, 11, 13, 8, 8, 23, 10, 12, 29, 28, 81, 86, 4, 1, 85, 85};
    }

    static {
        A07();
        A0L = new WT();
        A0M = C1020Iz.A08(A04(48, 4, 105));
    }

    public WS() {
        this(0);
    }

    public WS(int i10) {
        this.A0E = i10;
        this.A0F = new C1004Ij(16);
        this.A0I = new ArrayDeque<>();
        this.A0H = new C1004Ij(C1000If.A03);
        this.A0G = new C1004Ij(4);
        this.A06 = -1;
    }

    private int A00(long preferredSkipAmount) {
        long j10 = Long.MAX_VALUE;
        int i10 = 1;
        int i11 = -1;
        long j11 = Long.MAX_VALUE;
        long j12 = Long.MAX_VALUE;
        int trackIndex = 1;
        int sampleIndex = -1;
        int i12 = 0;
        while (true) {
            DI[] diArr = this.A0C;
            if (i12 >= diArr.length) {
                break;
            }
            DI di = diArr[i12];
            int i13 = di.A00;
            if (i13 != di.A03.A01) {
                long j13 = di.A03.A06[i13];
                long j14 = this.A0D[i12][i13];
                long j15 = j13 - preferredSkipAmount;
                int i14 = (j15 < 0 || j15 >= 262144) ? 1 : 0;
                if ((i14 == 0 && i10 != 0) || (i14 == i10 && j15 < j10)) {
                    i10 = i14;
                    j10 = j15;
                    i11 = i12;
                    j11 = j14;
                }
                if (j14 < j12) {
                    j12 = j14;
                    trackIndex = i14;
                    sampleIndex = i12;
                }
            }
            i12++;
        }
        int i15 = (j12 > Long.MAX_VALUE ? 1 : (j12 == Long.MAX_VALUE ? 0 : -1));
        if (A0K[5].charAt(28) != 'l') {
            throw new RuntimeException();
        }
        String[] strArr = A0K;
        strArr[7] = "2rf3IkD44HipF2iEZWYVpECLVHr0uALb";
        strArr[0] = "2zlrhAiZVnIklu1FhIrlCsqVaSaq97eM";
        if (i15 == 0 || trackIndex == 0) {
            return i11;
        }
        long sampleOffset = 10485760 + j12;
        if (j11 < sampleOffset) {
            return i11;
        }
        return sampleIndex;
    }

    private int A01(InterfaceC0861Cd interfaceC0861Cd, C0865Cj c0865Cj) throws IOException, InterruptedException {
        int i10;
        long A7F = interfaceC0861Cd.A7F();
        if (this.A06 == -1) {
            this.A06 = A00(A7F);
            if (this.A06 == -1) {
                return -1;
            }
        }
        DI di = this.A0C[this.A06];
        InterfaceC0870Co interfaceC0870Co = di.A01;
        int i11 = di.A00;
        long j10 = di.A03.A06[i11];
        int i12 = di.A03.A05[i11];
        long inputPosition = j10 - A7F;
        long position = inputPosition + this.A04;
        int sampleSize = (position > 0L ? 1 : (position == 0L ? 0 : -1));
        if (sampleSize >= 0) {
            int sampleSize2 = (position > 262144L ? 1 : (position == 262144L ? 0 : -1));
            if (sampleSize2 < 0) {
                if (di.A02.A02 == 1) {
                    position += 8;
                    i12 -= 8;
                }
                interfaceC0861Cd.AEt((int) position);
                if (di.A02.A01 != 0) {
                    byte[] bArr = this.A0G.A00;
                    bArr[0] = 0;
                    bArr[1] = 0;
                    bArr[2] = 0;
                    int i13 = di.A02.A01;
                    int i14 = 4 - di.A02.A01;
                    while (this.A04 < i12) {
                        int i15 = this.A05;
                        if (i15 == 0) {
                            byte[] nalLengthData = this.A0G.A00;
                            interfaceC0861Cd.readFully(nalLengthData, i14, i13);
                            this.A0G.A0Y(0);
                            this.A05 = this.A0G.A0H();
                            this.A0H.A0Y(0);
                            interfaceC0870Co.AEG(this.A0H, 4);
                            this.A04 += 4;
                            i12 += i14;
                        } else {
                            int writtenBytes = interfaceC0870Co.AEF(interfaceC0861Cd, i15, false);
                            this.A04 += writtenBytes;
                            this.A05 -= writtenBytes;
                        }
                    }
                    i10 = 0;
                } else {
                    while (true) {
                        int i16 = this.A04;
                        if (i16 >= i12) {
                            break;
                        }
                        int AEF = interfaceC0870Co.AEF(interfaceC0861Cd, i12 - i16, false);
                        int writtenBytes2 = this.A04;
                        this.A04 = writtenBytes2 + AEF;
                        int writtenBytes3 = this.A05;
                        this.A05 = writtenBytes3 - AEF;
                    }
                    i10 = 0;
                }
                interfaceC0870Co.AEH(di.A03.A07[i11], di.A03.A04[i11], i12, 0, null);
                di.A00++;
                this.A06 = -1;
                this.A04 = i10;
                this.A05 = i10;
                return i10;
            }
        }
        c0865Cj.A00 = j10;
        return 1;
    }

    public static int A02(DR dr, long j10) {
        int A00 = dr.A00(j10);
        if (A00 == -1) {
            return dr.A01(j10);
        }
        return A00;
    }

    public static long A03(DR dr, long j10, long j11) {
        int A02 = A02(dr, j10);
        if (A02 == -1) {
            return j11;
        }
        return Math.min(dr.A06[A02], j11);
    }

    private ArrayList<DR> A05(C1350Wa c1350Wa, C0864Cg c0864Cg, boolean z10) throws C0813Af {
        DO A0C;
        ArrayList<DR> arrayList = new ArrayList<>();
        int i10 = 0;
        while (true) {
            int size = c1350Wa.A01.size();
            String[] strArr = A0K;
            if (strArr[2].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0K;
            strArr2[7] = "cCqXKTxpaVHnB5xhxhubewm2proDizNi";
            strArr2[0] = "XNMFZPcuybbaYtAFLaJvO7GLnY5oO3YZ";
            if (i10 < size) {
                C1350Wa c1350Wa2 = c1350Wa.A01.get(i10);
                if (((D3) c1350Wa2).A00 == D3.A1L && (A0C = D8.A0C(c1350Wa2, c1350Wa.A07(D3.A0n), -9223372036854775807L, null, z10, this.A0B)) != null) {
                    DR A0E = D8.A0E(A0C, c1350Wa2.A06(D3.A0d).A06(D3.A0h).A06(D3.A16), c0864Cg);
                    if (A0E.A01 != 0) {
                        arrayList.add(A0E);
                    }
                }
                i10++;
            } else {
                return arrayList;
            }
        }
    }

    private void A06() {
        this.A03 = 0;
        this.A00 = 0;
    }

    private void A08(long j10) throws C0813Af {
        while (!this.A0I.isEmpty() && this.A0I.peek().A00 == j10) {
            C1350Wa pop = this.A0I.pop();
            if (((D3) pop).A00 == D3.A0j) {
                A0A(pop);
                this.A0I.clear();
                this.A03 = 2;
            } else if (!this.A0I.isEmpty()) {
                this.A0I.peek().A08(pop);
            }
        }
        if (this.A03 != 2) {
            A06();
        }
    }

    private void A09(long j10) {
        DI[] diArr;
        for (DI di : this.A0C) {
            DR dr = di.A03;
            int A00 = dr.A00(j10);
            if (A00 == -1) {
                A00 = dr.A01(j10);
            }
            di.A00 = A00;
        }
    }

    private void A0A(C1350Wa c1350Wa) throws C0813Af {
        ArrayList<DR> A05;
        int i10 = -1;
        long j10 = -9223372036854775807L;
        ArrayList arrayList = new ArrayList();
        Metadata metadata = null;
        C0864Cg c0864Cg = new C0864Cg();
        WZ A07 = c1350Wa.A07(D3.A1P);
        if (A07 != null && (metadata = D8.A0F(A07, this.A0B)) != null) {
            c0864Cg.A05(metadata);
        }
        boolean ignoreEditLists = (this.A0E & 1) != 0;
        try {
            A05 = A05(c1350Wa, c0864Cg, ignoreEditLists);
        } catch (WW unused) {
            c0864Cg = new C0864Cg();
            A05 = A05(c1350Wa, c0864Cg, true);
        }
        int size = A05.size();
        for (int i11 = 0; i11 < size; i11++) {
            DR dr = A05.get(i11);
            DO r13 = dr.A03;
            DI di = new DI(r13, dr, this.A09.AFD(i11, r13.A03));
            int trackCount = dr.A00 + 30;
            Format A0F = r13.A07.A0F(trackCount);
            if (r13.A03 == 1) {
                if (c0864Cg.A03()) {
                    A0F = A0F.A0G(c0864Cg.A00, c0864Cg.A01);
                }
                if (metadata != null) {
                    A0F = A0F.A0J(metadata);
                }
            }
            di.A01.A5V(A0F);
            j10 = Math.max(j10, r13.A04 != -9223372036854775807L ? r13.A04 : dr.A02);
            int maxInputSize = r13.A03;
            if (maxInputSize == 2 && i10 == -1) {
                i10 = arrayList.size();
            }
            arrayList.add(di);
        }
        this.A02 = i10;
        this.A08 = j10;
        this.A0C = (DI[]) arrayList.toArray(new DI[arrayList.size()]);
        this.A0D = A0G(this.A0C);
        this.A09.A5D();
        this.A09.AEM(this);
    }

    public static boolean A0B(int i10) {
        if (i10 != D3.A0j) {
            int i11 = D3.A1L;
            String[] strArr = A0K;
            if (strArr[4].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0K;
            strArr2[2] = "xHWkCkmm9lwx55Xb6ilKRbCBaMi3tx91";
            strArr2[3] = "ufwmFaOIh4ETn2yFiF4b2v05oMaexVS8";
            if (i10 != i11 && i10 != D3.A0d && i10 != D3.A0h && i10 != D3.A16 && i10 != D3.A0N) {
                return false;
            }
        }
        return true;
    }

    public static boolean A0C(int i10) {
        if (i10 != D3.A0c && i10 != D3.A0n && i10 != D3.A0V && i10 != D3.A1A && i10 != D3.A1D && i10 != D3.A1B) {
            int i11 = D3.A0C;
            if (A0K[1].length() != 22) {
                throw new RuntimeException();
            }
            A0K[1] = "WjfYMB7jPbcUwDvfNOpuH1";
            if (i10 != i11 && i10 != D3.A0O && i10 != D3.A19 && i10 != D3.A1C && i10 != D3.A1E && i10 != D3.A17 && i10 != D3.A0B && i10 != D3.A1J && i10 != D3.A0U && i10 != D3.A1P) {
                return false;
            }
        }
        return true;
    }

    private boolean A0D(InterfaceC0861Cd interfaceC0861Cd) throws IOException, InterruptedException {
        if (this.A00 == 0) {
            if (!interfaceC0861Cd.ADc(this.A0F.A00, 0, 8, true)) {
                return false;
            }
            this.A00 = 8;
            this.A0F.A0Y(0);
            this.A07 = this.A0F.A0M();
            this.A01 = this.A0F.A08();
        }
        long j10 = this.A07;
        if (j10 == 1) {
            interfaceC0861Cd.readFully(this.A0F.A00, 8, 8);
            this.A00 += 8;
            this.A07 = this.A0F.A0N();
        } else if (j10 == 0) {
            long A6t = interfaceC0861Cd.A6t();
            if (A6t == -1 && !this.A0I.isEmpty()) {
                A6t = this.A0I.peek().A00;
            }
            if (A6t != -1) {
                this.A07 = (A6t - interfaceC0861Cd.A7F()) + this.A00;
            }
        }
        if (this.A07 >= this.A00) {
            if (A0B(this.A01)) {
                long A7F = (interfaceC0861Cd.A7F() + this.A07) - this.A00;
                this.A0I.push(new C1350Wa(this.A01, A7F));
                if (this.A07 == this.A00) {
                    A08(A7F);
                } else {
                    A06();
                }
            } else if (A0C(this.A01)) {
                IK.A04(this.A00 == 8);
                IK.A04(this.A07 <= 2147483647L);
                this.A0A = new C1004Ij((int) this.A07);
                System.arraycopy(this.A0F.A00, 0, this.A0A.A00, 0, 8);
                this.A03 = 1;
            } else {
                this.A0A = null;
                this.A03 = 1;
            }
            return true;
        }
        throw new C0813Af(A04(0, 48, 100));
    }

    private boolean A0E(InterfaceC0861Cd interfaceC0861Cd, C0865Cj c0865Cj) throws IOException, InterruptedException {
        long j10 = this.A07 - this.A00;
        long A7F = interfaceC0861Cd.A7F() + j10;
        boolean z10 = false;
        C1004Ij c1004Ij = this.A0A;
        if (c1004Ij != null) {
            interfaceC0861Cd.readFully(c1004Ij.A00, this.A00, (int) j10);
            if (this.A01 == D3.A0U) {
                this.A0B = A0F(this.A0A);
            } else if (!this.A0I.isEmpty()) {
                this.A0I.peek().A09(new WZ(this.A01, this.A0A));
            }
        } else if (j10 < 262144) {
            interfaceC0861Cd.AEt((int) j10);
        } else {
            c0865Cj.A00 = interfaceC0861Cd.A7F() + j10;
            z10 = true;
        }
        A08(A7F);
        return z10 && this.A03 != 2;
    }

    public static boolean A0F(C1004Ij c1004Ij) {
        c1004Ij.A0Y(8);
        if (c1004Ij.A08() == A0M) {
            return true;
        }
        c1004Ij.A0Z(4);
        while (c1004Ij.A04() > 0) {
            if (c1004Ij.A08() == A0M) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Incorrect condition in loop: B:11:0x0036 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long[][] A0G(com.facebook.ads.redexgen.X.DI[] r14) {
        /*
            int r0 = r14.length
            long[][] r6 = new long[r0]
            int r0 = r14.length
            int[] r5 = new int[r0]
            int r0 = r14.length
            long[] r4 = new long[r0]
            int r0 = r14.length
            boolean[] r3 = new boolean[r0]
            r2 = 0
        Ld:
            int r0 = r14.length
            if (r2 >= r0) goto L28
            r0 = r14[r2]
            com.facebook.ads.redexgen.X.DR r0 = r0.A03
            int r0 = r0.A01
            long[] r0 = new long[r0]
            r6[r2] = r0
            r0 = r14[r2]
            com.facebook.ads.redexgen.X.DR r0 = r0.A03
            long[] r1 = r0.A07
            r0 = 0
            r0 = r1[r0]
            r4[r2] = r0
            int r2 = r2 + 1
            goto Ld
        L28:
            r12 = 0
            r2 = 0
        L2b:
            int r0 = r14.length
            if (r2 >= r0) goto L71
            r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r9 = -1
            r1 = 0
        L35:
            int r0 = r14.length
            if (r1 >= r0) goto L48
            boolean r0 = r3[r1]
            if (r0 != 0) goto L45
            r7 = r4[r1]
            int r0 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r0 > 0) goto L45
            r9 = r1
            r10 = r4[r1]
        L45:
            int r1 = r1 + 1
            goto L35
        L48:
            r7 = r5[r9]
            r0 = r6[r9]
            r0[r7] = r12
            r0 = r14[r9]
            com.facebook.ads.redexgen.X.DR r0 = r0.A03
            int[] r0 = r0.A05
            r0 = r0[r7]
            long r0 = (long) r0
            long r12 = r12 + r0
            r1 = 1
            int r7 = r7 + r1
            r5[r9] = r7
            r0 = r6[r9]
            int r0 = r0.length
            if (r7 >= r0) goto L6c
            r0 = r14[r9]
            com.facebook.ads.redexgen.X.DR r0 = r0.A03
            long[] r0 = r0.A07
            r0 = r0[r7]
            r4[r9] = r0
            goto L2b
        L6c:
            r3[r9] = r1
            int r2 = r2 + 1
            goto L2b
        L71:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.WS.A0G(com.facebook.ads.redexgen.X.DI[]):long[][]");
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0867Cl
    public final long A6S() {
        return this.A08;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0867Cl
    public final C0866Ck A7O(long secondTimeUs) {
        long j10;
        long j11;
        int A01;
        DI[] diArr = this.A0C;
        if (diArr.length == 0) {
            return new C0866Ck(C0868Cm.A04);
        }
        long j12 = -9223372036854775807L;
        long j13 = -1;
        int i10 = this.A02;
        if (i10 != -1) {
            DR dr = diArr[i10].A03;
            int A02 = A02(dr, secondTimeUs);
            if (A02 == -1) {
                return new C0866Ck(C0868Cm.A04);
            }
            j10 = dr.A07[A02];
            j11 = dr.A06[A02];
            if (A0K[5].charAt(28) == 'l') {
                String[] strArr = A0K;
                strArr[4] = "wZC6PUUkwbL39FGS7qgHi4";
                strArr[6] = "ISWp";
                if (j10 < secondTimeUs && A02 < dr.A01 - 1 && (A01 = dr.A01(secondTimeUs)) != -1 && A01 != A02) {
                    j12 = dr.A07[A01];
                    j13 = dr.A06[A01];
                }
            }
            throw new RuntimeException();
        }
        j10 = secondTimeUs;
        j11 = Long.MAX_VALUE;
        int i11 = 0;
        while (true) {
            DI[] diArr2 = this.A0C;
            if (A0K[5].charAt(28) != 'l') {
                break;
            }
            String[] strArr2 = A0K;
            strArr2[2] = "HuKpkwhwNffVsg1qOYm34WvQGcpzf7CA";
            strArr2[3] = "OpSxQ7AB5KpfVVm82hohcPrOWAs1xSas";
            if (i11 < diArr2.length) {
                if (i11 != this.A02) {
                    DR dr2 = diArr2[i11].A03;
                    j11 = A03(dr2, j10, j11);
                    if (j12 != -9223372036854775807L) {
                        j13 = A03(dr2, j12, j13);
                    }
                }
                i11++;
            } else {
                C0868Cm c0868Cm = new C0868Cm(j10, j11);
                if (j12 == -9223372036854775807L) {
                    return new C0866Ck(c0868Cm);
                }
                return new C0866Ck(c0868Cm, new C0868Cm(j12, j13));
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0860Cc
    public final void A8I(InterfaceC0862Ce interfaceC0862Ce) {
        this.A09 = interfaceC0862Ce;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0867Cl
    public final boolean A8g() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0860Cc
    public final int ADX(InterfaceC0861Cd interfaceC0861Cd, C0865Cj c0865Cj) throws IOException, InterruptedException {
        while (true) {
            int i10 = this.A03;
            String[] strArr = A0K;
            if (strArr[2].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0K;
            strArr2[7] = "qJxbwGisfZf9YKIw0pjhTsx78598m8MK";
            strArr2[0] = "kX2rligkfJBBB9teOSCW5LaSmFhGBJWo";
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        return A01(interfaceC0861Cd, c0865Cj);
                    }
                    throw new IllegalStateException();
                } else if (A0E(interfaceC0861Cd, c0865Cj)) {
                    return 1;
                }
            } else if (!A0D(interfaceC0861Cd)) {
                return -1;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0860Cc
    public final void AEL(long j10, long j11) {
        this.A0I.clear();
        this.A00 = 0;
        this.A06 = -1;
        this.A04 = 0;
        this.A05 = 0;
        if (j10 == 0) {
            A06();
        } else if (this.A0C == null) {
        } else {
            A09(j11);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0860Cc
    public final boolean AEv(InterfaceC0861Cd interfaceC0861Cd) throws IOException, InterruptedException {
        return DM.A04(interfaceC0861Cd);
    }
}
