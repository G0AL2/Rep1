package kotlinx.coroutines.internal;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import we.s1;

/* compiled from: MainDispatchers.kt */
/* loaded from: classes3.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f33525a;

    /* renamed from: b  reason: collision with root package name */
    public static final s1 f33526b;

    static {
        m mVar = new m();
        f33525a = v.e("kotlinx.coroutines.fast.service.loader", true);
        f33526b = mVar.a();
    }

    private m() {
    }

    private final s1 a() {
        ue.d a10;
        List j10;
        Object next;
        s1 a11;
        try {
            if (f33525a) {
                g gVar = g.f33508a;
                ClassLoader classLoader = MainDispatcherFactory.class.getClassLoader();
                qe.k.b(classLoader, "clz.classLoader");
                j10 = gVar.b(MainDispatcherFactory.class, classLoader);
            } else {
                Iterator it = ServiceLoader.load(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader()).iterator();
                qe.k.b(it, "ServiceLoader.load(\n    …             ).iterator()");
                a10 = ue.h.a(it);
                j10 = ue.j.j(a10);
            }
            Iterator it2 = j10.iterator();
            if (it2.hasNext()) {
                next = it2.next();
                if (it2.hasNext()) {
                    int c10 = ((MainDispatcherFactory) next).c();
                    do {
                        Object next2 = it2.next();
                        int c11 = ((MainDispatcherFactory) next2).c();
                        if (c10 < c11) {
                            next = next2;
                            c10 = c11;
                        }
                    } while (it2.hasNext());
                }
            } else {
                next = null;
            }
            MainDispatcherFactory mainDispatcherFactory = (MainDispatcherFactory) next;
            return (mainDispatcherFactory == null || (a11 = n.a(mainDispatcherFactory, j10)) == null) ? new o(null, null, 2, null) : a11;
        } catch (Throwable th) {
            return new o(th, null, 2, null);
        }
    }
}
