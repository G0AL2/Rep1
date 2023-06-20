package com.unity3d.services.ads.gmascar.utils;

import com.unity3d.scar.adapter.common.c;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;

/* loaded from: classes3.dex */
public class GMAEventSender {
    public void send(c cVar, Object... objArr) {
        WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.GMA, cVar, objArr);
    }
}
