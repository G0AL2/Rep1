package androidx.work.impl;

import android.content.Context;
import android.os.Build;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.List;

/* compiled from: Schedulers.java */
/* loaded from: classes.dex */
public class u {

    /* renamed from: a  reason: collision with root package name */
    private static final String f4655a = androidx.work.l.i("Schedulers");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static t a(Context context, e0 e0Var) {
        if (Build.VERSION.SDK_INT >= 23) {
            androidx.work.impl.background.systemjob.b bVar = new androidx.work.impl.background.systemjob.b(context, e0Var);
            p1.m.a(context, SystemJobService.class, true);
            androidx.work.l.e().a(f4655a, "Created SystemJobScheduler and enabled SystemJobService");
            return bVar;
        }
        t c10 = c(context);
        if (c10 == null) {
            androidx.work.impl.background.systemalarm.h hVar = new androidx.work.impl.background.systemalarm.h(context);
            p1.m.a(context, SystemAlarmService.class, true);
            androidx.work.l.e().a(f4655a, "Created SystemAlarmScheduler");
            return hVar;
        }
        return c10;
    }

    public static void b(androidx.work.b bVar, WorkDatabase workDatabase, List<t> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        o1.v h10 = workDatabase.h();
        workDatabase.beginTransaction();
        try {
            List<o1.u> p10 = h10.p(bVar.h());
            List<o1.u> l10 = h10.l(200);
            if (p10 != null && p10.size() > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                for (o1.u uVar : p10) {
                    h10.n(uVar.f34905a, currentTimeMillis);
                }
            }
            workDatabase.setTransactionSuccessful();
            if (p10 != null && p10.size() > 0) {
                o1.u[] uVarArr = (o1.u[]) p10.toArray(new o1.u[p10.size()]);
                for (t tVar : list) {
                    if (tVar.e()) {
                        tVar.a(uVarArr);
                    }
                }
            }
            if (l10 == null || l10.size() <= 0) {
                return;
            }
            o1.u[] uVarArr2 = (o1.u[]) l10.toArray(new o1.u[l10.size()]);
            for (t tVar2 : list) {
                if (!tVar2.e()) {
                    tVar2.a(uVarArr2);
                }
            }
        } finally {
            workDatabase.endTransaction();
        }
    }

    private static t c(Context context) {
        try {
            t tVar = (t) Class.forName("androidx.work.impl.background.gcm.GcmScheduler").getConstructor(Context.class).newInstance(context);
            androidx.work.l.e().a(f4655a, "Created androidx.work.impl.background.gcm.GcmScheduler");
            return tVar;
        } catch (Throwable th) {
            androidx.work.l.e().b(f4655a, "Unable to create GCM Scheduler", th);
            return null;
        }
    }
}
