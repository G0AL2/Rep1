package com.ironsource.sdk.controller;

import android.webkit.JavascriptInterface;

/* loaded from: classes3.dex */
final class s {

    /* renamed from: a  reason: collision with root package name */
    private t f27871a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f27872b = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s(t tVar) {
        this.f27871a = tVar;
    }

    @JavascriptInterface
    public final String getTokenForMessaging() {
        if (this.f27872b) {
            return "";
        }
        this.f27872b = true;
        return this.f27871a.f27873a;
    }
}
