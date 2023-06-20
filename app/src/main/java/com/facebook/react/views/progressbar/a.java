package com.facebook.react.views.progressbar;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;

/* compiled from: ProgressBarContainerView.java */
/* loaded from: classes.dex */
class a extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private Integer f16151a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f16152b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f16153c;

    /* renamed from: d  reason: collision with root package name */
    private double f16154d;

    /* renamed from: e  reason: collision with root package name */
    private ProgressBar f16155e;

    public a(Context context) {
        super(context);
        this.f16152b = true;
        this.f16153c = true;
    }

    private void c(ProgressBar progressBar) {
        Drawable progressDrawable;
        if (progressBar.isIndeterminate()) {
            progressDrawable = progressBar.getIndeterminateDrawable();
        } else {
            progressDrawable = progressBar.getProgressDrawable();
        }
        if (progressDrawable == null) {
            return;
        }
        Integer num = this.f16151a;
        if (num != null) {
            progressDrawable.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        } else {
            progressDrawable.clearColorFilter();
        }
    }

    public void a() {
        ProgressBar progressBar = this.f16155e;
        if (progressBar != null) {
            progressBar.setIndeterminate(this.f16152b);
            c(this.f16155e);
            this.f16155e.setProgress((int) (this.f16154d * 1000.0d));
            if (this.f16153c) {
                this.f16155e.setVisibility(0);
                return;
            } else {
                this.f16155e.setVisibility(4);
                return;
            }
        }
        throw new JSApplicationIllegalArgumentException("setStyle() not called");
    }

    public void b(boolean z10) {
        this.f16153c = z10;
    }

    public void d(Integer num) {
        this.f16151a = num;
    }

    public void e(boolean z10) {
        this.f16152b = z10;
    }

    public void f(double d10) {
        this.f16154d = d10;
    }

    public void g(String str) {
        ProgressBar createProgressBar = ReactProgressBarViewManager.createProgressBar(getContext(), ReactProgressBarViewManager.getStyleFromString(str));
        this.f16155e = createProgressBar;
        createProgressBar.setMax(1000);
        removeAllViews();
        addView(this.f16155e, new ViewGroup.LayoutParams(-1, -1));
    }
}
