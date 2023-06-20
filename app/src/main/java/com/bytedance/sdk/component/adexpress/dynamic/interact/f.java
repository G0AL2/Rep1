package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.widget.PressButtonInteractView;

/* compiled from: PressButtonInteract.java */
/* loaded from: classes.dex */
public class f implements b {

    /* renamed from: a  reason: collision with root package name */
    private PressButtonInteractView f9784a;

    public f(Context context, DynamicBaseWidget dynamicBaseWidget, com.bytedance.sdk.component.adexpress.dynamic.b.g gVar) {
        this.f9784a = new PressButtonInteractView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dynamicBaseWidget.getDynamicHeight(), dynamicBaseWidget.getDynamicHeight());
        layoutParams.gravity = 21;
        this.f9784a.setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.b
    public void a() {
        this.f9784a.a();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.b
    public void b() {
        this.f9784a.b();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.b
    /* renamed from: c */
    public PressButtonInteractView d() {
        return this.f9784a;
    }
}
