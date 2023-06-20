package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.3o  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C06553o {
    public static byte[] A04;
    public static String[] A05 = {"QuaalhDpDah20LX2wxgS6m2LJMNg0MsY", "Kv65PDKGzQbP8opzJD3T0Bs4qFkMuEvW", "yAGu2U2W7yMlSo0lcdd0QNLvUGBJ2w5m", "aJo4Pz0hsbQrFibFt4ypJbnLPuINPYvA", "18JvwLOKolmi3RAuIpcsWcjyGiEhXJWG", "AlJwV0uWjEUfV5LlQyKVHG51mucaZZJu", "um2uWSM0iR5xPcbZFnmwGsQ9sHGc90", "QpR6AGAR"};
    public int A00;
    public int A01;
    public int A02;
    public Object A03;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 115);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{-77, -9, -63, -34, 37, -20, -62, -62, -35, -4, 18, 21, 21, 20, -21, 82, 91, 4, -1, 85, 80};
    }

    static {
        A02();
    }

    public C06553o(int i10, int i11, int i12, Object obj) {
        this.A00 = i10;
        this.A02 = i11;
        this.A01 = i12;
        this.A03 = obj;
    }

    private final String A00() {
        int i10 = this.A00;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 4) {
                    if (i10 != 8) {
                        String[] strArr = A05;
                        if (strArr[4].charAt(8) != strArr[0].charAt(8)) {
                            A05[1] = "xbTSMp8fvBEENljIQe5QRmpFAlAe0spq";
                            return A01(6, 2, 16);
                        }
                        throw new RuntimeException();
                    }
                    return A01(15, 2, 114);
                }
                return A01(19, 2, 109);
            }
            return A01(17, 2, 31);
        }
        return A01(10, 3, 62);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C06553o c06553o = (C06553o) obj;
        int i10 = this.A00;
        if (i10 != c06553o.A00) {
            return false;
        }
        if (i10 == 8 && Math.abs(this.A01 - this.A02) == 1 && this.A01 == c06553o.A02 && this.A02 == c06553o.A01) {
            return true;
        }
        if (this.A01 != c06553o.A01 || this.A02 != c06553o.A02) {
            return false;
        }
        Object obj2 = this.A03;
        if (obj2 != null) {
            if (!obj2.equals(c06553o.A03)) {
                return false;
            }
        } else {
            Object obj3 = c06553o.A03;
            if (A05[2].charAt(7) == 'q') {
                throw new RuntimeException();
            }
            A05[6] = "4VD3xUS92qaUHk8jcTCUJI3HU1kIkp";
            if (obj3 != null) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int result = this.A01;
        return (((this.A00 * 31) + this.A02) * 31) + result;
    }

    public final String toString() {
        return Integer.toHexString(System.identityHashCode(this)) + A01(8, 1, 15) + A00() + A01(3, 3, 63) + this.A02 + A01(13, 2, 62) + this.A01 + A01(0, 3, 20) + this.A03 + A01(9, 1, 44);
    }
}
