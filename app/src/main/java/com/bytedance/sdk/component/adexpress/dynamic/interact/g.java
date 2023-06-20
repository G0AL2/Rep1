package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.widget.PressInteractView;

/* compiled from: PressInteract.java */
/* loaded from: classes.dex */
public class g implements b<PressInteractView> {

    /* renamed from: a  reason: collision with root package name */
    private PressInteractView f9785a;

    public g(Context context, DynamicBaseWidget dynamicBaseWidget, com.bytedance.sdk.component.adexpress.dynamic.b.g gVar) {
        this.f9785a = new PressInteractView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.c.b.a(context, 180.0f), (int) com.bytedance.sdk.component.adexpress.c.b.a(context, 180.0f));
        layoutParams.gravity = 17;
        this.f9785a.setLayoutParams(layoutParams);
        this.f9785a.setGuideText(gVar.I());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.b
    public void a() {
        this.f9785a.a();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.b
    public void b() {
        this.f9785a.b();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.b
    /* renamed from: c */
    public PressInteractView d() {
        return this.f9785a;
    }
}
