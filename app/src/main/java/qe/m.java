package qe;

/* compiled from: PackageReference.kt */
/* loaded from: classes3.dex */
public final class m implements d {

    /* renamed from: a  reason: collision with root package name */
    private final Class<?> f36107a;

    public m(Class<?> cls, String str) {
        k.f(cls, "jClass");
        k.f(str, "moduleName");
        this.f36107a = cls;
    }

    @Override // qe.d
    public Class<?> a() {
        return this.f36107a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof m) && k.a(a(), ((m) obj).a());
    }

    public int hashCode() {
        return a().hashCode();
    }

    public String toString() {
        return a().toString() + " (Kotlin reflection is not available)";
    }
}
