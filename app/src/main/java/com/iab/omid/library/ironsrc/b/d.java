package com.iab.omid.library.ironsrc.b;

import android.annotation.SuppressLint;
import android.content.Context;

/* loaded from: classes3.dex */
public class d {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: a  reason: collision with root package name */
    private static d f24280a = new d();

    /* renamed from: b  reason: collision with root package name */
    private Context f24281b;

    private d() {
    }

    public static d a() {
        return f24280a;
    }

    public void a(Context context) {
        this.f24281b = context != null ? context.getApplicationContext() : null;
    }

    public Context b() {
        return this.f24281b;
    }
}
