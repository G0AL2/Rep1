package w3;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: StatefulRunnable.java */
/* loaded from: classes.dex */
public abstract class g<T> implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    protected final AtomicInteger f38191a = new AtomicInteger(0);

    public void a() {
        if (this.f38191a.compareAndSet(0, 2)) {
            d();
        }
    }

    protected abstract void b(T t10);

    protected abstract T c() throws Exception;

    protected abstract void d();

    protected abstract void e(Exception exc);

    protected abstract void f(T t10);

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f38191a.compareAndSet(0, 1)) {
            try {
                T c10 = c();
                this.f38191a.set(3);
                try {
                    f(c10);
                } finally {
                    b(c10);
                }
            } catch (Exception e10) {
                this.f38191a.set(4);
                e(e10);
            }
        }
    }
}
