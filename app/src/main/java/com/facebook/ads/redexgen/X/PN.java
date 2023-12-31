package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class PN {
    public static byte[] A00;
    public static String[] A01 = {"xPMOoUfbkmQ5kvnU3jbgLL47OcFEjU7z", "1dodMLotzUEJucQn2MWgY64F", "Ei0kY7ZOP", "czo3jP2JN", "", "hHdeWCinA2EaAz86iaUgwk6OrkZVXmHI", "CkfkaUvdCRi5J5AIUl6JSr62iIVQ3RiE", "AT3hLPm3hPYjZ73rxoY4ER"};

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 79);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{69, 114, 114, 111, 114, 32, 116, 114, 97, 110, 115, 102, 111, 114, 109, 105, 110, 103, 32, 74, 83, 79, 78, 32, 105, 110, 32, 117, 112, 100, 97, 116, 101, 67, 97, 99, 104, 101, 100, 85, 114, 108, 115, 54, 52, 39, 58, 32, 38, 48, 57, 123, 102, 113, 126, 114, 118, 124, 64, 108, 123, 116, 64, 115, 126, 102, 122, 109, 64, 124, 112, 114, 111, 126, 113, 118, 112, 113, 64, 105, 118, 122, 104, 64, 119, 107, 114, 115, 64, 106, 109, 115, 85, 72, 95, 80, 92, 88, 82, 110, 66, 85, 90, 110, 93, 80, 72, 84, 67, 110, 89, 69, 92, 93, 110, 68, 67, 93, 43, 32, 42, 17, 45, 47, 60, 42, 17, 39, 35, 47, 41, 43, 61, 2, 8, 4, 5, 76, 72, 68, 66, 64, 104, 111, 113, 21, 10, 7, 6, 12, 60, 22, 17, 15};
    }

    static {
        A02();
    }

    public static PM A00(C1400Xy c1400Xy, JSONObject jSONObject, C7U c7u, C1036Jp c1036Jp, C1169Ox c1169Ox, boolean z10) {
        boolean updateUrls;
        String str;
        String str2;
        boolean z11 = z10;
        String A012 = A01(142, 3, 82);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        String optString = jSONObject.optString(A01(92, 26, 126));
        String optString2 = jSONObject.optString(A01(51, 41, 80));
        arrayList3.add(optString);
        arrayList3.add(optString2);
        if (z11) {
            str = c7u.A0R(optString);
            str2 = c7u.A0R(optString2);
            if (optString.equals(str) || optString2.equals(str2)) {
                z11 = false;
                updateUrls = false;
            } else {
                updateUrls = z11;
            }
        } else {
            updateUrls = z11;
            str = optString;
            str2 = optString2;
        }
        c1036Jp.A02(EnumC1035Jo.A0P, null);
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject(A01(133, 4, 36));
            if (optJSONObject != null && optJSONObject.optString(A012) != null) {
                arrayList.add(optJSONObject.optString(A012));
                if (updateUrls) {
                    optJSONObject.put(A012, c7u.A0Q(optJSONObject.optString(A012)));
                }
            }
            JSONArray optJSONArray = jSONObject.optJSONArray(A01(118, 15, 1));
            if (optJSONArray != null) {
                for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                    String optString3 = optJSONArray.optString(i10);
                    arrayList.add(optString3);
                    if (updateUrls) {
                        optJSONArray.put(i10, c7u.A0Q(optString3));
                    }
                }
            }
            JSONArray optJSONArray2 = jSONObject.optJSONArray(A01(43, 8, 26));
            if (optJSONArray2 != null) {
                for (int i11 = 0; i11 < optJSONArray2.length(); i11++) {
                    A03(arrayList, arrayList2, optJSONArray2.optJSONObject(i11), c7u, updateUrls);
                }
            } else {
                A03(arrayList, arrayList2, jSONObject, c7u, updateUrls);
            }
        } catch (JSONException unused) {
            c1169Ox.A04(C07828z.A15, A01(0, 43, 79));
        }
        return new PM(jSONObject, str, str2, arrayList, arrayList2, arrayList3, z11);
    }

    public static void A03(ArrayList<String> arrayList, ArrayList<String> arrayList2, JSONObject jSONObject, C7U c7u, boolean z10) throws JSONException {
        JSONObject optJSONObject = jSONObject.optJSONObject(A01(137, 5, 106));
        if (optJSONObject != null) {
            String A012 = A01(142, 3, 82);
            if (A01[1].length() == 1) {
                throw new RuntimeException();
            }
            A01[7] = "G1neCcMuoIIVUH8A2yIEObncf";
            if (optJSONObject.optString(A012) != null) {
                String optString = optJSONObject.optString(A012);
                arrayList.add(optString);
                if (z10) {
                    optJSONObject.put(A012, c7u.A0Q(optString));
                }
            }
        }
        String A013 = A01(145, 9, 44);
        if (!TextUtils.isEmpty(jSONObject.optString(A013))) {
            String optString2 = jSONObject.optString(A013);
            arrayList2.add(optString2);
            if (z10) {
                jSONObject.put(A013, c7u.A0R(optString2));
            }
        }
    }
}
