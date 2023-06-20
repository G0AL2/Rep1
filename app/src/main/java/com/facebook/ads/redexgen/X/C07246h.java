package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.6h  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C07246h {
    public static final String A08 = C07246h.class.getSimpleName();
    public final int A00;
    public final Context A01;
    public final C6C A02;
    public final C6T A03;
    public final C1523b7 A04;
    public final C1522b6 A05;
    public final C1521b5 A06;
    public final C7E A07;

    /* JADX WARN: Type inference failed for: r2v0, types: [com.facebook.ads.redexgen.X.6k] */
    public C07246h(final Context context, final C6C c6c) {
        final C07286l c07286l = new C07286l(new C07306n(context, c6c));
        ?? r22 = new Object(context, c07286l, c6c) { // from class: com.facebook.ads.redexgen.X.6k
            public static byte[] A07;
            public static String[] A08 = {"Nj4TqS4QnuHXli7th2heksSDMg2Z", "RSouwChKZWzGhunCWCHEu7HkA4YX3nJn", "5fVToSkDBkuydhS3BZw", "o644y0JXIVns0cvIXh4fs0HcxxzuSHU9", "L6wIWC4w0dKe6dclyvwc8pXUf7KK", "NV8kH7O4XMciCHnyYHa8lR80N34PEowy", "S6E1x33SpjjOrFFRELF", "CEXaqd5N8FzuUquPi7vxqko1f9a5yOv1"};
            public int A00;
            public final C6C A01;
            public final C1523b7 A02;
            public final C1522b6 A03;
            public final C1521b5 A04;
            public final C07286l A05;
            public final C7E A06;

            public static String A02(int i10, int i11, int i12) {
                byte[] copyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
                for (int i13 = 0; i13 < copyOfRange.length; i13++) {
                    copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 75);
                }
                return new String(copyOfRange);
            }

            public static void A04() {
                A07 = new byte[]{-31, 4};
            }

            static {
                A04();
            }

            {
                this.A03 = new C1522b6(context, c6c);
                this.A04 = new C1521b5(context, c6c);
                this.A02 = new C1523b7(context, c6c);
                this.A06 = new C7E(context, c6c);
                this.A05 = c07286l;
                this.A01 = c6c;
                A05();
            }

            @Nullable
            public static C07376u A00(int i10, String str, int i11, int i12) {
                if (i10 != 10300) {
                    if (i10 == 10920) {
                        return A01(str, i11, i12, EnumC07366t.A03);
                    }
                    if (i10 != 10940 && i10 != 10941) {
                        switch (i10) {
                            case 10943:
                            case 10944:
                            case 10945:
                                break;
                            default:
                                return null;
                        }
                    }
                }
                return A01(str, i11, i12, EnumC07366t.A04);
            }

            @Nullable
            public static C07376u A01(String str, int i10, int i11, EnumC07366t enumC07366t) {
                int i12 = C07266j.A00[enumC07366t.ordinal()];
                if (i12 != 1) {
                    if (i12 != 2) {
                        return null;
                    }
                    return new C07376u(str, i10, i11);
                }
                return new C07376u(Integer.valueOf(Integer.parseInt(str)), i10, i11);
            }

            @Nullable
            private List<C07376u> A03(int i10) throws JSONException {
                ArrayList arrayList = new ArrayList();
                Map<Integer, String> A0i = this.A01.A0i();
                if (A0i == null || A0i.isEmpty() || !A0i.containsKey(Integer.valueOf(i10))) {
                    return arrayList;
                }
                JSONObject jSONObject = new JSONObject(A0i.get(Integer.valueOf(i10)));
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    JSONArray jSONArray = jSONObject.getJSONArray(next);
                    if (jSONArray != null && jSONArray.length() == 2) {
                        int i11 = jSONArray.getInt(0);
                        int minApiLevel = jSONArray.getInt(1);
                        arrayList.add(A00(i10, next, i11, minApiLevel));
                    }
                }
                return arrayList;
            }

            @SuppressLint({"BadMethodUse-android.util.Log.e", "CatchGeneralException"})
            private final void A05() {
                String A02 = A02(1, 1, 69);
                try {
                    JSONObject jSONObject = new JSONObject(this.A01.A0h());
                    Integer valueOf = jSONObject.has(A02) ? Integer.valueOf(jSONObject.getInt(A02)) : null;
                    if (valueOf == null) {
                        return;
                    }
                    this.A00 = valueOf.intValue();
                    this.A06.A06(this.A00);
                    A06(jSONObject.getJSONArray(A02(0, 1, 51)));
                } catch (Throwable th) {
                    C6O.A03(th);
                }
            }

            /* JADX WARN: Code restructure failed: missing block: B:33:0x00b3, code lost:
                if (r4.containsKey(r8) == false) goto L35;
             */
            /* JADX WARN: Code restructure failed: missing block: B:34:0x00b5, code lost:
                if (r9 == false) goto L36;
             */
            /* JADX WARN: Code restructure failed: missing block: B:35:0x00b7, code lost:
                if (r9 == false) goto L48;
             */
            /* JADX WARN: Code restructure failed: missing block: B:36:0x00b9, code lost:
                r0 = r10.A05.A01(r6, r7);
             */
            /* JADX WARN: Code restructure failed: missing block: B:37:0x00bf, code lost:
                r1 = new com.facebook.ads.redexgen.X.C07356s(r6, r5, r0);
             */
            /* JADX WARN: Code restructure failed: missing block: B:38:0x00ca, code lost:
                if (r5.contains(com.facebook.ads.redexgen.X.EnumC07426z.A07) == false) goto L42;
             */
            /* JADX WARN: Code restructure failed: missing block: B:39:0x00cc, code lost:
                r10.A06.A07(r1);
             */
            /* JADX WARN: Code restructure failed: missing block: B:41:0x00d7, code lost:
                if (r5.contains(com.facebook.ads.redexgen.X.EnumC07426z.A0B) == false) goto L46;
             */
            /* JADX WARN: Code restructure failed: missing block: B:42:0x00d9, code lost:
                r10.A03.A03(r1);
             */
            /* JADX WARN: Code restructure failed: missing block: B:43:0x00e0, code lost:
                r0 = r4.get(java.lang.Integer.valueOf(r6));
             */
            /* JADX WARN: Code restructure failed: missing block: B:45:0x00fb, code lost:
                if (r4.containsKey(r8) == false) goto L35;
             */
            /* JADX WARN: Code restructure failed: missing block: B:47:0x00fe, code lost:
                r10.A04.A02(r1);
             */
            @android.annotation.SuppressLint({"BadMethodUse-android.util.Log.e"})
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private void A06(org.json.JSONArray r11) throws java.lang.Exception {
                /*
                    Method dump skipped, instructions count: 262
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C07276k.A06(org.json.JSONArray):void");
            }

            private final boolean A07(EnumSet<EnumC07426z> enumSet) {
                return (enumSet.contains(this.A01.A0a()) && enumSet.contains(EnumC07426z.A05) && enumSet.contains(EnumC07426z.A06) && !enumSet.contains(EnumC07426z.A0A)) ? false : true;
            }

            public final int A08() {
                return this.A00;
            }

            public final C1523b7 A09() {
                return this.A02;
            }

            public final C1522b6 A0A() {
                return this.A03;
            }

            public final C1521b5 A0B() {
                return this.A04;
            }

            public final C7E A0C() {
                return this.A06;
            }
        };
        this.A01 = context;
        this.A05 = r22.A0A();
        this.A06 = r22.A0B();
        this.A04 = r22.A09();
        this.A00 = r22.A08();
        this.A02 = c6c;
        this.A03 = new C6T();
        this.A03.A01(this.A04);
        this.A07 = r22.A0C();
        this.A07.A05();
    }

    @SuppressLint({"BadMethodUse-android.util.Log.e", "CatchGeneralException"})
    public static JSONObject A00() {
        JSONObject jsonSignalObject = new JSONObject();
        Map<Integer, C6H<C7A>> A03 = C07406x.A01().A03();
        if (A03 == null || A03.isEmpty()) {
            return jsonSignalObject;
        }
        try {
            for (Integer num : A03.keySet()) {
                List<C7A> A032 = A03.get(num).A03();
                JSONArray jSONArray = new JSONArray();
                for (C7A c7a : A032) {
                    jSONArray.put(c7a.A09(true));
                }
                jsonSignalObject.put(num.toString(), jSONArray);
            }
        } catch (Throwable th) {
            C6O.A03(th);
        }
        return jsonSignalObject;
    }

    @SuppressLint({"BadMethodUse-java.lang.System.currentTimeMillis"})
    private void A01(String str, EnumC07396w enumC07396w, AnonymousClass70 anonymousClass70) {
        C6M A0Y = this.A02.A0Y();
        if (A0Y != null) {
            int sessionEndTime = (int) (System.currentTimeMillis() / 1000);
            A0Y.A9K(C7J.A05(), str, this.A00, enumC07396w.A03(), sessionEndTime, A00(), anonymousClass70);
        }
        C7J.A0B(this.A02, C6J.A07.A02(), str);
    }

    public final void A02() {
        this.A03.A00();
    }

    public final void A03(EnumC07396w enumC07396w) {
        this.A04.A03(enumC07396w, this.A01);
    }

    public final void A04(EnumC07416y enumC07416y, EnumC07396w enumC07396w, @Nullable String str) {
        A05(enumC07416y, enumC07396w, str, AnonymousClass70.A04);
    }

    public final void A05(EnumC07416y enumC07416y, EnumC07396w enumC07396w, @Nullable String str, AnonymousClass70 anonymousClass70) {
        this.A05.A04(enumC07396w);
        if (enumC07416y == EnumC07416y.A02) {
            this.A06.A03(enumC07396w);
            if (str != null) {
                A01(str, enumC07396w, anonymousClass70);
            }
        }
    }

    public final boolean A06() {
        List<C07356s> A02 = this.A05.A02();
        return (A02 == null || A02.isEmpty()) ? false : true;
    }
}
