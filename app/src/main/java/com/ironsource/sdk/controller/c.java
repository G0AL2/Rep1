package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.MutableContextWrapper;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private MutableContextWrapper f27712a;

    public final Activity a() {
        return (Activity) this.f27712a.getBaseContext();
    }

    public final synchronized void a(Activity activity) {
        if (this.f27712a == null) {
            this.f27712a = new MutableContextWrapper(activity);
        }
        this.f27712a.setBaseContext(activity);
    }

    public final synchronized void b() {
        this.f27712a = null;
    }
}
