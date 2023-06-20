package yb;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: CrashlyticsBackgroundWorker.java */
/* loaded from: classes3.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f39401a;

    /* renamed from: b  reason: collision with root package name */
    private Task<Void> f39402b = Tasks.forResult(null);

    /* renamed from: c  reason: collision with root package name */
    private final Object f39403c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private final ThreadLocal<Boolean> f39404d = new ThreadLocal<>();

    /* compiled from: CrashlyticsBackgroundWorker.java */
    /* loaded from: classes3.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            h.this.f39404d.set(Boolean.TRUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: CrashlyticsBackgroundWorker.java */
    /* loaded from: classes3.dex */
    public class b<T> implements Continuation<Void, T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Callable f39406a;

        b(h hVar, Callable callable) {
            this.f39406a = callable;
        }

        @Override // com.google.android.gms.tasks.Continuation
        public T then(Task<Void> task) throws Exception {
            return (T) this.f39406a.call();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: CrashlyticsBackgroundWorker.java */
    /* loaded from: classes3.dex */
    public class c<T> implements Continuation<T, Void> {
        c(h hVar) {
        }

        @Override // com.google.android.gms.tasks.Continuation
        /* renamed from: a */
        public Void then(Task<T> task) throws Exception {
            return null;
        }
    }

    public h(Executor executor) {
        this.f39401a = executor;
        executor.execute(new a());
    }

    private <T> Task<Void> d(Task<T> task) {
        return task.continueWith(this.f39401a, new c(this));
    }

    private boolean e() {
        return Boolean.TRUE.equals(this.f39404d.get());
    }

    private <T> Continuation<Void, T> f(Callable<T> callable) {
        return new b(this, callable);
    }

    public void b() {
        if (!e()) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
    }

    public Executor c() {
        return this.f39401a;
    }

    public <T> Task<T> g(Callable<T> callable) {
        Task<T> continueWith;
        synchronized (this.f39403c) {
            continueWith = this.f39402b.continueWith(this.f39401a, f(callable));
            this.f39402b = d(continueWith);
        }
        return continueWith;
    }

    public <T> Task<T> h(Callable<Task<T>> callable) {
        Task<T> continueWithTask;
        synchronized (this.f39403c) {
            continueWithTask = this.f39402b.continueWithTask(this.f39401a, f(callable));
            this.f39402b = d(continueWithTask);
        }
        return continueWithTask;
    }
}
