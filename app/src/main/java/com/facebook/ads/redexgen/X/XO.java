package com.facebook.ads.redexgen.X;

import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.util.common.Preconditions;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class XO implements InterfaceC07899g {
    public static byte[] A03;
    public static final String A04;
    public final C1399Xx A00;
    public final InterfaceC07999r<C1025Je> A01;
    public final InterfaceC07999r<C1025Je> A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 70);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{102, 100, 43, 34, 100, 48, 61, 52, 33, 126, 100, 24, 61, 28, 47, 60, 55, 45, 10, 45, 54, 43, 56, 62, 60, 11, 60, 58, 54, 43, 61, 29, 56, 45, 56, 59, 56, 42, 60, 105, 72, 65, 72, 89, 72, 73, 13, 72, 91, 72, 67, 89, 23, 13, 15, 66, 101, 109, 104, 97, 96, 36, 112, 107, 36, 103, 104, 97, 101, 118, 36, 97, 114, 97, 106, 112, 119, 36, 119, 112, 107, 118, 101, 99, 97, 97, 70, 78, 75, 66, 67, 7, 83, 72, 7, 67, 66, 84, 66, 85, 78, 70, 75, 78, 93, 66, 7, 70, 73, 7, 66, 81, 66, 73, 83, 7, 65, 85, 72, 74, 7, 67, 70, 83, 70, 69, 70, 84, 66, 7, 107, 76, 68, 65, 72, 73, 13, 89, 66, 13, 64, 66, 91, 72, 13, 72, 91, 72, 67, 89, 94, 13, 75, 95, 66, 64, 13, 68, 67, 0, 75, 65, 68, 74, 69, 89, 13, 94, 89, 66, 95, 76, 74, 72, 13, 79, 76, 78, 70, 13, 89, 66, 13, 72, 91, 72, 67, 89, 94, 13, 73, 76, 89, 76, 79, 76, 94, 72, 118, 81, 89, 92, 85, 84, 16, 68, 95, 16, 64, 81, 66, 67, 85, 16, 81, 94, 16, 85, 70, 85, 94, 68, 16, 86, 66, 95, 93, 16, 89, 94, 29, 86, 92, 89, 87, 88, 68, 16, 67, 68, 95, 66, 81, 87, 85, 123, 92, 84, 81, 88, 89, 29, 73, 82, 29, 79, 88, 92, 89, 29, 73, 85, 88, 29, 83, 72, 80, 95, 88, 79, 29, 82, 91, 29, 88, 75, 88, 83, 73, 78, 29, 91, 79, 82, 80, 29, 89, 92, 73, 92, 95, 92, 78, 88, 12, 43, 35, 38, 47, 46, 106, 62, 37, 106, 57, 47, 56, 35, 43, 38, 35, 48, 47, 106, 43, 46, 106, 47, 60, 47, 36, 62, 105, 78, 70, 76, 73, 71, 72, 84, 13, 97, 68, 101, 86, 69, 78, 84, 115, 84, 79, 82, 65, 71, 69, 114, 69, 67, 79, 82, 68, 100, 65, 84, 65, 66, 65, 83, 69, 56, 15, 9, 5, 24, 14, 74, 14, 11, 30, 11, 8, 11, 25, 15, 74, 12, 11, 3, 6, 31, 24, 15, 74, 5, 9, 9, 31, 24, 24, 15, 14, 74, 29, 2, 15, 4, 74, 24, 15, 11, 14, 3, 4, 13, 74, 15, 28, 15, 4, 30, 25, 68, 61, 40, 40, 57, 49, 44, 40, 28, 25, 12, 25, 47, 34, 95, 72, 78, 66, 95, 73, 114, 73, 76, 89, 76, 79, 76, 94, 72, 65, 87, 65, 65, 91, 93, 92, 109, 91, 86, 46, 56, 46, 46, 52, 50, 51, 2, 41, 52, 48, 56, 100, 121, 125, 117, 49, 42, 46, 32, 43, 88, 85, 92, 73, 12, 23, 18, 23, 22, 14, 23};
    }

    static {
        A03();
        A04 = XO.class.getSimpleName();
    }

    public XO(C1399Xx c1399Xx) throws IOException {
        this.A00 = c1399Xx;
        this.A01 = new XL(C07969o.A00(A00(11, 28, 31), c1399Xx), new XQ(this));
        this.A02 = new XL(C07969o.A00(A00(322, 37, 102), c1399Xx), new XP(this));
    }

    private List<JSONObject> A01(List<JSONObject> list, byte[] bArr, int[] iArr) {
        int i10 = 0;
        for (int i11 : iArr) {
            if (i11 == 0) {
                break;
            }
            try {
                list.add(A02(bArr, i10, i11));
            } catch (JSONException e10) {
                if (this.A00.A03().A8P()) {
                    Log.e(A04, A00(85, 45, 97), e10);
                }
                A05(C07828z.A2O, e10);
            }
            i10 += i11;
        }
        return list;
    }

    public static JSONObject A02(byte[] bArr, int i10, int i11) throws JSONException {
        return new JSONObject(new String(Arrays.copyOfRange(bArr, i10, i10 + i11)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04(int i10, String str) {
        AnonymousClass90 anonymousClass90 = new AnonymousClass90(str);
        anonymousClass90.A03(1);
        this.A00.A06().A8z(A00(425, 15, 107), i10, anonymousClass90);
    }

    private void A05(int i10, Throwable th) {
        this.A00.A06().A8y(A00(425, 15, 107), i10, new AnonymousClass90(th));
    }

    public static byte[] A07(C8U c8u, String str, C1025Je c1025Je) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A00(423, 2, 0), str);
            jSONObject.put(A00(466, 5, 3), c1025Je.A08());
            jSONObject.put(A00(471, 4, 106), c1025Je.A06().toString());
            jSONObject.put(A00(462, 4, 86), MJ.A02(c1025Je.A04()));
            jSONObject.put(A00(450, 12, 27), MJ.A02(c1025Je.A03()));
            jSONObject.put(A00(440, 10, 116), c1025Je.A07());
            jSONObject.put(A00(419, 4, 62), new JSONObject(c1025Je.A09()));
            jSONObject.put(A00(412, 7, 26), 0);
        } catch (JSONException e10) {
            if (c8u.A03().A8P()) {
                Log.e(A04, A00(294, 28, 12), e10);
            }
        }
        return jSONObject.toString().getBytes();
    }

    public static byte[] A09(JSONObject jSONObject) {
        return jSONObject.toString().getBytes();
    }

    public final int A0A() {
        try {
            return this.A01.A7I();
        } catch (A0 e10) {
            if (this.A00.A03().A8P()) {
                Log.e(A04, A00(245, 49, 123), e10);
                return 0;
            }
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00ec A[Catch: A0 -> 0x0132, TryCatch #0 {A0 -> 0x0132, blocks: (B:33:0x00e0, B:35:0x00ec, B:36:0x00fb, B:22:0x0088, B:24:0x008e, B:26:0x009a, B:27:0x00d6, B:39:0x0104, B:40:0x0108, B:42:0x010e, B:43:0x011e, B:44:0x0122, B:46:0x0128), top: B:57:0x00e0 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0143  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int A0B(int r13, java.util.Set<java.lang.String> r14, java.util.Set<java.lang.String> r15) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.XO.A0B(int, java.util.Set, java.util.Set):int");
    }

    public final List<JSONObject> A0C(int i10) {
        boolean z10 = false;
        if (i10 == -1) {
            z10 = true;
            i10 = 30;
        }
        int[] iArr = new int[i10];
        byte[] bArr = new byte[i10 * 1000];
        List<JSONObject> linkedList = new LinkedList<>();
        LinkedList linkedList2 = new LinkedList();
        try {
            InterfaceC07989q lastFetch = this.A01.A5M(bArr, iArr);
            linkedList2.add(lastFetch);
            int A5N = lastFetch.A5N();
            linkedList = A01(linkedList, bArr, iArr);
            while (lastFetch.A9V() && (A5N < i10 || z10)) {
                if (!z10) {
                    iArr = new int[i10 - A5N];
                } else {
                    Arrays.fill(iArr, 0);
                }
                lastFetch = this.A01.A5M(bArr, iArr);
                linkedList2.add(lastFetch);
                linkedList = A01(linkedList, bArr, iArr);
            }
            for (JSONObject jSONObject : linkedList) {
                this.A02.AF5(A09(jSONObject));
            }
            Iterator it = linkedList2.iterator();
            while (it.hasNext()) {
                ((InterfaceC07989q) it.next()).A4i();
            }
        } catch (A0 e10) {
            if (this.A00.A03().A8P()) {
                Log.e(A04, A00(359, 53, 44), e10);
            }
            A05(C07828z.A2L, e10);
        }
        return linkedList;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07899g
    public final void A40() {
        try {
            this.A01.clear();
            this.A02.clear();
        } catch (A0 e10) {
            if (this.A00.A03().A8P()) {
                Log.e(A04, A00(55, 30, 66), e10);
            }
            A05(C07828z.A2I, e10);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.9d != com.facebook.ads.internal.eventstorage.AdEventStorageCallback<java.lang.String> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC07899g
    public final void AFi(final C1025Je c1025Je, final AbstractC07869d<String> abstractC07869d) {
        Executor executor = MX.A07;
        final InterfaceC07999r<C1025Je> interfaceC07999r = this.A01;
        final C1399Xx c1399Xx = this.A00;
        MU.A00(executor, new AsyncTask<Void, Void, String>(c1025Je, abstractC07869d, interfaceC07999r, c1399Xx) { // from class: com.facebook.ads.redexgen.X.9h
            public static byte[] A05;
            public static String[] A06 = {"eZRg0", "9V6E8W", "xj5QhV", "OA95VIvTvwhgOpg1JzD5APn5ld4Fxl09", "KVXKxw3vFVm2nsonOqXLQ2M9", "1wiEXg5TWKy6aTJl", "hr3sX5JQ1zlqribj", "Vt9t5ut5ZgjhHbMTByjzA5y3IT5Rov5"};
            @Nullable
            public A0 A00;
            public final C8U A01;
            public final AbstractC07869d<String> A02;
            public final InterfaceC07999r<C1025Je> A03;
            public final C1025Je A04;

            public static String A00(int i10, int i11, int i12) {
                byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
                for (int i13 = 0; i13 < copyOfRange.length; i13++) {
                    copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 55);
                }
                return new String(copyOfRange);
            }

            public static void A02() {
                A05 = new byte[]{26, 40, 31, 31, 2, 31, 77, 0, 8, 30, 30, 12, 10, 8, 77, 14, 12, 3, 3, 2, 25, 77, 15, 8, 77, 3, 24, 1, 1, 13, 46, 38, 38, 40, 47, 38, 97, 36, 55, 36, 47, 53, 123, 97, 9, 30, 24, 20, 9, 31, 36, 31, 26, 15, 26, 25, 26, 8, 30};
            }

            static {
                A02();
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.9d != com.facebook.ads.internal.eventstorage.AdEventStorageCallback<java.lang.String> */
            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.9r != com.facebook.ads.internal.eventstorage.record.RecordDatabase<com.facebook.ads.internal.logging.AdEvent> */
            {
                this.A04 = c1025Je;
                this.A03 = interfaceC07999r;
                this.A02 = abstractC07869d;
                this.A01 = c1399Xx;
            }

            @Nullable
            private final String A01(Void... voidArr) {
                String eventId;
                byte[] A07;
                if (L0.A02(this)) {
                    return null;
                }
                String str = null;
                try {
                    try {
                        str = UUID.randomUUID().toString();
                        InterfaceC07818y A062 = this.A01.A06();
                        String eventId2 = this.A04.A06().toString();
                        A062.A8F(eventId2);
                        eventId = this.A04.A08();
                    } catch (A0 e10) {
                        this.A00 = e10;
                        this.A01.A06().A8y(A00(44, 15, 76), C07828z.A2M, new AnonymousClass90(e10));
                    }
                    if (TextUtils.isEmpty(eventId)) {
                        return null;
                    }
                    if (this.A01.A03().A8P()) {
                        StringBuilder sb2 = new StringBuilder();
                        String eventId3 = A00(29, 15, 118);
                        sb2.append(eventId3);
                        String eventId4 = this.A04.A06().toString();
                        sb2.append(eventId4);
                        String eventId5 = A00(0, 1, 13);
                        sb2.append(eventId5);
                        String eventId6 = this.A04.A09().toString();
                        sb2.append(eventId6);
                        sb2.toString();
                    }
                    InterfaceC07999r<C1025Je> interfaceC07999r2 = this.A03;
                    A07 = XO.A07(this.A01, str, this.A04);
                    interfaceC07999r2.AF5(A07);
                    return str;
                } catch (Throwable th) {
                    L0.A00(th, this);
                    return null;
                }
            }

            private final void A03(String str) {
                if (L0.A02(this)) {
                    return;
                }
                try {
                    if (this.A00 == null) {
                        this.A02.A02(str);
                    } else {
                        this.A02.A01(0, (String) Preconditions.checkNotNull(this.A00.getMessage(), A00(1, 28, 90)));
                    }
                } catch (Throwable th) {
                    L0.A00(th, this);
                }
            }

            @Override // android.os.AsyncTask
            @Nullable
            public final /* bridge */ /* synthetic */ String doInBackground(Void[] voidArr) {
                if (L0.A02(this)) {
                    return null;
                }
                try {
                    return A01(voidArr);
                } catch (Throwable th) {
                    L0.A00(th, this);
                    if (A06[7].length() != 31) {
                        throw new RuntimeException();
                    }
                    A06[1] = "V";
                    return null;
                }
            }

            @Override // android.os.AsyncTask
            public final /* bridge */ /* synthetic */ void onPostExecute(String str) {
                if (L0.A02(this)) {
                    return;
                }
                try {
                    A03(str);
                } catch (Throwable th) {
                    L0.A00(th, this);
                }
            }
        }, new Void[0]);
    }
}
