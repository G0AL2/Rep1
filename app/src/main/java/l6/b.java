package l6;

import android.os.SystemClock;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.fabric.FabricUIManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import m6.e;

/* compiled from: MountItemDispatcher.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private final c f33701a;

    /* renamed from: b  reason: collision with root package name */
    private final a f33702b;

    /* renamed from: c  reason: collision with root package name */
    private final ConcurrentLinkedQueue<m6.a> f33703c = new ConcurrentLinkedQueue<>();

    /* renamed from: d  reason: collision with root package name */
    private final ConcurrentLinkedQueue<m6.d> f33704d = new ConcurrentLinkedQueue<>();

    /* renamed from: e  reason: collision with root package name */
    private final ConcurrentLinkedQueue<e> f33705e = new ConcurrentLinkedQueue<>();

    /* renamed from: f  reason: collision with root package name */
    private boolean f33706f = false;

    /* renamed from: g  reason: collision with root package name */
    private int f33707g = 0;

    /* renamed from: h  reason: collision with root package name */
    private long f33708h = 0;

    /* renamed from: i  reason: collision with root package name */
    private long f33709i = 0;

    /* compiled from: MountItemDispatcher.java */
    /* loaded from: classes.dex */
    public interface a {
        void a();
    }

    public b(c cVar, a aVar) {
        this.f33701a = cVar;
        this.f33702b = aVar;
    }

    private boolean f() {
        boolean isIgnorable;
        if (this.f33707g == 0) {
            this.f33708h = 0L;
        }
        this.f33709i = SystemClock.uptimeMillis();
        List<m6.a> l10 = l();
        List<m6.d> j10 = j();
        if (j10 == null && l10 == null) {
            return false;
        }
        if (l10 != null) {
            com.facebook.systrace.a.c(0L, "FabricUIManager::mountViews viewCommandMountItems to execute: " + l10.size());
            for (m6.a aVar : l10) {
                if (FabricUIManager.ENABLE_FABRIC_LOGS) {
                    p(aVar, "dispatchMountItems: Executing viewCommandMountItem");
                }
                try {
                    i(aVar);
                } catch (RetryableMountingLayerException e10) {
                    if (aVar.c() == 0) {
                        aVar.d();
                        d(aVar);
                    } else {
                        ReactSoftExceptionLogger.logSoftException("MountItemDispatcher", new ReactNoCrashSoftException("Caught exception executing ViewCommand: " + aVar.toString(), e10));
                    }
                } catch (Throwable th) {
                    ReactSoftExceptionLogger.logSoftException("MountItemDispatcher", new RuntimeException("Caught exception executing ViewCommand: " + aVar.toString(), th));
                }
            }
            com.facebook.systrace.a.g(0L);
        }
        Collection<e> k10 = k();
        if (k10 != null) {
            com.facebook.systrace.a.c(0L, "FabricUIManager::mountViews preMountItems to execute: " + k10.size());
            for (e eVar : k10) {
                i(eVar);
            }
            com.facebook.systrace.a.g(0L);
        }
        if (j10 != null) {
            com.facebook.systrace.a.c(0L, "FabricUIManager::mountViews mountItems to execute: " + j10.size());
            long uptimeMillis = SystemClock.uptimeMillis();
            Iterator<m6.d> it = j10.iterator();
            while (it.hasNext()) {
                m6.d next = it.next();
                if (FabricUIManager.ENABLE_FABRIC_LOGS) {
                    p(next, "dispatchMountItems: Executing mountItem");
                }
                try {
                    i(next);
                } finally {
                    if (isIgnorable) {
                    }
                }
            }
            this.f33708h += SystemClock.uptimeMillis() - uptimeMillis;
        }
        com.facebook.systrace.a.g(0L);
        return true;
    }

    private static <E extends m6.d> List<E> h(ConcurrentLinkedQueue<E> concurrentLinkedQueue) {
        ArrayList arrayList = new ArrayList();
        while (!concurrentLinkedQueue.isEmpty()) {
            E poll = concurrentLinkedQueue.poll();
            if (poll != null) {
                arrayList.add(poll);
            }
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return arrayList;
    }

    private void i(m6.d dVar) {
        if (this.f33701a.j(dVar.a())) {
            if (FabricUIManager.ENABLE_FABRIC_LOGS) {
                z3.a.l("MountItemDispatcher", "executeOrEnqueue: Item execution delayed, surface %s is not ready yet", Integer.valueOf(dVar.a()));
            }
            this.f33701a.d(dVar.a()).r(dVar);
            return;
        }
        dVar.b(this.f33701a);
    }

    private List<m6.d> j() {
        return h(this.f33704d);
    }

    private Collection<e> k() {
        return h(this.f33705e);
    }

    private List<m6.a> l() {
        return h(this.f33703c);
    }

    private static boolean o(long j10) {
        return 16 - ((System.nanoTime() - j10) / 1000000) < 8;
    }

    private static void p(m6.d dVar, String str) {
        String[] split;
        for (String str2 : dVar.toString().split("\n")) {
            z3.a.j("MountItemDispatcher", str + ": " + str2);
        }
    }

    public void a(m6.d dVar) {
        this.f33704d.add(dVar);
    }

    public void b(e eVar) {
        if (this.f33701a.r(eVar.a())) {
            return;
        }
        this.f33705e.add(eVar);
    }

    public void c(m6.a aVar) {
        this.f33703c.add(aVar);
    }

    public void d(m6.a aVar) {
        c(aVar);
    }

    public void e(Queue<m6.d> queue) {
        while (!queue.isEmpty()) {
            m6.d poll = queue.poll();
            try {
                poll.b(this.f33701a);
            } catch (RetryableMountingLayerException e10) {
                if (poll instanceof m6.a) {
                    m6.a aVar = (m6.a) poll;
                    if (aVar.c() == 0) {
                        aVar.d();
                        d(aVar);
                    }
                } else {
                    p(poll, "dispatchExternalMountItems: mounting failed with " + e10.getMessage());
                }
            }
        }
    }

    public void g(long j10) {
        e poll;
        com.facebook.systrace.a.c(0L, "FabricUIManager::premountViews");
        this.f33706f = true;
        while (!o(j10) && (poll = this.f33705e.poll()) != null) {
            try {
                if (FabricUIManager.ENABLE_FABRIC_LOGS) {
                    p(poll, "dispatchPreMountItems: Dispatching PreAllocateViewMountItem");
                }
                i(poll);
            } catch (Throwable th) {
                this.f33706f = false;
                throw th;
            }
        }
        this.f33706f = false;
        com.facebook.systrace.a.g(0L);
    }

    public long m() {
        return this.f33708h;
    }

    public long n() {
        return this.f33709i;
    }

    public boolean q() {
        if (this.f33706f) {
            return false;
        }
        try {
            boolean f10 = f();
            this.f33706f = false;
            this.f33702b.a();
            int i10 = this.f33707g;
            if (i10 < 10 && f10) {
                if (i10 > 2) {
                    ReactSoftExceptionLogger.logSoftException("MountItemDispatcher", new ReactNoCrashSoftException("Re-dispatched " + this.f33707g + " times. This indicates setState (?) is likely being called too many times during mounting."));
                }
                this.f33707g++;
                q();
            }
            this.f33707g = 0;
            return f10;
        } finally {
        }
    }
}
