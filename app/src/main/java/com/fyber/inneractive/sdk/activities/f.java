package com.fyber.inneractive.sdk.activities;

import android.view.View;

/* loaded from: classes.dex */
public class f implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ InneractiveInternalBrowserActivity f16698a;

    public f(InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity) {
        this.f16698a = inneractiveInternalBrowserActivity;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f16698a.finish();
    }
}
