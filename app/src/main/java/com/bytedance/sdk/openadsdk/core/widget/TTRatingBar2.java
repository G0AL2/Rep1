package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.utils.v;

/* loaded from: classes.dex */
public class TTRatingBar2 extends FrameLayout {

    /* renamed from: h  reason: collision with root package name */
    private static final int f13060h = (int) v.c(m.a(), 1.0f);

    /* renamed from: i  reason: collision with root package name */
    private static final int f13061i = (int) v.c(m.a(), 0.0f);

    /* renamed from: j  reason: collision with root package name */
    private static final int f13062j = (int) v.c(m.a(), 1.0f);

    /* renamed from: k  reason: collision with root package name */
    private static final int f13063k = (int) v.c(m.a(), 3.0f);

    /* renamed from: a  reason: collision with root package name */
    LinearLayout f13064a;

    /* renamed from: b  reason: collision with root package name */
    LinearLayout f13065b;

    /* renamed from: c  reason: collision with root package name */
    private float f13066c;

    /* renamed from: d  reason: collision with root package name */
    private float f13067d;

    /* renamed from: e  reason: collision with root package name */
    private Drawable f13068e;

    /* renamed from: f  reason: collision with root package name */
    private Drawable f13069f;

    /* renamed from: g  reason: collision with root package name */
    private double f13070g;

    public TTRatingBar2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13064a = new LinearLayout(getContext());
        this.f13065b = new LinearLayout(getContext());
        this.f13064a.setOrientation(0);
        this.f13064a.setGravity(8388611);
        this.f13065b.setOrientation(0);
        this.f13065b.setGravity(8388611);
        this.f13068e = t.c(context, "tt_star_thick");
        this.f13069f = t.c(context, "tt_star");
    }

    private ImageView getStarImageView() {
        ImageView imageView = new ImageView(getContext());
        imageView.setLayoutParams(new ViewGroup.LayoutParams((int) this.f13066c, (int) this.f13067d));
        imageView.setPadding(f13060h, f13061i, f13062j, f13063k);
        return imageView;
    }

    public void a(double d10, int i10, int i11) {
        float f10 = i11;
        this.f13066c = (int) v.c(m.a(), f10);
        this.f13067d = (int) v.c(m.a(), f10);
        this.f13070g = d10;
        this.f13064a.removeAllViews();
        this.f13065b.removeAllViews();
        removeAllViews();
        for (int i12 = 0; i12 < 5; i12++) {
            ImageView starImageView = getStarImageView();
            starImageView.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView.setColorFilter(i10);
            starImageView.setImageDrawable(getStarFillDrawable());
            this.f13065b.addView(starImageView);
        }
        for (int i13 = 0; i13 < 5; i13++) {
            ImageView starImageView2 = getStarImageView();
            starImageView2.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView2.setImageDrawable(getStarEmptyDrawable());
            this.f13064a.addView(starImageView2);
        }
        addView(this.f13064a);
        addView(this.f13065b);
        requestLayout();
    }

    public Drawable getStarEmptyDrawable() {
        return this.f13068e;
    }

    public Drawable getStarFillDrawable() {
        return this.f13069f;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f13064a.measure(i10, i11);
        double d10 = this.f13070g;
        float f10 = this.f13066c;
        int i12 = f13060h;
        this.f13065b.measure(View.MeasureSpec.makeMeasureSpec((int) ((((int) d10) * f10) + i12 + ((f10 - (i12 + f13062j)) * (d10 - ((int) d10)))), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f13064a.getMeasuredHeight(), 1073741824));
    }
}
