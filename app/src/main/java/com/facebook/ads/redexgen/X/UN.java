package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.facebook.ads.MediaViewVideoRenderer;
import com.facebook.ads.internal.api.DefaultMediaViewVideoRendererApi;
import com.facebook.ads.internal.api.MediaViewVideoRendererApi;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.facebook.proguard.annotations.DoNotStrip;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public final class UN extends C5E implements DefaultMediaViewVideoRendererApi {
    public static byte[] A0F;
    public static String[] A0G = {"mcYgxpLQMmIwsDd5yEmcOVEUvqtoI", "GHoJM0N9xHnxy27wJlEicj6316JJBG", "sAgmez8xlBVRjdgohc9cPNZKpCHjl", "UXd4O0RMEZeMz8rPKuZc9Jx8", "lkMSGOb1N9f2znZPpxO7v43dGPgWn", "ZJq7h5cFUWj9FCmvTSQNl6xA6rnC8", "yifDfgH7QVrqMR4w0vNHSMY9h4Ewh", "QZpfE8IVFABXRQwraZ"};
    public static final String A0H;
    public MediaViewVideoRenderer A00;
    public C1400Xy A01;
    @Nullable
    public InterfaceC1045Jy A02;
    @Nullable
    public C0819Al A04;
    public C07517m A05;
    public View$OnClickListenerC07467e A06;
    @DoNotStrip
    public AbstractC1219Qv A07;
    public C1220Qw A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final Q2 A0C = new UT(this);
    public final AtomicBoolean A0D = new AtomicBoolean(false);
    public final AtomicBoolean A0E = new AtomicBoolean(false);
    public KA A03 = KA.A03;

    public static String A06(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0F, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 127);
        }
        return new String(copyOfRange);
    }

    public static void A0E() {
        A0F = new byte[]{7, 32, 56, 47, 34, 39, 42, 110, 60, 43, 32, 42, 43, 60, 43, 60, 110, 45, 38, 39, 34, 42, 110, 45, 33, 32, 40, 39, 41, 96, 14, 38, 39, 42, 34, 21, 42, 38, 52, 21, 42, 39, 38, 44, 99, 42, 48, 99, 45, 54, 47, 47, 120, 99, 54, 45, 34, 33, 47, 38, 99, 55, 44, 99, 37, 42, 45, 39, 99, 42, 55, 109, 16, 43, 36, 39, 41, 32, 101, 49, 42, 101, 35, 44, 43, 33, 101, 8, 32, 33, 44, 36, 19, 44, 32, 50, 19, 44, 33, 32, 42, 101, 38, 45, 44, 41, 33, 107};
    }

    static {
        A0E();
        A0H = UN.class.getSimpleName();
    }

    private K0 A01(MediaViewVideoRendererApi mediaViewVideoRendererApi) {
        return new US(this, mediaViewVideoRendererApi);
    }

    private K0 A02(MediaViewVideoRendererApi mediaViewVideoRendererApi) {
        return new UR(this, mediaViewVideoRendererApi);
    }

    private AbstractC1219Qv A04() {
        return new UP(this);
    }

    private C1220Qw A05() {
        return new C1220Qw(this.A00, 50, true, new WeakReference(this.A07), this.A01);
    }

    private void A09() {
        C0819Al c0819Al = this.A04;
        if (c0819Al != null) {
            Q3 q32 = (Q3) c0819Al.getVideoView();
            if (A0G[3].length() != 24) {
                throw new RuntimeException();
            }
            String[] strArr = A0G;
            strArr[2] = "uL1T6UePNJ7Kw1irCYcqiA1GlgiEZ";
            strArr[0] = "2BZHbySyGqLzqR4K5b7TQMpiAd64K";
            q32.setViewImplInflationListener(this.A0C);
        }
    }

    private void A0A() {
        C0819Al c0819Al = this.A04;
        if (c0819Al != null) {
            c0819Al.getVideoView().setOnTouchListener(new View$OnTouchListenerC1044Jx(this));
        }
    }

    private void A0B() {
        C0819Al c0819Al = this.A04;
        if (c0819Al != null) {
            Q3 q32 = (Q3) c0819Al.getVideoView();
            String[] strArr = A0G;
            if (strArr[4].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            A0G[7] = "MUEPyY1MJMWvhU3XHu";
            q32.setViewImplInflationListener(null);
        }
    }

    private void A0C() {
        if (this.A00.getVisibility() == 0 && this.A09) {
            MediaViewVideoRenderer mediaViewVideoRenderer = this.A00;
            String[] strArr = A0G;
            if (strArr[4].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0G;
            strArr2[4] = "vtumVYeB8x7vkBeCNzRl37Vgwgf5m";
            strArr2[1] = "l5c2Nb35iHyego1JNAmcVzJY15xyfp";
            if (mediaViewVideoRenderer.hasWindowFocus()) {
                this.A08.A0U();
                return;
            }
        }
        C0819Al c0819Al = this.A04;
        if (c0819Al != null && c0819Al.getState() == EnumC1217Qt.A05) {
            this.A0B = true;
        }
        this.A08.A0V();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D() {
        this.A03 = KA.A03;
        A0B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0I(UB ub2, @Nullable InterfaceC1045Jy interfaceC1045Jy) {
        String str;
        this.A0A = false;
        this.A0B = false;
        this.A02 = interfaceC1045Jy;
        A09();
        C07517m c07517m = this.A05;
        if (ub2 != null) {
            K5 adCoverImage = ub2.getAdCoverImage();
            String[] strArr = A0G;
            if (strArr[2].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            A0G[3] = "zpp3cHPhluFOPvL30kkcY8af";
            if (adCoverImage != null) {
                str = ub2.getAdCoverImage().getUrl();
                c07517m.setImage(str, new UQ(this));
                this.A03 = ub2.A18();
                this.A06.setPlayAccessibilityLabel(ub2.A1E());
                this.A06.setPauseAccessibilityLabel(ub2.A1D());
                this.A08.A0U();
            }
        }
        str = null;
        c07517m.setImage(str, new UQ(this));
        this.A03 = ub2.A18();
        this.A06.setPlayAccessibilityLabel(ub2.A1E());
        this.A06.setPauseAccessibilityLabel(ub2.A1D());
        this.A08.A0U();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0J(Q6 q62) {
        C0819Al c0819Al = this.A04;
        if (c0819Al != null) {
            c0819Al.A0b(q62, 24);
        } else if (!AdInternalSettings.isDebugBuild()) {
        } else {
            Log.e(A0H, A06(30, 42, 60));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0K() {
        C0819Al c0819Al = this.A04;
        if (c0819Al == null || c0819Al.getState() == EnumC1217Qt.A06) {
            return false;
        }
        return this.A03 == KA.A05 || this.A03 == KA.A03;
    }

    @Override // com.facebook.ads.internal.api.DefaultMediaViewVideoRendererApi
    public final void initialize(Context context, MediaViewVideoRenderer mediaViewVideoRenderer, MediaViewVideoRendererApi mediaViewVideoRendererApi, int i10) {
        K0 A02;
        ((C5E) mediaViewVideoRendererApi.getAdComponentViewApi()).A00(this);
        if (i10 == 0) {
            A02 = A02(mediaViewVideoRendererApi);
        } else if (i10 == 1) {
            A02 = A01(mediaViewVideoRendererApi);
        } else {
            throw new IllegalArgumentException(A06(0, 30, 49));
        }
        ((C5L) mediaViewVideoRendererApi).A06(A02);
        this.A01 = C5G.A02(context);
        this.A00 = mediaViewVideoRenderer;
        this.A05 = new C07517m(this.A01);
        this.A07 = A04();
        this.A08 = A05();
        float f10 = Lr.A00;
        int i11 = (int) (2.0f * f10);
        int i12 = (int) (25.0f * f10);
        this.A06 = new View$OnClickListenerC07467e(this.A01);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(9);
        layoutParams.addRule(12);
        this.A06.setPadding(i11, i12, i12, i11);
        this.A06.setLayoutParams(layoutParams);
        int i13 = 0;
        while (true) {
            int childCount = this.A00.getChildCount();
            if (A0G[3].length() == 24) {
                String[] strArr = A0G;
                strArr[2] = "oEzbzrDqpY4LpZuK9aeaZZijHYv0V";
                strArr[0] = "65U2aK7TrzSKlLOXQMMYyslcv3rZK";
                if (i13 >= childCount) {
                    break;
                }
                View childAt = this.A00.getChildAt(0);
                if (childAt instanceof C0819Al) {
                    this.A04 = (C0819Al) childAt;
                    break;
                }
                i13++;
            } else {
                throw new RuntimeException();
            }
        }
        C0819Al c0819Al = this.A04;
        if (c0819Al == null) {
            if (AdInternalSettings.isDebugBuild()) {
                Log.e(A0H, A06(72, 36, 58));
            }
        } else {
            c0819Al.A0c(this.A05);
            this.A04.A0c(this.A06);
        }
        this.A08.A0W(0);
        this.A08.A0X(IronSourceConstants.INTERSTITIAL_DAILY_CAPPED);
        A02.AEa();
        String[] strArr2 = A0G;
        if (strArr2[4].length() != strArr2[1].length()) {
            String[] strArr3 = A0G;
            strArr3[4] = "NjD77g9sbns6FUonJskLzorZMVzfs";
            strArr3[1] = "sF6jyMJNRDvSJleY8k7g51skJQqlgl";
            return;
        }
        String[] strArr4 = A0G;
        strArr4[2] = "irNdkufru0tgAA9z3l7YlJhRv0dZK";
        strArr4[0] = "zN5wNlZvELtjdUjcESL7VUEU7ru13";
    }

    @Override // com.facebook.ads.redexgen.X.C5E, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A09 = true;
        A0C();
    }

    @Override // com.facebook.ads.redexgen.X.C5E, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A09 = false;
        A0C();
    }

    @Override // com.facebook.ads.internal.api.DefaultMediaViewVideoRendererApi
    public final void onPrepared() {
        this.A00.setOnTouchListener(new View$OnTouchListenerC1043Jw(this));
        A0A();
    }

    @Override // com.facebook.ads.redexgen.X.C5E, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        A0C();
    }

    @Override // com.facebook.ads.redexgen.X.C5E, com.facebook.ads.internal.api.AdComponentView
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        A0C();
    }
}
