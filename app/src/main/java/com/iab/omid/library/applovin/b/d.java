package com.iab.omid.library.applovin.b;

import android.annotation.SuppressLint;
import android.content.Context;

/* loaded from: classes3.dex */
public class d {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: a  reason: collision with root package name */
    private static d f23932a = new d();

    /* renamed from: b  reason: collision with root package name */
    private Context f23933b;

    private d() {
    }

    public static d a() {
        return f23932a;
    }

    public void a(Context context) {
        this.f23933b = context != null ? context.getApplicationContext() : null;
    }

    public Context b() {
        return this.f23933b;
    }
}
