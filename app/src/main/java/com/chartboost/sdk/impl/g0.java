package com.chartboost.sdk.impl;

import com.chartboost.sdk.Events.ChartboostCacheError;
import com.chartboost.sdk.Events.ChartboostClickError;
import com.chartboost.sdk.Events.ChartboostShowError;
import com.chartboost.sdk.Model.CBError;

/* loaded from: classes.dex */
public class g0 extends c {

    /* renamed from: f  reason: collision with root package name */
    private f0 f14014f;

    private g0(f0 f0Var, e0 e0Var) {
        super(2, e0Var.a(), e0Var.b(), e0Var.d(), e0Var.c(), e0Var.f(), e0Var.e());
        this.f14014f = f0Var;
    }

    public static g0 a(f0 f0Var) {
        return new g0(f0Var, new e0());
    }

    @Override // com.chartboost.sdk.impl.c
    public void a(String str, CBError.CBImpressionError cBImpressionError, boolean z10, String str2) {
    }

    @Override // com.chartboost.sdk.impl.c
    public void b(String str, String str2) {
        this.f14014f.a(str, str2, (ChartboostClickError) null);
    }

    @Override // com.chartboost.sdk.impl.c
    public void e(String str, String str2) {
        this.f14014f.a(str, str2, (ChartboostShowError) null);
    }

    @Override // com.chartboost.sdk.impl.c
    public void a(String str, String str2) {
        this.f14014f.a(str, str2, (ChartboostCacheError) null);
    }

    @Override // com.chartboost.sdk.impl.c
    public void a(String str, String str2, ChartboostCacheError chartboostCacheError) {
        this.f14014f.b(str, str2, chartboostCacheError);
    }

    @Override // com.chartboost.sdk.impl.c
    public void a(String str, String str2, ChartboostShowError chartboostShowError) {
        this.f14014f.b(str, str2, chartboostShowError);
    }
}
