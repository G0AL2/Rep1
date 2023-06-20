package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.webkit.DownloadListener;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.b.a;
import com.bytedance.sdk.openadsdk.b.e;
import com.bytedance.sdk.openadsdk.b.n;
import com.bytedance.sdk.openadsdk.common.f;
import com.bytedance.sdk.openadsdk.core.e.o;
import com.bytedance.sdk.openadsdk.core.h;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.core.n;
import com.bytedance.sdk.openadsdk.core.w;
import com.bytedance.sdk.openadsdk.core.z;
import com.bytedance.sdk.openadsdk.e.d;
import com.bytedance.sdk.openadsdk.multipro.b;
import com.bytedance.sdk.openadsdk.utils.i;
import com.bytedance.sdk.openadsdk.utils.j;
import com.bytedance.sdk.openadsdk.utils.u;
import com.bytedance.sdk.openadsdk.utils.v;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;
import r3.c;

/* loaded from: classes.dex */
public class TTLandingPageActivity extends Activity implements d {

    /* renamed from: b  reason: collision with root package name */
    private static final String f10765b = "TTLandingPageActivity";
    private boolean A;
    private f B;
    private com.bytedance.sdk.openadsdk.common.d C;

    /* renamed from: a  reason: collision with root package name */
    n f10766a;

    /* renamed from: c  reason: collision with root package name */
    private SSWebView f10767c;

    /* renamed from: d  reason: collision with root package name */
    private ImageView f10768d;

    /* renamed from: e  reason: collision with root package name */
    private ImageView f10769e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f10770f;

    /* renamed from: g  reason: collision with root package name */
    private Context f10771g;

    /* renamed from: h  reason: collision with root package name */
    private int f10772h;

    /* renamed from: i  reason: collision with root package name */
    private ViewStub f10773i;

    /* renamed from: j  reason: collision with root package name */
    private ViewStub f10774j;

    /* renamed from: k  reason: collision with root package name */
    private ViewStub f10775k;

    /* renamed from: l  reason: collision with root package name */
    private Button f10776l;

    /* renamed from: m  reason: collision with root package name */
    private ProgressBar f10777m;

    /* renamed from: n  reason: collision with root package name */
    private String f10778n;

    /* renamed from: o  reason: collision with root package name */
    private String f10779o;

    /* renamed from: p  reason: collision with root package name */
    private w f10780p;

    /* renamed from: q  reason: collision with root package name */
    private int f10781q;

    /* renamed from: r  reason: collision with root package name */
    private String f10782r;

    /* renamed from: s  reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.e.n f10783s;

    /* renamed from: t  reason: collision with root package name */
    private c f10784t;

    /* renamed from: u  reason: collision with root package name */
    private String f10785u;

    /* renamed from: x  reason: collision with root package name */
    private String f10788x;

    /* renamed from: v  reason: collision with root package name */
    private AtomicBoolean f10786v = new AtomicBoolean(true);

    /* renamed from: w  reason: collision with root package name */
    private JSONArray f10787w = null;

    /* renamed from: y  reason: collision with root package name */
    private int f10789y = 0;

    /* renamed from: z  reason: collision with root package name */
    private int f10790z = 0;
    private String D = "ダウンロード";

    @Override // android.app.Activity
    public void onBackPressed() {
        if (e() && !this.f10786v.getAndSet(true)) {
            a(true);
            a(0);
            return;
        }
        super.onBackPressed();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a();
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!TTAdSdk.isInitSuccess()) {
            finish();
        }
        try {
            m.a(this);
        } catch (Throwable unused) {
        }
        setContentView(t.f(this, "tt_activity_ttlandingpage"));
        Intent intent = getIntent();
        this.f10772h = intent.getIntExtra("sdk_version", 1);
        this.f10778n = intent.getStringExtra("adid");
        this.f10779o = intent.getStringExtra("log_extra");
        this.f10781q = intent.getIntExtra("source", -1);
        String stringExtra = intent.getStringExtra(ImagesContract.URL);
        this.f10785u = stringExtra;
        a(4);
        String stringExtra2 = intent.getStringExtra("web_title");
        intent.getStringExtra("icon_url");
        this.f10782r = intent.getStringExtra("event_tag");
        this.f10788x = intent.getStringExtra("gecko_id");
        if (b.c()) {
            String stringExtra3 = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA);
            if (stringExtra3 != null) {
                try {
                    this.f10783s = com.bytedance.sdk.openadsdk.core.b.a(new JSONObject(stringExtra3));
                } catch (Exception e10) {
                    l.c(f10765b, "TTLandingPageActivity - onCreate MultiGlobalInfo : ", e10);
                }
            }
        } else {
            this.f10783s = com.bytedance.sdk.openadsdk.core.t.a().c();
            com.bytedance.sdk.openadsdk.core.t.a().h();
        }
        if (this.f10783s == null) {
            finish();
            return;
        }
        this.A = m.h().g();
        c();
        this.f10771g = this;
        if (this.f10767c != null) {
            com.bytedance.sdk.openadsdk.core.widget.a.b.a(this).a(false).b(false).a(this.f10767c.getWebView());
        }
        SSWebView sSWebView = this.f10767c;
        if (sSWebView != null && sSWebView.getWebView() != null) {
            this.f10766a = new n(this, this.f10783s, this.f10767c.getWebView()).a(true);
        }
        d();
        this.f10767c.setLandingPage(true);
        this.f10767c.setTag("landingpage");
        this.f10767c.setMaterialMeta(this.f10783s.aC());
        this.f10767c.setWebViewClient(new com.bytedance.sdk.openadsdk.core.widget.a.d(this.f10771g, this.f10780p, this.f10778n, this.f10766a, true) { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.1
            @Override // com.bytedance.sdk.openadsdk.core.widget.a.d, android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                try {
                    if (TTLandingPageActivity.this.f10777m == null || TTLandingPageActivity.this.isFinishing()) {
                        return;
                    }
                    TTLandingPageActivity.this.f10777m.setVisibility(8);
                } catch (Throwable unused2) {
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.a.d, android.webkit.WebViewClient
            public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                return super.shouldInterceptRequest(webView, str);
            }
        });
        SSWebView sSWebView2 = this.f10767c;
        if (sSWebView2 != null) {
            sSWebView2.setUserAgentString(i.a(sSWebView2.getWebView(), this.f10772h));
        }
        if (Build.VERSION.SDK_INT >= 21) {
            this.f10767c.setMixedContentMode(0);
        }
        e.a(this.f10771g, this.f10783s);
        j.a(this.f10767c, stringExtra);
        this.f10767c.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.a.c(this.f10780p, this.f10766a) { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.2
            @Override // com.bytedance.sdk.openadsdk.core.widget.a.c, android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i10) {
                super.onProgressChanged(webView, i10);
                if (TTLandingPageActivity.this.A) {
                    if (TTLandingPageActivity.this.B != null) {
                        TTLandingPageActivity.this.B.a(webView, i10);
                    }
                    if (TTLandingPageActivity.this.C == null || i10 != 100) {
                        return;
                    }
                    TTLandingPageActivity.this.C.a(webView);
                } else if (TTLandingPageActivity.this.f10777m == null || TTLandingPageActivity.this.isFinishing()) {
                } else {
                    if (i10 != 100 || !TTLandingPageActivity.this.f10777m.isShown()) {
                        TTLandingPageActivity.this.f10777m.setProgress(i10);
                    } else {
                        TTLandingPageActivity.this.f10777m.setVisibility(8);
                    }
                }
            }
        });
        if (this.A) {
            this.f10767c.getWebView().setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.3

                /* renamed from: a  reason: collision with root package name */
                float f10793a = 0.0f;

                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (motionEvent.getAction() == 0) {
                        this.f10793a = motionEvent.getY();
                    }
                    if (motionEvent.getAction() == 2) {
                        float y10 = motionEvent.getY();
                        float f10 = this.f10793a;
                        if (y10 - f10 > 8.0f) {
                            if (TTLandingPageActivity.this.B != null) {
                                TTLandingPageActivity.this.B.a();
                            }
                            if (TTLandingPageActivity.this.C != null) {
                                TTLandingPageActivity.this.C.a();
                            }
                            return false;
                        } else if (y10 - f10 < -8.0f) {
                            if (TTLandingPageActivity.this.B != null) {
                                TTLandingPageActivity.this.B.b();
                            }
                            if (TTLandingPageActivity.this.C != null) {
                                TTLandingPageActivity.this.C.b();
                            }
                        }
                    }
                    return false;
                }
            });
        }
        this.f10767c.setDownloadListener(new DownloadListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.4
            @Override // android.webkit.DownloadListener
            public void onDownloadStart(String str, String str2, String str3, String str4, long j10) {
                if (TTLandingPageActivity.this.f10784t != null) {
                    TTLandingPageActivity.this.f10784t.d();
                }
            }
        });
        TextView textView = this.f10770f;
        if (textView != null) {
            if (TextUtils.isEmpty(stringExtra2)) {
                stringExtra2 = t.a(this, "tt_web_title_default");
            }
            textView.setText(stringExtra2);
        }
        a();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        ViewGroup viewGroup;
        SSWebView sSWebView;
        super.onDestroy();
        n nVar = this.f10766a;
        if (nVar != null && (sSWebView = this.f10767c) != null) {
            nVar.a(sSWebView);
        }
        try {
            if (getWindow() != null && (viewGroup = (ViewGroup) getWindow().getDecorView()) != null) {
                viewGroup.removeAllViews();
            }
        } catch (Throwable unused) {
        }
        SSWebView sSWebView2 = this.f10767c;
        if (sSWebView2 != null) {
            z.a(this.f10771g, sSWebView2.getWebView());
            z.a(this.f10767c.getWebView());
        }
        this.f10767c = null;
        w wVar = this.f10780p;
        if (wVar != null) {
            wVar.n();
        }
        n nVar2 = this.f10766a;
        if (nVar2 != null) {
            nVar2.f();
        }
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        com.bytedance.sdk.openadsdk.core.t.a().b(true);
        w wVar = this.f10780p;
        if (wVar != null) {
            wVar.m();
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        w wVar = this.f10780p;
        if (wVar != null) {
            wVar.l();
        }
        n nVar = this.f10766a;
        if (nVar != null) {
            nVar.d();
        }
        f();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        n nVar = this.f10766a;
        if (nVar != null) {
            nVar.e();
        }
    }

    private String b() {
        com.bytedance.sdk.openadsdk.core.e.n nVar = this.f10783s;
        if (nVar != null && !TextUtils.isEmpty(nVar.W())) {
            this.D = this.f10783s.W();
        }
        return this.D;
    }

    private void c() {
        ViewStub viewStub;
        this.f10767c = (SSWebView) findViewById(t.e(this, "tt_browser_webview"));
        this.f10775k = (ViewStub) findViewById(t.e(this, "tt_browser_download_btn_stub"));
        this.f10773i = (ViewStub) findViewById(t.e(this, "tt_browser_titlebar_view_stub"));
        this.f10774j = (ViewStub) findViewById(t.e(this, "tt_browser_titlebar_dark_view_stub"));
        if (this.A) {
            ((ViewStub) findViewById(t.e(this, "tt_browser_new_title_bar_view_stub"))).setVisibility(0);
            ((ViewStub) findViewById(t.e(this, "tt_browser_new_bottom_bar_view_stub"))).setVisibility(0);
            LinearLayout linearLayout = (LinearLayout) findViewById(t.e(this, "tt_bottom_bar"));
            f fVar = new f(this, (RelativeLayout) findViewById(t.e(this, "tt_title_bar")), this.f10783s);
            this.B = fVar;
            ImageView c10 = fVar.c();
            this.f10769e = c10;
            c10.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.6
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTLandingPageActivity.this.finish();
                }
            });
            this.C = new com.bytedance.sdk.openadsdk.common.d(this, linearLayout, this.f10767c, this.f10783s, "landingpage");
            return;
        }
        int o10 = h.d().o();
        if (o10 == 0) {
            ViewStub viewStub2 = this.f10773i;
            if (viewStub2 != null) {
                viewStub2.setVisibility(0);
            }
        } else if (o10 == 1 && (viewStub = this.f10774j) != null) {
            viewStub.setVisibility(0);
        }
        ImageView imageView = (ImageView) findViewById(t.e(this, "tt_titlebar_back"));
        this.f10768d = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.7
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (TTLandingPageActivity.this.f10767c != null) {
                        if (TTLandingPageActivity.this.f10767c.e()) {
                            TTLandingPageActivity.this.f10767c.f();
                        } else if (TTLandingPageActivity.this.e()) {
                            TTLandingPageActivity.this.onBackPressed();
                        } else {
                            TTLandingPageActivity.this.finish();
                        }
                    }
                }
            });
        }
        ImageView imageView2 = (ImageView) findViewById(t.e(this, "tt_titlebar_close"));
        this.f10769e = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.8
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTLandingPageActivity.this.finish();
                }
            });
        }
        this.f10770f = (TextView) findViewById(t.e(this, "tt_titlebar_title"));
        ProgressBar progressBar = (ProgressBar) findViewById(t.e(this, "tt_browser_progress"));
        this.f10777m = progressBar;
        progressBar.setVisibility(0);
    }

    private void d() {
        w wVar = new w(this);
        this.f10780p = wVar;
        wVar.b(this.f10767c).d(this.f10778n).e(this.f10779o).a(this.f10783s).b(this.f10781q).a(this.f10783s.F()).f(u.i(this.f10783s)).a(this.f10767c).c("landingpage").a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e() {
        return !TextUtils.isEmpty(this.f10785u) && this.f10785u.contains("__luban_sdk");
    }

    private void f() {
        if (this.f10783s == null) {
            return;
        }
        JSONArray b10 = b(this.f10785u);
        int f10 = u.f(this.f10783s);
        int e10 = u.e(this.f10783s);
        com.bytedance.sdk.openadsdk.core.n<a> f11 = m.f();
        if (b10 == null || f11 == null || f10 <= 0 || e10 <= 0) {
            return;
        }
        o oVar = new o();
        oVar.f12203e = b10;
        AdSlot x10 = this.f10783s.x();
        if (x10 == null) {
            return;
        }
        x10.setAdCount(6);
        f11.a(x10, oVar, e10, new n.a() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.9
            @Override // com.bytedance.sdk.openadsdk.core.n.a
            public void a(int i10, String str) {
                TTLandingPageActivity.this.a(0);
            }

            @Override // com.bytedance.sdk.openadsdk.core.n.a
            public void a(com.bytedance.sdk.openadsdk.core.e.a aVar, com.bytedance.sdk.openadsdk.core.e.b bVar) {
                if (aVar != null) {
                    try {
                        TTLandingPageActivity.this.f10786v.set(false);
                        TTLandingPageActivity.this.f10780p.b(new JSONObject(aVar.c()));
                    } catch (Exception unused) {
                        TTLandingPageActivity.this.a(0);
                    }
                }
            }
        });
    }

    private void a() {
        com.bytedance.sdk.openadsdk.core.e.n nVar = this.f10783s;
        if (nVar == null || nVar.L() != 4) {
            return;
        }
        ViewStub viewStub = this.f10775k;
        if (viewStub != null) {
            viewStub.setVisibility(0);
        }
        Button button = (Button) findViewById(t.e(this, "tt_browser_download_btn"));
        this.f10776l = button;
        if (button != null) {
            a(b());
            if (this.f10784t == null) {
                this.f10784t = r3.d.a(this, this.f10783s, TextUtils.isEmpty(this.f10782r) ? u.a(this.f10781q) : this.f10782r);
            }
            com.bytedance.sdk.openadsdk.core.b.a aVar = new com.bytedance.sdk.openadsdk.core.b.a(this, this.f10783s, this.f10782r, this.f10781q);
            aVar.a(false);
            this.f10776l.setOnClickListener(aVar);
            this.f10776l.setOnTouchListener(aVar);
            aVar.c(true);
            aVar.a(this.f10784t);
        }
    }

    private JSONArray b(String str) {
        int i10;
        JSONArray jSONArray = this.f10787w;
        if (jSONArray != null && jSONArray.length() > 0) {
            return this.f10787w;
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int indexOf = str.indexOf("?id=");
        int indexOf2 = str.indexOf("&");
        if (indexOf == -1 || indexOf2 == -1 || (i10 = indexOf + 4) >= indexOf2) {
            return null;
        }
        String substring = str.substring(i10, indexOf2);
        if (TextUtils.isEmpty(substring)) {
            return null;
        }
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.put(substring);
        return jSONArray2;
    }

    private void a(final String str) {
        Button button;
        if (TextUtils.isEmpty(str) || (button = this.f10776l) == null) {
            return;
        }
        button.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.5
            @Override // java.lang.Runnable
            public void run() {
                if (TTLandingPageActivity.this.f10776l == null || TTLandingPageActivity.this.isFinishing()) {
                    return;
                }
                TTLandingPageActivity.this.f10776l.setText(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10) {
        if (this.f10769e == null || !e()) {
            return;
        }
        v.a((View) this.f10769e, i10);
    }

    private void a(boolean z10) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isBackIntercept", z10);
            this.f10780p.a("temai_back_event", jSONObject);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.e.d
    public void a(boolean z10, JSONArray jSONArray) {
        if (!z10 || jSONArray == null || jSONArray.length() <= 0) {
            return;
        }
        this.f10787w = jSONArray;
        f();
    }
}
