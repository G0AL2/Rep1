package c6;

/* compiled from: FrescoSystrace.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static volatile c f5330a;

    /* compiled from: FrescoSystrace.java */
    /* renamed from: c6.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static final class C0099b {
        private C0099b() {
        }
    }

    /* compiled from: FrescoSystrace.java */
    /* loaded from: classes.dex */
    public interface c {
        void a(String str);

        void b();

        boolean isTracing();
    }

    static {
        new C0099b();
        f5330a = null;
    }

    private b() {
    }

    public static void a(String str) {
        c().a(str);
    }

    public static void b() {
        c().b();
    }

    private static c c() {
        if (f5330a == null) {
            synchronized (b.class) {
                if (f5330a == null) {
                    f5330a = new c6.a();
                }
            }
        }
        return f5330a;
    }

    public static boolean d() {
        return c().isTracing();
    }
}
