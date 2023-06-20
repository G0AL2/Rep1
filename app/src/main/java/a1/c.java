package a1;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.os.CancellationSignal;
import android.text.TextUtils;
import android.util.Pair;
import java.io.IOException;
import java.util.List;
import pe.r;
import qe.k;
import qe.l;
import z0.j;

/* compiled from: FrameworkSQLiteDatabase.kt */
/* loaded from: classes.dex */
public final class c implements z0.g {

    /* renamed from: c */
    private static final String[] f5c;

    /* renamed from: d */
    private static final String[] f6d;

    /* renamed from: a */
    private final SQLiteDatabase f7a;

    /* renamed from: b */
    private final List<Pair<String, String>> f8b;

    /* compiled from: FrameworkSQLiteDatabase.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qe.g gVar) {
            this();
        }
    }

    /* compiled from: FrameworkSQLiteDatabase.kt */
    /* loaded from: classes.dex */
    public static final class b extends l implements r<SQLiteDatabase, SQLiteCursorDriver, String, SQLiteQuery, SQLiteCursor> {

        /* renamed from: a */
        final /* synthetic */ j f9a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(j jVar) {
            super(4);
            this.f9a = jVar;
        }

        @Override // pe.r
        /* renamed from: a */
        public final SQLiteCursor q(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            j jVar = this.f9a;
            k.c(sQLiteQuery);
            jVar.a(new g(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    static {
        new a(null);
        f5c = new String[]{"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
        f6d = new String[0];
    }

    public c(SQLiteDatabase sQLiteDatabase) {
        k.f(sQLiteDatabase, "delegate");
        this.f7a = sQLiteDatabase;
        this.f8b = sQLiteDatabase.getAttachedDbs();
    }

    public static /* synthetic */ Cursor a(j jVar, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        return h(jVar, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
    }

    public static /* synthetic */ Cursor b(r rVar, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        return e(rVar, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
    }

    public static final Cursor e(r rVar, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        k.f(rVar, "$tmp0");
        return (Cursor) rVar.q(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
    }

    public static final Cursor h(j jVar, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        k.f(jVar, "$query");
        k.c(sQLiteQuery);
        jVar.a(new g(sQLiteQuery));
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }

    @Override // z0.g
    public int B0(String str, int i10, ContentValues contentValues, String str2, Object[] objArr) {
        k.f(str, "table");
        k.f(contentValues, "values");
        int i11 = 0;
        if (contentValues.size() != 0) {
            int size = contentValues.size();
            int length = objArr == null ? size : objArr.length + size;
            Object[] objArr2 = new Object[length];
            StringBuilder sb2 = new StringBuilder();
            sb2.append("UPDATE ");
            sb2.append(f5c[i10]);
            sb2.append(str);
            sb2.append(" SET ");
            for (String str3 : contentValues.keySet()) {
                sb2.append(i11 > 0 ? "," : "");
                sb2.append(str3);
                objArr2[i11] = contentValues.get(str3);
                sb2.append("=?");
                i11++;
            }
            if (objArr != null) {
                for (int i12 = size; i12 < length; i12++) {
                    objArr2[i12] = objArr[i12 - size];
                }
            }
            if (!TextUtils.isEmpty(str2)) {
                sb2.append(" WHERE ");
                sb2.append(str2);
            }
            String sb3 = sb2.toString();
            k.e(sb3, "StringBuilder().apply(builderAction).toString()");
            z0.k t02 = t0(sb3);
            z0.a.f39880c.b(t02, objArr2);
            return t02.v();
        }
        throw new IllegalArgumentException("Empty values".toString());
    }

    @Override // z0.g
    public Cursor E(final j jVar, CancellationSignal cancellationSignal) {
        k.f(jVar, "query");
        SQLiteDatabase sQLiteDatabase = this.f7a;
        String b10 = jVar.b();
        String[] strArr = f6d;
        k.c(cancellationSignal);
        return z0.b.c(sQLiteDatabase, b10, strArr, null, cancellationSignal, new SQLiteDatabase.CursorFactory() { // from class: a1.b
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase2, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return c.a(j.this, sQLiteDatabase2, sQLiteCursorDriver, str, sQLiteQuery);
            }
        });
    }

    @Override // z0.g
    public void H() {
        this.f7a.setTransactionSuccessful();
    }

    @Override // z0.g
    public void I(String str, Object[] objArr) throws SQLException {
        k.f(str, "sql");
        k.f(objArr, "bindArgs");
        this.f7a.execSQL(str, objArr);
    }

    @Override // z0.g
    public Cursor I0(String str) {
        k.f(str, "query");
        return x(new z0.a(str));
    }

    @Override // z0.g
    public void J() {
        this.f7a.beginTransactionNonExclusive();
    }

    @Override // z0.g
    public void Q() {
        this.f7a.endTransaction();
    }

    @Override // z0.g
    public boolean S0() {
        return this.f7a.inTransaction();
    }

    @Override // z0.g
    public boolean a1() {
        return z0.b.b(this.f7a);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f7a.close();
    }

    public final boolean d(SQLiteDatabase sQLiteDatabase) {
        k.f(sQLiteDatabase, "sqLiteDatabase");
        return k.a(this.f7a, sQLiteDatabase);
    }

    @Override // z0.g
    public String getPath() {
        return this.f7a.getPath();
    }

    @Override // z0.g
    public boolean isOpen() {
        return this.f7a.isOpen();
    }

    @Override // z0.g
    public void m() {
        this.f7a.beginTransaction();
    }

    @Override // z0.g
    public List<Pair<String, String>> o() {
        return this.f8b;
    }

    @Override // z0.g
    public void s(String str) throws SQLException {
        k.f(str, "sql");
        this.f7a.execSQL(str);
    }

    @Override // z0.g
    public z0.k t0(String str) {
        k.f(str, "sql");
        SQLiteStatement compileStatement = this.f7a.compileStatement(str);
        k.e(compileStatement, "delegate.compileStatement(sql)");
        return new h(compileStatement);
    }

    @Override // z0.g
    public Cursor x(j jVar) {
        k.f(jVar, "query");
        final b bVar = new b(jVar);
        Cursor rawQueryWithFactory = this.f7a.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: a1.a
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return c.b(r.this, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, jVar.b(), f6d, null);
        k.e(rawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return rawQueryWithFactory;
    }
}
