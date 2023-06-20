package we;

import java.util.concurrent.CancellationException;

/* compiled from: CoroutineScope.kt */
/* loaded from: classes3.dex */
public final class f0 {
    public static final e0 a(ie.g gVar) {
        q b10;
        qe.k.g(gVar, "context");
        if (gVar.get(i1.f38615f0) == null) {
            b10 = n1.b(null, 1, null);
            gVar = gVar.plus(b10);
        }
        return new kotlinx.coroutines.internal.e(gVar);
    }

    public static final void b(e0 e0Var, CancellationException cancellationException) {
        qe.k.g(e0Var, "$this$cancel");
        i1 i1Var = (i1) e0Var.g().get(i1.f38615f0);
        if (i1Var != null) {
            i1Var.z(cancellationException);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + e0Var).toString());
    }

    public static /* synthetic */ void c(e0 e0Var, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        b(e0Var, cancellationException);
    }
}
