package com.bytedance.sdk.component.adexpress.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.sdk.component.adexpress.c.b;
import com.bytedance.sdk.component.utils.t;

/* loaded from: classes.dex */
public class TTRatingBar2 extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    LinearLayout f9941a;

    /* renamed from: b  reason: collision with root package name */
    LinearLayout f9942b;

    /* renamed from: c  reason: collision with root package name */
    private float f9943c;

    /* renamed from: d  reason: collision with root package name */
    private float f9944d;

    /* renamed from: e  reason: collision with root package name */
    private Drawable f9945e;

    /* renamed from: f  reason: collision with root package name */
    private Drawable f9946f;

    /* renamed from: g  reason: collision with root package name */
    private double f9947g;

    public TTRatingBar2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9941a = new LinearLayout(getContext());
        this.f9942b = new LinearLayout(getContext());
        this.f9941a.setOrientation(0);
        this.f9941a.setGravity(8388611);
        this.f9942b.setOrientation(0);
        this.f9942b.setGravity(8388611);
        this.f9945e = t.c(context, "tt_star_thick");
        this.f9946f = t.c(context, "tt_star");
    }

    private ImageView getStarImageView() {
        ImageView imageView = new ImageView(getContext());
        imageView.setLayoutParams(new ViewGroup.LayoutParams((int) this.f9943c, (int) this.f9944d));
        imageView.setPadding(1, 4, 1, 0);
        return imageView;
    }

    public void a(double d10, int i10, int i11) {
        float f10 = i11;
        this.f9943c = b.c(getContext(), f10);
        this.f9944d = b.c(getContext(), f10);
        this.f9947g = d10;
        removeAllViews();
        for (int i12 = 0; i12 < 5; i12++) {
            ImageView starImageView = getStarImageView();
            starImageView.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView.setColorFilter(i10);
            starImageView.setImageDrawable(getStarFillDrawable());
            this.f9942b.addView(starImageView);
        }
        for (int i13 = 0; i13 < 5; i13++) {
            ImageView starImageView2 = getStarImageView();
            starImageView2.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView2.setImageDrawable(getStarEmptyDrawable());
            this.f9941a.addView(starImageView2);
        }
        addView(this.f9941a);
        addView(this.f9942b);
        requestLayout();
    }

    public Drawable getStarEmptyDrawable() {
        return this.f9945e;
    }

    public Drawable getStarFillDrawable() {
        return this.f9946f;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f9941a.measure(i10, i11);
        double d10 = this.f9947g;
        float f10 = this.f9943c;
        this.f9942b.measure(View.MeasureSpec.makeMeasureSpec((int) ((((int) d10) * f10) + 1.0f + ((f10 - 2.0f) * (d10 - ((int) d10)))), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f9941a.getMeasuredHeight(), 1073741824));
    }
}
