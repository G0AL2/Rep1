package i7;

/* compiled from: NativeLoader.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static b f31546a;

    private a() {
    }

    public static synchronized void a(b bVar) {
        synchronized (a.class) {
            if (f31546a == null) {
                f31546a = bVar;
            } else {
                throw new IllegalStateException("Cannot re-initialize NativeLoader.");
            }
        }
    }

    public static synchronized void b(b bVar) {
        synchronized (a.class) {
            if (!c()) {
                a(bVar);
            }
        }
    }

    public static synchronized boolean c() {
        boolean z10;
        synchronized (a.class) {
            z10 = f31546a != null;
        }
        return z10;
    }

    public static boolean d(String str) {
        return e(str, 0);
    }

    public static boolean e(String str, int i10) {
        b bVar;
        synchronized (a.class) {
            bVar = f31546a;
            if (bVar == null) {
                throw new IllegalStateException("NativeLoader has not been initialized.  To use standard native library loading, call NativeLoader.init(new SystemDelegate()).");
            }
        }
        return bVar.a(str, i10);
    }
}
