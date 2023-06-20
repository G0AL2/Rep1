package com.bytedance.sdk.component.widget;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.webkit.DownloadListener;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.component.utils.v;
import com.google.android.gms.common.internal.ImagesContract;
import java.lang.reflect.Method;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class SSWebView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private com.bytedance.sdk.component.widget.b.a f10487a;

    /* renamed from: b  reason: collision with root package name */
    private String f10488b;

    /* renamed from: c  reason: collision with root package name */
    private JSONObject f10489c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f10490d;

    /* renamed from: e  reason: collision with root package name */
    private float f10491e;

    /* renamed from: f  reason: collision with root package name */
    private float f10492f;

    /* renamed from: g  reason: collision with root package name */
    private long f10493g;

    /* renamed from: h  reason: collision with root package name */
    private long f10494h;

    /* renamed from: i  reason: collision with root package name */
    private long f10495i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f10496j;

    /* renamed from: k  reason: collision with root package name */
    private WebView f10497k;

    /* renamed from: l  reason: collision with root package name */
    private float f10498l;

    /* renamed from: m  reason: collision with root package name */
    private float f10499m;

    /* renamed from: n  reason: collision with root package name */
    private b f10500n;

    /* renamed from: o  reason: collision with root package name */
    private v f10501o;

    /* renamed from: p  reason: collision with root package name */
    private AttributeSet f10502p;

    /* renamed from: q  reason: collision with root package name */
    private Context f10503q;

    /* renamed from: r  reason: collision with root package name */
    private c f10504r;

    /* loaded from: classes.dex */
    public static class a extends WebViewClient {
        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (Build.VERSION.SDK_INT < 26) {
                return super.onRenderProcessGone(webView, renderProcessGoneDetail);
            }
            if (renderProcessGoneDetail.didCrash()) {
                if (webView != null) {
                    ViewGroup viewGroup = (ViewGroup) webView.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(webView);
                    }
                    webView.destroy();
                }
                return true;
            }
            if (webView != null) {
                ViewGroup viewGroup2 = (ViewGroup) webView.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(webView);
                }
                webView.destroy();
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(boolean z10);
    }

    public SSWebView(Context context) {
        super(a(context));
        this.f10491e = 0.0f;
        this.f10492f = 0.0f;
        this.f10493g = 0L;
        this.f10494h = 0L;
        this.f10495i = 0L;
        this.f10496j = false;
        this.f10498l = 20.0f;
        this.f10499m = 50.0f;
        try {
            this.f10497k = new WebView(a(context));
            b();
        } catch (Throwable unused) {
        }
        b(a(context));
    }

    public SSWebView(Context context, AttributeSet attributeSet) {
        super(a(context), attributeSet);
        this.f10491e = 0.0f;
        this.f10492f = 0.0f;
        this.f10493g = 0L;
        this.f10494h = 0L;
        this.f10495i = 0L;
        boolean z10 = false;
        this.f10496j = false;
        this.f10498l = 20.0f;
        this.f10499m = 50.0f;
        try {
            if (com.bytedance.sdk.component.widget.a.a.a().b() != null && com.bytedance.sdk.component.widget.a.a.a().b().a()) {
                int h10 = t.h(context, "tt_delay_init");
                boolean z11 = false;
                for (int i10 = 0; i10 < attributeSet.getAttributeCount(); i10++) {
                    try {
                        if (attributeSet.getAttributeNameResource(i10) == h10) {
                            z11 = attributeSet.getAttributeBooleanValue(i10, false);
                        }
                    } catch (Throwable unused) {
                    }
                }
                z10 = z11;
            }
        } catch (Throwable unused2) {
        }
        this.f10503q = context;
        if (z10) {
            return;
        }
        this.f10502p = attributeSet;
        a();
    }

    public SSWebView(Context context, AttributeSet attributeSet, int i10) {
        super(a(context), attributeSet, i10);
        this.f10491e = 0.0f;
        this.f10492f = 0.0f;
        this.f10493g = 0L;
        this.f10494h = 0L;
        this.f10495i = 0L;
        this.f10496j = false;
        this.f10498l = 20.0f;
        this.f10499m = 50.0f;
        try {
            this.f10497k = new WebView(a(context), attributeSet, i10);
            b();
        } catch (Throwable unused) {
        }
        b(a(context));
    }

    private static Context a(Context context) {
        int i10 = Build.VERSION.SDK_INT;
        return (i10 < 21 || i10 >= 23) ? context : context.createConfigurationContext(new Configuration());
    }

    private void a(MotionEvent motionEvent) {
        if (!this.f10490d || this.f10487a == null) {
            return;
        }
        if ((this.f10488b == null && this.f10489c == null) || motionEvent == null) {
            return;
        }
        try {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f10491e = motionEvent.getRawX();
                this.f10492f = motionEvent.getRawY();
                this.f10493g = System.currentTimeMillis();
                this.f10489c = new JSONObject();
                WebView webView = this.f10497k;
                if (webView != null) {
                    webView.setTag(t.e(getContext(), "tt_id_click_begin"), Long.valueOf(this.f10493g));
                }
            } else if (action == 1 || action == 3) {
                this.f10489c.put("start_x", String.valueOf(this.f10491e));
                this.f10489c.put("start_y", String.valueOf(this.f10492f));
                this.f10489c.put("offset_x", String.valueOf(motionEvent.getRawX() - this.f10491e));
                this.f10489c.put("offset_y", String.valueOf(motionEvent.getRawY() - this.f10492f));
                this.f10489c.put(ImagesContract.URL, String.valueOf(getUrl()));
                this.f10489c.put("tag", "");
                this.f10494h = System.currentTimeMillis();
                WebView webView2 = this.f10497k;
                if (webView2 != null) {
                    webView2.setTag(t.e(getContext(), "tt_id_click_end"), Long.valueOf(this.f10494h));
                }
                this.f10489c.put("down_time", this.f10493g);
                this.f10489c.put("up_time", this.f10494h);
                if (com.bytedance.sdk.component.widget.a.a.a().b() != null) {
                    long j10 = this.f10495i;
                    long j11 = this.f10493g;
                    if (j10 != j11) {
                        this.f10495i = j11;
                        com.bytedance.sdk.component.widget.a.a.a().b().a(this.f10487a, this.f10488b, "in_web_click", this.f10489c, this.f10494h - this.f10493g);
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void b(Context context) {
        c(context);
        p();
        o();
    }

    private static boolean b(View view) {
        try {
            Class<?> loadClass = view.getClass().getClassLoader().loadClass("androidx.viewpager.widget.ViewPager");
            if (loadClass != null) {
                if (loadClass.isInstance(view)) {
                    return true;
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        try {
            Class<?> loadClass2 = view.getClass().getClassLoader().loadClass("androidx.viewpager.widget.ViewPager");
            if (loadClass2 != null) {
                return loadClass2.isInstance(view);
            }
            return false;
        } catch (Throwable th2) {
            th2.printStackTrace();
            return false;
        }
    }

    private static void c(Context context) {
        if (Build.VERSION.SDK_INT != 17 || context == null) {
            return;
        }
        try {
            AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
            if (accessibilityManager != null && accessibilityManager.isEnabled()) {
                Method declaredMethod = accessibilityManager.getClass().getDeclaredMethod("setState", Integer.TYPE);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(accessibilityManager, 0);
            }
        } catch (Throwable unused) {
        }
    }

    private static boolean c(View view) {
        try {
            Class<?> loadClass = view.getClass().getClassLoader().loadClass("androidx.core.view.ScrollingView");
            if (loadClass != null) {
                if (loadClass.isInstance(view)) {
                    return true;
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        try {
            Class<?> loadClass2 = view.getClass().getClassLoader().loadClass("androidx.core.view.ScrollingView");
            if (loadClass2 != null) {
                return loadClass2.isInstance(view);
            }
            return false;
        } catch (Throwable th2) {
            th2.printStackTrace();
            return false;
        }
    }

    private void o() {
        try {
            this.f10497k.removeJavascriptInterface("searchBoxJavaBridge_");
            this.f10497k.removeJavascriptInterface("accessibility");
            this.f10497k.removeJavascriptInterface("accessibilityTraversal");
        } catch (Throwable unused) {
        }
    }

    private void p() {
        try {
            WebSettings settings = this.f10497k.getSettings();
            if (settings != null) {
                settings.setSavePassword(false);
            }
        } catch (Throwable unused) {
        }
    }

    public static void setDataDirectorySuffix(String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            WebView.setDataDirectorySuffix(str);
        }
    }

    private void setJavaScriptEnabled(String str) {
        WebSettings settings;
        try {
            if (TextUtils.isEmpty(str) || (settings = this.f10497k.getSettings()) == null) {
                return;
            }
            settings.setJavaScriptEnabled(!Uri.parse(str).getScheme().equals("file"));
        } catch (Throwable unused) {
        }
    }

    protected ViewParent a(View view) {
        ViewParent parent = view.getParent();
        if ((parent instanceof AbsListView) || (parent instanceof ScrollView) || (parent instanceof HorizontalScrollView) || !(parent instanceof View)) {
            return parent;
        }
        View view2 = (View) parent;
        return (b(view2) || c(view2)) ? parent : a(view2);
    }

    public void a() {
        try {
            this.f10497k = this.f10502p == null ? new WebView(a(this.f10503q)) : new WebView(a(this.f10503q), this.f10502p);
            b();
            b(a(this.f10503q));
        } catch (Throwable unused) {
        }
    }

    @SuppressLint({"JavascriptInterface"})
    public void a(Object obj, String str) {
        try {
            this.f10497k.addJavascriptInterface(obj, str);
        } catch (Throwable unused) {
        }
    }

    public void a(String str) {
        try {
            setJavaScriptEnabled(str);
            this.f10497k.loadUrl(str);
        } catch (Throwable unused) {
        }
    }

    public void a(String str, ValueCallback<String> valueCallback) {
        try {
            if (Build.VERSION.SDK_INT >= 19) {
                this.f10497k.evaluateJavascript(str, valueCallback);
            }
        } catch (Throwable unused) {
        }
    }

    public void a(String str, String str2, String str3, String str4, String str5) {
        try {
            setJavaScriptEnabled(str);
            this.f10497k.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } catch (Throwable unused) {
        }
    }

    @TargetApi(19)
    public void a(String str, Map<String, String> map) {
        try {
            setJavaScriptEnabled(str);
            this.f10497k.loadUrl(str, map);
        } catch (Throwable unused) {
        }
    }

    public void a(boolean z10) {
        try {
            this.f10497k.clearCache(z10);
        } catch (Throwable unused) {
        }
    }

    public void b() {
        if (this.f10497k != null) {
            removeAllViews();
            setBackground(null);
            try {
                this.f10497k.setId(t.e(getContext(), "tt_id_root_web_view"));
            } catch (Throwable unused) {
            }
            addView(this.f10497k, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    public void b(String str) {
        try {
            this.f10497k.removeJavascriptInterface(str);
        } catch (Throwable unused) {
        }
    }

    public void c() {
        try {
            this.f10497k.stopLoading();
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        try {
            this.f10497k.computeScroll();
        } catch (Throwable unused) {
        }
    }

    public void d() {
        try {
            this.f10497k.reload();
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        c cVar = this.f10504r;
        if (cVar != null) {
            cVar.a(true);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public boolean e() {
        try {
            return this.f10497k.canGoBack();
        } catch (Throwable unused) {
            return false;
        }
    }

    public void f() {
        try {
            this.f10497k.goBack();
        } catch (Throwable unused) {
        }
    }

    public boolean g() {
        try {
            return this.f10497k.canGoForward();
        } catch (Throwable unused) {
            return false;
        }
    }

    public int getContentHeight() {
        try {
            return this.f10497k.getContentHeight();
        } catch (Throwable unused) {
            return 1;
        }
    }

    public com.bytedance.sdk.component.widget.b.a getMaterialMeta() {
        return this.f10487a;
    }

    public String getOriginalUrl() {
        String url;
        try {
            String originalUrl = this.f10497k.getOriginalUrl();
            return (originalUrl == null || !originalUrl.startsWith("data:text/html") || (url = this.f10497k.getUrl()) == null) ? originalUrl : url.startsWith("file://") ? url : originalUrl;
        } catch (Throwable unused) {
            return null;
        }
    }

    public int getProgress() {
        try {
            return this.f10497k.getProgress();
        } catch (Throwable unused) {
            return 100;
        }
    }

    @Override // android.view.View
    public String getTag() {
        return this.f10488b;
    }

    public String getUrl() {
        try {
            return this.f10497k.getUrl();
        } catch (Throwable unused) {
            return null;
        }
    }

    public String getUserAgentString() {
        try {
            return this.f10497k.getSettings().getUserAgentString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public WebView getWebView() {
        return this.f10497k;
    }

    public void h() {
        try {
            this.f10497k.goForward();
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    public void i() {
        WebView webView = this.f10497k;
        if (webView != null) {
            webView.onResume();
        }
    }

    public void j() {
        try {
            this.f10497k.clearHistory();
        } catch (Throwable unused) {
        }
    }

    public void k() {
        try {
            this.f10497k.onPause();
            c cVar = this.f10504r;
            if (cVar != null) {
                cVar.a(false);
            }
        } catch (Throwable unused) {
        }
    }

    public void l() {
        try {
            this.f10497k.destroy();
        } catch (Throwable unused) {
        }
    }

    public void m() {
        try {
            this.f10497k.clearView();
        } catch (Throwable unused) {
        }
    }

    public void n() {
        try {
            this.f10497k.pauseTimers();
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        v vVar = this.f10501o;
        if (vVar != null) {
            vVar.b();
        }
    }

    @Override // android.view.ViewGroup
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ViewParent a10;
        try {
            a(motionEvent);
            boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
            if ((motionEvent.getActionMasked() == 2 || motionEvent.getActionMasked() == 0) && this.f10496j && (a10 = a(this)) != null) {
                a10.requestDisallowInterceptTouchEvent(true);
            }
            return onInterceptTouchEvent;
        } catch (Throwable unused) {
            return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        v vVar = this.f10501o;
        if (vVar != null) {
            if (z10) {
                vVar.a();
            } else {
                vVar.b();
            }
        }
    }

    @Override // android.view.ViewGroup
    public void removeAllViews() {
        try {
            this.f10497k.removeAllViews();
        } catch (Throwable unused) {
        }
    }

    public void setAllowFileAccess(boolean z10) {
        try {
            this.f10497k.getSettings().setAllowFileAccess(z10);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        try {
            super.setAlpha(f10);
            this.f10497k.setAlpha(f10);
        } catch (Throwable unused) {
        }
    }

    public void setAppCacheEnabled(boolean z10) {
        try {
            this.f10497k.getSettings().setAppCacheEnabled(z10);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        try {
            this.f10497k.setBackgroundColor(i10);
        } catch (Throwable unused) {
        }
    }

    public void setBuiltInZoomControls(boolean z10) {
        try {
            this.f10497k.getSettings().setBuiltInZoomControls(z10);
        } catch (Throwable unused) {
        }
    }

    public void setCacheMode(int i10) {
        try {
            this.f10497k.getSettings().setCacheMode(i10);
        } catch (Throwable unused) {
        }
    }

    public void setDatabaseEnabled(boolean z10) {
        try {
            this.f10497k.getSettings().setDatabaseEnabled(z10);
        } catch (Throwable unused) {
        }
    }

    public void setDefaultFontSize(int i10) {
        try {
            this.f10497k.getSettings().setDefaultFontSize(i10);
        } catch (Throwable unused) {
        }
    }

    public void setDefaultTextEncodingName(String str) {
        try {
            this.f10497k.getSettings().setDefaultTextEncodingName(str);
        } catch (Throwable unused) {
        }
    }

    public void setDisplayZoomControls(boolean z10) {
        try {
            this.f10497k.getSettings().setDisplayZoomControls(z10);
        } catch (Throwable unused) {
        }
    }

    public void setDomStorageEnabled(boolean z10) {
        try {
            this.f10497k.getSettings().setDomStorageEnabled(z10);
        } catch (Throwable unused) {
        }
    }

    public void setDownloadListener(DownloadListener downloadListener) {
        try {
            this.f10497k.setDownloadListener(downloadListener);
        } catch (Throwable unused) {
        }
    }

    public void setIsPreventTouchEvent(boolean z10) {
        this.f10496j = z10;
    }

    public void setJavaScriptCanOpenWindowsAutomatically(boolean z10) {
        try {
            this.f10497k.getSettings().setJavaScriptCanOpenWindowsAutomatically(z10);
        } catch (Throwable unused) {
        }
    }

    public void setJavaScriptEnabled(boolean z10) {
        try {
            this.f10497k.getSettings().setJavaScriptEnabled(z10);
        } catch (Throwable unused) {
        }
    }

    public void setLandingPage(boolean z10) {
        this.f10490d = z10;
    }

    @Override // android.view.View
    public void setLayerType(int i10, Paint paint) {
        try {
            this.f10497k.setLayerType(i10, paint);
        } catch (Throwable unused) {
        }
    }

    public void setLayoutAlgorithm(WebSettings.LayoutAlgorithm layoutAlgorithm) {
        try {
            this.f10497k.getSettings().setLayoutAlgorithm(layoutAlgorithm);
        } catch (Throwable unused) {
        }
    }

    public void setLoadWithOverviewMode(boolean z10) {
        try {
            this.f10497k.getSettings().setLoadWithOverviewMode(z10);
        } catch (Throwable unused) {
        }
    }

    public void setMaterialMeta(com.bytedance.sdk.component.widget.b.a aVar) {
        this.f10487a = aVar;
    }

    public void setMixedContentMode(int i10) {
        try {
            if (Build.VERSION.SDK_INT >= 21) {
                this.f10497k.getSettings().setMixedContentMode(i10);
            }
        } catch (Throwable unused) {
        }
    }

    public void setNetworkAvailable(boolean z10) {
        try {
            this.f10497k.setNetworkAvailable(z10);
        } catch (Throwable unused) {
        }
    }

    public void setOnShakeListener(b bVar) {
        this.f10500n = bVar;
    }

    @Override // android.view.View
    public void setOverScrollMode(int i10) {
        try {
            this.f10497k.setOverScrollMode(i10);
            super.setOverScrollMode(i10);
        } catch (Throwable unused) {
        }
    }

    public void setShakeValue(float f10) {
        this.f10498l = f10;
    }

    public void setSupportZoom(boolean z10) {
        try {
            this.f10497k.getSettings().setSupportZoom(z10);
        } catch (Throwable unused) {
        }
    }

    public void setTag(String str) {
        this.f10488b = str;
    }

    public void setTouchStateListener(c cVar) {
        this.f10504r = cVar;
    }

    public void setUseWideViewPort(boolean z10) {
        try {
            this.f10497k.getSettings().setUseWideViewPort(z10);
        } catch (Throwable unused) {
        }
    }

    public void setUserAgentString(String str) {
        try {
            this.f10497k.getSettings().setUserAgentString(str);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        try {
            super.setVisibility(i10);
            this.f10497k.setVisibility(i10);
        } catch (Throwable unused) {
        }
    }

    public void setWebChromeClient(WebChromeClient webChromeClient) {
        try {
            this.f10497k.setWebChromeClient(webChromeClient);
        } catch (Throwable unused) {
        }
    }

    public void setWebViewClient(WebViewClient webViewClient) {
        try {
            if (webViewClient instanceof c) {
                setTouchStateListener((c) webViewClient);
            } else {
                setTouchStateListener(null);
            }
            if (webViewClient == null) {
                webViewClient = new a();
            }
            this.f10497k.setWebViewClient(webViewClient);
        } catch (Throwable unused) {
        }
    }

    public void setWriggleValue(float f10) {
        this.f10499m = f10;
    }
}
