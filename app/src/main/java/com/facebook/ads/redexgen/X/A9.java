package com.facebook.ads.redexgen.X;

import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.view.ToolbarActionView$ToolbarActionMode;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public final class A9 extends AbstractC1272Sw implements N7 {
    public static byte[] A0D;
    public static String[] A0E = {"QUFYIN7o4MSHfMbcaqgxGqdg8oING", "Qixa92rp7KQSHPhBId3L5m9SXc6gxNRP", "TUKhftCqFUFv9xNbjbPA3CLhBIkdW", "aNiMBj1VMT3xct4Co4hWzqTsg", "QYSCqyZ4CS", "VjIbmM2G6pRRrYhuKIf6SOzC6eQUF7eo", "KFJXOgKoK7JNlCBWMf", "dachHr6cLZKwbIDqTeRsc0FgbmZCJ"};
    @Nullable
    public View A00;
    public View A01;
    public C1400Xy A02;
    @Nullable
    public AbstractC1109Mp A03;
    public C1188Pq A04;
    @Nullable
    public IT A05;
    public boolean A06;
    public final InterfaceC1110Mq A07;
    public final OT A08;
    public final OU A09;
    public final QK A0A;
    public final C1018Ix A0B;
    public final AtomicBoolean A0C;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 13);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A0D = new byte[]{-53, -60, -39, -56, -30, -42, -41, -60, -43, -41, -52, -47, -54, -30, -60, -47, -52, -48, -60, -41, -52, -46, -47, -42, -30, -45, -49, -60, -36, -56, -57, -51, -48, -44, -58, -32, -45, -58, -40, -62, -45, -59, -32, -44, -60, -45, -58, -58, -49, -32, -44, -55, -48, -40, -49, -53, -75, -57, -45, -71, -62, -72, -45, -73, -75, -58, -72, -45, -57, -68, -61, -53, -62};
    }

    static {
        A07();
    }

    public A9(C1155Oj c1155Oj) {
        super(c1155Oj, false);
        this.A0C = new AtomicBoolean(false);
        this.A06 = false;
        this.A02 = c1155Oj.A05();
        this.A03 = c1155Oj.A08();
        this.A01 = new View(this.A02);
        MS.A0K(this.A01);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(0, 0);
        layoutParams.addRule(13);
        addView(this.A01, layoutParams);
        A04();
        this.A07 = c1155Oj.A09();
        C1149Od.A00(c1155Oj.A05(), this, getAdInfo().A0D().A07());
        this.A0A = A00(c1155Oj);
        getAdDetailsView().bringToFront();
        this.A0B = A01(c1155Oj);
        A0f();
        this.A04 = new C1188Pq(this.A02, c1155Oj.A06(), getAdDataBundle());
        this.A08 = new C1270Su(this);
        this.A09 = new OU(c1155Oj, getAdDataBundle(), this.A0A, this.A0B, getAdDetailsView(), this.A07, this.A08);
    }

    private QK A00(C1155Oj c1155Oj) {
        QK qk = (QK) c1155Oj.A02();
        int A0e = A0e(c1155Oj.A08());
        ImageView imageView = (ImageView) c1155Oj.A03();
        imageView.setPadding(AbstractC1272Sw.A0D, AbstractC1272Sw.A0D, AbstractC1272Sw.A0D, AbstractC1272Sw.A0D);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(AbstractC1272Sw.A0E, AbstractC1272Sw.A0E);
        layoutParams.setMargins(0, A0e, AbstractC1272Sw.A0C, 0);
        layoutParams.addRule(11);
        layoutParams.addRule(10);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(13);
        addView(qk, layoutParams2);
        qk.addView(imageView, layoutParams);
        return qk;
    }

    private C1018Ix A01(C1155Oj c1155Oj) {
        C1018Ix A0A = c1155Oj.A0A();
        A0A.A06(-1, AbstractC1272Sw.A09);
        A0A.setPadding(AbstractC1272Sw.A0H, AbstractC1272Sw.A0H, AbstractC1272Sw.A0H, AbstractC1272Sw.A0H);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, AbstractC1272Sw.A0G);
        layoutParams.addRule(12);
        addView(A0A, layoutParams);
        return A0A;
    }

    private void A03() {
        if (getAnimationPlugin() != null) {
            getAnimationPlugin().A0E();
            this.A0A.A0d(getAnimationPlugin());
        }
    }

    private void A04() {
        AbstractC1109Mp abstractC1109Mp = this.A03;
        if (abstractC1109Mp == null) {
            return;
        }
        this.A05 = new IT(abstractC1109Mp, DownloadResource.STATUS_BAD_REQUEST, -abstractC1109Mp.getToolbarHeight(), 0);
    }

    private void A05() {
        new C1036Jp(getAdDataBundle().A0U(), getAdEventManager()).A02(EnumC1035Jo.A0r, null);
        if (!getAdInfo().A0O()) {
            return;
        }
        this.A0C.set(true);
        MS.A0T(this);
        MS.A0H(this.A0A);
        MS.A0Z(this.A0A, this.A0B, this.A09, this.A00);
        MS.A0L(this.A03);
        C1188Pq c1188Pq = this.A04;
        T1 ctaButton = getCtaButton();
        String[] strArr = A0E;
        if (strArr[2].length() != strArr[0].length()) {
            throw new RuntimeException();
        }
        A0E[3] = "FxfG3zWETYKhpCEsP1aqGpvXk";
        Pair<EnumC1187Pp, View> A03 = c1188Pq.A03(ctaButton);
        this.A00 = (View) A03.second;
        int i10 = C1156Ok.A00[((EnumC1187Pp) A03.first).ordinal()];
        if (i10 == 1) {
            getAdDetailsView().setVisibility(0);
            RelativeLayout.LayoutParams screenshotParams = new RelativeLayout.LayoutParams(-1, -1);
            screenshotParams.setMargins(0, A0e(this.A03), 0, 0);
            screenshotParams.addRule(2, getAdDetailsView().getId());
            addView(this.A00, screenshotParams);
        } else if (i10 != 2) {
        } else {
            MS.A0Z(getAdDetailsView());
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.setMargins(AbstractC1272Sw.A0F, AbstractC1272Sw.A0F, AbstractC1272Sw.A0F, AbstractC1272Sw.A0F);
            addView(this.A00, layoutParams);
        }
    }

    private void A06() {
        IT it = this.A05;
        if (it != null) {
            it.A3M(true, false);
        }
        if (getAdDetailsAnimation() != null) {
            getAdDetailsAnimation().A3M(true, false);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1151Of
    public final void A09(AnonymousClass88 anonymousClass88) {
        super.A09(anonymousClass88);
        A05();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1151Of
    public final void A0A(AnonymousClass84 anonymousClass84) {
        super.A0A(anonymousClass84);
        int duration = this.A0A.getDuration() - anonymousClass84.A00();
        if (getAnimationPlugin() != null) {
            int remainingVideoTimeInMillis = A0E[1].charAt(18);
            if (remainingVideoTimeInMillis != 51) {
                throw new RuntimeException();
            }
            A0E[5] = "xiBnzSw2W6K3rvYkwdUGMYXv5m3ZqRWR";
            if (duration < 3000 && getAnimationPlugin().A0J()) {
                getAnimationPlugin().A0F();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1151Of
    public final void A0W() {
        super.A0W();
        A03();
        this.A03 = null;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1272Sw, com.facebook.ads.redexgen.X.AbstractC1151Of
    public final void A0b(C1B c1b, String str, double d10, @Nullable Bundle bundle) {
        super.A0b(c1b, str, d10, bundle);
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (!bundle.getBoolean(A02(0, 31, 118), false)) {
            A06();
        }
        if (bundle.getBoolean(A02(55, 18, 103), false)) {
            A05();
        }
        if (bundle.getBoolean(A02(31, 24, 116), false)) {
            OU ou = this.A09;
            if (A0E[1].charAt(18) != '3') {
                throw new RuntimeException();
            }
            String[] strArr = A0E;
            strArr[2] = "jjtMTZWEM7Dg1szUnnnmuTjwvMhej";
            strArr[0] = "cexdZia4vusGbXInA5fVVHDcQrSB4";
            ou.A07(this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1151Of
    public final boolean A0c() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1151Of
    public final boolean A0d(boolean z10) {
        if (z10 && !this.A06) {
            boolean z11 = this.A0C.get();
            String[] strArr = A0E;
            if (strArr[7].length() != strArr[4].length()) {
                String[] strArr2 = A0E;
                strArr2[2] = "IfEmWBIDBUNw5tL7YhS4lNzldGhzw";
                strArr2[0] = "8CoNQoXVMdzgwU1krh95bRLsSKKH4";
                if (!z11) {
                    this.A09.A07(this);
                    return true;
                }
            }
            throw new RuntimeException();
        }
        boolean A0O = getAdInfo().A0O();
        if (A0E[5].charAt(17) != 'k') {
            A0E[1] = "YRUjLZqfjvY5EOxU383ujQcW8j7gUgor";
            if (A0O && !this.A0C.get()) {
                this.A0A.A0a(Q1.A08);
                return true;
            }
            return false;
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1272Sw
    public final void A0f() {
        super.A0f();
        if (getAnimationPlugin() != null) {
            getAnimationPlugin().A8o(this.A0A);
        }
    }

    public final boolean A0g() {
        return getAdInfo().A0O();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1151Of
    @ToolbarActionView$ToolbarActionMode
    public int getCloseButtonStyle() {
        if (A0g() && !this.A0C.get()) {
            return 1;
        }
        return super.getCloseButtonStyle();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1272Sw, com.facebook.ads.redexgen.X.AbstractC1151Of, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }
}
