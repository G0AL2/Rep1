package yb;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: CrashlyticsCore.java */
/* loaded from: classes3.dex */
public class l {

    /* renamed from: a  reason: collision with root package name */
    private final Context f39450a;

    /* renamed from: b  reason: collision with root package name */
    private final r f39451b;

    /* renamed from: c  reason: collision with root package name */
    private final long f39452c = System.currentTimeMillis();

    /* renamed from: d  reason: collision with root package name */
    private m f39453d;

    /* renamed from: e  reason: collision with root package name */
    private m f39454e;

    /* renamed from: f  reason: collision with root package name */
    private j f39455f;

    /* renamed from: g  reason: collision with root package name */
    private final v f39456g;

    /* renamed from: h  reason: collision with root package name */
    private final dc.f f39457h;

    /* renamed from: i  reason: collision with root package name */
    public final xb.b f39458i;

    /* renamed from: j  reason: collision with root package name */
    private final wb.a f39459j;

    /* renamed from: k  reason: collision with root package name */
    private final ExecutorService f39460k;

    /* renamed from: l  reason: collision with root package name */
    private final h f39461l;

    /* renamed from: m  reason: collision with root package name */
    private final vb.a f39462m;

    /* compiled from: CrashlyticsCore.java */
    /* loaded from: classes3.dex */
    class a implements Callable<Task<Void>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ fc.e f39463a;

        a(fc.e eVar) {
            this.f39463a = eVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Task<Void> call() throws Exception {
            return l.this.f(this.f39463a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CrashlyticsCore.java */
    /* loaded from: classes3.dex */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ fc.e f39465a;

        b(fc.e eVar) {
            this.f39465a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            l.this.f(this.f39465a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CrashlyticsCore.java */
    /* loaded from: classes3.dex */
    public class c implements Callable<Boolean> {
        c() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Boolean call() throws Exception {
            try {
                boolean d10 = l.this.f39453d.d();
                if (!d10) {
                    vb.f.f().k("Initialization marker file was not properly removed.");
                }
                return Boolean.valueOf(d10);
            } catch (Exception e10) {
                vb.f.f().e("Problem encountered deleting Crashlytics initialization marker.", e10);
                return Boolean.FALSE;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CrashlyticsCore.java */
    /* loaded from: classes3.dex */
    public class d implements Callable<Boolean> {
        d() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Boolean call() throws Exception {
            return Boolean.valueOf(l.this.f39455f.s());
        }
    }

    public l(ob.e eVar, v vVar, vb.a aVar, r rVar, xb.b bVar, wb.a aVar2, dc.f fVar, ExecutorService executorService) {
        this.f39451b = rVar;
        this.f39450a = eVar.l();
        this.f39456g = vVar;
        this.f39462m = aVar;
        this.f39458i = bVar;
        this.f39459j = aVar2;
        this.f39460k = executorService;
        this.f39457h = fVar;
        this.f39461l = new h(executorService);
    }

    private void d() {
        try {
            Boolean.TRUE.equals((Boolean) h0.d(this.f39461l.g(new d())));
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task<Void> f(fc.e eVar) {
        m();
        try {
            this.f39458i.a(new xb.a() { // from class: yb.k
                @Override // xb.a
                public final void a(String str) {
                    l.this.k(str);
                }
            });
            if (!eVar.a().a().f30814a) {
                vb.f.f().b("Collection of crash reports disabled in Crashlytics settings.");
                return Tasks.forException(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
            }
            if (!this.f39455f.z(eVar)) {
                vb.f.f().k("Previous sessions could not be finalized.");
            }
            return this.f39455f.N(eVar.b());
        } catch (Exception e10) {
            vb.f.f().e("Crashlytics encountered a problem during asynchronous initialization.", e10);
            return Tasks.forException(e10);
        } finally {
            l();
        }
    }

    private void h(fc.e eVar) {
        Future<?> submit = this.f39460k.submit(new b(eVar));
        vb.f.f().b("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            submit.get(4L, TimeUnit.SECONDS);
        } catch (InterruptedException e10) {
            vb.f.f().e("Crashlytics was interrupted during initialization.", e10);
        } catch (ExecutionException e11) {
            vb.f.f().e("Crashlytics encountered a problem during initialization.", e11);
        } catch (TimeoutException e12) {
            vb.f.f().e("Crashlytics timed out during initialization.", e12);
        }
    }

    public static String i() {
        return "18.2.9";
    }

    static boolean j(String str, boolean z10) {
        if (!z10) {
            vb.f.f().i("Configured not to require a build ID.");
            return true;
        } else if (TextUtils.isEmpty(str)) {
            Log.e("FirebaseCrashlytics", ".");
            Log.e("FirebaseCrashlytics", ".     |  | ");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".   \\ |  | /");
            Log.e("FirebaseCrashlytics", ".    \\    /");
            Log.e("FirebaseCrashlytics", ".     \\  /");
            Log.e("FirebaseCrashlytics", ".      \\/");
            Log.e("FirebaseCrashlytics", ".");
            Log.e("FirebaseCrashlytics", "The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account.");
            Log.e("FirebaseCrashlytics", ".");
            Log.e("FirebaseCrashlytics", ".      /\\");
            Log.e("FirebaseCrashlytics", ".     /  \\");
            Log.e("FirebaseCrashlytics", ".    /    \\");
            Log.e("FirebaseCrashlytics", ".   / |  | \\");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".");
            return false;
        } else {
            return true;
        }
    }

    boolean e() {
        return this.f39453d.c();
    }

    public Task<Void> g(fc.e eVar) {
        return h0.e(this.f39460k, new a(eVar));
    }

    public void k(String str) {
        this.f39455f.Q(System.currentTimeMillis() - this.f39452c, str);
    }

    void l() {
        this.f39461l.g(new c());
    }

    void m() {
        this.f39461l.b();
        this.f39453d.a();
        vb.f.f().i("Initialization marker file was created.");
    }

    public boolean n(yb.a aVar, fc.e eVar) {
        if (j(aVar.f39361b, g.k(this.f39450a, "com.crashlytics.RequireBuildId", true))) {
            String fVar = new f(this.f39456g).toString();
            try {
                this.f39454e = new m("crash_marker", this.f39457h);
                this.f39453d = new m("initialization_marker", this.f39457h);
                zb.g gVar = new zb.g(fVar, this.f39457h, this.f39461l);
                zb.c cVar = new zb.c(this.f39457h);
                this.f39455f = new j(this.f39450a, this.f39461l, this.f39456g, this.f39451b, this.f39457h, this.f39454e, aVar, gVar, cVar, c0.g(this.f39450a, this.f39456g, this.f39457h, aVar, cVar, gVar, new ic.a(IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES, new ic.c(10)), eVar), this.f39462m, this.f39459j);
                boolean e10 = e();
                d();
                this.f39455f.x(fVar, Thread.getDefaultUncaughtExceptionHandler(), eVar);
                if (e10 && g.c(this.f39450a)) {
                    vb.f.f().b("Crashlytics did not finish previous background initialization. Initializing synchronously.");
                    h(eVar);
                    return false;
                }
                vb.f.f().b("Successfully configured exception handler.");
                return true;
            } catch (Exception e11) {
                vb.f.f().e("Crashlytics was not started due to an exception during initialization", e11);
                this.f39455f = null;
                return false;
            }
        }
        throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account.");
    }
}
