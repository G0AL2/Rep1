package com.chartboost.sdk.impl;

import android.os.Handler;
import com.chartboost.sdk.Libraries.CBLogging;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class d0 implements c0 {

    /* renamed from: a  reason: collision with root package name */
    private Handler f13948a;

    /* renamed from: c  reason: collision with root package name */
    private double f13950c;

    /* renamed from: b  reason: collision with root package name */
    private double f13949b = 0.0d;

    /* renamed from: d  reason: collision with root package name */
    private Runnable f13951d = new Runnable() { // from class: com.chartboost.sdk.impl.p3
        @Override // java.lang.Runnable
        public final void run() {
            d0.this.d();
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    public d0(double d10) {
        this.f13950c = d10;
    }

    private void b() {
        if (this.f13948a == null) {
            this.f13948a = new Handler();
        }
    }

    private void f() {
        b();
        Runnable runnable = this.f13951d;
        if (runnable != null) {
            this.f13948a.postDelayed(runnable, 1000L);
        }
    }

    private void j() {
        Runnable runnable;
        Handler handler = this.f13948a;
        if (handler == null || (runnable = this.f13951d) == null) {
            return;
        }
        handler.removeCallbacks(runnable);
        this.f13948a = null;
    }

    public Double c() {
        return Double.valueOf(this.f13949b);
    }

    public void d() {
        double d10 = this.f13949b + 1.0d;
        this.f13949b = d10;
        if (d10 >= this.f13950c) {
            a();
        } else {
            f();
        }
    }

    public void e() {
        j();
    }

    public void g() {
        if (this.f13949b > 0.0d) {
            CBLogging.a("BannerTimer", "Resume timer at: " + this.f13949b + " sec");
            h();
        }
    }

    public void h() {
        f();
    }

    public void i() {
        j();
        this.f13949b = 0.0d;
    }
}
