package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.util.Base64;
import com.inmobi.media.fq;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

/* loaded from: classes3.dex */
public final class u1 {

    /* renamed from: a  reason: collision with root package name */
    private static za.a f23052a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(List<File> list) throws NoSuchAlgorithmException, IOException {
        int read;
        MessageDigest messageDigest = MessageDigest.getInstance("SHA256");
        byte[] bArr = new byte[Constants.BUFFER_SIZE];
        for (File file : list) {
            FileInputStream fileInputStream = new FileInputStream(file);
            do {
                try {
                    read = fileInputStream.read(bArr);
                    if (read > 0) {
                        messageDigest.update(bArr, 0, read);
                    }
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        cb.c0.a(th, th2);
                    }
                    throw th;
                }
            } while (read != -1);
            fileInputStream.close();
        }
        return Base64.encodeToString(messageDigest.digest(), 11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized za.a b(Context context) {
        za.a aVar;
        synchronized (u1.class) {
            if (f23052a == null) {
                n0 n0Var = new n0(null);
                n0Var.b(new w2(eb.a.a(context)));
                f23052a = n0Var.a();
            }
            aVar = f23052a;
        }
        return aVar;
    }

    public static boolean c(int i10) {
        return i10 == 1 || i10 == 7 || i10 == 2 || i10 == 3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d(int i10, int i11) {
        if (i10 == 5) {
            if (i11 != 5) {
                return true;
            }
            i10 = 5;
        }
        if (i10 != 6 || i11 == 6 || i11 == 5) {
            if (i10 != 4 || i11 == 4) {
                if (i10 == 3 && (i11 == 2 || i11 == 7 || i11 == 1 || i11 == 8)) {
                    return true;
                }
                if (i10 == 2) {
                    return i11 == 1 || i11 == 8;
                }
                return false;
            }
            return true;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long e(byte[] bArr, int i10) {
        return ((g(bArr, i10 + 2) << 16) | g(bArr, i10)) & 4294967295L;
    }

    public static boolean f(int i10) {
        return i10 == 5 || i10 == 6 || i10 == 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int g(byte[] bArr, int i10) {
        return ((bArr[i10 + 1] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[i10] & fq.i.NETWORK_LOAD_LIMIT_DISABLED);
    }

    public static boolean h(int i10) {
        return i10 == 2 || i10 == 7 || i10 == 3;
    }
}
