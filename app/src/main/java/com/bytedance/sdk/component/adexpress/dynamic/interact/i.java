package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.widget.SlideRightView;

/* compiled from: SlideRightInteract.java */
/* loaded from: classes.dex */
public class i implements b {

    /* renamed from: a  reason: collision with root package name */
    private SlideRightView f9793a;

    /* renamed from: b  reason: collision with root package name */
    private Context f9794b;

    /* renamed from: c  reason: collision with root package name */
    private DynamicBaseWidget f9795c;

    /* renamed from: d  reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.dynamic.b.g f9796d;

    public i(Context context, DynamicBaseWidget dynamicBaseWidget, com.bytedance.sdk.component.adexpress.dynamic.b.g gVar) {
        this.f9794b = context;
        this.f9795c = dynamicBaseWidget;
        this.f9796d = gVar;
        c();
    }

    private void c() {
        this.f9793a = new SlideRightView(this.f9794b);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.c.b.a(this.f9794b, 120.0f), (int) com.bytedance.sdk.component.adexpress.c.b.a(this.f9794b, 120.0f));
        layoutParams.gravity = 17;
        this.f9793a.setLayoutParams(layoutParams);
        this.f9793a.setClipChildren(false);
        this.f9793a.setGuideText(this.f9796d.I());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.b
    public void a() {
        this.f9793a.a();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.b
    public void b() {
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.b
    public ViewGroup d() {
        return this.f9793a;
    }
}
