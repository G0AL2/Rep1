package w3;

import android.os.Handler;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: ScheduledFutureImpl.java */
/* loaded from: classes.dex */
public class e<V> implements RunnableFuture<V>, ScheduledFuture<V> {

    /* renamed from: a  reason: collision with root package name */
    private final FutureTask<V> f38190a;

    public e(Handler handler, Callable<V> callable) {
        this.f38190a = new FutureTask<>(callable);
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public int compareTo(Delayed delayed) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        return this.f38190a.cancel(z10);
    }

    @Override // java.util.concurrent.Future
    public V get() throws InterruptedException, ExecutionException {
        return this.f38190a.get();
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f38190a.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f38190a.isDone();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public void run() {
        this.f38190a.run();
    }

    @Override // java.util.concurrent.Future
    public V get(long j10, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.f38190a.get(j10, timeUnit);
    }

    public e(Handler handler, Runnable runnable, V v10) {
        this.f38190a = new FutureTask<>(runnable, v10);
    }
}
