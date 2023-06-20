package q2;

import android.os.Process;
import java.util.concurrent.BlockingQueue;
import q2.b;

/* compiled from: CacheDispatcher.java */
/* loaded from: classes.dex */
public class c extends Thread {

    /* renamed from: g  reason: collision with root package name */
    private static final boolean f35784g = v.f35853b;

    /* renamed from: a  reason: collision with root package name */
    private final BlockingQueue<n<?>> f35785a;

    /* renamed from: b  reason: collision with root package name */
    private final BlockingQueue<n<?>> f35786b;

    /* renamed from: c  reason: collision with root package name */
    private final b f35787c;

    /* renamed from: d  reason: collision with root package name */
    private final q f35788d;

    /* renamed from: e  reason: collision with root package name */
    private volatile boolean f35789e = false;

    /* renamed from: f  reason: collision with root package name */
    private final w f35790f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CacheDispatcher.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f35791a;

        a(n nVar) {
            this.f35791a = nVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                c.this.f35786b.put(this.f35791a);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public c(BlockingQueue<n<?>> blockingQueue, BlockingQueue<n<?>> blockingQueue2, b bVar, q qVar) {
        this.f35785a = blockingQueue;
        this.f35786b = blockingQueue2;
        this.f35787c = bVar;
        this.f35788d = qVar;
        this.f35790f = new w(this, blockingQueue2, qVar);
    }

    private void b() throws InterruptedException {
        c(this.f35785a.take());
    }

    void c(n<?> nVar) throws InterruptedException {
        nVar.b("cache-queue-take");
        nVar.G(1);
        try {
            if (nVar.A()) {
                nVar.h("cache-discard-canceled");
                return;
            }
            b.a aVar = this.f35787c.get(nVar.l());
            if (aVar == null) {
                nVar.b("cache-miss");
                if (!this.f35790f.c(nVar)) {
                    this.f35786b.put(nVar);
                }
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (aVar.b(currentTimeMillis)) {
                nVar.b("cache-hit-expired");
                nVar.H(aVar);
                if (!this.f35790f.c(nVar)) {
                    this.f35786b.put(nVar);
                }
                return;
            }
            nVar.b("cache-hit");
            p<?> F = nVar.F(new k(aVar.f35776a, aVar.f35782g));
            nVar.b("cache-hit-parsed");
            if (!F.b()) {
                nVar.b("cache-parsing-failed");
                this.f35787c.a(nVar.l(), true);
                nVar.H(null);
                if (!this.f35790f.c(nVar)) {
                    this.f35786b.put(nVar);
                }
                return;
            }
            if (!aVar.c(currentTimeMillis)) {
                this.f35788d.b(nVar, F);
            } else {
                nVar.b("cache-hit-refresh-needed");
                nVar.H(aVar);
                F.f35851d = true;
                if (!this.f35790f.c(nVar)) {
                    this.f35788d.c(nVar, F, new a(nVar));
                } else {
                    this.f35788d.b(nVar, F);
                }
            }
        } finally {
            nVar.G(2);
        }
    }

    public void d() {
        this.f35789e = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        if (f35784g) {
            v.e("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f35787c.initialize();
        while (true) {
            try {
                b();
            } catch (InterruptedException unused) {
                if (this.f35789e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                v.c("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
