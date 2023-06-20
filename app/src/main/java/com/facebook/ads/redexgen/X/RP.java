package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum A03 uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:368)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:333)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:318)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: assets/audience_network.dex */
public abstract class RP {
    public static byte[] A00;
    public static String[] A01 = {"nA8fLeyOwVmNwvq6aIqKxCaagHA5eYr", "8Z3ODqLNUnEAqB2P3Amw9Ur1PSsugik5", "YRmdf", "zIg3Ob9eurpeZ06C2uEHUxbrUPW1iO5", "DwODnBhAs5I9lGAPLwBjllp42Gjp41Mv", "6IL6kP5nz", "IHg6IZuYXxuMxytmBHiV", "YXmTZGEBqQ8NuPQvZDB03"};
    public static final /* synthetic */ RP[] A02;
    public static final RP A03;
    public static final RP A04;
    public static final RP A05;
    public static final RP A06;
    public static final RP A07;
    public static final RP A08;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 4);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{-82, -33, -33, -50, -26, 110, -101, -101, -104, -111, -115, -102, -103, -60, -54, -73, -63, -70, Byte.MAX_VALUE, -92, -86, 101, 120, Byte.MIN_VALUE, 123, 121, -118, 123, -100, -102, -111, -106, -113, -99, -74, -77, -74, -73, -65, -74, 104, -68, -63, -72, -83, 104, -73, -82, 104, -78, -69, -73, -74, 104, -73, -86, -78, -83, -85, -68, 104, -77, -83, -63};
    }

    public abstract boolean A04(JSONArray jSONArray, int i10);

    public abstract boolean A05(JSONArray jSONArray, JSONArray jSONArray2, int i10);

    public abstract boolean A06(JSONObject jSONObject, String str);

    public abstract boolean A07(JSONObject jSONObject, JSONObject jSONObject2, String str);

    static {
        A03();
        final String A022 = A02(0, 5, 105);
        A03 = new RP(A022, 0) { // from class: com.facebook.ads.redexgen.X.HF
            @Override // com.facebook.ads.redexgen.X.RP
            public final boolean A04(JSONArray jSONArray, int i10) {
                return jSONArray.optJSONArray(i10) != null;
            }

            @Override // com.facebook.ads.redexgen.X.RP
            public final boolean A05(JSONArray jSONArray, JSONArray jSONArray2, int i10) {
                return RQ.A01(jSONArray.optJSONArray(i10), jSONArray2.optJSONArray(i10));
            }

            @Override // com.facebook.ads.redexgen.X.RP
            public final boolean A06(JSONObject jSONObject, String str) {
                return jSONObject.optJSONArray(str) != null;
            }

            @Override // com.facebook.ads.redexgen.X.RP
            public final boolean A07(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return RQ.A01(jSONObject.optJSONArray(str), jSONObject2.optJSONArray(str));
            }
        };
        A04 = new RP(A02(5, 7, 40), 1) { // from class: com.facebook.ads.redexgen.X.H5
            @Override // com.facebook.ads.redexgen.X.RP
            public final boolean A04(JSONArray jSONArray, int i10) {
                return jSONArray.optBoolean(i10, true) == jSONArray.optBoolean(i10, false);
            }

            @Override // com.facebook.ads.redexgen.X.RP
            public final boolean A05(JSONArray jSONArray, JSONArray jSONArray2, int i10) {
                return jSONArray.optBoolean(i10) == jSONArray2.optBoolean(i10);
            }

            @Override // com.facebook.ads.redexgen.X.RP
            public final boolean A06(JSONObject jSONObject, String str) {
                return jSONObject.optBoolean(str, true) == jSONObject.optBoolean(str, false);
            }

            @Override // com.facebook.ads.redexgen.X.RP
            public final boolean A07(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return jSONObject.optBoolean(str) == jSONObject2.optBoolean(str);
            }
        };
        A05 = new RP(A02(12, 6, 81), 2) { // from class: com.facebook.ads.redexgen.X.H4
            @Override // com.facebook.ads.redexgen.X.RP
            public final boolean A04(JSONArray jSONArray, int i10) {
                return jSONArray.optInt(i10, 0) == jSONArray.optInt(i10, 1) && jSONArray.optDouble(i10, 0.0d) == jSONArray.optDouble(i10, 1.0d) && ((double) jSONArray.optInt(i10, 0)) != jSONArray.optDouble(i10, 0.0d);
            }

            @Override // com.facebook.ads.redexgen.X.RP
            public final boolean A05(JSONArray jSONArray, JSONArray jSONArray2, int i10) {
                return jSONArray.optDouble(i10) == jSONArray2.optDouble(i10);
            }

            @Override // com.facebook.ads.redexgen.X.RP
            public final boolean A06(JSONObject jSONObject, String str) {
                return jSONObject.optInt(str, 0) == jSONObject.optInt(str, 1) && jSONObject.optDouble(str, 0.0d) == jSONObject.optDouble(str, 1.0d) && ((double) jSONObject.optInt(str, 0)) != jSONObject.optDouble(str, 0.0d);
            }

            @Override // com.facebook.ads.redexgen.X.RP
            public final boolean A07(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return jSONObject.optDouble(str) == jSONObject2.optDouble(str);
            }
        };
        A06 = new RP(A02(18, 3, 50), 3) { // from class: com.facebook.ads.redexgen.X.H3
            @Override // com.facebook.ads.redexgen.X.RP
            public final boolean A04(JSONArray jSONArray, int i10) {
                return jSONArray.optInt(i10, 0) == jSONArray.optInt(i10, 1) && jSONArray.optDouble(i10, 0.0d) == jSONArray.optDouble(i10, 1.0d) && ((double) jSONArray.optInt(i10, 0)) == jSONArray.optDouble(i10, 0.0d);
            }

            @Override // com.facebook.ads.redexgen.X.RP
            public final boolean A05(JSONArray jSONArray, JSONArray jSONArray2, int i10) {
                return jSONArray.optInt(i10) == jSONArray2.optInt(i10);
            }

            @Override // com.facebook.ads.redexgen.X.RP
            public final boolean A06(JSONObject jSONObject, String str) {
                return jSONObject.optInt(str, 0) == jSONObject.optInt(str, 1) && jSONObject.optDouble(str, 0.0d) == jSONObject.optDouble(str, 1.0d) && ((double) jSONObject.optInt(str, 0)) == jSONObject.optDouble(str, 0.0d);
            }

            @Override // com.facebook.ads.redexgen.X.RP
            public final boolean A07(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return jSONObject.optInt(str) == jSONObject2.optInt(str);
            }
        };
        final String A023 = A02(21, 6, 18);
        A07 = new RP(A023, 4) { // from class: com.facebook.ads.redexgen.X.H0
            @Override // com.facebook.ads.redexgen.X.RP
            public final boolean A04(JSONArray jSONArray, int i10) {
                return jSONArray.optJSONObject(i10) != null;
            }

            @Override // com.facebook.ads.redexgen.X.RP
            public final boolean A05(JSONArray jSONArray, JSONArray jSONArray2, int i10) {
                return RQ.A02(jSONArray.optJSONObject(i10), jSONArray2.optJSONObject(i10));
            }

            @Override // com.facebook.ads.redexgen.X.RP
            public final boolean A06(JSONObject jSONObject, String str) {
                return jSONObject.optJSONObject(str) != null;
            }

            @Override // com.facebook.ads.redexgen.X.RP
            public final boolean A07(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return RQ.A02(jSONObject.optJSONObject(str), jSONObject2.optJSONObject(str));
            }
        };
        A08 = new RP(A02(27, 6, 36), 5) { // from class: com.facebook.ads.redexgen.X.Gz
            @Override // com.facebook.ads.redexgen.X.RP
            public final boolean A04(JSONArray jSONArray, int i10) {
                return jSONArray.optString(i10) != null;
            }

            @Override // com.facebook.ads.redexgen.X.RP
            public final boolean A05(JSONArray jSONArray, JSONArray jSONArray2, int i10) {
                return jSONArray.optString(i10).equals(jSONArray2.optString(i10));
            }

            @Override // com.facebook.ads.redexgen.X.RP
            public final boolean A06(JSONObject jSONObject, String str) {
                return jSONObject.optString(str) != null;
            }

            @Override // com.facebook.ads.redexgen.X.RP
            public final boolean A07(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return jSONObject.optString(str).equals(jSONObject2.optString(str));
            }
        };
        A02 = new RP[]{A03, A04, A05, A06, A07, A08};
    }

    public RP(String str, int i10) {
    }

    public static RP A00(JSONArray jSONArray, int i10) {
        RP[] values;
        for (RP rp : values()) {
            if (A01[1].charAt(14) != '2') {
                throw new RuntimeException();
            }
            A01[4] = "PUsgFaltT51mxPXWqnHKjq6lqfkoVDea";
            if (rp.A04(jSONArray, i10)) {
                return rp;
            }
        }
        throw new AssertionError(A02(33, 31, 68));
    }

    public static RP A01(JSONObject jSONObject, String str) {
        RP[] values;
        for (RP rp : values()) {
            boolean A062 = rp.A06(jSONObject, str);
            if (A01[5].length() != 9) {
                throw new RuntimeException();
            }
            A01[6] = "GmRRmI3tzaTgoS0GQtjO0";
            if (A062) {
                return rp;
            }
        }
        throw new AssertionError(A02(33, 31, 68));
    }

    public static RP valueOf(String str) {
        return (RP) Enum.valueOf(RP.class, str);
    }

    public static RP[] values() {
        return (RP[]) A02.clone();
    }
}
