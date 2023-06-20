package com.iab.omid.library.fyber.b;

import android.annotation.SuppressLint;
import android.content.Context;

/* loaded from: classes3.dex */
public class d {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: a  reason: collision with root package name */
    private static d f24050a = new d();

    /* renamed from: b  reason: collision with root package name */
    private Context f24051b;

    private d() {
    }

    public static d a() {
        return f24050a;
    }

    public void a(Context context) {
        this.f24051b = context != null ? context.getApplicationContext() : null;
    }

    public Context b() {
        return this.f24051b;
    }
}
