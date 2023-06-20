package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.dynamic.b.g;
import com.bytedance.sdk.component.adexpress.dynamic.b.h;

/* loaded from: classes.dex */
public class DynamicPrivacyView extends DynamicBaseWidgetImp {

    /* renamed from: a  reason: collision with root package name */
    private TextView f9712a;

    /* renamed from: b  reason: collision with root package name */
    private TextView f9713b;

    /* renamed from: s  reason: collision with root package name */
    private TextView f9714s;

    /* renamed from: t  reason: collision with root package name */
    private LinearLayout f9715t;

    public DynamicPrivacyView(Context context, DynamicRootView dynamicRootView, h hVar) {
        super(context, dynamicRootView, hVar);
        this.f9712a = new TextView(this.f9693k);
        this.f9713b = new TextView(this.f9693k);
        this.f9715t = new LinearLayout(this.f9693k);
        this.f9714s = new TextView(this.f9693k);
        this.f9712a.setTag(9);
        this.f9713b.setTag(10);
        addView(this.f9715t, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget
    protected boolean d() {
        this.f9712a.setOnTouchListener((View.OnTouchListener) getDynamicClickListener());
        this.f9712a.setOnClickListener((View.OnClickListener) getDynamicClickListener());
        this.f9713b.setOnTouchListener((View.OnTouchListener) getDynamicClickListener());
        this.f9713b.setOnClickListener((View.OnClickListener) getDynamicClickListener());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp
    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(this.f9689g, this.f9690h);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.b
    public boolean h() {
        this.f9713b.setText("权限列表");
        this.f9714s.setText(" | ");
        this.f9712a.setText("隐私政策");
        g gVar = this.f9694l;
        if (gVar != null) {
            this.f9713b.setTextColor(gVar.g());
            this.f9713b.setTextSize(this.f9694l.e());
            this.f9714s.setTextColor(this.f9694l.g());
            this.f9712a.setTextColor(this.f9694l.g());
            this.f9712a.setTextSize(this.f9694l.e());
        } else {
            this.f9713b.setTextColor(-1);
            this.f9713b.setTextSize(12.0f);
            this.f9714s.setTextColor(-1);
            this.f9712a.setTextColor(-1);
            this.f9712a.setTextSize(12.0f);
        }
        this.f9715t.addView(this.f9713b);
        this.f9715t.addView(this.f9714s);
        this.f9715t.addView(this.f9712a);
        return false;
    }
}
