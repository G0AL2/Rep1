package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.widget.CircleLongPressView;

/* compiled from: CircleLongPressInteract.java */
/* loaded from: classes.dex */
public class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private CircleLongPressView f9762a;

    public a(Context context, DynamicBaseWidget dynamicBaseWidget, com.bytedance.sdk.component.adexpress.dynamic.b.g gVar) {
        this.f9762a = new CircleLongPressView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.c.b.a(context, 180.0f), (int) com.bytedance.sdk.component.adexpress.c.b.a(context, 180.0f));
        layoutParams.gravity = 17;
        this.f9762a.setLayoutParams(layoutParams);
        this.f9762a.setGuideText(gVar.I());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.b
    public void a() {
        this.f9762a.a();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.b
    public void b() {
        this.f9762a.b();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.b
    /* renamed from: c */
    public CircleLongPressView d() {
        return this.f9762a;
    }
}
