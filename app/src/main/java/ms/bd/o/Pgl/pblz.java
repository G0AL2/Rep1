package ms.bd.o.Pgl;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Build;
import android.util.ArrayMap;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class pblz {
    public static long a(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[256];
        long j10 = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read <= 0) {
                outputStream.flush();
                return j10;
            }
            outputStream.write(bArr, 0, read);
            j10 += read;
        }
    }

    @SuppressLint({"PrivateApi"})
    public static Activity a() {
        try {
            Class<?> cls = Class.forName((String) pblk.a(16777217, 0, 0L, "3a0ff6", new byte[]{35, 109, 71, 0, 86, 40, 52, 14, 96, 38, 50, 45, 98, 17, 77, 40, 38, 73, 117, 47, 22, 107, 81, 23, 88, 37}));
            Object invoke = cls.getMethod((String) pblk.a(16777217, 0, 0L, "17f843", new byte[]{35, 32, 7, 94, 14, 42, 38, 55, 52, 124, 41, 35, 28, 88, 18, 16, 58, 4, 50, 105, 36}), new Class[0]).invoke(null, new Object[0]);
            Field declaredField = cls.getDeclaredField((String) pblk.a(16777217, 0, 0L, "dbdb99", new byte[]{120, 65, 20, 2, 15, 56, 110, 87, 60, 55, 102}));
            declaredField.setAccessible(true);
            Map map = Build.VERSION.SDK_INT < 19 ? (HashMap) declaredField.get(invoke) : (ArrayMap) declaredField.get(invoke);
            if (map.size() < 1) {
                return null;
            }
            for (Object obj : map.values()) {
                Class<?> cls2 = obj.getClass();
                Field declaredField2 = cls2.getDeclaredField((String) pblk.a(16777217, 0, 0L, "6ce9d6", new byte[]{55, 96, 3, 94, 94, 37}));
                declaredField2.setAccessible(true);
                if (!declaredField2.getBoolean(obj)) {
                    Field declaredField3 = cls2.getDeclaredField((String) pblk.a(16777217, 0, 0L, "eb743a", new byte[]{117, 99, 80, 73, 26, Byte.MAX_VALUE, 114, 90}));
                    declaredField3.setAccessible(true);
                    return (Activity) declaredField3.get(obj);
                }
            }
            return null;
        } catch (Exception unused) {
            String str = (String) pblk.a(16777217, 0, 0L, "25c025", new byte[]{34, 62, 47, 67});
            return null;
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e10) {
                e10.printStackTrace();
            }
        }
    }

    public static byte[] a(String str) {
        int length = str.length();
        byte[] bArr = new byte[length / 2];
        for (int i10 = 0; i10 < length; i10 += 2) {
            bArr[i10 / 2] = (byte) ((Character.digit(str.charAt(i10), 16) << 4) + Character.digit(str.charAt(i10 + 1), 16));
        }
        return bArr;
    }
}
