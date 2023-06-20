package qe;

/* compiled from: FunctionReference.java */
/* loaded from: classes3.dex */
public class i extends c implements h, te.d {

    /* renamed from: h  reason: collision with root package name */
    private final int f36105h;

    /* renamed from: i  reason: collision with root package name */
    private final int f36106i;

    public i(int i10, Object obj, Class cls, String str, String str2, int i11) {
        super(obj, cls, str, str2, (i11 & 1) == 1);
        this.f36105h = i10;
        this.f36106i = i11 >> 1;
    }

    @Override // qe.c
    protected te.a d() {
        return t.a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            return f().equals(iVar.f()) && j().equals(iVar.j()) && this.f36106i == iVar.f36106i && this.f36105h == iVar.f36105h && k.a(e(), iVar.e()) && k.a(g(), iVar.g());
        } else if (obj instanceof te.d) {
            return obj.equals(c());
        } else {
            return false;
        }
    }

    @Override // qe.h
    public int getArity() {
        return this.f36105h;
    }

    public int hashCode() {
        return (((g() == null ? 0 : g().hashCode() * 31) + f().hashCode()) * 31) + j().hashCode();
    }

    public String toString() {
        te.a c10 = c();
        if (c10 != this) {
            return c10.toString();
        }
        if ("<init>".equals(f())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + f() + " (Kotlin reflection is not available)";
    }
}
