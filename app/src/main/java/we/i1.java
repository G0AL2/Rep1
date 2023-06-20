package we;

import ie.g;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* compiled from: Job.kt */
/* loaded from: classes3.dex */
public interface i1 extends g.b {

    /* renamed from: f0  reason: collision with root package name */
    public static final b f38615f0 = b.f38616a;

    /* compiled from: Job.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public static /* synthetic */ void a(i1 i1Var, CancellationException cancellationException, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    cancellationException = null;
                }
                i1Var.z(cancellationException);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        public static <R> R b(i1 i1Var, R r10, pe.p<? super R, ? super g.b, ? extends R> pVar) {
            qe.k.g(pVar, "operation");
            return (R) g.b.a.a(i1Var, r10, pVar);
        }

        public static <E extends g.b> E c(i1 i1Var, g.c<E> cVar) {
            qe.k.g(cVar, "key");
            return (E) g.b.a.b(i1Var, cVar);
        }

        public static /* synthetic */ t0 d(i1 i1Var, boolean z10, boolean z11, pe.l lVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    z10 = false;
                }
                if ((i10 & 2) != 0) {
                    z11 = true;
                }
                return i1Var.d(z10, z11, lVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
        }

        public static ie.g e(i1 i1Var, g.c<?> cVar) {
            qe.k.g(cVar, "key");
            return g.b.a.c(i1Var, cVar);
        }

        public static ie.g f(i1 i1Var, ie.g gVar) {
            qe.k.g(gVar, "context");
            return g.b.a.d(i1Var, gVar);
        }
    }

    /* compiled from: Job.kt */
    /* loaded from: classes3.dex */
    public static final class b implements g.c<i1> {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ b f38616a = new b();

        static {
            CoroutineExceptionHandler.a aVar = CoroutineExceptionHandler.f33475c0;
        }

        private b() {
        }
    }

    boolean a();

    t0 d(boolean z10, boolean z11, pe.l<? super Throwable, ee.u> lVar);

    m d0(o oVar);

    CancellationException l();

    boolean start();

    void z(CancellationException cancellationException);
}
