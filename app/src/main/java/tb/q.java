package tb;

import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* compiled from: Dependency.java */
/* loaded from: classes3.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    private final Class<?> f37298a;

    /* renamed from: b  reason: collision with root package name */
    private final int f37299b;

    /* renamed from: c  reason: collision with root package name */
    private final int f37300c;

    private q(Class<?> cls, int i10, int i11) {
        this.f37298a = (Class) d0.c(cls, "Null dependency anInterface.");
        this.f37299b = i10;
        this.f37300c = i11;
    }

    public static q a(Class<?> cls) {
        return new q(cls, 0, 2);
    }

    private static String b(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return "deferred";
                }
                throw new AssertionError("Unsupported injection: " + i10);
            }
            return IronSourceConstants.EVENTS_PROVIDER;
        }
        return "direct";
    }

    @Deprecated
    public static q h(Class<?> cls) {
        return new q(cls, 0, 0);
    }

    public static q i(Class<?> cls) {
        return new q(cls, 0, 1);
    }

    public static q j(Class<?> cls) {
        return new q(cls, 1, 0);
    }

    public static q k(Class<?> cls) {
        return new q(cls, 1, 1);
    }

    public static q l(Class<?> cls) {
        return new q(cls, 2, 0);
    }

    public Class<?> c() {
        return this.f37298a;
    }

    public boolean d() {
        return this.f37300c == 2;
    }

    public boolean e() {
        return this.f37300c == 0;
    }

    public boolean equals(Object obj) {
        if (obj instanceof q) {
            q qVar = (q) obj;
            return this.f37298a == qVar.f37298a && this.f37299b == qVar.f37299b && this.f37300c == qVar.f37300c;
        }
        return false;
    }

    public boolean f() {
        return this.f37299b == 1;
    }

    public boolean g() {
        return this.f37299b == 2;
    }

    public int hashCode() {
        return ((((this.f37298a.hashCode() ^ 1000003) * 1000003) ^ this.f37299b) * 1000003) ^ this.f37300c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f37298a);
        sb2.append(", type=");
        int i10 = this.f37299b;
        sb2.append(i10 == 1 ? "required" : i10 == 0 ? "optional" : "set");
        sb2.append(", injection=");
        sb2.append(b(this.f37300c));
        sb2.append("}");
        return sb2.toString();
    }
}
