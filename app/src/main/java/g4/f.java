package g4;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import com.applovin.sdk.AppLovinEventTypes;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;

/* compiled from: UriUtil.java */
/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private static final Uri f30596a = Uri.withAppendedPath((Uri) f6.a.f(ContactsContract.AUTHORITY_URI), "display_photo");

    public static AssetFileDescriptor a(ContentResolver contentResolver, Uri uri) {
        if (i(uri)) {
            try {
                return contentResolver.openAssetFileDescriptor(uri, "r");
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }

    public static String b(ContentResolver contentResolver, Uri uri) {
        int columnIndex;
        Cursor cursor = null;
        r1 = null;
        r1 = null;
        String string = null;
        if (i(uri)) {
            try {
                Cursor query = contentResolver.query(uri, null, null, null, null);
                if (query != null) {
                    try {
                        if (query.moveToFirst() && (columnIndex = query.getColumnIndex("_data")) != -1) {
                            string = query.getString(columnIndex);
                        }
                    } catch (Throwable th) {
                        th = th;
                        cursor = query;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                if (query != null) {
                    query.close();
                    return string;
                }
                return string;
            } catch (Throwable th2) {
                th = th2;
            }
        } else if (j(uri)) {
            return uri.getPath();
        } else {
            return null;
        }
    }

    public static String c(Uri uri) {
        if (uri == null) {
            return null;
        }
        return uri.getScheme();
    }

    public static Uri d(int i10) {
        return new Uri.Builder().scheme("res").path(String.valueOf(i10)).build();
    }

    public static boolean e(Uri uri) {
        return "data".equals(c(uri));
    }

    public static boolean f(Uri uri) {
        return "asset".equals(c(uri));
    }

    public static boolean g(Uri uri) {
        String uri2 = uri.toString();
        return uri2.startsWith(MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString()) || uri2.startsWith(MediaStore.Images.Media.INTERNAL_CONTENT_URI.toString());
    }

    public static boolean h(Uri uri) {
        return uri.getPath() != null && i(uri) && "com.android.contacts".equals(uri.getAuthority()) && !uri.getPath().startsWith((String) f6.a.f(f30596a.getPath()));
    }

    public static boolean i(Uri uri) {
        return AppLovinEventTypes.USER_VIEWED_CONTENT.equals(c(uri));
    }

    public static boolean j(Uri uri) {
        return "file".equals(c(uri));
    }

    public static boolean k(Uri uri) {
        return "res".equals(c(uri));
    }

    public static boolean l(Uri uri) {
        String c10 = c(uri);
        return "https".equals(c10) || "http".equals(c10);
    }

    public static boolean m(Uri uri) {
        return "android.resource".equals(c(uri));
    }

    public static URL n(Uri uri) {
        if (uri == null) {
            return null;
        }
        try {
            return new URL(uri.toString());
        } catch (MalformedURLException e10) {
            throw new RuntimeException(e10);
        }
    }
}
