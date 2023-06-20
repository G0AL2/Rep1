package androidx.work.impl;

/* compiled from: WorkDatabaseMigrations.kt */
/* loaded from: classes.dex */
public final class n extends x0.b {

    /* renamed from: a  reason: collision with root package name */
    public static final n f4629a = new n();

    private n() {
        super(8, 9);
    }

    @Override // x0.b
    public void migrate(z0.g gVar) {
        qe.k.f(gVar, "database");
        gVar.s("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
    }
}
