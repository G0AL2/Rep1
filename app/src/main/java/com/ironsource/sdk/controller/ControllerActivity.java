package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.amazon.device.ads.DtbDeviceDataRetriever;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.sdk.controller.u;
import com.ironsource.sdk.controller.x;
import com.ironsource.sdk.g.d;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;

/* loaded from: classes3.dex */
public class ControllerActivity extends Activity implements w, com.ironsource.sdk.j.g {

    /* renamed from: m  reason: collision with root package name */
    private static final String f27664m = "ControllerActivity";

    /* renamed from: n  reason: collision with root package name */
    private static String f27665n = "removeWebViewContainerView | mContainer is null";

    /* renamed from: o  reason: collision with root package name */
    private static String f27666o = "removeWebViewContainerView | view is null";

    /* renamed from: a  reason: collision with root package name */
    private String f27667a;

    /* renamed from: b  reason: collision with root package name */
    private x f27668b;

    /* renamed from: c  reason: collision with root package name */
    private RelativeLayout f27669c;

    /* renamed from: d  reason: collision with root package name */
    private FrameLayout f27670d;

    /* renamed from: f  reason: collision with root package name */
    private String f27672f;

    /* renamed from: j  reason: collision with root package name */
    private com.ironsource.sdk.g.b f27676j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f27677k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f27678l;
    public int currentRequestedRotation = -1;

    /* renamed from: e  reason: collision with root package name */
    private boolean f27671e = false;

    /* renamed from: g  reason: collision with root package name */
    private Handler f27673g = new Handler();

    /* renamed from: h  reason: collision with root package name */
    private final Runnable f27674h = new a();

    /* renamed from: i  reason: collision with root package name */
    private RelativeLayout.LayoutParams f27675i = new RelativeLayout.LayoutParams(-1, -1);

    /* loaded from: classes3.dex */
    final class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ControllerActivity.this.getWindow().getDecorView().setSystemUiVisibility(SDKUtils.getActivityUIFlags(ControllerActivity.this.f27671e));
        }
    }

    /* loaded from: classes3.dex */
    final class b implements View.OnSystemUiVisibilityChangeListener {
        b() {
        }

        @Override // android.view.View.OnSystemUiVisibilityChangeListener
        public final void onSystemUiVisibilityChange(int i10) {
            if ((i10 & 4098) == 0) {
                ControllerActivity.this.f27673g.removeCallbacks(ControllerActivity.this.f27674h);
                ControllerActivity.this.f27673g.postDelayed(ControllerActivity.this.f27674h, 500L);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public final class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ControllerActivity.this.getWindow().addFlags(128);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public final class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ControllerActivity.this.getWindow().clearFlags(128);
        }
    }

    private void a() {
        String str = f27664m;
        Logger.i(str, "clearWebviewController");
        x xVar = this.f27668b;
        if (xVar == null) {
            Logger.i(str, "clearWebviewController, null");
            return;
        }
        xVar.f27917x = x.g.Gone;
        xVar.G = null;
        xVar.V = null;
        xVar.a(this.f27672f, "onDestroy");
    }

    private void b(String str) {
        if (str != null) {
            if (DtbDeviceDataRetriever.ORIENTATION_LANDSCAPE.equalsIgnoreCase(str)) {
                e();
            } else if (DtbDeviceDataRetriever.ORIENTATION_PORTRAIT.equalsIgnoreCase(str)) {
                g();
            } else if ("device".equalsIgnoreCase(str)) {
                if (com.ironsource.environment.h.q(this)) {
                    setRequestedOrientation(1);
                }
            } else if (getRequestedOrientation() == -1) {
                setRequestedOrientation(4);
            }
        }
    }

    private void e() {
        int k10 = com.ironsource.environment.h.k(this);
        String str = f27664m;
        Logger.i(str, "setInitiateLandscapeOrientation");
        if (k10 == 0) {
            Logger.i(str, "ROTATION_0");
            setRequestedOrientation(0);
        } else if (k10 == 2) {
            Logger.i(str, "ROTATION_180");
            setRequestedOrientation(8);
        } else if (k10 == 3) {
            Logger.i(str, "ROTATION_270 Right Landscape");
            setRequestedOrientation(8);
        } else if (k10 != 1) {
            Logger.i(str, "No Rotation");
        } else {
            Logger.i(str, "ROTATION_90 Left Landscape");
            setRequestedOrientation(0);
        }
    }

    private void g() {
        int k10 = com.ironsource.environment.h.k(this);
        String str = f27664m;
        Logger.i(str, "setInitiatePortraitOrientation");
        if (k10 == 0) {
            Logger.i(str, "ROTATION_0");
            setRequestedOrientation(1);
        } else if (k10 == 2) {
            Logger.i(str, "ROTATION_180");
            setRequestedOrientation(9);
        } else if (k10 == 1) {
            Logger.i(str, "ROTATION_270 Right Landscape");
            setRequestedOrientation(1);
        } else if (k10 != 3) {
            Logger.i(str, "No Rotation");
        } else {
            Logger.i(str, "ROTATION_90 Left Landscape");
            setRequestedOrientation(1);
        }
    }

    @Override // com.ironsource.sdk.j.g
    public boolean onBackButtonPressed() {
        onBackPressed();
        return true;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        Logger.i(f27664m, "onBackPressed");
        new com.ironsource.sdk.i.a();
        if (com.ironsource.sdk.i.a.a(this)) {
            return;
        }
        super.onBackPressed();
    }

    @Override // com.ironsource.sdk.j.g
    public void onCloseRequested() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            Logger.i(f27664m, "onCreate");
            requestWindowFeature(1);
            getWindow().setFlags(IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES, IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES);
            x xVar = (x) com.ironsource.sdk.d.b.a((Context) this).f28044a.f27736a;
            this.f27668b = xVar;
            xVar.f27916w.setId(1);
            x xVar2 = this.f27668b;
            xVar2.V = this;
            xVar2.G = this;
            Intent intent = getIntent();
            this.f27672f = intent.getStringExtra("productType");
            this.f27671e = intent.getBooleanExtra("immersive", false);
            this.f27667a = intent.getStringExtra("adViewId");
            this.f27677k = false;
            this.f27678l = intent.getBooleanExtra("ctrWVPauseResume", false);
            if (this.f27671e) {
                getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new b());
                runOnUiThread(this.f27674h);
            }
            if (!TextUtils.isEmpty(this.f27672f) && d.e.OfferWall.toString().equalsIgnoreCase(this.f27672f)) {
                if (bundle != null) {
                    com.ironsource.sdk.g.b bVar = (com.ironsource.sdk.g.b) bundle.getParcelable("state");
                    if (bVar != null) {
                        this.f27676j = bVar;
                        this.f27668b.a(bVar);
                    }
                    finish();
                } else {
                    this.f27676j = this.f27668b.H;
                }
            }
            RelativeLayout relativeLayout = new RelativeLayout(this);
            this.f27669c = relativeLayout;
            setContentView(relativeLayout, this.f27675i);
            String str = this.f27667a;
            this.f27670d = !(!TextUtils.isEmpty(str) && !str.equals(Integer.toString(1))) ? this.f27668b.f27916w : com.ironsource.sdk.utils.d.a(getApplicationContext(), com.ironsource.sdk.c.d.a().a(str).b());
            if (this.f27669c.findViewById(1) == null && this.f27670d.getParent() != null) {
                finish();
            }
            Intent intent2 = getIntent();
            String stringExtra = intent2.getStringExtra("orientation_set_flag");
            intent2.getIntExtra("rotation_set_flag", 0);
            b(stringExtra);
            this.f27669c.addView(this.f27670d, this.f27675i);
        } catch (Exception e10) {
            e10.printStackTrace();
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        ViewGroup viewGroup;
        super.onDestroy();
        Logger.i(f27664m, "onDestroy");
        try {
        } catch (Exception e10) {
            com.ironsource.sdk.a.d.a(com.ironsource.sdk.a.f.f27598p, new com.ironsource.sdk.a.a().a("callfailreason", e10.getMessage()).f27575a);
            String str = f27664m;
            Logger.i(str, "removeWebViewContainerView fail " + e10.getMessage());
        }
        if (this.f27669c == null) {
            throw new Exception(f27665n);
        }
        ViewGroup viewGroup2 = (ViewGroup) this.f27670d.getParent();
        View findViewById = this.f27667a == null ? viewGroup2.findViewById(1) : com.ironsource.sdk.c.d.a().a(this.f27667a).b();
        if (findViewById == null) {
            throw new Exception(f27666o);
        }
        if (isFinishing() && (viewGroup = (ViewGroup) findViewById.getParent()) != null) {
            viewGroup.removeView(findViewById);
        }
        viewGroup2.removeView(this.f27670d);
        if (this.f27677k) {
            return;
        }
        Logger.i(f27664m, "onDestroy | destroyedFromBackground");
        a();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 == 4) {
            x xVar = this.f27668b;
            if (xVar.f27913t != null) {
                xVar.f27912s.onHideCustomView();
                return true;
            }
        }
        if (this.f27671e && (i10 == 25 || i10 == 24)) {
            this.f27673g.removeCallbacks(this.f27674h);
            this.f27673g.postDelayed(this.f27674h, 500L);
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // com.ironsource.sdk.j.g
    public void onOrientationChanged(String str, int i10) {
        b(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        String str = f27664m;
        Logger.i(str, "onPause, isFinishing=" + isFinishing());
        com.ironsource.environment.e.a.f26152a.b(new u.a((AudioManager) getSystemService("audio")));
        x xVar = this.f27668b;
        if (xVar != null) {
            xVar.b(this);
            if (!this.f27678l) {
                this.f27668b.k();
            }
            this.f27668b.a(false, "main");
            this.f27668b.a(this.f27672f, "onPause");
        }
        if (isFinishing()) {
            this.f27677k = true;
            a();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        Logger.i(f27664m, "onResume");
        x xVar = this.f27668b;
        if (xVar != null) {
            xVar.a(this);
            if (!this.f27678l) {
                this.f27668b.l();
            }
            this.f27668b.a(true, "main");
            this.f27668b.a(this.f27672f, "onResume");
        }
        com.ironsource.environment.e.a.f26152a.b(new u.b((AudioManager) getSystemService("audio")));
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (TextUtils.isEmpty(this.f27672f) || !d.e.OfferWall.toString().equalsIgnoreCase(this.f27672f)) {
            return;
        }
        com.ironsource.sdk.g.b bVar = this.f27676j;
        bVar.f28131d = true;
        bundle.putParcelable("state", bVar);
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        Logger.i(f27664m, "onStart");
        x xVar = this.f27668b;
        if (xVar != null) {
            xVar.a(this.f27672f, "onStart");
        }
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        Logger.i(f27664m, "onStop");
        x xVar = this.f27668b;
        if (xVar != null) {
            xVar.a(this.f27672f, "onStop");
        }
    }

    @Override // android.app.Activity
    protected void onUserLeaveHint() {
        super.onUserLeaveHint();
        Logger.i(f27664m, "onUserLeaveHint");
        x xVar = this.f27668b;
        if (xVar != null) {
            xVar.a(this.f27672f, "onUserLeaveHint");
        }
    }

    @Override // com.ironsource.sdk.controller.w
    public void onVideoEnded() {
        toggleKeepScreen(false);
    }

    @Override // com.ironsource.sdk.controller.w
    public void onVideoPaused() {
        toggleKeepScreen(false);
    }

    @Override // com.ironsource.sdk.controller.w
    public void onVideoResumed() {
        toggleKeepScreen(true);
    }

    @Override // com.ironsource.sdk.controller.w
    public void onVideoStarted() {
        toggleKeepScreen(true);
    }

    @Override // com.ironsource.sdk.controller.w
    public void onVideoStopped() {
        toggleKeepScreen(false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (this.f27671e && z10) {
            runOnUiThread(this.f27674h);
        }
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int i10) {
        if (this.currentRequestedRotation != i10) {
            String str = f27664m;
            Logger.i(str, "Rotation: Req = " + i10 + " Curr = " + this.currentRequestedRotation);
            this.currentRequestedRotation = i10;
            super.setRequestedOrientation(i10);
        }
    }

    public void toggleKeepScreen(boolean z10) {
        runOnUiThread(z10 ? new c() : new d());
    }
}
