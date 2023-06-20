package com.fyber.inneractive.sdk.activities;

import android.view.View;
import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes.dex */
public class e implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ InneractiveInternalBrowserActivity f16697a;

    public e(InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity) {
        this.f16697a = inneractiveInternalBrowserActivity;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f16697a.f16684d.reload();
        int i10 = IAlog.f20222a;
        IAlog.a(1, null, "%s %s", "AD_INTERNAL_BROWSER_REFRESH", this.f16697a.f16684d.getUrl());
    }
}
