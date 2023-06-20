package com.fyber.inneractive.sdk.activities;

import android.view.View;

/* loaded from: classes.dex */
public class d implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ InneractiveInternalBrowserActivity f16696a;

    public d(InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity) {
        this.f16696a = inneractiveInternalBrowserActivity;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.f16696a.f16684d.canGoForward()) {
            this.f16696a.f16684d.goForward();
        }
    }
}
