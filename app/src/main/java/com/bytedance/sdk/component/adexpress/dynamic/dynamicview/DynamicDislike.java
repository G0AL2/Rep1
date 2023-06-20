package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.b.h;
import com.bytedance.sdk.component.adexpress.widget.DislikeView;

/* loaded from: classes.dex */
public class DynamicDislike extends DynamicBaseWidgetImp {
    public DynamicDislike(Context context, DynamicRootView dynamicRootView, h hVar) {
        super(context, dynamicRootView, hVar);
        DislikeView dislikeView = new DislikeView(context);
        this.f9697o = dislikeView;
        dislikeView.setTag(3);
        addView(this.f9697o, getWidgetLayoutParams());
        dynamicRootView.setDislikeView(this.f9697o);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.b
    public boolean h() {
        super.h();
        int a10 = (int) com.bytedance.sdk.component.adexpress.c.b.a(this.f9693k, this.f9694l.q());
        View view = this.f9697o;
        if (view instanceof DislikeView) {
            ((DislikeView) view).setRadius((int) com.bytedance.sdk.component.adexpress.c.b.a(this.f9693k, this.f9694l.o()));
            ((DislikeView) this.f9697o).setStrokeWidth(a10);
            ((DislikeView) this.f9697o).setStrokeColor(this.f9694l.p());
            ((DislikeView) this.f9697o).setBgColor(this.f9694l.w());
            ((DislikeView) this.f9697o).setDislikeColor(this.f9694l.g());
            ((DislikeView) this.f9697o).setDislikeWidth((int) com.bytedance.sdk.component.adexpress.c.b.a(this.f9693k, 1.0f));
            return true;
        }
        return true;
    }
}
