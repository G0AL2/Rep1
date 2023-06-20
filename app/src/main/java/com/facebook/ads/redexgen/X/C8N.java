package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.8N */
/* loaded from: assets/audience_network.dex */
public final class C8N extends SQ {
    public static byte[] A0L;
    public static String[] A0M = {"Mriq29lS8vjEPztqvg4mnlhqPa1pf4jw", "J0ebGdEZD5oKohgNzUxMA3JiHaSF4bRJ", "IT9tvlYp44pYwsfxgtsksFS", "El43mrOkb3qqMjbYlNbneDDC3riKbt8u", "SsyQgLhJr8BA6K4Jeu0226NIXlotTSUK", "5pKSfcHcmxRzGJ6MCKbxSHPk9j0pnkgf", "vZ9Xs81YGHnjRjGsoTeSsIOHxP", "Y9Sammkz"};
    @Nullable
    public AbstractC1151Of A00;
    public C1189Pr A01;
    @Nullable
    public Q6 A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final AnonymousClass57 A09;
    public final C1195Px A0A;
    public final QK A0B;
    public final AnonymousClass89 A0C;
    public final N6 A0D;
    public final N4 A0E;
    public final AbstractC1093Lz A0F;
    public final AbstractC1079Lj A0G;
    public final L4 A0H;
    public final L3 A0I;
    public final KS A0J;
    public final C1018Ix A0K;

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0L, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 88);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        A0L = new byte[]{-3, 21, 7, 5, 21, -1};
    }

    static {
        A08();
    }

    public C8N(C1400Xy c1400Xy, NI ni, InterfaceC1028Jh interfaceC1028Jh, AnonymousClass18 anonymousClass18, C7U c7u, InterfaceC1110Mq interfaceC1110Mq) {
        super(c1400Xy, ni, interfaceC1028Jh, anonymousClass18, c7u, interfaceC1110Mq);
        this.A09 = new SJ(this);
        this.A0H = new L4() { // from class: com.facebook.ads.redexgen.X.9C
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC07859c
            /* renamed from: A00 */
            public final void A03(LG lg) {
                C8N.A0L(C8N.this, true);
            }
        };
        this.A0G = new AbstractC1079Lj() { // from class: com.facebook.ads.redexgen.X.9B
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC07859c
            /* renamed from: A00 */
            public final void A03(C1092Ly c1092Ly) {
                C8N.A0M(C8N.this, true);
                C8N.this.A0P();
            }
        };
        this.A0F = new AbstractC1093Lz() { // from class: com.facebook.ads.redexgen.X.9A
            @Override // com.facebook.ads.redexgen.X.AbstractC07859c
            public final /* bridge */ /* synthetic */ void A03(AnonymousClass85 anonymousClass85) {
            }
        };
        this.A0I = new L3() { // from class: com.facebook.ads.redexgen.X.92
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC07859c
            /* renamed from: A00 */
            public final void A03(AnonymousClass84 anonymousClass84) {
                C8N.A0A(C8N.this, anonymousClass84);
                C8N.A0B(C8N.this, anonymousClass84);
                C8N.A01(C8N.this).A0A(anonymousClass84);
            }
        };
        this.A0D = new N6() { // from class: com.facebook.ads.redexgen.X.8v
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC07859c
            /* renamed from: A00 */
            public final void A03(AnonymousClass88 anonymousClass88) {
                C8N c8n = C8N.this;
                C8N.A09(c8n, anonymousClass88, C8N.A02(c8n).getState() != EnumC1217Qt.A06, false);
            }
        };
        this.A0E = new C8Q(this);
        boolean z10 = false;
        this.A07 = false;
        this.A08 = false;
        this.A06 = false;
        this.A05 = false;
        this.A04 = false;
        this.A0B = new QK(super.A03);
        this.A0B.setFunnelLoggingHandler(super.A05);
        this.A0B.getEventBus().A03(this.A0H, this.A0G, this.A0F, this.A0I, this.A0D, this.A0E);
        this.A0C = new AnonymousClass89(super.A03, super.A04, this.A0B, super.A01.A0U());
        if (JR.A1J(super.A03)) {
            this.A0A = new C1195Px(super.A03, super.A04, this.A0B, super.A01.A0U(), null);
        } else {
            this.A0A = null;
        }
        this.A01 = new C1189Pr(super.A03, super.A09, super.A01.A0a(), interfaceC1110Mq);
        this.A0J = new KS(super.A03, super.A05);
        this.A0K = new C1018Ix(super.A03);
        A07();
        this.A0B.setVideoURI(super.A02.A0S(super.A01.A0O().A0D().A08()));
        A05();
        int A03 = super.A01.A0O().A0D().A03();
        if (JR.A1d(super.A03)) {
            this.A05 = A03 == 0;
        } else {
            this.A05 = A03 <= 0;
        }
        if (super.A01.A0O().A0M() && super.A01.A0O().A0D().A02() > 0) {
            z10 = true;
        }
        this.A03 = z10;
        MS.A0M(this, super.A01.A0N().A01().A07(true));
        if (JR.A1X(super.A03)) {
            super.A07.setProgressSpinnerInvisible(true);
        }
    }

    private AbstractC1151Of A00(int i10) {
        return C1152Og.A00(new C1154Oi(super.A03, super.A04, super.A08, super.A01, this.A0B, super.A0A, super.A06).A0E(super.A07.getToolbarHeight()).A0H(super.A07).A0D(i10).A0F(this.A0J).A0I(this.A0K).A0J(), null, true);
    }

    public static /* synthetic */ AbstractC1151Of A01(C8N c8n) {
        return c8n.A00;
    }

    public static /* synthetic */ QK A02(C8N c8n) {
        return c8n.A0B;
    }

    private void A04() {
        this.A0B.postDelayed(new SI(this), JR.A0I(super.A03));
    }

    private void A05() {
        this.A0B.postDelayed(new SH(this), JR.A0J(super.A03));
    }

    private void A06() {
        this.A05 = true;
        AbstractC1151Of abstractC1151Of = this.A00;
        if (abstractC1151Of != null) {
            abstractC1151Of.A0Z();
        }
    }

    private void A07() {
        this.A0B.A0c(this.A0K);
        this.A0B.A0c(this.A0J);
        if (!TextUtils.isEmpty(super.A01.A0O().A0D().A07())) {
            C07517m c07517m = new C07517m(super.A03);
            this.A0B.A0c(c07517m);
            c07517m.setImage(super.A01.A0O().A0D().A07());
        }
        C07326p c07326p = new C07326p(super.A03, true, super.A05);
        this.A0B.A0c(c07326p);
        this.A0B.A0c(new KT(c07326p, QJ.A03, true));
        this.A0B.A0c(new C07457c(super.A03));
    }

    public static /* synthetic */ void A09(C8N c8n, AnonymousClass88 anonymousClass88, boolean z10, boolean z11) {
        c8n.A0D(anonymousClass88, z10, z11);
    }

    public static /* synthetic */ void A0A(C8N c8n, AnonymousClass84 anonymousClass84) {
        c8n.A0F(anonymousClass84);
    }

    public static /* synthetic */ void A0B(C8N c8n, AnonymousClass84 anonymousClass84) {
        c8n.A0E(anonymousClass84);
    }

    public void A0D(AnonymousClass88 anonymousClass88, boolean z10, boolean z11) {
        if (this.A06) {
            return;
        }
        if (A0M[6].length() != 26) {
            throw new RuntimeException();
        }
        String[] strArr = A0M;
        strArr[2] = "N5ZIPH8mvSXK1CHoPTlSEsF";
        strArr[7] = "PVGkj9Ta";
        this.A06 = true;
        if (!this.A05) {
            A06();
        }
        AbstractC1151Of abstractC1151Of = this.A00;
        if (abstractC1151Of != null) {
            abstractC1151Of.A09(anonymousClass88);
        }
        super.A07.setToolbarActionMessage(A03(0, 0, 25));
        A0H(z10, z11);
        super.A07.setToolbarActionMode(getCloseButtonStyle());
    }

    public void A0E(AnonymousClass84 anonymousClass84) {
        if (this.A0B.getState() == EnumC1217Qt.A02 && JR.A11(super.A03)) {
            this.A0B.postDelayed(new SK(this, anonymousClass84), 5000L);
        }
    }

    public void A0F(AnonymousClass84 anonymousClass84) {
        int A00 = anonymousClass84.A00();
        if (this.A03) {
            int A02 = super.A01.A0O().A0D().A02() - (A00 / 1000);
            if (A02 > 0) {
                super.A07.setToolbarActionMessage(super.A01.A0S().A00().replace(A03(0, 6, 74), String.valueOf(A02)));
            } else {
                super.A07.setToolbarActionMessage(A03(0, 0, 25));
                A0H(false, false);
            }
        }
        float min = A00 / Math.min(super.A01.A0O().A0D().A03() * 1000.0f, this.A0B.getDuration());
        super.A07.setProgress(100.0f * min);
        if (min >= 1.0f && !this.A05) {
            A06();
            String[] strArr = A0M;
            if (strArr[2].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0M;
            strArr2[0] = "PXM0w4DTcyhv6xVVxlaJPbpxowOdlGPl";
            strArr2[4] = "ZagmJHoPVKqTZKI94Zh80WtjAbW4VeCE";
            super.A07.setToolbarActionMode(getCloseButtonStyle());
        }
    }

    public void A0G(String str) {
        int i10 = 0;
        int i11 = 0;
        QK qk = this.A0B;
        if (qk != null) {
            i10 = qk.getCurrentPositionInMillis();
            i11 = this.A0B.getDuration();
            this.A0B.A0Z(3);
        }
        super.A03.A0D().A2n(str);
        if (JR.A12(super.A03)) {
            A0D(new AnonymousClass88(i10, i11), false, true);
            return;
        }
        InterfaceC1110Mq interfaceC1110Mq = super.A08;
        if (A0M[3].charAt(0) == 'z') {
            throw new RuntimeException();
        }
        A0M[3] = "uhCmlX27t5rzSWT78KYVdoY12DutI5Be";
        interfaceC1110Mq.A3s(super.A09.A6Z());
        super.A08.A3s(super.A09.A6U());
    }

    private synchronized void A0H(boolean z10, boolean z11) {
        if (this.A03 && !z10 && !z11) {
            super.A08.A3s(super.A09.A5a());
            this.A01.A05();
            this.A03 = false;
            if (this.A00 != null) {
                this.A00.A0X();
            }
            return;
        }
        this.A03 = false;
    }

    public static /* synthetic */ boolean A0L(C8N c8n, boolean z10) {
        c8n.A07 = z10;
        return z10;
    }

    public static /* synthetic */ boolean A0M(C8N c8n, boolean z10) {
        c8n.A08 = z10;
        return z10;
    }

    @Override // com.facebook.ads.redexgen.X.SQ
    public final void A0Q() {
        MS.A0L(this.A00);
        MS.A0L(super.A07);
        this.A0B.setVolume(super.A01.A0O().A0D().A09() ? 0.0f : 1.0f);
        this.A0B.A0b(Q6.A02, 20);
        AbstractC1151Of abstractC1151Of = this.A00;
        if (abstractC1151Of != null && this.A03) {
            abstractC1151Of.A0Y();
        }
        AbstractC1151Of abstractC1151Of2 = this.A00;
        if (abstractC1151Of2 != null && !this.A05) {
            abstractC1151Of2.A0a();
        }
        A04();
    }

    @Override // com.facebook.ads.redexgen.X.SQ
    public final void A0S(AnonymousClass59 anonymousClass59) {
        anonymousClass59.A0K(this.A09);
        this.A00 = A00(anonymousClass59.A0H().getResources().getConfiguration().orientation);
        addView(this.A00, SQ.A0D);
        addView(super.A07, new FrameLayout.LayoutParams(-1, super.A07.getToolbarHeight()));
        MS.A0H(this.A00);
        MS.A0H(super.A07);
        AbstractC1151Of abstractC1151Of = this.A00;
        setUpFullscreenMode(abstractC1151Of != null && abstractC1151Of.A0c());
    }

    @Override // com.facebook.ads.redexgen.X.SQ
    public final boolean A0T() {
        AbstractC1151Of abstractC1151Of = this.A00;
        return abstractC1151Of != null && abstractC1151Of.A0d(this.A03);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1111Mr
    public final void ABj(boolean z10) {
        if (this.A0B.A0i()) {
            return;
        }
        this.A02 = this.A0B.getVideoStartReason();
        this.A04 = z10;
        this.A0B.A0e(false, 13);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1111Mr
    public final void AC8(boolean z10) {
        if (this.A0B.A0j() || this.A06 || this.A0B.getState() == EnumC1217Qt.A06 || this.A02 == null) {
            return;
        }
        if (!this.A04 || z10) {
            QK qk = this.A0B;
            Q6 q62 = this.A02;
            String[] strArr = A0M;
            if (strArr[0].charAt(8) == strArr[4].charAt(8)) {
                throw new RuntimeException();
            }
            A0M[1] = "5vrQw9TAnlgebYwA7tbvLzoGHglPMjBr";
            qk.A0b(q62, 19);
        }
    }

    private int getCloseButtonStyle() {
        AbstractC1151Of abstractC1151Of = this.A00;
        if (abstractC1151Of != null) {
            return abstractC1151Of.getCloseButtonStyle();
        }
        return 0;
    }

    @Override // com.facebook.ads.redexgen.X.SQ, com.facebook.ads.redexgen.X.InterfaceC1111Mr
    public final void onDestroy() {
        super.onDestroy();
        if (JR.A1I(super.A03)) {
            super.A03.A09().AFF(this.A0B);
        }
        AbstractC1151Of abstractC1151Of = this.A00;
        if (abstractC1151Of != null) {
            abstractC1151Of.A0W();
        }
        QK qk = this.A0B;
        if (qk != null) {
            if (!this.A06) {
                qk.A0a(Q1.A05);
            }
            this.A0B.getEventBus().A04(this.A0H, this.A0G, this.A0F, this.A0I, this.A0D, this.A0E);
            this.A0B.A0V();
        }
        C1195Px c1195Px = this.A0A;
        if (c1195Px != null) {
            c1195Px.A0A();
        }
        this.A0C.A0g();
    }

    @VisibleForTesting
    public void setServerSideRewardHandler(C1189Pr c1189Pr) {
        this.A01 = c1189Pr;
    }
}
