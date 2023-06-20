package z0;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.CancellationSignal;
import java.io.File;

/* compiled from: SupportSQLiteCompat.kt */
/* loaded from: classes.dex */
public final class b {
    static {
        new b();
    }

    private b() {
    }

    public static final boolean a(File file) {
        qe.k.f(file, "file");
        return SQLiteDatabase.deleteDatabase(file);
    }

    public static final boolean b(SQLiteDatabase sQLiteDatabase) {
        qe.k.f(sQLiteDatabase, "sQLiteDatabase");
        return sQLiteDatabase.isWriteAheadLoggingEnabled();
    }

    public static final Cursor c(SQLiteDatabase sQLiteDatabase, String str, String[] strArr, String str2, CancellationSignal cancellationSignal, SQLiteDatabase.CursorFactory cursorFactory) {
        qe.k.f(sQLiteDatabase, "sQLiteDatabase");
        qe.k.f(str, "sql");
        qe.k.f(strArr, "selectionArgs");
        qe.k.f(cancellationSignal, "cancellationSignal");
        qe.k.f(cursorFactory, "cursorFactory");
        Cursor rawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(cursorFactory, str, strArr, str2, cancellationSignal);
        qe.k.e(rawQueryWithFactory, "sQLiteDatabase.rawQueryW…ationSignal\n            )");
        return rawQueryWithFactory;
    }

    public static final void d(SQLiteOpenHelper sQLiteOpenHelper, boolean z10) {
        qe.k.f(sQLiteOpenHelper, "sQLiteOpenHelper");
        sQLiteOpenHelper.setWriteAheadLoggingEnabled(z10);
    }
}
