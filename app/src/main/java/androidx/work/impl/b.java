package androidx.work.impl;

import android.content.ContentValues;

/* compiled from: WorkDatabaseMigrations.kt */
/* loaded from: classes.dex */
public final class b implements x0.a {
    @Override // x0.a
    public void a(z0.g gVar) {
        qe.k.f(gVar, "db");
        gVar.s("UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0");
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("last_enqueue_time", Long.valueOf(System.currentTimeMillis()));
        gVar.B0("WorkSpec", 3, contentValues, "last_enqueue_time = 0 AND interval_duration <> 0 ", new Object[0]);
    }
}
