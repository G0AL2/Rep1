package com.facebook.ads.redexgen.X;

import android.util.Log;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.b9  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1525b9 implements C6L {
    public static byte[] A01;
    public static String[] A02 = {"6ed60iFbyw4O0VClkceoZwkVaz", "1Noj8Rwr5CA27wajCyehlG0t", "GtZXESfkmlMC3ZdW", "MRULKW7dB4Z64SB2LTgGF3R4d8LEfmJR", "vApEtDGiCitQ7mYMvJS0OBzW", "koj", "8zJvQkXxVA", "coxDWwrM8IWdo7ilusiV4Y3aDk"};
    public static final String A03;
    public final C1399Xx A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 49);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {74, 119, 108, 106, Byte.MAX_VALUE, 123, 102, 96, 97, 47, 109, 122, 102, 99, 107, 102, 97, 104, 47, 73, 78, 65, 47, 99, 96, 104, 104, 102, 97, 104, 47, 69, 92, 64, 65, 122, 81, 70, 81, 30, 24, 35, 24, 29, 8, 29, 35, 16, 19, 27, 27, 21, 18, 27, 96, 107, 102, 5, 66, 74, 22, 0, 7, 38, 55, 92, 1, 10, 12};
        String[] strArr = A02;
        if (strArr[1].length() != strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[1] = "DL3yCuobuuMgb5zF6sUKmxA9";
        strArr2[4] = "KanNEDagieP8OaiGnypNi6xK";
        A01 = bArr;
    }

    static {
        A01();
        A03 = C1525b9.class.getSimpleName();
    }

    public C1525b9(C1399Xx c1399Xx) {
        this.A00 = c1399Xx;
    }

    @Override // com.facebook.ads.redexgen.X.C6L
    public final void A9A(String str, String str2, Map<String, String> map, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A00(65, 1, 1), str);
            jSONObject.put(A00(66, 1, 95), str2);
            JSONObject jSONObject2 = new JSONObject();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                jSONObject2.put(entry.getKey(), entry.getValue());
            }
            jSONObject.put(A00(67, 2, 84), jSONObject2.toString());
            jSONObject.put(A00(54, 3, 51), str3);
            jSONObject.put(A00(58, 2, 22), str4);
            jSONObject.put(A00(60, 3, 66), str5);
            jSONObject.put(A00(63, 2, 114), str6);
            jSONObject.put(A00(57, 1, 87), A00(35, 4, 1));
            AnonymousClass90 anonymousClass90 = new AnonymousClass90(jSONObject.toString());
            anonymousClass90.A03(1);
            this.A00.A06().A8z(A00(39, 15, 77), 3202, anonymousClass90);
        } catch (JSONException e10) {
            Log.e(A03, A00(0, 35, 62), e10);
        }
    }
}
