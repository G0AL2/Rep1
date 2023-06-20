package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.dynamic.b.h;
import com.bytedance.sdk.component.adexpress.dynamic.c.l;
import com.bytedance.sdk.component.utils.t;

/* loaded from: classes.dex */
public class DynamicLogoAd extends DynamicBaseWidgetImp {
    public DynamicLogoAd(Context context, DynamicRootView dynamicRootView, h hVar) {
        super(context, dynamicRootView, hVar);
        TextView textView = new TextView(context);
        this.f9697o = textView;
        textView.setTag(Integer.valueOf(getClickArea()));
        addView(this.f9697o, getWidgetLayoutParams());
    }

    private boolean a() {
        if (com.bytedance.sdk.component.adexpress.c.b()) {
            return false;
        }
        return (!TextUtils.isEmpty(this.f9694l.f9608b) && this.f9694l.f9608b.contains("adx:")) || l.b();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.b
    public boolean h() {
        super.h();
        if (Build.VERSION.SDK_INT >= 17) {
            this.f9697o.setTextAlignment(this.f9694l.h());
        }
        ((TextView) this.f9697o).setTextColor(this.f9694l.g());
        ((TextView) this.f9697o).setTextSize(this.f9694l.e());
        if (com.bytedance.sdk.component.adexpress.c.b()) {
            ((TextView) this.f9697o).setIncludeFontPadding(false);
            ((TextView) this.f9697o).setTextSize(Math.min(((com.bytedance.sdk.component.adexpress.c.b.b(com.bytedance.sdk.component.adexpress.c.a(), this.f9690h) - this.f9694l.b()) - this.f9694l.a()) - 0.5f, this.f9694l.e()));
            ((TextView) this.f9697o).setText(t.b(getContext(), "tt_logo_en"));
            return true;
        } else if (a()) {
            if (l.b()) {
                ((TextView) this.f9697o).setText(l.a());
                return true;
            }
            ((TextView) this.f9697o).setText(l.a(this.f9694l.f9608b));
            return true;
        } else {
            ((TextView) this.f9697o).setText(t.b(getContext(), "tt_logo_cn"));
            return true;
        }
    }
}
