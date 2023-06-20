package gb;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class m<ResultT> implements n<ResultT> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f30800a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f30801b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private final c<? super ResultT> f30802c;

    public m(Executor executor, c<? super ResultT> cVar) {
        this.f30800a = executor;
        this.f30802c = cVar;
    }

    @Override // gb.n
    public final void a(e<ResultT> eVar) {
        if (eVar.g()) {
            synchronized (this.f30801b) {
                if (this.f30802c == null) {
                    return;
                }
                this.f30800a.execute(new l(this, eVar));
            }
        }
    }
}
