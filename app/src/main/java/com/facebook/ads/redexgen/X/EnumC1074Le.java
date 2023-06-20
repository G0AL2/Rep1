package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import org.json.JSONArray;

/* renamed from: com.facebook.ads.redexgen.X.Le  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC1074Le {
    A06(0),
    A0F(1),
    A07(2),
    A0G(3),
    A08(4),
    A05(5),
    A0D(6),
    A0E(7),
    A0J(8),
    A0C(9),
    A09(10),
    A0H(11),
    A0I(16),
    A0B(17),
    A0A(18);
    
    public static byte[] A01;
    public static final EnumC1074Le[] A02;
    public static final String A03;
    public final int A00;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 14);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A01 = new byte[]{-77, -74, -47, -75, -70, -63, -69, -75, -73, -59, -115, -100, -100, -85, -115, -112, 98, 113, 113, Byte.MIN_VALUE, 98, 101, Byte.MIN_VALUE, 119, 83, -120, -105, -105, -90, -116, -107, -114, -120, -114, -116, -108, -116, -107, -101, -90, -120, -117, 112, 111, 124, 124, 115, Byte.MIN_VALUE, -115, -126, 125, -115, 119, 124, -126, 115, Byte.MIN_VALUE, -127, -126, 119, -126, 119, 111, 122, -68, -56, -69, -57, -53, -69, -60, -71, -49, -43, -71, -73, -58, -58, -65, -60, -67, 100, 112, 112, 108, 123, 104, 101, 106, 103, 111, 104, 109, 107, 104, 109, 100, 126, 117, 104, 99, 100, 110, 126, 96, 99, -73, -64, -52, -63, -65, -74, -76, -76, -78, -65, -122, -113, -101, -112, -114, -123, -125, -125, -127, -114, -101, -118, -117, -101, 125, -111, -112, -117, -101, -123, -119, -116, -101, -120, -117, -125, -125, -123, -118, -125, -110, -113, -108, -111, -91, -121, -118, -43, -46, -41, -44, -24, -54, -51, -24, -33, -69, -47, -60, -41, -52, -39, -56, -30, -58, -49, -46, -42, -56, -30, -59, -40, -41, -41, -46, -47, -72, -79, -84, -87, -84, -88, -89, -62, -81, -78, -86, -86, -84, -79, -86, -123, 120, 115, 116, 126, -114, 112, 115};
    }

    static {
        A03();
        A02 = new EnumC1074Le[]{A0G, A08, A05, A0E, A0H, A0I, A0B, A0A};
        JSONArray jSONArray = new JSONArray();
        for (EnumC1074Le enumC1074Le : A02) {
            jSONArray.put(enumC1074Le.A00());
        }
        A03 = jSONArray.toString();
    }

    EnumC1074Le(int i10) {
        this.A00 = i10;
    }

    private final int A00() {
        return this.A00;
    }

    public static String A01() {
        return A03;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return String.valueOf(this.A00);
    }
}
