package kotlinx.coroutines.internal;

/* compiled from: SystemProps.kt */
/* loaded from: classes3.dex */
final /* synthetic */ class w {

    /* renamed from: a  reason: collision with root package name */
    private static final int f33533a = Runtime.getRuntime().availableProcessors();

    public static final int a() {
        return f33533a;
    }

    public static final String b(String str) {
        qe.k.g(str, "propertyName");
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
