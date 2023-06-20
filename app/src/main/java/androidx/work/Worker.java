package androidx.work;

import android.content.Context;
import androidx.work.k;

/* loaded from: classes.dex */
public abstract class Worker extends k {
    androidx.work.impl.utils.futures.c<k.a> mFuture;

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Worker.this.mFuture.p(Worker.this.doWork());
            } catch (Throwable th) {
                Worker.this.mFuture.q(th);
            }
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f4386a;

        b(androidx.work.impl.utils.futures.c cVar) {
            this.f4386a = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f4386a.p(Worker.this.getForegroundInfo());
            } catch (Throwable th) {
                this.f4386a.q(th);
            }
        }
    }

    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract k.a doWork();

    public g getForegroundInfo() {
        throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for \n `getForegroundInfo()`");
    }

    @Override // androidx.work.k
    public com.google.common.util.concurrent.c<g> getForegroundInfoAsync() {
        androidx.work.impl.utils.futures.c t10 = androidx.work.impl.utils.futures.c.t();
        getBackgroundExecutor().execute(new b(t10));
        return t10;
    }

    @Override // androidx.work.k
    public final com.google.common.util.concurrent.c<k.a> startWork() {
        this.mFuture = androidx.work.impl.utils.futures.c.t();
        getBackgroundExecutor().execute(new a());
        return this.mFuture;
    }
}
