package h3;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* compiled from: VideoFilesUtils.java */
/* loaded from: classes.dex */
public class c {
    public static long a(String str, String str2) {
        File d10 = d(str, str2);
        if (d10.exists()) {
            return d10.length();
        }
        File c10 = c(str, str2);
        if (c10.exists()) {
            return c10.length();
        }
        return 0L;
    }

    public static void b(RandomAccessFile randomAccessFile, byte[] bArr, int i10, int i11, String str) throws IOException {
        try {
            randomAccessFile.seek(i10);
            randomAccessFile.write(bArr, 0, i11);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static File c(String str, String str2) {
        File file = new File(str);
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, str2 + ".temp");
    }

    public static File d(String str, String str2) {
        File file = new File(str);
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, str2);
    }
}
