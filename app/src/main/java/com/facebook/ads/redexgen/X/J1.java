package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class J1 {
    public static byte[] A05;
    public static String[] A06 = {"6HhNm3cPNapwaqbb", "rETS2R3vEEslStUJRpCBgfLkJK0S9xqh", "MEYGBk1oMmhBWHD5huW8XB9PkOXmJxmW", "Ebyfs41o5airltqaiKadsdL394JDYdET", "45eNA9gLGf59sMGZ1iMI", "", "A0Zue4QITY9ZnpF1VrB6IK97BmW1DYMt", "lY4WeGl5g11cW0QvoH9uVkbc4B0XWsja"};
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final List<byte[]> A04;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            byte b10 = copyOfRange[i13];
            String[] strArr = A06;
            if (strArr[2].charAt(1) != strArr[1].charAt(1)) {
                throw new RuntimeException();
            }
            A06[3] = "kNkKJeUYPfq8eMd2tA59MaBH22H8N5Ts";
            copyOfRange[i13] = (byte) ((b10 - i12) - 81);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A05 = new byte[]{13, 58, 58, 55, 58, -24, 56, 41, 58, 59, 49, 54, 47, -24, 9, 30, 11, -24, 43, 55, 54, 46, 49, 47};
    }

    static {
        A02();
    }

    public J1(List<byte[]> initializationData, int i10, int i11, int i12, float f10) {
        this.A04 = initializationData;
        this.A02 = i10;
        this.A03 = i11;
        this.A01 = i12;
        this.A00 = f10;
    }

    public static J1 A00(C1004Ij c1004Ij) throws C0813Af {
        try {
            c1004Ij.A0Z(4);
            int A0E = (c1004Ij.A0E() & 3) + 1;
            if (A0E != 3) {
                ArrayList arrayList = new ArrayList();
                int numSequenceParameterSets = c1004Ij.A0E() & 31;
                for (int j10 = 0; j10 < numSequenceParameterSets; j10++) {
                    arrayList.add(A03(c1004Ij));
                }
                int A0E2 = c1004Ij.A0E();
                for (int numPictureParameterSets = 0; numPictureParameterSets < A0E2; numPictureParameterSets++) {
                    arrayList.add(A03(c1004Ij));
                }
                int i10 = -1;
                int i11 = -1;
                float f10 = 1.0f;
                int width = A06[4].length();
                if (width != 27) {
                    String[] strArr = A06;
                    strArr[2] = "yEkjaL4nSOxIxbdygxb0eg7rmaPMv2Rh";
                    strArr[1] = "JEi8k2PtpDNktftvz60xHr0NAbywlG3U";
                    if (numSequenceParameterSets > 0) {
                        int height = ((byte[]) arrayList.get(0)).length;
                        C0999Ie A062 = C1000If.A06((byte[]) arrayList.get(0), A0E, height);
                        i10 = A062.A06;
                        i11 = A062.A02;
                        f10 = A062.A00;
                    }
                    return new J1(arrayList, A0E, i10, i11, f10);
                }
                throw new RuntimeException();
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw new C0813Af(A01(0, 24, 119), e10);
        }
    }

    public static byte[] A03(C1004Ij c1004Ij) {
        int offset = c1004Ij.A0I();
        int A062 = c1004Ij.A06();
        c1004Ij.A0Z(offset);
        return IO.A08(c1004Ij.A00, A062, offset);
    }
}
