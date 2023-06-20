package z0;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.os.CancellationSignal;
import android.util.Pair;
import java.io.Closeable;
import java.util.List;

/* compiled from: SupportSQLiteDatabase.kt */
/* loaded from: classes.dex */
public interface g extends Closeable {
    int B0(String str, int i10, ContentValues contentValues, String str2, Object[] objArr);

    Cursor E(j jVar, CancellationSignal cancellationSignal);

    void H();

    void I(String str, Object[] objArr) throws SQLException;

    Cursor I0(String str);

    void J();

    void Q();

    boolean S0();

    boolean a1();

    String getPath();

    boolean isOpen();

    void m();

    List<Pair<String, String>> o();

    void s(String str) throws SQLException;

    k t0(String str);

    Cursor x(j jVar);
}
