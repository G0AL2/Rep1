package com.applovin.impl.adview.activity.a;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.sdk.ad.e;
import com.applovin.impl.sdk.m;
import com.applovin.sdk.AppLovinSdkUtils;

/* loaded from: classes.dex */
public class d extends a {
    public d(e eVar, Activity activity, m mVar) {
        super(eVar, activity, mVar);
    }

    public void a(ImageView imageView, com.applovin.impl.adview.m mVar, com.applovin.impl.adview.m mVar2, com.applovin.impl.adview.a aVar, AppLovinAdView appLovinAdView, ViewGroup viewGroup) {
        this.f6853d.addView(appLovinAdView);
        if (mVar != null) {
            a(this.f6852c.X(), (this.f6852c.ac() ? 3 : 5) | 48, mVar);
        }
        if (mVar2 != null) {
            a(this.f6852c.X(), (this.f6852c.ab() ? 3 : 5) | 48, mVar2);
        }
        if (imageView != null) {
            int dpToPx = AppLovinSdkUtils.dpToPx(this.f6851b, ((Integer) this.f6850a.a(com.applovin.impl.sdk.c.b.cv)).intValue());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dpToPx, dpToPx, ((Integer) this.f6850a.a(com.applovin.impl.sdk.c.b.cx)).intValue());
            int dpToPx2 = AppLovinSdkUtils.dpToPx(this.f6851b, ((Integer) this.f6850a.a(com.applovin.impl.sdk.c.b.cw)).intValue());
            layoutParams.setMargins(dpToPx2, dpToPx2, dpToPx2, dpToPx2);
            this.f6853d.addView(imageView, layoutParams);
        }
        if (aVar != null) {
            this.f6853d.addView(aVar, this.f6854e);
        }
        if (viewGroup != null) {
            viewGroup.addView(this.f6853d);
        } else {
            this.f6851b.setContentView(this.f6853d);
        }
    }
}
