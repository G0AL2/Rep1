package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class FU {
    public static byte[] A03;
    public static String[] A04 = {"bxXiKI", "1uDei3qzNnKNtNYr8Y2Djp0HGajvtEV5", "mOXymc7srnaPPj6rkYKERyI3NxuvjHfL", "eLJeQSRGsG8qXjpz5HdRmaYCfpHE06ps", "tIHnpnFG5Gy9TDLwgByCKCMlkPhTptnY", "feqrkYPgdz0GJjq4", "3AbGJoGZCQZs42EqNNbBdZ7jf", "CWkuEW"};
    public InterfaceC0860Cc A00;
    public final InterfaceC0862Ce A01;
    public final InterfaceC0860Cc[] A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            byte b10 = (byte) ((copyOfRange[i13] ^ i12) ^ 114);
            String[] strArr = A04;
            if (strArr[1].charAt(6) == strArr[3].charAt(6)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[4] = "mNEvNMISV2TsjErCZLDNSt4mIeKbSMWU";
            strArr2[2] = "pkwADRIgEHU8NI8rqtSVQew0tEayD06s";
            copyOfRange[i13] = b10;
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{94, 87, 20, 24, 2, 27, 19, 87, 5, 18, 22, 19, 87, 3, 31, 18, 87, 4, 3, 5, 18, 22, 26, 89, 65, 96, 97, 106, 47, 96, 105, 47, 123, 103, 106, 47, 110, 121, 110, 102, 99, 110, 109, 99, 106, 47, 106, 119, 123, 125, 110, 108, 123, 96, 125, 124, 47, 39};
    }

    static {
        A01();
    }

    public FU(InterfaceC0860Cc[] interfaceC0860CcArr, InterfaceC0862Ce interfaceC0862Ce) {
        this.A02 = interfaceC0860CcArr;
        this.A01 = interfaceC0862Ce;
    }

    public final InterfaceC0860Cc A02(InterfaceC0861Cd interfaceC0861Cd, Uri uri) throws IOException, InterruptedException {
        InterfaceC0860Cc interfaceC0860Cc = this.A00;
        if (interfaceC0860Cc != null) {
            return interfaceC0860Cc;
        }
        InterfaceC0860Cc[] interfaceC0860CcArr = this.A02;
        int length = interfaceC0860CcArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            InterfaceC0860Cc interfaceC0860Cc2 = interfaceC0860CcArr[i10];
            try {
            } catch (EOFException unused) {
            } catch (Throwable th) {
                interfaceC0861Cd.AEB();
                throw th;
            }
            if (interfaceC0860Cc2.AEv(interfaceC0861Cd)) {
                this.A00 = interfaceC0860Cc2;
                interfaceC0861Cd.AEB();
                break;
            }
            continue;
            interfaceC0861Cd.AEB();
            i10++;
        }
        InterfaceC0860Cc interfaceC0860Cc3 = this.A00;
        if (A04[6].length() != 13) {
            String[] strArr = A04;
            strArr[0] = "fQ5Ua6";
            strArr[7] = "HZXGBz";
            if (interfaceC0860Cc3 != null) {
                interfaceC0860Cc3.A8I(this.A01);
                return this.A00;
            }
            throw new VT(A00(24, 34, 125) + C1020Iz.A0S(this.A02) + A00(0, 24, 5), uri);
        }
        throw new RuntimeException();
    }

    public final void A03() {
        if (this.A00 != null) {
            this.A00 = null;
        }
    }
}
