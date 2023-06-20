package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.cT  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1603cT<T> implements InterfaceC06212e<T> {
    public static byte[] A02;
    public static String[] A03 = {"pRcBA4OWefysSNzvRxIkpBVTVwfc3AVE", "RPn4qv0f1UarsEXGS1XogTnrbpEJEmnV", "xmsaI0t9E", "ZcBN", "DIlRoYRb", "oKMZSswBXiC", "UEhtJ1eDnORTZ2wzgc9obnj9WqOhgFHK", "4xQT2X5Ea9Pr"};
    public int A00;
    public final Object[] A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            byte b10 = copyOfRange[i13];
            String[] strArr = A03;
            if (strArr[4].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            A03[5] = "P1E265Ge3cQ";
            copyOfRange[i13] = (byte) ((b10 ^ i12) ^ 106);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{44, 1, 31, 8, 12, 9, 20, 77, 4, 3, 77, 25, 5, 8, 77, 29, 2, 2, 1, 76, 76, 112, 125, 56, 117, 121, 96, 56, 104, 119, 119, 116, 56, 107, 113, 98, 125, 56, 117, 109, 107, 108, 56, 122, 125, 56, 38, 56, 40};
    }

    static {
        A01();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.cT != com.facebook.ads.internal.androidx.support.v4.util.Pools$SimplePool<T> */
    public C1603cT(int i10) {
        if (i10 > 0) {
            this.A01 = new Object[i10];
            return;
        }
        throw new IllegalArgumentException(A00(20, 29, 114));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.cT != com.facebook.ads.internal.androidx.support.v4.util.Pools$SimplePool<T> */
    private boolean A02(T t10) {
        for (int i10 = 0; i10 < this.A00; i10++) {
            Object obj = this.A01[i10];
            String[] strArr = A03;
            if (strArr[2].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[4] = "IsiBXNP8";
            strArr2[7] = "yZIlFrLQCuaZ";
            if (obj == t10) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.cT != com.facebook.ads.internal.androidx.support.v4.util.Pools$SimplePool<T> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC06212e
    public T A2O() {
        int i10 = this.A00;
        if (i10 > 0) {
            int i11 = i10 - 1;
            Object[] objArr = this.A01;
            T t10 = (T) objArr[i11];
            objArr[i11] = null;
            this.A00 = i10 - 1;
            return t10;
        }
        return null;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.cT != com.facebook.ads.internal.androidx.support.v4.util.Pools$SimplePool<T> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC06212e
    public boolean ADp(T t10) {
        if (!A02(t10)) {
            int i10 = this.A00;
            Object[] objArr = this.A01;
            if (i10 < objArr.length) {
                objArr[i10] = t10;
                this.A00 = i10 + 1;
                return true;
            }
            return false;
        }
        throw new IllegalStateException(A00(0, 20, 7));
    }
}
