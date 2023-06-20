package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class W8 implements InterfaceC0879Di {
    public static byte[] A0E;
    public static String[] A0F = {"OaAtDjibDffMS", "aj2yyuicdEn8dhTDbWTrD1WtuleVGPEx", "a3NvGU2CXdpQvxvcysdReyA6yUgKGJjf", "4BBSavRiCGZis8TiCNo6nDJqjRzxnCkr", "3Isw3BGBXoN1VbjlJcagr5xDVNXHwLpI", "HfhncQp7sGaDAl", "zNtUp", "pzzsrx2QpEHePoyNV"};
    public long A00;
    public long A01;
    public InterfaceC0870Co A02;
    public C0883Dm A03;
    public String A04;
    public boolean A05;
    public final C0888Dr A09;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean[] A0D = new boolean[3];
    public final C0885Do A08 = new C0885Do(7, 128);
    public final C0885Do A06 = new C0885Do(8, 128);
    public final C0885Do A07 = new C0885Do(6, 128);
    public final C1004Ij A0A = new C1004Ij();

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0E, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 52);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A0E = new byte[]{37, 58, 55, 54, 60, 124, 50, 37, 48};
    }

    static {
        A01();
    }

    public W8(C0888Dr c0888Dr, boolean z10, boolean z11) {
        this.A09 = c0888Dr;
        this.A0B = z10;
        this.A0C = z11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0175, code lost:
        if (r4.A03() != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0177, code lost:
        r24.A03.A04(com.facebook.ads.redexgen.X.C1000If.A05(r24.A06.A01, 3, r24.A06.A00));
        r24.A06.A00();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x019f, code lost:
        if (r4.A03() != false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A02(long r25, int r27, int r28, long r29) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.W8.A02(long, int, int, long):void");
    }

    private void A03(long j10, int i10, long j11) {
        if (!this.A05 || this.A03.A07()) {
            this.A08.A01(i10);
            this.A06.A01(i10);
        }
        this.A07.A01(i10);
        String[] strArr = A0F;
        if (strArr[4].charAt(8) != strArr[2].charAt(8)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0F;
        strArr2[5] = "7DOfm1dA88ob89";
        strArr2[0] = "yqrgSqZS2XcB9";
        this.A03.A03(j10, i10, j11);
    }

    private void A04(byte[] bArr, int i10, int i11) {
        if (!this.A05 || this.A03.A07()) {
            this.A08.A02(bArr, i10, i11);
            this.A06.A02(bArr, i10, i11);
        }
        this.A07.A02(bArr, i10, i11);
        this.A03.A06(bArr, i10, i11);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0879Di
    public final void A48(C1004Ij c1004Ij) {
        int A06 = c1004Ij.A06();
        int A07 = c1004Ij.A07();
        byte[] bArr = c1004Ij.A00;
        this.A01 += c1004Ij.A04();
        this.A02.AEG(c1004Ij, c1004Ij.A04());
        while (true) {
            int A04 = C1000If.A04(bArr, A06, A07, this.A0D);
            if (A04 == A07) {
                A04(bArr, A06, A07);
                return;
            }
            int A01 = C1000If.A01(bArr, A04);
            int nalUnitOffset = A04 - A06;
            if (nalUnitOffset > 0) {
                A04(bArr, A06, A04);
            }
            int i10 = A07 - A04;
            long j10 = this.A01 - i10;
            int offset = nalUnitOffset < 0 ? -nalUnitOffset : 0;
            A02(j10, i10, offset, this.A00);
            A03(j10, A01, this.A00);
            A06 = A04 + 3;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0879Di
    public final void A4V(InterfaceC0862Ce interfaceC0862Ce, C0893Dw c0893Dw) {
        c0893Dw.A05();
        this.A04 = c0893Dw.A04();
        this.A02 = interfaceC0862Ce.AFD(c0893Dw.A03(), 2);
        this.A03 = new C0883Dm(this.A02, this.A0B, this.A0C);
        this.A09.A03(interfaceC0862Ce, c0893Dw);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0879Di
    public final void AD3() {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0879Di
    public final void AD4(long j10, boolean z10) {
        this.A00 = j10;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0879Di
    public final void AEK() {
        C1000If.A0B(this.A0D);
        this.A08.A00();
        this.A06.A00();
        this.A07.A00();
        this.A03.A01();
        this.A01 = 0L;
    }
}
