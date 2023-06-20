package com.facebook.ads.redexgen.X;

import android.util.Log;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class XN implements InterfaceC1026Jf {
    public static byte[] A02;
    public static String[] A03 = {"T62Ry0cHQcXSDxKL7NhTV4RGJa1EK", "DJGQMadZkB17LVbr", "iOkG4K13Hjl0NUqXuJlVUejicjlk1nzW", "33srKXABt3KwFUuhEJwkq3ZAZBzDwUgt", "PLu8UfSRSTd2rcgSm6FUEhoaf9WcktnC", "1tfjOobuNxYUsDgE6aIuCnswgchDbiIE", "3cN0JgpVgSdwOhRQcWnO1AlK5DQJr2L6", "ilEunU5aQdATmqkKFrVV7R1hAU4VbdID"};
    public static final String A04;
    public C1399Xx A00;
    public XO A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 72);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{86, 16, 25, 4, 86, 19, 0, 19, 24, 2, 63, 18, 86, 115, 32, 38, 48, 48, 54, 32, 32, 53, 38, 63, 63, 42, 125, 32, 34, 3, 10, 3, 18, 3, 2, 70, 3, 16, 3, 8, 18, 21, 70, 3, 30, 5, 3, 3, 2, 3, 2, 70, 20, 3, 18, 20, 31, 70, 10, 15, 11, 15, 18, 72, 70, 37, 9, 19, 8, 18, 92, 70, 65, 102, 110, 107, 98, 99, 39, 115, 104, 39, 119, 102, 117, 116, 98, 39, 102, 105, 39, 98, 113, 98, 105, 115, 39, 110, 105, 39, 98, 113, 98, 105, 115, 116, 39, 102, 117, 117, 102, 126, 39, 97, 104, 117, 39, 99, 110, 116, 119, 102, 115, 100, 111, 39, 97, 102, 110, 107, 114, 117, 98, 41, 112, 87, 95, 90, 83, 82, 22, 66, 89, 22, 70, 87, 68, 69, 83, 22, 87, 88, 22, 83, 64, 83, 88, 66, 22, 95, 88, 22, 83, 64, 83, 88, 66, 69, 22, 90, 95, 69, 66, 22, 65, 94, 83, 88, 22, 70, 68, 83, 70, 87, 68, 95, 88, 81, 22, 82, 95, 69, 70, 87, 66, 85, 94, 22, 70, 87, 79, 90, 89, 87, 82, 24, 7, 49, 38, 34, 49, 38, 116, 36, 38, 59, 55, 49, 39, 39, 49, 48, 116, 49, 34, 49, 58, 32, 29, 48, 116, 17, 39, 48, 52, 39, 48, 98, 48, 39, 54, 55, 48, 44, 39, 38, 98, 44, 45, 44, 111, 48, 39, 54, 48, 59, 35, 32, 46, 39, 98, 39, 48, 48, 45, 48, 98, 33, 45, 38, 39, 98, 88, 110, 121, 125, 110, 121, 43, 121, 110, Byte.MAX_VALUE, 126, 121, 101, 110, 111, 43, 121, 110, Byte.MAX_VALUE, 121, 114, 106, 105, 103, 110, 43, 110, 121, 121, 100, 121, 43, 104, 100, 111, 110, 43, 68, Byte.MAX_VALUE, 112, 115, 125, 116, 49, 101, 126, 49, 97, 112, 99, 98, 116, 49, 98, 116, 99, 103, 116, 99, 49, 99, 116, 98, 97, 126, Byte.MAX_VALUE, 98, 116, 49, 112, 101, 49, 97, 126, 98, 120, 101, 120, 126, Byte.MAX_VALUE, 49, 117, 121, 114, 115, 13, 30, 13, 6, 28, 27, 56, 59, 63, 42, 43, 44, 59, 115, 61, 49, 48, 56, 55, 57, 115, 59, 40, 59, 48, 42, 115, 51, 63, 57, 55, 61, 95, 92, 88, 77, 76, 75, 92, 102, 90, 86, 87, 95, 80, 94, 116, 121, 117, 98, 100, 104, 117, 99, 88, 99, 102, 115, 102, 101, 102, 116, 98, 60, 39, 35, 45, 38, 58, 33, 37, 43, 32, 17, 39, 42, 32, 59, 63, 49, 58, 39};
    }

    static {
        A01();
        A04 = XN.class.getSimpleName();
    }

    public XN(C1399Xx c1399Xx, XO xo) {
        this.A00 = c1399Xx;
        this.A01 = xo;
    }

    private void A02(Set<String> set, Set<String> set2) {
        int A0B = this.A01.A0B(JT.A0G(this.A00), set, set2);
        if (A0B > 0) {
            InterfaceC07818y A06 = this.A00.A06();
            int i10 = C07828z.A10;
            A06.A8y(A00(TTAdConstant.DEEPLINK_FALLBACK_TYPE_CODE, 15, 79), i10, new AnonymousClass90(A00(28, 44, 46) + A0B));
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1026Jf
    @Nullable
    public final JSONObject A4H() {
        int A0F = JT.A0F(this.A00);
        List<JSONObject> A0C = this.A01.A0C(A0F);
        JSONObject jSONObject = new JSONObject();
        Iterator<JSONObject> it = A0C.iterator();
        while (true) {
            if (it.hasNext()) {
                JSONObject next = it.next();
                try {
                    String optString = next.optString(A00(420, 5, 0));
                    String uuid = UUID.randomUUID().toString();
                    jSONObject.put(uuid, optString);
                    next.put(A00(425, 8, 6), uuid);
                } catch (JSONException e10) {
                    C8Z A032 = this.A00.A03();
                    if (A03[2].charAt(22) != 'j') {
                        break;
                    }
                    A03[7] = "eMFgGe3BwzjIEwfr0eq56CqWHHfmSWyD";
                    if (A032.A8P()) {
                        Log.e(A04, A00(134, 72, 126), e10);
                    }
                }
            } else {
                JSONArray jSONArray = new JSONArray((Collection) A0C);
                if (JT.A0P(this.A00)) {
                    int debugEventLimit = JT.A08(this.A00);
                    JSONArray A042 = AnonymousClass91.A04(this.A00, debugEventLimit);
                    if (A03[7].charAt(31) == 'D') {
                        String[] strArr = A03;
                        strArr[3] = "31pn7rS79XEbH8v4aDva0zyRbLn9ex8z";
                        strArr[6] = "3BqVDGT4msLu1Rtl2iVh8DraLvTqVCKW";
                        if (A042 != null && A042.length() > 0) {
                            jSONArray = UW.A02(this.A00, A042, jSONArray, A0F + debugEventLimit);
                        }
                    }
                }
                JSONObject jSONObject2 = null;
                try {
                    if (jSONArray.length() > 0) {
                        jSONObject2 = new JSONObject();
                        if (jSONObject.length() > 0) {
                            jSONObject2.put(A00(433, 6, 28), jSONObject);
                        }
                        jSONObject2.put(A00(357, 6, 32), jSONArray);
                    }
                    return jSONObject2;
                } catch (JSONException unused) {
                    return null;
                }
            }
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1026Jf
    public final boolean A8a() {
        return this.A01.A0A() > 0;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1026Jf
    public final void A9y() {
        AnonymousClass91.A0F(this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1026Jf
    public final void AAU(JSONArray jSONArray) {
        int i10 = jSONArray.length();
        HashSet hashSet = new HashSet(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            try {
                String string = jSONArray.getJSONObject(i11).getString(A00(TTAdConstant.DEEPLINK_UNAVAILABLE_CODE, 2, 85));
                if (AnonymousClass91.A0I(string)) {
                    AnonymousClass91.A0B(this.A00, string);
                } else {
                    hashSet.add(string);
                }
            } catch (JSONException e10) {
                if (this.A00.A03().A8P()) {
                    Log.e(A04, A00(72, 62, 79), e10);
                }
            }
        }
        A02(hashSet, new HashSet());
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1026Jf
    public final boolean AAW(JSONArray jSONArray) {
        String A00 = A00(27, 1, 70);
        boolean z10 = true;
        boolean A0P = JT.A0P(this.A00);
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                String string = jSONObject.getString(A00(TTAdConstant.DEEPLINK_UNAVAILABLE_CODE, 2, 85));
                String eventId = A00(363, 26, 22);
                if (eventId.equals(string)) {
                    String eventId2 = A00(389, 14, 113);
                    JR.A0O(this.A00).A2E(jSONObject.getString(eventId2));
                    this.A00.A02().A9W();
                } else {
                    String eventId3 = A00(353, 4, 94);
                    int i11 = jSONObject.getInt(eventId3);
                    if (i11 == 1) {
                        if (this.A00.A03().A8P()) {
                            StringBuilder sb2 = new StringBuilder();
                            String eventId4 = A00(206, 25, 28);
                            sb2.append(eventId4);
                            sb2.append(string);
                            String eventId5 = A00(13, 14, 27);
                            sb2.append(eventId5);
                            sb2.toString();
                        }
                        if (A0P) {
                            AnonymousClass91.A0D(string);
                        }
                        hashSet.add(string);
                    } else {
                        String A002 = A00(0, 13, 62);
                        if (i11 >= 1000 && i11 < 2000) {
                            if (this.A00.A03().A8P()) {
                                String str = A04;
                                StringBuilder sb3 = new StringBuilder();
                                String eventId6 = A00(272, 37, 67);
                                sb3.append(eventId6);
                                sb3.append(i11);
                                sb3.append(A002);
                                sb3.append(string);
                                sb3.append(A00);
                                String eventId7 = sb3.toString();
                                Log.e(str, eventId7);
                            }
                            if (AnonymousClass91.A0I(string)) {
                                AnonymousClass91.A0B(this.A00, string);
                            } else {
                                hashSet2.add(string);
                            }
                            z10 = false;
                        } else if (i11 >= 2000 && i11 < 3000) {
                            if (this.A00.A03().A8P()) {
                                String str2 = A04;
                                StringBuilder sb4 = new StringBuilder();
                                String eventId8 = A00(231, 41, 10);
                                sb4.append(eventId8);
                                sb4.append(i11);
                                sb4.append(A002);
                                sb4.append(string);
                                sb4.append(A00);
                                String eventId9 = sb4.toString();
                                Log.e(str2, eventId9);
                            }
                            hashSet.add(string);
                            if (A0P) {
                                AnonymousClass91.A0D(string);
                            }
                        }
                    }
                    C8V A01 = this.A00.A01();
                    C1399Xx c1399Xx = this.A00;
                    String eventId10 = jSONObject.toString();
                    A01.A8s(c1399Xx, eventId10);
                }
            } catch (JSONException e10) {
                if (this.A00.A03().A8P()) {
                    String str3 = A04;
                    StringBuilder sb5 = new StringBuilder();
                    String eventId11 = A00(309, 44, 89);
                    sb5.append(eventId11);
                    sb5.append(i10);
                    sb5.append(A00);
                    String eventId12 = sb5.toString();
                    Log.e(str3, eventId12, e10);
                }
                z10 = false;
            }
        }
        A02(hashSet2, hashSet);
        return z10;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1026Jf
    public final void AC2() {
        this.A01.A40();
        AnonymousClass91.A07(this.A00);
    }
}
