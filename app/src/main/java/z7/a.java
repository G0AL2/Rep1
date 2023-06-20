package z7;

import javax.inject.Provider;

/* compiled from: DoubleCheck.java */
/* loaded from: classes2.dex */
public final class a<T> implements Provider<T>, y7.a<T> {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f40109c = new Object();

    /* renamed from: a  reason: collision with root package name */
    private volatile Provider<T> f40110a;

    /* renamed from: b  reason: collision with root package name */
    private volatile Object f40111b = f40109c;

    private a(Provider<T> provider) {
        this.f40110a = provider;
    }

    public static <P extends Provider<T>, T> y7.a<T> a(P p10) {
        if (p10 instanceof y7.a) {
            return (y7.a) p10;
        }
        return new a((Provider) d.b(p10));
    }

    public static <P extends Provider<T>, T> Provider<T> b(P p10) {
        d.b(p10);
        return p10 instanceof a ? p10 : new a(p10);
    }

    public static Object c(Object obj, Object obj2) {
        if (!(obj != f40109c) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // javax.inject.Provider
    public T get() {
        T t10 = (T) this.f40111b;
        Object obj = f40109c;
        if (t10 == obj) {
            synchronized (this) {
                t10 = this.f40111b;
                if (t10 == obj) {
                    t10 = this.f40110a.get();
                    this.f40111b = c(this.f40111b, t10);
                    this.f40110a = null;
                }
            }
        }
        return t10;
    }
}
