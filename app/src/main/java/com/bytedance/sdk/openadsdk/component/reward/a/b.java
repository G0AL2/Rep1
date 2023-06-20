package com.bytedance.sdk.openadsdk.component.reward.a;

import android.app.Activity;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.webkit.DownloadListener;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.amazon.device.ads.DtbDeviceDataRetriever;
import com.bytedance.sdk.component.utils.HomeWatcherReceiver;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.e.p;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.core.widget.PlayableLoadingView;
import com.bytedance.sdk.openadsdk.utils.v;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: RewardFullPlayableManager.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: i  reason: collision with root package name */
    private Activity f11424i;

    /* renamed from: j  reason: collision with root package name */
    private n f11425j;

    /* renamed from: k  reason: collision with root package name */
    private f f11426k;

    /* renamed from: l  reason: collision with root package name */
    private String f11427l;

    /* renamed from: n  reason: collision with root package name */
    private PlayableLoadingView f11429n;

    /* renamed from: p  reason: collision with root package name */
    private HomeWatcherReceiver f11431p;

    /* renamed from: m  reason: collision with root package name */
    private int f11428m = 1;

    /* renamed from: a  reason: collision with root package name */
    protected final AtomicBoolean f11416a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    protected final AtomicBoolean f11417b = new AtomicBoolean(false);

    /* renamed from: o  reason: collision with root package name */
    private boolean f11430o = true;

    /* renamed from: c  reason: collision with root package name */
    boolean f11418c = false;

    /* renamed from: d  reason: collision with root package name */
    boolean f11419d = false;

    /* renamed from: e  reason: collision with root package name */
    long f11420e = 0;

    /* renamed from: f  reason: collision with root package name */
    int f11421f = 0;

    /* renamed from: g  reason: collision with root package name */
    int f11422g = 0;

    /* renamed from: h  reason: collision with root package name */
    int f11423h = 0;

    /* renamed from: q  reason: collision with root package name */
    private boolean f11432q = false;

    public b(Activity activity) {
        this.f11424i = activity;
    }

    private void l() {
        Activity activity = this.f11424i;
        this.f11429n = (PlayableLoadingView) activity.findViewById(t.e(activity, "tt_reward_playable_loading"));
    }

    private String m() {
        n nVar;
        String l10 = m.h().l();
        l.c("Playable", "getPlayableLoadH5Url->loadH5Url=" + l10);
        if (TextUtils.isEmpty(l10) || (nVar = this.f11425j) == null || nVar.aa() == null) {
            return l10;
        }
        String b10 = this.f11425j.aa().b();
        double d10 = this.f11425j.aa().d();
        int e10 = this.f11425j.aa().e();
        String a10 = (this.f11425j.M() == null || TextUtils.isEmpty(this.f11425j.M().a())) ? "" : this.f11425j.M().a();
        String Y = this.f11425j.Y();
        String c10 = this.f11425j.aa().c();
        String a11 = this.f11425j.aa().a();
        String b11 = this.f11425j.aa().b();
        String U = this.f11425j.U();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("appname=");
        stringBuffer.append(URLEncoder.encode(b10));
        stringBuffer.append("&stars=");
        stringBuffer.append(d10);
        stringBuffer.append("&comments=");
        stringBuffer.append(e10);
        stringBuffer.append("&icon=");
        stringBuffer.append(URLEncoder.encode(a10));
        stringBuffer.append("&downloading=");
        stringBuffer.append(true);
        stringBuffer.append("&id=");
        stringBuffer.append(URLEncoder.encode(Y));
        stringBuffer.append("&packageName=");
        stringBuffer.append(URLEncoder.encode(c10));
        stringBuffer.append("&downloadUrl=");
        stringBuffer.append(URLEncoder.encode(a11));
        stringBuffer.append("&name=");
        stringBuffer.append(URLEncoder.encode(b11));
        stringBuffer.append("&orientation=");
        stringBuffer.append(this.f11428m == 1 ? DtbDeviceDataRetriever.ORIENTATION_PORTRAIT : DtbDeviceDataRetriever.ORIENTATION_LANDSCAPE);
        stringBuffer.append("&apptitle=");
        stringBuffer.append(URLEncoder.encode(U));
        String str = l10 + "?" + stringBuffer.toString();
        l.c("Playable", "Playable-loadH5Url=" + str);
        return str;
    }

    public boolean d() {
        return this.f11418c;
    }

    public void e() {
        try {
            HomeWatcherReceiver homeWatcherReceiver = new HomeWatcherReceiver();
            this.f11431p = homeWatcherReceiver;
            homeWatcherReceiver.a(new HomeWatcherReceiver.a() { // from class: com.bytedance.sdk.openadsdk.component.reward.a.b.2
                @Override // com.bytedance.sdk.component.utils.HomeWatcherReceiver.a
                public void a() {
                    b.this.f11419d = true;
                }

                @Override // com.bytedance.sdk.component.utils.HomeWatcherReceiver.a
                public void b() {
                    b.this.f11419d = true;
                }
            });
            this.f11424i.getApplicationContext().registerReceiver(this.f11431p, new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
        } catch (Throwable unused) {
        }
    }

    public void f() {
        this.f11420e = System.currentTimeMillis();
    }

    public void g() {
        PlayableLoadingView playableLoadingView = this.f11429n;
        if (playableLoadingView != null) {
            playableLoadingView.a();
        }
    }

    public void h() {
        this.f11417b.set(true);
    }

    public boolean i() {
        return this.f11417b.get();
    }

    public int j() {
        return this.f11422g;
    }

    public int k() {
        return this.f11421f;
    }

    public void b() {
        if (this.f11416a.getAndSet(true) || this.f11426k.c() == null || this.f11426k.d() == null) {
            return;
        }
        v.a((View) this.f11426k.c(), 0);
        v.a((View) this.f11426k.d(), 8);
    }

    public void c() {
        this.f11418c = true;
    }

    public void d(int i10) {
        this.f11421f = i10;
    }

    public void a(f fVar, n nVar, String str, int i10) {
        if (this.f11432q) {
            return;
        }
        this.f11432q = true;
        this.f11426k = fVar;
        this.f11425j = nVar;
        this.f11427l = str;
        this.f11428m = i10;
        l();
    }

    public void c(int i10) {
        this.f11421f = i10 - 1;
    }

    public void b(boolean z10) {
        if (z10) {
            try {
                if (!TextUtils.isEmpty(this.f11426k.p()) && this.f11426k.n() != 0) {
                    com.bytedance.sdk.openadsdk.h.b.a().a(this.f11426k.p(), this.f11426k.n(), this.f11426k.o());
                }
            } catch (Throwable unused) {
            }
        }
        if (z10) {
            try {
                if (TextUtils.isEmpty(this.f11426k.p())) {
                    return;
                }
                com.bytedance.sdk.openadsdk.h.b.a().b(this.f11426k.p());
            } catch (Throwable unused2) {
            }
        }
    }

    public boolean a() {
        if (this.f11429n == null) {
            return false;
        }
        n nVar = this.f11425j;
        if (nVar != null && nVar.aG() && p.i(this.f11425j)) {
            this.f11429n.b();
            return true;
        }
        this.f11429n.a();
        return false;
    }

    public int b(int i10) {
        return this.f11423h - (this.f11422g - i10);
    }

    public void a(DownloadListener downloadListener) {
        if (this.f11426k.d() == null) {
            return;
        }
        String m10 = m();
        if (TextUtils.isEmpty(m10)) {
            return;
        }
        this.f11426k.d().setWebViewClient(new com.bytedance.sdk.openadsdk.core.widget.a.d(this.f11424i, this.f11426k.f(), this.f11425j.Y(), null, false) { // from class: com.bytedance.sdk.openadsdk.component.reward.a.b.1
            @Override // com.bytedance.sdk.openadsdk.core.widget.a.d, android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                if (b.this.f11430o) {
                    com.bytedance.sdk.openadsdk.b.e.c(this.f13115d, b.this.f11425j, b.this.f11427l, "loading_h5_success", (JSONObject) null);
                }
                super.onPageFinished(webView, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.a.d, android.webkit.WebViewClient
            public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                b.this.f11430o = false;
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.a.d, android.webkit.WebViewClient
            public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                b.this.f11430o = false;
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.a.d, android.webkit.WebViewClient
            public void onReceivedError(WebView webView, int i10, String str, String str2) {
                super.onReceivedError(webView, i10, str, str2);
                b.this.f11430o = false;
            }
        });
        this.f11426k.d().a(m10);
        this.f11426k.d().setDisplayZoomControls(false);
        this.f11426k.d().setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.a.c(this.f11426k.f(), this.f11426k.g()));
        this.f11426k.d().setDownloadListener(downloadListener);
    }

    public void a(boolean z10) {
        if (Build.VERSION.SDK_INT < 19 || !z10) {
            return;
        }
        this.f11426k.c().setDomStorageEnabled(true);
    }

    public void a(Context context) {
        try {
            this.f11431p.a(null);
            context.getApplicationContext().unregisterReceiver(this.f11431p);
        } catch (Throwable unused) {
        }
    }

    public void a(String str) {
        if (this.f11419d) {
            HashMap hashMap = new HashMap();
            hashMap.put("duration", Long.valueOf(System.currentTimeMillis() - this.f11420e));
            com.bytedance.sdk.openadsdk.b.e.c(this.f11424i, this.f11425j, this.f11427l, str, hashMap);
            if ("return_foreground".equals(str)) {
                this.f11419d = false;
            }
        }
    }

    public void a(Map<String, Object> map) {
        if (map != null) {
            map.put("duration", Long.valueOf(System.currentTimeMillis() - this.f11420e));
        }
    }

    public void a(int i10) {
        PlayableLoadingView playableLoadingView = this.f11429n;
        if (playableLoadingView != null) {
            playableLoadingView.setProgress(i10);
        }
    }

    public void a(com.bytedance.sdk.openadsdk.core.b.e eVar) {
        PlayableLoadingView playableLoadingView = this.f11429n;
        if (playableLoadingView == null || playableLoadingView.getPlayView() == null || !p.i(this.f11425j)) {
            return;
        }
        this.f11429n.getPlayView().setOnClickListener(eVar);
        this.f11429n.getPlayView().setOnTouchListener(eVar);
    }

    public void a(int i10, n nVar, boolean z10) {
        if (nVar == null) {
            return;
        }
        this.f11422g = nVar.at();
        this.f11423h = m.h().a(String.valueOf(i10), z10);
    }
}
