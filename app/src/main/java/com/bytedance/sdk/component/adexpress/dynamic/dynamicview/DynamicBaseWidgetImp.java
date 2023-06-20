package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.b.l;
import com.bytedance.sdk.component.adexpress.dynamic.b.h;
import com.bytedance.sdk.component.adexpress.dynamic.interact.InteractViewContainer;

/* loaded from: classes.dex */
public class DynamicBaseWidgetImp extends DynamicBaseWidget {

    /* renamed from: a  reason: collision with root package name */
    private InteractViewContainer f9702a;

    public DynamicBaseWidgetImp(Context context, DynamicRootView dynamicRootView, h hVar) {
        super(context, dynamicRootView, hVar);
        setTag(Integer.valueOf(getClickArea()));
        String b10 = hVar.i().b();
        if ("logo-union".equals(b10)) {
            dynamicRootView.setLogoUnionHeight(this.f9690h - ((int) com.bytedance.sdk.component.adexpress.c.b.a(context, this.f9694l.b() + this.f9694l.a())));
        } else if ("scoreCountWithIcon".equals(b10)) {
            dynamicRootView.setScoreCountWithIcon(this.f9690h - ((int) com.bytedance.sdk.component.adexpress.c.b.a(context, this.f9694l.b() + this.f9694l.a())));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(this.f9689g, this.f9690h);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.b
    public boolean h() {
        final View view = this.f9697o;
        if (view == null) {
            view = this;
        }
        view.setContentDescription(this.f9694l.K());
        Drawable backgroundDrawable = getBackgroundDrawable();
        if (backgroundDrawable != null) {
            view.setBackground(backgroundDrawable);
        }
        if (this.f9694l.x() > 0) {
            postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        View view2 = view;
                        DynamicBaseWidgetImp dynamicBaseWidgetImp = DynamicBaseWidgetImp.this;
                        view2.setBackground(dynamicBaseWidgetImp.a(true, dynamicBaseWidgetImp.f9696n.getBgColor()));
                    } catch (Exception unused) {
                    }
                }
            }, this.f9694l.x() * 1000);
        }
        View view2 = this.f9697o;
        if (view2 != null) {
            view2.setPadding((int) com.bytedance.sdk.component.adexpress.c.b.a(this.f9693k, this.f9694l.c()), (int) com.bytedance.sdk.component.adexpress.c.b.a(this.f9693k, this.f9694l.b()), (int) com.bytedance.sdk.component.adexpress.c.b.a(this.f9693k, this.f9694l.d()), (int) com.bytedance.sdk.component.adexpress.c.b.a(this.f9693k, this.f9694l.a()));
        }
        if (this.f9698p || this.f9694l.n() > 0.0d) {
            setShouldInvisible(true);
            view.setVisibility(4);
            setVisibility(4);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        final View view = this.f9697o;
        if (view == null) {
            view = this;
        }
        double l10 = this.f9695m.i().e().l();
        if (l10 < 90.0d && l10 > 0.0d) {
            com.bytedance.sdk.component.utils.h.b().postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp.2
                @Override // java.lang.Runnable
                public void run() {
                    DynamicBaseWidgetImp.this.setVisibility(8);
                }
            }, (long) (l10 * 1000.0d));
        }
        double k10 = this.f9695m.i().e().k();
        if (k10 > 0.0d) {
            com.bytedance.sdk.component.utils.h.b().postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp.3
                @Override // java.lang.Runnable
                public void run() {
                    if (DynamicBaseWidgetImp.this.f9695m.i().e().ac() != null) {
                        return;
                    }
                    view.setVisibility(0);
                    DynamicBaseWidgetImp.this.setVisibility(0);
                }
            }, (long) (k10 * 1000.0d));
        }
        if (!TextUtils.isEmpty(this.f9694l.D())) {
            a();
        }
        super.onAttachedToWindow();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    private void a() {
        int G = this.f9694l.G();
        int H = this.f9694l.H();
        postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp.4
            @Override // java.lang.Runnable
            public void run() {
                DynamicRootView dynamicRootView = DynamicBaseWidgetImp.this.f9696n;
                if (dynamicRootView != null && dynamicRootView.getRenderRequest() != null) {
                    l renderRequest = DynamicBaseWidgetImp.this.f9696n.getRenderRequest();
                    int p10 = renderRequest.p();
                    int q10 = renderRequest.q();
                    DynamicBaseWidgetImp dynamicBaseWidgetImp = DynamicBaseWidgetImp.this;
                    DynamicBaseWidgetImp dynamicBaseWidgetImp2 = DynamicBaseWidgetImp.this;
                    dynamicBaseWidgetImp.f9702a = new InteractViewContainer(dynamicBaseWidgetImp2.f9693k, dynamicBaseWidgetImp2, dynamicBaseWidgetImp2.f9694l, p10, q10);
                } else {
                    DynamicBaseWidgetImp dynamicBaseWidgetImp3 = DynamicBaseWidgetImp.this;
                    DynamicBaseWidgetImp dynamicBaseWidgetImp4 = DynamicBaseWidgetImp.this;
                    dynamicBaseWidgetImp3.f9702a = new InteractViewContainer(dynamicBaseWidgetImp4.f9693k, dynamicBaseWidgetImp4, dynamicBaseWidgetImp4.f9694l);
                }
                DynamicBaseWidgetImp dynamicBaseWidgetImp5 = DynamicBaseWidgetImp.this;
                dynamicBaseWidgetImp5.a(dynamicBaseWidgetImp5.f9702a);
                DynamicBaseWidgetImp.this.f9702a.setTag(2);
                DynamicBaseWidgetImp dynamicBaseWidgetImp6 = DynamicBaseWidgetImp.this;
                dynamicBaseWidgetImp6.addView(dynamicBaseWidgetImp6.f9702a, new FrameLayout.LayoutParams(-1, -1));
                DynamicBaseWidgetImp.this.f9702a.b();
            }
        }, G * 1000);
        if (H >= Integer.MAX_VALUE || G >= H) {
            return;
        }
        postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp.5
            @Override // java.lang.Runnable
            public void run() {
                if (DynamicBaseWidgetImp.this.f9702a != null) {
                    DynamicBaseWidgetImp.this.f9702a.setVisibility(8);
                }
            }
        }, H * 1000);
    }
}
