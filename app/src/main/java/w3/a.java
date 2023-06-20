package w3;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: CallerThreadExecutor.java */
/* loaded from: classes.dex */
public class a extends AbstractExecutorService {

    /* renamed from: a  reason: collision with root package name */
    private static final a f38179a = new a();

    private a() {
    }

    public static a a() {
        return f38179a;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j10, TimeUnit timeUnit) throws InterruptedException {
        return true;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        shutdown();
        return Collections.emptyList();
    }
}
