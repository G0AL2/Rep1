package com.bytedance.sdk.openadsdk.j;

/* compiled from: PlayableLog.java */
/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private static a f13390a;

    /* compiled from: PlayableLog.java */
    /* loaded from: classes.dex */
    public interface a {
        void a(String str, String str2);

        void a(String str, String str2, Throwable th);
    }

    public static void a(a aVar) {
        f13390a = aVar;
    }

    public static boolean a() {
        return f13390a != null;
    }

    public static void a(String str, String str2) {
        a aVar = f13390a;
        if (aVar == null) {
            return;
        }
        aVar.a(str, str2);
    }

    public static void a(String str, String str2, Throwable th) {
        if (f13390a == null) {
            return;
        }
        if (th == null) {
            th = new Throwable();
        }
        f13390a.a(str, str2, th);
    }
}
