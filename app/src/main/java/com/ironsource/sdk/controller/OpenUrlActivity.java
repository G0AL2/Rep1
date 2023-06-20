package com.ironsource.sdk.controller;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.google.android.gms.common.internal.ImagesContract;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.List;

/* loaded from: classes3.dex */
public class OpenUrlActivity extends Activity {

    /* renamed from: j  reason: collision with root package name */
    private static final int f27687j = SDKUtils.generateViewId();

    /* renamed from: k  reason: collision with root package name */
    private static final int f27688k = SDKUtils.generateViewId();

    /* renamed from: b  reason: collision with root package name */
    private x f27690b;

    /* renamed from: c  reason: collision with root package name */
    private ProgressBar f27691c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f27692d;

    /* renamed from: e  reason: collision with root package name */
    private RelativeLayout f27693e;

    /* renamed from: f  reason: collision with root package name */
    private String f27694f;

    /* renamed from: a  reason: collision with root package name */
    private WebView f27689a = null;

    /* renamed from: g  reason: collision with root package name */
    private Handler f27695g = new Handler();

    /* renamed from: h  reason: collision with root package name */
    private boolean f27696h = false;

    /* renamed from: i  reason: collision with root package name */
    private final Runnable f27697i = new b();

    /* loaded from: classes3.dex */
    final class a implements View.OnSystemUiVisibilityChangeListener {
        a() {
        }

        @Override // android.view.View.OnSystemUiVisibilityChangeListener
        public final void onSystemUiVisibilityChange(int i10) {
            if ((i10 & 4098) == 0) {
                OpenUrlActivity.this.f27695g.removeCallbacks(OpenUrlActivity.this.f27697i);
                OpenUrlActivity.this.f27695g.postDelayed(OpenUrlActivity.this.f27697i, 500L);
            }
        }
    }

    /* loaded from: classes3.dex */
    final class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            OpenUrlActivity.this.getWindow().getDecorView().setSystemUiVisibility(SDKUtils.getActivityUIFlags(OpenUrlActivity.this.f27696h));
        }
    }

    /* loaded from: classes3.dex */
    class c extends WebViewClient {
        private c() {
        }

        /* synthetic */ c(OpenUrlActivity openUrlActivity, byte b10) {
            this();
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            OpenUrlActivity.this.f27691c.setVisibility(4);
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            OpenUrlActivity.this.f27691c.setVisibility(0);
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, int i10, String str, String str2) {
            super.onReceivedError(webView, i10, str, str2);
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(26)
        public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Logger.e("OpenUrlActivity", "Chromium process crashed - detail.didCrash():" + renderProcessGoneDetail.didCrash());
            OpenUrlActivity.this.finish();
            return true;
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            List<String> b10 = com.ironsource.sdk.utils.b.a().b();
            if (!b10.isEmpty()) {
                for (String str2 : b10) {
                    if (str.contains(str2)) {
                        try {
                            OpenUrlActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                            OpenUrlActivity.this.f27690b.i();
                        } catch (Exception e10) {
                            StringBuilder sb2 = new StringBuilder();
                            if (e10 instanceof ActivityNotFoundException) {
                                sb2.append("no activity to handle url");
                            } else {
                                sb2.append("activity failed to open with unspecified reason");
                            }
                            if (OpenUrlActivity.this.f27690b != null) {
                                x xVar = OpenUrlActivity.this.f27690b;
                                String sb3 = sb2.toString();
                                if (TextUtils.isEmpty(str)) {
                                    str = "unknown url";
                                }
                                xVar.b(x.b("failedToStartStoreActivity", x.a("errMsg", TextUtils.isEmpty(sb3) ? "activity failed to open with unspecified reason" : sb3, ImagesContract.URL, str, null, null, null, null, null, false)));
                            }
                        }
                        OpenUrlActivity.this.finish();
                        return true;
                    }
                }
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }
    }

    @Override // android.app.Activity
    public void finish() {
        x xVar;
        if (this.f27692d && (xVar = this.f27690b) != null) {
            xVar.e("secondaryClose");
        }
        super.finish();
    }

    public void loadUrl(String str) {
        this.f27689a.stopLoading();
        this.f27689a.clearHistory();
        try {
            this.f27689a.loadUrl(str);
        } catch (Throwable th) {
            Logger.e("OpenUrlActivity", "OpenUrlActivity:: loadUrl: " + th.toString());
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (this.f27689a.canGoBack()) {
            this.f27689a.goBack();
        } else {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Logger.i("OpenUrlActivity", "onCreate()");
        try {
            this.f27690b = (x) com.ironsource.sdk.d.b.a((Context) this).f28044a.f27736a;
            requestWindowFeature(1);
            getWindow().setFlags(IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES, IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES);
            Bundle extras = getIntent().getExtras();
            this.f27694f = extras.getString(x.f27893c);
            this.f27692d = extras.getBoolean(x.f27894d);
            boolean booleanExtra = getIntent().getBooleanExtra("immersive", false);
            this.f27696h = booleanExtra;
            if (booleanExtra) {
                getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new a());
                runOnUiThread(this.f27697i);
            }
            RelativeLayout relativeLayout = new RelativeLayout(this);
            this.f27693e = relativeLayout;
            setContentView(relativeLayout, new ViewGroup.LayoutParams(-1, -1));
        } catch (Exception e10) {
            e10.printStackTrace();
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        WebView webView = this.f27689a;
        if (webView != null) {
            webView.destroy();
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (this.f27696h && (i10 == 25 || i10 == 24)) {
            this.f27695g.postDelayed(this.f27697i, 500L);
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Activity
    protected void onPause() {
        ViewGroup viewGroup;
        super.onPause();
        x xVar = this.f27690b;
        if (xVar != null) {
            xVar.a(false, "secondary");
            if (this.f27693e == null || (viewGroup = (ViewGroup) this.f27689a.getParent()) == null) {
                return;
            }
            if (viewGroup.findViewById(f27687j) != null) {
                viewGroup.removeView(this.f27689a);
            }
            if (viewGroup.findViewById(f27688k) != null) {
                viewGroup.removeView(this.f27691c);
            }
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        if (this.f27689a == null) {
            WebView webView = new WebView(getApplicationContext());
            this.f27689a = webView;
            webView.setId(f27687j);
            this.f27689a.getSettings().setJavaScriptEnabled(true);
            this.f27689a.setWebViewClient(new c(this, (byte) 0));
            loadUrl(this.f27694f);
        }
        if (findViewById(f27687j) == null) {
            this.f27693e.addView(this.f27689a, new RelativeLayout.LayoutParams(-1, -1));
        }
        if (this.f27691c == null) {
            this.f27691c = Build.VERSION.SDK_INT >= 11 ? new ProgressBar(new ContextThemeWrapper(this, 16973939)) : new ProgressBar(this);
            this.f27691c.setId(f27688k);
        }
        if (findViewById(f27688k) == null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            this.f27691c.setLayoutParams(layoutParams);
            this.f27691c.setVisibility(4);
            this.f27693e.addView(this.f27691c);
        }
        x xVar = this.f27690b;
        if (xVar != null) {
            xVar.a(true, "secondary");
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (this.f27696h && z10) {
            runOnUiThread(this.f27697i);
        }
    }
}
