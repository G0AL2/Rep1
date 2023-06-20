package androidx.room;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: SharedSQLiteStatement.kt */
/* loaded from: classes.dex */
public abstract class t0 {
    private final k0 database;
    private final AtomicBoolean lock;
    private final ee.h stmt$delegate;

    /* compiled from: SharedSQLiteStatement.kt */
    /* loaded from: classes.dex */
    static final class a extends qe.l implements pe.a<z0.k> {
        a() {
            super(0);
        }

        @Override // pe.a
        /* renamed from: a */
        public final z0.k invoke() {
            return t0.this.createNewStatement();
        }
    }

    public t0(k0 k0Var) {
        ee.h a10;
        qe.k.f(k0Var, "database");
        this.database = k0Var;
        this.lock = new AtomicBoolean(false);
        a10 = ee.j.a(new a());
        this.stmt$delegate = a10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final z0.k createNewStatement() {
        return this.database.compileStatement(createQuery());
    }

    private final z0.k getStmt() {
        return (z0.k) this.stmt$delegate.getValue();
    }

    public z0.k acquire() {
        assertNotMainThread();
        return getStmt(this.lock.compareAndSet(false, true));
    }

    protected void assertNotMainThread() {
        this.database.assertNotMainThread();
    }

    protected abstract String createQuery();

    public void release(z0.k kVar) {
        qe.k.f(kVar, "statement");
        if (kVar == getStmt()) {
            this.lock.set(false);
        }
    }

    private final z0.k getStmt(boolean z10) {
        if (z10) {
            return getStmt();
        }
        return createNewStatement();
    }
}
