package androidx.work.impl;

/* compiled from: WorkDatabaseMigrations.kt */
/* loaded from: classes.dex */
public final class g extends x0.b {

    /* renamed from: a  reason: collision with root package name */
    public static final g f4587a = new g();

    private g() {
        super(12, 13);
    }

    @Override // x0.b
    public void migrate(z0.g gVar) {
        qe.k.f(gVar, "database");
        gVar.s("UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ");
        gVar.s("UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL");
    }
}
