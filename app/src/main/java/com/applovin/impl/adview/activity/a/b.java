package com.applovin.impl.adview.activity.a;

import android.app.Activity;
import android.view.ViewGroup;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.sdk.ad.e;
import com.applovin.impl.sdk.m;

/* loaded from: classes.dex */
public class b extends a {
    public b(e eVar, Activity activity, m mVar) {
        super(eVar, activity, mVar);
    }

    public void a(com.applovin.impl.adview.m mVar, AppLovinAdView appLovinAdView, ViewGroup viewGroup) {
        this.f6853d.addView(appLovinAdView);
        if (mVar != null) {
            a(this.f6852c.X(), (this.f6852c.ab() ? 3 : 5) | 48, mVar);
        }
        if (viewGroup != null) {
            viewGroup.addView(this.f6853d);
        } else {
            this.f6851b.setContentView(this.f6853d);
        }
    }
}
