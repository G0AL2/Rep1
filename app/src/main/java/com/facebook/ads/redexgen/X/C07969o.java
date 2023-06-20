package com.facebook.ads.redexgen.X;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.9o  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C07969o {
    public static byte[] A01;
    public final File A00;

    static {
        A02();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 41);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-90, -60, -47, -47, -46, -41, -125, -56, -47, -42, -40, -43, -56, -125, -118, -120, -42, -118, -125, -52, -42, -125, -60, -125, -57, -52, -43, -56, -58, -41, -46, -43, -36, -118, -91, -83, -80, -87, -88, 100, -72, -77, 100, -89, -74, -87, -91, -72, -87, 100, -88, -83, -74, -87, -89, -72, -77, -74, -67, 100, 107, 105, -73, 107, -58, -62, -45, -60, -53, -65, -52, -49, -57};
    }

    public C07969o(File file) {
        this.A00 = file;
    }

    public static C07969o A00(String str, Context context) throws IOException {
        File file = new File(context.getFilesDir(), A01(64, 9, 55));
        A03(file);
        File file2 = new File(file, str);
        A03(file2);
        return new C07969o(file2);
    }

    public static void A03(File file) throws IOException {
        if (file.exists() || file.mkdir()) {
            if (file.isDirectory()) {
                return;
            }
            final String format = String.format(Locale.US, A01(0, 33, 58), file.getCanonicalPath());
            throw new RuntimeException(format) { // from class: com.facebook.ads.redexgen.X.9p
            };
        }
        final String format2 = String.format(Locale.US, A01(33, 31, 27), file.getCanonicalPath());
        throw new RuntimeException(format2) { // from class: com.facebook.ads.redexgen.X.9p
        };
    }

    public final C07969o A04(String str) throws IOException {
        File file = new File(this.A00, str);
        A03(file);
        return new C07969o(file);
    }

    public final File A05() {
        return this.A00;
    }
}
