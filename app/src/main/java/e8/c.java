package e8;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;

/* compiled from: JobInfoScheduler.java */
/* loaded from: classes2.dex */
public class c implements v {

    /* renamed from: a  reason: collision with root package name */
    private final Context f29586a;

    /* renamed from: b  reason: collision with root package name */
    private final f8.d f29587b;

    /* renamed from: c  reason: collision with root package name */
    private final com.google.android.datatransport.runtime.scheduling.jobscheduling.c f29588c;

    public c(Context context, f8.d dVar, com.google.android.datatransport.runtime.scheduling.jobscheduling.c cVar) {
        this.f29586a = context;
        this.f29587b = dVar;
        this.f29588c = cVar;
    }

    private boolean d(JobScheduler jobScheduler, int i10, int i11) {
        for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
            int i12 = jobInfo.getExtras().getInt("attemptNumber");
            if (jobInfo.getId() == i10) {
                return i12 >= i11;
            }
        }
        return false;
    }

    @Override // e8.v
    public void a(w7.o oVar, int i10) {
        b(oVar, i10, false);
    }

    @Override // e8.v
    public void b(w7.o oVar, int i10, boolean z10) {
        ComponentName componentName = new ComponentName(this.f29586a, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f29586a.getSystemService("jobscheduler");
        int c10 = c(oVar);
        if (!z10 && d(jobScheduler, c10, i10)) {
            b8.a.a("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", oVar);
            return;
        }
        long V0 = this.f29587b.V0(oVar);
        JobInfo.Builder c11 = this.f29588c.c(new JobInfo.Builder(c10, componentName), oVar.d(), V0, i10);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i10);
        persistableBundle.putString("backendName", oVar.b());
        persistableBundle.putInt("priority", i8.a.a(oVar.d()));
        if (oVar.c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(oVar.c(), 0));
        }
        c11.setExtras(persistableBundle);
        b8.a.b("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", oVar, Integer.valueOf(c10), Long.valueOf(this.f29588c.g(oVar.d(), V0, i10)), Long.valueOf(V0), Integer.valueOf(i10));
        jobScheduler.schedule(c11.build());
    }

    int c(w7.o oVar) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f29586a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(oVar.b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(i8.a.a(oVar.d())).array());
        if (oVar.c() != null) {
            adler32.update(oVar.c());
        }
        return (int) adler32.getValue();
    }
}
