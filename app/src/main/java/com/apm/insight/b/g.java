package com.apm.insight.b;

import android.content.Context;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private static volatile g f6175a;

    /* renamed from: c  reason: collision with root package name */
    private static h f6176c;

    /* renamed from: b  reason: collision with root package name */
    private final b f6177b;

    private g(Context context) {
        this.f6177b = new b(context);
        h hVar = new h(0);
        f6176c = hVar;
        hVar.b();
    }

    public static g a(Context context) {
        if (f6175a == null) {
            synchronized (g.class) {
                if (f6175a == null) {
                    f6175a = new g(context);
                }
            }
        }
        return f6175a;
    }

    public static h b() {
        return f6176c;
    }

    public b a() {
        return this.f6177b;
    }

    public void c() {
        this.f6177b.a();
    }

    public void d() {
        this.f6177b.b();
    }
}
