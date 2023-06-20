package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.widget.SlideUpView;

/* compiled from: SlideUpInteract.java */
/* loaded from: classes.dex */
public class j implements b<SlideUpView> {

    /* renamed from: a  reason: collision with root package name */
    private SlideUpView f9797a;

    /* renamed from: b  reason: collision with root package name */
    private Context f9798b;

    /* renamed from: c  reason: collision with root package name */
    private DynamicBaseWidget f9799c;

    /* renamed from: d  reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.dynamic.b.g f9800d;

    public j(Context context, DynamicBaseWidget dynamicBaseWidget, com.bytedance.sdk.component.adexpress.dynamic.b.g gVar) {
        this.f9798b = context;
        this.f9799c = dynamicBaseWidget;
        this.f9800d = gVar;
        e();
    }

    private void e() {
        this.f9797a = new SlideUpView(this.f9798b);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) com.bytedance.sdk.component.adexpress.c.b.a(this.f9798b, 200.0f));
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.c.b.a(this.f9798b, 100.0f);
        this.f9797a.setLayoutParams(layoutParams);
        this.f9797a.setGuideText(this.f9800d.I());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.b
    public void a() {
        this.f9797a.a();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.b
    public void b() {
        this.f9797a.c();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.b
    /* renamed from: c */
    public SlideUpView d() {
        return this.f9797a;
    }
}
