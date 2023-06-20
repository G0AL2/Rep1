package androidx.work.impl;

/* compiled from: WorkDatabaseMigrations.kt */
/* loaded from: classes.dex */
public final class l extends x0.b {

    /* renamed from: a  reason: collision with root package name */
    public static final l f4627a = new l();

    private l() {
        super(6, 7);
    }

    @Override // x0.b
    public void migrate(z0.g gVar) {
        qe.k.f(gVar, "database");
        gVar.s("\n    CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress`\n    BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
    }
}
