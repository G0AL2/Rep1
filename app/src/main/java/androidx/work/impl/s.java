package androidx.work.impl;

import android.content.Context;

/* compiled from: WorkDatabaseMigrations.kt */
/* loaded from: classes.dex */
public final class s extends x0.b {

    /* renamed from: a  reason: collision with root package name */
    private final Context f4654a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Context context, int i10, int i11) {
        super(i10, i11);
        qe.k.f(context, "mContext");
        this.f4654a = context;
    }

    @Override // x0.b
    public void migrate(z0.g gVar) {
        qe.k.f(gVar, "database");
        if (this.endVersion >= 10) {
            gVar.I("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
        } else {
            this.f4654a.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
        }
    }
}
