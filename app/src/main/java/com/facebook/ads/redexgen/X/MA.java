package com.facebook.ads.redexgen.X;

import android.content.Context;
import androidx.annotation.Nullable;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: assets/audience_network.dex */
public final class MA {
    public static byte[] A00;
    public static final Pattern A01;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 124);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A00 = new byte[]{89, 45, 2, 90, 16, 5, 45, 2, 90, 42, 16, 92, 11, 95, 44, 90, 88, 42, 48, 92, 43, 44, 95, 91, 120, 78, 73, 73, 94, 85, 79, 27, 72, 79, 90, 88, 80, 27, 79, 73, 90, 88, 94, 33, 45, 47, 108, 36, 35, 33, 39, 32, 45, 45, 41, 108, 35, 38, 49};
    }

    static {
        A07();
        A01 = Pattern.compile(A02(0, 24, 13));
    }

    public static String A00() {
        return A06(new Exception(A02(24, 19, 71)), -1, -1, false);
    }

    public static String A01(int i10) {
        if (i10 <= 0) {
            return null;
        }
        float rate = i10;
        if (new Random().nextFloat() >= 1.0f / rate) {
            return null;
        }
        return A00();
    }

    public static String A03(Context context, @Nullable Throwable th) {
        return A06(th, JR.A0G(context), JR.A01(context), JR.A13(context));
    }

    public static String A04(String str) {
        Matcher matcher = A01.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return str;
    }

    public static String A06(@Nullable Throwable th, int i10, int i11, boolean z10) {
        String A02 = A02(0, 0, 122);
        if (th == null) {
            return A02;
        }
        try {
            C1291Tq c1291Tq = new C1291Tq();
            M8 m82 = c1291Tq;
            if (i11 >= 0) {
                m82 = new C1289To(m82, i11);
            }
            if (i10 >= 0) {
                m82 = new C1288Tn(m82, i10, i10);
            }
            if (z10) {
                m82 = new C1290Tp(m82);
            }
            C1292Tr c1292Tr = new C1292Tr(c1291Tq, 1, m82);
            th.printStackTrace(new PrintWriter(new M9(c1292Tr)));
            c1292Tr.flush();
            return c1291Tq.toString();
        } catch (Exception unused) {
            return A02;
        }
    }

    public static boolean A08(M7 m72) {
        String A02 = m72.A02();
        if (A02 == null) {
            return false;
        }
        if (A0A(A02)) {
            return true;
        }
        for (String str : m72.A01()) {
            if (A0A(str)) {
                return true;
            }
        }
        for (String str2 : m72.A00()) {
            if (A0A(str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean A0A(String str) {
        return str.contains(A02(43, 16, 62));
    }
}
