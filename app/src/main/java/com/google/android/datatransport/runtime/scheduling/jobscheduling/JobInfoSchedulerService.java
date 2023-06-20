package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import w7.o;
import w7.t;

/* loaded from: classes2.dex */
public class JobInfoSchedulerService extends JobService {
    public static /* synthetic */ void a(JobInfoSchedulerService jobInfoSchedulerService, JobParameters jobParameters) {
        jobInfoSchedulerService.b(jobParameters);
    }

    public /* synthetic */ void b(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(final JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i10 = jobParameters.getExtras().getInt("priority");
        int i11 = jobParameters.getExtras().getInt("attemptNumber");
        t.f(getApplicationContext());
        o.a d10 = o.a().b(string).d(i8.a.b(i10));
        if (string2 != null) {
            d10.c(Base64.decode(string2, 0));
        }
        t.c().e().v(d10.a(), i11, new Runnable() { // from class: e8.d
            @Override // java.lang.Runnable
            public final void run() {
                JobInfoSchedulerService.a(JobInfoSchedulerService.this, jobParameters);
            }
        });
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
