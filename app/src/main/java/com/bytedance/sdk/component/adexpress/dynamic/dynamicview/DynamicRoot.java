package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import com.bytedance.sdk.component.adexpress.dynamic.b.h;

/* loaded from: classes.dex */
public class DynamicRoot extends DynamicBaseWidgetImp {

    /* renamed from: a  reason: collision with root package name */
    public a f9716a;

    public DynamicRoot(Context context, DynamicRootView dynamicRootView, h hVar) {
        super(context, dynamicRootView, hVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget
    protected GradientDrawable a(GradientDrawable.Orientation orientation, int[] iArr) {
        a aVar = new a(orientation, iArr);
        this.f9716a = aVar;
        return aVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget
    protected GradientDrawable getDrawable() {
        a aVar = new a();
        this.f9716a = aVar;
        return aVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.b
    public boolean h() {
        return super.h();
    }
}
