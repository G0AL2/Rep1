package androidx.work.impl;

/* compiled from: WorkDatabaseMigrations.kt */
/* loaded from: classes.dex */
public final class h extends x0.b {

    /* renamed from: a  reason: collision with root package name */
    public static final h f4590a = new h();

    private h() {
        super(15, 16);
    }

    @Override // x0.b
    public void migrate(z0.g gVar) {
        qe.k.f(gVar, "database");
        gVar.s("DELETE FROM SystemIdInfo WHERE work_spec_id IN (SELECT work_spec_id FROM SystemIdInfo LEFT JOIN WorkSpec ON work_spec_id = id WHERE WorkSpec.id IS NULL)");
        gVar.s("ALTER TABLE `WorkSpec` ADD COLUMN `generation` INTEGER NOT NULL DEFAULT 0");
        gVar.s("CREATE TABLE IF NOT EXISTS `_new_SystemIdInfo` (\n            `work_spec_id` TEXT NOT NULL, \n            `generation` INTEGER NOT NULL DEFAULT 0, \n            `system_id` INTEGER NOT NULL, \n            PRIMARY KEY(`work_spec_id`, `generation`), \n            FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) \n                ON UPDATE CASCADE ON DELETE CASCADE )");
        gVar.s("INSERT INTO `_new_SystemIdInfo` (`work_spec_id`,`system_id`) SELECT `work_spec_id`,`system_id` FROM `SystemIdInfo`");
        gVar.s("DROP TABLE `SystemIdInfo`");
        gVar.s("ALTER TABLE `_new_SystemIdInfo` RENAME TO `SystemIdInfo`");
    }
}
