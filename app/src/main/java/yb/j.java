package yb;

import ac.c0;
import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import yb.p;

/* compiled from: CrashlyticsController.java */
/* loaded from: classes3.dex */
public class j {

    /* renamed from: p */
    static final FilenameFilter f39412p = new FilenameFilter() { // from class: yb.i
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return j.a(file, str);
        }
    };

    /* renamed from: a */
    private final Context f39413a;

    /* renamed from: b */
    private final r f39414b;

    /* renamed from: c */
    private final m f39415c;

    /* renamed from: d */
    private final h f39416d;

    /* renamed from: e */
    private final v f39417e;

    /* renamed from: f */
    private final dc.f f39418f;

    /* renamed from: g */
    private final yb.a f39419g;

    /* renamed from: h */
    private final zb.c f39420h;

    /* renamed from: i */
    private final vb.a f39421i;

    /* renamed from: j */
    private final wb.a f39422j;

    /* renamed from: k */
    private final c0 f39423k;

    /* renamed from: l */
    private p f39424l;

    /* renamed from: m */
    final TaskCompletionSource<Boolean> f39425m = new TaskCompletionSource<>();

    /* renamed from: n */
    final TaskCompletionSource<Boolean> f39426n = new TaskCompletionSource<>();

    /* renamed from: o */
    final TaskCompletionSource<Void> f39427o = new TaskCompletionSource<>();

    /* compiled from: CrashlyticsController.java */
    /* loaded from: classes3.dex */
    public class a implements p.a {
        a() {
            j.this = r1;
        }

        @Override // yb.p.a
        public void a(fc.e eVar, Thread thread, Throwable th) {
            j.this.G(eVar, thread, th);
        }
    }

    /* compiled from: CrashlyticsController.java */
    /* loaded from: classes3.dex */
    public class b implements Callable<Task<Void>> {

        /* renamed from: a */
        final /* synthetic */ long f39429a;

        /* renamed from: b */
        final /* synthetic */ Throwable f39430b;

        /* renamed from: c */
        final /* synthetic */ Thread f39431c;

        /* renamed from: d */
        final /* synthetic */ fc.e f39432d;

        /* compiled from: CrashlyticsController.java */
        /* loaded from: classes3.dex */
        public class a implements SuccessContinuation<gc.a, Void> {

            /* renamed from: a */
            final /* synthetic */ Executor f39434a;

            a(Executor executor) {
                b.this = r1;
                this.f39434a = executor;
            }

            @Override // com.google.android.gms.tasks.SuccessContinuation
            /* renamed from: a */
            public Task<Void> then(gc.a aVar) throws Exception {
                if (aVar == null) {
                    vb.f.f().k("Received null app settings, cannot send reports at crash time.");
                    return Tasks.forResult(null);
                }
                return Tasks.whenAll(j.this.L(), j.this.f39423k.u(this.f39434a));
            }
        }

        b(long j10, Throwable th, Thread thread, fc.e eVar) {
            j.this = r1;
            this.f39429a = j10;
            this.f39430b = th;
            this.f39431c = thread;
            this.f39432d = eVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Task<Void> call() throws Exception {
            long F = j.F(this.f39429a);
            String C = j.this.C();
            if (C != null) {
                j.this.f39415c.a();
                j.this.f39423k.r(this.f39430b, this.f39431c, C, F);
                j.this.w(this.f39429a);
                j.this.t(this.f39432d);
                j.this.v(new yb.f(j.this.f39417e).toString());
                if (j.this.f39414b.d()) {
                    Executor c10 = j.this.f39416d.c();
                    return this.f39432d.b().onSuccessTask(c10, new a(c10));
                }
                return Tasks.forResult(null);
            }
            vb.f.f().d("Tried to write a fatal exception while no session was open.");
            return Tasks.forResult(null);
        }
    }

    /* compiled from: CrashlyticsController.java */
    /* loaded from: classes3.dex */
    public class c implements SuccessContinuation<Void, Boolean> {
        c(j jVar) {
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        /* renamed from: a */
        public Task<Boolean> then(Void r12) throws Exception {
            return Tasks.forResult(Boolean.TRUE);
        }
    }

    /* compiled from: CrashlyticsController.java */
    /* loaded from: classes3.dex */
    public class d implements SuccessContinuation<Boolean, Void> {

        /* renamed from: a */
        final /* synthetic */ Task f39436a;

        /* compiled from: CrashlyticsController.java */
        /* loaded from: classes3.dex */
        public class a implements Callable<Task<Void>> {

            /* renamed from: a */
            final /* synthetic */ Boolean f39438a;

            /* compiled from: CrashlyticsController.java */
            /* renamed from: yb.j$d$a$a */
            /* loaded from: classes3.dex */
            public class C0547a implements SuccessContinuation<gc.a, Void> {

                /* renamed from: a */
                final /* synthetic */ Executor f39440a;

                C0547a(Executor executor) {
                    a.this = r1;
                    this.f39440a = executor;
                }

                @Override // com.google.android.gms.tasks.SuccessContinuation
                /* renamed from: a */
                public Task<Void> then(gc.a aVar) throws Exception {
                    if (aVar != null) {
                        j.this.L();
                        j.this.f39423k.u(this.f39440a);
                        j.this.f39427o.trySetResult(null);
                        return Tasks.forResult(null);
                    }
                    vb.f.f().k("Received null app settings at app startup. Cannot send cached reports");
                    return Tasks.forResult(null);
                }
            }

            a(Boolean bool) {
                d.this = r1;
                this.f39438a = bool;
            }

            @Override // java.util.concurrent.Callable
            /* renamed from: a */
            public Task<Void> call() throws Exception {
                if (!this.f39438a.booleanValue()) {
                    vb.f.f().i("Deleting cached crash reports...");
                    j.r(j.this.J());
                    j.this.f39423k.t();
                    j.this.f39427o.trySetResult(null);
                    return Tasks.forResult(null);
                }
                vb.f.f().b("Sending cached crash reports...");
                j.this.f39414b.c(this.f39438a.booleanValue());
                Executor c10 = j.this.f39416d.c();
                return d.this.f39436a.onSuccessTask(c10, new C0547a(c10));
            }
        }

        d(Task task) {
            j.this = r1;
            this.f39436a = task;
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        /* renamed from: a */
        public Task<Void> then(Boolean bool) throws Exception {
            return j.this.f39416d.h(new a(bool));
        }
    }

    /* compiled from: CrashlyticsController.java */
    /* loaded from: classes3.dex */
    public class e implements Callable<Void> {

        /* renamed from: a */
        final /* synthetic */ long f39442a;

        /* renamed from: b */
        final /* synthetic */ String f39443b;

        e(long j10, String str) {
            j.this = r1;
            this.f39442a = j10;
            this.f39443b = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            if (j.this.H()) {
                return null;
            }
            j.this.f39420h.g(this.f39442a, this.f39443b);
            return null;
        }
    }

    /* compiled from: CrashlyticsController.java */
    /* loaded from: classes3.dex */
    public class f implements Callable<Void> {

        /* renamed from: a */
        final /* synthetic */ String f39445a;

        f(String str) {
            j.this = r1;
            this.f39445a = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            j.this.v(this.f39445a);
            return null;
        }
    }

    /* compiled from: CrashlyticsController.java */
    /* loaded from: classes3.dex */
    public class g implements Callable<Void> {

        /* renamed from: a */
        final /* synthetic */ long f39447a;

        g(long j10) {
            j.this = r1;
            this.f39447a = j10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            Bundle bundle = new Bundle();
            bundle.putInt("fatal", 1);
            bundle.putLong("timestamp", this.f39447a);
            j.this.f39422j.a("_ae", bundle);
            return null;
        }
    }

    public j(Context context, h hVar, v vVar, r rVar, dc.f fVar, m mVar, yb.a aVar, zb.g gVar, zb.c cVar, c0 c0Var, vb.a aVar2, wb.a aVar3) {
        new AtomicBoolean(false);
        this.f39413a = context;
        this.f39416d = hVar;
        this.f39417e = vVar;
        this.f39414b = rVar;
        this.f39418f = fVar;
        this.f39415c = mVar;
        this.f39419g = aVar;
        this.f39420h = cVar;
        this.f39421i = aVar2;
        this.f39422j = aVar3;
        this.f39423k = c0Var;
    }

    private static boolean A() {
        try {
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private Context B() {
        return this.f39413a;
    }

    public String C() {
        SortedSet<String> n10 = this.f39423k.n();
        if (n10.isEmpty()) {
            return null;
        }
        return n10.first();
    }

    private static long D() {
        return F(System.currentTimeMillis());
    }

    static List<y> E(vb.g gVar, String str, dc.f fVar, byte[] bArr) {
        File n10 = fVar.n(str, "user-data");
        File n11 = fVar.n(str, "keys");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new yb.e("logs_file", "logs", bArr));
        arrayList.add(new u("crash_meta_file", "metadata", gVar.c()));
        arrayList.add(new u("session_meta_file", "session", gVar.f()));
        arrayList.add(new u("app_meta_file", "app", gVar.d()));
        arrayList.add(new u("device_meta_file", "device", gVar.a()));
        arrayList.add(new u("os_meta_file", "os", gVar.e()));
        arrayList.add(new u("minidump_file", "minidump", gVar.b()));
        arrayList.add(new u("user_meta_file", "user", n10));
        arrayList.add(new u("keys_file", "keys", n11));
        return arrayList;
    }

    public static long F(long j10) {
        return j10 / 1000;
    }

    public static /* synthetic */ boolean I(File file, String str) {
        return str.startsWith(".ae");
    }

    private Task<Void> K(long j10) {
        if (A()) {
            vb.f.f().k("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
            return Tasks.forResult(null);
        }
        vb.f.f().b("Logging app exception event to Firebase Analytics");
        return Tasks.call(new ScheduledThreadPoolExecutor(1), new g(j10));
    }

    public Task<Void> L() {
        ArrayList arrayList = new ArrayList();
        for (File file : J()) {
            try {
                arrayList.add(K(Long.parseLong(file.getName().substring(3))));
            } catch (NumberFormatException unused) {
                vb.f f10 = vb.f.f();
                f10.k("Could not parse app exception timestamp from file " + file.getName());
            }
            file.delete();
        }
        return Tasks.whenAll(arrayList);
    }

    private Task<Boolean> O() {
        if (this.f39414b.d()) {
            vb.f.f().b("Automatic data collection is enabled. Allowing upload.");
            this.f39425m.trySetResult(Boolean.FALSE);
            return Tasks.forResult(Boolean.TRUE);
        }
        vb.f.f().b("Automatic data collection is disabled.");
        vb.f.f().i("Notifying that unsent reports are available.");
        this.f39425m.trySetResult(Boolean.TRUE);
        Task<TContinuationResult> onSuccessTask = this.f39414b.g().onSuccessTask(new c(this));
        vb.f.f().b("Waiting for send/deleteUnsentReports to be called.");
        return h0.i(onSuccessTask, this.f39426n.getTask());
    }

    private void P(String str) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.f39413a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
            if (historicalProcessExitReasons.size() != 0) {
                this.f39423k.s(str, historicalProcessExitReasons, new zb.c(this.f39418f, str), zb.g.c(str, this.f39418f, this.f39416d));
                return;
            }
            vb.f f10 = vb.f.f();
            f10.i("No ApplicationExitInfo available. Session: " + str);
            return;
        }
        vb.f f11 = vb.f.f();
        f11.i("ANR feature enabled, but device is API " + i10);
    }

    public static /* synthetic */ boolean a(File file, String str) {
        return I(file, str);
    }

    private static c0.a o(v vVar, yb.a aVar) {
        return c0.a.b(vVar.f(), aVar.f39364e, aVar.f39365f, vVar.a(), s.a(aVar.f39362c).f(), aVar.f39366g);
    }

    private static c0.b p(Context context) {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return c0.b.c(yb.g.l(), Build.MODEL, Runtime.getRuntime().availableProcessors(), yb.g.s(), statFs.getBlockCount() * statFs.getBlockSize(), yb.g.x(context), yb.g.m(context), Build.MANUFACTURER, Build.PRODUCT);
    }

    private static c0.c q(Context context) {
        return c0.c.a(Build.VERSION.RELEASE, Build.VERSION.CODENAME, yb.g.y(context));
    }

    public static void r(List<File> list) {
        for (File file : list) {
            file.delete();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void u(boolean z10, fc.e eVar) {
        ArrayList arrayList = new ArrayList(this.f39423k.n());
        if (arrayList.size() <= z10) {
            vb.f.f().i("No open sessions to be closed.");
            return;
        }
        String str = (String) arrayList.get(z10 ? 1 : 0);
        if (eVar.a().a().f30815b) {
            P(str);
        } else {
            vb.f.f().i("ANR feature disabled.");
        }
        if (this.f39421i.c(str)) {
            y(str);
        }
        this.f39423k.i(D(), z10 != 0 ? (String) arrayList.get(0) : null);
    }

    public void v(String str) {
        long D = D();
        vb.f f10 = vb.f.f();
        f10.b("Opening a new session with ID " + str);
        this.f39421i.d(str, String.format(Locale.US, "Crashlytics Android SDK/%s", l.i()), D, ac.c0.b(o(this.f39417e, this.f39419g), q(B()), p(B())));
        this.f39420h.e(str);
        this.f39423k.o(str, D);
    }

    public void w(long j10) {
        try {
            dc.f fVar = this.f39418f;
            if (fVar.d(".ae" + j10).createNewFile()) {
                return;
            }
            throw new IOException("Create new file failed.");
        } catch (IOException e10) {
            vb.f.f().l("Could not create app exception marker file.", e10);
        }
    }

    private void y(String str) {
        vb.f f10 = vb.f.f();
        f10.i("Finalizing native report for session " + str);
        vb.g a10 = this.f39421i.a(str);
        File b10 = a10.b();
        if (b10 != null && b10.exists()) {
            long lastModified = b10.lastModified();
            zb.c cVar = new zb.c(this.f39418f, str);
            File h10 = this.f39418f.h(str);
            if (!h10.isDirectory()) {
                vb.f.f().k("Couldn't create directory to store native session files, aborting.");
                return;
            }
            w(lastModified);
            List<y> E = E(a10, str, this.f39418f, cVar.b());
            z.b(h10, E);
            vb.f.f().b("CrashlyticsController#finalizePreviousNativeSession");
            this.f39423k.h(str, E);
            cVar.a();
            return;
        }
        vb.f f11 = vb.f.f();
        f11.k("No minidump data found for session " + str);
    }

    synchronized void G(fc.e eVar, Thread thread, Throwable th) {
        vb.f f10 = vb.f.f();
        f10.b("Handling uncaught exception \"" + th + "\" from thread " + thread.getName());
        try {
            h0.d(this.f39416d.h(new b(System.currentTimeMillis(), th, thread, eVar)));
        } catch (Exception e10) {
            vb.f.f().e("Error handling uncaught exception", e10);
        }
    }

    boolean H() {
        p pVar = this.f39424l;
        return pVar != null && pVar.a();
    }

    List<File> J() {
        return this.f39418f.e(f39412p);
    }

    void M(String str) {
        this.f39416d.g(new f(str));
    }

    public Task<Void> N(Task<gc.a> task) {
        if (!this.f39423k.l()) {
            vb.f.f().i("No crash reports are available to be sent.");
            this.f39425m.trySetResult(Boolean.FALSE);
            return Tasks.forResult(null);
        }
        vb.f.f().i("Crash reports are available to be sent.");
        return O().onSuccessTask(new d(task));
    }

    public void Q(long j10, String str) {
        this.f39416d.g(new e(j10, str));
    }

    public boolean s() {
        if (!this.f39415c.c()) {
            String C = C();
            return C != null && this.f39421i.c(C);
        }
        vb.f.f().i("Found previous crash marker.");
        this.f39415c.d();
        return true;
    }

    void t(fc.e eVar) {
        u(false, eVar);
    }

    public void x(String str, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, fc.e eVar) {
        M(str);
        p pVar = new p(new a(), eVar, uncaughtExceptionHandler, this.f39421i);
        this.f39424l = pVar;
        Thread.setDefaultUncaughtExceptionHandler(pVar);
    }

    public boolean z(fc.e eVar) {
        this.f39416d.b();
        if (H()) {
            vb.f.f().k("Skipping session finalization because a crash has already occurred.");
            return false;
        }
        vb.f.f().i("Finalizing previously open sessions.");
        try {
            u(true, eVar);
            vb.f.f().i("Closed all previously open sessions.");
            return true;
        } catch (Exception e10) {
            vb.f.f().e("Unable to finalize previously open sessions.", e10);
            return false;
        }
    }
}
