package com.facebook.ads.redexgen.X;

import android.content.pm.ActivityInfo;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Yw  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1424Yw implements InterfaceC07386v {
    public static byte[] A01;
    public final /* synthetic */ C1423Yv A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 81);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{Byte.MIN_VALUE, -28, -29, -43, -68, -57};
    }

    public C1424Yw(C1423Yv c1423Yv) {
        this.A00 = c1423Yv;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07386v
    public final C7A A5J() throws UnsupportedEncodingException, NoSuchAlgorithmException {
        ActivityInfo[] activityInfoArr;
        ActivityInfo[] activityInfoArr2;
        ActivityInfo[] activityInfoArr3;
        ActivityInfo[] activityInfoArr4;
        activityInfoArr = this.A00.A04;
        if (activityInfoArr != null) {
            StringBuilder sb2 = new StringBuilder();
            int i10 = 0;
            while (true) {
                activityInfoArr2 = this.A00.A04;
                int i11 = activityInfoArr2.length;
                if (i10 < i11) {
                    activityInfoArr3 = this.A00.A04;
                    sb2.append(activityInfoArr3[i10].name);
                    activityInfoArr4 = this.A00.A04;
                    int i12 = activityInfoArr4.length;
                    if (i10 != i12 - 1) {
                        sb2.append(A00(0, 1, 37));
                    }
                    i10++;
                } else {
                    C7A signalValueTypeDef = this.A00.A08(C7J.A08(sb2.toString().getBytes(A00(1, 5, 62)), C7I.A06));
                    return signalValueTypeDef;
                }
            }
        } else {
            return this.A00.A07(AnonymousClass76.A07);
        }
    }
}
