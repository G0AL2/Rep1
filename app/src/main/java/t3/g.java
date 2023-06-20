package t3;

import t3.a;

/* compiled from: NoOpCacheErrorLogger.java */
/* loaded from: classes.dex */
public class g implements a {

    /* renamed from: a  reason: collision with root package name */
    private static g f37115a;

    private g() {
    }

    public static synchronized g b() {
        g gVar;
        synchronized (g.class) {
            if (f37115a == null) {
                f37115a = new g();
            }
            gVar = f37115a;
        }
        return gVar;
    }

    @Override // t3.a
    public void a(a.EnumC0503a enumC0503a, Class<?> cls, String str, Throwable th) {
    }
}
