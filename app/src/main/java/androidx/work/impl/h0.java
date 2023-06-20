package androidx.work.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.k;
import androidx.work.u;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: WorkerWrapper.java */
/* loaded from: classes.dex */
public class h0 implements Runnable {

    /* renamed from: s */
    static final String f4591s = androidx.work.l.i("WorkerWrapper");

    /* renamed from: a */
    Context f4592a;

    /* renamed from: b */
    private final String f4593b;

    /* renamed from: c */
    private List<t> f4594c;

    /* renamed from: d */
    private WorkerParameters.a f4595d;

    /* renamed from: e */
    o1.u f4596e;

    /* renamed from: f */
    androidx.work.k f4597f;

    /* renamed from: g */
    q1.c f4598g;

    /* renamed from: i */
    private androidx.work.b f4600i;

    /* renamed from: j */
    private androidx.work.impl.foreground.a f4601j;

    /* renamed from: k */
    private WorkDatabase f4602k;

    /* renamed from: l */
    private o1.v f4603l;

    /* renamed from: m */
    private o1.b f4604m;

    /* renamed from: n */
    private List<String> f4605n;

    /* renamed from: o */
    private String f4606o;

    /* renamed from: r */
    private volatile boolean f4609r;

    /* renamed from: h */
    k.a f4599h = k.a.a();

    /* renamed from: p */
    androidx.work.impl.utils.futures.c<Boolean> f4607p = androidx.work.impl.utils.futures.c.t();

    /* renamed from: q */
    final androidx.work.impl.utils.futures.c<k.a> f4608q = androidx.work.impl.utils.futures.c.t();

    /* compiled from: WorkerWrapper.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ com.google.common.util.concurrent.c f4610a;

        a(com.google.common.util.concurrent.c cVar) {
            h0.this = r1;
            this.f4610a = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (h0.this.f4608q.isCancelled()) {
                return;
            }
            try {
                this.f4610a.get();
                androidx.work.l e10 = androidx.work.l.e();
                String str = h0.f4591s;
                e10.a(str, "Starting work for " + h0.this.f4596e.f34907c);
                h0 h0Var = h0.this;
                h0Var.f4608q.r(h0Var.f4597f.startWork());
            } catch (Throwable th) {
                h0.this.f4608q.q(th);
            }
        }
    }

    /* compiled from: WorkerWrapper.java */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f4612a;

        b(String str) {
            h0.this = r1;
            this.f4612a = str;
        }

        @Override // java.lang.Runnable
        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            try {
                try {
                    k.a aVar = h0.this.f4608q.get();
                    if (aVar == null) {
                        androidx.work.l e10 = androidx.work.l.e();
                        String str = h0.f4591s;
                        e10.c(str, h0.this.f4596e.f34907c + " returned a null result. Treating it as a failure.");
                    } else {
                        androidx.work.l e11 = androidx.work.l.e();
                        String str2 = h0.f4591s;
                        e11.a(str2, h0.this.f4596e.f34907c + " returned a " + aVar + ".");
                        h0.this.f4599h = aVar;
                    }
                } catch (InterruptedException e12) {
                    e = e12;
                    androidx.work.l e13 = androidx.work.l.e();
                    String str3 = h0.f4591s;
                    e13.d(str3, this.f4612a + " failed because it threw an exception/error", e);
                } catch (CancellationException e14) {
                    androidx.work.l e15 = androidx.work.l.e();
                    String str4 = h0.f4591s;
                    e15.g(str4, this.f4612a + " was cancelled", e14);
                } catch (ExecutionException e16) {
                    e = e16;
                    androidx.work.l e132 = androidx.work.l.e();
                    String str32 = h0.f4591s;
                    e132.d(str32, this.f4612a + " failed because it threw an exception/error", e);
                }
            } finally {
                h0.this.j();
            }
        }
    }

    /* compiled from: WorkerWrapper.java */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        Context f4614a;

        /* renamed from: b */
        androidx.work.k f4615b;

        /* renamed from: c */
        androidx.work.impl.foreground.a f4616c;

        /* renamed from: d */
        q1.c f4617d;

        /* renamed from: e */
        androidx.work.b f4618e;

        /* renamed from: f */
        WorkDatabase f4619f;

        /* renamed from: g */
        o1.u f4620g;

        /* renamed from: h */
        List<t> f4621h;

        /* renamed from: i */
        private final List<String> f4622i;

        /* renamed from: j */
        WorkerParameters.a f4623j = new WorkerParameters.a();

        public c(Context context, androidx.work.b bVar, q1.c cVar, androidx.work.impl.foreground.a aVar, WorkDatabase workDatabase, o1.u uVar, List<String> list) {
            this.f4614a = context.getApplicationContext();
            this.f4617d = cVar;
            this.f4616c = aVar;
            this.f4618e = bVar;
            this.f4619f = workDatabase;
            this.f4620g = uVar;
            this.f4622i = list;
        }

        public h0 b() {
            return new h0(this);
        }

        public c c(WorkerParameters.a aVar) {
            if (aVar != null) {
                this.f4623j = aVar;
            }
            return this;
        }

        public c d(List<t> list) {
            this.f4621h = list;
            return this;
        }
    }

    h0(c cVar) {
        this.f4592a = cVar.f4614a;
        this.f4598g = cVar.f4617d;
        this.f4601j = cVar.f4616c;
        o1.u uVar = cVar.f4620g;
        this.f4596e = uVar;
        this.f4593b = uVar.f34905a;
        this.f4594c = cVar.f4621h;
        this.f4595d = cVar.f4623j;
        this.f4597f = cVar.f4615b;
        this.f4600i = cVar.f4618e;
        WorkDatabase workDatabase = cVar.f4619f;
        this.f4602k = workDatabase;
        this.f4603l = workDatabase.h();
        this.f4604m = this.f4602k.b();
        this.f4605n = cVar.f4622i;
    }

    public static /* synthetic */ void a(h0 h0Var, com.google.common.util.concurrent.c cVar) {
        h0Var.i(cVar);
    }

    private String b(List<String> list) {
        StringBuilder sb2 = new StringBuilder("Work [ id=");
        sb2.append(this.f4593b);
        sb2.append(", tags={ ");
        boolean z10 = true;
        for (String str : list) {
            if (z10) {
                z10 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(str);
        }
        sb2.append(" } ]");
        return sb2.toString();
    }

    private void f(k.a aVar) {
        if (aVar instanceof k.a.c) {
            androidx.work.l e10 = androidx.work.l.e();
            String str = f4591s;
            e10.f(str, "Worker result SUCCESS for " + this.f4606o);
            if (this.f4596e.j()) {
                l();
            } else {
                q();
            }
        } else if (aVar instanceof k.a.b) {
            androidx.work.l e11 = androidx.work.l.e();
            String str2 = f4591s;
            e11.f(str2, "Worker result RETRY for " + this.f4606o);
            k();
        } else {
            androidx.work.l e12 = androidx.work.l.e();
            String str3 = f4591s;
            e12.f(str3, "Worker result FAILURE for " + this.f4606o);
            if (this.f4596e.j()) {
                l();
            } else {
                p();
            }
        }
    }

    private void h(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            if (this.f4603l.g(str2) != u.a.CANCELLED) {
                this.f4603l.q(u.a.FAILED, str2);
            }
            linkedList.addAll(this.f4604m.a(str2));
        }
    }

    public /* synthetic */ void i(com.google.common.util.concurrent.c cVar) {
        if (this.f4608q.isCancelled()) {
            cVar.cancel(true);
        }
    }

    private void k() {
        this.f4602k.beginTransaction();
        try {
            this.f4603l.q(u.a.ENQUEUED, this.f4593b);
            this.f4603l.i(this.f4593b, System.currentTimeMillis());
            this.f4603l.n(this.f4593b, -1L);
            this.f4602k.setTransactionSuccessful();
        } finally {
            this.f4602k.endTransaction();
            m(true);
        }
    }

    private void l() {
        this.f4602k.beginTransaction();
        try {
            this.f4603l.i(this.f4593b, System.currentTimeMillis());
            this.f4603l.q(u.a.ENQUEUED, this.f4593b);
            this.f4603l.u(this.f4593b);
            this.f4603l.b(this.f4593b);
            this.f4603l.n(this.f4593b, -1L);
            this.f4602k.setTransactionSuccessful();
        } finally {
            this.f4602k.endTransaction();
            m(false);
        }
    }

    private void m(boolean z10) {
        this.f4602k.beginTransaction();
        try {
            if (!this.f4602k.h().t()) {
                p1.m.a(this.f4592a, RescheduleReceiver.class, false);
            }
            if (z10) {
                this.f4603l.q(u.a.ENQUEUED, this.f4593b);
                this.f4603l.n(this.f4593b, -1L);
            }
            if (this.f4596e != null && this.f4597f != null && this.f4601j.b(this.f4593b)) {
                this.f4601j.a(this.f4593b);
            }
            this.f4602k.setTransactionSuccessful();
            this.f4602k.endTransaction();
            this.f4607p.p(Boolean.valueOf(z10));
        } catch (Throwable th) {
            this.f4602k.endTransaction();
            throw th;
        }
    }

    private void n() {
        u.a g10 = this.f4603l.g(this.f4593b);
        if (g10 == u.a.RUNNING) {
            androidx.work.l e10 = androidx.work.l.e();
            String str = f4591s;
            e10.a(str, "Status for " + this.f4593b + " is RUNNING; not doing any work and rescheduling for later execution");
            m(true);
            return;
        }
        androidx.work.l e11 = androidx.work.l.e();
        String str2 = f4591s;
        e11.a(str2, "Status for " + this.f4593b + " is " + g10 + " ; not doing any work");
        m(false);
    }

    private void o() {
        androidx.work.e b10;
        if (r()) {
            return;
        }
        this.f4602k.beginTransaction();
        try {
            o1.u uVar = this.f4596e;
            if (uVar.f34906b != u.a.ENQUEUED) {
                n();
                this.f4602k.setTransactionSuccessful();
                androidx.work.l e10 = androidx.work.l.e();
                String str = f4591s;
                e10.a(str, this.f4596e.f34907c + " is not in ENQUEUED state. Nothing more to do");
            } else if ((uVar.j() || this.f4596e.i()) && System.currentTimeMillis() < this.f4596e.c()) {
                androidx.work.l.e().a(f4591s, String.format("Delaying execution for %s because it is being executed before schedule.", this.f4596e.f34907c));
                m(true);
                this.f4602k.setTransactionSuccessful();
            } else {
                this.f4602k.setTransactionSuccessful();
                this.f4602k.endTransaction();
                if (this.f4596e.j()) {
                    b10 = this.f4596e.f34909e;
                } else {
                    androidx.work.i b11 = this.f4600i.f().b(this.f4596e.f34908d);
                    if (b11 == null) {
                        androidx.work.l e11 = androidx.work.l.e();
                        String str2 = f4591s;
                        e11.c(str2, "Could not create Input Merger " + this.f4596e.f34908d);
                        p();
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.f4596e.f34909e);
                    arrayList.addAll(this.f4603l.k(this.f4593b));
                    b10 = b11.b(arrayList);
                }
                androidx.work.e eVar = b10;
                UUID fromString = UUID.fromString(this.f4593b);
                List<String> list = this.f4605n;
                WorkerParameters.a aVar = this.f4595d;
                o1.u uVar2 = this.f4596e;
                WorkerParameters workerParameters = new WorkerParameters(fromString, eVar, list, aVar, uVar2.f34915k, uVar2.f(), this.f4600i.d(), this.f4598g, this.f4600i.n(), new p1.z(this.f4602k, this.f4598g), new p1.y(this.f4602k, this.f4601j, this.f4598g));
                if (this.f4597f == null) {
                    this.f4597f = this.f4600i.n().b(this.f4592a, this.f4596e.f34907c, workerParameters);
                }
                androidx.work.k kVar = this.f4597f;
                if (kVar == null) {
                    androidx.work.l e12 = androidx.work.l.e();
                    String str3 = f4591s;
                    e12.c(str3, "Could not create Worker " + this.f4596e.f34907c);
                    p();
                } else if (kVar.isUsed()) {
                    androidx.work.l e13 = androidx.work.l.e();
                    String str4 = f4591s;
                    e13.c(str4, "Received an already-used Worker " + this.f4596e.f34907c + "; Worker Factory should return new instances");
                    p();
                } else {
                    this.f4597f.setUsed();
                    if (s()) {
                        if (r()) {
                            return;
                        }
                        p1.x xVar = new p1.x(this.f4592a, this.f4596e, this.f4597f, workerParameters.b(), this.f4598g);
                        this.f4598g.a().execute(xVar);
                        final com.google.common.util.concurrent.c<Void> b12 = xVar.b();
                        this.f4608q.a(new Runnable() { // from class: androidx.work.impl.g0
                            @Override // java.lang.Runnable
                            public final void run() {
                                h0.a(h0.this, b12);
                            }
                        }, new p1.t());
                        b12.a(new a(b12), this.f4598g.a());
                        this.f4608q.a(new b(this.f4606o), this.f4598g.b());
                        return;
                    }
                    n();
                }
            }
        } finally {
            this.f4602k.endTransaction();
        }
    }

    private void q() {
        this.f4602k.beginTransaction();
        try {
            this.f4603l.q(u.a.SUCCEEDED, this.f4593b);
            this.f4603l.r(this.f4593b, ((k.a.c) this.f4599h).e());
            long currentTimeMillis = System.currentTimeMillis();
            for (String str : this.f4604m.a(this.f4593b)) {
                if (this.f4603l.g(str) == u.a.BLOCKED && this.f4604m.b(str)) {
                    androidx.work.l e10 = androidx.work.l.e();
                    String str2 = f4591s;
                    e10.f(str2, "Setting status to enqueued for " + str);
                    this.f4603l.q(u.a.ENQUEUED, str);
                    this.f4603l.i(str, currentTimeMillis);
                }
            }
            this.f4602k.setTransactionSuccessful();
        } finally {
            this.f4602k.endTransaction();
            m(false);
        }
    }

    private boolean r() {
        if (this.f4609r) {
            androidx.work.l e10 = androidx.work.l.e();
            String str = f4591s;
            e10.a(str, "Work interrupted for " + this.f4606o);
            u.a g10 = this.f4603l.g(this.f4593b);
            if (g10 == null) {
                m(false);
            } else {
                m(!g10.f());
            }
            return true;
        }
        return false;
    }

    private boolean s() {
        boolean z10;
        this.f4602k.beginTransaction();
        try {
            if (this.f4603l.g(this.f4593b) == u.a.ENQUEUED) {
                this.f4603l.q(u.a.RUNNING, this.f4593b);
                this.f4603l.v(this.f4593b);
                z10 = true;
            } else {
                z10 = false;
            }
            this.f4602k.setTransactionSuccessful();
            return z10;
        } finally {
            this.f4602k.endTransaction();
        }
    }

    public com.google.common.util.concurrent.c<Boolean> c() {
        return this.f4607p;
    }

    public o1.m d() {
        return o1.x.a(this.f4596e);
    }

    public o1.u e() {
        return this.f4596e;
    }

    public void g() {
        this.f4609r = true;
        r();
        this.f4608q.cancel(true);
        if (this.f4597f != null && this.f4608q.isCancelled()) {
            this.f4597f.stop();
            return;
        }
        androidx.work.l.e().a(f4591s, "WorkSpec " + this.f4596e + " is already done. Not interrupting.");
    }

    void j() {
        if (!r()) {
            this.f4602k.beginTransaction();
            try {
                u.a g10 = this.f4603l.g(this.f4593b);
                this.f4602k.g().a(this.f4593b);
                if (g10 == null) {
                    m(false);
                } else if (g10 == u.a.RUNNING) {
                    f(this.f4599h);
                } else if (!g10.f()) {
                    k();
                }
                this.f4602k.setTransactionSuccessful();
            } finally {
                this.f4602k.endTransaction();
            }
        }
        List<t> list = this.f4594c;
        if (list != null) {
            for (t tVar : list) {
                tVar.c(this.f4593b);
            }
            u.b(this.f4600i, this.f4602k, this.f4594c);
        }
    }

    void p() {
        this.f4602k.beginTransaction();
        try {
            h(this.f4593b);
            this.f4603l.r(this.f4593b, ((k.a.C0088a) this.f4599h).e());
            this.f4602k.setTransactionSuccessful();
        } finally {
            this.f4602k.endTransaction();
            m(false);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f4606o = b(this.f4605n);
        o();
    }
}
