package o1;

/* compiled from: SystemIdInfo.kt */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final String f34884a;

    /* renamed from: b  reason: collision with root package name */
    private final int f34885b;

    /* renamed from: c  reason: collision with root package name */
    public final int f34886c;

    public i(String str, int i10, int i11) {
        qe.k.f(str, "workSpecId");
        this.f34884a = str;
        this.f34885b = i10;
        this.f34886c = i11;
    }

    public final int a() {
        return this.f34885b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            return qe.k.a(this.f34884a, iVar.f34884a) && this.f34885b == iVar.f34885b && this.f34886c == iVar.f34886c;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f34884a.hashCode() * 31) + this.f34885b) * 31) + this.f34886c;
    }

    public String toString() {
        return "SystemIdInfo(workSpecId=" + this.f34884a + ", generation=" + this.f34885b + ", systemId=" + this.f34886c + ')';
    }
}
