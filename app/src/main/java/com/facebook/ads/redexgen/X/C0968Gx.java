package com.facebook.ads.redexgen.X;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Gx  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0968Gx {
    public static byte[] A00;
    public static String[] A01 = {"gehgTzpUAqg89EXiGGasdpNXUtk8k2dp", "VbYmpptfSIV8qdRodswF8V1n59zym7XK", "E44YX0wg", "TCU5yEG5ZIofchF4EQjDHlsQntmp46Yu", "EkmeYw2kQLbBECw2eANnaw7CzESY", "H", "OFssNajfj", "bi8IHmxX7dNFBPIWLmj9QBiFjZgAYPjN"};

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 92);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{60, 12, 11, 53, 27, 17, 49, 27, 17, 100, 31, 54, 99, 71, 15, 125, 51, 50, 98, 20};
    }

    static {
        A03();
    }

    public static H1 A00(H1 h12, String[] strArr, Map<String, H1> map) {
        if (h12 == null && strArr == null) {
            return null;
        }
        int i10 = 0;
        if (h12 == null && strArr.length == 1) {
            return map.get(strArr[0]);
        }
        if (h12 == null && strArr.length > 1) {
            H1 h13 = new H1();
            int length = strArr.length;
            while (i10 < length) {
                String id2 = strArr[i10];
                h13.A0E(map.get(id2));
                i10++;
            }
            return h13;
        } else if (h12 != null && strArr != null && strArr.length == 1) {
            return h12.A0E(map.get(strArr[0]));
        } else {
            if (h12 != null && strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i10 < length2) {
                    h12.A0E(map.get(strArr[i10]));
                    i10++;
                }
                return h12;
            }
            return h12;
        }
    }

    public static String A02(String str) {
        String A012 = A01(0, 1, 106);
        String replaceAll = str.replaceAll(A01(1, 2, 93), A012).replaceAll(A01(4, 5, 103), A012);
        String A013 = A01(3, 1, 73);
        return replaceAll.replaceAll(A012, A013).replaceAll(A01(9, 11, 99), A013);
    }

    public static void A04(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length() - 1;
        while (length >= 0 && spannableStringBuilder.charAt(length) == ' ') {
            length--;
        }
        if (length >= 0 && spannableStringBuilder.charAt(length) != '\n') {
            spannableStringBuilder.append('\n');
        }
    }

    public static void A05(SpannableStringBuilder spannableStringBuilder, int i10, int i11, H1 h12) {
        if (h12.A07() != -1) {
            spannableStringBuilder.setSpan(new StyleSpan(h12.A07()), i10, i11, 33);
        }
        if (h12.A0P()) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i10, i11, 33);
        }
        if (h12.A0Q()) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i10, i11, 33);
        }
        if (h12.A0O()) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(h12.A05()), i10, i11, 33);
        }
        if (h12.A0N()) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(h12.A04()), i10, i11, 33);
        }
        if (h12.A0L() != null) {
            spannableStringBuilder.setSpan(new TypefaceSpan(h12.A0L()), i10, i11, 33);
        }
        Layout.Alignment A08 = h12.A08();
        String[] strArr = A01;
        if (strArr[0].charAt(0) == strArr[1].charAt(0)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[5] = InneractiveMediationDefs.GENDER_MALE;
        strArr2[2] = "ujiHtYdg";
        if (A08 != null) {
            spannableStringBuilder.setSpan(new AlignmentSpan.Standard(h12.A08()), i10, i11, 33);
        }
        int A06 = h12.A06();
        if (A06 == 1) {
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) h12.A03(), true), i10, i11, 33);
        } else if (A06 == 2) {
            spannableStringBuilder.setSpan(new RelativeSizeSpan(h12.A03()), i10, i11, 33);
        } else if (A06 != 3) {
        } else {
            spannableStringBuilder.setSpan(new RelativeSizeSpan(h12.A03() / 100.0f), i10, i11, 33);
        }
    }
}
