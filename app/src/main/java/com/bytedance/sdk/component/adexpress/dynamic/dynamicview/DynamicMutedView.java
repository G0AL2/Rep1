package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.widget.ImageView;
import com.bytedance.sdk.component.adexpress.dynamic.b.h;
import com.bytedance.sdk.component.utils.t;

/* loaded from: classes.dex */
public class DynamicMutedView extends DynamicBaseWidgetImp implements com.bytedance.sdk.component.adexpress.dynamic.a {
    public DynamicMutedView(Context context, DynamicRootView dynamicRootView, h hVar) {
        super(context, dynamicRootView, hVar);
        ImageView imageView = new ImageView(context);
        this.f9697o = imageView;
        imageView.setTag(5);
        addView(this.f9697o, getWidgetLayoutParams());
        dynamicRootView.setMuteListener(this);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget
    public boolean e() {
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.b
    public boolean h() {
        super.h();
        ((ImageView) this.f9697o).setScaleType(ImageView.ScaleType.CENTER);
        setSoundMute(this.f9696n.f9718b);
        GradientDrawable gradientDrawable = (GradientDrawable) t.c(getContext(), "tt_ad_skip_btn_bg");
        gradientDrawable.setCornerRadius(this.f9690h / 2);
        gradientDrawable.setColor(this.f9694l.w());
        ((ImageView) this.f9697o).setBackgroundDrawable(gradientDrawable);
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.a
    public void setSoundMute(boolean z10) {
        int d10;
        if (z10) {
            d10 = t.d(getContext(), "tt_mute");
        } else {
            d10 = t.d(getContext(), "tt_unmute");
        }
        ((ImageView) this.f9697o).setImageResource(d10);
    }
}
