package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.dynamic.b.h;
import com.bytedance.sdk.component.utils.t;

/* loaded from: classes.dex */
public class DynamicSkipCountDownBtn extends DynamicButton implements com.bytedance.sdk.component.adexpress.dynamic.b {

    /* renamed from: a  reason: collision with root package name */
    private int[] f9733a;

    /* renamed from: b  reason: collision with root package name */
    private int f9734b;

    /* renamed from: s  reason: collision with root package name */
    private int f9735s;

    public DynamicSkipCountDownBtn(Context context, DynamicRootView dynamicRootView, h hVar) {
        super(context, dynamicRootView, hVar);
        dynamicRootView.setTimeOutListener(this);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.b
    @SuppressLint({"SetTextI18n"})
    public void a(CharSequence charSequence, boolean z10, int i10) {
        String a10 = t.a(com.bytedance.sdk.component.adexpress.c.a(), "tt_reward_screen_skip_tx");
        if (i10 == 0) {
            this.f9697o.setVisibility(0);
            ((TextView) this.f9697o).setText(" | " + a10);
            this.f9697o.measure(-2, -2);
            this.f9733a = new int[]{this.f9697o.getMeasuredWidth() + 1, this.f9697o.getMeasuredHeight()};
            View view = this.f9697o;
            int[] iArr = this.f9733a;
            view.setLayoutParams(new FrameLayout.LayoutParams(iArr[0], iArr[1]));
            ((TextView) this.f9697o).setGravity(17);
            ((TextView) this.f9697o).setIncludeFontPadding(false);
            a();
            this.f9697o.setPadding(this.f9694l.c(), this.f9734b, this.f9694l.d(), this.f9735s);
        }
        requestLayout();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget
    public void f() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f9689g, this.f9690h);
        layoutParams.gravity = 21;
        setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicButton, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.b
    public boolean h() {
        super.h();
        ((TextView) this.f9697o).setText("");
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (TextUtils.isEmpty(((TextView) this.f9697o).getText())) {
            setMeasuredDimension(0, this.f9690h);
        } else {
            setMeasuredDimension(this.f9689g, this.f9690h);
        }
    }

    private void a() {
        this.f9734b = ((this.f9690h - ((int) com.bytedance.sdk.component.adexpress.c.b.a(this.f9693k, this.f9694l.e()))) / 2) - this.f9694l.a();
        this.f9735s = 0;
    }
}
