package com.facebook.react.modules.network;

import android.content.Context;
import java.io.File;
import java.util.concurrent.TimeUnit;
import ye.z;

/* compiled from: OkHttpClientProvider.java */
/* loaded from: classes.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private static z f15592a;

    /* renamed from: b  reason: collision with root package name */
    private static f f15593b;

    public static z a() {
        f fVar = f15593b;
        if (fVar != null) {
            return fVar.a();
        }
        return c().c();
    }

    public static z b(Context context) {
        f fVar = f15593b;
        if (fVar != null) {
            return fVar.a();
        }
        return d(context).c();
    }

    public static z.a c() {
        z.a aVar = new z.a();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return aVar.f(0L, timeUnit).T(0L, timeUnit).X(0L, timeUnit).i(new l());
    }

    public static z.a d(Context context) {
        return e(context, 10485760);
    }

    public static z.a e(Context context, int i10) {
        z.a c10 = c();
        return i10 == 0 ? c10 : c10.d(new ye.c(new File(context.getCacheDir(), "http-cache"), i10));
    }

    public static z f() {
        if (f15592a == null) {
            f15592a = a();
        }
        return f15592a;
    }
}
