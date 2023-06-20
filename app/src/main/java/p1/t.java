package p1;

import java.util.concurrent.Executor;

/* compiled from: SynchronousExecutor.java */
/* loaded from: classes.dex */
public class t implements Executor {
    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
