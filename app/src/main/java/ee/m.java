package ee;

import java.io.Serializable;

/* compiled from: Tuples.kt */
/* loaded from: classes3.dex */
public final class m<A, B> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    private final A f29805a;

    /* renamed from: b  reason: collision with root package name */
    private final B f29806b;

    public m(A a10, B b10) {
        this.f29805a = a10;
        this.f29806b = b10;
    }

    public final A a() {
        return this.f29805a;
    }

    public final B b() {
        return this.f29806b;
    }

    public final A c() {
        return this.f29805a;
    }

    public final B d() {
        return this.f29806b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            return qe.k.a(this.f29805a, mVar.f29805a) && qe.k.a(this.f29806b, mVar.f29806b);
        }
        return false;
    }

    public int hashCode() {
        A a10 = this.f29805a;
        int hashCode = (a10 == null ? 0 : a10.hashCode()) * 31;
        B b10 = this.f29806b;
        return hashCode + (b10 != null ? b10.hashCode() : 0);
    }

    public String toString() {
        return '(' + this.f29805a + ", " + this.f29806b + ')';
    }
}
