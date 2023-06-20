package com.bytedance.sdk.openadsdk.core.widget.a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.l;
import java.lang.ref.WeakReference;

/* compiled from: SSWebSettings.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<Context> f13100a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f13101b = true;

    /* renamed from: c  reason: collision with root package name */
    private boolean f13102c = true;

    /* renamed from: d  reason: collision with root package name */
    private boolean f13103d = true;

    /* renamed from: e  reason: collision with root package name */
    private boolean f13104e = true;

    /* renamed from: f  reason: collision with root package name */
    private boolean f13105f = false;

    /* renamed from: g  reason: collision with root package name */
    private boolean f13106g = true;

    /* renamed from: h  reason: collision with root package name */
    private boolean f13107h = true;

    private b(Context context) {
        this.f13100a = new WeakReference<>(context);
    }

    public static b a(Context context) {
        return new b(context);
    }

    public b b(boolean z10) {
        this.f13102c = z10;
        return this;
    }

    private void b(WebView webView) {
        try {
            webView.removeJavascriptInterface("searchBoxJavaBridge_");
            webView.removeJavascriptInterface("accessibility");
            webView.removeJavascriptInterface("accessibilityTraversal");
        } catch (Throwable th) {
            l.b(th.toString());
        }
    }

    public b a(boolean z10) {
        this.f13107h = z10;
        return this;
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public void a(WebView webView) {
        if (webView == null || this.f13100a.get() == null) {
            return;
        }
        b(webView);
        WebSettings settings = webView.getSettings();
        a(settings);
        if (settings == null) {
            return;
        }
        try {
            settings.setJavaScriptEnabled(true);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        try {
            if (this.f13102c) {
                settings.setSupportZoom(true);
                settings.setBuiltInZoomControls(true);
            } else {
                settings.setSupportZoom(false);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(this.f13103d);
        settings.setDomStorageEnabled(this.f13104e);
        settings.setAllowFileAccess(this.f13105f);
        settings.setBlockNetworkImage(true ^ this.f13106g);
        settings.setSavePassword(false);
        try {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 11 && !this.f13107h) {
                webView.setLayerType(0, null);
            } else if (i10 >= 16 && this.f13107h) {
                webView.setLayerType(2, null);
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    private void a(WebSettings webSettings) {
        try {
            if (Build.VERSION.SDK_INT >= 17) {
                webSettings.setMediaPlaybackRequiresUserGesture(false);
            }
        } catch (Throwable th) {
            l.b(th.toString());
        }
    }
}
