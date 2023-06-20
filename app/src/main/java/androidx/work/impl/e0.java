package androidx.work.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import androidx.lifecycle.LiveData;
import androidx.work.WorkerParameters;
import androidx.work.b;
import androidx.work.impl.utils.ForceStopRunnable;
import androidx.work.l;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/* compiled from: WorkManagerImpl.java */
/* loaded from: classes.dex */
public class e0 extends androidx.work.v {

    /* renamed from: k  reason: collision with root package name */
    private static e0 f4545k;

    /* renamed from: l  reason: collision with root package name */
    private static e0 f4546l;

    /* renamed from: m  reason: collision with root package name */
    private static final Object f4547m;

    /* renamed from: a  reason: collision with root package name */
    private Context f4548a;

    /* renamed from: b  reason: collision with root package name */
    private androidx.work.b f4549b;

    /* renamed from: c  reason: collision with root package name */
    private WorkDatabase f4550c;

    /* renamed from: d  reason: collision with root package name */
    private q1.c f4551d;

    /* renamed from: e  reason: collision with root package name */
    private List<t> f4552e;

    /* renamed from: f  reason: collision with root package name */
    private r f4553f;

    /* renamed from: g  reason: collision with root package name */
    private p1.n f4554g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f4555h;

    /* renamed from: i  reason: collision with root package name */
    private BroadcastReceiver.PendingResult f4556i;

    /* renamed from: j  reason: collision with root package name */
    private final n1.o f4557j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WorkManagerImpl.java */
    /* loaded from: classes.dex */
    public static class a {
        static boolean a(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    static {
        androidx.work.l.i("WorkManagerImpl");
        f4545k = null;
        f4546l = null;
        f4547m = new Object();
    }

    public e0(Context context, androidx.work.b bVar, q1.c cVar) {
        this(context, bVar, cVar, context.getResources().getBoolean(androidx.work.r.f4732a));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0016, code lost:
        r4 = r4.getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001c, code lost:
        if (androidx.work.impl.e0.f4546l != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
        androidx.work.impl.e0.f4546l = new androidx.work.impl.e0(r4, r5, new q1.d(r5.m()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
        androidx.work.impl.e0.f4545k = androidx.work.impl.e0.f4546l;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void i(android.content.Context r4, androidx.work.b r5) {
        /*
            java.lang.Object r0 = androidx.work.impl.e0.f4547m
            monitor-enter(r0)
            androidx.work.impl.e0 r1 = androidx.work.impl.e0.f4545k     // Catch: java.lang.Throwable -> L34
            if (r1 == 0) goto L14
            androidx.work.impl.e0 r2 = androidx.work.impl.e0.f4546l     // Catch: java.lang.Throwable -> L34
            if (r2 != 0) goto Lc
            goto L14
        Lc:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L34
            java.lang.String r5 = "WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information."
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L34
            throw r4     // Catch: java.lang.Throwable -> L34
        L14:
            if (r1 != 0) goto L32
            android.content.Context r4 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L34
            androidx.work.impl.e0 r1 = androidx.work.impl.e0.f4546l     // Catch: java.lang.Throwable -> L34
            if (r1 != 0) goto L2e
            androidx.work.impl.e0 r1 = new androidx.work.impl.e0     // Catch: java.lang.Throwable -> L34
            q1.d r2 = new q1.d     // Catch: java.lang.Throwable -> L34
            java.util.concurrent.Executor r3 = r5.m()     // Catch: java.lang.Throwable -> L34
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L34
            r1.<init>(r4, r5, r2)     // Catch: java.lang.Throwable -> L34
            androidx.work.impl.e0.f4546l = r1     // Catch: java.lang.Throwable -> L34
        L2e:
            androidx.work.impl.e0 r4 = androidx.work.impl.e0.f4546l     // Catch: java.lang.Throwable -> L34
            androidx.work.impl.e0.f4545k = r4     // Catch: java.lang.Throwable -> L34
        L32:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            return
        L34:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.e0.i(android.content.Context, androidx.work.b):void");
    }

    @Deprecated
    public static e0 m() {
        synchronized (f4547m) {
            e0 e0Var = f4545k;
            if (e0Var != null) {
                return e0Var;
            }
            return f4546l;
        }
    }

    public static e0 n(Context context) {
        e0 m10;
        synchronized (f4547m) {
            m10 = m();
            if (m10 == null) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext instanceof b.c) {
                    i(applicationContext, ((b.c) applicationContext).getWorkManagerConfiguration());
                    m10 = n(applicationContext);
                } else {
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
            }
        }
        return m10;
    }

    private void u(Context context, androidx.work.b bVar, q1.c cVar, WorkDatabase workDatabase, List<t> list, r rVar) {
        Context applicationContext = context.getApplicationContext();
        this.f4548a = applicationContext;
        this.f4549b = bVar;
        this.f4551d = cVar;
        this.f4550c = workDatabase;
        this.f4552e = list;
        this.f4553f = rVar;
        this.f4554g = new p1.n(workDatabase);
        this.f4555h = false;
        if (Build.VERSION.SDK_INT >= 24 && a.a(applicationContext)) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        this.f4551d.c(new ForceStopRunnable(applicationContext, this));
    }

    public void A(o1.m mVar) {
        this.f4551d.c(new p1.s(this, new v(mVar), true));
    }

    public void B(v vVar) {
        this.f4551d.c(new p1.s(this, vVar, false));
    }

    @Override // androidx.work.v
    public androidx.work.o a(String str) {
        p1.b d10 = p1.b.d(str, this);
        this.f4551d.c(d10);
        return d10.e();
    }

    @Override // androidx.work.v
    public androidx.work.o b(UUID uuid) {
        p1.b b10 = p1.b.b(uuid, this);
        this.f4551d.c(b10);
        return b10.e();
    }

    @Override // androidx.work.v
    public androidx.work.o d(List<? extends androidx.work.x> list) {
        if (!list.isEmpty()) {
            return new x(this, list).a();
        }
        throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
    }

    @Override // androidx.work.v
    public androidx.work.o f(String str, androidx.work.f fVar, List<androidx.work.n> list) {
        return new x(this, str, fVar, list).a();
    }

    @Override // androidx.work.v
    public LiveData<List<androidx.work.u>> h(androidx.work.w wVar) {
        return p1.i.a(this.f4550c.d().a(p1.p.b(wVar)), o1.u.f34904u, this.f4551d);
    }

    public List<t> j(Context context, androidx.work.b bVar, n1.o oVar) {
        return Arrays.asList(u.a(context, this), new k1.b(context, bVar, oVar, this));
    }

    public Context k() {
        return this.f4548a;
    }

    public androidx.work.b l() {
        return this.f4549b;
    }

    public p1.n o() {
        return this.f4554g;
    }

    public r p() {
        return this.f4553f;
    }

    public List<t> q() {
        return this.f4552e;
    }

    public n1.o r() {
        return this.f4557j;
    }

    public WorkDatabase s() {
        return this.f4550c;
    }

    public q1.c t() {
        return this.f4551d;
    }

    public void v() {
        synchronized (f4547m) {
            this.f4555h = true;
            BroadcastReceiver.PendingResult pendingResult = this.f4556i;
            if (pendingResult != null) {
                pendingResult.finish();
                this.f4556i = null;
            }
        }
    }

    public void w() {
        if (Build.VERSION.SDK_INT >= 23) {
            androidx.work.impl.background.systemjob.b.b(k());
        }
        s().h().m();
        u.b(l(), s(), q());
    }

    public void x(BroadcastReceiver.PendingResult pendingResult) {
        synchronized (f4547m) {
            this.f4556i = pendingResult;
            if (this.f4555h) {
                pendingResult.finish();
                this.f4556i = null;
            }
        }
    }

    public void y(v vVar) {
        z(vVar, null);
    }

    public void z(v vVar, WorkerParameters.a aVar) {
        this.f4551d.c(new p1.r(this, vVar, aVar));
    }

    public e0(Context context, androidx.work.b bVar, q1.c cVar, boolean z10) {
        this(context, bVar, cVar, WorkDatabase.a(context.getApplicationContext(), cVar.b(), z10));
    }

    public e0(Context context, androidx.work.b bVar, q1.c cVar, WorkDatabase workDatabase) {
        Context applicationContext = context.getApplicationContext();
        androidx.work.l.h(new l.a(bVar.j()));
        n1.o oVar = new n1.o(applicationContext, cVar);
        this.f4557j = oVar;
        List<t> j10 = j(applicationContext, bVar, oVar);
        u(context, bVar, cVar, workDatabase, j10, new r(context, bVar, cVar, workDatabase, j10));
    }
}
