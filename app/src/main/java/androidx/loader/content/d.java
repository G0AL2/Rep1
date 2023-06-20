package androidx.loader.content;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ModernAsyncTask.java */
/* loaded from: classes.dex */
abstract class d<Params, Progress, Result> {

    /* renamed from: f  reason: collision with root package name */
    private static final ThreadFactory f3449f;

    /* renamed from: g  reason: collision with root package name */
    private static final BlockingQueue<Runnable> f3450g;

    /* renamed from: h  reason: collision with root package name */
    public static final Executor f3451h;

    /* renamed from: i  reason: collision with root package name */
    private static f f3452i;

    /* renamed from: a  reason: collision with root package name */
    private final h<Params, Result> f3453a;

    /* renamed from: b  reason: collision with root package name */
    private final FutureTask<Result> f3454b;

    /* renamed from: c  reason: collision with root package name */
    private volatile g f3455c = g.PENDING;

    /* renamed from: d  reason: collision with root package name */
    final AtomicBoolean f3456d = new AtomicBoolean();

    /* renamed from: e  reason: collision with root package name */
    final AtomicBoolean f3457e = new AtomicBoolean();

    /* compiled from: ModernAsyncTask.java */
    /* loaded from: classes.dex */
    static class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private final AtomicInteger f3458a = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "ModernAsyncTask #" + this.f3458a.getAndIncrement());
        }
    }

    /* compiled from: ModernAsyncTask.java */
    /* loaded from: classes.dex */
    class b extends h<Params, Result> {
        b() {
        }

        @Override // java.util.concurrent.Callable
        public Result call() throws Exception {
            d.this.f3457e.set(true);
            Result result = null;
            try {
                Process.setThreadPriority(10);
                result = (Result) d.this.b(this.f3468a);
                Binder.flushPendingCommands();
                return result;
            } finally {
            }
        }
    }

    /* compiled from: ModernAsyncTask.java */
    /* loaded from: classes.dex */
    class c extends FutureTask<Result> {
        c(Callable callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            try {
                d.this.m(get());
            } catch (InterruptedException e10) {
                Log.w("AsyncTask", e10);
            } catch (CancellationException unused) {
                d.this.m(null);
            } catch (ExecutionException e11) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e11.getCause());
            } catch (Throwable th) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th);
            }
        }
    }

    /* compiled from: ModernAsyncTask.java */
    /* renamed from: androidx.loader.content.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class C0066d {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f3461a;

        static {
            int[] iArr = new int[g.values().length];
            f3461a = iArr;
            try {
                iArr[g.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3461a[g.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ModernAsyncTask.java */
    /* loaded from: classes.dex */
    public static class e<Data> {

        /* renamed from: a  reason: collision with root package name */
        final d f3462a;

        /* renamed from: b  reason: collision with root package name */
        final Data[] f3463b;

        e(d dVar, Data... dataArr) {
            this.f3462a = dVar;
            this.f3463b = dataArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ModernAsyncTask.java */
    /* loaded from: classes.dex */
    public static class f extends Handler {
        f() {
            super(Looper.getMainLooper());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            e eVar = (e) message.obj;
            int i10 = message.what;
            if (i10 == 1) {
                eVar.f3462a.d(eVar.f3463b[0]);
            } else if (i10 != 2) {
            } else {
                eVar.f3462a.k(eVar.f3463b);
            }
        }
    }

    /* compiled from: ModernAsyncTask.java */
    /* loaded from: classes.dex */
    public enum g {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* compiled from: ModernAsyncTask.java */
    /* loaded from: classes.dex */
    private static abstract class h<Params, Result> implements Callable<Result> {

        /* renamed from: a  reason: collision with root package name */
        Params[] f3468a;

        h() {
        }
    }

    static {
        a aVar = new a();
        f3449f = aVar;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(10);
        f3450g = linkedBlockingQueue;
        f3451h = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, linkedBlockingQueue, aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d() {
        b bVar = new b();
        this.f3453a = bVar;
        this.f3454b = new c(bVar);
    }

    private static Handler e() {
        f fVar;
        synchronized (d.class) {
            if (f3452i == null) {
                f3452i = new f();
            }
            fVar = f3452i;
        }
        return fVar;
    }

    public final boolean a(boolean z10) {
        this.f3456d.set(true);
        return this.f3454b.cancel(z10);
    }

    protected abstract Result b(Params... paramsArr);

    public final d<Params, Progress, Result> c(Executor executor, Params... paramsArr) {
        if (this.f3455c != g.PENDING) {
            int i10 = C0066d.f3461a[this.f3455c.ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("We should never reach this state");
                }
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        this.f3455c = g.RUNNING;
        j();
        this.f3453a.f3468a = paramsArr;
        executor.execute(this.f3454b);
        return this;
    }

    void d(Result result) {
        if (f()) {
            h(result);
        } else {
            i(result);
        }
        this.f3455c = g.FINISHED;
    }

    public final boolean f() {
        return this.f3456d.get();
    }

    protected void g() {
    }

    protected void h(Result result) {
        g();
    }

    protected void i(Result result) {
    }

    protected void j() {
    }

    protected void k(Progress... progressArr) {
    }

    Result l(Result result) {
        e().obtainMessage(1, new e(this, result)).sendToTarget();
        return result;
    }

    void m(Result result) {
        if (this.f3457e.get()) {
            return;
        }
        l(result);
    }
}
