package kotlinx.coroutines.internal;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* compiled from: Concurrent.kt */
/* loaded from: classes3.dex */
public final class d {
    static {
        try {
            ScheduledThreadPoolExecutor.class.getMethod("setRemoveOnCancelPolicy", Boolean.TYPE);
        } catch (Throwable unused) {
        }
    }

    public static final <E> Set<E> a(int i10) {
        Set<E> newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(i10));
        qe.k.b(newSetFromMap, "Collections.newSetFromMa…ityHashMap(expectedSize))");
        return newSetFromMap;
    }
}
