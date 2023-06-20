package z5;

/* compiled from: BitmapCounterProvider.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public static final int f39997a = b();

    /* renamed from: b  reason: collision with root package name */
    private static int f39998b = 384;

    /* renamed from: c  reason: collision with root package name */
    private static volatile a f39999c;

    public static a a() {
        if (f39999c == null) {
            synchronized (b.class) {
                if (f39999c == null) {
                    f39999c = new a(f39998b, f39997a);
                }
            }
        }
        return f39999c;
    }

    private static int b() {
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (min > 16777216) {
            return (min / 4) * 3;
        }
        return min / 2;
    }
}
