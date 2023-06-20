package gb;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class i<ResultT> implements n<ResultT> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f30790a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f30791b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private final a<ResultT> f30792c;

    public i(Executor executor, a<ResultT> aVar) {
        this.f30790a = executor;
        this.f30792c = aVar;
    }

    @Override // gb.n
    public final void a(e<ResultT> eVar) {
        synchronized (this.f30791b) {
            if (this.f30792c == null) {
                return;
            }
            this.f30790a.execute(new h(this, eVar));
        }
    }
}
