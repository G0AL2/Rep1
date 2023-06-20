package qe;

/* compiled from: Reflection.java */
/* loaded from: classes3.dex */
public class t {

    /* renamed from: a  reason: collision with root package name */
    private static final u f36111a;

    /* renamed from: b  reason: collision with root package name */
    private static final te.b[] f36112b;

    static {
        u uVar = null;
        try {
            uVar = (u) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (uVar == null) {
            uVar = new u();
        }
        f36111a = uVar;
        f36112b = new te.b[0];
    }

    public static te.d a(i iVar) {
        return f36111a.a(iVar);
    }

    public static te.b b(Class cls) {
        return f36111a.b(cls);
    }

    public static te.c c(Class cls) {
        return f36111a.c(cls, "");
    }

    public static te.e d(n nVar) {
        return f36111a.d(nVar);
    }

    public static String e(h hVar) {
        return f36111a.e(hVar);
    }

    public static String f(l lVar) {
        return f36111a.f(lVar);
    }
}
