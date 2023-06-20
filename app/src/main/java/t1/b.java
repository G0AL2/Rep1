package t1;

import android.app.Application;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import androidx.core.content.FileProvider;
import com.applovin.sdk.AppLovinEventTypes;
import com.facebook.react.bridge.ReactContext;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;

/* compiled from: RNSharePathUtil.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static final ArrayList<String> f37076a = new ArrayList<>();

    public static Uri a(ReactContext reactContext, File file) {
        b(reactContext);
        String authority = Uri.fromFile(file).getAuthority();
        if (!TextUtils.isEmpty(authority) && f37076a.contains(authority)) {
            return Uri.fromFile(file);
        }
        if (file.getAbsolutePath().startsWith("content://")) {
            return Uri.fromFile(file);
        }
        Uri uri = null;
        int i10 = 0;
        while (true) {
            ArrayList<String> arrayList = f37076a;
            if (i10 >= arrayList.size()) {
                break;
            }
            try {
                uri = FileProvider.e(reactContext, arrayList.get(i10), file);
            } catch (Exception e10) {
                PrintStream printStream = System.out;
                printStream.println("RNSharePathUtil::compatUriFromFile ERROR " + e10.getMessage());
            }
            if (uri != null) {
                break;
            }
            i10++;
        }
        return uri;
    }

    public static void b(ReactContext reactContext) {
        ArrayList<String> arrayList = f37076a;
        if (arrayList.size() == 0) {
            Application application = (Application) reactContext.getApplicationContext();
            if (application instanceof c) {
                arrayList.add(((c) application).a());
            }
            arrayList.add(reactContext.getPackageName() + ".rnshare.fileprovider");
        }
    }

    public static String c(Context context, Uri uri, String str, String[] strArr) {
        Cursor cursor = null;
        try {
            Cursor loadInBackground = new androidx.loader.content.b(context, uri, new String[]{"_data"}, str, strArr, null).loadInBackground();
            if (loadInBackground != null) {
                try {
                    if (loadInBackground.moveToFirst()) {
                        String string = loadInBackground.getString(loadInBackground.getColumnIndexOrThrow("_data"));
                        loadInBackground.close();
                        return string;
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = loadInBackground;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (loadInBackground != null) {
                loadInBackground.close();
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static String d(Context context, Uri uri, Boolean bool) {
        Uri uri2 = null;
        if (Build.VERSION.SDK_INT >= 19 && DocumentsContract.isDocumentUri(context, uri)) {
            if (f(uri)) {
                String[] split = DocumentsContract.getDocumentId(uri).split(":");
                String str = split[0];
                if (!"primary".equalsIgnoreCase(str) && !"0".equalsIgnoreCase(str)) {
                    if ("raw".equalsIgnoreCase(str)) {
                        return "" + split[1];
                    } else if (!TextUtils.isEmpty(str)) {
                        return "/storage/" + str + "/" + split[1];
                    }
                } else {
                    File cacheDir = bool.booleanValue() ? context.getCacheDir() : context.getExternalCacheDir();
                    return "" + cacheDir + "/" + split[1];
                }
            } else if (e(uri)) {
                String documentId = DocumentsContract.getDocumentId(uri);
                if (documentId.startsWith("raw:")) {
                    return "" + documentId.replaceFirst("raw:", "");
                }
                Uri withAppendedId = ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(documentId).longValue());
                return "" + c(context, withAppendedId, null, null);
            } else if (h(uri)) {
                String[] split2 = DocumentsContract.getDocumentId(uri).split(":");
                String str2 = split2[0];
                if ("image".equals(str2)) {
                    uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                } else if (DownloadResource.TYPE_VIDEO.equals(str2)) {
                    uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                } else if ("audio".equals(str2)) {
                    uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                } else if ("raw".equalsIgnoreCase(str2)) {
                    return "" + split2[1];
                }
                String[] strArr = {split2[1]};
                return "" + c(context, uri2, "_id=?", strArr);
            }
        } else if (AppLovinEventTypes.USER_VIEWED_CONTENT.equalsIgnoreCase(uri.getScheme())) {
            if (g(uri)) {
                return uri.getLastPathSegment();
            }
            return "" + c(context, uri, null, null);
        } else if ("file".equalsIgnoreCase(uri.getScheme())) {
            return uri.getPath();
        }
        return null;
    }

    public static boolean e(Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    public static boolean f(Uri uri) {
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }

    public static boolean g(Uri uri) {
        return "com.google.android.apps.photos.content".equals(uri.getAuthority());
    }

    public static boolean h(Uri uri) {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }
}
