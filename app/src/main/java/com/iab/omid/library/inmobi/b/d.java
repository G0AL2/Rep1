package com.iab.omid.library.inmobi.b;

import android.annotation.SuppressLint;
import android.content.Context;

/* loaded from: classes3.dex */
public class d {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: a  reason: collision with root package name */
    private static d f24166a = new d();

    /* renamed from: b  reason: collision with root package name */
    private Context f24167b;

    private d() {
    }

    public static d a() {
        return f24166a;
    }

    public void a(Context context) {
        this.f24167b = context != null ? context.getApplicationContext() : null;
    }

    public Context b() {
        return this.f24167b;
    }
}
