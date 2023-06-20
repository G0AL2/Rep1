package qe;

/* compiled from: PropertyReference.java */
/* loaded from: classes3.dex */
public abstract class p extends c implements te.f {
    public p() {
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            return g().equals(pVar.g()) && f().equals(pVar.f()) && j().equals(pVar.j()) && k.a(e(), pVar.e());
        } else if (obj instanceof te.f) {
            return obj.equals(c());
        } else {
            return false;
        }
    }

    public int hashCode() {
        return (((g().hashCode() * 31) + f().hashCode()) * 31) + j().hashCode();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public te.f k() {
        return (te.f) super.i();
    }

    public String toString() {
        te.a c10 = c();
        if (c10 != this) {
            return c10.toString();
        }
        return "property " + f() + " (Kotlin reflection is not available)";
    }

    public p(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, (i10 & 1) == 1);
    }
}
