package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.o0;
import com.google.firebase.messaging.t0;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import rc.a;

/* loaded from: classes3.dex */
public class FirebaseMessaging {

    /* renamed from: n */
    private static final long f23414n = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: o */
    private static t0 f23415o;
    @SuppressLint({"FirebaseUnknownNullness"})

    /* renamed from: p */
    static u7.g f23416p;

    /* renamed from: q */
    static ScheduledExecutorService f23417q;

    /* renamed from: a */
    private final ob.e f23418a;

    /* renamed from: b */
    private final rc.a f23419b;

    /* renamed from: c */
    private final tc.d f23420c;

    /* renamed from: d */
    private final Context f23421d;

    /* renamed from: e */
    private final b0 f23422e;

    /* renamed from: f */
    private final o0 f23423f;

    /* renamed from: g */
    private final a f23424g;

    /* renamed from: h */
    private final Executor f23425h;

    /* renamed from: i */
    private final Executor f23426i;

    /* renamed from: j */
    private final Task<y0> f23427j;

    /* renamed from: k */
    private final g0 f23428k;

    /* renamed from: l */
    private boolean f23429l;

    /* renamed from: m */
    private final Application.ActivityLifecycleCallbacks f23430m;

    /* loaded from: classes3.dex */
    public class a {

        /* renamed from: a */
        private final pc.d f23431a;

        /* renamed from: b */
        private boolean f23432b;

        /* renamed from: c */
        private pc.b<ob.a> f23433c;

        /* renamed from: d */
        private Boolean f23434d;

        a(pc.d dVar) {
            FirebaseMessaging.this = r1;
            this.f23431a = dVar;
        }

        public static /* synthetic */ void a(a aVar, pc.a aVar2) {
            aVar.d(aVar2);
        }

        public /* synthetic */ void d(pc.a aVar) {
            if (c()) {
                FirebaseMessaging.this.C();
            }
        }

        private Boolean e() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            Context l10 = FirebaseMessaging.this.f23418a.l();
            SharedPreferences sharedPreferences = l10.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = l10.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(l10.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        synchronized void b() {
            if (this.f23432b) {
                return;
            }
            Boolean e10 = e();
            this.f23434d = e10;
            if (e10 == null) {
                pc.b<ob.a> bVar = new pc.b() { // from class: com.google.firebase.messaging.y
                    @Override // pc.b
                    public final void a(pc.a aVar) {
                        FirebaseMessaging.a.a(FirebaseMessaging.a.this, aVar);
                    }
                };
                this.f23433c = bVar;
                this.f23431a.c(ob.a.class, bVar);
            }
            this.f23432b = true;
        }

        synchronized boolean c() {
            boolean w10;
            b();
            Boolean bool = this.f23434d;
            if (bool == null) {
                w10 = FirebaseMessaging.this.f23418a.w();
            } else {
                w10 = bool.booleanValue();
            }
            return w10;
        }
    }

    public FirebaseMessaging(ob.e eVar, rc.a aVar, sc.b<cd.i> bVar, sc.b<qc.k> bVar2, tc.d dVar, u7.g gVar, pc.d dVar2) {
        this(eVar, aVar, bVar, bVar2, dVar, gVar, dVar2, new g0(eVar.l()));
    }

    private synchronized void B() {
        if (!this.f23429l) {
            D(0L);
        }
    }

    public void C() {
        rc.a aVar = this.f23419b;
        if (aVar != null) {
            aVar.getToken();
        } else if (E(p())) {
            B();
        }
    }

    public static /* synthetic */ Task b(FirebaseMessaging firebaseMessaging, String str, t0.a aVar, String str2) {
        return firebaseMessaging.v(str, aVar, str2);
    }

    public static /* synthetic */ void c(FirebaseMessaging firebaseMessaging) {
        firebaseMessaging.z();
    }

    public static /* synthetic */ void e(FirebaseMessaging firebaseMessaging) {
        firebaseMessaging.x();
    }

    public static /* synthetic */ void f(FirebaseMessaging firebaseMessaging, TaskCompletionSource taskCompletionSource) {
        firebaseMessaging.w(taskCompletionSource);
    }

    @Keep
    static synchronized FirebaseMessaging getInstance(ob.e eVar) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) eVar.j(FirebaseMessaging.class);
            Preconditions.checkNotNull(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    public static synchronized FirebaseMessaging l() {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = getInstance(ob.e.n());
        }
        return firebaseMessaging;
    }

    private static synchronized t0 m(Context context) {
        t0 t0Var;
        synchronized (FirebaseMessaging.class) {
            if (f23415o == null) {
                f23415o = new t0(context);
            }
            t0Var = f23415o;
        }
        return t0Var;
    }

    private String n() {
        return "[DEFAULT]".equals(this.f23418a.p()) ? "" : this.f23418a.r();
    }

    public static u7.g q() {
        return f23416p;
    }

    private void r(String str) {
        if ("[DEFAULT]".equals(this.f23418a.p())) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Invoking onNewToken for app: " + this.f23418a.p());
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra(IronSourceConstants.IRONSOURCE_BIDDING_TOKEN_KEY, str);
            new n(this.f23421d).k(intent);
        }
    }

    public /* synthetic */ Task u(final String str, final t0.a aVar) {
        return this.f23422e.e().onSuccessTask(h.f23507a, new SuccessContinuation() { // from class: com.google.firebase.messaging.s
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return FirebaseMessaging.b(FirebaseMessaging.this, str, aVar, (String) obj);
            }
        });
    }

    public /* synthetic */ Task v(String str, t0.a aVar, String str2) throws Exception {
        m(this.f23421d).f(n(), str, str2, this.f23428k.a());
        if (aVar == null || !str2.equals(aVar.f23552a)) {
            r(str2);
        }
        return Tasks.forResult(str2);
    }

    public /* synthetic */ void w(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(i());
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    public /* synthetic */ void x() {
        if (s()) {
            C();
        }
    }

    public /* synthetic */ void y(y0 y0Var) {
        if (s()) {
            y0Var.o();
        }
    }

    public /* synthetic */ void z() {
        k0.c(this.f23421d);
    }

    public synchronized void A(boolean z10) {
        this.f23429l = z10;
    }

    public synchronized void D(long j10) {
        j(new u0(this, Math.min(Math.max(30L, 2 * j10), f23414n)), j10);
        this.f23429l = true;
    }

    boolean E(t0.a aVar) {
        return aVar == null || aVar.b(this.f23428k.a());
    }

    public String i() throws IOException {
        rc.a aVar = this.f23419b;
        if (aVar != null) {
            try {
                return (String) Tasks.await(aVar.b());
            } catch (InterruptedException | ExecutionException e10) {
                throw new IOException(e10);
            }
        }
        final t0.a p10 = p();
        if (!E(p10)) {
            return p10.f23552a;
        }
        final String c10 = g0.c(this.f23418a);
        try {
            return (String) Tasks.await(this.f23423f.b(c10, new o0.a() { // from class: com.google.firebase.messaging.t
                @Override // com.google.firebase.messaging.o0.a
                public final Task start() {
                    Task u10;
                    u10 = FirebaseMessaging.this.u(c10, p10);
                    return u10;
                }
            }));
        } catch (InterruptedException | ExecutionException e11) {
            throw new IOException(e11);
        }
    }

    public void j(Runnable runnable, long j10) {
        synchronized (FirebaseMessaging.class) {
            if (f23417q == null) {
                f23417q = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("TAG"));
            }
            f23417q.schedule(runnable, j10, TimeUnit.SECONDS);
        }
    }

    public Context k() {
        return this.f23421d;
    }

    public Task<String> o() {
        rc.a aVar = this.f23419b;
        if (aVar != null) {
            return aVar.b();
        }
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f23425h.execute(new Runnable() { // from class: com.google.firebase.messaging.w
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.f(FirebaseMessaging.this, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    t0.a p() {
        return m(this.f23421d).d(n(), g0.c(this.f23418a));
    }

    public boolean s() {
        return this.f23424g.c();
    }

    public boolean t() {
        return this.f23428k.g();
    }

    FirebaseMessaging(ob.e eVar, rc.a aVar, sc.b<cd.i> bVar, sc.b<qc.k> bVar2, tc.d dVar, u7.g gVar, pc.d dVar2, g0 g0Var) {
        this(eVar, aVar, dVar, gVar, dVar2, g0Var, new b0(eVar, g0Var, bVar, bVar2, dVar), o.d(), o.a());
    }

    FirebaseMessaging(ob.e eVar, rc.a aVar, tc.d dVar, u7.g gVar, pc.d dVar2, g0 g0Var, b0 b0Var, Executor executor, Executor executor2) {
        this.f23429l = false;
        f23416p = gVar;
        this.f23418a = eVar;
        this.f23419b = aVar;
        this.f23420c = dVar;
        this.f23424g = new a(dVar2);
        Context l10 = eVar.l();
        this.f23421d = l10;
        q qVar = new q();
        this.f23430m = qVar;
        this.f23428k = g0Var;
        this.f23426i = executor;
        this.f23422e = b0Var;
        this.f23423f = new o0(executor);
        this.f23425h = executor2;
        Context l11 = eVar.l();
        if (l11 instanceof Application) {
            ((Application) l11).registerActivityLifecycleCallbacks(qVar);
        } else {
            Log.w("FirebaseMessaging", "Context " + l11 + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (aVar != null) {
            aVar.a(new a.InterfaceC0492a(this) { // from class: com.google.firebase.messaging.x
            });
        }
        executor2.execute(new Runnable() { // from class: com.google.firebase.messaging.v
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.e(FirebaseMessaging.this);
            }
        });
        Task<y0> e10 = y0.e(this, g0Var, b0Var, l10, o.e());
        this.f23427j = e10;
        e10.addOnSuccessListener(executor2, new OnSuccessListener() { // from class: com.google.firebase.messaging.r
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                FirebaseMessaging.this.y((y0) obj);
            }
        });
        executor2.execute(new Runnable() { // from class: com.google.firebase.messaging.u
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.c(FirebaseMessaging.this);
            }
        });
    }
}
