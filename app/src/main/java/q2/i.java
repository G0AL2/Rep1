package q2;

import android.annotation.TargetApi;
import android.net.TrafficStats;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* compiled from: NetworkDispatcher.java */
/* loaded from: classes.dex */
public class i extends Thread {

    /* renamed from: a  reason: collision with root package name */
    private final BlockingQueue<n<?>> f35804a;

    /* renamed from: b  reason: collision with root package name */
    private final h f35805b;

    /* renamed from: c  reason: collision with root package name */
    private final b f35806c;

    /* renamed from: d  reason: collision with root package name */
    private final q f35807d;

    /* renamed from: e  reason: collision with root package name */
    private volatile boolean f35808e = false;

    public i(BlockingQueue<n<?>> blockingQueue, h hVar, b bVar, q qVar) {
        this.f35804a = blockingQueue;
        this.f35805b = hVar;
        this.f35806c = bVar;
        this.f35807d = qVar;
    }

    @TargetApi(14)
    private void a(n<?> nVar) {
        if (Build.VERSION.SDK_INT >= 14) {
            TrafficStats.setThreadStatsTag(nVar.x());
        }
    }

    private void b(n<?> nVar, u uVar) {
        this.f35807d.a(nVar, nVar.E(uVar));
    }

    private void c() throws InterruptedException {
        d(this.f35804a.take());
    }

    void d(n<?> nVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        nVar.G(3);
        try {
            try {
                try {
                    nVar.b("network-queue-take");
                } catch (Exception e10) {
                    v.d(e10, "Unhandled exception %s", e10.toString());
                    u uVar = new u(e10);
                    uVar.a(SystemClock.elapsedRealtime() - elapsedRealtime);
                    this.f35807d.a(nVar, uVar);
                    nVar.C();
                }
            } catch (u e11) {
                e11.a(SystemClock.elapsedRealtime() - elapsedRealtime);
                b(nVar, e11);
                nVar.C();
            }
            if (nVar.A()) {
                nVar.h("network-discard-cancelled");
                nVar.C();
                return;
            }
            a(nVar);
            k a10 = this.f35805b.a(nVar);
            nVar.b("network-http-complete");
            if (a10.f35812d && nVar.z()) {
                nVar.h("not-modified");
                nVar.C();
                return;
            }
            p<?> F = nVar.F(a10);
            nVar.b("network-parse-complete");
            if (nVar.M() && F.f35849b != null) {
                this.f35806c.b(nVar.l(), F.f35849b);
                nVar.b("network-cache-written");
            }
            nVar.B();
            this.f35807d.b(nVar, F);
            nVar.D(F);
        } finally {
            nVar.G(4);
        }
    }

    public void e() {
        this.f35808e = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                c();
            } catch (InterruptedException unused) {
                if (this.f35808e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                v.c("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
