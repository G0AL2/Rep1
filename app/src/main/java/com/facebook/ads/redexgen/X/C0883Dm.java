package com.facebook.ads.redexgen.X;

import android.util.SparseArray;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Dm  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0883Dm {
    public static String[] A0I = {"4oBn500ONSa7zUcj69ZejwliI7fNkQe9", "sao3", "S05M", "dUQbnZGK3vs92wXndxl51oc8w6Wzg5UK", "r2dYBwwJ6wCRp20YpqJDniAkemsUTuNE", "fcxFuh", "wirhT", "AIyirGzN48rHG0XGibSi5d9zNx7vdYO1"};
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final InterfaceC0870Co A0E;
    public final boolean A0G;
    public final boolean A0H;
    public final SparseArray<C0999Ie> A0D = new SparseArray<>();
    public final SparseArray<C0998Id> A0C = new SparseArray<>();
    public C0882Dl A06 = new C0882Dl();
    public C0882Dl A07 = new C0882Dl();
    public byte[] A0B = new byte[128];
    public final C1005Ik A0F = new C1005Ik(this.A0B, 0, 0);

    public C0883Dm(InterfaceC0870Co interfaceC0870Co, boolean z10, boolean z11) {
        this.A0E = interfaceC0870Co;
        this.A0G = z10;
        this.A0H = z11;
        A01();
    }

    private void A00(int i10) {
        boolean z10 = this.A0A;
        this.A0E.AEH(this.A05, z10 ? 1 : 0, (int) (this.A02 - this.A04), i10, null);
    }

    public final void A01() {
        this.A08 = false;
        this.A09 = false;
        this.A07.A02();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0014, code lost:
        if (r0 != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A02(long r6, int r8) {
        /*
            r5 = this;
            int r1 = r5.A01
            r3 = 0
            r4 = 1
            r0 = 9
            if (r1 == r0) goto L16
            boolean r0 = r5.A0H
            if (r0 == 0) goto L2e
            com.facebook.ads.redexgen.X.Dl r1 = r5.A07
            com.facebook.ads.redexgen.X.Dl r0 = r5.A06
            boolean r0 = com.facebook.ads.redexgen.X.C0882Dl.A01(r1, r0)
            if (r0 == 0) goto L2e
        L16:
            boolean r0 = r5.A09
            if (r0 == 0) goto L22
            long r0 = r5.A02
            long r6 = r6 - r0
            int r0 = (int) r6
            int r8 = r8 + r0
            r5.A00(r8)
        L22:
            long r0 = r5.A02
            r5.A04 = r0
            long r0 = r5.A03
            r5.A05 = r0
            r5.A0A = r3
            r5.A09 = r4
        L2e:
            boolean r2 = r5.A0A
            int r1 = r5.A01
            r0 = 5
            if (r1 == r0) goto L43
            boolean r0 = r5.A0G
            if (r0 == 0) goto L44
            if (r1 != r4) goto L44
            com.facebook.ads.redexgen.X.Dl r0 = r5.A07
            boolean r0 = r0.A05()
            if (r0 == 0) goto L44
        L43:
            r3 = 1
        L44:
            r2 = r2 | r3
            r5.A0A = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0883Dm.A02(long, int):void");
    }

    public final void A03(long j10, int i10, long j11) {
        this.A01 = i10;
        this.A03 = j11;
        this.A02 = j10;
        if (!this.A0G || this.A01 != 1) {
            if (!this.A0H) {
                return;
            }
            int i11 = this.A01;
            if (i11 != 5 && i11 != 1 && i11 != 2) {
                return;
            }
        }
        C0882Dl c0882Dl = this.A06;
        this.A06 = this.A07;
        this.A07 = c0882Dl;
        this.A07.A02();
        this.A00 = 0;
        this.A08 = true;
    }

    public final void A04(C0998Id c0998Id) {
        this.A0C.append(c0998Id.A00, c0998Id);
    }

    public final void A05(C0999Ie c0999Ie) {
        this.A0D.append(c0999Ie.A05, c0999Ie);
    }

    public final void A06(byte[] bArr, int readLength, int i10) {
        if (!this.A08) {
            return;
        }
        int i11 = i10 - readLength;
        byte[] bArr2 = this.A0B;
        int length = bArr2.length;
        int i12 = this.A00;
        if (length < i12 + i11) {
            this.A0B = Arrays.copyOf(bArr2, (i12 + i11) * 2);
        }
        System.arraycopy(bArr, readLength, this.A0B, this.A00, i11);
        this.A00 += i11;
        this.A0F.A08(this.A0B, 0, this.A00);
        if (!this.A0F.A0B(8)) {
            return;
        }
        this.A0F.A06();
        int deltaPicOrderCnt1 = this.A0F.A05(2);
        this.A0F.A07(5);
        if (!this.A0F.A09()) {
            return;
        }
        this.A0F.A04();
        if (!this.A0F.A09()) {
            return;
        }
        int A04 = this.A0F.A04();
        if (!this.A0H) {
            this.A08 = false;
            this.A07.A03(A04);
        } else if (!this.A0F.A09()) {
        } else {
            int A042 = this.A0F.A04();
            String[] strArr = A0I;
            if (strArr[0].charAt(5) == strArr[3].charAt(5)) {
                throw new RuntimeException();
            }
            A0I[6] = "2v7XO";
            int picParameterSetId = this.A0C.indexOfKey(A042);
            if (picParameterSetId < 0) {
                this.A08 = false;
                return;
            }
            C0998Id ppsData = this.A0C.get(A042);
            C0999Ie c0999Ie = this.A0D.get(ppsData.A01);
            if (c0999Ie.A09) {
                if (!this.A0F.A0B(2)) {
                    return;
                }
                this.A0F.A07(2);
            }
            if (!this.A0F.A0B(c0999Ie.A01)) {
                return;
            }
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            int A05 = this.A0F.A05(c0999Ie.A01);
            boolean bottomFieldFlagPresent = c0999Ie.A08;
            if (!bottomFieldFlagPresent) {
                boolean bottomFieldFlagPresent2 = this.A0F.A0B(1);
                if (!bottomFieldFlagPresent2) {
                    return;
                }
                z10 = this.A0F.A0A();
                if (z10) {
                    boolean bottomFieldFlagPresent3 = this.A0F.A0B(1);
                    if (!bottomFieldFlagPresent3) {
                        return;
                    }
                    z12 = this.A0F.A0A();
                    z11 = true;
                    String[] strArr2 = A0I;
                    if (strArr2[2].length() == strArr2[1].length()) {
                        A0I[4] = "qwcYbvbtciQlsge07t8jnpQbFFEGYRzL";
                    }
                }
            }
            boolean z13 = this.A01 == 5;
            int i13 = 0;
            if (z13) {
                if (!this.A0F.A09()) {
                    return;
                }
                i13 = this.A0F.A04();
            }
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            int i17 = 0;
            int picOrderCntLsb = c0999Ie.A04;
            if (picOrderCntLsb == 0) {
                C1005Ik c1005Ik = this.A0F;
                int deltaPicOrderCnt12 = c0999Ie.A03;
                if (!c1005Ik.A0B(deltaPicOrderCnt12)) {
                    return;
                }
                C1005Ik c1005Ik2 = this.A0F;
                int deltaPicOrderCnt13 = c0999Ie.A03;
                i14 = c1005Ik2.A05(deltaPicOrderCnt13);
                if (ppsData.A02 && !z10) {
                    if (!this.A0F.A09()) {
                        return;
                    }
                    C1005Ik c1005Ik3 = this.A0F;
                    int deltaPicOrderCnt14 = A0I[6].length();
                    if (deltaPicOrderCnt14 != 5) {
                        throw new RuntimeException();
                    }
                    A0I[5] = "uaxcZmcWt6bm8g2eSL";
                    i15 = c1005Ik3.A03();
                }
            } else {
                int picOrderCntLsb2 = c0999Ie.A04;
                if (picOrderCntLsb2 == 1 && !c0999Ie.A07) {
                    if (!this.A0F.A09()) {
                        return;
                    }
                    i16 = this.A0F.A03();
                    if (ppsData.A02 && !z10) {
                        if (!this.A0F.A09()) {
                            return;
                        }
                        i17 = this.A0F.A03();
                    }
                }
            }
            this.A07.A04(c0999Ie, deltaPicOrderCnt1, A04, A05, A042, z10, z11, z12, z13, i13, i14, i15, i16, i17);
            this.A08 = false;
        }
    }

    public final boolean A07() {
        return this.A0H;
    }
}
