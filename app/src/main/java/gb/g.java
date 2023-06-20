package gb;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class g {
    public static <ResultT> e<ResultT> a(Exception exc) {
        t tVar = new t();
        tVar.i(exc);
        return tVar;
    }

    public static <ResultT> e<ResultT> b(ResultT resultt) {
        t tVar = new t();
        tVar.j(resultt);
        return tVar;
    }

    private static <ResultT> ResultT c(e<ResultT> eVar) throws ExecutionException {
        if (eVar.g()) {
            return eVar.e();
        }
        throw new ExecutionException(eVar.d());
    }

    private static void d(e<?> eVar, u uVar) {
        Executor executor = f.f30787b;
        eVar.c(executor, uVar);
        eVar.b(executor, uVar);
    }

    public static <ResultT> ResultT e(e<ResultT> eVar) throws ExecutionException, InterruptedException {
        cb.q.b(eVar, "Task must not be null");
        if (eVar.f()) {
            return (ResultT) c(eVar);
        }
        u uVar = new u(null);
        d(eVar, uVar);
        uVar.a();
        return (ResultT) c(eVar);
    }
}
