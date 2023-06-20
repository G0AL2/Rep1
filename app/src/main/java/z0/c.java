package z0;

import android.app.ActivityManager;
import android.database.Cursor;
import android.net.Uri;

/* compiled from: SupportSQLiteCompat.kt */
/* loaded from: classes.dex */
public final class c {
    static {
        new c();
    }

    private c() {
    }

    public static final Uri a(Cursor cursor) {
        qe.k.f(cursor, "cursor");
        Uri notificationUri = cursor.getNotificationUri();
        qe.k.e(notificationUri, "cursor.notificationUri");
        return notificationUri;
    }

    public static final boolean b(ActivityManager activityManager) {
        qe.k.f(activityManager, "activityManager");
        return activityManager.isLowRamDevice();
    }
}
