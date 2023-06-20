package androidx.work.impl;

import androidx.room.k0;

/* compiled from: WorkDatabase.kt */
/* loaded from: classes.dex */
public final class c extends k0.b {

    /* renamed from: a  reason: collision with root package name */
    public static final c f4541a = new c();

    private c() {
    }

    private final String e() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < " + d() + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }

    @Override // androidx.room.k0.b
    public void c(z0.g gVar) {
        qe.k.f(gVar, "db");
        super.c(gVar);
        gVar.m();
        try {
            gVar.s(e());
            gVar.H();
        } finally {
            gVar.Q();
        }
    }

    public final long d() {
        long j10;
        long currentTimeMillis = System.currentTimeMillis();
        j10 = z.f4711a;
        return currentTimeMillis - j10;
    }
}
