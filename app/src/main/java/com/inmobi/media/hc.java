package com.inmobi.media;

import android.content.Context;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* compiled from: WebViewNetworkTask.java */
/* loaded from: classes3.dex */
public class hc {

    /* renamed from: d  reason: collision with root package name */
    private static final String f25641d = "hc";

    /* renamed from: a  reason: collision with root package name */
    public gx f25642a;

    /* renamed from: b  reason: collision with root package name */
    public WebViewClient f25643b;

    /* renamed from: c  reason: collision with root package name */
    public a f25644c;

    /* compiled from: WebViewNetworkTask.java */
    /* loaded from: classes3.dex */
    public class a extends WebView {

        /* renamed from: a  reason: collision with root package name */
        public boolean f25645a;

        public a(Context context) {
            super(context);
        }

        @Override // android.webkit.WebView
        public final void destroy() {
            this.f25645a = true;
            super.destroy();
        }
    }

    public hc(gx gxVar, WebViewClient webViewClient) {
        this.f25643b = webViewClient;
        this.f25642a = gxVar;
    }
}
