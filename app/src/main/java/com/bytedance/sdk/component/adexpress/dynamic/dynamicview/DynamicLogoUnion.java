package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.widget.ImageView;
import com.bytedance.sdk.component.adexpress.dynamic.b.h;
import com.bytedance.sdk.component.utils.t;

/* loaded from: classes.dex */
public class DynamicLogoUnion extends DynamicBaseWidgetImp {
    public DynamicLogoUnion(Context context, DynamicRootView dynamicRootView, h hVar) {
        super(context, dynamicRootView, hVar);
        ImageView imageView = new ImageView(context);
        this.f9697o = imageView;
        imageView.setTag(Integer.valueOf(getClickArea()));
        if (com.bytedance.sdk.component.adexpress.c.b()) {
            this.f9690h = Math.max(dynamicRootView.getLogoUnionHeight(), this.f9690h);
        }
        addView(this.f9697o, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.b
    public boolean h() {
        super.h();
        if (com.bytedance.sdk.component.adexpress.c.b()) {
            ((ImageView) this.f9697o).setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            ((ImageView) this.f9697o).setImageResource(t.d(getContext(), "tt_ad_logo_reward_full"));
        } else {
            ((ImageView) this.f9697o).setImageResource(t.d(getContext(), "tt_ad_logo"));
        }
        ((ImageView) this.f9697o).setColorFilter(this.f9694l.g());
        return true;
    }
}
