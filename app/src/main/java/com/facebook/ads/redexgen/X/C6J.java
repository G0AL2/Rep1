package com.facebook.ads.redexgen.X;

import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.6J  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public enum C6J {
    A09(A00(DownloadResource.STATUS_INSUFFICIENT_SPACE_ERROR, 12, 44)),
    A04(A00(119, 14, 97)),
    A07(A00(165, 14, 116)),
    A08(A00(179, 19, 18)),
    A03(A00(105, 14, 30)),
    A05(A00(133, 19, 96)),
    A06(A00(152, 13, 74));
    
    public static byte[] A01;
    public final String A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 44);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{34, 46, 47, 39, 40, 38, 62, 49, 32, 51, 50, 40, 47, 38, 101, 118, 101, 110, 116, Byte.MAX_VALUE, 111, 99, 99, 117, 114, 114, 101, 100, 109, 106, 114, 101, 104, 109, 96, 123, 102, 96, 123, 118, 97, 119, 116, 107, 106, 119, 97, 78, 73, 82, 72, 85, 81, 89, 67, 89, 78, 78, 83, 78, 21, 3, 21, 21, 15, 9, 8, 25, 10, 9, 1, 1, 3, 2, 95, 69, 75, 66, 77, 64, 83, 79, 67, 66, 95, 88, 94, 89, 79, 88, 69, 67, 66, 100, 121, 125, 117, 98, 111, 115, 113, 124, 124, 117, 116, 81, 93, 92, 84, 91, 85, 109, 66, 83, 64, 65, 91, 92, 85, 40, 59, 40, 35, 57, 18, 34, 46, 46, 56, 63, 63, 40, 41, 37, 34, 58, 45, 32, 37, 40, 19, 46, 40, 19, 62, 41, 63, 60, 35, 34, 63, 41, 20, 19, 8, 18, 15, 11, 3, 57, 3, 20, 20, 9, 20, 43, 61, 43, 43, 49, 55, 54, 7, 52, 55, 63, 63, 61, 60, 77, 87, 89, 80, 95, 82, 97, 93, 81, 80, 77, 74, 76, 75, 93, 74, 87, 81, 80, 116, 105, 109, 101, 114, 95, 99, 97, 108, 108, 101, 100};
    }

    static {
        A01();
    }

    C6J(String str) {
        this.A00 = str;
    }

    public final String A02() {
        return this.A00;
    }
}
