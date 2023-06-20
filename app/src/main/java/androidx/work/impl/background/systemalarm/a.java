package androidx.work.impl.background.systemalarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import androidx.work.l;
import o1.i;
import o1.j;
import o1.m;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Alarms.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f4485a = l.i("Alarms");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Alarms.java */
    /* renamed from: androidx.work.impl.background.systemalarm.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0083a {
        static void a(AlarmManager alarmManager, int i10, long j10, PendingIntent pendingIntent) {
            alarmManager.setExact(i10, j10, pendingIntent);
        }
    }

    public static void a(Context context, WorkDatabase workDatabase, m mVar) {
        j e10 = workDatabase.e();
        i g10 = e10.g(mVar);
        if (g10 != null) {
            b(context, mVar, g10.f34886c);
            l e11 = l.e();
            String str = f4485a;
            e11.a(str, "Removing SystemIdInfo for workSpecId (" + mVar + ")");
            e10.a(mVar);
        }
    }

    private static void b(Context context, m mVar, int i10) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i10, b.b(context, mVar), Build.VERSION.SDK_INT >= 23 ? 603979776 : 536870912);
        if (service == null || alarmManager == null) {
            return;
        }
        l e10 = l.e();
        String str = f4485a;
        e10.a(str, "Cancelling existing alarm with (workSpecId, systemId) (" + mVar + ", " + i10 + ")");
        alarmManager.cancel(service);
    }

    public static void c(Context context, WorkDatabase workDatabase, m mVar, long j10) {
        j e10 = workDatabase.e();
        i g10 = e10.g(mVar);
        if (g10 != null) {
            b(context, mVar, g10.f34886c);
            d(context, mVar, g10.f34886c, j10);
            return;
        }
        int c10 = new p1.g(workDatabase).c();
        e10.b(o1.l.a(mVar, c10));
        d(context, mVar, c10, j10);
    }

    private static void d(Context context, m mVar, int i10, long j10) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i11 = Build.VERSION.SDK_INT;
        PendingIntent service = PendingIntent.getService(context, i10, b.b(context, mVar), i11 >= 23 ? 201326592 : 134217728);
        if (alarmManager != null) {
            if (i11 >= 19) {
                C0083a.a(alarmManager, 0, j10, service);
            } else {
                alarmManager.set(0, j10, service);
            }
        }
    }
}
