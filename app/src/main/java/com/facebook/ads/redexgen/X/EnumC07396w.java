package com.facebook.ads.redexgen.X;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.6w  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC07396w {
    A04(0),
    A07(IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES),
    A05(2048),
    A06(4096);
    
    public static byte[] A01;
    public static final Map<Integer, EnumC07396w> A02;
    public int A00;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 24);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-104, -101, -92, -97, -99, -92, -75, -97, -99, -92, -91, -88, -101, 120, 105, 122, 105, 118, 119, 113, 108, Byte.MAX_VALUE, 110, 123, 113, 124, 122, -116, Byte.MIN_VALUE, 110, 122, 125, 121, 114, -91, -89, -91, -94, -101, -107, -101, -95, -89, -91};
    }

    static {
        EnumC07396w[] values;
        A02();
        A02 = new HashMap();
        for (EnumC07396w enumC07396w : values()) {
            A02.put(Integer.valueOf(enumC07396w.A00), enumC07396w);
        }
    }

    EnumC07396w(int i10) {
        this.A00 = i10;
    }

    public static EnumC07396w A00(int i10) {
        EnumC07396w enumC07396w = A02.get(Integer.valueOf(i10));
        return enumC07396w == null ? A04 : enumC07396w;
    }

    public final int A03() {
        return this.A00;
    }
}
