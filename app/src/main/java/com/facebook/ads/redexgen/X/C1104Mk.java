package com.facebook.ads.redexgen.X;

import android.app.Activity;
import android.app.KeyguardManager;
import android.util.Log;
import android.view.Window;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Mk  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1104Mk {
    public static byte[] A00;
    public static String[] A01 = {"75", "", "84T1cPcVhFaG3gZ5iFCuz5VGfvW435Ys", "hmgtvPST3LKdfFpjmmFZYvFoyIGtsiKE", "1o0hQSlG2MREJWQYXtVsar2Zo68mKpVL", "LjPyS32kIH6YipP2gsYrsbvo7R8K", "pRhgJcRZc8j2ATnbWVmWTgInp0JNCNsL", "EpPf5pm3Rz1UtI6LaI9QQC8GFK2ymH0S"};
    public static final String A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 115);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{75, 44, 126, 67, 88, 94, 75, 79, 82, 84, 85, 27, 82, 85, 27, 76, 82, 85, 95, 84, 76, 27, 82, 85, 93, 84, 27, 88, 83, 94, 88, 80, 28, 18, 14, 16, 2, 22, 5, 19, 119, 123, 110, 115, 104, 114, 106, 120, 10, 27, 25, 22, 26, 22, 7, 18, 22, 13, 90, 89};
    }

    static {
        A02();
        A02 = C1104Mk.class.getSimpleName();
    }

    public static Map<String, String> A01(C1400Xy c1400Xy) {
        Window window;
        HashMap hashMap = new HashMap();
        if (c1400Xy == null) {
            return hashMap;
        }
        try {
            hashMap.put(A00(40, 3, 111), String.valueOf(A04(c1400Xy)));
            Activity A0C = c1400Xy.A0C();
            if (A0C != null && (window = A0C.getWindow()) != null) {
                int i10 = window.getAttributes().flags;
                hashMap.put(A00(58, 2, 94), Integer.toString(window.getAttributes().type));
                int i11 = 4194304 & i10;
                String A002 = A00(1, 1, 110);
                String A003 = A00(0, 1, 8);
                hashMap.put(A00(48, 5, 14), i11 > 0 ? A002 : A003);
                if (A01[1].length() == 23) {
                    throw new RuntimeException();
                }
                A01[7] = "fwmMHJhcrVWyeAGw8Re8ymmckApbJBDL";
                if ((524288 & i10) <= 0) {
                    A002 = A003;
                }
                String flagShowWhenLockedEnabled = A00(53, 5, 18);
                hashMap.put(flagShowWhenLockedEnabled, A002);
            }
        } catch (Exception e10) {
            String str = A02;
            String flagShowWhenLockedEnabled2 = A00(2, 30, 72);
            Log.e(str, flagShowWhenLockedEnabled2, e10);
            InterfaceC07818y A06 = c1400Xy.A06();
            int i12 = C07828z.A2S;
            AnonymousClass90 anonymousClass90 = new AnonymousClass90(e10);
            String flagShowWhenLockedEnabled3 = A00(43, 5, 114);
            A06.A8y(flagShowWhenLockedEnabled3, i12, anonymousClass90);
        }
        return hashMap;
    }

    public static boolean A03(C1400Xy c1400Xy) {
        return !MT.A04(A01(c1400Xy));
    }

    public static boolean A04(C1400Xy c1400Xy) {
        KeyguardManager keyguardManager = (KeyguardManager) c1400Xy.getSystemService(A00(32, 8, 4));
        return keyguardManager != null && keyguardManager.inKeyguardRestrictedInputMode();
    }
}
