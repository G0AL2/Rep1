package a1;

import android.database.sqlite.SQLiteStatement;
import z0.k;

/* compiled from: FrameworkSQLiteStatement.kt */
/* loaded from: classes.dex */
public final class h extends g implements k {

    /* renamed from: b  reason: collision with root package name */
    private final SQLiteStatement f40b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        qe.k.f(sQLiteStatement, "delegate");
        this.f40b = sQLiteStatement;
    }

    @Override // z0.k
    public long l0() {
        return this.f40b.executeInsert();
    }

    @Override // z0.k
    public int v() {
        return this.f40b.executeUpdateDelete();
    }
}
