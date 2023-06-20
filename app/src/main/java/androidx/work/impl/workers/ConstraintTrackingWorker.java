package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.impl.e0;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import androidx.work.k;
import androidx.work.l;
import java.util.List;
import l1.c;
import l1.e;
import n1.o;
import o1.u;
import o1.v;

/* compiled from: ConstraintTrackingWorker.kt */
/* loaded from: classes.dex */
public final class ConstraintTrackingWorker extends k implements c {

    /* renamed from: a */
    private final WorkerParameters f4695a;

    /* renamed from: b */
    private final Object f4696b;

    /* renamed from: c */
    private volatile boolean f4697c;

    /* renamed from: d */
    private final androidx.work.impl.utils.futures.c<k.a> f4698d;

    /* renamed from: e */
    private k f4699e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        qe.k.f(context, "appContext");
        qe.k.f(workerParameters, "workerParameters");
        this.f4695a = workerParameters;
        this.f4696b = new Object();
        this.f4698d = androidx.work.impl.utils.futures.c.t();
    }

    public static /* synthetic */ void a(ConstraintTrackingWorker constraintTrackingWorker, com.google.common.util.concurrent.c cVar) {
        e(constraintTrackingWorker, cVar);
    }

    public static /* synthetic */ void c(ConstraintTrackingWorker constraintTrackingWorker) {
        g(constraintTrackingWorker);
    }

    private final void d() {
        List d10;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        if (this.f4698d.isCancelled()) {
            return;
        }
        String j10 = getInputData().j("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        l e10 = l.e();
        qe.k.e(e10, "get()");
        if (j10 == null || j10.length() == 0) {
            str6 = r1.c.f36122a;
            e10.c(str6, "No worker to delegate to.");
            androidx.work.impl.utils.futures.c<k.a> cVar = this.f4698d;
            qe.k.e(cVar, "future");
            r1.c.d(cVar);
            return;
        }
        k b10 = getWorkerFactory().b(getApplicationContext(), j10, this.f4695a);
        this.f4699e = b10;
        if (b10 == null) {
            str5 = r1.c.f36122a;
            e10.a(str5, "No worker to delegate to.");
            androidx.work.impl.utils.futures.c<k.a> cVar2 = this.f4698d;
            qe.k.e(cVar2, "future");
            r1.c.d(cVar2);
            return;
        }
        e0 n10 = e0.n(getApplicationContext());
        qe.k.e(n10, "getInstance(applicationContext)");
        v h10 = n10.s().h();
        String uuid = getId().toString();
        qe.k.e(uuid, "id.toString()");
        u h11 = h10.h(uuid);
        if (h11 == null) {
            androidx.work.impl.utils.futures.c<k.a> cVar3 = this.f4698d;
            qe.k.e(cVar3, "future");
            r1.c.d(cVar3);
            return;
        }
        o r10 = n10.r();
        qe.k.e(r10, "workManagerImpl.trackers");
        e eVar = new e(r10, this);
        d10 = fe.o.d(h11);
        eVar.a(d10);
        String uuid2 = getId().toString();
        qe.k.e(uuid2, "id.toString()");
        if (eVar.d(uuid2)) {
            str2 = r1.c.f36122a;
            e10.a(str2, "Constraints met for delegate " + j10);
            try {
                k kVar = this.f4699e;
                qe.k.c(kVar);
                final com.google.common.util.concurrent.c<k.a> startWork = kVar.startWork();
                qe.k.e(startWork, "delegate!!.startWork()");
                startWork.a(new Runnable() { // from class: r1.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        ConstraintTrackingWorker.a(ConstraintTrackingWorker.this, startWork);
                    }
                }, getBackgroundExecutor());
                return;
            } catch (Throwable th) {
                str3 = r1.c.f36122a;
                e10.b(str3, "Delegated worker " + j10 + " threw exception in startWork.", th);
                synchronized (this.f4696b) {
                    if (this.f4697c) {
                        str4 = r1.c.f36122a;
                        e10.a(str4, "Constraints were unmet, Retrying.");
                        androidx.work.impl.utils.futures.c<k.a> cVar4 = this.f4698d;
                        qe.k.e(cVar4, "future");
                        r1.c.e(cVar4);
                        return;
                    }
                    androidx.work.impl.utils.futures.c<k.a> cVar5 = this.f4698d;
                    qe.k.e(cVar5, "future");
                    r1.c.d(cVar5);
                    return;
                }
            }
        }
        str = r1.c.f36122a;
        e10.a(str, "Constraints not met for delegate " + j10 + ". Requesting retry.");
        androidx.work.impl.utils.futures.c<k.a> cVar6 = this.f4698d;
        qe.k.e(cVar6, "future");
        r1.c.e(cVar6);
    }

    public static final void e(ConstraintTrackingWorker constraintTrackingWorker, com.google.common.util.concurrent.c cVar) {
        qe.k.f(constraintTrackingWorker, "this$0");
        qe.k.f(cVar, "$innerFuture");
        synchronized (constraintTrackingWorker.f4696b) {
            if (constraintTrackingWorker.f4697c) {
                androidx.work.impl.utils.futures.c<k.a> cVar2 = constraintTrackingWorker.f4698d;
                qe.k.e(cVar2, "future");
                r1.c.e(cVar2);
            } else {
                constraintTrackingWorker.f4698d.r(cVar);
            }
            ee.u uVar = ee.u.f29813a;
        }
    }

    public static final void g(ConstraintTrackingWorker constraintTrackingWorker) {
        qe.k.f(constraintTrackingWorker, "this$0");
        constraintTrackingWorker.d();
    }

    @Override // l1.c
    public void b(List<u> list) {
        String str;
        qe.k.f(list, "workSpecs");
        l e10 = l.e();
        str = r1.c.f36122a;
        e10.a(str, "Constraints changed for " + list);
        synchronized (this.f4696b) {
            this.f4697c = true;
            ee.u uVar = ee.u.f29813a;
        }
    }

    @Override // l1.c
    public void f(List<u> list) {
        qe.k.f(list, "workSpecs");
    }

    @Override // androidx.work.k
    public void onStopped() {
        super.onStopped();
        k kVar = this.f4699e;
        if (kVar == null || kVar.isStopped()) {
            return;
        }
        kVar.stop();
    }

    @Override // androidx.work.k
    public com.google.common.util.concurrent.c<k.a> startWork() {
        getBackgroundExecutor().execute(new Runnable() { // from class: r1.a
            @Override // java.lang.Runnable
            public final void run() {
                ConstraintTrackingWorker.c(ConstraintTrackingWorker.this);
            }
        });
        androidx.work.impl.utils.futures.c<k.a> cVar = this.f4698d;
        qe.k.e(cVar, "future");
        return cVar;
    }
}
