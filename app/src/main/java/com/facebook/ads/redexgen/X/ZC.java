package com.facebook.ads.redexgen.X;

import android.content.pm.ServiceInfo;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class ZC implements InterfaceC07386v {
    public static byte[] A01;
    public static String[] A02 = {"Wdahz1Wjl3dMmMcpJsybmGRAeciA4tMI", "owhKI", "oRwt0jb9EEblUBuGQWVNL6ozc0Rzi0vw", "l56im1aaEdwcDHM5hLD8b", "Eu2PxKSDFU9lAkWHn67wF6yqVh6mLTIL", "0Vvrgp6tuvzAmenwYfecbhGxQfkK1YW3", "HQi", "vUie1Te"};
    public final /* synthetic */ C1423Yv A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 30);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{18, 121, 120, 106, 1, 20};
    }

    static {
        A01();
    }

    public ZC(C1423Yv c1423Yv) {
        this.A00 = c1423Yv;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07386v
    public final C7A A5J() throws UnsupportedEncodingException, NoSuchAlgorithmException {
        ServiceInfo[] serviceInfoArr;
        ServiceInfo[] serviceInfoArr2;
        ServiceInfo[] serviceInfoArr3;
        ServiceInfo[] serviceInfoArr4;
        serviceInfoArr = this.A00.A05;
        if (serviceInfoArr != null) {
            StringBuilder sb2 = new StringBuilder();
            int i10 = 0;
            while (true) {
                serviceInfoArr2 = this.A00.A05;
                int i11 = serviceInfoArr2.length;
                if (i10 < i11) {
                    serviceInfoArr3 = this.A00.A05;
                    sb2.append(serviceInfoArr3[i10].name);
                    serviceInfoArr4 = this.A00.A05;
                    int i12 = serviceInfoArr4.length;
                    if (i10 != i12 - 1) {
                        sb2.append(A00(0, 1, 6));
                    }
                    i10++;
                } else {
                    C7A signalValueTypeDef = this.A00.A08(C7J.A08(sb2.toString().getBytes(A00(1, 5, 50)), C7I.A06));
                    return signalValueTypeDef;
                }
            }
        } else {
            C7A A07 = this.A00.A07(AnonymousClass76.A07);
            String[] strArr = A02;
            if (strArr[5].charAt(15) != strArr[0].charAt(15)) {
                String[] strArr2 = A02;
                strArr2[2] = "PIV5HCfMNdAm4GWeouxefmFP0XOPfsYa";
                strArr2[4] = "Fq26Ssz9KPDLteFZDGni0zECOafhdUl8";
                return A07;
            }
            throw new RuntimeException();
        }
    }
}
