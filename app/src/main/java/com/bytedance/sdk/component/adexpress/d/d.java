package com.bytedance.sdk.component.adexpress.d;

import android.webkit.JavascriptInterface;
import com.bytedance.sdk.component.a.z;
import java.lang.ref.WeakReference;

/* compiled from: WebViewBridgeProxy.java */
/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<z> f9482a;

    public d(z zVar) {
        this.f9482a = new WeakReference<>(zVar);
    }

    public void a(z zVar) {
        this.f9482a = new WeakReference<>(zVar);
    }

    @JavascriptInterface
    public void invokeMethod(String str) {
        WeakReference<z> weakReference = this.f9482a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f9482a.get().invokeMethod(str);
    }
}
