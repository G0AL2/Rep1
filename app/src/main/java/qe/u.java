package qe;

/* compiled from: ReflectionFactory.java */
/* loaded from: classes3.dex */
public class u {
    public te.d a(i iVar) {
        return iVar;
    }

    public te.b b(Class cls) {
        return new e(cls);
    }

    public te.c c(Class cls, String str) {
        return new m(cls, str);
    }

    public te.e d(n nVar) {
        return nVar;
    }

    public String e(h hVar) {
        String obj = hVar.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }

    public String f(l lVar) {
        return e(lVar);
    }
}
