package kotlinx.coroutines.internal;

import java.util.List;
import we.s1;

/* compiled from: MainDispatchers.kt */
/* loaded from: classes3.dex */
public final class n {
    public static final s1 a(MainDispatcherFactory mainDispatcherFactory, List<? extends MainDispatcherFactory> list) {
        qe.k.g(mainDispatcherFactory, "$this$tryCreateDispatcher");
        qe.k.g(list, "factories");
        try {
            return mainDispatcherFactory.b(list);
        } catch (Throwable th) {
            return new o(th, mainDispatcherFactory.a());
        }
    }
}
