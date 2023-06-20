package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.dr  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1686dr<T> implements C0X<T> {
    public static byte[] A01;
    public static String[] A02 = {"MK0lJZb1G2RRFZEaFDTiwbPmIpRtYmde", "mY0WYGn7", "KMPGaiIzki7l9AH4HVkge6", "m9KV7hMB", "q4luaSiM5kuOIYzPzCoa1lP4AmyDrsGF", "uYbWOwnO0fDov", "", "4k"};
    public final String A00;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            int i14 = (copyOfRange[i13] - i12) - 99;
            if (A02[0].charAt(9) != '2') {
                throw new RuntimeException();
            }
            A02[4] = "xalbLzqPtLNAZMxuuBcoxRjt1J2nAJYQ";
            copyOfRange[i13] = (byte) i14;
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A01 = new byte[]{54, 61, 52, 52};
    }

    static {
        A03();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.dr != com.facebook.ads.funnel.FunnelParamType$AbstractFunnelParamType<T> */
    public AbstractC1686dr(String str) {
        this.A00 = str;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.dr != com.facebook.ads.funnel.FunnelParamType$AbstractFunnelParamType<T> */
    public C0W A04(@Nullable T t10) {
        return new C0W(this, t10 == null ? A02(0, 4, 101) : t10.toString());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.dr != com.facebook.ads.funnel.FunnelParamType$AbstractFunnelParamType<T> */
    @Override // com.facebook.ads.redexgen.X.C0X
    public final String getName() {
        return this.A00;
    }
}
