package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.os.Build;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.b.h;
import java.util.List;

/* loaded from: classes.dex */
public class DynamicSkipCountDownContainer extends DynamicBaseWidgetImp implements com.bytedance.sdk.component.adexpress.dynamic.b {

    /* renamed from: a  reason: collision with root package name */
    private int f9736a;

    /* renamed from: b  reason: collision with root package name */
    private int f9737b;

    /* renamed from: s  reason: collision with root package name */
    private int f9738s;

    public DynamicSkipCountDownContainer(Context context, DynamicRootView dynamicRootView, h hVar) {
        super(context, dynamicRootView, hVar);
        setTag(Integer.valueOf(getClickArea()));
        dynamicRootView.setTimeOutListener(this);
        a();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.b
    public void a(CharSequence charSequence, boolean z10, int i10) {
        this.f9738s = i10;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget
    public void f() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = this.f9691i;
        layoutParams.topMargin = this.f9692j;
        setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp
    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(-2, -2);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.b
    public boolean h() {
        if (Build.VERSION.SDK_INT >= 16) {
            setBackground(getBackgroundDrawable());
        }
        setPadding((int) com.bytedance.sdk.component.adexpress.c.b.a(com.bytedance.sdk.component.adexpress.c.a(), this.f9694l.c()), (int) com.bytedance.sdk.component.adexpress.c.b.a(com.bytedance.sdk.component.adexpress.c.a(), this.f9694l.b()), (int) com.bytedance.sdk.component.adexpress.c.b.a(com.bytedance.sdk.component.adexpress.c.a(), this.f9694l.d()), (int) com.bytedance.sdk.component.adexpress.c.b.a(com.bytedance.sdk.component.adexpress.c.a(), this.f9694l.a()));
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f9738s == 0) {
            setMeasuredDimension(this.f9737b, this.f9690h);
        } else {
            setMeasuredDimension(this.f9736a, this.f9690h);
        }
    }

    private void a() {
        List<h> j10 = this.f9695m.j();
        if (j10 == null || j10.size() <= 0) {
            return;
        }
        for (h hVar : j10) {
            if (hVar.i().a() == 21) {
                this.f9736a = (int) (this.f9689g - com.bytedance.sdk.component.adexpress.c.b.a(this.f9693k, hVar.g()));
            }
            if (hVar.i().a() == 20) {
                this.f9737b = (int) (this.f9689g - com.bytedance.sdk.component.adexpress.c.b.a(this.f9693k, hVar.g()));
            }
        }
    }
}
