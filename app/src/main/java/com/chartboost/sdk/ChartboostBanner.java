package com.chartboost.sdk;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.chartboost.sdk.Banner.BannerSize;
import com.chartboost.sdk.Libraries.CBLogging;
import com.chartboost.sdk.impl.f0;
import com.chartboost.sdk.impl.h0;
import com.chartboost.sdk.impl.s;
import com.chartboost.sdk.impl.u;
import com.chartboost.sdk.impl.w;

/* loaded from: classes.dex */
public class ChartboostBanner extends RelativeLayout {

    /* renamed from: c  reason: collision with root package name */
    private static final String f13642c = ChartboostBanner.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    private final w f13643a;

    /* renamed from: b  reason: collision with root package name */
    private final u f13644b;

    public ChartboostBanner(Context context) {
        super(context);
        w wVar = new w();
        this.f13643a = wVar;
        u uVar = new u(this, wVar);
        this.f13644b = uVar;
        wVar.a(this, uVar, "", BannerSize.STANDARD, null, new s());
    }

    private void a(boolean z10) {
        if (z10) {
            this.f13643a.m();
            this.f13643a.n();
            return;
        }
        this.f13643a.h();
        this.f13643a.i();
    }

    public void cache() {
        this.f13643a.c();
    }

    public void detachBanner() {
        this.f13643a.d();
    }

    public int getBannerHeight() {
        return BannerSize.getHeight(this.f13643a.f14373b);
    }

    public int getBannerWidth() {
        return BannerSize.getWidth(this.f13643a.f14373b);
    }

    public String getLocation() {
        return this.f13643a.e();
    }

    public f0 getTraits() {
        return this.f13644b;
    }

    public boolean isCached() {
        return this.f13643a.f();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        a(z10);
    }

    public void setAutomaticallyRefreshesContent(boolean z10) {
        this.f13643a.a(z10);
    }

    public void setListener(ChartboostBannerListener chartboostBannerListener) {
        this.f13643a.a(chartboostBannerListener);
    }

    public String setLocation(String str) {
        return this.f13643a.c(str);
    }

    public void show() {
        this.f13643a.q();
    }

    public void cache(String str) {
        this.f13643a.a(str);
    }

    public ChartboostBanner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        String str;
        BannerSize bannerSize;
        w wVar = new w();
        this.f13643a = wVar;
        u uVar = new u(this, wVar);
        this.f13644b = uVar;
        w.a a10 = wVar.a(context.getTheme(), attributeSet);
        if (a10 != null && (str = a10.f14380a) != null && (bannerSize = a10.f14381b) != null) {
            wVar.a(this, uVar, str, bannerSize, null, new s());
        } else {
            CBLogging.b(f13642c, "Error creating ChartboostBanner, make sure the attributes declared in the XML are correct");
        }
    }

    public ChartboostBanner(Context context, String str, BannerSize bannerSize, ChartboostBannerListener chartboostBannerListener) {
        super(context);
        w wVar = new w();
        this.f13643a = wVar;
        u uVar = new u(this, wVar);
        this.f13644b = uVar;
        wVar.a(this, uVar, str, bannerSize, chartboostBannerListener, new s());
    }

    public ChartboostBanner(Context context, h0 h0Var, String str, BannerSize bannerSize, ChartboostBannerListener chartboostBannerListener) {
        super(context);
        w wVar = new w();
        this.f13643a = wVar;
        this.f13644b = new u(this, wVar);
        wVar.a(this, h0Var, str, bannerSize, chartboostBannerListener, new s());
    }
}
