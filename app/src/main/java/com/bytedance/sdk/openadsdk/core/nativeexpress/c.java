package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.ViewGroup;
import com.bytedance.sdk.component.widget.SSWebView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: BrandBannerWebViewPool.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: b  reason: collision with root package name */
    private static int f12620b;

    /* renamed from: c  reason: collision with root package name */
    private static volatile c f12621c;

    /* renamed from: a  reason: collision with root package name */
    private final List<SSWebView> f12622a = new ArrayList();

    public static c a() {
        if (f12621c == null) {
            synchronized (c.class) {
                if (f12621c == null) {
                    f12621c = new c();
                }
            }
        }
        return f12621c;
    }

    public SSWebView b() {
        SSWebView remove;
        if (c() > 0 && (remove = this.f12622a.remove(0)) != null) {
            return remove;
        }
        return null;
    }

    public int c() {
        return this.f12622a.size();
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public void c(SSWebView sSWebView) {
        if (sSWebView == null || sSWebView.getWebView() == null) {
            return;
        }
        if (sSWebView.getParent() != null) {
            ((ViewGroup) sSWebView.getParent()).removeView(sSWebView);
        }
        try {
            sSWebView.removeAllViews();
            sSWebView.c();
            sSWebView.setWebChromeClient(null);
            sSWebView.setWebViewClient(null);
            sSWebView.setDownloadListener(null);
            sSWebView.setDefaultTextEncodingName("UTF-8");
            sSWebView.setJavaScriptEnabled(true);
            sSWebView.setDomStorageEnabled(true);
            sSWebView.setAppCacheEnabled(true);
            sSWebView.setDomStorageEnabled(true);
            sSWebView.setDatabaseEnabled(true);
            sSWebView.setSupportZoom(false);
            sSWebView.getWebView().setLayerType(0, null);
            sSWebView.setBackgroundColor(0);
            sSWebView.getWebView().setHorizontalScrollBarEnabled(false);
            sSWebView.getWebView().setHorizontalScrollbarOverlay(false);
            sSWebView.getWebView().setVerticalScrollBarEnabled(false);
            sSWebView.getWebView().setVerticalScrollbarOverlay(false);
            sSWebView.a(true);
            sSWebView.j();
            if (Build.VERSION.SDK_INT >= 21) {
                sSWebView.setMixedContentMode(0);
            }
        } catch (Exception unused) {
        }
    }

    public void b(SSWebView sSWebView) {
        if (sSWebView != null) {
            if (this.f12622a.size() >= f12620b) {
                sSWebView.l();
            } else if (this.f12622a.contains(sSWebView)) {
            } else {
                c(sSWebView);
                this.f12622a.add(sSWebView);
            }
        }
    }

    public void a(SSWebView sSWebView) {
        if (sSWebView != null) {
            b(sSWebView);
        }
    }
}
