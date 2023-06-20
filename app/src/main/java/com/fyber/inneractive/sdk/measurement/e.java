package com.fyber.inneractive.sdk.measurement;

import android.webkit.WebView;
import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes.dex */
public class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f17332a;

    public e(f fVar) {
        this.f17332a = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        IAlog.a("clearing webview", new Object[0]);
        WebView webView = this.f17332a.f17337e;
        if (webView != null) {
            webView.destroy();
            this.f17332a.f17337e = null;
        }
    }
}
