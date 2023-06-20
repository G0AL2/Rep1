package com.inmobi.media;

import android.webkit.WebView;
import java.lang.ref.WeakReference;

/* compiled from: NetworkBlocker.java */
/* loaded from: classes3.dex */
public final class p implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<WebView> f25943a;

    public p(WebView webView) {
        this.f25943a = new WeakReference<>(webView);
    }

    @Override // java.lang.Runnable
    public final void run() {
        WebView webView = this.f25943a.get();
        if (webView != null) {
            webView.getSettings().setBlockNetworkLoads(true);
        }
    }
}
