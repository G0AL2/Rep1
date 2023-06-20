package q2;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: ExecutorDelivery.java */
/* loaded from: classes.dex */
public class f implements q {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f35797a;

    /* compiled from: ExecutorDelivery.java */
    /* loaded from: classes.dex */
    class a implements Executor {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Handler f35798a;

        a(f fVar, Handler handler) {
            this.f35798a = handler;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f35798a.post(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ExecutorDelivery.java */
    /* loaded from: classes.dex */
    public static class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final n f35799a;

        /* renamed from: b  reason: collision with root package name */
        private final p f35800b;

        /* renamed from: c  reason: collision with root package name */
        private final Runnable f35801c;

        public b(n nVar, p pVar, Runnable runnable) {
            this.f35799a = nVar;
            this.f35800b = pVar;
            this.f35801c = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f35799a.A()) {
                this.f35799a.h("canceled-at-delivery");
                return;
            }
            if (this.f35800b.b()) {
                this.f35799a.e(this.f35800b.f35848a);
            } else {
                this.f35799a.d(this.f35800b.f35850c);
            }
            if (this.f35800b.f35851d) {
                this.f35799a.b("intermediate-response");
            } else {
                this.f35799a.h("done");
            }
            Runnable runnable = this.f35801c;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public f(Handler handler) {
        this.f35797a = new a(this, handler);
    }

    @Override // q2.q
    public void a(n<?> nVar, u uVar) {
        nVar.b("post-error");
        this.f35797a.execute(new b(nVar, p.a(uVar), null));
    }

    @Override // q2.q
    public void b(n<?> nVar, p<?> pVar) {
        c(nVar, pVar, null);
    }

    @Override // q2.q
    public void c(n<?> nVar, p<?> pVar, Runnable runnable) {
        nVar.B();
        nVar.b("post-response");
        this.f35797a.execute(new b(nVar, pVar, runnable));
    }
}
