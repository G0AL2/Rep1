package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.dynamic.b.h;
import com.bytedance.sdk.component.adexpress.dynamic.d;

/* loaded from: classes.dex */
public class DynamicVideoView extends DynamicBaseWidgetImp implements d {

    /* renamed from: a  reason: collision with root package name */
    TextView f9745a;

    /* renamed from: b  reason: collision with root package name */
    boolean f9746b;

    public DynamicVideoView(Context context, DynamicRootView dynamicRootView, h hVar) {
        super(context, dynamicRootView, hVar);
        this.f9746b = false;
        View view = new View(context);
        this.f9697o = view;
        view.setTag(Integer.valueOf(getClickArea()));
        this.f9745a = new TextView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.c.b.a(context, 40.0f), (int) com.bytedance.sdk.component.adexpress.c.b.a(context, 15.0f));
        layoutParams.gravity = 85;
        layoutParams.rightMargin = 20;
        layoutParams.bottomMargin = 20;
        this.f9745a.setLayoutParams(layoutParams);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(25.0f);
        gradientDrawable.setColor(Color.parseColor("#57000000"));
        this.f9745a.setBackground(gradientDrawable);
        this.f9745a.setTextSize(10.0f);
        this.f9745a.setGravity(17);
        this.f9745a.setTextColor(-1);
        this.f9745a.setVisibility(8);
        addView(this.f9745a);
        addView(this.f9697o, getWidgetLayoutParams());
        dynamicRootView.setVideoListener(this);
    }

    private void b(View view) {
        if (view == this.f9745a) {
            return;
        }
        int i10 = 0;
        view.setVisibility(0);
        if (!(view instanceof ViewGroup)) {
            return;
        }
        while (true) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (i10 >= viewGroup.getChildCount()) {
                return;
            }
            b(viewGroup.getChildAt(i10));
            i10++;
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.d
    public void a() {
        this.f9745a.setVisibility(8);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget
    public boolean e() {
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.b
    public boolean h() {
        super.h();
        double d10 = 0.0d;
        double d11 = 0.0d;
        for (h hVar = this.f9695m; hVar != null; hVar = hVar.k()) {
            d11 = (d11 + hVar.e()) - hVar.c();
            d10 = (d10 + hVar.f()) - hVar.d();
        }
        try {
            float f10 = (float) d11;
            float f11 = (float) d10;
            ((DynamicRoot) this.f9696n.getChildAt(0)).f9716a.a((int) com.bytedance.sdk.component.adexpress.c.b.a(getContext(), f10), (int) com.bytedance.sdk.component.adexpress.c.b.a(getContext(), f11), (int) com.bytedance.sdk.component.adexpress.c.b.a(getContext(), f10 + this.f9687e), (int) com.bytedance.sdk.component.adexpress.c.b.a(getContext(), f11 + this.f9688f));
        } catch (Exception unused) {
        }
        this.f9696n.a(d11, d10, this.f9687e, this.f9688f, this.f9694l.o());
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.d
    public void setTimeUpdate(int i10) {
        if (this.f9695m.i().e().ah() && i10 > 0 && !this.f9746b) {
            String str = (i10 >= 60 ? "0" + (i10 / 60) : "00") + ":";
            int i11 = i10 % 60;
            this.f9745a.setText(i11 > 9 ? str + i11 : str + "0" + i11);
            this.f9745a.setVisibility(0);
            return;
        }
        this.f9746b = true;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            b(getChildAt(i12));
        }
        this.f9745a.setVisibility(8);
    }
}
