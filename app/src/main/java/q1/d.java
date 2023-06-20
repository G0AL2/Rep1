package q1;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import p1.q;

/* compiled from: WorkManagerTaskExecutor.java */
/* loaded from: classes.dex */
public class d implements c {

    /* renamed from: a  reason: collision with root package name */
    private final q f35771a;

    /* renamed from: b  reason: collision with root package name */
    final Handler f35772b = new Handler(Looper.getMainLooper());

    /* renamed from: c  reason: collision with root package name */
    private final Executor f35773c = new a();

    /* compiled from: WorkManagerTaskExecutor.java */
    /* loaded from: classes.dex */
    class a implements Executor {
        a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            d.this.f35772b.post(runnable);
        }
    }

    public d(Executor executor) {
        this.f35771a = new q(executor);
    }

    @Override // q1.c
    public Executor a() {
        return this.f35773c;
    }

    @Override // q1.c
    public /* synthetic */ void c(Runnable runnable) {
        b.a(this, runnable);
    }

    @Override // q1.c
    /* renamed from: d */
    public q b() {
        return this.f35771a;
    }
}
