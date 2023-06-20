package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.b.h;

/* loaded from: classes.dex */
public class DynamicSplitLineView extends DynamicBaseWidgetImp {
    public DynamicSplitLineView(Context context, DynamicRootView dynamicRootView, h hVar) {
        super(context, dynamicRootView, hVar);
        View view = new View(context);
        this.f9697o = view;
        addView(view, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.b
    public boolean h() {
        super.h();
        this.f9697o.setBackgroundColor(this.f9694l.w());
        return true;
    }
}
