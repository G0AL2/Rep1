package h0;

/* compiled from: Pair.java */
/* loaded from: classes.dex */
public class d<F, S> {

    /* renamed from: a  reason: collision with root package name */
    public final F f31049a;

    /* renamed from: b  reason: collision with root package name */
    public final S f31050b;

    public d(F f10, S s10) {
        this.f31049a = f10;
        this.f31050b = s10;
    }

    public static <A, B> d<A, B> a(A a10, B b10) {
        return new d<>(a10, b10);
    }

    public boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            return c.a(dVar.f31049a, this.f31049a) && c.a(dVar.f31050b, this.f31050b);
        }
        return false;
    }

    public int hashCode() {
        F f10 = this.f31049a;
        int hashCode = f10 == null ? 0 : f10.hashCode();
        S s10 = this.f31050b;
        return hashCode ^ (s10 != null ? s10.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.f31049a + " " + this.f31050b + "}";
    }
}
