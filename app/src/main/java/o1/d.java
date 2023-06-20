package o1;

/* compiled from: Preference.kt */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final String f34877a;

    /* renamed from: b  reason: collision with root package name */
    private final Long f34878b;

    public d(String str, Long l10) {
        qe.k.f(str, "key");
        this.f34877a = str;
        this.f34878b = l10;
    }

    public final String a() {
        return this.f34877a;
    }

    public final Long b() {
        return this.f34878b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            return qe.k.a(this.f34877a, dVar.f34877a) && qe.k.a(this.f34878b, dVar.f34878b);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f34877a.hashCode() * 31;
        Long l10 = this.f34878b;
        return hashCode + (l10 == null ? 0 : l10.hashCode());
    }

    public String toString() {
        return "Preference(key=" + this.f34877a + ", value=" + this.f34878b + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(String str, boolean z10) {
        this(str, Long.valueOf(z10 ? 1L : 0L));
        qe.k.f(str, "key");
    }
}
