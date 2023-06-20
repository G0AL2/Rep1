package com.facebook.ads.redexgen.X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.aO  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1478aO implements InterfaceC07386v {
    public static byte[] A01;
    public static String[] A02 = {"ksa9uXkx89dXxbCURV7PiRCel6d7bK9j", "eXuTZs6W3v0JJtnWIbv2wG4QRruqx6j8", "WGgalorghCXwLSZ9oN", "BSejCupF6vxF", "vAQOCQWHxXMHYUUvXYDH6ypyDqGR6HRf", "iKQXn2EsxsEQ3pyGOtesmJGftglzEEjH", "dCL4N6ovXvI3jfuXevzoM7RKt4XsOwpl", "Cl5pJnrztL7k"};
    public final /* synthetic */ C1467aD A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            int i14 = copyOfRange[i13] - i12;
            if (A02[4].charAt(5) == 'u') {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[3] = "eya4WcuMkKlP";
            strArr[7] = "iVKlWYkTLkVv";
            copyOfRange[i13] = (byte) (i14 - 61);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-56, -63, -66, -58, -77, -71, -73};
    }

    static {
        A01();
    }

    public C1478aO(C1467aD c1467aD) {
        this.A00 = c1467aD;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07386v
    public final C7A A5J() {
        return this.A00.A0A(A00(0, 7, 21), RecyclerView.UNDEFINED_DURATION);
    }
}
