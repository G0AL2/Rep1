package com.facebook.ads.redexgen.X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.DisplayMetrics;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.facebook.ads.redexgen.X.6p */
/* loaded from: assets/audience_network.dex */
public final class C07326p extends NQ {
    public final Paint A00;
    public final C1400Xy A01;
    @Nullable
    public final C1036Jp A02;
    public final N6 A03;
    public final AbstractC1093Lz A04;
    public final AbstractC1079Lj A05;
    public final QR A06;

    public C07326p(C1400Xy c1400Xy, boolean z10, @Nullable C1036Jp c1036Jp) {
        super(c1400Xy);
        this.A04 = new AbstractC1093Lz() { // from class: com.facebook.ads.redexgen.X.7b
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC07859c
            /* renamed from: A00 */
            public final void A03(AnonymousClass85 anonymousClass85) {
                C07326p.A06(C07326p.this).setChecked(true);
            }
        };
        this.A05 = new AbstractC1079Lj() { // from class: com.facebook.ads.redexgen.X.7a
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC07859c
            /* renamed from: A00 */
            public final void A03(C1092Ly c1092Ly) {
                C07326p.A06(C07326p.this).setChecked(false);
            }
        };
        this.A03 = new N6() { // from class: com.facebook.ads.redexgen.X.7O
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC07859c
            /* renamed from: A00 */
            public final void A03(AnonymousClass88 anonymousClass88) {
                C07326p.A06(C07326p.this).setChecked(true);
            }
        };
        this.A02 = c1036Jp;
        this.A01 = c1400Xy;
        this.A06 = new QR(c1400Xy, z10);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) (displayMetrics.density * 23.76d), (int) (displayMetrics.density * 23.76d));
        layoutParams.addRule(13);
        this.A06.setLayoutParams(layoutParams);
        this.A06.setChecked(true);
        this.A06.setClickable(false);
        this.A00 = new Paint();
        this.A00.setStyle(Paint.Style.FILL);
        if (z10) {
            this.A00.setColor(-1728053248);
        } else {
            this.A00.setColor(-1);
            this.A00.setAlpha(204);
        }
        MS.A0M(this, 0);
        addView(this.A06);
        setGravity(17);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams((int) (displayMetrics.density * 72.0d), (int) (displayMetrics.density * 72.0d));
        layoutParams2.addRule(13);
        setLayoutParams(layoutParams2);
        MS.A0G(IronSourceError.AUCTION_ERROR_EMPTY_WATERFALL, this);
    }

    public static /* synthetic */ QR A06(C07326p c07326p) {
        return c07326p.A06;
    }

    @Override // com.facebook.ads.redexgen.X.NQ
    public final void A07() {
        super.A07();
        if (getVideoView() != null) {
            getVideoView().getEventBus().A03(this.A04, this.A05, this.A03);
        }
        setOnClickListener(new QO(this));
    }

    @Override // com.facebook.ads.redexgen.X.NQ
    public final void A08() {
        setOnClickListener(null);
        if (getVideoView() != null) {
            getVideoView().getEventBus().A04(this.A03, this.A05, this.A04);
        }
        super.A08();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int centerX = Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        int i10 = centerX / 2;
        canvas.drawCircle(getPaddingLeft() + i10, getPaddingTop() + (centerX / 2), i10, this.A00);
        super.onDraw(canvas);
    }
}
