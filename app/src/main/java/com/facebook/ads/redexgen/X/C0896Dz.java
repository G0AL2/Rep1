package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Dz  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0896Dz {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 48);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{10, 76, 69, 88, 10, 94, 83, 90, 79, 10, 66, 89, 30, 22, 13, 67, 89, 84, Byte.MAX_VALUE, 98, 121, 124, 55, 126, 100, 55, 99, 120, 120, 55, 123, 118, 101, 112, 114, 55, 63, 105, 37, 80, 85, 60, 62, 55, 99, 120, 55, 100, 124, 126, 103, 44, 55, 126, 115, 45, 55, 84, 105, 97, 116, 114, 101, 116, 117, 49, 115, 125, 126, 114, 122, 49, 112, 125, 120, 118, Byte.MAX_VALUE, 124, 116, Byte.MAX_VALUE, 101, 43, 49, 92, 114, 123, 122, 103, 124, 123, 114, 53, 96, 123, 126, 123, 122, 98, 123, 53, 66, 84, 67, 53, 118, 125, 96, 123, 126, 47, 53, 108, 119, 120, 120, 119, 76, 81, 87, 82, 82, 77, 80, 86, 71, 70, 2, 112, 107, 100, 100, 2, 68, 77, 80, 79, 67, 86, 24, 2, 109, 86, 75, 77, 72, 72, 87, 74, 76, 93, 92, 24, 111, 121, 110, 24, 90, 81, 76, 24, 92, 93, 72, 76, 80, 24, 106, 81, 76, 74, 79, 79, 80, 77, 75, 90, 91, 31, 104, 126, 105, 31, 89, 80, 77, 82, 94, 75, 31, 75, 70, 79, 90, 5, 31, 5, 19, 4, 23, 24, 46, 57, 7, 42, 46, 43, 42, 61, 29, 42, 46, 43, 42, 61, 102, 99, 118, 99, 19, 24, 1, 85};
    }

    /* JADX WARN: Incorrect condition in loop: B:11:0x007a */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.ads.redexgen.X.C1342Vs A00(com.facebook.ads.redexgen.X.InterfaceC0861Cd r19) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 349
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0896Dz.A00(com.facebook.ads.redexgen.X.Cd):com.facebook.ads.redexgen.X.Vs");
    }

    public static void A03(InterfaceC0861Cd interfaceC0861Cd, C1342Vs c1342Vs) throws IOException, InterruptedException {
        IK.A01(interfaceC0861Cd);
        IK.A01(c1342Vs);
        interfaceC0861Cd.AEB();
        C1004Ij c1004Ij = new C1004Ij(8);
        C0895Dy A002 = C0895Dy.A00(interfaceC0861Cd, c1004Ij);
        while (A002.A00 != C1020Iz.A08(A01(214, 4, 50))) {
            Log.w(A01(DownloadResource.STATUS_DEVICE_NOT_FOUND_ERROR, 15, 127), A01(83, 28, 37) + A002.A00);
            long bytesToSkip = A002.A01 + 8;
            if (A002.A00 == C1020Iz.A08(A01(111, 4, 14))) {
                bytesToSkip = 12;
            }
            if (bytesToSkip <= 2147483647L) {
                interfaceC0861Cd.AEt((int) bytesToSkip);
                A002 = C0895Dy.A00(interfaceC0861Cd, c1004Ij);
            } else {
                throw new C0813Af(A01(17, 40, 39) + A002.A00);
            }
        }
        interfaceC0861Cd.AEt(8);
        c1342Vs.A06(interfaceC0861Cd.A7F(), A002.A01);
    }
}
