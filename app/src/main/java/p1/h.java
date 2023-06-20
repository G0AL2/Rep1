package p1;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;

/* compiled from: IdGenerator.kt */
/* loaded from: classes.dex */
public final class h {
    public static final void c(Context context, z0.g gVar) {
        qe.k.f(context, "context");
        qe.k.f(gVar, "sqLiteDatabase");
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.id", 0);
        if (sharedPreferences.contains("next_job_scheduler_id") || sharedPreferences.contains("next_job_scheduler_id")) {
            int i10 = sharedPreferences.getInt("next_job_scheduler_id", 0);
            int i11 = sharedPreferences.getInt("next_alarm_manager_id", 0);
            gVar.m();
            try {
                gVar.I("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i10)});
                gVar.I("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i11)});
                sharedPreferences.edit().clear().apply();
                gVar.H();
            } finally {
                gVar.Q();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int d(WorkDatabase workDatabase, String str) {
        Long b10 = workDatabase.c().b(str);
        int longValue = b10 != null ? (int) b10.longValue() : 0;
        e(workDatabase, str, longValue != Integer.MAX_VALUE ? longValue + 1 : 0);
        return longValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(WorkDatabase workDatabase, String str, int i10) {
        workDatabase.c().a(new o1.d(str, Long.valueOf(i10)));
    }
}
