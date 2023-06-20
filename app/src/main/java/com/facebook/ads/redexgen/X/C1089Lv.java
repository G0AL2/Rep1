package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import androidx.annotation.Nullable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Lv  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1089Lv {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 3);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{58, 43, 43, 55, 50, 56, 58, 47, 50, 52, 53, 116, 43, 63, 61, 119, 123, 112, 113, 45, 44, 58, 42, 59, 32, 57, 61, 32, 38, 39, 9, 14, 16};
    }

    public static String A01(int i10, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A00(15, 4, 23), i10);
            jSONObject.put(A00(19, 11, 74), str);
            jSONObject.put(A00(30, 3, 127), str2).toString();
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    @Nullable
    public static String A02(String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        String A002 = A00(0, 0, 103);
        if (isEmpty) {
            return A002;
        }
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        if (TextUtils.isEmpty(fileExtensionFromUrl)) {
            return A002;
        }
        return MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
    }

    public static boolean A04(String str) {
        return A00(0, 15, 88).equalsIgnoreCase(A02(str));
    }
}
