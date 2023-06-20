package com.chartboost.sdk.impl;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.chartboost.sdk.Banner.BannerSize;
import com.chartboost.sdk.ChartboostBanner;
import com.chartboost.sdk.ChartboostBannerListener;
import com.chartboost.sdk.Events.ChartboostCacheError;
import com.chartboost.sdk.Events.ChartboostCacheEvent;
import com.chartboost.sdk.Events.ChartboostClickError;
import com.chartboost.sdk.Events.ChartboostClickEvent;
import com.chartboost.sdk.Events.ChartboostShowError;
import com.chartboost.sdk.Events.ChartboostShowEvent;
import com.chartboost.sdk.Libraries.CBLogging;
import com.chartboost.sdk.R;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* loaded from: classes.dex */
public class w implements x, a0 {

    /* renamed from: a  reason: collision with root package name */
    public String f14372a;

    /* renamed from: b  reason: collision with root package name */
    public BannerSize f14373b;

    /* renamed from: c  reason: collision with root package name */
    private ChartboostBannerListener f14374c;

    /* renamed from: d  reason: collision with root package name */
    private ChartboostBanner f14375d;

    /* renamed from: e  reason: collision with root package name */
    private h0 f14376e;

    /* renamed from: f  reason: collision with root package name */
    private z f14377f;

    /* renamed from: g  reason: collision with root package name */
    private t f14378g;

    /* renamed from: h  reason: collision with root package name */
    private s f14379h;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f14380a;

        /* renamed from: b  reason: collision with root package name */
        public BannerSize f14381b;
    }

    private void b(String str) {
        if (str != null) {
            this.f14378g.a(e(), str, "");
        } else {
            this.f14378g.a(e(), "");
        }
    }

    private void g() {
        l();
        if (this.f14377f.a(this.f14376e, this.f14373b)) {
            this.f14378g.b(e(), "");
            return;
        }
        CBLogging.b("BannerPresenter", "Banner size was not set successfully. Detach and re-create the banner");
        ChartboostShowError chartboostShowError = new ChartboostShowError(ChartboostShowError.Code.BANNER_SIZE_WAS_NOT_SUCCESSFULLY_SET, false);
        b(chartboostShowError);
        ChartboostBannerListener chartboostBannerListener = this.f14374c;
        if (chartboostBannerListener != null) {
            chartboostBannerListener.onAdShown(new ChartboostShowEvent(""), chartboostShowError);
        }
    }

    private void j() {
        if (this.f14379h != null) {
            CBLogging.a("BannerPresenter", "Register refresh for location: " + e() + " at intervals of " + this.f14379h.f() + " sec");
            this.f14379h.a((x) this);
            this.f14379h.j();
        }
    }

    private void k() {
        if (this.f14378g == null) {
            t b10 = com.chartboost.sdk.f.b();
            this.f14378g = b10;
            if (b10 != null) {
                p();
                this.f14379h.a((x) this);
                this.f14379h.a((a0) this);
            }
        }
    }

    private void l() {
        if (this.f14379h != null) {
            CBLogging.a("BannerPresenter", "Register timeout for location: " + e() + " at intervals of " + this.f14379h.g() + " sec");
            this.f14379h.a((a0) this);
            this.f14379h.k();
        }
    }

    private boolean o() {
        com.chartboost.sdk.f a10 = com.chartboost.sdk.f.a();
        return a10 == null || !a10.l();
    }

    private void p() {
        com.chartboost.sdk.f a10 = com.chartboost.sdk.f.a();
        ChartboostBanner chartboostBanner = this.f14375d;
        if (chartboostBanner != null && a10 != null) {
            a10.a(chartboostBanner);
        } else {
            CBLogging.b("BannerPresenter", "Please start with Chartboost SDK before creating any ChartboostBanner objects");
        }
    }

    private void r() {
        if (this.f14379h != null) {
            CBLogging.a("BannerPresenter", "Unregister refresh for location: " + e());
            this.f14379h.n();
        }
    }

    private void s() {
        if (this.f14379h != null) {
            CBLogging.a("BannerPresenter", "Un-register timeout for location: " + e());
            this.f14379h.o();
        }
    }

    public a a(Resources.Theme theme, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, R.styleable.ChartboostBanner, 0, 0);
        String string = obtainStyledAttributes.getString(R.styleable.ChartboostBanner_location);
        BannerSize fromInteger = BannerSize.fromInteger(obtainStyledAttributes.getInt(R.styleable.ChartboostBanner_size, 0));
        obtainStyledAttributes.recycle();
        a aVar = new a();
        aVar.f14380a = string;
        aVar.f14381b = fromInteger;
        return aVar;
    }

    public String c(String str) {
        this.f14372a = str;
        return str;
    }

    public void d() {
        if (this.f14379h != null) {
            CBLogging.a("BannerPresenter", "Unregister refresh and timeout for location: " + e());
            this.f14379h.o();
            this.f14379h.n();
            this.f14379h.a();
            this.f14379h = null;
        }
        this.f14376e = null;
        this.f14372a = null;
        this.f14374c = null;
        this.f14377f = null;
        this.f14378g = null;
        this.f14375d = null;
    }

    public String e() {
        return this.f14372a;
    }

    public boolean f() {
        t tVar = this.f14378g;
        if (tVar != null) {
            return tVar.b(e());
        }
        ChartboostBannerListener chartboostBannerListener = this.f14374c;
        if (chartboostBannerListener != null) {
            chartboostBannerListener.onAdCached(new ChartboostCacheEvent(""), new ChartboostCacheError(ChartboostCacheError.Code.INTERNAL));
            return false;
        }
        return false;
    }

    public void h() {
        if (this.f14379h != null) {
            CBLogging.a("BannerPresenter", "Pause refresh for location: " + e());
            this.f14379h.h();
        }
    }

    public void i() {
        if (this.f14379h != null) {
            CBLogging.a("BannerPresenter", "Pause timeout for location: " + e());
            this.f14379h.i();
        }
    }

    public void m() {
        if (this.f14379h != null) {
            CBLogging.a("BannerPresenter", "Restart refresh if was paused for location: " + e());
            this.f14379h.l();
        }
    }

    public void n() {
        if (this.f14379h != null) {
            CBLogging.a("BannerPresenter", "Resume timeout if was paused for location: " + e());
            this.f14379h.m();
        }
    }

    public void q() {
        if (o()) {
            CBLogging.b("BannerPresenter", "Chartboost SDK is not initialised");
            ChartboostBannerListener chartboostBannerListener = this.f14374c;
            if (chartboostBannerListener != null) {
                chartboostBannerListener.onAdShown(new ChartboostShowEvent(""), new ChartboostShowError(ChartboostShowError.Code.SESSION_NOT_STARTED, false));
                return;
            }
            return;
        }
        h0 h0Var = this.f14376e;
        if (h0Var == null) {
            CBLogging.b("BannerPresenter", "Banner View is not attached, re-create banner.");
            ChartboostBannerListener chartboostBannerListener2 = this.f14374c;
            if (chartboostBannerListener2 != null) {
                chartboostBannerListener2.onAdShown(new ChartboostShowEvent(""), new ChartboostShowError(ChartboostShowError.Code.BANNER_VIEW_IS_DETACHED, false));
            }
        } else if (h0Var.a()) {
            CBLogging.b("BannerPresenter", "Banner is not supported for this Android version");
            ChartboostBannerListener chartboostBannerListener3 = this.f14374c;
            if (chartboostBannerListener3 != null) {
                chartboostBannerListener3.onAdShown(new ChartboostShowEvent(""), new ChartboostShowError(ChartboostShowError.Code.NO_CACHED_AD, false));
            }
        } else {
            k();
            if (c(2)) {
                s();
                r();
                g();
            }
        }
    }

    public void c() {
        d((String) null);
    }

    private void b(int i10) {
        ChartboostBannerListener chartboostBannerListener = this.f14374c;
        if (chartboostBannerListener != null) {
            if (i10 == 1) {
                chartboostBannerListener.onAdCached(new ChartboostCacheEvent(""), new ChartboostCacheError(ChartboostCacheError.Code.INTERNAL));
            } else if (i10 == 2) {
                chartboostBannerListener.onAdShown(new ChartboostShowEvent(""), new ChartboostShowError(ChartboostShowError.Code.INTERNAL, false));
            }
        }
    }

    private boolean c(int i10) {
        t tVar = this.f14378g;
        if (tVar != null) {
            if (tVar.b()) {
                return true;
            }
            a(i10);
            return false;
        }
        b(i10);
        return false;
    }

    public void b(String str, String str2, ChartboostShowError chartboostShowError) {
        j();
        a(str, str2, chartboostShowError);
        if (chartboostShowError == null || !chartboostShowError.shouldRetry) {
            return;
        }
        q();
    }

    private void c(ChartboostShowError chartboostShowError) {
        if (chartboostShowError != null) {
            b(chartboostShowError);
        } else {
            m1.d(new com.chartboost.sdk.Tracking.c("show_finish_success", "", IronSourceConstants.BANNER_AD_UNIT, this.f14372a));
        }
    }

    public void a(ChartboostBanner chartboostBanner, h0 h0Var, String str, BannerSize bannerSize, ChartboostBannerListener chartboostBannerListener, s sVar) {
        this.f14375d = chartboostBanner;
        this.f14376e = h0Var;
        this.f14372a = str;
        this.f14373b = bannerSize;
        this.f14374c = chartboostBannerListener;
        this.f14379h = sVar;
        this.f14377f = new z();
    }

    private void c(ChartboostCacheError chartboostCacheError) {
        if (chartboostCacheError != null) {
            b(chartboostCacheError);
        } else {
            m1.d(new com.chartboost.sdk.Tracking.c("cache_finish_success", "", IronSourceConstants.BANNER_AD_UNIT, this.f14372a));
        }
    }

    public void b(String str, String str2, ChartboostCacheError chartboostCacheError) {
        j();
        a(str, str2, chartboostCacheError);
    }

    @Override // com.chartboost.sdk.impl.a0
    public void b() {
        CBLogging.a("BannerPresenter", "Notify timeout finished for location: " + e());
        s();
        j();
        ChartboostBannerListener chartboostBannerListener = this.f14374c;
        if (chartboostBannerListener != null) {
            chartboostBannerListener.onAdShown(new ChartboostShowEvent(""), new ChartboostShowError(ChartboostShowError.Code.INTERNAL, false));
            com.chartboost.sdk.f a10 = com.chartboost.sdk.f.a();
            if (a10 != null) {
                a10.n();
            }
        }
    }

    private void d(String str) {
        if (o()) {
            CBLogging.b("BannerPresenter", "Chartboost SDK is not initialised");
            ChartboostBannerListener chartboostBannerListener = this.f14374c;
            if (chartboostBannerListener != null) {
                chartboostBannerListener.onAdCached(new ChartboostCacheEvent(""), new ChartboostCacheError(ChartboostCacheError.Code.SESSION_NOT_STARTED));
                return;
            }
            return;
        }
        h0 h0Var = this.f14376e;
        if (h0Var == null) {
            CBLogging.b("BannerPresenter", "Banner View is not attached, re-create banner.");
            ChartboostBannerListener chartboostBannerListener2 = this.f14374c;
            if (chartboostBannerListener2 != null) {
                chartboostBannerListener2.onAdCached(new ChartboostCacheEvent(""), new ChartboostCacheError(ChartboostCacheError.Code.BANNER_VIEW_IS_DETACHED));
            }
        } else if (h0Var.a()) {
            CBLogging.b("BannerPresenter", "Banner is not supported for this Android version");
            ChartboostBannerListener chartboostBannerListener3 = this.f14374c;
            if (chartboostBannerListener3 != null) {
                chartboostBannerListener3.onAdCached(new ChartboostCacheEvent(""), new ChartboostCacheError(ChartboostCacheError.Code.NO_AD_FOUND));
            }
        } else {
            k();
            if (c(1)) {
                b(str);
            } else {
                CBLogging.a("BannerPresenter", "Banner is currently processing action cache");
            }
        }
    }

    public void a(ChartboostBannerListener chartboostBannerListener) {
        this.f14374c = chartboostBannerListener;
    }

    public void a(boolean z10) {
        s sVar = this.f14379h;
        if (sVar != null) {
            sVar.a(z10);
        }
    }

    public void a(String str) {
        d(str);
    }

    private void a(int i10) {
        ChartboostBannerListener chartboostBannerListener = this.f14374c;
        if (chartboostBannerListener != null) {
            if (i10 == 1) {
                chartboostBannerListener.onAdCached(new ChartboostCacheEvent(""), new ChartboostCacheError(ChartboostCacheError.Code.BANNER_DISABLED));
            } else if (i10 == 2) {
                chartboostBannerListener.onAdShown(new ChartboostShowEvent(""), new ChartboostShowError(ChartboostShowError.Code.BANNER_DISABLED, false));
            }
        }
    }

    private void b(ChartboostShowError chartboostShowError) {
        String a10 = a(chartboostShowError);
        m1.d(new com.chartboost.sdk.Tracking.c("show_finish_failure", a10, IronSourceConstants.BANNER_AD_UNIT, this.f14372a));
        CBLogging.a("BannerPresenter", "onBannerShowFail: " + a10);
    }

    private void b(ChartboostCacheError chartboostCacheError) {
        String a10 = a(chartboostCacheError);
        m1.d(new com.chartboost.sdk.Tracking.c("cache_finish_failure", a10, IronSourceConstants.BANNER_AD_UNIT, this.f14372a));
        CBLogging.a("BannerPresenter", "onBannerCacheFail: " + a10);
    }

    public void a(String str, String str2, ChartboostClickError chartboostClickError) {
        s sVar = this.f14379h;
        if (sVar != null && sVar.d()) {
            q();
        }
        ChartboostBannerListener chartboostBannerListener = this.f14374c;
        if (chartboostBannerListener != null) {
            chartboostBannerListener.onAdClicked(new ChartboostClickEvent(str2), chartboostClickError);
        }
    }

    public void a(String str, String str2, ChartboostCacheError chartboostCacheError) {
        c(chartboostCacheError);
        ChartboostBannerListener chartboostBannerListener = this.f14374c;
        if (chartboostBannerListener != null) {
            chartboostBannerListener.onAdCached(new ChartboostCacheEvent(str2), chartboostCacheError);
        }
    }

    private void d(ChartboostShowError chartboostShowError) {
        com.chartboost.sdk.f a10 = com.chartboost.sdk.f.a();
        if (a10 == null || chartboostShowError != null) {
            return;
        }
        a10.a(2);
    }

    public void a(String str, String str2, ChartboostShowError chartboostShowError) {
        d(chartboostShowError);
        c(chartboostShowError);
        s();
        ChartboostShowEvent chartboostShowEvent = new ChartboostShowEvent(str2);
        chartboostShowEvent.location = str;
        ChartboostBannerListener chartboostBannerListener = this.f14374c;
        if (chartboostBannerListener != null) {
            chartboostBannerListener.onAdShown(chartboostShowEvent, chartboostShowError);
        }
        s sVar = this.f14379h;
        if (sVar == null || !sVar.d()) {
            return;
        }
        if (chartboostShowError == null) {
            c();
        }
        j();
    }

    @Override // com.chartboost.sdk.impl.x
    public void a() {
        CBLogging.a("BannerPresenter", "Notify refresh finished for location: " + e());
        q();
    }

    private String a(ChartboostShowError chartboostShowError) {
        ChartboostShowError.Code code;
        return (chartboostShowError == null || (code = chartboostShowError.code) == null) ? "" : code.name();
    }

    private String a(ChartboostCacheError chartboostCacheError) {
        ChartboostCacheError.Code code;
        return (chartboostCacheError == null || (code = chartboostCacheError.code) == null) ? "" : code.name();
    }
}
