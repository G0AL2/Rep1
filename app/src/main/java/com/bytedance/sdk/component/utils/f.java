package com.bytedance.sdk.component.utils;

import android.content.Context;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* compiled from: FileUtils.java */
/* loaded from: classes.dex */
public class f {

    /* compiled from: FileUtils.java */
    /* renamed from: com.bytedance.sdk.component.utils.f$1  reason: invalid class name */
    /* loaded from: classes.dex */
    static class AnonymousClass1 implements Comparator<File> {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(File file, File file2) {
            int i10 = ((file2.lastModified() - file.lastModified()) > 0L ? 1 : ((file2.lastModified() - file.lastModified()) == 0L ? 0 : -1));
            if (i10 == 0) {
                return 0;
            }
            return i10 < 0 ? -1 : 1;
        }
    }

    /* compiled from: FileUtils.java */
    /* loaded from: classes.dex */
    private static final class a implements Comparator<File> {
        private a() {
        }

        private int a(long j10, long j11) {
            int i10 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
            if (i10 < 0) {
                return -1;
            }
            return i10 == 0 ? 0 : 1;
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(File file, File file2) {
            return a(file.lastModified(), file2.lastModified());
        }

        /* synthetic */ a(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public static File a(Context context, boolean z10, String str, String str2) {
        String b10 = b(context);
        if (z10) {
            str = a(context) + Constants.FILENAME_SEQUENCE_SEPARATOR + str;
        }
        if (b10 != null) {
            String str3 = File.separator;
            if (!b10.endsWith(str3)) {
                b10 = b10 + str3;
            }
        }
        String str4 = b10 + str;
        File file = new File(str4);
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(str4, str2);
    }

    private static String b(Context context) {
        File cacheDir;
        if (context == null || (cacheDir = context.getCacheDir()) == null) {
            return null;
        }
        return cacheDir.getPath();
    }

    public static void c(File file) {
        if (file == null || !file.exists()) {
            return;
        }
        try {
            if (file.isFile()) {
                file.delete();
            } else {
                File[] listFiles = file.listFiles();
                if (listFiles != null && listFiles.length > 0) {
                    for (File file2 : listFiles) {
                        if (file2.isDirectory()) {
                            c(file2);
                        } else {
                            try {
                                file2.delete();
                            } catch (Throwable unused) {
                            }
                        }
                    }
                }
                file.delete();
            }
        } catch (Throwable unused2) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
        if (r2 == null) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] d(java.io.File r7) {
        /*
            r0 = 0
            if (r7 == 0) goto L4d
            boolean r1 = r7.isFile()
            if (r1 == 0) goto L4d
            boolean r1 = r7.exists()
            if (r1 == 0) goto L4d
            boolean r1 = r7.canRead()
            if (r1 == 0) goto L4d
            long r1 = r7.length()
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L4d
            long r1 = r7.length()     // Catch: java.lang.Throwable -> L49
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L49
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L49
            r2.<init>(r7)     // Catch: java.lang.Throwable -> L49
            int r7 = r1.intValue()     // Catch: java.lang.Throwable -> L47
            byte[] r7 = new byte[r7]     // Catch: java.lang.Throwable -> L47
            int r3 = r2.read(r7)     // Catch: java.lang.Throwable -> L47
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L47
            long r5 = r1.longValue()     // Catch: java.lang.Throwable -> L47
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L43
            r2.close()     // Catch: java.lang.Throwable -> L42
        L42:
            return r7
        L43:
            r2.close()     // Catch: java.lang.Throwable -> L4d
            goto L4d
        L47:
            goto L4a
        L49:
            r2 = r0
        L4a:
            if (r2 == 0) goto L4d
            goto L43
        L4d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.utils.f.d(java.io.File):byte[]");
    }

    private static void e(File file) throws IOException {
        RandomAccessFile randomAccessFile;
        long j10;
        long length = file.length();
        if (length == 0) {
            f(file);
            return;
        }
        RandomAccessFile randomAccessFile2 = null;
        try {
            randomAccessFile = new RandomAccessFile(file, "rwd");
            j10 = length - 1;
        } catch (Throwable unused) {
        }
        try {
            randomAccessFile.seek(j10);
            byte readByte = randomAccessFile.readByte();
            randomAccessFile.seek(j10);
            randomAccessFile.write(readByte);
            randomAccessFile.close();
        } catch (Throwable unused2) {
            randomAccessFile2 = randomAccessFile;
            if (randomAccessFile2 != null) {
                randomAccessFile2.close();
            }
        }
    }

    private static void f(File file) throws IOException {
        if (file.delete() && file.createNewFile()) {
            return;
        }
        throw new IOException("Error recreate zero-size file " + file);
    }

    public static void b(File file) throws IOException {
        if (file.exists()) {
            l.e("splashLoadAd", "当文件存在更新文件的修改时间");
            long currentTimeMillis = System.currentTimeMillis();
            if (file.setLastModified(currentTimeMillis)) {
                return;
            }
            e(file);
            if (file.lastModified() < currentTimeMillis) {
                l.d("Files", "Last modified date " + new Date(file.lastModified()) + " is not set for file " + file.getAbsolutePath());
            }
        }
    }

    public static File a(Context context, boolean z10, String str) {
        String absolutePath = context.getCacheDir().getAbsolutePath();
        if (z10) {
            str = a(context) + Constants.FILENAME_SEQUENCE_SEPARATOR + str;
        }
        if (absolutePath != null) {
            String str2 = File.separator;
            if (!absolutePath.endsWith(str2)) {
                absolutePath = absolutePath + str2;
            }
        }
        File file = new File(absolutePath + str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static List<File> a(File file) {
        LinkedList linkedList = new LinkedList();
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            List<File> asList = Arrays.asList(listFiles);
            Collections.sort(asList, new a(null));
            return asList;
        }
        return linkedList;
    }

    public static String a(Context context) {
        String a10 = s.a(context);
        return a10.contains(":") ? a10.replace(":", Constants.FILENAME_SEQUENCE_SEPARATOR) : a10;
    }
}
