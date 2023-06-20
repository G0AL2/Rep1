package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import java.lang.reflect.Proxy;

/* renamed from: com.facebook.ads.redexgen.X.51  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass51 {
    @SuppressLint({"CatchGeneralException"})
    public static <T> T A00(T t10, Class<T> cls) {
        ClassLoader classLoader = t10.getClass().getClassLoader();
        return cls.cast(Proxy.newProxyInstance(classLoader, new Class[]{cls}, new AnonymousClass50(t10, classLoader)));
    }
}
