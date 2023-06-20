package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.dynamic.b.h;
import com.bytedance.sdk.component.utils.t;

/* loaded from: classes.dex */
public class DynamicDislikeFeedBack extends DynamicBaseWidgetImp {
    public DynamicDislikeFeedBack(Context context, DynamicRootView dynamicRootView, h hVar) {
        super(context, dynamicRootView, hVar);
        TextView textView = new TextView(context);
        this.f9697o = textView;
        textView.setTag(3);
        addView(this.f9697o, getWidgetLayoutParams());
        dynamicRootView.setDislikeView(this.f9697o);
    }

    public String getText() {
        return t.a(com.bytedance.sdk.component.adexpress.c.a(), "tt_reward_feedback");
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.b
    public boolean h() {
        super.h();
        ((TextView) this.f9697o).setText(getText());
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 17) {
            this.f9697o.setTextAlignment(this.f9694l.h());
        }
        ((TextView) this.f9697o).setTextColor(this.f9694l.g());
        ((TextView) this.f9697o).setTextSize(this.f9694l.e());
        if (i10 >= 16) {
            this.f9697o.setBackground(getBackgroundDrawable());
        }
        if (!this.f9694l.t()) {
            ((TextView) this.f9697o).setMaxLines(1);
            ((TextView) this.f9697o).setGravity(17);
            ((TextView) this.f9697o).setEllipsize(TextUtils.TruncateAt.END);
        } else {
            int u10 = this.f9694l.u();
            if (u10 > 0) {
                ((TextView) this.f9697o).setLines(u10);
                ((TextView) this.f9697o).setEllipsize(TextUtils.TruncateAt.END);
            }
        }
        this.f9697o.setPadding((int) com.bytedance.sdk.component.adexpress.c.b.a(com.bytedance.sdk.component.adexpress.c.a(), this.f9694l.c()), (int) com.bytedance.sdk.component.adexpress.c.b.a(com.bytedance.sdk.component.adexpress.c.a(), this.f9694l.b()), (int) com.bytedance.sdk.component.adexpress.c.b.a(com.bytedance.sdk.component.adexpress.c.a(), this.f9694l.d()), (int) com.bytedance.sdk.component.adexpress.c.b.a(com.bytedance.sdk.component.adexpress.c.a(), this.f9694l.a()));
        ((TextView) this.f9697o).setGravity(17);
        return true;
    }
}
