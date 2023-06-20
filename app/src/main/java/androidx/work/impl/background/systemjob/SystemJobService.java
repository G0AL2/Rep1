package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.net.Network;
import android.net.Uri;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.WorkerParameters;
import androidx.work.impl.e;
import androidx.work.impl.e0;
import androidx.work.impl.v;
import androidx.work.impl.w;
import androidx.work.l;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import o1.m;

/* loaded from: classes.dex */
public class SystemJobService extends JobService implements e {

    /* renamed from: d  reason: collision with root package name */
    private static final String f4529d = l.i("SystemJobService");

    /* renamed from: a  reason: collision with root package name */
    private e0 f4530a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<m, JobParameters> f4531b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private final w f4532c = new w();

    /* loaded from: classes.dex */
    static class a {
        static String[] a(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentAuthorities();
        }

        static Uri[] b(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentUris();
        }
    }

    /* loaded from: classes.dex */
    static class b {
        static Network a(JobParameters jobParameters) {
            return jobParameters.getNetwork();
        }
    }

    private static m a(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new m(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // androidx.work.impl.e
    public void d(m mVar, boolean z10) {
        JobParameters remove;
        l e10 = l.e();
        String str = f4529d;
        e10.a(str, mVar.b() + " executed on JobScheduler");
        synchronized (this.f4531b) {
            remove = this.f4531b.remove(mVar);
        }
        this.f4532c.b(mVar);
        if (remove != null) {
            jobFinished(remove, z10);
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            e0 n10 = e0.n(getApplicationContext());
            this.f4530a = n10;
            n10.p().g(this);
        } catch (IllegalStateException unused) {
            if (Application.class.equals(getApplication().getClass())) {
                l.e().k(f4529d, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
                return;
            }
            throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        e0 e0Var = this.f4530a;
        if (e0Var != null) {
            e0Var.p().n(this);
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        if (this.f4530a == null) {
            l.e().a(f4529d, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        m a10 = a(jobParameters);
        if (a10 == null) {
            l.e().c(f4529d, "WorkSpec id not found!");
            return false;
        }
        synchronized (this.f4531b) {
            if (this.f4531b.containsKey(a10)) {
                l e10 = l.e();
                String str = f4529d;
                e10.a(str, "Job is already being executed by SystemJobService: " + a10);
                return false;
            }
            l e11 = l.e();
            String str2 = f4529d;
            e11.a(str2, "onStartJob for " + a10);
            this.f4531b.put(a10, jobParameters);
            WorkerParameters.a aVar = null;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 24) {
                aVar = new WorkerParameters.a();
                if (a.b(jobParameters) != null) {
                    aVar.f4399b = Arrays.asList(a.b(jobParameters));
                }
                if (a.a(jobParameters) != null) {
                    aVar.f4398a = Arrays.asList(a.a(jobParameters));
                }
                if (i10 >= 28) {
                    aVar.f4400c = b.a(jobParameters);
                }
            }
            this.f4530a.z(this.f4532c.d(a10), aVar);
            return true;
        }
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        if (this.f4530a == null) {
            l.e().a(f4529d, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        m a10 = a(jobParameters);
        if (a10 == null) {
            l.e().c(f4529d, "WorkSpec id not found!");
            return false;
        }
        l e10 = l.e();
        String str = f4529d;
        e10.a(str, "onStopJob for " + a10);
        synchronized (this.f4531b) {
            this.f4531b.remove(a10);
        }
        v b10 = this.f4532c.b(a10);
        if (b10 != null) {
            this.f4530a.B(b10);
        }
        return !this.f4530a.p().j(a10.b());
    }
}
