package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.os.Build;
import android.util.Base64;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class PA {
    public static byte[] A0K;
    public static final AtomicInteger A0L;
    public static final AtomicInteger A0M;
    @Nullable
    public InterfaceC1171Oz A02;
    @Nullable
    public P8 A03;
    @Nullable
    public P9 A04;
    @Nullable
    public C1220Qw A05;
    public final int A08;
    public final AnonymousClass18 A09;
    public final C7U A0A;
    public final C1400Xy A0B;
    public final InterfaceC1028Jh A0C;
    public final C1036Jp A0D;
    public final C1169Ox A0E;
    public final SX A0F;
    public final PL A0G;
    public final PM A0H;
    public final LinkedList<P7> A0J = new LinkedList<>();
    public MK A01 = new MK();
    public boolean A07 = true;
    public boolean A06 = false;
    public long A00 = -1;
    public final String A0I = UUID.randomUUID().toString();

    public static String A0A(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0K, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 2);
        }
        return new String(copyOfRange);
    }

    public static void A0D() {
        A0K = new byte[]{37, 63, 39, 56, 56, 39, 57, 13, 34, 40, 62, 35, 37, 40, 5, 34, 56, 41, 62, 42, 45, 47, 41, 5, 0, 54, 1, 20, 11, 22, 16, 13, 10, 3, 34, 13, 10, 13, 23, 12, 1, 0, 76, 67, 65, 23, 67, 77, 95, 96, 101, 83, 100, 113, 110, 115, 117, 104, 111, 102, 82, 117, 96, 115, 117, 100, 101, 41, 38, 36, 114, 38, 40, 58, 34, 55, 55, 34, 32, 43, 38, 39, 20, 21, 13, 54, 46, 10, 9, 28, 11, 0, 13, 12, 46, 26, 9, 5, 13, 44, 9, 28, 9, 84, 66, 69, 69, 82, 89, 67, 96, 97, 121, 66, 90, 48, 36, 55, 59, 51, 37, 120, 121, 86, 116, 99, 126, 97, 126, 99, 110, 71, 118, 98, 100, 114, 115, 63, 48, 50, 100, 48, 62, 44, 36, 37, 10, 40, 63, 34, 61, 34, 63, 50, 25, 46, 56, 62, 38, 46, 47, 99, 108, 110, 56, 108, 98, 112, 83, 82, Byte.MAX_VALUE, 80, 83, 79, 89, 122, 73, 80, 80, 79, 95, 78, 89, 89, 82, 106, 85, 89, 75, 20, 27, 25, 79, 27, 21, 67, 66, 106, 89, 64, 64, 95, 79, 94, 73, 73, 66, 122, 69, 73, 91, 4, 11, 9, 95, 11, 5, 72, 73, 113, 70, 75, 82, 66, 117, 66, 70, 67, 15, 0, 2, 84, 0, 11, 7, 0, 2, 84, 0, 11, 7, 0, 2, 84, 0, 14, 28, 120, 121, 65, 118, 123, 98, 114, 64, 101, 126, 99, 99, 114, 121, 63, 48, 50, 100, 48, 59, 55, 48, 50, 100, 48, 62, 44, 106, 124, 122, 118, 119, 125, 70, 122, 113, 120, 119, 119, 124, 117, 20, 2, 19, 38, 18, 19, 15, 44, 2, 30, 79, 64, 66, 20, 64, 75, 64, 66, 20, 64, 78, 92, 77, 91, 74, 124, 95, 77, 91, 8, 10, Byte.MAX_VALUE, 77, 77, 91, 74, 77, 22, 25, 27, 77, 25, 18, 25, 27, 77, 25, 23, 2, 20, 5, 51, 16, 2, 20, 71, 69, 50, 30, 31, 23, 24, 22, 89, 86, 84, 2, 86, 93, 86, 84, 2, 86, 88, 57, 34, 57, 44, 33, 26, 27, 3, 56, 32, 38, 33, 63, 29, 2, 15, 14, 4, 46, 29, 14, 5, 31, 67, 76, 78, 24, 76, 71, 75, 76, 78, 24, 76, 71, 75, 76, 78, 24, 76, 66, 80, 14, 17, 29, 15, 42, 29, 25, 28, 1, 44, 23, 43, 16, 23, 15, 80, 95, 93, 11, 95, 81, 67};
    }

    static {
        A0D();
        A0M = new AtomicInteger();
        A0L = new AtomicInteger();
    }

    public PA(C1400Xy c1400Xy, AnonymousClass18 anonymousClass18, InterfaceC1028Jh interfaceC1028Jh, int i10) {
        this.A0B = c1400Xy;
        this.A0C = interfaceC1028Jh;
        this.A09 = anonymousClass18;
        this.A08 = i10;
        this.A0F = new SX(this, c1400Xy);
        this.A0A = new C7U(this.A0B);
        this.A0D = new C1036Jp(anonymousClass18.A0U(), interfaceC1028Jh);
        this.A0E = new C1169Ox(anonymousClass18.A0Z(), anonymousClass18.A0O().A0D().A08(), i10);
        this.A0H = PN.A00(this.A0B, anonymousClass18.A0d(), this.A0A, this.A0D, this.A0E, A0H());
        this.A0G = new PL(this.A0B, this, interfaceC1028Jh, this.A0E, this.A0I, anonymousClass18.A0U());
    }

    public static /* synthetic */ AnonymousClass18 A01(PA pa2) {
        return pa2.A09;
    }

    public static /* synthetic */ InterfaceC1171Oz A06(PA pa2) {
        return pa2.A02;
    }

    public static AtomicInteger A0B() {
        return A0L;
    }

    private void A0C() {
        A0F(new P7(A0A(288, 22, 101), new String[]{this.A0I, A0A(1, 6, 11)}));
        A0F(new P7(A0A(310, 26, 60), new String[]{Base64.encodeToString(this.A0H.A05.toString().getBytes(), 0).replace(A0A(0, 1, 45), A0A(0, 0, 109)), this.A0I}));
    }

    @TargetApi(21)
    public synchronized void A0E() {
        if (this.A06) {
            while (!this.A0J.isEmpty()) {
                P7 poll = this.A0J.poll();
                if (poll != null) {
                    this.A0F.A05(String.format(Locale.US, poll.A00, poll.A02));
                    if (poll.A01) {
                        this.A0D.A02(EnumC1035Jo.A0L, null);
                        this.A0B.A0D().A4v(poll.A00);
                    }
                }
            }
        }
    }

    private synchronized void A0F(P7 p72) {
        this.A0J.offer(p72);
        A0E();
    }

    private boolean A0H() {
        return !A0I();
    }

    private boolean A0I() {
        return JR.A27(this.A0B, C1204Qg.A03());
    }

    public final C1036Jp A0K() {
        return this.A0D;
    }

    public final MK A0L() {
        return this.A01;
    }

    public final C1169Ox A0M() {
        return this.A0E;
    }

    @Nullable
    public final InterfaceC1171Oz A0N() {
        return this.A02;
    }

    public final SX A0O() {
        return this.A0F;
    }

    public final void A0P() {
        A0F(new P7(A0A(23, 26, 102), new String[]{this.A0I}));
    }

    public final void A0Q() {
        A0F(new P7(A0A(49, 25, 3), new String[]{this.A0I}));
    }

    public final void A0R() {
        this.A07 = true;
    }

    public final void A0S() {
        this.A07 = false;
    }

    public final void A0T() {
        A0F(new P7(A0A(121, 23, 21), new String[]{this.A0I}));
    }

    public final void A0U() {
        A0F(new P7(A0A(168, 27, 62), new String[]{this.A0I}));
    }

    public final void A0V() {
        A0F(new P7(A0A(DownloadResource.STATUS_WAITING_FOR_NETWORK, 22, 46), new String[]{this.A0I}));
    }

    public final void A0W() {
        A0F(new P7(A0A(TTAdConstant.DEEPLINK_FALLBACK_CODE, 22, 122), new String[]{this.A0I}));
    }

    @SuppressLint({"AddJavascriptInterface"})
    public final void A0X() {
        String str;
        if (Build.VERSION.SDK_INT > 16) {
            this.A0F.addJavascriptInterface(this.A0G, A0A(7, 16, 78));
        }
        this.A0D.A02(EnumC1035Jo.A0O, null);
        if (this.A08 == 3) {
            str = this.A0H.A00;
        } else {
            str = this.A0H.A01;
        }
        this.A0F.loadUrl(str);
        this.A00 = System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A0A(372, 3, 81), str);
            jSONObject.put(A0A(103, 12, 53), PB.A00());
            jSONObject.put(A0A(362, 10, 79), A0M.getAndIncrement());
            jSONObject.put(A0A(74, 13, 65), A0L);
        } catch (JSONException unused) {
        }
        this.A0B.A0D().A51(jSONObject.toString());
        A0C();
    }

    public final void A0Y() {
        A0F(new P7(A0A(144, 24, 73), new String[]{this.A0I}));
    }

    public final void A0Z(MK mk) {
        this.A01 = mk;
    }

    public final void A0a(@Nullable InterfaceC1171Oz interfaceC1171Oz) {
        this.A02 = interfaceC1171Oz;
    }

    public final void A0b(P8 p82) {
        this.A03 = p82;
    }

    public final void A0c(P9 p92) {
        this.A04 = p92;
    }

    public final void A0d(SW sw) {
        this.A0G.A0N(sw);
    }

    public final void A0e(@Nullable C1220Qw c1220Qw) {
        this.A05 = c1220Qw;
    }

    public final void A0f(String str) {
        A0F(new P7(A0A(247, 27, 21), new String[]{this.A0I, str}));
    }

    public final void A0g(String str, String str2) {
        A0F(new P7(A0A(217, 30, 37), new String[]{this.A0I, str, str2}));
    }

    public final void A0h(String str, JSONObject jSONObject) {
        A0F(new P7(A0A(375, 29, 105), new String[]{this.A0I, str, jSONObject.toString()}, false));
    }

    /* JADX WARN: Incorrect condition in loop: B:40:0x0032 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0i(java.util.Map<java.lang.String, java.lang.String> r21) {
        /*
            r20 = this;
            r6 = r20
            r2 = 87
            r1 = 16
            r0 = 106(0x6a, float:1.49E-43)
            java.lang.String r5 = A0A(r2, r1, r0)
            r7 = r21
            boolean r0 = r7.containsKey(r5)
            if (r0 == 0) goto Lb8
            com.facebook.ads.redexgen.X.Xy r0 = r6.A0B
            boolean r0 = com.facebook.ads.redexgen.X.JR.A1J(r0)
            if (r0 == 0) goto Lb8
            java.lang.Object r0 = r7.get(r5)     // Catch: java.lang.Exception -> L9d
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L9d
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch: java.lang.Exception -> L9d
            r4.<init>(r0)     // Catch: java.lang.Exception -> L9d
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch: java.lang.Exception -> L9d
            r8.<init>()     // Catch: java.lang.Exception -> L9d
            r3 = 0
            r2 = r3
        L2e:
            int r0 = r4.length()     // Catch: java.lang.Exception -> L9d
            if (r2 >= r0) goto L7a
            java.lang.String r0 = r4.getString(r2)     // Catch: java.lang.Exception -> L9d
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: java.lang.Exception -> L9d
            r1.<init>(r0)     // Catch: java.lang.Exception -> L9d
            java.lang.String r11 = r1.getString(r3)     // Catch: java.lang.Exception -> L9d
            r0 = 1
            java.lang.String r10 = r1.getString(r0)     // Catch: java.lang.Exception -> L9d
            r0 = 2
            java.lang.String r9 = r1.getString(r0)     // Catch: java.lang.Exception -> L9d
            r0 = 3
            java.lang.String r1 = r1.getString(r0)     // Catch: java.lang.Exception -> L9d
            if (r11 == 0) goto L77
            if (r10 == 0) goto L77
            if (r9 == 0) goto L77
            com.facebook.ads.redexgen.X.SG r12 = new com.facebook.ads.redexgen.X.SG     // Catch: java.lang.Exception -> L9d
            com.facebook.ads.redexgen.X.18 r0 = r6.A09     // Catch: java.lang.Exception -> L9d
            java.lang.String r13 = r0.A0U()     // Catch: java.lang.Exception -> L9d
            long r14 = java.lang.Long.parseLong(r11)     // Catch: java.lang.Exception -> L9d
            long r16 = java.lang.Long.parseLong(r10)     // Catch: java.lang.Exception -> L9d
            long r18 = java.lang.Long.parseLong(r9)     // Catch: java.lang.Exception -> L9d
            r12.<init>(r13, r14, r16, r18)     // Catch: java.lang.Exception -> L9d
            long r0 = java.lang.Long.parseLong(r1)     // Catch: java.lang.Exception -> L9d
            r12.A05(r0)     // Catch: java.lang.Exception -> L9d
            r8.add(r12)     // Catch: java.lang.Exception -> L9d
        L77:
            int r2 = r2 + 1
            goto L2e
        L7a:
            java.lang.String r4 = com.facebook.ads.redexgen.X.SF.A04(r8)     // Catch: java.lang.Exception -> L9d
            java.util.HashMap r3 = new java.util.HashMap     // Catch: java.lang.Exception -> L9d
            r3.<init>()     // Catch: java.lang.Exception -> L9d
            r2 = 115(0x73, float:1.61E-43)
            r1 = 6
            r0 = 84
            java.lang.String r0 = A0A(r2, r1, r0)     // Catch: java.lang.Exception -> L9d
            r3.put(r0, r4)     // Catch: java.lang.Exception -> L9d
            if (r4 == 0) goto Lb8
            com.facebook.ads.redexgen.X.Jh r1 = r6.A0C     // Catch: java.lang.Exception -> L9d
            com.facebook.ads.redexgen.X.18 r0 = r6.A09     // Catch: java.lang.Exception -> L9d
            java.lang.String r0 = r0.A0U()     // Catch: java.lang.Exception -> L9d
            r1.A9H(r0, r3)     // Catch: java.lang.Exception -> L9d
            goto Lb8
        L9d:
            r1 = move-exception
            com.facebook.ads.redexgen.X.Xy r0 = r6.A0B
            com.facebook.ads.redexgen.X.8y r8 = r0.A06()
            r4 = 3600(0xe10, float:5.045E-42)
            com.facebook.ads.redexgen.X.90 r3 = new com.facebook.ads.redexgen.X.90
            r3.<init>(r1)
            r2 = 274(0x112, float:3.84E-43)
            r1 = 14
            r0 = 27
            java.lang.String r0 = A0A(r2, r1, r0)
            r8.A8y(r0, r4, r3)
        Lb8:
            boolean r0 = r7.containsKey(r5)
            if (r0 == 0) goto Lc1
            r7.remove(r5)
        Lc1:
            com.facebook.ads.redexgen.X.Jh r3 = r6.A0C
            com.facebook.ads.redexgen.X.18 r0 = r6.A09
            java.lang.String r2 = r0.A0U()
            com.facebook.ads.redexgen.X.OG r1 = new com.facebook.ads.redexgen.X.OG
            r1.<init>(r7)
            com.facebook.ads.redexgen.X.Qw r0 = r6.A05
            com.facebook.ads.redexgen.X.OG r0 = r1.A03(r0)
            java.util.Map r0 = r0.A05()
            r3.A8x(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.PA.A0i(java.util.Map):void");
    }

    public final void A0j(JSONObject jSONObject) {
        A0F(new P7(A0A(336, 26, 115), new String[]{Base64.encodeToString(jSONObject.toString().getBytes(), 0).replace(A0A(0, 1, 45), A0A(0, 0, 109)), this.A0I}));
    }

    public final boolean A0k() {
        return this.A0G.A0O();
    }

    public final boolean A0l() {
        return this.A07;
    }
}
