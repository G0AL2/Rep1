package androidx.lifecycle;

import we.c2;
import we.s0;

/* compiled from: Lifecycle.kt */
/* loaded from: classes.dex */
public final class n {
    public static final k a(i iVar) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl;
        qe.k.g(iVar, "$this$coroutineScope");
        do {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl2 = (LifecycleCoroutineScopeImpl) iVar.f3384a.get();
            if (lifecycleCoroutineScopeImpl2 != null) {
                return lifecycleCoroutineScopeImpl2;
            }
            lifecycleCoroutineScopeImpl = new LifecycleCoroutineScopeImpl(iVar, c2.b(null, 1, null).plus(s0.c().m0()));
        } while (!iVar.f3384a.compareAndSet(null, lifecycleCoroutineScopeImpl));
        lifecycleCoroutineScopeImpl.j();
        return lifecycleCoroutineScopeImpl;
    }
}
