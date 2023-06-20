package o3;

import android.text.TextUtils;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: MD5.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static final MessageDigest f34952a = c();

    /* renamed from: b  reason: collision with root package name */
    private static final char[] f34953b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    private b() {
    }

    public static String a(String str) {
        byte[] digest;
        MessageDigest messageDigest = f34952a;
        if (messageDigest == null || TextUtils.isEmpty(str)) {
            return "";
        }
        byte[] bytes = str.getBytes(Charset.forName("UTF-8"));
        synchronized (b.class) {
            digest = messageDigest.digest(bytes);
        }
        return b(digest);
    }

    public static String b(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        char[] cArr = new char[bArr.length << 1];
        int i10 = 0;
        for (byte b10 : bArr) {
            int i11 = i10 + 1;
            char[] cArr2 = f34953b;
            cArr[i10] = cArr2[(b10 & 240) >> 4];
            i10 = i11 + 1;
            cArr[i11] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    private static MessageDigest c() {
        try {
            return MessageDigest.getInstance("md5");
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }
}
