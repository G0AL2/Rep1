package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.widget.WriggleGuideAnimationView;
import com.bytedance.sdk.component.adexpress.widget.WriggleGuideView;
import com.bytedance.sdk.component.utils.t;

/* compiled from: WriggleGuideInteract.java */
/* loaded from: classes.dex */
public class k implements b<WriggleGuideAnimationView> {

    /* renamed from: a  reason: collision with root package name */
    private WriggleGuideAnimationView f9801a;

    /* renamed from: b  reason: collision with root package name */
    private Context f9802b;

    /* renamed from: c  reason: collision with root package name */
    private DynamicBaseWidget f9803c;

    /* renamed from: d  reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.dynamic.b.g f9804d;

    /* renamed from: e  reason: collision with root package name */
    private String f9805e;

    /* renamed from: f  reason: collision with root package name */
    private int f9806f;

    public k(Context context, DynamicBaseWidget dynamicBaseWidget, com.bytedance.sdk.component.adexpress.dynamic.b.g gVar, String str, int i10) {
        this.f9802b = context;
        this.f9803c = dynamicBaseWidget;
        this.f9804d = gVar;
        this.f9805e = str;
        this.f9806f = i10;
        e();
    }

    private void e() {
        int F = this.f9804d.F();
        if ("18".equals(this.f9805e)) {
            Context context = this.f9802b;
            WriggleGuideAnimationView wriggleGuideAnimationView = new WriggleGuideAnimationView(context, t.f(context, "tt_hand_wriggle_guide"), this.f9806f);
            this.f9801a = wriggleGuideAnimationView;
            if (wriggleGuideAnimationView.getWriggleLayout() != null) {
                this.f9801a.getWriggleLayout().setOnClickListener((View.OnClickListener) this.f9803c.getDynamicClickListener());
            }
            if (this.f9801a.getTopTextView() != null) {
                this.f9801a.getTopTextView().setText(t.b(this.f9802b, "tt_splash_wriggle_top_text_style_17"));
            }
        } else {
            Context context2 = this.f9802b;
            this.f9801a = new WriggleGuideAnimationView(context2, t.f(context2, "tt_hand_wriggle_guide"), this.f9806f);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.c.b.a(this.f9802b, F);
        this.f9801a.setLayoutParams(layoutParams);
        this.f9801a.setShakeText(this.f9804d.I());
        this.f9801a.setClipChildren(false);
        final WriggleGuideView wriggleProgressIv = this.f9801a.getWriggleProgressIv();
        this.f9801a.setOnShakeViewListener(new WriggleGuideAnimationView.a() { // from class: com.bytedance.sdk.component.adexpress.dynamic.interact.k.1
            @Override // com.bytedance.sdk.component.adexpress.widget.WriggleGuideAnimationView.a
            public void a() {
                WriggleGuideView wriggleGuideView = wriggleProgressIv;
                if (wriggleGuideView != null) {
                    wriggleGuideView.a(new WriggleGuideView.a() { // from class: com.bytedance.sdk.component.adexpress.dynamic.interact.k.1.1
                        @Override // com.bytedance.sdk.component.adexpress.widget.WriggleGuideView.a
                        public void a() {
                            k.this.f9801a.setOnClickListener((View.OnClickListener) k.this.f9803c.getDynamicClickListener());
                            k.this.f9801a.performClick();
                        }
                    });
                }
            }
        });
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.b
    /* renamed from: c */
    public WriggleGuideAnimationView d() {
        return this.f9801a;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.b
    public void a() {
        this.f9801a.a();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.b
    public void b() {
        this.f9801a.clearAnimation();
    }
}
