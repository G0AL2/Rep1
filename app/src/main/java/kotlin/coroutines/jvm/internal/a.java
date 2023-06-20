package kotlin.coroutines.jvm.internal;

import ee.n;
import ee.o;
import ee.u;
import java.io.Serializable;

/* compiled from: ContinuationImpl.kt */
/* loaded from: classes3.dex */
public abstract class a implements ie.d<Object>, e, Serializable {
    private final ie.d<Object> completion;

    public a(ie.d<Object> dVar) {
        this.completion = dVar;
    }

    public ie.d<u> create(ie.d<?> dVar) {
        qe.k.f(dVar, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public e getCallerFrame() {
        ie.d<Object> dVar = this.completion;
        if (dVar instanceof e) {
            return (e) dVar;
        }
        return null;
    }

    public final ie.d<Object> getCompletion() {
        return this.completion;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public StackTraceElement getStackTraceElement() {
        return g.d(this);
    }

    protected abstract Object invokeSuspend(Object obj);

    protected void releaseIntercepted() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ie.d
    public final void resumeWith(Object obj) {
        Object invokeSuspend;
        ie.d dVar = this;
        while (true) {
            h.b(dVar);
            a aVar = (a) dVar;
            ie.d dVar2 = aVar.completion;
            qe.k.c(dVar2);
            try {
                invokeSuspend = aVar.invokeSuspend(obj);
            } catch (Throwable th) {
                n.a aVar2 = n.f29807a;
                obj = n.a(o.a(th));
            }
            if (invokeSuspend == je.b.c()) {
                return;
            }
            n.a aVar3 = n.f29807a;
            obj = n.a(invokeSuspend);
            aVar.releaseIntercepted();
            if (!(dVar2 instanceof a)) {
                dVar2.resumeWith(obj);
                return;
            }
            dVar = dVar2;
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb2.append(stackTraceElement);
        return sb2.toString();
    }

    public ie.d<u> create(Object obj, ie.d<?> dVar) {
        qe.k.f(dVar, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
}
