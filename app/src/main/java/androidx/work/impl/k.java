package androidx.work.impl;

/* compiled from: WorkDatabaseMigrations.kt */
/* loaded from: classes.dex */
public final class k extends x0.b {

    /* renamed from: a  reason: collision with root package name */
    public static final k f4626a = new k();

    private k() {
        super(4, 5);
    }

    @Override // x0.b
    public void migrate(z0.g gVar) {
        qe.k.f(gVar, "database");
        gVar.s("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
        gVar.s("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
    }
}
