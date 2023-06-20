package com.facebook.ads.redexgen.X;

import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.7e */
/* loaded from: assets/audience_network.dex */
public final class View$OnClickListenerC07467e extends NQ implements View.OnClickListener {
    public static String[] A05 = {"dj2bca5KMhic7lU7SNdjndSTQwmssf52", "TPlcacN2BRfqpmqqou3eGj4ypEirHC", "lK1i5T", "LDnNwGMA5Xj1Rc4RK", "9vPtQslMJEvaRYxyY6ZiMi1q6kn3NQTo", "pbwCeIFhJ07zfEQSECI2TdcOW", "Wj7W52", "ztBFgo3EeJBil6N8wes8zN"};
    public final N6 A00;
    public final AbstractC1093Lz A01;
    public final AbstractC1079Lj A02;
    public final L4 A03;
    public final QR A04;

    public View$OnClickListenerC07467e(C1400Xy c1400Xy) {
        this(c1400Xy, null);
    }

    public View$OnClickListenerC07467e(C1400Xy c1400Xy, AttributeSet attributeSet) {
        this(c1400Xy, attributeSet, 0);
    }

    public View$OnClickListenerC07467e(C1400Xy c1400Xy, AttributeSet attributeSet, int i10) {
        super(c1400Xy, attributeSet, i10);
        this.A03 = new L4() { // from class: com.facebook.ads.redexgen.X.7l
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC07859c
            /* renamed from: A00 */
            public final void A03(LG lg) {
                View$OnClickListenerC07467e.this.setVisibility(0);
            }
        };
        this.A01 = new AbstractC1093Lz() { // from class: com.facebook.ads.redexgen.X.7k
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC07859c
            /* renamed from: A00 */
            public final void A03(AnonymousClass85 anonymousClass85) {
                View$OnClickListenerC07467e.A00(View$OnClickListenerC07467e.this).setChecked(true);
            }
        };
        this.A02 = new AbstractC1079Lj() { // from class: com.facebook.ads.redexgen.X.7g
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC07859c
            /* renamed from: A00 */
            public final void A03(C1092Ly c1092Ly) {
                View$OnClickListenerC07467e.A00(View$OnClickListenerC07467e.this).setChecked(false);
            }
        };
        this.A00 = new N6() { // from class: com.facebook.ads.redexgen.X.7f
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC07859c
            /* renamed from: A00 */
            public final void A03(AnonymousClass88 anonymousClass88) {
                View$OnClickListenerC07467e.A00(View$OnClickListenerC07467e.this).setChecked(true);
            }
        };
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.A04 = new QR(c1400Xy);
        this.A04.setChecked(true);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) (displayMetrics.density * 25.0f), (int) (displayMetrics.density * 25.0f));
        setVisibility(8);
        addView(this.A04, layoutParams);
        setClickable(true);
        setFocusable(true);
    }

    public static /* synthetic */ QR A00(View$OnClickListenerC07467e view$OnClickListenerC07467e) {
        return view$OnClickListenerC07467e.A04;
    }

    @Override // com.facebook.ads.redexgen.X.NQ
    public final void A07() {
        super.A07();
        setOnClickListener(this);
        this.A04.setOnClickListener(this);
        if (getVideoView() != null) {
            getVideoView().getEventBus().A03(this.A03, this.A00, this.A01, this.A02);
        }
    }

    @Override // com.facebook.ads.redexgen.X.NQ
    public final void A08() {
        if (getVideoView() != null) {
            getVideoView().getEventBus().A04(this.A02, this.A01, this.A00, this.A03);
        }
        setOnClickListener(null);
        this.A04.setOnClickListener(null);
        super.A08();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (L0.A02(this)) {
            return;
        }
        try {
            QK videoView = getVideoView();
            if (videoView == null) {
                return;
            }
            if (videoView.getState() == EnumC1217Qt.A07 || videoView.getState() == EnumC1217Qt.A05 || videoView.getState() == EnumC1217Qt.A06) {
                videoView.A0b(Q6.A04, 11);
            } else if (videoView.getState() == EnumC1217Qt.A0A) {
                videoView.A0e(true, 7);
            }
        } catch (Throwable th) {
            if (A05[5].length() != 25) {
                throw new RuntimeException();
            }
            A05[7] = "YsoDkb8mAWGLBYzRGBa3i8";
            L0.A00(th, this);
        }
    }

    public void setPauseAccessibilityLabel(@Nullable String str) {
        this.A04.setPauseAccessibilityLabel(str);
    }

    public void setPlayAccessibilityLabel(@Nullable String str) {
        this.A04.setPlayAccessibilityLabel(str);
    }
}
