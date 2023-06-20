package androidx.loader.content;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import e0.i;
import h0.h;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* compiled from: AsyncTaskLoader.java */
/* loaded from: classes.dex */
public abstract class a<D> extends c<D> {
    static final boolean DEBUG = false;
    static final String TAG = "AsyncTaskLoader";
    volatile a<D>.RunnableC0064a mCancellingTask;
    private final Executor mExecutor;
    Handler mHandler;
    long mLastLoadCompleteTime;
    volatile a<D>.RunnableC0064a mTask;
    long mUpdateThrottle;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AsyncTaskLoader.java */
    /* renamed from: androidx.loader.content.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public final class RunnableC0064a extends d<Void, Void, D> implements Runnable {

        /* renamed from: j  reason: collision with root package name */
        private final CountDownLatch f3437j = new CountDownLatch(1);

        /* renamed from: k  reason: collision with root package name */
        boolean f3438k;

        RunnableC0064a() {
        }

        @Override // androidx.loader.content.d
        protected void h(D d10) {
            try {
                a.this.dispatchOnCancelled(this, d10);
            } finally {
                this.f3437j.countDown();
            }
        }

        @Override // androidx.loader.content.d
        protected void i(D d10) {
            try {
                a.this.dispatchOnLoadComplete(this, d10);
            } finally {
                this.f3437j.countDown();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.loader.content.d
        /* renamed from: n */
        public D b(Void... voidArr) {
            try {
                return (D) a.this.onLoadInBackground();
            } catch (i e10) {
                if (f()) {
                    return null;
                }
                throw e10;
            }
        }

        public void o() {
            try {
                this.f3437j.await();
            } catch (InterruptedException unused) {
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3438k = false;
            a.this.executePendingTask();
        }
    }

    public a(Context context) {
        this(context, d.f3451h);
    }

    public void cancelLoadInBackground() {
    }

    void dispatchOnCancelled(a<D>.RunnableC0064a runnableC0064a, D d10) {
        onCanceled(d10);
        if (this.mCancellingTask == runnableC0064a) {
            rollbackContentChanged();
            this.mLastLoadCompleteTime = SystemClock.uptimeMillis();
            this.mCancellingTask = null;
            deliverCancellation();
            executePendingTask();
        }
    }

    void dispatchOnLoadComplete(a<D>.RunnableC0064a runnableC0064a, D d10) {
        if (this.mTask != runnableC0064a) {
            dispatchOnCancelled(runnableC0064a, d10);
        } else if (isAbandoned()) {
            onCanceled(d10);
        } else {
            commitContentChanged();
            this.mLastLoadCompleteTime = SystemClock.uptimeMillis();
            this.mTask = null;
            deliverResult(d10);
        }
    }

    @Override // androidx.loader.content.c
    @Deprecated
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (this.mTask != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.mTask);
            printWriter.print(" waiting=");
            printWriter.println(this.mTask.f3438k);
        }
        if (this.mCancellingTask != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.mCancellingTask);
            printWriter.print(" waiting=");
            printWriter.println(this.mCancellingTask.f3438k);
        }
        if (this.mUpdateThrottle != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            h.c(this.mUpdateThrottle, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            h.b(this.mLastLoadCompleteTime, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }

    void executePendingTask() {
        if (this.mCancellingTask != null || this.mTask == null) {
            return;
        }
        if (this.mTask.f3438k) {
            this.mTask.f3438k = false;
            this.mHandler.removeCallbacks(this.mTask);
        }
        if (this.mUpdateThrottle > 0 && SystemClock.uptimeMillis() < this.mLastLoadCompleteTime + this.mUpdateThrottle) {
            this.mTask.f3438k = true;
            this.mHandler.postAtTime(this.mTask, this.mLastLoadCompleteTime + this.mUpdateThrottle);
            return;
        }
        this.mTask.c(this.mExecutor, null);
    }

    public boolean isLoadInBackgroundCanceled() {
        return this.mCancellingTask != null;
    }

    public abstract D loadInBackground();

    @Override // androidx.loader.content.c
    protected boolean onCancelLoad() {
        if (this.mTask != null) {
            if (!this.mStarted) {
                this.mContentChanged = true;
            }
            if (this.mCancellingTask != null) {
                if (this.mTask.f3438k) {
                    this.mTask.f3438k = false;
                    this.mHandler.removeCallbacks(this.mTask);
                }
                this.mTask = null;
                return false;
            } else if (this.mTask.f3438k) {
                this.mTask.f3438k = false;
                this.mHandler.removeCallbacks(this.mTask);
                this.mTask = null;
                return false;
            } else {
                boolean a10 = this.mTask.a(false);
                if (a10) {
                    this.mCancellingTask = this.mTask;
                    cancelLoadInBackground();
                }
                this.mTask = null;
                return a10;
            }
        }
        return false;
    }

    public void onCanceled(D d10) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.loader.content.c
    public void onForceLoad() {
        super.onForceLoad();
        cancelLoad();
        this.mTask = new RunnableC0064a();
        executePendingTask();
    }

    protected D onLoadInBackground() {
        return loadInBackground();
    }

    public void setUpdateThrottle(long j10) {
        this.mUpdateThrottle = j10;
        if (j10 != 0) {
            this.mHandler = new Handler();
        }
    }

    public void waitForLoader() {
        a<D>.RunnableC0064a runnableC0064a = this.mTask;
        if (runnableC0064a != null) {
            runnableC0064a.o();
        }
    }

    private a(Context context, Executor executor) {
        super(context);
        this.mLastLoadCompleteTime = -10000L;
        this.mExecutor = executor;
    }
}
