package com.bytedance.sdk.component.e.d;

/* compiled from: Logger.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private a f10388a;

    /* renamed from: b  reason: collision with root package name */
    private InterfaceC0159b f10389b;

    /* compiled from: Logger.java */
    /* loaded from: classes.dex */
    public enum a {
        DEBUG,
        INFO,
        ERROR,
        OFF
    }

    /* compiled from: Logger.java */
    /* renamed from: com.bytedance.sdk.component.e.d.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0159b {
        void a(String str, String str2);

        void b(String str, String str2);
    }

    /* compiled from: Logger.java */
    /* loaded from: classes.dex */
    private static class c {

        /* renamed from: a  reason: collision with root package name */
        private static final b f10395a = new b();
    }

    public static void a(a aVar) {
        synchronized (b.class) {
            c.f10395a.f10388a = aVar;
        }
    }

    public static void b(String str, String str2) {
        if (c.f10395a.f10388a.compareTo(a.DEBUG) <= 0) {
            c.f10395a.f10389b.b(str, str2);
        }
    }

    private b() {
        this.f10388a = a.OFF;
        this.f10389b = new com.bytedance.sdk.component.e.d.a();
    }

    public static void a(String str, String str2) {
        if (c.f10395a.f10388a.compareTo(a.ERROR) <= 0) {
            c.f10395a.f10389b.a(str, str2);
        }
    }
}
