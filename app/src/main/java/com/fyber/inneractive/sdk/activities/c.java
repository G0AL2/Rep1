package com.fyber.inneractive.sdk.activities;

import android.view.View;

/* loaded from: classes.dex */
public class c implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ InneractiveInternalBrowserActivity f16695a;

    public c(InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity) {
        this.f16695a = inneractiveInternalBrowserActivity;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.f16695a.f16684d.canGoBack()) {
            this.f16695a.f16684d.goBack();
        }
    }
}
