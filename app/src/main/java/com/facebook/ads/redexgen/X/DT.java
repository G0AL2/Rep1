package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class DT {
    public static String[] A05 = {"YmqCfQGeJdZscNiSsRHgK8Xqwc4qCDQV", "BEVC1cuwi5mxHrGOZ29iGldY3rFRULVC", "DSPc42zLHxXdWx97yn92wynUTyNm", "qbq", "Vn6wbfa2hXyYQug1oukzP6oQFgTa", "a4c", "hss", "EwoauNNUoRbyLKR"};
    public int A01;
    public boolean A02;
    public final DU A03 = new DU();
    public final C1004Ij A04 = new C1004Ij(new byte[65025], 0);
    public int A00 = -1;

    private int A00(int i10) {
        this.A01 = 0;
        int i11 = 0;
        while (this.A01 + i10 < this.A03.A02) {
            int[] iArr = this.A03.A09;
            int i12 = this.A01;
            this.A01 = i12 + 1;
            int i13 = iArr[i12 + i10];
            i11 += i13;
            if (i13 != 255) {
                break;
            }
        }
        return i11;
    }

    public final DU A01() {
        return this.A03;
    }

    public final C1004Ij A02() {
        return this.A04;
    }

    public final void A03() {
        this.A03.A02();
        this.A04.A0V();
        this.A00 = -1;
        this.A02 = false;
    }

    public final void A04() {
        if (this.A04.A00.length == 65025) {
            return;
        }
        C1004Ij c1004Ij = this.A04;
        c1004Ij.A00 = Arrays.copyOf(c1004Ij.A00, Math.max(65025, this.A04.A07()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c8, code lost:
        if (r7.A03.A09[r3 - 1] != 5) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ca, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ee, code lost:
        if (r7.A03.A09[r3 - 1] != 255) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f1, code lost:
        r0 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A05(com.facebook.ads.redexgen.X.InterfaceC0861Cd r8) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.DT.A05(com.facebook.ads.redexgen.X.Cd):boolean");
    }
}
