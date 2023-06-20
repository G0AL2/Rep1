package b2;

/* compiled from: LottieCompositionCache.java */
/* loaded from: classes.dex */
public class g {

    /* renamed from: b  reason: collision with root package name */
    private static final g f4801b = new g();

    /* renamed from: a  reason: collision with root package name */
    private final androidx.collection.e<String, com.airbnb.lottie.h> f4802a = new androidx.collection.e<>(20);

    g() {
    }

    public static g b() {
        return f4801b;
    }

    public com.airbnb.lottie.h a(String str) {
        if (str == null) {
            return null;
        }
        return this.f4802a.get(str);
    }

    public void c(String str, com.airbnb.lottie.h hVar) {
        if (str == null) {
            return;
        }
        this.f4802a.put(str, hVar);
    }
}
