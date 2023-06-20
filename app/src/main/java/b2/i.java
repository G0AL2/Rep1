package b2;

/* compiled from: MutablePair.java */
/* loaded from: classes.dex */
public class i<T> {

    /* renamed from: a  reason: collision with root package name */
    T f4806a;

    /* renamed from: b  reason: collision with root package name */
    T f4807b;

    private static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public void b(T t10, T t11) {
        this.f4806a = t10;
        this.f4807b = t11;
    }

    public boolean equals(Object obj) {
        if (obj instanceof h0.d) {
            h0.d dVar = (h0.d) obj;
            return a(dVar.f31049a, this.f4806a) && a(dVar.f31050b, this.f4807b);
        }
        return false;
    }

    public int hashCode() {
        T t10 = this.f4806a;
        int hashCode = t10 == null ? 0 : t10.hashCode();
        T t11 = this.f4807b;
        return hashCode ^ (t11 != null ? t11.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.f4806a + " " + this.f4807b + "}";
    }
}
