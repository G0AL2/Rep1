package we;

import java.util.concurrent.CancellationException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Job.kt */
/* loaded from: classes3.dex */
public final /* synthetic */ class n1 {
    public static final q a(i1 i1Var) {
        return new l1(i1Var);
    }

    public static /* synthetic */ q b(i1 i1Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i1Var = null;
        }
        return m1.a(i1Var);
    }

    public static final void c(ie.g gVar, CancellationException cancellationException) {
        qe.k.g(gVar, "$this$cancel");
        i1 i1Var = (i1) gVar.get(i1.f38615f0);
        if (i1Var != null) {
            i1Var.z(cancellationException);
        }
    }

    public static /* synthetic */ void d(ie.g gVar, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        m1.c(gVar, cancellationException);
    }
}
