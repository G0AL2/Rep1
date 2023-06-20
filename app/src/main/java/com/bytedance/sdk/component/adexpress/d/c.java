package com.bytedance.sdk.component.adexpress.d;

import android.webkit.JavascriptInterface;
import java.lang.ref.WeakReference;

/* compiled from: TTAndroidObjectProxy.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<b> f9481a;

    public c(b bVar) {
        this.f9481a = new WeakReference<>(bVar);
    }

    public void a(b bVar) {
        this.f9481a = new WeakReference<>(bVar);
    }

    @JavascriptInterface
    public void adAnalysisData(String str) {
        WeakReference<b> weakReference = this.f9481a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f9481a.get().a(str);
    }

    @JavascriptInterface
    public String adInfo() {
        WeakReference<b> weakReference = this.f9481a;
        return (weakReference == null || weakReference.get() == null) ? "" : this.f9481a.get().adInfo();
    }

    @JavascriptInterface
    public String appInfo() {
        WeakReference<b> weakReference = this.f9481a;
        return (weakReference == null || weakReference.get() == null) ? "" : this.f9481a.get().appInfo();
    }

    @JavascriptInterface
    public void changeVideoState(String str) {
        WeakReference<b> weakReference = this.f9481a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f9481a.get().changeVideoState(str);
    }

    @JavascriptInterface
    public void clickEvent(String str) {
        WeakReference<b> weakReference = this.f9481a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f9481a.get().clickEvent(str);
    }

    @JavascriptInterface
    public void dynamicTrack(String str) {
        WeakReference<b> weakReference = this.f9481a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f9481a.get().dynamicTrack(str);
    }

    @JavascriptInterface
    public String getCurrentVideoState() {
        WeakReference<b> weakReference = this.f9481a;
        return (weakReference == null || weakReference.get() == null) ? "" : this.f9481a.get().getCurrentVideoState();
    }

    @JavascriptInterface
    public String getTemplateInfo() {
        WeakReference<b> weakReference = this.f9481a;
        return (weakReference == null || weakReference.get() == null) ? "" : this.f9481a.get().getTemplateInfo();
    }

    @JavascriptInterface
    public void initRenderFinish() {
        WeakReference<b> weakReference = this.f9481a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f9481a.get().initRenderFinish();
    }

    @JavascriptInterface
    public void muteVideo(String str) {
        WeakReference<b> weakReference = this.f9481a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f9481a.get().muteVideo(str);
    }

    @JavascriptInterface
    public void renderDidFinish(String str) {
        WeakReference<b> weakReference = this.f9481a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f9481a.get().renderDidFinish(str);
    }

    @JavascriptInterface
    public void requestPauseVideo(String str) {
        WeakReference<b> weakReference = this.f9481a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f9481a.get().b(str);
    }

    @JavascriptInterface
    public void skipVideo() {
        WeakReference<b> weakReference = this.f9481a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f9481a.get().skipVideo();
    }
}
