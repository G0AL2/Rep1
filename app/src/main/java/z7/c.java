package z7;

/* compiled from: InstanceFactory.java */
/* loaded from: classes2.dex */
public final class c<T> implements b<T>, y7.a<T> {

    /* renamed from: a  reason: collision with root package name */
    private final T f40112a;

    static {
        new c(null);
    }

    private c(T t10) {
        this.f40112a = t10;
    }

    public static <T> b<T> a(T t10) {
        return new c(d.c(t10, "instance cannot be null"));
    }

    @Override // javax.inject.Provider
    public T get() {
        return this.f40112a;
    }
}
