package com.unity3d.services.ads.gmascar.handlers;

import com.unity3d.scar.adapter.common.d;
import com.unity3d.scar.adapter.common.l;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;

/* loaded from: classes3.dex */
public class WebViewErrorHandler implements d<l> {
    @Override // com.unity3d.scar.adapter.common.d
    public void handleError(l lVar) {
        WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.valueOf(lVar.getDomain()), lVar.getErrorCategory(), lVar.getErrorArguments());
    }
}
