package com.ironsource.sdk.utils;

import android.content.Context;
import com.ironsource.environment.h;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: g  reason: collision with root package name */
    private static a f28249g;

    /* renamed from: a  reason: collision with root package name */
    public String f28250a = h.h();

    /* renamed from: b  reason: collision with root package name */
    public String f28251b = h.g();

    /* renamed from: c  reason: collision with root package name */
    public String f28252c = h.i();

    /* renamed from: d  reason: collision with root package name */
    public String f28253d = h.e();

    /* renamed from: e  reason: collision with root package name */
    public int f28254e = h.f();

    /* renamed from: f  reason: collision with root package name */
    public String f28255f;

    private a(Context context) {
        this.f28255f = h.i(context);
    }

    public static a a(Context context) {
        if (f28249g == null) {
            f28249g = new a(context);
        }
        return f28249g;
    }

    public static void a() {
        f28249g = null;
    }

    public static float b(Context context) {
        return h.l(context);
    }
}
