package com.facebook.ads.redexgen.X;

import android.animation.ObjectAnimator;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.view.animation.LinearInterpolator;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Ix */
/* loaded from: assets/audience_network.dex */
public final class C1018Ix extends RelativeLayout implements Q7 {
    public static byte[] A08;
    public static final int A09;
    public int A00;
    public ObjectAnimator A01;
    public ProgressBar A02;
    public AbstractC07859c A03;
    public AbstractC07859c A04;
    public AbstractC07859c A05;
    public AbstractC07859c A06;
    @Nullable
    public QK A07;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 20);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A08 = new byte[]{-71, -69, -72, -80, -69, -82, -68, -68};
    }

    static {
        A03();
        A09 = (int) (Lr.A00 * 6.0f);
    }

    public C1018Ix(C1400Xy c1400Xy) {
        this(c1400Xy, A09, -12549889, 0);
    }

    public C1018Ix(C1400Xy c1400Xy, int i10, int i11, int i12) {
        super(c1400Xy);
        this.A00 = -1;
        this.A06 = new L3() { // from class: com.facebook.ads.redexgen.X.64
            public static String[] A01 = {"5cZwmFwOCvoIimHKJKs7c8Wrfuwl5", "kR6Rx7ETQGlVhfpD5OxJcFg21Ovz094i", "oaAjYFLN3m9AYmyloxlSIBJp6ETHW3KF", "dCQrNLE74jmKWuOaqJJ4Sbhiwuuv5ad", "onBgfHhqxGhqxLvpU2wfKqg3mDsyExyq", "SCROov7hAW1gh5oss5LLtyUv0yBfa", "SAPoZVZ00ZwZwmL71sxtzrpJli3hIy2X", "TEn6j3AzMnGgqeyMrOghHZKrMbMLSMuC"};

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC07859c
            /* renamed from: A00 */
            public final void A03(AnonymousClass84 anonymousClass84) {
                QK qk;
                qk = C1018Ix.this.A07;
                if (qk != null) {
                    C1018Ix c1018Ix = C1018Ix.this;
                    String[] strArr = A01;
                    if (strArr[2].charAt(14) == strArr[4].charAt(14)) {
                        throw new RuntimeException();
                    }
                    A01[1] = "B8raFzKF2tgWcMrESvgtBPeFcOBIsHL1";
                    c1018Ix.A07(true);
                }
            }
        };
        this.A04 = new AbstractC1093Lz() { // from class: com.facebook.ads.redexgen.X.4p
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC07859c
            /* renamed from: A00 */
            public final void A03(AnonymousClass85 anonymousClass85) {
                C1018Ix.A04(C1018Ix.this);
            }
        };
        this.A05 = new AbstractC1079Lj() { // from class: com.facebook.ads.redexgen.X.4h
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC07859c
            /* renamed from: A00 */
            public final void A03(C1092Ly c1092Ly) {
                QK qk;
                qk = C1018Ix.this.A07;
                if (qk != null) {
                    C1018Ix.this.A07(true);
                }
            }
        };
        this.A03 = new N6() { // from class: com.facebook.ads.redexgen.X.4V
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC07859c
            /* renamed from: A00 */
            public final void A03(AnonymousClass88 anonymousClass88) {
                QK qk;
                qk = C1018Ix.this.A07;
                if (qk != null) {
                    C1018Ix.this.A05();
                }
            }
        };
        this.A02 = new ProgressBar(c1400Xy, null, 16842872);
        A06(i11, i12);
        this.A02.setMax(10000);
        addView(this.A02, new RelativeLayout.LayoutParams(-1, i10));
    }

    public void A02() {
        ObjectAnimator objectAnimator = this.A01;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.A01.setTarget(null);
            this.A01 = null;
            this.A02.clearAnimation();
        }
    }

    public static /* synthetic */ void A04(C1018Ix c1018Ix) {
        c1018Ix.A02();
    }

    public final void A05() {
        A02();
        this.A01 = ObjectAnimator.ofInt(this.A02, A01(0, 8, 53), 0, 0);
        this.A01.setDuration(0L);
        this.A01.setInterpolator(new LinearInterpolator());
        this.A01.start();
        this.A00 = -1;
    }

    public final void A06(int i10, int i11) {
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{new ColorDrawable(i11), new ColorDrawable(i11), new ScaleDrawable(new ColorDrawable(i10), 8388611, 1.0f, -1.0f)});
        layerDrawable.setId(0, 16908288);
        layerDrawable.setId(1, 16908303);
        layerDrawable.setId(2, 16908301);
        this.A02.setProgressDrawable(layerDrawable);
    }

    public final void A07(boolean z10) {
        if (this.A07 == null) {
            return;
        }
        A02();
        int currentPositionInMillis = this.A07.getCurrentPositionInMillis();
        int duration = this.A07.getDuration();
        int i10 = duration > 0 ? (currentPositionInMillis * 10000) / duration : 0;
        int i11 = this.A00;
        if (i11 >= i10 || duration <= currentPositionInMillis) {
            return;
        }
        if (z10) {
            this.A01 = ObjectAnimator.ofInt(this.A02, A01(0, 8, 53), i11, i10);
            ObjectAnimator objectAnimator = this.A01;
            int progress = Math.min((int) IronSourceConstants.INTERSTITIAL_DAILY_CAPPED, duration - currentPositionInMillis);
            objectAnimator.setDuration(progress);
            this.A01.setInterpolator(new LinearInterpolator());
            this.A01.start();
        } else {
            this.A02.setProgress(i10);
        }
        this.A00 = i10;
    }

    @Override // com.facebook.ads.redexgen.X.Q7
    public final void A8o(QK qk) {
        this.A07 = qk;
        qk.getEventBus().A03(this.A04, this.A05, this.A06, this.A03);
    }

    @Override // com.facebook.ads.redexgen.X.Q7
    public final void AFG(QK qk) {
        qk.getEventBus().A04(this.A06, this.A05, this.A04, this.A03);
        this.A07 = null;
    }
}
