package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.facebook.ads.redexgen.X.0j  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C05750j {
    public static byte[] A00;
    public static String[] A01 = {"4Fi3cRKjKwjo", "pfwDmZC0EgnSHGG3akphHDiSxRpjxWfc", "OwKyFlCBYoW0NHpoiuFf2exuC", "FTixXnraWBf7yQ9sseM6khJqknPB2", "87lno6sBf8EnLpq9v2WrftgOrdI4V", "hcLSbPhFObKmfxN2jEGb0Jf71EM4", "MV7VLhl", "AE1L1nhQpeYYJvXkfFkincgpQRIdvuit"};

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 56);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{101, 64, 4, 77, 87, 4, 77, 74, 82, 69, 72, 77, 64, 69, 80, 65, 64, 4, 83, 77, 80, 76, 75, 81, 80, 4, 80, 75, 79, 65, 74, 10, 10, 27, 2};
    }

    static {
        A02();
    }

    /* JADX WARN: Incorrect condition in loop: B:9:0x0014 */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.Collection<java.lang.String> A01(@androidx.annotation.Nullable org.json.JSONArray r3) {
        /*
            if (r3 == 0) goto L8
            int r0 = r3.length()
            if (r0 != 0) goto La
        L8:
            r0 = 0
            return r0
        La:
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            r1 = 0
        L10:
            int r0 = r3.length()
            if (r1 >= r0) goto L20
            java.lang.String r0 = r3.optString(r1)
            r2.add(r0)
            int r1 = r1 + 1
            goto L10
        L20:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C05750j.A01(org.json.JSONArray):java.util.Collection");
    }

    public static boolean A03(C1400Xy c1400Xy, InterfaceC05740i interfaceC05740i, InterfaceC1028Jh interfaceC1028Jh) {
        EnumC05730h A6p = interfaceC05740i.A6p();
        if (A6p == null || A6p == EnumC05730h.A03) {
            return false;
        }
        boolean z10 = false;
        Collection<String> A6O = interfaceC05740i.A6O();
        if (A6O == null || A6O.isEmpty()) {
            return false;
        }
        Iterator<String> it = A6O.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String packageName = it.next();
            if (M0.A04(c1400Xy, packageName)) {
                z10 = true;
                break;
            }
        }
        if (z10 != (A6p == EnumC05730h.A02)) {
            return false;
        }
        String A65 = interfaceC05740i.A65();
        boolean isEmpty = TextUtils.isEmpty(A65);
        String[] strArr = A01;
        if (strArr[7].charAt(25) != strArr[1].charAt(25)) {
            throw new RuntimeException();
        }
        A01[2] = "Y0XUyINdugWnNFuKX72emGLWk";
        if (!isEmpty) {
            interfaceC1028Jh.A94(A65, null);
            return true;
        }
        InterfaceC07818y A06 = c1400Xy.A06();
        int i10 = C07828z.A0Z;
        String packageName2 = A00(0, 32, 28);
        AnonymousClass90 anonymousClass90 = new AnonymousClass90(packageName2);
        String packageName3 = A00(32, 3, 83);
        A06.A8y(packageName3, i10, anonymousClass90);
        return true;
    }
}
