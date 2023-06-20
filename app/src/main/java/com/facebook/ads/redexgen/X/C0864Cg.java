package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.metadata.Metadata;
import com.facebook.ads.internal.exoplayer2.metadata.id3.CommentFrame;
import com.facebook.ads.internal.exoplayer2.metadata.id3.InternalFrame;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.facebook.ads.redexgen.X.Cg  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0864Cg {
    public static byte[] A02;
    public static String[] A03 = {"di8Sf9Pe7Jbfr41S9La3sE0XUXUbIcTt", "VdReIzyhJEkxgwUPMqeI1KmebCO9QkDh", "oL0VvX6tDLEIK9z1dEY1PtjpuEVwAQ4k", "mKzHDdQgrsp66MEU970RQbCyF", "y1nS2Utxj9rUbNITrIgIYwtdoX0kLvBw", "fSxpMgDRgawYiaXZH4Uz0154e", "ZtMJpUGbuzN6IhF", "0I28Lm89b1qn6II"};
    public static final ES A04;
    public static final Pattern A05;
    public int A00 = -1;
    public int A01 = -1;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A03;
            if (strArr[2].charAt(0) == strArr[0].charAt(0)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[4] = "HJDAX8MhmPuczgxrb1BIwyZzboPzSHEz";
            strArr2[1] = "hQdnt0euFC7WLrk25AhIcQLHRa72NrIb";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 127);
            i13++;
        }
    }

    public static void A01() {
        A02 = new byte[]{47, -15, 44, 1, -2, 10, 50, -2, 55, 18, -2, 23, 46, 76, 9, 78, -15, -7, 44, 1, -2, 10, 50, -2, 55, 18, -2, 23, 46, 76, 9, 78, -6, -15, -7, 44, 1, -2, 10, 50, -2, 55, 18, -2, 23, 46, 76, 9, 78, -6, 71, 83, 81, 18, 69, 84, 84, 80, 73, 18, 77, 56, 89, 82, 73, 87, 77, 56, 89, 82, 55, 49, 52, 38};
    }

    static {
        A01();
        A04 = new C1367Wr();
        A05 = Pattern.compile(A00(0, 50, 82));
    }

    private boolean A02(String str) {
        Matcher matcher = A05.matcher(str);
        if (matcher.find()) {
            try {
                int parseInt = Integer.parseInt(matcher.group(1), 16);
                int encoderDelay = Integer.parseInt(matcher.group(2), 16);
                if (parseInt > 0 || encoderDelay > 0) {
                    this.A00 = parseInt;
                    this.A01 = encoderDelay;
                    return true;
                }
                return false;
            } catch (NumberFormatException unused) {
                return false;
            }
        }
        return false;
    }

    public final boolean A03() {
        return (this.A00 == -1 || this.A01 == -1) ? false : true;
    }

    public final boolean A04(int i10) {
        int i11 = i10 >> 12;
        int i12 = i10 & 4095;
        if (i11 > 0 || i12 > 0) {
            this.A00 = i11;
            this.A01 = i12;
            return true;
        }
        String[] strArr = A03;
        if (strArr[2].charAt(0) != strArr[0].charAt(0)) {
            String[] strArr2 = A03;
            strArr2[3] = "eE8liYxgzzft2czJer5Cb1MId";
            strArr2[5] = "8t68lQEI2igrSMQNmlK51xizE";
            return false;
        }
        throw new RuntimeException();
    }

    public final boolean A05(Metadata metadata) {
        for (int i10 = 0; i10 < metadata.A00(); i10++) {
            Metadata.Entry A01 = metadata.A01(i10);
            boolean z10 = A01 instanceof CommentFrame;
            String A00 = A00(66, 8, 101);
            if (z10) {
                CommentFrame commentFrame = (CommentFrame) A01;
                if (A00.equals(commentFrame.A00) && A02(commentFrame.A02)) {
                    return true;
                }
            } else {
                boolean z11 = A01 instanceof InternalFrame;
                String[] strArr = A03;
                if (strArr[2].charAt(0) == strArr[0].charAt(0)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A03;
                strArr2[4] = "JUr596XT5dN8x1JiD53IGmhrrDc6hzgO";
                strArr2[1] = "1JQdlsQIbSDn6BLSr5BIwZm7GWHfhsN6";
                if (z11) {
                    InternalFrame internalFrame = (InternalFrame) A01;
                    if (A00(50, 16, 101).equals(internalFrame.A01) && A00.equals(internalFrame.A00) && A02(internalFrame.A02)) {
                        return true;
                    }
                } else {
                    continue;
                }
            }
        }
        return false;
    }
}
