package com.brentvatne.exoplayer;

import com.facebook.react.bridge.ReactContext;
import da.a0;
import da.l;
import da.s;
import da.t;
import ea.n0;
import java.util.Map;
import o8.a;
import ye.w;
import ye.z;

/* compiled from: DataSourceUtil.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static l.a f9101a;

    /* renamed from: b  reason: collision with root package name */
    private static a0.b f9102b;

    /* renamed from: c  reason: collision with root package name */
    private static String f9103c;

    private static l.a a(ReactContext reactContext, s sVar, Map<String, String> map) {
        return new t.a(reactContext, b(reactContext, sVar, map));
    }

    private static a0.b b(ReactContext reactContext, s sVar, Map<String, String> map) {
        z f10 = com.facebook.react.modules.network.g.f();
        ((com.facebook.react.modules.network.a) f10.o()).d(new w(new com.facebook.react.modules.network.c(reactContext)));
        a.b d10 = new a.b(f10).e(e(reactContext)).d(sVar);
        if (map != null) {
            d10.c(map);
        }
        return d10;
    }

    public static l.a c(ReactContext reactContext, s sVar, Map<String, String> map) {
        if (f9101a == null || (map != null && !map.isEmpty())) {
            f9101a = a(reactContext, sVar, map);
        }
        return f9101a;
    }

    public static a0.b d(ReactContext reactContext, s sVar, Map<String, String> map) {
        if (f9102b == null || (map != null && !map.isEmpty())) {
            f9102b = b(reactContext, sVar, map);
        }
        return f9102b;
    }

    public static String e(ReactContext reactContext) {
        if (f9103c == null) {
            f9103c = n0.o0(reactContext, "ReactNativeVideo");
        }
        return f9103c;
    }
}
