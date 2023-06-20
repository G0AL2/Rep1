package yb;

import android.os.Process;

/* compiled from: BackgroundPriorityRunnable.java */
/* loaded from: classes3.dex */
public abstract class c implements Runnable {
    protected abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        a();
    }
}
