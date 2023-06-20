package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.widget.ShakeAnimationView;
import com.bytedance.sdk.component.utils.t;

/* compiled from: ShakeInteract.java */
/* loaded from: classes.dex */
public class h implements b<ShakeAnimationView> {

    /* renamed from: a  reason: collision with root package name */
    private ShakeAnimationView f9786a;

    /* renamed from: b  reason: collision with root package name */
    private Context f9787b;

    /* renamed from: c  reason: collision with root package name */
    private DynamicBaseWidget f9788c;

    /* renamed from: d  reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.dynamic.b.g f9789d;

    /* renamed from: e  reason: collision with root package name */
    private String f9790e;

    /* renamed from: f  reason: collision with root package name */
    private int f9791f;

    public h(Context context, DynamicBaseWidget dynamicBaseWidget, com.bytedance.sdk.component.adexpress.dynamic.b.g gVar, String str, int i10) {
        this.f9787b = context;
        this.f9788c = dynamicBaseWidget;
        this.f9789d = gVar;
        this.f9790e = str;
        this.f9791f = i10;
        e();
    }

    private void e() {
        if ("16".equals(this.f9790e)) {
            Context context = this.f9787b;
            ShakeAnimationView shakeAnimationView = new ShakeAnimationView(context, t.f(context, "tt_hand_shake_interaction_type_16"), this.f9791f);
            this.f9786a = shakeAnimationView;
            if (shakeAnimationView.getShakeLayout() != null) {
                this.f9786a.getShakeLayout().setOnClickListener((View.OnClickListener) this.f9788c.getDynamicClickListener());
            }
        } else {
            Context context2 = this.f9787b;
            this.f9786a = new ShakeAnimationView(context2, t.f(context2, "tt_hand_shake"), this.f9791f);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.c.b.a(this.f9787b, 80.0f);
        this.f9786a.setLayoutParams(layoutParams);
        this.f9786a.setShakeText(this.f9789d.I());
        this.f9786a.setClipChildren(false);
        this.f9786a.setOnShakeViewListener(new ShakeAnimationView.a() { // from class: com.bytedance.sdk.component.adexpress.dynamic.interact.h.1
            @Override // com.bytedance.sdk.component.adexpress.widget.ShakeAnimationView.a
            public void a() {
                h.this.f9786a.setOnClickListener((View.OnClickListener) h.this.f9788c.getDynamicClickListener());
                h.this.f9786a.performClick();
            }
        });
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.b
    /* renamed from: c */
    public ShakeAnimationView d() {
        return this.f9786a;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.b
    public void a() {
        this.f9786a.a();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.b
    public void b() {
        this.f9786a.clearAnimation();
    }
}
