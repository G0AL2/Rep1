package z0;

import android.database.Cursor;
import android.os.Bundle;

/* compiled from: SupportSQLiteCompat.kt */
/* loaded from: classes.dex */
public final class e {
    static {
        new e();
    }

    private e() {
    }

    public static final void a(Cursor cursor, Bundle bundle) {
        qe.k.f(cursor, "cursor");
        qe.k.f(bundle, "extras");
        cursor.setExtras(bundle);
    }
}
