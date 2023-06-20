package com.ironsource.sdk.c;

import android.webkit.JavascriptInterface;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private c f27640a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(c cVar) {
        this.f27640a = cVar;
    }

    @JavascriptInterface
    public final void receiveMessageFromExternal(String str) {
        this.f27640a.handleMessageFromAd(str);
    }
}
