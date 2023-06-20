package com.facebook.ads.redexgen.X;

import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;

/* loaded from: assets/audience_network.dex */
public final class PR extends LinearLayout {
    @Nullable
    public LinearLayout A00;
    public final int A01;
    public final C1400Xy A02;
    public final OW A03;
    public final C1148Oc A04;
    public static final int A07 = (int) (Lr.A00 * 16.0f);
    public static final int A08 = (int) (Lr.A00 * 16.0f);
    public static final int A06 = (int) (Lr.A00 * 8.0f);
    public static final int A05 = (int) (Lr.A00 * 72.0f);

    public PR(PP pp) {
        super(PP.A04(pp));
        this.A02 = PP.A04(pp);
        this.A03 = new OW(this.A02);
        this.A04 = new C1148Oc(this.A02, PP.A02(pp), true, false, true);
        this.A01 = PP.A00(pp);
        A03(pp);
    }

    public /* synthetic */ PR(PP pp, SL sl) {
        this(pp);
    }

    private void A00() {
        A01(this.A03, IronSourceConstants.REWARDED_VIDEO_DAILY_CAPPED);
        A01(this.A04, 170);
        LinearLayout linearLayout = this.A00;
        if (linearLayout != null) {
            A01(linearLayout, DownloadResource.STATUS_PENDING);
        }
    }

    private void A01(View view, int i10) {
        view.setTranslationY(i10);
        view.setScaleY(0.75f);
        view.setScaleX(0.75f);
        view.animate().translationYBy(-i10).scaleX(1.0f).scaleY(1.0f).setDuration(300L).setInterpolator(new DecelerateInterpolator(2.0f));
    }

    private void A02(PP pp) {
        if (!TextUtils.isEmpty(PP.A05(pp))) {
            this.A00 = new LinearLayout(getContext());
            this.A00.setGravity(17);
            LinearLayout linearLayout = this.A00;
            int i10 = A08;
            linearLayout.setPadding(i10, i10 / 2, i10, i10 / 2);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(0, A08 / 2, 0, 0);
            TextView textView = new TextView(getContext());
            textView.setTextColor(-1);
            MS.A0X(textView, false, 16);
            textView.setText(PP.A05(pp));
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            ImageView imageView = new ImageView(getContext());
            new T3(imageView, this.A02).A04().A07(PP.A06(pp));
            int i11 = A07;
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(i11, i11);
            layoutParams3.setMargins(0, 0, A08 / 2, 0);
            this.A00.addView(imageView, layoutParams3);
            this.A00.addView(textView, layoutParams2);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(100.0f);
            gradientDrawable.setColor(469762047);
            MS.A0S(this.A00, gradientDrawable);
            addView(this.A00, layoutParams);
        }
    }

    private void A03(PP pp) {
        MS.A0M(this.A03, 0);
        this.A03.setRadius(50);
        if (PP.A01(pp).A00() == C1G.A05) {
            this.A03.setFullCircleCorners(true);
        } else {
            this.A03.setRadius(A06);
        }
        new T3(this.A03, this.A02).A04().A07(PP.A03(pp).A01());
        this.A04.A01(PP.A01(pp).A06(), PP.A03(pp).A03(), null, false, true);
        this.A04.getDescriptionTextView().setAlpha(0.8f);
        this.A04.setAlignment(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int i10 = A08;
        layoutParams.setMargins(0, i10, 0, i10 / 2);
        View view = this.A03;
        int i11 = A05;
        addView(view, new LinearLayout.LayoutParams(i11, i11));
        addView(this.A04, layoutParams);
        A02(pp);
        MS.A0M(this, -14473425);
        setGravity(17);
        setOrientation(1);
    }

    public final void A04(PQ pq) {
        A00();
        postDelayed(new SL(this, pq), this.A01);
    }
}
