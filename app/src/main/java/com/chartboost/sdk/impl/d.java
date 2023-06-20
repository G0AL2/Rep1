package com.chartboost.sdk.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import com.chartboost.sdk.ChartboostBanner;
import com.chartboost.sdk.Events.ChartboostCacheError;
import com.chartboost.sdk.Events.ChartboostShowError;
import com.chartboost.sdk.Libraries.CBLogging;
import com.chartboost.sdk.impl.c;
import com.chartboost.sdk.impl.f;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class d extends f implements v {
    private final g0 G;
    private final Handler H;

    public d(Context context, g0 g0Var, ScheduledExecutorService scheduledExecutorService, j1 j1Var, p1 p1Var, com.chartboost.sdk.Networking.b bVar, r0 r0Var, l2 l2Var, AtomicReference<com.chartboost.sdk.Model.e> atomicReference, SharedPreferences sharedPreferences, u2 u2Var, Handler handler, com.chartboost.sdk.b bVar2, v0 v0Var, com.chartboost.sdk.c cVar, x0 x0Var, p2 p2Var, h hVar, u0 u0Var) {
        super(context, g0Var, scheduledExecutorService, j1Var, p1Var, bVar, r0Var, l2Var, atomicReference, sharedPreferences, u2Var, handler, bVar2, v0Var, cVar, x0Var, p2Var, hVar, u0Var);
        this.G = g0Var;
        this.H = handler;
    }

    private boolean j(String str) {
        if (l.b().a(str)) {
            CBLogging.b("AdUnitBannerManager", "Location cannot be empty");
            ChartboostCacheError chartboostCacheError = new ChartboostCacheError(ChartboostCacheError.Code.INTERNAL);
            Handler handler = this.H;
            g0 g0Var = this.G;
            Objects.requireNonNull(g0Var);
            handler.post(new c.a(6, str, null, chartboostCacheError, false, ""));
            return false;
        }
        return true;
    }

    private void k(String str) {
        ChartboostCacheError chartboostCacheError = new ChartboostCacheError(ChartboostCacheError.Code.SESSION_NOT_STARTED);
        String location = this.f13981p.getLocation();
        g0 g0Var = this.G;
        Objects.requireNonNull(g0Var);
        this.H.post(new c.a(6, location, null, chartboostCacheError, false, str));
    }

    private void l(String str) {
        ChartboostShowError chartboostShowError = new ChartboostShowError(ChartboostShowError.Code.SESSION_NOT_STARTED, false);
        String location = this.f13981p.getLocation();
        g0 g0Var = this.G;
        Objects.requireNonNull(g0Var);
        this.H.post(new c.a(7, location, null, chartboostShowError, true, str));
    }

    @Override // com.chartboost.sdk.impl.v
    public void a(String str) {
        if (h()) {
            this.f13966a.execute(new f.b(3, this.f13981p.getLocation(), null, null, null));
            return;
        }
        k(str);
    }

    @Override // com.chartboost.sdk.impl.v
    public void b(String str) {
        if (h()) {
            this.f13966a.execute(new f.b(4, this.f13981p.getLocation(), null, null, null));
            return;
        }
        l(str);
    }

    public g0 g() {
        return this.G;
    }

    boolean h() {
        ChartboostBanner chartboostBanner;
        if (!a(com.chartboost.sdk.f.a()) || (chartboostBanner = this.f13981p) == null) {
            return false;
        }
        return j(chartboostBanner.getLocation());
    }

    @Override // com.chartboost.sdk.impl.v
    public void a(String str, String str2) {
        if (h()) {
            z1.a(this.f13981p.getLocation(), str, 2);
        } else {
            l(str2);
        }
    }

    private boolean a(com.chartboost.sdk.f fVar) {
        if (fVar == null || !com.chartboost.sdk.a.c()) {
            return false;
        }
        return com.chartboost.sdk.f.k();
    }

    @Override // com.chartboost.sdk.impl.v
    public boolean a() {
        return f(this.f13981p.getLocation()) != null;
    }

    public void a(ChartboostBanner chartboostBanner) {
        this.f13981p = chartboostBanner;
    }
}
