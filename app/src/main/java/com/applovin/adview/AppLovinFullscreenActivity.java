package com.applovin.adview;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Process;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.webkit.WebView;
import com.applovin.impl.adview.activity.FullscreenAdService;
import com.applovin.impl.adview.activity.b.a;
import com.applovin.impl.adview.activity.b.e;
import com.applovin.impl.adview.k;
import com.applovin.impl.adview.o;
import com.applovin.impl.sdk.c.b;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.g;
import com.applovin.impl.sdk.v;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkSettings;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class AppLovinFullscreenActivity extends Activity implements k {
    @SuppressLint({"StaticFieldLeak"})
    public static o parentInterstitialWrapper;

    /* renamed from: a  reason: collision with root package name */
    private m f6688a;

    /* renamed from: b  reason: collision with root package name */
    private a f6689b;

    /* renamed from: c  reason: collision with root package name */
    private final AtomicBoolean f6690c = new AtomicBoolean(true);

    /* renamed from: d  reason: collision with root package name */
    private com.applovin.impl.adview.activity.a f6691d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f6692e;

    private void a() {
        WindowInsetsController insetsController;
        if (!this.f6692e || !g.j() || (insetsController = getWindow().getInsetsController()) == null) {
            getWindow().getDecorView().setSystemUiVisibility(5894);
            return;
        }
        insetsController.setSystemBarsBehavior(2);
        insetsController.hide(WindowInsets.Type.systemBars());
    }

    @Override // com.applovin.impl.adview.k
    public void dismiss() {
        a aVar = this.f6689b;
        if (aVar != null) {
            aVar.h();
        } else {
            finish();
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        a aVar = this.f6689b;
        if (aVar != null) {
            aVar.l();
        }
        if (Utils.isAppLovinTestEnvironment(getApplicationContext())) {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a aVar = this.f6689b;
        if (aVar != null) {
            aVar.a(configuration);
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null && parentInterstitialWrapper == null) {
            if (bundle.getBoolean("com.applovin.dismiss_on_restore", false)) {
                if (v.a()) {
                    v.h("AppLovinFullscreenActivity", "Dismissing ad. Activity was destroyed while in background.");
                }
                dismiss();
                return;
            } else if (v.a()) {
                v.f("AppLovinFullscreenActivity", "Activity was destroyed while in background.");
            }
        }
        requestWindowFeature(1);
        getWindow().setFlags(IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES, IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES);
        getWindow().addFlags(16777216);
        getWindow().addFlags(128);
        View findViewById = findViewById(16908290);
        findViewById.setBackgroundColor(-16777216);
        m mVar = AppLovinSdk.getInstance(getIntent().getStringExtra("com.applovin.interstitial.sdk_key"), new AppLovinSdkSettings(this), this).coreSdk;
        this.f6688a = mVar;
        this.f6692e = ((Boolean) mVar.a(b.cF)).booleanValue();
        if (((Boolean) this.f6688a.a(b.cG)).booleanValue()) {
            findViewById.setFitsSystemWindows(true);
        }
        a();
        o oVar = parentInterstitialWrapper;
        if (oVar != null) {
            a.a(oVar.a(), parentInterstitialWrapper.d(), parentInterstitialWrapper.c(), parentInterstitialWrapper.b(), this.f6688a, this, new a.InterfaceC0111a() { // from class: com.applovin.adview.AppLovinFullscreenActivity.1
                @Override // com.applovin.impl.adview.activity.b.a.InterfaceC0111a
                public void a(a aVar) {
                    AppLovinFullscreenActivity.this.f6689b = aVar;
                    aVar.d();
                }

                @Override // com.applovin.impl.adview.activity.b.a.InterfaceC0111a
                public void a(String str, Throwable th) {
                    o.a(AppLovinFullscreenActivity.parentInterstitialWrapper.a(), AppLovinFullscreenActivity.parentInterstitialWrapper.c(), str, th, AppLovinFullscreenActivity.this);
                }
            });
            return;
        }
        Intent intent = new Intent(this, FullscreenAdService.class);
        com.applovin.impl.adview.activity.a aVar = new com.applovin.impl.adview.activity.a(this, this.f6688a);
        this.f6691d = aVar;
        bindService(intent, aVar, 1);
        if (g.h()) {
            try {
                WebView.setDataDirectorySuffix(String.valueOf(Process.myPid()));
            } catch (Throwable unused) {
            }
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        parentInterstitialWrapper = null;
        com.applovin.impl.adview.activity.a aVar = this.f6691d;
        if (aVar != null) {
            try {
                unbindService(aVar);
            } catch (Throwable unused) {
            }
        }
        a aVar2 = this.f6689b;
        if (aVar2 != null) {
            if (!aVar2.i()) {
                this.f6689b.h();
            }
            this.f6689b.k();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        a aVar = this.f6689b;
        if (aVar != null) {
            aVar.a(i10, keyEvent);
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        a aVar = this.f6689b;
        if (aVar != null) {
            aVar.g();
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        a aVar;
        try {
            super.onResume();
            if (this.f6690c.get() || (aVar = this.f6689b) == null) {
                return;
            }
            aVar.f();
        } catch (IllegalArgumentException e10) {
            if (v.a()) {
                this.f6688a.A().b("AppLovinFullscreenActivity", "Error was encountered in onResume().", e10);
            }
            dismiss();
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        m mVar = this.f6688a;
        if (mVar != null) {
            bundle.putBoolean("com.applovin.dismiss_on_restore", ((Boolean) mVar.a(b.eN)).booleanValue());
        }
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        a aVar = this.f6689b;
        if (aVar != null) {
            aVar.j();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        if (this.f6689b != null) {
            if (!this.f6690c.getAndSet(false) || (this.f6689b instanceof e)) {
                this.f6689b.c(z10);
            }
            if (z10) {
                a();
            }
        }
        super.onWindowFocusChanged(z10);
    }

    public void setPresenter(a aVar) {
        this.f6689b = aVar;
    }
}
