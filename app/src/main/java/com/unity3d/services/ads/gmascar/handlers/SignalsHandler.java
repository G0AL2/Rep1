package com.unity3d.services.ads.gmascar.handlers;

import com.unity3d.scar.adapter.common.c;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;
import pd.a;

/* loaded from: classes3.dex */
public class SignalsHandler implements a {
    @Override // pd.a
    public void onSignalsCollected(String str) {
        WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.GMA, c.SIGNALS, str);
    }

    @Override // pd.a
    public void onSignalsCollectionFailed(String str) {
        WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.GMA, c.SIGNALS_ERROR, str);
    }
}
