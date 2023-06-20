package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Gs  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0963Gs {
    public static String[] A09 = {"dgnk6daQ0T87wOoHtyty7iRYaKvd8BzP", "TK3sWG", "r0T7HSyuXxeUz69yLbXIR4BhIiF2UDCf", "E94UIter8sht222SneNEBcgvWBNv8GHv", "qg4jsBrtjCwX7ZbqQAPOhxC1noKxQthL", "J", "sUrKaEkRL4ABh9brwle2ScDHOfoRuahW", "YVc6k2"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public boolean A06;
    public final C1004Ij A07 = new C1004Ij();
    public final int[] A08 = new int[256];

    /* JADX INFO: Access modifiers changed from: private */
    public void A03(C1004Ij c1004Ij, int i10) {
        int A0G;
        if (i10 < 4) {
            return;
        }
        c1004Ij.A0Z(3);
        int i11 = i10 - 4;
        if ((c1004Ij.A0E() & 128) != 0) {
            if (i11 < 7 || (A0G = c1004Ij.A0G()) < 4) {
                return;
            }
            this.A01 = c1004Ij.A0I();
            this.A00 = c1004Ij.A0I();
            this.A07.A0W(A0G - 4);
            i11 -= 7;
        }
        int A06 = this.A07.A06();
        int A07 = this.A07.A07();
        if (A06 < A07 && i11 > 0) {
            int bytesToRead = Math.min(i11, A07 - A06);
            c1004Ij.A0c(this.A07.A00, A06, bytesToRead);
            this.A07.A0Y(A06 + bytesToRead);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04(C1004Ij c1004Ij, int i10) {
        if (i10 < 19) {
            return;
        }
        this.A05 = c1004Ij.A0I();
        this.A04 = c1004Ij.A0I();
        c1004Ij.A0Z(11);
        this.A02 = c1004Ij.A0I();
        this.A03 = c1004Ij.A0I();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05(C1004Ij c1004Ij, int i10) {
        if (i10 % 5 != 2) {
            return;
        }
        c1004Ij.A0Z(2);
        Arrays.fill(this.A08, 0);
        int i11 = i10 / 5;
        for (int r10 = 0; r10 < i11; r10++) {
            int A0E = c1004Ij.A0E();
            int A0E2 = c1004Ij.A0E();
            int A0E3 = c1004Ij.A0E();
            int A0E4 = c1004Ij.A0E();
            int entryCount = c1004Ij.A0E();
            int cb2 = A0E4 - 128;
            double d10 = A0E2 - (cb2 * 0.34414d);
            int i12 = A0E3 - 128;
            int i13 = (int) (d10 - (i12 * 0.71414d));
            int i14 = A0E4 - 128;
            int[] iArr = this.A08;
            int i15 = C1020Iz.A06((int) (A0E2 + ((A0E3 - 128) * 1.402d)), 0, 255);
            int i16 = (entryCount << 24) | (i15 << 16);
            int i17 = C1020Iz.A06(i13, 0, 255);
            iArr[A0E] = i16 | (i17 << 8) | C1020Iz.A06((int) (A0E2 + (i14 * 1.772d)), 0, 255);
        }
        this.A06 = true;
    }

    /* JADX WARN: Incorrect condition in loop: B:20:0x003b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.facebook.ads.redexgen.X.GX A06() {
        /*
            Method dump skipped, instructions count: 206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0963Gs.A06():com.facebook.ads.redexgen.X.GX");
    }

    public final void A07() {
        this.A05 = 0;
        this.A04 = 0;
        this.A02 = 0;
        this.A03 = 0;
        this.A01 = 0;
        this.A00 = 0;
        this.A07.A0W(0);
        this.A06 = false;
    }
}
