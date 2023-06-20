package com.chartboost.sdk.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public class f2 extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    private j3 f14005a;

    /* renamed from: b  reason: collision with root package name */
    private final com.chartboost.sdk.Model.c f14006b;

    public f2(Context context, com.chartboost.sdk.Model.c cVar) {
        super(context);
        this.f14006b = cVar;
    }

    public void a() {
    }

    public View b() {
        return this.f14005a;
    }

    public com.chartboost.sdk.Model.c c() {
        return this.f14006b;
    }

    public boolean d() {
        j3 j3Var = this.f14005a;
        return j3Var != null && j3Var.getVisibility() == 0;
    }

    public void e() {
        if (this.f14005a == null) {
            j3 j10 = this.f14006b.j();
            this.f14005a = j10;
            if (j10 != null) {
                addView(j10, new RelativeLayout.LayoutParams(-1, -1));
                this.f14005a.a(false, this.f14006b);
            }
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        performClick();
        return true;
    }

    @Override // android.view.View
    public boolean performClick() {
        super.performClick();
        return true;
    }
}
