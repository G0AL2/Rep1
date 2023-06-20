package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.dynamic.animation.view.AnimationButton;
import com.bytedance.sdk.component.adexpress.dynamic.b.h;

/* loaded from: classes.dex */
public class DynamicButton extends DynamicBaseWidgetImp {
    public DynamicButton(Context context, DynamicRootView dynamicRootView, h hVar) {
        super(context, dynamicRootView, hVar);
        AnimationButton animationButton = new AnimationButton(context);
        this.f9697o = animationButton;
        animationButton.setTag(Integer.valueOf(getClickArea()));
        addView(this.f9697o, getWidgetLayoutParams());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp
    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        if (com.bytedance.sdk.component.adexpress.c.b() && "fillButton".equals(this.f9695m.i().b())) {
            ((TextView) this.f9697o).setEllipsize(TextUtils.TruncateAt.END);
            ((TextView) this.f9697o).setMaxLines(1);
        }
        return super.getWidgetLayoutParams();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.b
    public boolean h() {
        super.h();
        if (TextUtils.equals("download-progress-button", this.f9695m.i().b()) && TextUtils.isEmpty(this.f9694l.j())) {
            this.f9697o.setVisibility(4);
            return true;
        }
        if (Build.VERSION.SDK_INT >= 17) {
            this.f9697o.setTextAlignment(this.f9694l.h());
        }
        ((TextView) this.f9697o).setText(this.f9694l.j());
        ((TextView) this.f9697o).setTextColor(this.f9694l.g());
        ((TextView) this.f9697o).setTextSize(this.f9694l.e());
        ((TextView) this.f9697o).setGravity(17);
        ((TextView) this.f9697o).setIncludeFontPadding(false);
        if ("fillButton".equals(this.f9695m.i().b())) {
            this.f9697o.setPadding(0, 0, 0, 0);
        } else {
            this.f9697o.setPadding(this.f9694l.c(), this.f9694l.b(), this.f9694l.d(), this.f9694l.a());
        }
        return true;
    }
}
