package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class P2 extends FrameLayout {
    public static byte[] A0L;
    public static String[] A0M = {"tg98T7YqorVxljyy5rC9rRviyjZQ3PWt", "vfHBQfbeXMWpx0Lt9J2p4bolhXFdVoUD", "nuD8gLvjahybAxP4K7AI7EnQPexhi40p", "Mle9DIn2BhVQrDGkT0Ym6c4cXgC65WVc", "K7R1lop0AG70QQAdOPTNlaEDkQeUTiOI", "yRh0uKXr8zSd48KJrOgjFYKLFGGCRN1w", "QQOq4rDYvkiUVU0ErOwgNbjJJCuazTiH", "YmsKh0Z7MVbEzdUA2tq2qo4jdnYDOoVM"};
    @Nullable
    public Q6 A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final AnonymousClass18 A05;
    public final C7U A06;
    public final C1400Xy A07;
    public final C1036Jp A08;
    public final InterfaceC1110Mq A09;
    public final NI A0A;
    public final P1 A0B;
    public final C1195Px A0C;
    public final QK A0D;
    public final AnonymousClass89 A0E;
    public final N6 A0F;
    public final N4 A0G;
    public final AbstractC1093Lz A0H;
    public final AbstractC1079Lj A0I;
    public final L4 A0J;
    public final L3 A0K;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0L, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 38);
        }
        return new String(copyOfRange);
    }

    public static void A0C() {
        A0L = new byte[]{5, 19, 20, 20, 3, 8, 18, 50, 15, 11, 3, 78, 95, 88, 75, 94, 67, 69, 68, 95, 71, 70, 87, 86, 98, 115, 103, 97, 119, 118, 80, 107, 71, 97, 119, 96, 38, 36, 57, 49, 36, 51, 37, 37};
    }

    static {
        A0C();
    }

    public P2(C1400Xy c1400Xy, InterfaceC1028Jh interfaceC1028Jh, AnonymousClass18 anonymousClass18, C7U c7u, C1036Jp c1036Jp, InterfaceC1110Mq interfaceC1110Mq, NI ni, P1 p12) {
        super(c1400Xy);
        this.A0J = new L4() { // from class: com.facebook.ads.redexgen.X.9z
            public static byte[] A01;

            static {
                A01();
            }

            public static String A00(int i10, int i11, int i12) {
                byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
                for (int i13 = 0; i13 < copyOfRange.length; i13++) {
                    copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 5);
                }
                return new String(copyOfRange);
            }

            public static void A01() {
                A01 = new byte[]{16, 18, 5, 16, 1, 18, 5, 4};
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC07859c
            /* renamed from: A02 */
            public final void A03(LG lg) {
                P2.A0L(P2.this, true);
                P2.A00(P2.this).ACj(A00(0, 8, 101), P2.A05(P2.this));
            }
        };
        this.A0I = new AbstractC1079Lj() { // from class: com.facebook.ads.redexgen.X.9s
            public static byte[] A01;

            static {
                A01();
            }

            public static String A00(int i10, int i11, int i12) {
                byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
                for (int i13 = 0; i13 < copyOfRange.length; i13++) {
                    copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 15);
                }
                return new String(copyOfRange);
            }

            public static void A01() {
                A01 = new byte[]{65, 93, 80, 72};
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC07859c
            /* renamed from: A02 */
            public final void A03(C1092Ly c1092Ly) {
                P2.A0M(P2.this, true);
                P2.A00(P2.this).ACj(A00(0, 4, 62), P2.A05(P2.this));
            }
        };
        this.A0H = new AbstractC1093Lz() { // from class: com.facebook.ads.redexgen.X.9n
            public static byte[] A01;

            static {
                A01();
            }

            public static String A00(int i10, int i11, int i12) {
                byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
                for (int i13 = 0; i13 < copyOfRange.length; i13++) {
                    copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 93);
                }
                return new String(copyOfRange);
            }

            public static void A01() {
                A01 = new byte[]{28, 13, 25, 31, 9};
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC07859c
            /* renamed from: A02 */
            public final void A03(AnonymousClass85 anonymousClass85) {
                P2.A00(P2.this).ACj(A00(0, 5, 49), P2.A05(P2.this));
            }
        };
        this.A0K = new L3() { // from class: com.facebook.ads.redexgen.X.9Z
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC07859c
            /* renamed from: A00 */
            public final void A03(AnonymousClass84 anonymousClass84) {
                P2.A0F(P2.this, anonymousClass84);
                P2.A0D(P2.this);
            }
        };
        this.A0F = new N6() { // from class: com.facebook.ads.redexgen.X.9G
            public static byte[] A01;

            static {
                A01();
            }

            public static String A00(int i10, int i11, int i12) {
                byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
                for (int i13 = 0; i13 < copyOfRange.length; i13++) {
                    copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 77);
                }
                return new String(copyOfRange);
            }

            public static void A01() {
                A01 = new byte[]{20, 32, 30, 33, 29, 22, 37, 22, 21};
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC07859c
            /* renamed from: A02 */
            public final void A03(AnonymousClass88 anonymousClass88) {
                P2.A0E(P2.this);
                P1 A00 = P2.A00(P2.this);
                P2 p22 = P2.this;
                A00.ACj(A00(0, 9, 100), P2.A06(p22, P2.A01(p22).getDuration()));
            }
        };
        this.A0G = new C9E(this);
        this.A03 = false;
        this.A04 = false;
        this.A02 = false;
        this.A01 = false;
        this.A07 = c1400Xy;
        this.A05 = anonymousClass18;
        this.A06 = c7u;
        this.A08 = c1036Jp;
        this.A09 = interfaceC1110Mq;
        this.A0A = ni;
        this.A0D = new QK(c1400Xy);
        this.A0B = p12;
        this.A0D.setFunnelLoggingHandler(c1036Jp);
        this.A0D.getEventBus().A03(this.A0J, this.A0I, this.A0H, this.A0K, this.A0F, this.A0G);
        this.A0E = new AnonymousClass89(c1400Xy, interfaceC1028Jh, this.A0D, anonymousClass18.A0U());
        if (JR.A1J(this.A07)) {
            this.A0C = new C1195Px(c1400Xy, interfaceC1028Jh, this.A0D, anonymousClass18.A0U(), null);
        } else {
            this.A0C = null;
        }
        A0B();
        this.A0D.setVideoURI(this.A06.A0S(this.A05.A0O().A0D().A08()));
        A09();
        MS.A0M(this, this.A05.A0N().A01().A07(true));
        String A07 = anonymousClass18.A0O().A0D().A07();
        if (!TextUtils.isEmpty(A07)) {
            C1149Od.A00(c1400Xy, this, A07);
        }
        addView(this.A0D, new FrameLayout.LayoutParams(-1, -1));
    }

    public static /* synthetic */ P1 A00(P2 p22) {
        return p22.A0B;
    }

    public static /* synthetic */ QK A01(P2 p22) {
        return p22.A0D;
    }

    public JSONObject A03() {
        return A04(this.A0D.getCurrentPositionInMillis());
    }

    public JSONObject A04(int i10) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A02(0, 11, 64), i10);
            jSONObject.put(A02(11, 8, 12), this.A0D.getDuration());
            jSONObject.put(A02(19, 5, 20), this.A0D.A0h());
            jSONObject.put(A02(24, 12, 52), this.A0D.A0j());
            return jSONObject;
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static /* synthetic */ JSONObject A05(P2 p22) {
        return p22.A03();
    }

    public static /* synthetic */ JSONObject A06(P2 p22, int i10) {
        return p22.A04(i10);
    }

    public void A07() {
        if (this.A02) {
            return;
        }
        if (A0M[4].charAt(2) == 'n') {
            throw new RuntimeException();
        }
        String[] strArr = A0M;
        strArr[2] = "wYD5NcGpzh0isOAoVzlYli3P4mnoyMgF";
        strArr[3] = "lJUNZHbcIhPOnD8CvxzjDicpi9xwJBJa";
        this.A02 = true;
    }

    private void A08() {
        this.A0D.postDelayed(new C1250Sa(this), JR.A0I(this.A07));
    }

    private void A09() {
        this.A0D.postDelayed(new SZ(this), JR.A0J(this.A07));
    }

    public void A0A() {
        this.A0B.ACj(A02(36, 8, 112), A03());
    }

    private void A0B() {
        if (!TextUtils.isEmpty(this.A05.A0O().A0D().A07())) {
            C07517m c07517m = new C07517m(this.A07);
            this.A0D.A0c(c07517m);
            c07517m.setImage(this.A05.A0O().A0D().A07());
        }
        C07326p c07326p = new C07326p(this.A07, true, this.A08);
        this.A0D.A0c(c07326p);
        this.A0D.A0c(new KT(c07326p, QJ.A03, true));
        this.A0D.A0c(new C07457c(this.A07));
    }

    public static /* synthetic */ void A0D(P2 p22) {
        p22.A0A();
    }

    public static /* synthetic */ void A0E(P2 p22) {
        p22.A07();
    }

    public static /* synthetic */ void A0F(P2 p22, AnonymousClass84 anonymousClass84) {
        p22.A0H(anonymousClass84);
    }

    public void A0H(AnonymousClass84 anonymousClass84) {
        if (this.A0D.getState() == EnumC1217Qt.A02 && JR.A11(this.A07)) {
            this.A0D.postDelayed(new SY(this, anonymousClass84), 5000L);
        }
    }

    public void A0I(String str) {
        this.A07.A0D().A2n(str);
        if (JR.A12(this.A07)) {
            A07();
            return;
        }
        InterfaceC1110Mq interfaceC1110Mq = this.A09;
        NI ni = this.A0A;
        String[] strArr = A0M;
        if (strArr[5].charAt(16) != strArr[6].charAt(16)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0M;
        strArr2[2] = "EBONCaOY6he3EVwrjSVJVgPSsddIWnnf";
        strArr2[3] = "quoo3J1Esh1kTLqYeLvwyhMYZuOues3Q";
        interfaceC1110Mq.A3s(ni.A6Z());
        this.A09.A3s(this.A0A.A6U());
    }

    public static /* synthetic */ boolean A0L(P2 p22, boolean z10) {
        p22.A03 = z10;
        return z10;
    }

    public static /* synthetic */ boolean A0M(P2 p22, boolean z10) {
        p22.A04 = z10;
        return z10;
    }

    public final void A0N() {
        this.A0D.setVolume(this.A05.A0O().A0D().A09() ? 0.0f : 1.0f);
        this.A0D.A0b(Q6.A02, 26);
        A08();
    }

    public final void A0O() {
        QK qk = this.A0D;
        if (qk != null) {
            if (!this.A02) {
                qk.A0a(Q1.A03);
            }
            this.A0D.getEventBus().A04(this.A0J, this.A0I, this.A0H, this.A0K, this.A0F, this.A0G);
            this.A0D.A0V();
        }
        C1195Px c1195Px = this.A0C;
        if (c1195Px != null) {
            c1195Px.A0A();
        }
        this.A0E.A0g();
    }

    public final void A0P() {
        this.A0D.A0Z(9);
        MS.A0T(this);
        MS.A0H(this.A0D);
        MS.A0Z(this.A0D);
    }

    public final void A0Q() {
        this.A0D.A0a(Q1.A04);
    }

    public final void A0R(boolean z10) {
        if (z10) {
            this.A0D.setVolume(0.0f);
        } else {
            this.A0D.setVolume(1.0f);
        }
        A0A();
        if (A0M[7].charAt(5) == 'u') {
            throw new RuntimeException();
        }
        A0M[4] = "yn69DofMHsLSVfdL7HK9OU5c1k1rZYJH";
    }

    public final void A0S(boolean z10) {
        if (this.A0D.A0i()) {
            return;
        }
        this.A00 = this.A0D.getVideoStartReason();
        this.A01 = z10;
        this.A0D.A0e(false, 19);
    }

    public final void A0T(boolean z10) {
        if (this.A0D.A0j() || this.A02 || this.A0D.getState() == EnumC1217Qt.A06 || this.A00 == null) {
            return;
        }
        boolean z11 = this.A01;
        if (A0M[7].charAt(5) == 'u') {
            throw new RuntimeException();
        }
        String[] strArr = A0M;
        strArr[1] = "icjW3n8vZZxsaCmttUmjcTI7CQu2m51p";
        strArr[0] = "kS3lp82K2YolC4kFtdcvtTBENFWE8ibh";
        if (!z11 || z10) {
            this.A0D.A0b(this.A00, 27);
        }
    }

    public final void A0U(boolean z10) {
        this.A0D.A0e(z10, 18);
    }

    public final void A0V(boolean z10) {
        this.A0D.A0b(Q6.A04, 25);
    }
}
