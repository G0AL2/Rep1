package com.bytedance.sdk.component.utils;

import com.inmobi.media.fq;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.util.Objects;

/* compiled from: DigestUtils.java */
/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f10447a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String a(byte[] bArr) {
        Objects.requireNonNull(bArr, "bytes is null");
        return a(bArr, 0, bArr.length);
    }

    public static String a(byte[] bArr, int i10, int i11) {
        Objects.requireNonNull(bArr, "bytes is null");
        if (i10 >= 0 && i10 + i11 <= bArr.length) {
            int i12 = i11 * 2;
            char[] cArr = new char[i12];
            int i13 = 0;
            for (int i14 = 0; i14 < i11; i14++) {
                int i15 = bArr[i14 + i10] & fq.i.NETWORK_LOAD_LIMIT_DISABLED;
                int i16 = i13 + 1;
                char[] cArr2 = f10447a;
                cArr[i13] = cArr2[i15 >> 4];
                i13 = i16 + 1;
                cArr[i16] = cArr2[i15 & 15];
            }
            return new String(cArr, 0, i12);
        }
        throw new IndexOutOfBoundsException();
    }

    public static String a(File file) {
        FileInputStream fileInputStream;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            if (messageDigest == null) {
                return null;
            }
            fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[Constants.BUFFER_SIZE];
                while (true) {
                    int read = fileInputStream.read(bArr, 0, Constants.BUFFER_SIZE);
                    if (read <= 0) {
                        break;
                    }
                    messageDigest.update(bArr, 0, read);
                }
                String a10 = a(messageDigest.digest());
                try {
                    fileInputStream.close();
                } catch (Exception unused) {
                }
                return a10;
            } catch (Throwable unused2) {
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (Exception unused3) {
                    }
                }
                return null;
            }
        } catch (Throwable unused4) {
            fileInputStream = null;
        }
    }

    public static String a(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                    messageDigest.update(str.getBytes("UTF-8"));
                    return a(messageDigest.digest());
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }
}
