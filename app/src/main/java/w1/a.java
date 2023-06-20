package w1;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import com.RNFetchBlob.h;
import com.applovin.sdk.AppLovinEventTypes;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

/* compiled from: PathResolver.java */
/* loaded from: classes.dex */
public class a {
    private static String a(ContentResolver contentResolver, Uri uri) {
        Cursor query = contentResolver.query(uri, null, null, null, null);
        query.moveToFirst();
        int columnIndex = query.getColumnIndex("_display_name");
        if (columnIndex >= 0) {
            String string = query.getString(columnIndex);
            query.close();
            return string;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003d  */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String b(android.content.Context r8, android.net.Uri r9, java.lang.String r10, java.lang.String[] r11) {
        /*
            java.lang.String r0 = "_data"
            java.lang.String[] r3 = new java.lang.String[]{r0}
            r7 = 0
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            r6 = 0
            r2 = r9
            r4 = r10
            r5 = r11
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            if (r8 == 0) goto L26
            boolean r9 = r8.moveToFirst()     // Catch: java.lang.Exception -> L24 java.lang.Throwable -> L39
            if (r9 == 0) goto L26
            int r9 = r8.getColumnIndexOrThrow(r0)     // Catch: java.lang.Exception -> L24 java.lang.Throwable -> L39
            java.lang.String r7 = r8.getString(r9)     // Catch: java.lang.Exception -> L24 java.lang.Throwable -> L39
            goto L26
        L24:
            r9 = move-exception
            goto L30
        L26:
            if (r8 == 0) goto L2b
            r8.close()
        L2b:
            return r7
        L2c:
            r9 = move-exception
            goto L3b
        L2e:
            r9 = move-exception
            r8 = r7
        L30:
            r9.printStackTrace()     // Catch: java.lang.Throwable -> L39
            if (r8 == 0) goto L38
            r8.close()
        L38:
            return r7
        L39:
            r9 = move-exception
            r7 = r8
        L3b:
            if (r7 == 0) goto L40
            r7.close()
        L40:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.a.b(android.content.Context, android.net.Uri, java.lang.String, java.lang.String[]):java.lang.String");
    }

    @TargetApi(19)
    public static String c(Context context, Uri uri) {
        String a10;
        Uri uri2 = null;
        if ((Build.VERSION.SDK_INT >= 19) && DocumentsContract.isDocumentUri(context, uri)) {
            if (e(uri)) {
                String[] split = DocumentsContract.getDocumentId(uri).split(":");
                if ("primary".equalsIgnoreCase(split[0])) {
                    return Environment.getExternalStorageDirectory() + "/" + split[1];
                }
            } else if (d(uri)) {
                try {
                    String documentId = DocumentsContract.getDocumentId(uri);
                    if (documentId != null && documentId.startsWith("raw:/")) {
                        return Uri.parse(documentId).getPath();
                    }
                    return b(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(documentId).longValue()), null, null);
                } catch (Exception unused) {
                    return null;
                }
            } else if (g(uri)) {
                String[] split2 = DocumentsContract.getDocumentId(uri).split(":");
                String str = split2[0];
                if ("image".equals(str)) {
                    uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                } else if (DownloadResource.TYPE_VIDEO.equals(str)) {
                    uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                } else if ("audio".equals(str)) {
                    uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                }
                return b(context, uri2, "_id=?", new String[]{split2[1]});
            } else if (AppLovinEventTypes.USER_VIEWED_CONTENT.equalsIgnoreCase(uri.getScheme())) {
                if (f(uri)) {
                    return uri.getLastPathSegment();
                }
                return b(context, uri, null, null);
            } else {
                try {
                    InputStream openInputStream = context.getContentResolver().openInputStream(uri);
                    if (openInputStream != null && (a10 = a(context.getContentResolver(), uri)) != null) {
                        File file = new File(context.getCacheDir(), a10);
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        byte[] bArr = new byte[IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES];
                        while (openInputStream.read(bArr) > 0) {
                            fileOutputStream.write(bArr);
                        }
                        fileOutputStream.close();
                        openInputStream.close();
                        return file.getAbsolutePath();
                    }
                } catch (Exception e10) {
                    h.a(e10.toString());
                    return null;
                }
            }
        } else if (AppLovinEventTypes.USER_VIEWED_CONTENT.equalsIgnoreCase(uri.getScheme())) {
            if (f(uri)) {
                return uri.getLastPathSegment();
            }
            return b(context, uri, null, null);
        } else if ("file".equalsIgnoreCase(uri.getScheme())) {
            return uri.getPath();
        }
        return null;
    }

    public static boolean d(Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    public static boolean e(Uri uri) {
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }

    public static boolean f(Uri uri) {
        return "com.google.android.apps.photos.content".equals(uri.getAuthority());
    }

    public static boolean g(Uri uri) {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }
}
