package com.chartboost.sdk.impl;

import android.os.Build;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.chartboost.sdk.Events.ChartboostCacheError;
import com.chartboost.sdk.Events.ChartboostClickError;
import com.chartboost.sdk.Events.ChartboostShowError;

/* loaded from: classes.dex */
public final class u implements h0, f0 {

    /* renamed from: a  reason: collision with root package name */
    private final RelativeLayout f14308a;

    /* renamed from: b  reason: collision with root package name */
    private final w f14309b;

    public u(RelativeLayout relativeLayout, w wVar) {
        qe.k.f(relativeLayout, "view");
        qe.k.f(wVar, "presenter");
        this.f14308a = relativeLayout;
        this.f14309b = wVar;
    }

    @Override // com.chartboost.sdk.impl.h0
    public void a(ViewGroup.LayoutParams layoutParams) {
        this.f14308a.setLayoutParams(layoutParams);
    }

    @Override // com.chartboost.sdk.impl.h0
    public ViewGroup.LayoutParams b() {
        return this.f14308a.getLayoutParams();
    }

    @Override // com.chartboost.sdk.impl.h0
    public DisplayMetrics c() {
        return this.f14308a.getResources().getDisplayMetrics();
    }

    @Override // com.chartboost.sdk.impl.h0
    public boolean a() {
        return Build.VERSION.SDK_INT < 21;
    }

    @Override // com.chartboost.sdk.impl.f0
    public void b(String str, String str2, ChartboostShowError chartboostShowError) {
        this.f14309b.b(str, str2, chartboostShowError);
    }

    @Override // com.chartboost.sdk.impl.f0
    public void a(String str, String str2, ChartboostClickError chartboostClickError) {
        this.f14309b.a(str, str2, chartboostClickError);
    }

    @Override // com.chartboost.sdk.impl.f0
    public void b(String str, String str2, ChartboostCacheError chartboostCacheError) {
        this.f14309b.b(str, str2, chartboostCacheError);
    }

    @Override // com.chartboost.sdk.impl.f0
    public void a(String str, String str2, ChartboostShowError chartboostShowError) {
        this.f14309b.a(str, str2, chartboostShowError);
    }

    @Override // com.chartboost.sdk.impl.f0
    public void a(String str, String str2, ChartboostCacheError chartboostCacheError) {
        this.f14309b.a(str, str2, chartboostCacheError);
    }
}
