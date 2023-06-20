package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.cz  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1634cz extends L8 {
    public static byte[] A05;
    public static String[] A06 = {"Gpv8eHHTEOtePQmo1OD6muRo415gTvmp", "m8VLVbL9uinkegCEMoYL3DBV4Qd", "9DesmfPYImwpHbFMCkN8D4N2A0eEtTnA", "p6qK7niiHhY9MGJ6cPP69YBKuDETC8Y4", "5iURk91XNbuPvrJWt8OL2zSUhjl2Moa0", "44pBDqZwGccZEwpE1ClPCXXxeIB", "3LUdHIp1lrC6CN8jsqyi77AXm4NZ0z", "iLxtTrJV"};
    public final /* synthetic */ long A00;
    public final /* synthetic */ C1670da A01;
    public final /* synthetic */ C06071q A02;
    public final /* synthetic */ FO A03;
    public final /* synthetic */ C9F A04;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A06;
            if (strArr[1].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            A06[2] = "zvIoaGxek6NRisBEUIKkM8UdU9N5bmYn";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 50);
            i13++;
        }
    }

    public static void A02() {
        A05 = new byte[]{33, 61, 19, 54, 51, 34, 38, 55, 32, 114, 38, 59, 63, 55, 61, 39, 38, 124, 90, 77, 77, 80, 77, 36, 58, 46, 119, 106, 110, 102, 108, 118, 119};
        if (A06[4].charAt(21) == 'x') {
            throw new RuntimeException();
        }
        A06[2] = "OuAVUMSSWbttlxL4z5HkeS5T535dgvDy";
    }

    static {
        A02();
    }

    public C1634cz(FO fo, C06071q c06071q, C1670da c1670da, long j10, C9F c9f) {
        this.A03 = fo;
        this.A02 = c06071q;
        this.A01 = c1670da;
        this.A00 = j10;
        this.A04 = c9f;
    }

    @Override // com.facebook.ads.redexgen.X.L8
    public final void A06() {
        Map A01;
        this.A03.A0N(this.A02);
        this.A03.A0K(this.A01);
        A01 = this.A03.A01(this.A00);
        A01.put(A00(18, 5, 13), A00(0, 2, 62));
        A01.put(A00(23, 3, 123), A00(26, 7, 49));
        this.A03.A05(this.A04.A03(C9J.A05), A01);
        this.A03.AAi(new KH(AdErrorType.NETWORK_ERROR, A00(2, 16, 96)));
    }
}
