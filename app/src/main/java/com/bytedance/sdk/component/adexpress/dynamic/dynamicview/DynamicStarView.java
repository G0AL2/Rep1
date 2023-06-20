package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.b.h;
import com.bytedance.sdk.component.adexpress.widget.TTRatingBar2;

/* loaded from: classes.dex */
public class DynamicStarView extends DynamicBaseWidgetImp {

    /* renamed from: a  reason: collision with root package name */
    private int f9739a;

    /* renamed from: b  reason: collision with root package name */
    private int f9740b;

    public DynamicStarView(Context context, DynamicRootView dynamicRootView, h hVar) {
        super(context, dynamicRootView, hVar);
        this.f9739a = 0;
        this.f9740b = 0;
        TTRatingBar2 tTRatingBar2 = new TTRatingBar2(context, null);
        this.f9697o = tTRatingBar2;
        tTRatingBar2.setTag(Integer.valueOf(getClickArea()));
        addView(this.f9697o, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget
    public void f() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f9689g, this.f9690h);
        layoutParams.topMargin = this.f9692j + this.f9740b;
        layoutParams.leftMargin = this.f9691i + this.f9739a;
        setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp
    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        this.f9690h = (int) (this.f9690h + com.bytedance.sdk.component.adexpress.c.b.a(this.f9693k, this.f9694l.b() + this.f9694l.a()));
        int a10 = (int) ((com.bytedance.sdk.component.adexpress.c.b.a(com.bytedance.sdk.component.adexpress.c.a(), this.f9694l.e()) * 5.0f) + com.bytedance.sdk.component.adexpress.c.b.a(com.bytedance.sdk.component.adexpress.c.a(), this.f9694l.c() + com.bytedance.sdk.component.adexpress.c.b.a(com.bytedance.sdk.component.adexpress.c.a(), this.f9694l.d())));
        if (this.f9689g > a10 && 4 == this.f9694l.h()) {
            this.f9739a = (this.f9689g - a10) / 2;
        }
        this.f9740b = (int) com.bytedance.sdk.component.adexpress.c.b.a(this.f9693k, this.f9694l.b());
        this.f9689g = a10;
        return new FrameLayout.LayoutParams(this.f9689g, this.f9690h);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.b
    public boolean h() {
        DynamicRootView dynamicRootView;
        super.h();
        double m10 = this.f9694l.m();
        if (com.bytedance.sdk.component.adexpress.c.b() && (m10 < 0.0d || m10 > 5.0d || ((dynamicRootView = this.f9696n) != null && dynamicRootView.getRenderRequest() != null && this.f9696n.getRenderRequest().k() != 4))) {
            this.f9697o.setVisibility(8);
            return true;
        }
        if (m10 < 0.0d || m10 > 5.0d) {
            m10 = 5.0d;
        }
        this.f9697o.setVisibility(0);
        ((TTRatingBar2) this.f9697o).a(m10, this.f9694l.g(), (int) this.f9694l.e());
        return true;
    }
}
