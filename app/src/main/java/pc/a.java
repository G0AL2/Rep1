package pc;

import tb.d0;

/* compiled from: Event.java */
/* loaded from: classes3.dex */
public class a<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Class<T> f35721a;

    /* renamed from: b  reason: collision with root package name */
    private final T f35722b;

    public a(Class<T> cls, T t10) {
        this.f35721a = (Class) d0.b(cls);
        this.f35722b = (T) d0.b(t10);
    }

    public T a() {
        return this.f35722b;
    }

    public Class<T> b() {
        return this.f35721a;
    }

    public String toString() {
        return String.format("Event{type: %s, payload: %s}", this.f35721a, this.f35722b);
    }
}
