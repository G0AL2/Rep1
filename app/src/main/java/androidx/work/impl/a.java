package androidx.work.impl;

import android.content.Context;
import java.io.File;

/* compiled from: WorkDatabasePathHelper.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f4472a = new a();

    private a() {
    }

    public final File a(Context context) {
        qe.k.f(context, "context");
        File noBackupFilesDir = context.getNoBackupFilesDir();
        qe.k.e(noBackupFilesDir, "context.noBackupFilesDir");
        return noBackupFilesDir;
    }
}
