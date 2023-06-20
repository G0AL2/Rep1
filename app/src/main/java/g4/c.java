package g4;

import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: SecureHashUtil.java */
/* loaded from: classes.dex */
public class c {
    public static String a(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(bArr, 0, bArr.length);
            return Base64.encodeToString(messageDigest.digest(), 11);
        } catch (NoSuchAlgorithmException e10) {
            throw new RuntimeException(e10);
        }
    }
}
