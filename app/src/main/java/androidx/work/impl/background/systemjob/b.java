package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.e0;
import androidx.work.impl.t;
import androidx.work.l;
import androidx.work.p;
import androidx.work.u;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import o1.i;
import o1.m;
import o1.u;
import o1.v;
import o1.x;
import p1.g;

/* compiled from: SystemJobScheduler.java */
/* loaded from: classes.dex */
public class b implements t {

    /* renamed from: e  reason: collision with root package name */
    private static final String f4536e = l.i("SystemJobScheduler");

    /* renamed from: a  reason: collision with root package name */
    private final Context f4537a;

    /* renamed from: b  reason: collision with root package name */
    private final JobScheduler f4538b;

    /* renamed from: c  reason: collision with root package name */
    private final e0 f4539c;

    /* renamed from: d  reason: collision with root package name */
    private final a f4540d;

    public b(Context context, e0 e0Var) {
        this(context, e0Var, (JobScheduler) context.getSystemService("jobscheduler"), new a(context));
    }

    public static void b(Context context) {
        List<JobInfo> g10;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler == null || (g10 = g(context, jobScheduler)) == null || g10.isEmpty()) {
            return;
        }
        for (JobInfo jobInfo : g10) {
            d(jobScheduler, jobInfo.getId());
        }
    }

    private static void d(JobScheduler jobScheduler, int i10) {
        try {
            jobScheduler.cancel(i10);
        } catch (Throwable th) {
            l.e().d(f4536e, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i10)), th);
        }
    }

    private static List<Integer> f(Context context, JobScheduler jobScheduler, String str) {
        List<JobInfo> g10 = g(context, jobScheduler);
        if (g10 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo jobInfo : g10) {
            m h10 = h(jobInfo);
            if (h10 != null && str.equals(h10.b())) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    private static List<JobInfo> g(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            l.e().d(f4536e, "getAllPendingJobs() is not reliable on this device.", th);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, SystemJobService.class);
        for (JobInfo jobInfo : list) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    private static m h(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras != null) {
            try {
                if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                    return new m(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
                }
                return null;
            } catch (NullPointerException unused) {
                return null;
            }
        }
        return null;
    }

    public static boolean i(Context context, e0 e0Var) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        List<JobInfo> g10 = g(context, jobScheduler);
        List<String> d10 = e0Var.s().e().d();
        boolean z10 = false;
        HashSet hashSet = new HashSet(g10 != null ? g10.size() : 0);
        if (g10 != null && !g10.isEmpty()) {
            for (JobInfo jobInfo : g10) {
                m h10 = h(jobInfo);
                if (h10 != null) {
                    hashSet.add(h10.b());
                } else {
                    d(jobScheduler, jobInfo.getId());
                }
            }
        }
        Iterator<String> it = d10.iterator();
        while (true) {
            if (it.hasNext()) {
                if (!hashSet.contains(it.next())) {
                    l.e().a(f4536e, "Reconciling jobs");
                    z10 = true;
                    break;
                }
            } else {
                break;
            }
        }
        if (z10) {
            WorkDatabase s10 = e0Var.s();
            s10.beginTransaction();
            try {
                v h11 = s10.h();
                for (String str : d10) {
                    h11.n(str, -1L);
                }
                s10.setTransactionSuccessful();
            } finally {
                s10.endTransaction();
            }
        }
        return z10;
    }

    @Override // androidx.work.impl.t
    public void a(u... uVarArr) {
        int e10;
        List<Integer> f10;
        int e11;
        WorkDatabase s10 = this.f4539c.s();
        g gVar = new g(s10);
        for (u uVar : uVarArr) {
            s10.beginTransaction();
            try {
                u h10 = s10.h().h(uVar.f34905a);
                if (h10 == null) {
                    l.e().k(f4536e, "Skipping scheduling " + uVar.f34905a + " because it's no longer in the DB");
                    s10.setTransactionSuccessful();
                } else if (h10.f34906b != u.a.ENQUEUED) {
                    l.e().k(f4536e, "Skipping scheduling " + uVar.f34905a + " because it is no longer enqueued");
                    s10.setTransactionSuccessful();
                } else {
                    m a10 = x.a(uVar);
                    i g10 = s10.e().g(a10);
                    if (g10 != null) {
                        e10 = g10.f34886c;
                    } else {
                        e10 = gVar.e(this.f4539c.l().i(), this.f4539c.l().g());
                    }
                    if (g10 == null) {
                        this.f4539c.s().e().b(o1.l.a(a10, e10));
                    }
                    j(uVar, e10);
                    if (Build.VERSION.SDK_INT == 23 && (f10 = f(this.f4537a, this.f4538b, uVar.f34905a)) != null) {
                        int indexOf = f10.indexOf(Integer.valueOf(e10));
                        if (indexOf >= 0) {
                            f10.remove(indexOf);
                        }
                        if (!f10.isEmpty()) {
                            e11 = f10.get(0).intValue();
                        } else {
                            e11 = gVar.e(this.f4539c.l().i(), this.f4539c.l().g());
                        }
                        j(uVar, e11);
                    }
                    s10.setTransactionSuccessful();
                }
            } finally {
                s10.endTransaction();
            }
        }
    }

    @Override // androidx.work.impl.t
    public void c(String str) {
        List<Integer> f10 = f(this.f4537a, this.f4538b, str);
        if (f10 == null || f10.isEmpty()) {
            return;
        }
        for (Integer num : f10) {
            d(this.f4538b, num.intValue());
        }
        this.f4539c.s().e().f(str);
    }

    @Override // androidx.work.impl.t
    public boolean e() {
        return true;
    }

    public void j(o1.u uVar, int i10) {
        JobInfo a10 = this.f4540d.a(uVar, i10);
        l e10 = l.e();
        String str = f4536e;
        e10.a(str, "Scheduling work ID " + uVar.f34905a + "Job ID " + i10);
        try {
            if (this.f4538b.schedule(a10) == 0) {
                l e11 = l.e();
                e11.k(str, "Unable to schedule work ID " + uVar.f34905a);
                if (uVar.f34921q && uVar.f34922r == p.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    uVar.f34921q = false;
                    l.e().a(str, String.format("Scheduling a non-expedited job (work ID %s)", uVar.f34905a));
                    j(uVar, i10);
                }
            }
        } catch (IllegalStateException e12) {
            List<JobInfo> g10 = g(this.f4537a, this.f4538b);
            String format = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", Integer.valueOf(g10 != null ? g10.size() : 0), Integer.valueOf(this.f4539c.s().h().d().size()), Integer.valueOf(this.f4539c.l().h()));
            l.e().c(f4536e, format);
            IllegalStateException illegalStateException = new IllegalStateException(format, e12);
            h0.a<Throwable> l10 = this.f4539c.l().l();
            if (l10 != null) {
                l10.accept(illegalStateException);
                return;
            }
            throw illegalStateException;
        } catch (Throwable th) {
            l e13 = l.e();
            String str2 = f4536e;
            e13.d(str2, "Unable to schedule " + uVar, th);
        }
    }

    public b(Context context, e0 e0Var, JobScheduler jobScheduler, a aVar) {
        this.f4537a = context;
        this.f4539c = e0Var;
        this.f4538b = jobScheduler;
        this.f4540d = aVar;
    }
}
