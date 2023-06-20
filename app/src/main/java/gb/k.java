package gb;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class k<ResultT> implements n<ResultT> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f30795a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f30796b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private final b f30797c;

    public k(Executor executor, b bVar) {
        this.f30795a = executor;
        this.f30797c = bVar;
    }

    @Override // gb.n
    public final void a(e<ResultT> eVar) {
        if (eVar.g()) {
            return;
        }
        synchronized (this.f30796b) {
            if (this.f30797c == null) {
                return;
            }
            this.f30795a.execute(new j(this, eVar));
        }
    }
}
