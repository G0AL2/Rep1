package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.b.h;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class DynamicTimeOuterContainerWidgetImp extends DynamicBaseWidgetImp implements com.bytedance.sdk.component.adexpress.dynamic.b {

    /* renamed from: a  reason: collision with root package name */
    int f9741a;

    /* renamed from: b  reason: collision with root package name */
    boolean f9742b;

    /* renamed from: s  reason: collision with root package name */
    private int f9743s;

    public DynamicTimeOuterContainerWidgetImp(Context context, DynamicRootView dynamicRootView, h hVar) {
        super(context, dynamicRootView, hVar);
        this.f9743s = 0;
        setTag(Integer.valueOf(getClickArea()));
        a();
        dynamicRootView.setTimeOutListener(this);
    }

    private void a() {
        List<h> j10 = this.f9695m.j();
        if (j10 == null || j10.size() <= 0) {
            return;
        }
        Iterator<h> it = j10.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            h next = it.next();
            if (TextUtils.equals("skip-with-time-skip-btn", next.i().b())) {
                this.f9741a = (int) (this.f9689g - com.bytedance.sdk.component.adexpress.c.b.a(this.f9693k, next.g()));
                break;
            }
        }
        this.f9743s = this.f9689g - this.f9741a;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget
    public void f() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        if (this.f9742b) {
            layoutParams.leftMargin = this.f9691i;
        } else {
            layoutParams.leftMargin = this.f9691i + this.f9743s;
        }
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
        super.h();
        setPadding((int) com.bytedance.sdk.component.adexpress.c.b.a(com.bytedance.sdk.component.adexpress.c.a(), this.f9694l.c()), (int) com.bytedance.sdk.component.adexpress.c.b.a(com.bytedance.sdk.component.adexpress.c.a(), this.f9694l.b()), (int) com.bytedance.sdk.component.adexpress.c.b.a(com.bytedance.sdk.component.adexpress.c.a(), this.f9694l.d()), (int) com.bytedance.sdk.component.adexpress.c.b.a(com.bytedance.sdk.component.adexpress.c.a(), this.f9694l.a()));
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f9742b) {
            setMeasuredDimension(this.f9689g, this.f9690h);
        } else {
            setMeasuredDimension(this.f9741a, this.f9690h);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.b
    public void a(CharSequence charSequence, boolean z10, int i10) {
        if (z10 && this.f9742b != z10) {
            this.f9742b = z10;
            f();
        }
        this.f9742b = z10;
    }
}
