package androidx.work.impl;

import android.os.Build;

/* compiled from: WorkDatabaseMigrations.kt */
/* loaded from: classes.dex */
public final class j extends x0.b {

    /* renamed from: a  reason: collision with root package name */
    public static final j f4625a = new j();

    private j() {
        super(3, 4);
    }

    @Override // x0.b
    public void migrate(z0.g gVar) {
        qe.k.f(gVar, "database");
        if (Build.VERSION.SDK_INT >= 23) {
            gVar.s("\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    ");
        }
    }
}
