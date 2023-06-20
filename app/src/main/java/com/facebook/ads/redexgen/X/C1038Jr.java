package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.view.View;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Jr  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1038Jr {
    public static byte[] A00;
    public static final Map<String, String> A01;
    public static final Map<String, List<String>> A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 27);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{-68, -51, -49, -52, -33, -52, -42, -27, -34, -34, -43, -36, -3, 0, -14, -11, -16, 5, -6, -2, -10, -16, -2, 4, -68, -81, -69, -65, -81, -67, -66, -87, -66, -77, -73, -81, -87, -73, -67, -111, -108, 123, -126, -111, -118, -118, -127, -120, 123, -120, -117, -125, -125, -123, -118, -125};
    }

    static {
        A03();
        A02 = new HashMap();
        A01 = new HashMap();
    }

    @Nullable
    public static String A01(String str) {
        return A01.get(str);
    }

    public static List<String> A02(C1400Xy c1400Xy, JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                arrayList.add(jSONArray.getString(i10));
            } catch (JSONException e10) {
                c1400Xy.A06().A8y(A00(39, 17, 1), C07828z.A1C, new AnonymousClass90(e10));
            }
        }
        return arrayList;
    }

    public static void A04(View view, C1036Jp c1036Jp, EnumC1035Jo enumC1035Jo) {
        view.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC1037Jq(c1036Jp, enumC1035Jo));
    }

    public static void A05(C1400Xy c1400Xy, String str, long j10) {
        C1036Jp c1036Jp = new C1036Jp(str, c1400Xy.A08());
        HashMap hashMap = new HashMap();
        hashMap.put(A00(24, 15, 47), MJ.A06(j10));
        hashMap.put(A00(12, 12, 118), MJ.A04(j10));
        c1036Jp.A02(EnumC1035Jo.A0D, hashMap);
    }

    public static void A06(C1400Xy c1400Xy, JSONObject jSONObject, long j10, @Nullable String str) {
        JSONObject optJSONObject = jSONObject.optJSONObject(A00(2, 4, 80));
        if (optJSONObject == null) {
            return;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray(A00(6, 6, 85));
        if (TextUtils.isEmpty(str) && optJSONArray != null) {
            A07(c1400Xy, optJSONObject, A02(c1400Xy, optJSONArray), j10, null);
        } else if (TextUtils.isEmpty(str) || !A02.containsKey(str)) {
        } else {
            A07(c1400Xy, optJSONObject, A02.get(str), j10, str);
        }
    }

    public static void A07(C1400Xy c1400Xy, JSONObject jSONObject, List<String> list, long j10, @Nullable String str) {
        String A002 = A00(0, 2, 62);
        if (jSONObject.has(A002)) {
            String optString = jSONObject.optString(A002);
            A08(optString, str);
            A09(optString, list);
            A05(c1400Xy, optString, j10);
        }
    }

    public static void A08(@Nullable String str, @Nullable String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        A01.put(str, str2);
    }

    public static void A09(String str, List<String> list) {
        if (TextUtils.isEmpty(str) || list.isEmpty()) {
            return;
        }
        A02.put(str, list);
    }

    public static boolean A0A(String str, EnumC1035Jo enumC1035Jo) {
        return A0B(str, enumC1035Jo.A02());
    }

    public static boolean A0B(String str, String str2) {
        return A02.containsKey(str) && A02.get(str).contains(str2);
    }
}
