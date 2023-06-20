package androidx.work;

import android.content.Context;
import android.net.Network;
import android.net.Uri;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* compiled from: ListenableWorker.java */
/* loaded from: classes.dex */
public abstract class k {
    private Context mAppContext;
    private volatile boolean mStopped;
    private boolean mUsed;
    private WorkerParameters mWorkerParams;

    /* compiled from: ListenableWorker.java */
    /* loaded from: classes.dex */
    public static abstract class a {

        /* compiled from: ListenableWorker.java */
        /* renamed from: androidx.work.k$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0088a extends a {

            /* renamed from: a  reason: collision with root package name */
            private final e f4712a;

            public C0088a() {
                this(e.f4450c);
            }

            public e e() {
                return this.f4712a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0088a.class != obj.getClass()) {
                    return false;
                }
                return this.f4712a.equals(((C0088a) obj).f4712a);
            }

            public int hashCode() {
                return (C0088a.class.getName().hashCode() * 31) + this.f4712a.hashCode();
            }

            public String toString() {
                return "Failure {mOutputData=" + this.f4712a + '}';
            }

            public C0088a(e eVar) {
                this.f4712a = eVar;
            }
        }

        /* compiled from: ListenableWorker.java */
        /* loaded from: classes.dex */
        public static final class b extends a {
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && b.class == obj.getClass();
            }

            public int hashCode() {
                return b.class.getName().hashCode();
            }

            public String toString() {
                return "Retry";
            }
        }

        /* compiled from: ListenableWorker.java */
        /* loaded from: classes.dex */
        public static final class c extends a {

            /* renamed from: a  reason: collision with root package name */
            private final e f4713a;

            public c() {
                this(e.f4450c);
            }

            public e e() {
                return this.f4713a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || c.class != obj.getClass()) {
                    return false;
                }
                return this.f4713a.equals(((c) obj).f4713a);
            }

            public int hashCode() {
                return (c.class.getName().hashCode() * 31) + this.f4713a.hashCode();
            }

            public String toString() {
                return "Success {mOutputData=" + this.f4713a + '}';
            }

            public c(e eVar) {
                this.f4713a = eVar;
            }
        }

        a() {
        }

        public static a a() {
            return new C0088a();
        }

        public static a b() {
            return new b();
        }

        public static a c() {
            return new c();
        }

        public static a d(e eVar) {
            return new c(eVar);
        }
    }

    public k(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters != null) {
            this.mAppContext = context;
            this.mWorkerParams = workerParameters;
            return;
        }
        throw new IllegalArgumentException("WorkerParameters is null");
    }

    public final Context getApplicationContext() {
        return this.mAppContext;
    }

    public Executor getBackgroundExecutor() {
        return this.mWorkerParams.a();
    }

    public com.google.common.util.concurrent.c<g> getForegroundInfoAsync() {
        androidx.work.impl.utils.futures.c t10 = androidx.work.impl.utils.futures.c.t();
        t10.q(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return t10;
    }

    public final UUID getId() {
        return this.mWorkerParams.c();
    }

    public final e getInputData() {
        return this.mWorkerParams.d();
    }

    public final Network getNetwork() {
        return this.mWorkerParams.e();
    }

    public final int getRunAttemptCount() {
        return this.mWorkerParams.g();
    }

    public final Set<String> getTags() {
        return this.mWorkerParams.h();
    }

    public q1.c getTaskExecutor() {
        return this.mWorkerParams.i();
    }

    public final List<String> getTriggeredContentAuthorities() {
        return this.mWorkerParams.j();
    }

    public final List<Uri> getTriggeredContentUris() {
        return this.mWorkerParams.k();
    }

    public y getWorkerFactory() {
        return this.mWorkerParams.l();
    }

    public final boolean isStopped() {
        return this.mStopped;
    }

    public final boolean isUsed() {
        return this.mUsed;
    }

    public void onStopped() {
    }

    public final com.google.common.util.concurrent.c<Void> setForegroundAsync(g gVar) {
        return this.mWorkerParams.b().a(getApplicationContext(), getId(), gVar);
    }

    public com.google.common.util.concurrent.c<Void> setProgressAsync(e eVar) {
        return this.mWorkerParams.f().a(getApplicationContext(), getId(), eVar);
    }

    public final void setUsed() {
        this.mUsed = true;
    }

    public abstract com.google.common.util.concurrent.c<a> startWork();

    public final void stop() {
        this.mStopped = true;
        onStopped();
    }
}
