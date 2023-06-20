package com.inmobi.media;

import android.content.Context;
import android.os.Build;
import android.webkit.WebView;

/* compiled from: EmbeddedBrowserWebView.java */
/* loaded from: classes3.dex */
public final class y extends WebView {

    /* renamed from: a  reason: collision with root package name */
    private ab f26016a;

    public y(Context context) {
        super(context);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 16) {
            setImportantForAccessibility(2);
        }
        getSettings().setJavaScriptEnabled(true);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        if (i10 >= 17) {
            getSettings().setMediaPlaybackRequiresUserGesture(false);
        }
        ab abVar = new ab();
        this.f26016a = abVar;
        abVar.f24445b = ((fq) fs.a("ads", ho.f(), null)).rendering.otherNetworkLoadsLimit;
        setWebViewClient(abVar);
    }

    @Override // android.webkit.WebView
    public final void loadData(String str, String str2, String str3) {
        super.loadData(str, str2, str3);
        this.f26016a.f24446c = true;
    }

    @Override // android.webkit.WebView
    public final void loadUrl(String str) {
        super.loadUrl(str);
        this.f26016a.f24446c = true;
    }
}
