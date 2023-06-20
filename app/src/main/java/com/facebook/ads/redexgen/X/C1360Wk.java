package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Wk  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1360Wk extends Cq {
    public static byte[] A01;
    public static String[] A02 = {"VtWAGSJcoPK1ZfQIT7kg70", "uvijoF7s18JkyzfLjC52JO", "UbwrKHlSsB9uBr4pHbp3GiHEJPcDIn2y", "M5IiKhc4TX4EBu4m9nlnlg4KrGcCYGid", "uZSF2L4tKNd9pS0dTFbwskwuDNdjgXB", "5", "JxfitwILt0nkPD2n3YPqqh4", "RXlbAzoXPs3VSjVZyf6us5"};
    public long A00;

    public static String A04(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 32);
        }
        return new String(copyOfRange);
    }

    public static void A0A() {
        A01 = new byte[]{47, 62, 57, 42, 63, 34, 36, 37, 83, 82, 113, 89, 72, 93, 120, 93, 72, 93};
    }

    static {
        A0A();
    }

    public C1360Wk() {
        super(null);
        this.A00 = -9223372036854775807L;
    }

    public static int A00(C1004Ij c1004Ij) {
        return c1004Ij.A0E();
    }

    public static Boolean A01(C1004Ij c1004Ij) {
        return Boolean.valueOf(c1004Ij.A0E() == 1);
    }

    public static Double A02(C1004Ij c1004Ij) {
        return Double.valueOf(Double.longBitsToDouble(c1004Ij.A0L()));
    }

    public static Object A03(C1004Ij c1004Ij, int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 8) {
                            HashMap<String, Object> A08 = A08(c1004Ij);
                            if (A02[5].length() != 0) {
                                String[] strArr = A02;
                                strArr[7] = "dv1uUJDV50UY3341cCSHZj";
                                strArr[6] = "lZLu8OCPwS2vewsoll9LjNz";
                                return A08;
                            }
                        } else if (i10 != 10) {
                            if (i10 != 11) {
                                return null;
                            }
                            return A07(c1004Ij);
                        } else {
                            ArrayList<Object> A06 = A06(c1004Ij);
                            String[] strArr2 = A02;
                            if (strArr2[1].length() == strArr2[0].length()) {
                                A02[4] = "2Wm";
                                return A06;
                            }
                        }
                        throw new RuntimeException();
                    }
                    return A09(c1004Ij);
                }
                return A05(c1004Ij);
            }
            return A01(c1004Ij);
        }
        return A02(c1004Ij);
    }

    public static String A05(C1004Ij c1004Ij) {
        int position = c1004Ij.A0I();
        int A06 = c1004Ij.A06();
        c1004Ij.A0Z(position);
        return new String(c1004Ij.A00, A06, position);
    }

    public static ArrayList<Object> A06(C1004Ij c1004Ij) {
        int A0H = c1004Ij.A0H();
        ArrayList<Object> arrayList = new ArrayList<>(A0H);
        for (int type = 0; type < A0H; type++) {
            arrayList.add(A03(c1004Ij, A00(c1004Ij)));
        }
        return arrayList;
    }

    public static Date A07(C1004Ij c1004Ij) {
        Date date = new Date((long) A02(c1004Ij).doubleValue());
        c1004Ij.A0Z(2);
        return date;
    }

    public static HashMap<String, Object> A08(C1004Ij c1004Ij) {
        int A0H = c1004Ij.A0H();
        HashMap<String, Object> hashMap = new HashMap<>(A0H);
        for (int i10 = 0; i10 < A0H; i10++) {
            hashMap.put(A05(c1004Ij), A03(c1004Ij, A00(c1004Ij)));
        }
        return hashMap;
    }

    public static HashMap<String, Object> A09(C1004Ij c1004Ij) {
        HashMap<String, Object> hashMap = new HashMap<>();
        while (true) {
            String A05 = A05(c1004Ij);
            int A00 = A00(c1004Ij);
            if (A02[4].length() == 22) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[1] = "V4HwzONZDXYgxClN6ndm7q";
            strArr[0] = "UAxIIFeY73WGzRiRR4AY1i";
            if (A00 == 9) {
                return hashMap;
            }
            hashMap.put(A05, A03(c1004Ij, A00));
        }
    }

    @Override // com.facebook.ads.redexgen.X.Cq
    public final void A0B(C1004Ij c1004Ij, long j10) throws C0813Af {
        if (A00(c1004Ij) == 2) {
            if (!A04(8, 10, 28).equals(A05(c1004Ij)) || A00(c1004Ij) != 8) {
                return;
            }
            Map<String, Object> metadata = A08(c1004Ij);
            String A04 = A04(0, 8, 107);
            if (metadata.containsKey(A04)) {
                double doubleValue = ((Double) metadata.get(A04)).doubleValue();
                if (doubleValue > 0.0d) {
                    this.A00 = (long) (1000000.0d * doubleValue);
                    return;
                }
                return;
            }
            return;
        }
        throw new C0813Af();
    }

    @Override // com.facebook.ads.redexgen.X.Cq
    public final boolean A0C(C1004Ij c1004Ij) {
        return true;
    }

    public final long A0D() {
        return this.A00;
    }
}
