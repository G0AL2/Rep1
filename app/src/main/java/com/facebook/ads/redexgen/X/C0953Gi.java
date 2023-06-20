package com.facebook.ads.redexgen.X;

import android.util.Log;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Gi  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0953Gi {
    public static byte[] A00;
    public static String[] A01 = {"ijZd2SvY", "Ph5fJqf6OowbUT2cqzgcB298kDhnW2OX", "wB5WDB4JU6krUWdN", "eBmlwoifn7sQacvwvpCdDN7mM49lFTV9", "8TaUd8AxspPDe4hMAHd3njvqxnnZalZZ", "my8xvAbSAhbAvtjE", "sCujs14tvAISPjVlxjJqhwIZMpV4htIn", "ZuHVfppKLGIB3c7uxsgIg35bH7izaigq"};
    public static final int A02;
    public static final int A03;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 12);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-52, -18, -22, -34, -3, -14, -11, 113, -127, 116, 94, -71, -77, -85, -90, -99, -75, -77, -70, -70, -77, -72, -79, 106, -68, -81, -73, -85, -77, -72, -82, -81, -68, 106, -71, -80, 106, -73, -85, -74, -80, -71, -68, -73, -81, -82, 106, -99, -113, -109, 106, -104, -117, -106, 106, -65, -72, -77, -66, 120};
    }

    static {
        A02();
        A03 = C1020Iz.A08(A01(11, 4, 102));
        A02 = C1020Iz.A08(A01(7, 4, 33));
    }

    public static int A00(C1004Ij c1004Ij) {
        int b10 = 0;
        while (c1004Ij.A04() != 0) {
            int A0E = c1004Ij.A0E();
            String[] strArr = A01;
            if (strArr[2].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[2] = "2iVFcVRayhlXICIL";
            strArr2[5] = "cB88SmkuRLYvydLN";
            b10 += A0E;
            if (A0E != 255) {
                return b10;
            }
        }
        return -1;
    }

    public static void A03(long j10, C1004Ij c1004Ij, InterfaceC0870Co[] interfaceC0870CoArr) {
        int countryCode;
        while (c1004Ij.A04() > 1) {
            int A002 = A00(c1004Ij);
            int A003 = A00(c1004Ij);
            int A06 = c1004Ij.A06() + A003;
            if (A003 == -1 || A003 > c1004Ij.A04()) {
                Log.w(A01(0, 7, 125), A01(15, 45, 62));
                A06 = c1004Ij.A07();
            } else if (A002 == 4 && A003 >= 8) {
                int A0E = c1004Ij.A0E();
                int A0I = c1004Ij.A0I();
                int i10 = 0;
                if (A0I == 49) {
                    i10 = c1004Ij.A08();
                }
                int A0E2 = c1004Ij.A0E();
                if (A0I == 47) {
                    c1004Ij.A0Z(1);
                }
                int ccCount = (A0E == 181 && (A0I == 49 || A0I == 47) && A0E2 == 3) ? 1 : 0;
                if (A0I == 49) {
                    int countryCode2 = A03;
                    if (i10 != countryCode2) {
                        int countryCode3 = A02;
                        if (i10 != countryCode3) {
                            countryCode = 0;
                            ccCount &= countryCode;
                        }
                    }
                    countryCode = 1;
                    ccCount &= countryCode;
                }
                if (ccCount != 0) {
                    int countryCode4 = c1004Ij.A0E();
                    c1004Ij.A0Z(1);
                    int i11 = (countryCode4 & 31) * 3;
                    int ccCount2 = c1004Ij.A06();
                    for (InterfaceC0870Co interfaceC0870Co : interfaceC0870CoArr) {
                        c1004Ij.A0Y(ccCount2);
                        interfaceC0870Co.AEG(c1004Ij, i11);
                        interfaceC0870Co.AEH(j10, 1, i11, 0, null);
                    }
                }
            }
            c1004Ij.A0Y(A06);
        }
    }
}
