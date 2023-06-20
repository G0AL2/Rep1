package com.google.firebase.installations;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.d;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import qc.j;
import wc.d;
import wc.f;

/* compiled from: FirebaseInstallations.java */
/* loaded from: classes3.dex */
public class c implements tc.d {

    /* renamed from: m */
    private static final Object f23386m = new Object();

    /* renamed from: n */
    private static final ThreadFactory f23387n = new a();

    /* renamed from: a */
    private final ob.e f23388a;

    /* renamed from: b */
    private final wc.c f23389b;

    /* renamed from: c */
    private final vc.c f23390c;

    /* renamed from: d */
    private final i f23391d;

    /* renamed from: e */
    private final vc.b f23392e;

    /* renamed from: f */
    private final tc.f f23393f;

    /* renamed from: g */
    private final Object f23394g;

    /* renamed from: h */
    private final ExecutorService f23395h;

    /* renamed from: i */
    private final ExecutorService f23396i;

    /* renamed from: j */
    private String f23397j;

    /* renamed from: k */
    private Set<uc.a> f23398k;

    /* renamed from: l */
    private final List<h> f23399l;

    /* compiled from: FirebaseInstallations.java */
    /* loaded from: classes3.dex */
    class a implements ThreadFactory {

        /* renamed from: a */
        private final AtomicInteger f23400a = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.f23400a.getAndIncrement())));
        }
    }

    /* compiled from: FirebaseInstallations.java */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class b {

        /* renamed from: a */
        static final /* synthetic */ int[] f23401a;

        /* renamed from: b */
        static final /* synthetic */ int[] f23402b;

        static {
            int[] iArr = new int[f.b.values().length];
            f23402b = iArr;
            try {
                iArr[f.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23402b[f.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23402b[f.b.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[d.b.values().length];
            f23401a = iArr2;
            try {
                iArr2[d.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23401a[d.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public c(ob.e eVar, sc.b<j> bVar) {
        this(new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), f23387n), eVar, new wc.c(eVar.l(), bVar), new vc.c(eVar), i.c(), new vc.b(eVar), new tc.f());
    }

    private void A(vc.d dVar) {
        synchronized (this.f23394g) {
            Iterator<h> it = this.f23399l.iterator();
            while (it.hasNext()) {
                if (it.next().b(dVar)) {
                    it.remove();
                }
            }
        }
    }

    private synchronized void B(String str) {
        this.f23397j = str;
    }

    private synchronized void C(vc.d dVar, vc.d dVar2) {
        if (this.f23398k.size() != 0 && !dVar.d().equals(dVar2.d())) {
            for (uc.a aVar : this.f23398k) {
                aVar.a(dVar2.d());
            }
        }
    }

    public static /* synthetic */ void b(c cVar, boolean z10) {
        cVar.t(z10);
    }

    public static /* synthetic */ void c(c cVar) {
        cVar.u();
    }

    public static /* synthetic */ void d(c cVar, boolean z10) {
        cVar.v(z10);
    }

    private Task<g> e() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        g(new e(this.f23391d, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private Task<String> f() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        g(new f(taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private void g(h hVar) {
        synchronized (this.f23394g) {
            this.f23399l.add(hVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x004a  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void t(boolean r3) {
        /*
            r2 = this;
            vc.d r0 = r2.p()
            boolean r1 = r0.i()     // Catch: com.google.firebase.installations.d -> L5f
            if (r1 != 0) goto L22
            boolean r1 = r0.l()     // Catch: com.google.firebase.installations.d -> L5f
            if (r1 == 0) goto L11
            goto L22
        L11:
            if (r3 != 0) goto L1d
            com.google.firebase.installations.i r3 = r2.f23391d     // Catch: com.google.firebase.installations.d -> L5f
            boolean r3 = r3.f(r0)     // Catch: com.google.firebase.installations.d -> L5f
            if (r3 == 0) goto L1c
            goto L1d
        L1c:
            return
        L1d:
            vc.d r3 = r2.j(r0)     // Catch: com.google.firebase.installations.d -> L5f
            goto L26
        L22:
            vc.d r3 = r2.y(r0)     // Catch: com.google.firebase.installations.d -> L5f
        L26:
            r2.s(r3)
            r2.C(r0, r3)
            boolean r0 = r3.k()
            if (r0 == 0) goto L39
            java.lang.String r0 = r3.d()
            r2.B(r0)
        L39:
            boolean r0 = r3.i()
            if (r0 == 0) goto L4a
            com.google.firebase.installations.d r3 = new com.google.firebase.installations.d
            com.google.firebase.installations.d$a r0 = com.google.firebase.installations.d.a.BAD_CONFIG
            r3.<init>(r0)
            r2.z(r3)
            goto L5e
        L4a:
            boolean r0 = r3.j()
            if (r0 == 0) goto L5b
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r0 = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."
            r3.<init>(r0)
            r2.z(r3)
            goto L5e
        L5b:
            r2.A(r3)
        L5e:
            return
        L5f:
            r3 = move-exception
            r2.z(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.c.t(boolean):void");
    }

    /* renamed from: i */
    public final void v(final boolean z10) {
        vc.d q10 = q();
        if (z10) {
            q10 = q10.p();
        }
        A(q10);
        this.f23396i.execute(new Runnable() { // from class: tc.b
            @Override // java.lang.Runnable
            public final void run() {
                com.google.firebase.installations.c.b(com.google.firebase.installations.c.this, z10);
            }
        });
    }

    private vc.d j(vc.d dVar) throws d {
        wc.f e10 = this.f23389b.e(k(), dVar.d(), r(), dVar.f());
        int i10 = b.f23402b[e10.b().ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    B(null);
                    return dVar.r();
                }
                throw new d("Firebase Installations Service is unavailable. Please try again later.", d.a.UNAVAILABLE);
            }
            return dVar.q("BAD CONFIG");
        }
        return dVar.o(e10.c(), e10.d(), this.f23391d.b());
    }

    private synchronized String m() {
        return this.f23397j;
    }

    public static c n() {
        return o(ob.e.n());
    }

    public static c o(ob.e eVar) {
        Preconditions.checkArgument(eVar != null, "Null is not a valid value of FirebaseApp.");
        return (c) eVar.j(tc.d.class);
    }

    private vc.d p() {
        vc.d d10;
        synchronized (f23386m) {
            com.google.firebase.installations.b a10 = com.google.firebase.installations.b.a(this.f23388a.l(), "generatefid.lock");
            d10 = this.f23390c.d();
            if (a10 != null) {
                a10.b();
            }
        }
        return d10;
    }

    private vc.d q() {
        vc.d d10;
        synchronized (f23386m) {
            com.google.firebase.installations.b a10 = com.google.firebase.installations.b.a(this.f23388a.l(), "generatefid.lock");
            d10 = this.f23390c.d();
            if (d10.j()) {
                d10 = this.f23390c.b(d10.t(x(d10)));
            }
            if (a10 != null) {
                a10.b();
            }
        }
        return d10;
    }

    private void s(vc.d dVar) {
        synchronized (f23386m) {
            com.google.firebase.installations.b a10 = com.google.firebase.installations.b.a(this.f23388a.l(), "generatefid.lock");
            this.f23390c.b(dVar);
            if (a10 != null) {
                a10.b();
            }
        }
    }

    public /* synthetic */ void u() {
        v(false);
    }

    private void w() {
        Preconditions.checkNotEmpty(l(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkNotEmpty(r(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkNotEmpty(k(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkArgument(i.h(l()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkArgument(i.g(k()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    private String x(vc.d dVar) {
        if ((!this.f23388a.p().equals("CHIME_ANDROID_SDK") && !this.f23388a.x()) || !dVar.m()) {
            return this.f23393f.a();
        }
        String f10 = this.f23392e.f();
        return TextUtils.isEmpty(f10) ? this.f23393f.a() : f10;
    }

    private vc.d y(vc.d dVar) throws d {
        wc.d d10 = this.f23389b.d(k(), dVar.d(), r(), l(), (dVar.d() == null || dVar.d().length() != 11) ? null : this.f23392e.i());
        int i10 = b.f23401a[d10.e().ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return dVar.q("BAD CONFIG");
            }
            throw new d("Firebase Installations Service is unavailable. Please try again later.", d.a.UNAVAILABLE);
        }
        return dVar.s(d10.c(), d10.d(), this.f23391d.b(), d10.b().c(), d10.b().d());
    }

    private void z(Exception exc) {
        synchronized (this.f23394g) {
            Iterator<h> it = this.f23399l.iterator();
            while (it.hasNext()) {
                if (it.next().a(exc)) {
                    it.remove();
                }
            }
        }
    }

    @Override // tc.d
    public Task<g> a(final boolean z10) {
        w();
        Task<g> e10 = e();
        this.f23395h.execute(new Runnable() { // from class: tc.c
            @Override // java.lang.Runnable
            public final void run() {
                com.google.firebase.installations.c.d(com.google.firebase.installations.c.this, z10);
            }
        });
        return e10;
    }

    @Override // tc.d
    public Task<String> getId() {
        w();
        String m10 = m();
        if (m10 != null) {
            return Tasks.forResult(m10);
        }
        Task<String> f10 = f();
        this.f23395h.execute(new Runnable() { // from class: tc.a
            @Override // java.lang.Runnable
            public final void run() {
                com.google.firebase.installations.c.c(com.google.firebase.installations.c.this);
            }
        });
        return f10;
    }

    String k() {
        return this.f23388a.q().b();
    }

    String l() {
        return this.f23388a.q().c();
    }

    String r() {
        return this.f23388a.q().g();
    }

    c(ExecutorService executorService, ob.e eVar, wc.c cVar, vc.c cVar2, i iVar, vc.b bVar, tc.f fVar) {
        this.f23394g = new Object();
        this.f23398k = new HashSet();
        this.f23399l = new ArrayList();
        this.f23388a = eVar;
        this.f23389b = cVar;
        this.f23390c = cVar2;
        this.f23391d = iVar;
        this.f23392e = bVar;
        this.f23393f = fVar;
        this.f23395h = executorService;
        this.f23396i = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), f23387n);
    }
}
