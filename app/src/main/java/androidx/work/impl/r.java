package androidx.work.impl;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.WorkerParameters;
import androidx.work.impl.h0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* compiled from: Processor.java */
/* loaded from: classes.dex */
public class r implements e, androidx.work.impl.foreground.a {

    /* renamed from: m */
    private static final String f4638m = androidx.work.l.i("Processor");

    /* renamed from: b */
    private Context f4640b;

    /* renamed from: c */
    private androidx.work.b f4641c;

    /* renamed from: d */
    private q1.c f4642d;

    /* renamed from: e */
    private WorkDatabase f4643e;

    /* renamed from: i */
    private List<t> f4647i;

    /* renamed from: g */
    private Map<String, h0> f4645g = new HashMap();

    /* renamed from: f */
    private Map<String, h0> f4644f = new HashMap();

    /* renamed from: j */
    private Set<String> f4648j = new HashSet();

    /* renamed from: k */
    private final List<e> f4649k = new ArrayList();

    /* renamed from: a */
    private PowerManager.WakeLock f4639a = null;

    /* renamed from: l */
    private final Object f4650l = new Object();

    /* renamed from: h */
    private Map<String, Set<v>> f4646h = new HashMap();

    /* compiled from: Processor.java */
    /* loaded from: classes.dex */
    public static class a implements Runnable {

        /* renamed from: a */
        private e f4651a;

        /* renamed from: b */
        private final o1.m f4652b;

        /* renamed from: c */
        private com.google.common.util.concurrent.c<Boolean> f4653c;

        a(e eVar, o1.m mVar, com.google.common.util.concurrent.c<Boolean> cVar) {
            this.f4651a = eVar;
            this.f4652b = mVar;
            this.f4653c = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z10;
            try {
                z10 = this.f4653c.get().booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                z10 = true;
            }
            this.f4651a.d(this.f4652b, z10);
        }
    }

    public r(Context context, androidx.work.b bVar, q1.c cVar, WorkDatabase workDatabase, List<t> list) {
        this.f4640b = context;
        this.f4641c = bVar;
        this.f4642d = cVar;
        this.f4643e = workDatabase;
        this.f4647i = list;
    }

    public static /* synthetic */ void e(r rVar, o1.m mVar, boolean z10) {
        rVar.l(mVar, z10);
    }

    public static /* synthetic */ o1.u f(r rVar, ArrayList arrayList, String str) {
        return rVar.m(arrayList, str);
    }

    private static boolean i(String str, h0 h0Var) {
        if (h0Var != null) {
            h0Var.g();
            androidx.work.l e10 = androidx.work.l.e();
            String str2 = f4638m;
            e10.a(str2, "WorkerWrapper interrupted for " + str);
            return true;
        }
        androidx.work.l e11 = androidx.work.l.e();
        String str3 = f4638m;
        e11.a(str3, "WorkerWrapper could not be found for " + str);
        return false;
    }

    public /* synthetic */ o1.u m(ArrayList arrayList, String str) throws Exception {
        arrayList.addAll(this.f4643e.i().b(str));
        return this.f4643e.h().h(str);
    }

    private void o(final o1.m mVar, final boolean z10) {
        this.f4642d.a().execute(new Runnable() { // from class: androidx.work.impl.p
            @Override // java.lang.Runnable
            public final void run() {
                r.e(r.this, mVar, z10);
            }
        });
    }

    private void s() {
        synchronized (this.f4650l) {
            if (!(!this.f4644f.isEmpty())) {
                this.f4640b.startService(androidx.work.impl.foreground.b.g(this.f4640b));
                PowerManager.WakeLock wakeLock = this.f4639a;
                if (wakeLock != null) {
                    wakeLock.release();
                    this.f4639a = null;
                }
            }
        }
    }

    @Override // androidx.work.impl.foreground.a
    public void a(String str) {
        synchronized (this.f4650l) {
            this.f4644f.remove(str);
            s();
        }
    }

    @Override // androidx.work.impl.foreground.a
    public boolean b(String str) {
        boolean containsKey;
        synchronized (this.f4650l) {
            containsKey = this.f4644f.containsKey(str);
        }
        return containsKey;
    }

    @Override // androidx.work.impl.foreground.a
    public void c(String str, androidx.work.g gVar) {
        synchronized (this.f4650l) {
            androidx.work.l e10 = androidx.work.l.e();
            String str2 = f4638m;
            e10.f(str2, "Moving WorkSpec (" + str + ") to the foreground");
            h0 remove = this.f4645g.remove(str);
            if (remove != null) {
                if (this.f4639a == null) {
                    PowerManager.WakeLock b10 = p1.u.b(this.f4640b, "ProcessorForegroundLck");
                    this.f4639a = b10;
                    b10.acquire();
                }
                this.f4644f.put(str, remove);
                androidx.core.content.b.l(this.f4640b, androidx.work.impl.foreground.b.e(this.f4640b, remove.d(), gVar));
            }
        }
    }

    @Override // androidx.work.impl.e
    /* renamed from: d */
    public void l(o1.m mVar, boolean z10) {
        synchronized (this.f4650l) {
            h0 h0Var = this.f4645g.get(mVar.b());
            if (h0Var != null && mVar.equals(h0Var.d())) {
                this.f4645g.remove(mVar.b());
            }
            androidx.work.l e10 = androidx.work.l.e();
            String str = f4638m;
            e10.a(str, r.class.getSimpleName() + " " + mVar.b() + " executed; reschedule = " + z10);
            for (e eVar : this.f4649k) {
                eVar.d(mVar, z10);
            }
        }
    }

    public void g(e eVar) {
        synchronized (this.f4650l) {
            this.f4649k.add(eVar);
        }
    }

    public o1.u h(String str) {
        synchronized (this.f4650l) {
            h0 h0Var = this.f4644f.get(str);
            if (h0Var == null) {
                h0Var = this.f4645g.get(str);
            }
            if (h0Var != null) {
                return h0Var.e();
            }
            return null;
        }
    }

    public boolean j(String str) {
        boolean contains;
        synchronized (this.f4650l) {
            contains = this.f4648j.contains(str);
        }
        return contains;
    }

    public boolean k(String str) {
        boolean z10;
        synchronized (this.f4650l) {
            z10 = this.f4645g.containsKey(str) || this.f4644f.containsKey(str);
        }
        return z10;
    }

    public void n(e eVar) {
        synchronized (this.f4650l) {
            this.f4649k.remove(eVar);
        }
    }

    public boolean p(v vVar) {
        return q(vVar, null);
    }

    public boolean q(v vVar, WorkerParameters.a aVar) {
        o1.m a10 = vVar.a();
        final String b10 = a10.b();
        final ArrayList arrayList = new ArrayList();
        o1.u uVar = (o1.u) this.f4643e.runInTransaction(new Callable() { // from class: androidx.work.impl.q
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return r.f(r.this, arrayList, b10);
            }
        });
        if (uVar == null) {
            androidx.work.l e10 = androidx.work.l.e();
            String str = f4638m;
            e10.k(str, "Didn't find WorkSpec for id " + a10);
            o(a10, false);
            return false;
        }
        synchronized (this.f4650l) {
            if (k(b10)) {
                Set<v> set = this.f4646h.get(b10);
                if (set.iterator().next().a().a() == a10.a()) {
                    set.add(vVar);
                    androidx.work.l e11 = androidx.work.l.e();
                    String str2 = f4638m;
                    e11.a(str2, "Work " + a10 + " is already enqueued for processing");
                } else {
                    o(a10, false);
                }
                return false;
            } else if (uVar.f() != a10.a()) {
                o(a10, false);
                return false;
            } else {
                h0 b11 = new h0.c(this.f4640b, this.f4641c, this.f4642d, this, this.f4643e, uVar, arrayList).d(this.f4647i).c(aVar).b();
                com.google.common.util.concurrent.c<Boolean> c10 = b11.c();
                c10.a(new a(this, vVar.a(), c10), this.f4642d.a());
                this.f4645g.put(b10, b11);
                HashSet hashSet = new HashSet();
                hashSet.add(vVar);
                this.f4646h.put(b10, hashSet);
                this.f4642d.b().execute(b11);
                androidx.work.l e12 = androidx.work.l.e();
                String str3 = f4638m;
                e12.a(str3, r.class.getSimpleName() + ": processing " + a10);
                return true;
            }
        }
    }

    public boolean r(String str) {
        h0 remove;
        boolean z10;
        synchronized (this.f4650l) {
            androidx.work.l e10 = androidx.work.l.e();
            String str2 = f4638m;
            e10.a(str2, "Processor cancelling " + str);
            this.f4648j.add(str);
            remove = this.f4644f.remove(str);
            z10 = remove != null;
            if (remove == null) {
                remove = this.f4645g.remove(str);
            }
            if (remove != null) {
                this.f4646h.remove(str);
            }
        }
        boolean i10 = i(str, remove);
        if (z10) {
            s();
        }
        return i10;
    }

    public boolean t(v vVar) {
        h0 remove;
        String b10 = vVar.a().b();
        synchronized (this.f4650l) {
            androidx.work.l e10 = androidx.work.l.e();
            String str = f4638m;
            e10.a(str, "Processor stopping foreground work " + b10);
            remove = this.f4644f.remove(b10);
            if (remove != null) {
                this.f4646h.remove(b10);
            }
        }
        return i(b10, remove);
    }

    public boolean u(v vVar) {
        String b10 = vVar.a().b();
        synchronized (this.f4650l) {
            h0 remove = this.f4645g.remove(b10);
            if (remove == null) {
                androidx.work.l e10 = androidx.work.l.e();
                String str = f4638m;
                e10.a(str, "WorkerWrapper could not be found for " + b10);
                return false;
            }
            Set<v> set = this.f4646h.get(b10);
            if (set != null && set.contains(vVar)) {
                androidx.work.l e11 = androidx.work.l.e();
                String str2 = f4638m;
                e11.a(str2, "Processor stopping background work " + b10);
                this.f4646h.remove(b10);
                return i(b10, remove);
            }
            return false;
        }
    }
}
