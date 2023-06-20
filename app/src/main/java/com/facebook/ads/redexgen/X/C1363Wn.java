package com.facebook.ads.redexgen.X;

import android.util.Pair;
import com.facebook.ads.internal.exoplayer2.Format;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: com.facebook.ads.redexgen.X.Wn  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1363Wn extends Cq {
    public static byte[] A03;
    public static String[] A04 = {"Es", "iHC9pRtfoWLcycijntiJYXN2", "TuGPNLSlit", "098OJ58R6u", "VNifGSmWt2UpuuC8pFHITdWilQmWPSdD", "nPBEvfeprzzMECJ3xuyevnTK", "FVZwpUplP67oS0xaMKq2ljUJ3jrVNcvU", "q6VKpvb2t6NLzvXLeBGroGgfRiC5SSnv"};
    public static final int[] A05;
    public int A00;
    public boolean A01;
    public boolean A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 15);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{77, 121, 104, 101, 99, 44, 106, 99, 126, 97, 109, 120, 44, 98, 99, 120, 44, Byte.MAX_VALUE, 121, 124, 124, 99, 126, 120, 105, 104, 54, 44, 99, 119, 102, 107, 109, 45, 101, 53, 51, 51, 47, 99, 110, 99, 117, 16, 4, 21, 24, 30, 94, 22, 70, 64, 64, 92, 28, 29, 16, 6, 49, 37, 52, 57, 63, Byte.MAX_VALUE, 61, 32, 100, 49, 125, 60, 49, 36, 61, 38, 50, 35, 46, 40, 104, 42, 55, 34, 32};
    }

    static {
        A01();
        A05 = new int[]{5512, 11025, 22050, 44100};
    }

    public C1363Wn(InterfaceC0870Co interfaceC0870Co) {
        super(interfaceC0870Co);
    }

    @Override // com.facebook.ads.redexgen.X.Cq
    public final void A0B(C1004Ij c1004Ij, long j10) throws C0813Af {
        if (this.A00 == 2) {
            int A042 = c1004Ij.A04();
            super.A00.AEG(c1004Ij, A042);
            super.A00.AEH(j10, 1, A042, 0, null);
            return;
        }
        int A0E = c1004Ij.A0E();
        if (A0E == 0) {
            boolean z10 = this.A01;
            String[] strArr = A04;
            if (strArr[7].charAt(9) != strArr[6].charAt(9)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[2] = "UGwyap6YoK";
            strArr2[3] = "84lnx1SX4s";
            if (!z10) {
                byte[] bArr = new byte[c1004Ij.A04()];
                c1004Ij.A0c(bArr, 0, bArr.length);
                Pair<Integer, Integer> A032 = IO.A03(bArr);
                Format format = Format.A07(null, A00(58, 15, 95), null, -1, -1, ((Integer) A032.second).intValue(), ((Integer) A032.first).intValue(), Collections.singletonList(bArr), null, 0, null);
                super.A00.A5V(format);
                this.A01 = true;
                return;
            }
        }
        if (this.A00 == 10 && A0E != 1) {
            return;
        }
        int A043 = c1004Ij.A04();
        super.A00.AEG(c1004Ij, A043);
        super.A00.AEH(j10, 1, A043, 0, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0077, code lost:
        if (r7 == 8) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b7, code lost:
        if (r7 == 8) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bc, code lost:
        if (r7 != 10) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00dd, code lost:
        throw new com.facebook.ads.redexgen.X.C1359Wj(A00(0, 28, 3) + r16.A00);
     */
    @Override // com.facebook.ads.redexgen.X.Cq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A0C(com.facebook.ads.redexgen.X.C1004Ij r17) throws com.facebook.ads.redexgen.X.C1359Wj {
        /*
            Method dump skipped, instructions count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1363Wn.A0C(com.facebook.ads.redexgen.X.Ij):boolean");
    }
}
