package o1;

/* compiled from: WorkSpec.kt */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    private final String f34891a;

    /* renamed from: b  reason: collision with root package name */
    private final int f34892b;

    public m(String str, int i10) {
        qe.k.f(str, "workSpecId");
        this.f34891a = str;
        this.f34892b = i10;
    }

    public final int a() {
        return this.f34892b;
    }

    public final String b() {
        return this.f34891a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            return qe.k.a(this.f34891a, mVar.f34891a) && this.f34892b == mVar.f34892b;
        }
        return false;
    }

    public int hashCode() {
        return (this.f34891a.hashCode() * 31) + this.f34892b;
    }

    public String toString() {
        return "WorkGenerationalId(workSpecId=" + this.f34891a + ", generation=" + this.f34892b + ')';
    }
}
