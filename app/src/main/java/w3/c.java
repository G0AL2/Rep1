package w3;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: DefaultSerialExecutorService.java */
/* loaded from: classes.dex */
public class c extends b implements f {
    public c(Executor executor) {
        super("SerialExecutor", 1, executor, new LinkedBlockingQueue());
    }

    @Override // w3.b, java.util.concurrent.Executor
    public synchronized void execute(Runnable runnable) {
        super.execute(runnable);
    }
}
