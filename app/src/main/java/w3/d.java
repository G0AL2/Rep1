package w3;

import android.os.Handler;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: HandlerExecutorServiceImpl.java */
/* loaded from: classes.dex */
public class d extends AbstractExecutorService implements ScheduledExecutorService {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f38189a;

    public d(Handler handler) {
        this.f38189a = handler;
    }

    public boolean a() {
        return Thread.currentThread() == this.f38189a.getLooper().getThread();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j10, TimeUnit timeUnit) throws InterruptedException {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // java.util.concurrent.AbstractExecutorService
    /* renamed from: b */
    public <T> e<T> newTaskFor(Runnable runnable, T t10) {
        return new e<>(this.f38189a, runnable, t10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // java.util.concurrent.AbstractExecutorService
    /* renamed from: c */
    public <T> e<T> newTaskFor(Callable<T> callable) {
        return new e<>(this.f38189a, callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* renamed from: d */
    public ScheduledFuture<?> submit(Runnable runnable) {
        return submit(runnable, null);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* renamed from: e */
    public <T> ScheduledFuture<T> submit(Runnable runnable, T t10) {
        Objects.requireNonNull(runnable);
        e<T> newTaskFor = newTaskFor(runnable, t10);
        execute(newTaskFor);
        return newTaskFor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f38189a.post(runnable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* renamed from: f */
    public <T> ScheduledFuture<T> submit(Callable<T> callable) {
        Objects.requireNonNull(callable);
        e<T> newTaskFor = newTaskFor(callable);
        execute(newTaskFor);
        return newTaskFor;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
        e newTaskFor = newTaskFor(runnable, null);
        this.f38189a.postDelayed(newTaskFor, timeUnit.toMillis(j10));
        return newTaskFor;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j10, TimeUnit timeUnit) {
        e newTaskFor = newTaskFor(callable);
        this.f38189a.postDelayed(newTaskFor, timeUnit.toMillis(j10));
        return newTaskFor;
    }
}
