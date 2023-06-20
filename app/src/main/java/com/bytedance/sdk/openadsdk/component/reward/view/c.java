package com.bytedance.sdk.openadsdk.component.reward.view;

import android.app.Activity;
import android.graphics.Color;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.utils.v;

/* compiled from: RewardFullNativeVideoLayout.java */
/* loaded from: classes.dex */
public class c extends d {
    public c(Activity activity) {
        super(activity);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.view.d
    public void a(int i10, int i11) {
        super.a(i10, i11);
        n nVar = this.f11761c;
        if (nVar != null && n.c(nVar) && this.f11761c.t() == 3 && this.f11761c.v() == 0) {
            try {
                Activity activity = this.f11760b;
                FrameLayout frameLayout = (FrameLayout) activity.findViewById(t.e(activity, "tt_video_container_back"));
                frameLayout.setBackgroundColor(Color.parseColor("#000000"));
                if (this.f11761c.am() == 1) {
                    int e10 = v.e(m.a(), 90.0f);
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                    layoutParams.bottomMargin = e10;
                    frameLayout.setLayoutParams(layoutParams);
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.view.d
    protected boolean a() {
        return false;
    }
}
