package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.dynamic.b.h;
import com.bytedance.sdk.component.utils.t;

/* loaded from: classes.dex */
public class DynamicSkipCountDown extends DynamicButton implements com.bytedance.sdk.component.adexpress.dynamic.b {
    public DynamicSkipCountDown(Context context, DynamicRootView dynamicRootView, h hVar) {
        super(context, dynamicRootView, hVar);
        dynamicRootView.setTimeOutListener(this);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.b
    public void a(CharSequence charSequence, boolean z10, int i10) {
        if (i10 == 0) {
            if (getParent() != null) {
                ((ViewGroup) getParent()).removeView(this);
            }
        } else {
            String a10 = t.a(com.bytedance.sdk.component.adexpress.c.a(), "tt_reward_full_skip_count_down");
            ((TextView) this.f9697o).setText(" | " + String.format(a10, Integer.valueOf(i10)));
        }
        requestLayout();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget
    public void f() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f9689g, this.f9690h);
        layoutParams.leftMargin = this.f9691i;
        layoutParams.gravity = 16;
        setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicButton, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp
    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(-2, -2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (TextUtils.isEmpty(((TextView) this.f9697o).getText())) {
            setMeasuredDimension(0, this.f9690h);
        }
    }
}
