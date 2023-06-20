package ms.bd.o.Pgl;

import android.content.Context;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.RandomAccessFile;

/* loaded from: classes3.dex */
public class v0 {

    /* renamed from: a  reason: collision with root package name */
    private static final String f34586a;

    static {
        String str = (String) pblk.a(16777217, 0, 0L, "21ecdb", new byte[]{24, 111, 87, 73, 102});
        f34586a = (String) pblk.a(16777217, 0, 0L, "316475", new byte[]{54, 39, 122, 78, 12});
    }

    public static synchronized String a(Context context) {
        String a10;
        synchronized (v0.class) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(context.getFilesDir().getAbsolutePath());
            sb2.append((String) pblk.a(16777217, 0, 0L, "0dac94", new byte[]{110}));
            String str = f34586a;
            sb2.append(str);
            String sb3 = sb2.toString();
            if (!new File(sb3).exists() || (a10 = a(sb3)) == null || a10.length() <= 0) {
                InputStream open = context.getResources().getAssets().open(str);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = open.read(bArr, 0, 4096);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
                FileOutputStream fileOutputStream = new FileOutputStream(sb3);
                fileOutputStream.write(byteArrayOutputStream.toByteArray());
                fileOutputStream.close();
                StringBuilder sb4 = new StringBuilder();
                sb4.append((String) pblk.a(16777217, 0, 0L, "bba013", new byte[]{112, 104, 31, 75, 10, 100, 54, 20, 103, 32}));
                sb4.append(sb3);
                a(sb4.toString());
                String a11 = a(sb3);
                if (a11 == null || a11.length() == 0) {
                    RandomAccessFile randomAccessFile = new RandomAccessFile(sb3, (String) pblk.a(16777217, 0, 0L, "5ee262", new byte[]{54, 112}));
                    randomAccessFile.seek(16L);
                    randomAccessFile.write(new byte[]{2});
                    randomAccessFile.close();
                    a11 = a(sb3);
                }
                if (a11 == null || a11.length() == 0) {
                    a11 = (String) pblk.a(16777217, 0, 0L, "eb6bda", new byte[]{36, 91, 25, 87, 5, 75, 67, 113, 85, 29, 70, 91, 25, 87, 5, 75});
                }
                return a11;
            }
            return a10;
        }
    }

    private static String a(BufferedInputStream bufferedInputStream) {
        int read;
        byte[] bArr = new byte[4096];
        StringBuilder sb2 = new StringBuilder();
        do {
            try {
                read = bufferedInputStream.read(bArr);
                if (read > 0) {
                    sb2.append(new String(bArr, 0, read));
                    continue;
                }
            } catch (Exception unused) {
                String str = (String) pblk.a(16777217, 0, 0L, "a9d4e1", new byte[]{117, 50, 20});
            }
        } while (read >= 4096);
        return sb2.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e7, code lost:
        if (r5 != null) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x010c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String a(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ms.bd.o.Pgl.v0.a(java.lang.String):java.lang.String");
    }
}
