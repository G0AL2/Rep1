package com.chartboost.sdk;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.widget.RelativeLayout;
import com.chartboost.sdk.Libraries.CBLogging;
import com.chartboost.sdk.Model.CBError;

@SuppressLint({"Registered"})
/* loaded from: classes.dex */
public class CBImpressionActivity extends Activity {

    /* renamed from: a  reason: collision with root package name */
    final Handler f13631a;

    /* renamed from: b  reason: collision with root package name */
    final b f13632b;

    public CBImpressionActivity() {
        this.f13631a = f.a() != null ? f.a().f13869z : null;
        this.f13632b = f.a() != null ? f.a().A : null;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        View decorView;
        try {
            super.onAttachedToWindow();
            Window window = getWindow();
            if (window == null || (decorView = window.getDecorView()) == null || decorView.isHardwareAccelerated() || this.f13632b == null) {
                return;
            }
            CBLogging.b("CBImpressionActivity", "The activity passed down is not hardware accelerated, so Chartboost cannot show ads");
            com.chartboost.sdk.Model.c f10 = this.f13632b.f();
            if (f10 != null) {
                f10.a(CBError.CBImpressionError.HARDWARE_ACCELERATION_DISABLED);
            }
            finish();
        } catch (Exception e10) {
            CBLogging.b("CBImpressionActivity", "onAttachedToWindow: " + e10.toString());
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        try {
            b bVar = this.f13632b;
            if (bVar == null || !bVar.i()) {
                super.onBackPressed();
            }
        } catch (Exception e10) {
            CBLogging.b("CBImpressionActivity", "onBackPressed: " + e10.toString());
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        d k10;
        com.chartboost.sdk.Model.c f10 = this.f13632b.f();
        if (f10 != null && (k10 = f10.k()) != null) {
            k10.z();
        }
        super.onConfigurationChanged(configuration);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if ((getIntent() == null || getIntent().getBooleanExtra("isChartboost", false)) && this.f13631a != null && this.f13632b != null) {
            requestWindowFeature(1);
            Window window = getWindow();
            if (window != null) {
                window.setWindowAnimations(0);
            }
            this.f13632b.a(this);
            setContentView(new RelativeLayout(this));
            CBLogging.a("CBImpressionActivity", "Impression Activity onCreate() called");
            try {
                this.f13632b.j();
                return;
            } catch (Exception e10) {
                CBLogging.b("CBImpressionActivity", "onCreate: " + e10.toString());
                return;
            }
        }
        CBLogging.b("CBImpressionActivity", "This activity cannot be called from outside chartboost SDK");
        finish();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        try {
            b bVar = this.f13632b;
            if (bVar != null) {
                bVar.c(this);
            }
            super.onDestroy();
        } catch (Exception e10) {
            CBLogging.b("CBImpressionActivity", "onDestroy: " + e10.toString());
        }
    }

    @Override // android.app.Activity
    protected void onPause() {
        try {
            super.onPause();
            b bVar = this.f13632b;
            if (bVar != null) {
                bVar.b(this);
                this.f13632b.k();
            }
        } catch (Exception e10) {
            CBLogging.b("CBImpressionActivity", "onPause: " + e10.toString());
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        try {
            super.onResume();
            b bVar = this.f13632b;
            if (bVar != null) {
                bVar.b(this);
                this.f13632b.l();
            }
        } catch (Exception e10) {
            CBLogging.b("CBImpressionActivity", "onResume: " + e10.toString());
        }
        Chartboost.setActivityAttrs(this);
    }

    @Override // android.app.Activity
    protected void onStart() {
        try {
            super.onStart();
            b bVar = this.f13632b;
            if (bVar != null) {
                bVar.d(this);
            }
        } catch (Exception e10) {
            CBLogging.b("CBImpressionActivity", "onStart: " + e10.toString());
        }
    }

    @Override // android.app.Activity
    protected void onStop() {
        try {
            super.onStop();
            b bVar = this.f13632b;
            if (bVar != null) {
                bVar.e(this);
            }
        } catch (Exception e10) {
            CBLogging.b("CBImpressionActivity", "onStop: " + e10.toString());
        }
    }
}
