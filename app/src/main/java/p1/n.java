package p1;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;

/* compiled from: PreferenceUtils.java */
/* loaded from: classes.dex */
public class n {

    /* renamed from: a  reason: collision with root package name */
    private final WorkDatabase f35457a;

    public n(WorkDatabase workDatabase) {
        this.f35457a = workDatabase;
    }

    public static void c(Context context, z0.g gVar) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
        if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long j10 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
            long j11 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
            gVar.m();
            try {
                gVar.I("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j10)});
                gVar.I("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j11)});
                sharedPreferences.edit().clear().apply();
                gVar.H();
            } finally {
                gVar.Q();
            }
        }
    }

    public long a() {
        Long b10 = this.f35457a.c().b("last_force_stop_ms");
        if (b10 != null) {
            return b10.longValue();
        }
        return 0L;
    }

    public boolean b() {
        Long b10 = this.f35457a.c().b("reschedule_needed");
        return b10 != null && b10.longValue() == 1;
    }

    public void d(long j10) {
        this.f35457a.c().a(new o1.d("last_force_stop_ms", Long.valueOf(j10)));
    }

    public void e(boolean z10) {
        this.f35457a.c().a(new o1.d("reschedule_needed", z10));
    }
}
