package com.applovin.impl.sdk;

import android.database.Cursor;
import android.database.MatrixCursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/* loaded from: classes.dex */
public class AppLovinContentProviderUtils {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f7954a = {"_display_name", "_size"};

    private static Uri a(String str) {
        return Uri.parse("content://" + (m.M().getPackageName() + ".applovincontentprovider/" + str));
    }

    private static File a(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return null;
        }
        return b(lastPathSegment);
    }

    private static File b(String str) {
        File file = new File(m.M().getCacheDir() + File.separator + "ALContentProviderCache");
        if (!file.exists()) {
            try {
                if (!file.mkdir()) {
                    return null;
                }
            } catch (Throwable unused) {
            }
        }
        return new File(file, str);
    }

    public static Uri cacheJPEGImageWithFileName(Bitmap bitmap, String str) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(b(str));
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            return a(str);
        } catch (Throwable th) {
            if (v.a()) {
                v.i("AppLovinContentProvider", "Failed to create jpeg file '" + str + "' for content provider with exception: " + th);
                return null;
            }
            return null;
        }
    }

    public static Uri cacheTextWithFileName(String str, String str2) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(b(str2));
            fileOutputStream.write(str.getBytes());
            fileOutputStream.close();
            return a(str2);
        } catch (Throwable th) {
            if (v.a()) {
                v.i("AppLovinContentProvider", "Failed to create text file '" + str2 + "' for content provider with exception: " + th);
                return null;
            }
            return null;
        }
    }

    public static String getType(Uri uri) {
        File a10 = a(uri);
        try {
            String substring = a10.getName().substring(a10.getName().indexOf(46) + 1);
            if (MimeTypeMap.getSingleton().hasExtension(substring)) {
                return MimeTypeMap.getSingleton().getMimeTypeFromExtension(substring);
            }
            return null;
        } catch (Throwable th) {
            if (v.a()) {
                v.c("AppLovinContentProvider", "Failed to get file type for '" + uri.toString() + "'", th);
                return null;
            }
            return null;
        }
    }

    public static ParcelFileDescriptor openFile(Uri uri) {
        try {
            return ParcelFileDescriptor.open(a(uri), 268435456);
        } catch (FileNotFoundException e10) {
            if (v.a()) {
                v.c("AppLovinContentProvider", "Failed to open file '" + uri.toString() + "'", e10);
                return null;
            }
            return null;
        }
    }

    public static Cursor query(Uri uri) {
        File a10 = a(uri);
        try {
            MatrixCursor matrixCursor = new MatrixCursor(f7954a, 1);
            matrixCursor.addRow(new Object[]{a10.getName(), Long.valueOf(a10.length())});
            return matrixCursor;
        } catch (Throwable th) {
            if (v.a()) {
                v.c("AppLovinContentProvider", "Failed to query file '" + uri.toString() + "'", th);
                return null;
            }
            return null;
        }
    }
}
