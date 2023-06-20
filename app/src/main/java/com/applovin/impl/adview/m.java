package com.applovin.impl.adview;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.applovin.impl.adview.i;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public class m extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private i f7081a;

    /* renamed from: b  reason: collision with root package name */
    private int f7082b;

    public m(i.a aVar, Activity activity) {
        super(activity);
        setBackgroundColor(0);
        i a10 = i.a(aVar, activity);
        this.f7081a = a10;
        addView(a10);
    }

    public void a(int i10, int i11, int i12, int i13) {
        this.f7082b = i10;
        int i14 = i11 + i10 + i12;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = i14;
            layoutParams.width = i14;
        } else {
            setLayoutParams(new FrameLayout.LayoutParams(i14, i14));
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i10, i10, i13);
        layoutParams2.setMargins(i12, i12, i12, 0);
        this.f7081a.setLayoutParams(layoutParams2);
        this.f7081a.a(i10);
    }

    public void a(i.a aVar) {
        if (aVar == null || aVar == this.f7081a.getStyle()) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.f7081a.getLayoutParams();
        removeView(this.f7081a);
        i a10 = i.a(aVar, getContext());
        this.f7081a = a10;
        addView(a10);
        this.f7081a.setLayoutParams(layoutParams);
        this.f7081a.a(this.f7082b);
    }
}
