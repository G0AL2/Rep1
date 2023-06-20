package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.component.utils.x;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.TTAdDislike;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.b.e;
import com.bytedance.sdk.openadsdk.b.n;
import com.bytedance.sdk.openadsdk.b.u;
import com.bytedance.sdk.openadsdk.core.b.c;
import com.bytedance.sdk.openadsdk.core.b.d;
import com.bytedance.sdk.openadsdk.core.e.p;
import com.bytedance.sdk.openadsdk.core.h;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.core.w;
import com.bytedance.sdk.openadsdk.core.widget.PlayableLoadingView;
import com.bytedance.sdk.openadsdk.core.z;
import com.bytedance.sdk.openadsdk.dislike.b;
import com.bytedance.sdk.openadsdk.g.f;
import com.bytedance.sdk.openadsdk.j.a;
import com.bytedance.sdk.openadsdk.j.f;
import com.bytedance.sdk.openadsdk.j.g;
import com.bytedance.sdk.openadsdk.utils.i;
import com.bytedance.sdk.openadsdk.utils.j;
import com.bytedance.sdk.openadsdk.utils.v;
import com.google.android.gms.common.internal.ImagesContract;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import r3.c;

/* loaded from: classes.dex */
public class TTPlayableLandingPageActivity extends Activity implements x.a, d, f {
    private static final f.a J = new f.a() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.1
        @Override // com.bytedance.sdk.openadsdk.j.f.a
        public void a(String str, String str2) {
            l.b(str, str2);
        }

        @Override // com.bytedance.sdk.openadsdk.j.f.a
        public void a(String str, String str2, Throwable th) {
            l.c(str, str2, th);
        }
    };
    private c A;
    private String C;
    private g F;
    private u H;
    private n I;

    /* renamed from: a  reason: collision with root package name */
    TTAdDislike f10802a;

    /* renamed from: b  reason: collision with root package name */
    protected com.bytedance.sdk.openadsdk.g.g f10803b;

    /* renamed from: d  reason: collision with root package name */
    private SSWebView f10805d;

    /* renamed from: e  reason: collision with root package name */
    private SSWebView f10806e;

    /* renamed from: h  reason: collision with root package name */
    private RelativeLayout f10809h;

    /* renamed from: i  reason: collision with root package name */
    private View f10810i;

    /* renamed from: j  reason: collision with root package name */
    private ImageView f10811j;

    /* renamed from: k  reason: collision with root package name */
    private Context f10812k;

    /* renamed from: l  reason: collision with root package name */
    private int f10813l;

    /* renamed from: m  reason: collision with root package name */
    private ProgressBar f10814m;

    /* renamed from: n  reason: collision with root package name */
    private PlayableLoadingView f10815n;

    /* renamed from: o  reason: collision with root package name */
    private String f10816o;

    /* renamed from: p  reason: collision with root package name */
    private String f10817p;

    /* renamed from: q  reason: collision with root package name */
    private w f10818q;

    /* renamed from: r  reason: collision with root package name */
    private w f10819r;

    /* renamed from: s  reason: collision with root package name */
    private int f10820s;

    /* renamed from: t  reason: collision with root package name */
    private String f10821t;

    /* renamed from: u  reason: collision with root package name */
    private String f10822u;

    /* renamed from: w  reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.e.n f10824w;

    /* renamed from: y  reason: collision with root package name */
    private boolean f10826y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f10827z;

    /* renamed from: f  reason: collision with root package name */
    private boolean f10807f = true;

    /* renamed from: g  reason: collision with root package name */
    private boolean f10808g = true;

    /* renamed from: v  reason: collision with root package name */
    private final String f10823v = "embeded_ad";

    /* renamed from: x  reason: collision with root package name */
    private x f10825x = new x(Looper.getMainLooper(), this);
    private AtomicBoolean B = new AtomicBoolean(false);
    private int D = 0;
    private int E = 0;
    private boolean G = false;

    /* renamed from: c  reason: collision with root package name */
    protected com.bytedance.sdk.openadsdk.g.d f10804c = new com.bytedance.sdk.openadsdk.g.d() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.5
        @Override // com.bytedance.sdk.openadsdk.g.d
        public void a() {
            if (!TTPlayableLandingPageActivity.this.isFinishing() && p.e(TTPlayableLandingPageActivity.this.f10824w) && p.g(TTPlayableLandingPageActivity.this.f10824w)) {
                TTPlayableLandingPageActivity.this.f10825x.removeMessages(2);
                TTPlayableLandingPageActivity.this.f10825x.sendMessage(TTPlayableLandingPageActivity.this.a(1));
            }
        }

        @Override // com.bytedance.sdk.openadsdk.g.d
        public void b() {
            if (p.e(TTPlayableLandingPageActivity.this.f10824w) && p.f(TTPlayableLandingPageActivity.this.f10824w)) {
                TTPlayableLandingPageActivity.this.f10825x.sendMessageDelayed(TTPlayableLandingPageActivity.this.a(0), 1000L);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.g.d
        public void a(int i10) {
            if (!p.e(TTPlayableLandingPageActivity.this.f10824w) || TTPlayableLandingPageActivity.this.f10815n == null) {
                return;
            }
            TTPlayableLandingPageActivity.this.f10815n.setProgress(i10);
        }
    };

    @Override // android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        u uVar = this.H;
        if (uVar != null) {
            uVar.i();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!TTAdSdk.isInitSuccess()) {
            finish();
        }
        try {
            requestWindowFeature(1);
            getWindow().addFlags(IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES);
            getWindow().addFlags(16777216);
            m.a(this);
        } catch (Throwable unused) {
        }
        a(bundle);
        com.bytedance.sdk.openadsdk.core.e.n nVar = this.f10824w;
        if (nVar == null) {
            return;
        }
        int h10 = p.h(nVar);
        if (h10 != 0) {
            if (h10 == 1) {
                setRequestedOrientation(1);
            } else if (h10 == 2) {
                setRequestedOrientation(0);
            }
        } else if (Build.VERSION.SDK_INT >= 18) {
            setRequestedOrientation(14);
        } else {
            setRequestedOrientation(1);
        }
        this.f10812k = this;
        setContentView(t.f(this, "tt_activity_ttlandingpage_playable"));
        h();
        e();
        a();
        l();
        f();
        g();
        u uVar = this.H;
        if (uVar != null) {
            uVar.h();
        }
        com.bytedance.sdk.openadsdk.g.g gVar = new com.bytedance.sdk.openadsdk.g.g(getApplicationContext());
        this.f10803b = gVar;
        gVar.a(this);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        ViewGroup viewGroup;
        super.onDestroy();
        u uVar = this.H;
        if (uVar != null) {
            uVar.a(true);
            this.H.m();
        }
        x xVar = this.f10825x;
        if (xVar != null) {
            xVar.removeCallbacksAndMessages(null);
        }
        try {
            if (getWindow() != null && (viewGroup = (ViewGroup) getWindow().getDecorView()) != null) {
                viewGroup.removeAllViews();
            }
        } catch (Throwable unused) {
        }
        SSWebView sSWebView = this.f10805d;
        if (sSWebView != null) {
            z.a(this.f10812k, sSWebView.getWebView());
            z.a(this.f10805d.getWebView());
            this.f10805d.l();
        }
        this.f10805d = null;
        w wVar = this.f10818q;
        if (wVar != null) {
            wVar.n();
        }
        w wVar2 = this.f10819r;
        if (wVar2 != null) {
            wVar2.n();
        }
        g gVar = this.F;
        if (gVar != null) {
            gVar.v();
        }
        n nVar = this.I;
        if (nVar != null) {
            nVar.f();
        }
        this.f10803b = null;
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        com.bytedance.sdk.openadsdk.core.t.a().b(true);
        w wVar = this.f10818q;
        if (wVar != null) {
            wVar.m();
            this.f10818q.b(false);
        }
        w wVar2 = this.f10819r;
        if (wVar2 != null) {
            wVar2.m();
        }
        g gVar = this.F;
        if (gVar != null) {
            gVar.a(true);
            this.F.q();
            this.F.b(false);
        }
        com.bytedance.sdk.openadsdk.g.g gVar2 = this.f10803b;
        if (gVar2 != null) {
            gVar2.f();
            this.f10803b.a((com.bytedance.sdk.openadsdk.g.f) null);
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        w wVar = this.f10818q;
        if (wVar != null) {
            wVar.l();
            SSWebView sSWebView = this.f10805d;
            if (sSWebView != null) {
                this.f10818q.b(sSWebView.getVisibility() == 0);
            }
        }
        w wVar2 = this.f10819r;
        if (wVar2 != null) {
            wVar2.l();
        }
        g gVar = this.F;
        if (gVar != null) {
            gVar.r();
            this.F.b(true);
        }
        n nVar = this.I;
        if (nVar != null) {
            nVar.d();
        }
        com.bytedance.sdk.openadsdk.g.g gVar2 = this.f10803b;
        if (gVar2 != null) {
            gVar2.a(this);
            this.f10803b.e();
            if (this.f10803b.g() == 0) {
                this.G = true;
            }
            b(this.G);
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        try {
            com.bytedance.sdk.openadsdk.core.e.n nVar = this.f10824w;
            bundle.putString("material_meta", nVar != null ? nVar.ar().toString() : null);
            bundle.putInt("sdk_version", this.f10813l);
            bundle.putString("adid", this.f10816o);
            bundle.putString("log_extra", this.f10817p);
            bundle.putInt("source", this.f10820s);
            bundle.putBoolean("ad_pending_download", this.f10826y);
            bundle.putString(ImagesContract.URL, this.f10821t);
            bundle.putString("web_title", this.f10822u);
            bundle.putString("event_tag", "embeded_ad");
        } catch (Throwable unused) {
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        u uVar = this.H;
        if (uVar != null) {
            uVar.k();
        }
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        u uVar = this.H;
        if (uVar != null) {
            uVar.j();
        }
        n nVar = this.I;
        if (nVar != null) {
            nVar.e();
        }
    }

    private void f() {
        int i10 = m.h().n(String.valueOf(com.bytedance.sdk.openadsdk.utils.u.f(this.f10824w))).f12326p;
        if (i10 >= 0) {
            this.f10825x.sendEmptyMessageDelayed(1, i10 * 1000);
        } else {
            v.a((View) this.f10809h, 0);
        }
    }

    private void g() {
        SSWebView sSWebView = this.f10805d;
        if (sSWebView == null) {
            return;
        }
        sSWebView.setLandingPage(true);
        this.f10805d.setTag("landingpage");
        this.f10805d.setMaterialMeta(this.f10824w.aC());
        n a10 = new n(this, this.f10824w, this.f10805d.getWebView()).a(true);
        this.I = a10;
        a10.a("embeded_ad");
        this.I.a(this.H);
        this.f10805d.setWebViewClient(new com.bytedance.sdk.openadsdk.core.widget.a.d(this.f10812k, this.f10818q, this.f10816o, this.I, true) { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.9
            @Override // com.bytedance.sdk.openadsdk.core.widget.a.d, android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                if (TTPlayableLandingPageActivity.this.isFinishing()) {
                    return;
                }
                if (TTPlayableLandingPageActivity.this.F != null) {
                    TTPlayableLandingPageActivity.this.F.h(str);
                }
                try {
                    TTPlayableLandingPageActivity.this.f10804c.b();
                } catch (Throwable unused) {
                }
                try {
                    if (TTPlayableLandingPageActivity.this.f10814m != null) {
                        TTPlayableLandingPageActivity.this.f10814m.setVisibility(8);
                    }
                    if (TTPlayableLandingPageActivity.this.f10807f) {
                        TTPlayableLandingPageActivity.this.i();
                        TTPlayableLandingPageActivity.this.a("py_loading_success");
                        w wVar = this.f13114c;
                        if (wVar != null) {
                            wVar.b(true);
                        }
                    }
                } catch (Throwable unused2) {
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.a.d, android.webkit.WebViewClient
            public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                super.onPageStarted(webView, str, bitmap);
                if (TTPlayableLandingPageActivity.this.F != null) {
                    TTPlayableLandingPageActivity.this.F.g(str);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.a.d, android.webkit.WebViewClient
            public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                TTPlayableLandingPageActivity.this.f10807f = false;
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.a.d, android.webkit.WebViewClient
            public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                if (TTPlayableLandingPageActivity.this.f10821t != null && webResourceRequest != null && webResourceRequest.getUrl() != null && TTPlayableLandingPageActivity.this.f10821t.equals(webResourceRequest.getUrl().toString())) {
                    TTPlayableLandingPageActivity.this.f10807f = false;
                }
                if (TTPlayableLandingPageActivity.this.F != null && webResourceRequest != null) {
                    try {
                        TTPlayableLandingPageActivity.this.F.a(webResourceRequest.isForMainFrame(), webResourceRequest.getUrl().toString(), webResourceResponse.getStatusCode());
                    } catch (Throwable unused) {
                    }
                }
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.a.d, android.webkit.WebViewClient
            public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                try {
                    if (TTPlayableLandingPageActivity.this.F != null) {
                        TTPlayableLandingPageActivity.this.F.i(str);
                    }
                } catch (Exception unused) {
                }
                return super.shouldInterceptRequest(webView, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.a.d, android.webkit.WebViewClient
            public void onReceivedError(WebView webView, int i10, String str, String str2) {
                super.onReceivedError(webView, i10, str, str2);
                TTPlayableLandingPageActivity.this.f10807f = false;
                if (TTPlayableLandingPageActivity.this.F != null) {
                    TTPlayableLandingPageActivity.this.F.a(i10, str, str2);
                }
            }
        });
        a(this.f10805d);
        a(this.f10806e);
        j();
        j.a(this.f10805d, this.f10821t);
        this.f10805d.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.a.c(this.f10818q, this.I) { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.10
            @Override // com.bytedance.sdk.openadsdk.core.widget.a.c, android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i10) {
                super.onProgressChanged(webView, i10);
                if (TTPlayableLandingPageActivity.this.isFinishing()) {
                    return;
                }
                try {
                    TTPlayableLandingPageActivity.this.f10804c.a(i10);
                } catch (Throwable unused) {
                }
                if (TTPlayableLandingPageActivity.this.f10814m != null) {
                    if (i10 != 100 || !TTPlayableLandingPageActivity.this.f10814m.isShown()) {
                        TTPlayableLandingPageActivity.this.f10814m.setProgress(i10);
                        return;
                    }
                    TTPlayableLandingPageActivity.this.f10814m.setVisibility(8);
                    TTPlayableLandingPageActivity.this.i();
                }
            }
        });
    }

    private void h() {
        this.f10815n = (PlayableLoadingView) findViewById(t.e(this, "tt_playable_loading"));
        this.f10805d = (SSWebView) findViewById(t.e(this, "tt_browser_webview"));
        this.f10806e = (SSWebView) findViewById(t.e(this, "tt_browser_webview_loading"));
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(t.e(this, "tt_playable_ad_close_layout"));
        this.f10809h = relativeLayout;
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.11
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (TTPlayableLandingPageActivity.this.H != null) {
                        TTPlayableLandingPageActivity.this.H.i();
                    }
                    TTPlayableLandingPageActivity.this.a("playable_close");
                    TTPlayableLandingPageActivity.this.finish();
                }
            });
        }
        this.f10814m = (ProgressBar) findViewById(t.e(this, "tt_browser_progress"));
        View findViewById = findViewById(t.e(this, "tt_playable_ad_dislike"));
        this.f10810i = findViewById;
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.12
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                TTPlayableLandingPageActivity.this.b();
            }
        });
        ImageView imageView = (ImageView) findViewById(t.e(this, "tt_playable_ad_mute"));
        this.f10811j = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                TTPlayableLandingPageActivity tTPlayableLandingPageActivity = TTPlayableLandingPageActivity.this;
                tTPlayableLandingPageActivity.G = !tTPlayableLandingPageActivity.G;
                TTPlayableLandingPageActivity tTPlayableLandingPageActivity2 = TTPlayableLandingPageActivity.this;
                tTPlayableLandingPageActivity2.b(tTPlayableLandingPageActivity2.G);
                if (TTPlayableLandingPageActivity.this.F != null) {
                    TTPlayableLandingPageActivity.this.F.a(TTPlayableLandingPageActivity.this.G);
                }
            }
        });
        this.f10805d.setBackgroundColor(-16777216);
        this.f10806e.setBackgroundColor(-16777216);
        v.a((View) this.f10805d, 4);
        v.a((View) this.f10806e, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        SSWebView sSWebView;
        if (this.B.getAndSet(true) || (sSWebView = this.f10805d) == null || this.f10806e == null) {
            return;
        }
        v.a((View) sSWebView, 0);
        v.a((View) this.f10806e, 8);
    }

    private void j() {
        if (this.f10806e == null) {
            return;
        }
        String k10 = k();
        if (TextUtils.isEmpty(k10)) {
            return;
        }
        this.f10806e.setWebViewClient(new com.bytedance.sdk.openadsdk.core.widget.a.d(this.f10812k, this.f10819r, this.f10816o, null, false) { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.4
            @Override // com.bytedance.sdk.openadsdk.core.widget.a.d, android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                if (TTPlayableLandingPageActivity.this.f10808g) {
                    TTPlayableLandingPageActivity.this.a("loading_h5_success");
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.a.d, android.webkit.WebViewClient
            public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                TTPlayableLandingPageActivity.this.f10808g = false;
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.a.d, android.webkit.WebViewClient
            public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                TTPlayableLandingPageActivity.this.f10808g = false;
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.a.d, android.webkit.WebViewClient
            public void onReceivedError(WebView webView, int i10, String str, String str2) {
                super.onReceivedError(webView, i10, str, str2);
                TTPlayableLandingPageActivity.this.f10808g = false;
            }
        });
        this.f10806e.a(k10);
    }

    private String k() {
        com.bytedance.sdk.openadsdk.core.e.n nVar;
        String j10 = m.h().j();
        if (TextUtils.isEmpty(j10) || (nVar = this.f10824w) == null || nVar.aa() == null) {
            return j10;
        }
        String b10 = this.f10824w.aa().b();
        double d10 = this.f10824w.aa().d();
        int e10 = this.f10824w.aa().e();
        String a10 = (this.f10824w.M() == null || TextUtils.isEmpty(this.f10824w.M().a())) ? "" : this.f10824w.M().a();
        String Y = this.f10824w.Y();
        String c10 = this.f10824w.aa().c();
        String a11 = this.f10824w.aa().a();
        String b11 = this.f10824w.aa().b();
        StringBuffer stringBuffer = new StringBuffer(j10);
        stringBuffer.append("?appname=");
        stringBuffer.append(b10);
        stringBuffer.append("&stars=");
        stringBuffer.append(d10);
        stringBuffer.append("&comments=");
        stringBuffer.append(e10);
        stringBuffer.append("&icon=");
        stringBuffer.append(a10);
        stringBuffer.append("&downloading=");
        stringBuffer.append(false);
        stringBuffer.append("&id=");
        stringBuffer.append(Y);
        stringBuffer.append("&pkg_name=");
        stringBuffer.append(c10);
        stringBuffer.append("&download_url=");
        stringBuffer.append(a11);
        stringBuffer.append("&name=");
        stringBuffer.append(b11);
        return stringBuffer.toString();
    }

    private void l() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f10824w);
        this.H = new u(3, "embeded_ad", this.f10824w);
        w wVar = new w(this);
        this.f10818q = wVar;
        wVar.b(this.f10805d).a(this.f10824w).a(arrayList).d(this.f10816o).e(this.f10817p).c("embeded_ad").b(this.f10820s).a(this).a(this.H).a(this.f10804c).a(this.f10805d).f(com.bytedance.sdk.openadsdk.utils.u.i(this.f10824w));
        w wVar2 = new w(this);
        this.f10819r = wVar2;
        wVar2.b(this.f10806e).a(this.f10824w).d(this.f10816o).e(this.f10817p).a(this).b(this.f10820s).c(false).a(this.H).a(this.f10806e).f(com.bytedance.sdk.openadsdk.utils.u.i(this.f10824w));
        d();
    }

    private void d() {
        if (this.F != null) {
            return;
        }
        if (h.d().s()) {
            com.bytedance.sdk.openadsdk.j.f.a(J);
        }
        a aVar = new a() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.6
            @Override // com.bytedance.sdk.openadsdk.j.a
            public com.bytedance.sdk.openadsdk.j.d a() {
                String f10 = com.bytedance.sdk.openadsdk.common.a.f();
                f10.hashCode();
                char c10 = 65535;
                switch (f10.hashCode()) {
                    case 1653:
                        if (f10.equals("2g")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case 1684:
                        if (f10.equals("3g")) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case 1715:
                        if (f10.equals("4g")) {
                            c10 = 2;
                            break;
                        }
                        break;
                    case 1746:
                        if (f10.equals("5g")) {
                            c10 = 3;
                            break;
                        }
                        break;
                    case 3649301:
                        if (f10.equals("wifi")) {
                            c10 = 4;
                            break;
                        }
                        break;
                }
                switch (c10) {
                    case 0:
                        return com.bytedance.sdk.openadsdk.j.d.TYPE_2G;
                    case 1:
                        return com.bytedance.sdk.openadsdk.j.d.TYPE_3G;
                    case 2:
                        return com.bytedance.sdk.openadsdk.j.d.TYPE_4G;
                    case 3:
                        return com.bytedance.sdk.openadsdk.j.d.TYPE_5G;
                    case 4:
                        return com.bytedance.sdk.openadsdk.j.d.TYPE_WIFI;
                    default:
                        return com.bytedance.sdk.openadsdk.j.d.TYPE_UNKNOWN;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.j.a
            public void a(JSONObject jSONObject) {
            }

            @Override // com.bytedance.sdk.openadsdk.j.a
            public void b() {
            }

            @Override // com.bytedance.sdk.openadsdk.j.a
            public void b(JSONObject jSONObject) {
            }

            @Override // com.bytedance.sdk.openadsdk.j.a
            public void c(JSONObject jSONObject) {
                e.b(TTPlayableLandingPageActivity.this.getApplicationContext(), TTPlayableLandingPageActivity.this.f10824w, "embeded_ad", "playable_track", jSONObject);
            }
        };
        com.bytedance.sdk.openadsdk.j.c cVar = new com.bytedance.sdk.openadsdk.j.c() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.7
            @Override // com.bytedance.sdk.openadsdk.j.c
            public void a(String str, JSONObject jSONObject) {
                TTPlayableLandingPageActivity.this.f10818q.a(str, jSONObject);
            }
        };
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cid", this.f10816o);
            jSONObject.put("log_extra", this.f10817p);
            this.F = g.a(getApplicationContext(), this.f10805d.getWebView(), cVar, aVar).f(this.f10821t).e(com.bytedance.sdk.openadsdk.common.a.a(m.a())).a(com.bytedance.sdk.openadsdk.common.a.a()).a(jSONObject).b(com.bytedance.sdk.openadsdk.common.a.e()).a("sdkEdition", com.bytedance.sdk.openadsdk.common.a.c()).d(com.bytedance.sdk.openadsdk.common.a.d()).c(false).a(this.G).b(true);
        } catch (Throwable unused) {
        }
        if (!TextUtils.isEmpty(p.b(this.f10824w))) {
            this.F.c(p.b(this.f10824w));
        }
        Set<String> j10 = this.F.j();
        final WeakReference weakReference = new WeakReference(this.F);
        for (String str : j10) {
            if (!"subscribe_app_ad".equals(str) && !"adInfo".equals(str) && !"webview_time_track".equals(str) && !"download_app_ad".equals(str)) {
                this.f10818q.a().a(str, new com.bytedance.sdk.component.a.e<JSONObject, JSONObject>() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.8
                    @Override // com.bytedance.sdk.component.a.e
                    public JSONObject a(JSONObject jSONObject2, com.bytedance.sdk.component.a.f fVar) throws Exception {
                        try {
                            g gVar = (g) weakReference.get();
                            if (gVar == null) {
                                return null;
                            }
                            return gVar.c(a(), jSONObject2);
                        } catch (Throwable unused2) {
                            return null;
                        }
                    }
                });
            }
        }
    }

    private void e() {
        if (this.f10824w.L() == 4) {
            this.A = r3.d.a(this.f10812k, this.f10824w, "interaction");
        }
    }

    protected void b() {
        if (this.f10824w == null || isFinishing()) {
            return;
        }
        if (this.f10802a == null) {
            c();
        }
        this.f10802a.showDislikeDialog();
    }

    void c() {
        this.f10802a = new b(this, this.f10824w);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Message a(int i10) {
        Message obtain = Message.obtain();
        obtain.what = 2;
        obtain.arg1 = i10;
        return obtain;
    }

    protected void b(boolean z10) {
        int d10;
        try {
            this.G = z10;
            if (z10) {
                d10 = t.d(this.f10812k, "tt_mute");
            } else {
                d10 = t.d(this.f10812k, "tt_unmute");
            }
            this.f10811j.setImageResource(d10);
            g gVar = this.F;
            if (gVar != null) {
                gVar.a(z10);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void a(Bundle bundle) {
        Intent intent = getIntent();
        if (intent != null) {
            this.f10813l = intent.getIntExtra("sdk_version", 1);
            this.f10816o = intent.getStringExtra("adid");
            this.f10817p = intent.getStringExtra("log_extra");
            this.f10820s = intent.getIntExtra("source", -1);
            this.f10826y = intent.getBooleanExtra("ad_pending_download", false);
            this.f10821t = intent.getStringExtra(ImagesContract.URL);
            this.C = intent.getStringExtra("gecko_id");
            this.f10822u = intent.getStringExtra("web_title");
            if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
                String stringExtra = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA);
                if (stringExtra != null) {
                    try {
                        this.f10824w = com.bytedance.sdk.openadsdk.core.b.a(new JSONObject(stringExtra));
                    } catch (Exception e10) {
                        l.c("TTPWPActivity", "TTPlayableLandingPageActivity - onCreate MultiGlobalInfo : ", e10);
                    }
                }
            } else {
                this.f10824w = com.bytedance.sdk.openadsdk.core.t.a().c();
                com.bytedance.sdk.openadsdk.core.t.a().h();
            }
        }
        if (bundle != null) {
            try {
                this.f10813l = bundle.getInt("sdk_version", 1);
                this.f10816o = bundle.getString("adid");
                this.f10817p = bundle.getString("log_extra");
                this.f10820s = bundle.getInt("source", -1);
                this.f10826y = bundle.getBoolean("ad_pending_download", false);
                this.f10821t = bundle.getString(ImagesContract.URL);
                this.f10822u = bundle.getString("web_title");
                String string = bundle.getString("material_meta", null);
                if (!TextUtils.isEmpty(string)) {
                    this.f10824w = com.bytedance.sdk.openadsdk.core.b.a(new JSONObject(string));
                }
            } catch (Throwable unused) {
            }
        }
        if (this.f10824w == null) {
            l.e("TTPWPActivity", "material is null, no data to display");
            finish();
            return;
        }
        try {
            this.G = m.h().b(Integer.parseInt(this.f10824w.x().getCodeId()));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.g.f
    public void b(int i10) {
        b(i10 <= 0);
    }

    protected void a() {
        if (this.f10815n == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.e.n nVar = this.f10824w;
        if (nVar != null && !p.e(nVar)) {
            this.f10815n.a();
            return;
        }
        this.f10815n.b();
        if (this.f10815n.getPlayView() != null) {
            com.bytedance.sdk.openadsdk.core.b.a aVar = new com.bytedance.sdk.openadsdk.core.b.a(this, this.f10824w, "embeded_ad", this.f10820s) { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.3
                @Override // com.bytedance.sdk.openadsdk.core.b.a, com.bytedance.sdk.openadsdk.core.b.b, com.bytedance.sdk.openadsdk.core.b.c
                public void a(View view, float f10, float f11, float f12, float f13, SparseArray<c.a> sparseArray, boolean z10) {
                    com.bytedance.sdk.openadsdk.core.e.n nVar2 = this.f11870d;
                    if (nVar2 == null || nVar2.i() != 1 || z10) {
                        super.a(view, f10, f11, f12, f13, sparseArray, z10);
                        TTPlayableLandingPageActivity.this.f10826y = true;
                        TTPlayableLandingPageActivity.this.f10827z = true;
                        HashMap hashMap = new HashMap();
                        hashMap.put("playable_url", TTPlayableLandingPageActivity.this.f10821t);
                        TTPlayableLandingPageActivity tTPlayableLandingPageActivity = TTPlayableLandingPageActivity.this;
                        e.e(tTPlayableLandingPageActivity, tTPlayableLandingPageActivity.f10824w, this.f11871e, "click_playable_download_button_loading", hashMap);
                    }
                }
            };
            aVar.a(this.A);
            this.f10815n.getPlayView().setOnClickListener(aVar);
        }
        if (p.g(this.f10824w)) {
            this.f10825x.sendMessageDelayed(a(2), 10000L);
        }
    }

    private void a(SSWebView sSWebView) {
        if (sSWebView == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.widget.a.b.a(this.f10812k).a(false).b(false).a(sSWebView.getWebView());
        sSWebView.setUserAgentString(i.a(sSWebView.getWebView(), this.f10813l));
        if (Build.VERSION.SDK_INT >= 21) {
            sSWebView.setMixedContentMode(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        e.c(this, this.f10824w, "embeded_ad", str, (JSONObject) null);
    }

    @Override // com.bytedance.sdk.component.utils.x.a
    public void a(Message message) {
        int i10 = message.what;
        if (i10 == 1) {
            v.a((View) this.f10809h, 0);
        } else if (i10 != 2) {
        } else {
            l.a("playable hidden loading , type:" + message.arg1);
            HashMap hashMap = new HashMap();
            hashMap.put("remove_loading_page_type", Integer.valueOf(message.arg1));
            hashMap.put("playable_url", this.f10821t);
            e.e(this, this.f10824w, "embeded_ad", "remove_loading_page", hashMap);
            this.f10825x.removeMessages(2);
            PlayableLoadingView playableLoadingView = this.f10815n;
            if (playableLoadingView != null) {
                playableLoadingView.a();
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.b.d
    public void a(boolean z10) {
        r3.c cVar;
        this.f10826y = true;
        this.f10827z = z10;
        if (!z10) {
            try {
                Toast.makeText(this.f10812k, t.a(m.a(), "tt_toast_later_download"), 0).show();
            } catch (Throwable unused) {
            }
        }
        if (!this.f10827z || (cVar = this.A) == null) {
            return;
        }
        cVar.d();
    }
}
