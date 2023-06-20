package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.widget.HandLongPressView;

/* compiled from: LongPressInteract.java */
/* loaded from: classes.dex */
public class e implements b {

    /* renamed from: a  reason: collision with root package name */
    private HandLongPressView f9783a;

    public e(Context context, DynamicBaseWidget dynamicBaseWidget, com.bytedance.sdk.component.adexpress.dynamic.b.g gVar) {
        this.f9783a = new HandLongPressView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.c.b.a(context, 180.0f), (int) com.bytedance.sdk.component.adexpress.c.b.a(context, 180.0f));
        layoutParams.gravity = 17;
        this.f9783a.setLayoutParams(layoutParams);
        this.f9783a.setGuideText(gVar.I());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.b
    public void a() {
        this.f9783a.a();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.b
    public void b() {
        this.f9783a.b();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.b
    public ViewGroup d() {
        return this.f9783a;
    }
}
