package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.dynamic.b.h;
import com.bytedance.sdk.component.utils.t;

/* loaded from: classes.dex */
public class DynamicTimeOuterSkip extends DynamicButton implements com.bytedance.sdk.component.adexpress.dynamic.b {

    /* renamed from: a  reason: collision with root package name */
    private boolean f9744a;

    public DynamicTimeOuterSkip(Context context, DynamicRootView dynamicRootView, h hVar) {
        super(context, dynamicRootView, hVar);
        dynamicRootView.setTimeOutListener(this);
        if (dynamicRootView.getRenderRequest() != null) {
            this.f9744a = dynamicRootView.getRenderRequest().n();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.b
    public void a(CharSequence charSequence, boolean z10, int i10) {
        String a10 = t.a(com.bytedance.sdk.component.adexpress.c.a(), "tt_reward_screen_skip_tx");
        if (z10) {
            if ("skip-with-time-skip-btn".equals(this.f9695m.i().b())) {
                if (com.bytedance.sdk.component.adexpress.c.b() && this.f9744a) {
                    a10 = "X";
                }
                ((TextView) this.f9697o).setText(" | " + a10);
            } else {
                ((TextView) this.f9697o).setText(a10);
            }
            setVisibility(0);
        } else {
            setVisibility(8);
        }
        requestLayout();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget
    public void f() {
        if (TextUtils.equals("skip-with-time-skip-btn", this.f9695m.i().b())) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f9689g, this.f9690h);
            layoutParams.gravity = 21;
            setLayoutParams(layoutParams);
        } else {
            super.f();
        }
        if (!"skip-with-time-skip-btn".equals(this.f9695m.i().b()) && Build.VERSION.SDK_INT >= 17) {
            this.f9697o.setTextAlignment(1);
            ((TextView) this.f9697o).setGravity(17);
        }
        setVisibility(8);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicButton, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.b
    public boolean h() {
        super.h();
        if (TextUtils.equals(this.f9695m.i().b(), "skip-with-time-skip-btn")) {
            ((TextView) this.f9697o).setText("");
            return true;
        }
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (TextUtils.isEmpty(((TextView) this.f9697o).getText())) {
            setMeasuredDimension(0, this.f9690h);
        }
    }
}
