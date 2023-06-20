package we;

import ee.n;

/* compiled from: DebugStrings.kt */
/* loaded from: classes3.dex */
public final class j0 {
    public static final String a(Object obj) {
        qe.k.g(obj, "$this$classSimpleName");
        String simpleName = obj.getClass().getSimpleName();
        qe.k.b(simpleName, "this::class.java.simpleName");
        return simpleName;
    }

    public static final String b(Object obj) {
        qe.k.g(obj, "$this$hexAddress");
        String hexString = Integer.toHexString(System.identityHashCode(obj));
        qe.k.b(hexString, "Integer.toHexString(System.identityHashCode(this))");
        return hexString;
    }

    public static final String c(ie.d<?> dVar) {
        String a10;
        qe.k.g(dVar, "$this$toDebugString");
        if (dVar instanceof o0) {
            return dVar.toString();
        }
        try {
            n.a aVar = ee.n.f29807a;
            a10 = ee.n.a(dVar + '@' + b(dVar));
        } catch (Throwable th) {
            n.a aVar2 = ee.n.f29807a;
            a10 = ee.n.a(ee.o.a(th));
        }
        if (ee.n.b(a10) != null) {
            a10 = dVar.getClass().getName() + '@' + b(dVar);
        }
        return (String) a10;
    }
}
