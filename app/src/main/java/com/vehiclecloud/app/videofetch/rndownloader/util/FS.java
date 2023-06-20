package com.vehiclecloud.app.videofetch.rndownloader.util;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Log;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/* loaded from: classes3.dex */
public final class FS {
    private static final String MIME_TYPE_MP4 = "video/mp4";
    private static final String TAG = "FS";

    private FS() {
    }

    public static /* synthetic */ void a(String str, Uri uri) {
        lambda$insertResourceToMediaStoreCompat$0(str, uri);
    }

    public static void concat(String str, List<String> list) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(str);
        byte[] bArr = new byte[10240];
        for (String str2 : list) {
            FileInputStream fileInputStream = new FileInputStream(str2);
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read >= 0) {
                    fileOutputStream.write(bArr, 0, read);
                }
            }
            fileInputStream.close();
        }
        fileOutputStream.close();
    }

    public static File createDirectory(String str) {
        if (str == null) {
            return null;
        }
        File file = new File(str);
        if ((file.exists() && file.isDirectory()) || (file.mkdirs() && file.isDirectory())) {
            return file;
        }
        return null;
    }

    public static void deleteRecursive(File file) throws IOException {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                throw new NullPointerException("Received null trying to list files of directory '" + file + "'");
            }
            for (File file2 : listFiles) {
                deleteRecursive(file2);
            }
        }
        if (file.delete()) {
            return;
        }
        throw new IOException("Failed to delete '" + file + "'");
    }

    private static ContentValues getMediaDetails(DownloadResource downloadResource) {
        ContentValues contentValues = new ContentValues();
        String str = downloadResource.title;
        if (str != null) {
            contentValues.put("title", str);
        }
        String str2 = downloadResource.mergedFileName;
        boolean z10 = str2 != null;
        if (!z10) {
            str2 = downloadResource.fileName;
        }
        contentValues.put("_display_name", realFileNameOf(str2, downloadResource.fileExt));
        contentValues.put("mime_type", z10 ? MIME_TYPE_MP4 : downloadResource.mimeType);
        contentValues.put("_size", Long.valueOf(downloadResource.totalBytes));
        contentValues.put("date_added", Long.valueOf(System.currentTimeMillis()));
        int i10 = downloadResource.width;
        if (i10 > 0) {
            contentValues.put("width", Integer.valueOf(i10));
            contentValues.put("height", Integer.valueOf(downloadResource.height));
        }
        return contentValues;
    }

    public static void insertResourceToMediaStore(Context context, DownloadResource downloadResource) throws IOException {
        ContentResolver contentResolver = context.getContentResolver();
        boolean equals = DownloadResource.TYPE_VIDEO.equals(downloadResource.type);
        if (Build.VERSION.SDK_INT >= 29) {
            insertResourceToMediaStoreQ(contentResolver, downloadResource, equals);
        } else {
            insertResourceToMediaStoreCompat(context, contentResolver, downloadResource, equals);
        }
    }

    private static void insertResourceToMediaStoreCompat(Context context, ContentResolver contentResolver, DownloadResource downloadResource, boolean z10) throws IOException {
        Uri uri;
        String str;
        if (z10) {
            uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        } else {
            uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        }
        ContentValues mediaDetails = getMediaDetails(downloadResource);
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM);
        if (externalStoragePublicDirectory.isDirectory()) {
            String asString = mediaDetails.getAsString("_display_name");
            File file = new File(externalStoragePublicDirectory, asString);
            if (asString.indexOf(46) >= 0) {
                String substring = asString.substring(0, asString.lastIndexOf(46));
                str = asString.substring(asString.lastIndexOf(46));
                asString = substring;
            } else {
                str = "";
            }
            int i10 = 0;
            while (!file.createNewFile()) {
                file = new File(externalStoragePublicDirectory, asString + "_" + i10 + str);
                i10++;
            }
            String absolutePath = file.getAbsolutePath();
            mediaDetails.put("_data", absolutePath);
            String str2 = downloadResource.mergedFileName;
            if (str2 == null) {
                str2 = downloadResource.fileName;
            }
            writeMediaStore(contentResolver, uri, mediaDetails, str2);
            MediaScannerConnection.scanFile(context, new String[]{absolutePath}, null, new MediaScannerConnection.OnScanCompletedListener() { // from class: com.vehiclecloud.app.videofetch.rndownloader.util.a
                @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                public final void onScanCompleted(String str3, Uri uri2) {
                    FS.a(str3, uri2);
                }
            });
            return;
        }
        Log.d(TAG, "saveToCameraRoll External media storage directory not available");
        throw new RuntimeException("saveToCameraRoll External media storage directory not available");
    }

    private static void insertResourceToMediaStoreQ(ContentResolver contentResolver, DownloadResource downloadResource, boolean z10) throws IOException {
        Uri contentUri;
        if (z10) {
            contentUri = MediaStore.Video.Media.getContentUri("external_primary");
        } else {
            contentUri = MediaStore.Images.Media.getContentUri("external_primary");
        }
        ContentValues mediaDetails = getMediaDetails(downloadResource);
        mediaDetails.put("datetaken", Long.valueOf(System.currentTimeMillis()));
        mediaDetails.put("is_pending", (Integer) 1);
        int i10 = downloadResource.duration;
        if (i10 > 0) {
            mediaDetails.put("duration", Integer.valueOf(i10));
        }
        String str = downloadResource.mergedFileName;
        if (str == null) {
            str = downloadResource.fileName;
        }
        Uri writeMediaStore = writeMediaStore(contentResolver, contentUri, mediaDetails, str);
        mediaDetails.clear();
        mediaDetails.put("is_pending", (Integer) 0);
        contentResolver.update(writeMediaStore, mediaDetails, null, null);
    }

    public static /* synthetic */ void lambda$insertResourceToMediaStoreCompat$0(String str, Uri uri) {
        if (uri != null) {
            Log.d(TAG, "saveToCameraRoll succeed:" + uri.toString());
            return;
        }
        Log.d(TAG, "saveToCameraRoll failed: Could not add image to gallery");
    }

    public static String realFileNameOf(String str, String str2) {
        String substring = str.substring(str.lastIndexOf(File.separator) + 1);
        if (substring.startsWith(".")) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(substring.substring(1, substring.lastIndexOf(".") + 1));
            if (str2 == null) {
                str2 = "mp4";
            }
            sb2.append(str2);
            return sb2.toString();
        }
        return substring;
    }

    public static void rename(String str, String str2) {
        new File(str).renameTo(new File(str2));
    }

    private static Uri writeMediaStore(ContentResolver contentResolver, Uri uri, ContentValues contentValues, String str) throws IOException {
        Uri insert = contentResolver.insert(uri, contentValues);
        if (insert != null) {
            OutputStream openOutputStream = contentResolver.openOutputStream(insert);
            try {
                FileInputStream fileInputStream = new FileInputStream(str);
                kb.a.a(fileInputStream, openOutputStream);
                fileInputStream.close();
                if (openOutputStream != null) {
                    openOutputStream.close();
                }
                return insert;
            } catch (Throwable th) {
                if (openOutputStream != null) {
                    try {
                        openOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        throw new RuntimeException("mediaUri is null");
    }
}
