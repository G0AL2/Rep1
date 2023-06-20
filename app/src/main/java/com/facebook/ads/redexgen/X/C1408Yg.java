package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Yg  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1408Yg implements AnonymousClass72<String> {
    public static byte[] A02;
    public static String[] A03 = {"2Ak12k3KxlDre9BMfcQZJm1fVAEd6Tgf", "y4tPrpxAohrbTAcrGFRil83jmLq5oYH4", "e1svbR4LjnL9Uq0", "fjsFD3QQ6IDqIywrJIHqXmb1Bv2DWOX8", "ZSEXe", "1cuzbVcJHyn9kOUsdImxi6RVnab7", "gZujDznUETD0P37Bbl", "6v0D04DrfcPbr3xPrMqOit1DxHvgs0fP"};
    public static final String A04;
    public final String A00;
    public final String A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 71);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        String[] strArr = A03;
        if (strArr[2].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        A03[6] = "kBylwnmSfcelW07O9B";
        A02 = new byte[]{86, 97, 97, 124, 97, 51, 117, 118, 103, 112, 123, 122, 125, 116, 51, 64, 106, 96, 103, 118, 126, 51, 67, 97, 124, 99, 118, 97, 103, 106, 112, 113, 106, 97, 120, 113, 107, 112, 122};
    }

    static {
        A03();
        A04 = C1408Yg.class.getSimpleName();
    }

    public C1408Yg(String str) {
        this.A00 = str;
        this.A01 = A01(str);
    }

    @SuppressLint({"BadMethodUse-android.util.Log.e", "CatchGeneralException"})
    public static String A01(String ret) {
        Class cls;
        Method method;
        Method method2;
        Class cls2;
        String A00 = A00(30, 9, 121);
        try {
            Object[] params = {ret};
            cls = C1407Yf.A01;
            if (cls != null) {
                method = C1407Yf.A02;
                if (method != null) {
                    method2 = C1407Yf.A02;
                    cls2 = C1407Yf.A01;
                    A00 = (String) method2.invoke(cls2, params);
                    return A00;
                }
                return A00;
            }
            return A00;
        } catch (Exception e10) {
            String str = A04;
            if (A03[6].length() != 18) {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[5] = "oXiwA6B1oi6grML0rznkDv7zegE0";
            strArr[3] = "MpkqXegYf54bz8gSrJrjZ1BXYdnwAcLG";
            Log.e(str, A00(0, 30, 84), e10);
            return A00;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AnonymousClass72
    /* renamed from: A02 */
    public final JSONObject AFB(String str, JSONObject jSONObject) throws JSONException {
        jSONObject.put(this.A00, this.A01);
        return jSONObject;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass72
    public final boolean A8S(Object obj) {
        C1408Yg c1408Yg = (C1408Yg) obj;
        return this.A00.equals(c1408Yg.A00) && this.A01.equals(c1408Yg.A01);
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass72
    public final int AEp() {
        return this.A00.getBytes().length + this.A01.getBytes().length;
    }
}
