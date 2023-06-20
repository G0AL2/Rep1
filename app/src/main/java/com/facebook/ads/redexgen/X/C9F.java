package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.9F  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C9F {
    public static byte[] A04;
    public static String[] A05 = {"MRuBx", "tnrUNtkj", "pjyIxrC6Yt5E7Bc8e3CsDS5x0xMg", "2xISKY0hJDtdJSu4Q6JXzE3xpGdbyGij", "ditV1dZQcpc", "LaRPF5Qegj7e827D6k5bX2o3j9w5", "b", "ieJW9hY3GIu"};
    public final String A00;
    public final String A01;
    public final Map<C9J, List<String>> A02 = new HashMap();
    public final JSONObject A03;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 9);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {-23, -18, -27, -38, -69, -72, -78};
        String[] strArr = A05;
        if (strArr[2].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A05;
        strArr2[4] = "sekG1ort6wl";
        strArr2[7] = "5zf1LSqUL7z";
        A04 = bArr;
    }

    static {
        A01();
    }

    public C9F(String str, String str2, JSONObject jSONObject, @Nullable JSONArray jSONArray) {
        List<String> trackerByType;
        this.A00 = str;
        this.A01 = str2;
        this.A03 = jSONObject;
        if (jSONArray == null || jSONArray.length() == 0) {
            return;
        }
        for (C9J c9j : C9J.values()) {
            this.A02.put(c9j, new LinkedList());
        }
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                String string = jSONObject2.getString(A00(0, 4, 108));
                String string2 = jSONObject2.getString(A00(4, 3, 61));
                C9J valueOf = C9J.valueOf(string.toUpperCase(Locale.US));
                if (!TextUtils.isEmpty(string2) && (trackerByType = this.A02.get(valueOf)) != null) {
                    trackerByType.add(string2);
                }
            } catch (Exception unused) {
            }
        }
    }

    public final String A02() {
        return this.A00;
    }

    @Nullable
    public final List<String> A03(C9J c9j) {
        return this.A02.get(c9j);
    }

    public final JSONObject A04() {
        return this.A03;
    }
}
