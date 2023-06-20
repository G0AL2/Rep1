package z0;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.List;

/* compiled from: SupportSQLiteCompat.kt */
/* loaded from: classes.dex */
public final class f {
    static {
        new f();
    }

    private f() {
    }

    public static final List<Uri> a(Cursor cursor) {
        qe.k.f(cursor, "cursor");
        List<Uri> notificationUris = cursor.getNotificationUris();
        qe.k.c(notificationUris);
        return notificationUris;
    }

    public static final void b(Cursor cursor, ContentResolver contentResolver, List<? extends Uri> list) {
        qe.k.f(cursor, "cursor");
        qe.k.f(contentResolver, "cr");
        qe.k.f(list, "uris");
        cursor.setNotificationUris(contentResolver, list);
    }
}
