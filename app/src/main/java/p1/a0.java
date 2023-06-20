package p1;

import java.util.HashMap;
import java.util.Map;

/* compiled from: WorkTimer.java */
/* loaded from: classes.dex */
public class a0 {

    /* renamed from: e  reason: collision with root package name */
    private static final String f35426e = androidx.work.l.i("WorkTimer");

    /* renamed from: a  reason: collision with root package name */
    final androidx.work.s f35427a;

    /* renamed from: b  reason: collision with root package name */
    final Map<o1.m, b> f35428b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    final Map<o1.m, a> f35429c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    final Object f35430d = new Object();

    /* compiled from: WorkTimer.java */
    /* loaded from: classes.dex */
    public interface a {
        void a(o1.m mVar);
    }

    /* compiled from: WorkTimer.java */
    /* loaded from: classes.dex */
    public static class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final a0 f35431a;

        /* renamed from: b  reason: collision with root package name */
        private final o1.m f35432b;

        b(a0 a0Var, o1.m mVar) {
            this.f35431a = a0Var;
            this.f35432b = mVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f35431a.f35430d) {
                if (this.f35431a.f35428b.remove(this.f35432b) != null) {
                    a remove = this.f35431a.f35429c.remove(this.f35432b);
                    if (remove != null) {
                        remove.a(this.f35432b);
                    }
                } else {
                    androidx.work.l.e().a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", this.f35432b));
                }
            }
        }
    }

    public a0(androidx.work.s sVar) {
        this.f35427a = sVar;
    }

    public void a(o1.m mVar, long j10, a aVar) {
        synchronized (this.f35430d) {
            androidx.work.l e10 = androidx.work.l.e();
            String str = f35426e;
            e10.a(str, "Starting timer for " + mVar);
            b(mVar);
            b bVar = new b(this, mVar);
            this.f35428b.put(mVar, bVar);
            this.f35429c.put(mVar, aVar);
            this.f35427a.b(j10, bVar);
        }
    }

    public void b(o1.m mVar) {
        synchronized (this.f35430d) {
            if (this.f35428b.remove(mVar) != null) {
                androidx.work.l e10 = androidx.work.l.e();
                String str = f35426e;
                e10.a(str, "Stopping timer for " + mVar);
                this.f35429c.remove(mVar);
            }
        }
    }
}
