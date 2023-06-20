package androidx.work.impl;

import android.content.Context;

/* compiled from: WorkDatabaseMigrations.kt */
/* loaded from: classes.dex */
public final class f0 extends x0.b {

    /* renamed from: a  reason: collision with root package name */
    private final Context f4559a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(Context context) {
        super(9, 10);
        qe.k.f(context, "context");
        this.f4559a = context;
    }

    @Override // x0.b
    public void migrate(z0.g gVar) {
        qe.k.f(gVar, "database");
        gVar.s("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        p1.n.c(this.f4559a, gVar);
        p1.h.c(this.f4559a, gVar);
    }
}
