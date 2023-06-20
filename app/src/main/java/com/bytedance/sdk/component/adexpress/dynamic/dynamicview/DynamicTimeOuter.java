package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.dynamic.b.h;

/* loaded from: classes.dex */
public class DynamicTimeOuter extends DynamicButton implements com.bytedance.sdk.component.adexpress.dynamic.b {
    public DynamicTimeOuter(Context context, DynamicRootView dynamicRootView, h hVar) {
        super(context, dynamicRootView, hVar);
        dynamicRootView.setTimeOutListener(this);
        if ("timedown".equals(hVar.i().b())) {
            dynamicRootView.setTimedown(this.f9690h);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.b
    public void a(CharSequence charSequence, boolean z10, int i10) {
        if ("timedown".equals(this.f9695m.i().b())) {
            ((TextView) this.f9697o).setText(charSequence);
            return;
        }
        ((TextView) this.f9697o).setText(((Object) charSequence) + "s");
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget
    public void f() {
        if (!TextUtils.equals("skip-with-countdowns-video-countdown", this.f9695m.i().b()) && !TextUtils.equals("skip-with-time-countdown", this.f9695m.i().b())) {
            super.f();
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f9689g, this.f9690h);
        layoutParams.gravity = 19;
        setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicButton, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.b
    public boolean h() {
        super.h();
        if ("timedown".equals(this.f9695m.i().b())) {
            ((TextView) this.f9697o).setText(String.valueOf((int) Double.parseDouble(this.f9694l.j())));
            return true;
        }
        ((TextView) this.f9697o).setText(((int) Double.parseDouble(this.f9694l.j())) + "s");
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
