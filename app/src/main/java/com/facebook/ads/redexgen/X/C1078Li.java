package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.VisibleForTesting;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.Executors;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.facebook.ads.redexgen.X.Li  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1078Li {
    public static int A00;
    public static byte[] A01;
    public static volatile EnumC1077Lh A02;

    public static String A06(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 58);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A01 = new byte[]{60, 19, 25, 15, 18, 20, 25, 48, 28, 19, 20, 27, 24, 14, 9, 83, 5, 16, 17, 119, 115, 116, 73, 126, 113, 76, Byte.MAX_VALUE, 104, 105, 115, 117, 116, 2, 4, 18, 4, 90, 4, 19, 28};
    }

    static {
        A07();
        A00 = -1;
        A02 = EnumC1077Lh.A04;
    }

    public static int A01(Context context) {
        if (A02 == EnumC1077Lh.A04) {
            A08(context);
        }
        return A00;
    }

    @SuppressLint({"CatchGeneralException"})
    public static int A02(Context context) {
        try {
            return A05(context.getAssets().openXmlResourceParser(A06(0, 19, 71)));
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static int A03(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).minSdkVersion;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    @VisibleForTesting(otherwise = 2)
    public static int A05(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        while (xmlPullParser.next() != 1) {
            if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(A06(32, 8, 77))) {
                for (int i10 = 0; i10 < xmlPullParser.getAttributeCount(); i10++) {
                    if (xmlPullParser.getAttributeName(i10).equals(A06(19, 13, 32))) {
                        return Integer.parseInt(xmlPullParser.getAttributeValue(i10));
                    }
                }
                continue;
            }
        }
        return 0;
    }

    public static void A08(Context context) {
        if (A0A()) {
            return;
        }
        A09(context);
    }

    public static void A09(Context context) {
        if (A02 != EnumC1077Lh.A04) {
            return;
        }
        A02 = EnumC1077Lh.A03;
        Executors.newSingleThreadExecutor().execute(new C1294Tt(context));
    }

    public static boolean A0A() {
        return A02 == EnumC1077Lh.A02;
    }
}
