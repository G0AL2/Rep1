package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.PorterDuff;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.applovin.sdk.AppLovinSdkUtils;

/* loaded from: classes.dex */
public class a extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    private final ProgressBar f6831a;

    public a(Context context, int i10, int i11) {
        super(context);
        RelativeLayout.LayoutParams layoutParams;
        setClickable(false);
        ProgressBar progressBar = new ProgressBar(context, null, i11);
        this.f6831a = progressBar;
        progressBar.setIndeterminate(true);
        progressBar.setClickable(false);
        if (i10 == -2 || i10 == -1) {
            layoutParams = new RelativeLayout.LayoutParams(i10, i10);
        } else {
            int dpToPx = AppLovinSdkUtils.dpToPx(context, i10);
            layoutParams = new RelativeLayout.LayoutParams(dpToPx, dpToPx);
        }
        layoutParams.addRule(13);
        progressBar.setLayoutParams(layoutParams);
        addView(progressBar);
    }

    public void a() {
        setVisibility(0);
    }

    public void b() {
        setVisibility(8);
    }

    public void setColor(int i10) {
        this.f6831a.getIndeterminateDrawable().setColorFilter(i10, PorterDuff.Mode.SRC_IN);
    }
}
