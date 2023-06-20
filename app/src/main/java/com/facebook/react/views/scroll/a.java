package com.facebook.react.views.scroll;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.r;
import h6.e;
import java.util.Map;

/* compiled from: ReactScrollViewCommandHelper.java */
/* loaded from: classes.dex */
public class a {

    /* compiled from: ReactScrollViewCommandHelper.java */
    /* renamed from: com.facebook.react.views.scroll.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0218a<T> {
        void flashScrollIndicators(T t10);

        void scrollTo(T t10, b bVar);

        void scrollToEnd(T t10, c cVar);
    }

    /* compiled from: ReactScrollViewCommandHelper.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f16157a;

        /* renamed from: b  reason: collision with root package name */
        public final int f16158b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f16159c;

        b(int i10, int i11, boolean z10) {
            this.f16157a = i10;
            this.f16158b = i11;
            this.f16159c = z10;
        }
    }

    /* compiled from: ReactScrollViewCommandHelper.java */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f16160a;

        c(boolean z10) {
            this.f16160a = z10;
        }
    }

    public static Map<String, Integer> a() {
        return e.f("scrollTo", 1, "scrollToEnd", 2, "flashScrollIndicators", 3);
    }

    public static <T> void b(InterfaceC0218a<T> interfaceC0218a, T t10, int i10, ReadableArray readableArray) {
        f6.a.c(interfaceC0218a);
        f6.a.c(t10);
        f6.a.c(readableArray);
        if (i10 == 1) {
            d(interfaceC0218a, t10, readableArray);
        } else if (i10 == 2) {
            e(interfaceC0218a, t10, readableArray);
        } else if (i10 == 3) {
            interfaceC0218a.flashScrollIndicators(t10);
        } else {
            throw new IllegalArgumentException(String.format("Unsupported command %d received by %s.", Integer.valueOf(i10), interfaceC0218a.getClass().getSimpleName()));
        }
    }

    public static <T> void c(InterfaceC0218a<T> interfaceC0218a, T t10, String str, ReadableArray readableArray) {
        f6.a.c(interfaceC0218a);
        f6.a.c(t10);
        f6.a.c(readableArray);
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -402165208:
                if (str.equals("scrollTo")) {
                    c10 = 0;
                    break;
                }
                break;
            case 28425985:
                if (str.equals("flashScrollIndicators")) {
                    c10 = 1;
                    break;
                }
                break;
            case 2055114131:
                if (str.equals("scrollToEnd")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                d(interfaceC0218a, t10, readableArray);
                return;
            case 1:
                interfaceC0218a.flashScrollIndicators(t10);
                return;
            case 2:
                e(interfaceC0218a, t10, readableArray);
                return;
            default:
                throw new IllegalArgumentException(String.format("Unsupported command %s received by %s.", str, interfaceC0218a.getClass().getSimpleName()));
        }
    }

    private static <T> void d(InterfaceC0218a<T> interfaceC0218a, T t10, ReadableArray readableArray) {
        interfaceC0218a.scrollTo(t10, new b(Math.round(r.b(readableArray.getDouble(0))), Math.round(r.b(readableArray.getDouble(1))), readableArray.getBoolean(2)));
    }

    private static <T> void e(InterfaceC0218a<T> interfaceC0218a, T t10, ReadableArray readableArray) {
        interfaceC0218a.scrollToEnd(t10, new c(readableArray.getBoolean(0)));
    }
}
