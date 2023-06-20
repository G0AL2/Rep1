package com.fyber.inneractive.sdk.protobuf;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final Class<?> f19849a;

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f19850b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f19849a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f19850b = cls2 != null;
    }

    public static boolean a() {
        return (f19849a == null || f19850b) ? false : true;
    }
}
