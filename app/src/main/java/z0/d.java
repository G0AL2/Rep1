package z0;

import android.content.Context;
import java.io.File;

/* compiled from: SupportSQLiteCompat.kt */
/* loaded from: classes.dex */
public final class d {
    static {
        new d();
    }

    private d() {
    }

    public static final File a(Context context) {
        qe.k.f(context, "context");
        File noBackupFilesDir = context.getNoBackupFilesDir();
        qe.k.e(noBackupFilesDir, "context.noBackupFilesDir");
        return noBackupFilesDir;
    }
}
