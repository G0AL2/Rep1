package h4;

import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Base64;
import java.io.UnsupportedEncodingException;

/* compiled from: WebpSupportStatus.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f31090a;

    /* renamed from: b  reason: collision with root package name */
    public static b f31091b;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f31092c;

    /* renamed from: d  reason: collision with root package name */
    private static final byte[] f31093d;

    /* renamed from: e  reason: collision with root package name */
    private static final byte[] f31094e;

    /* renamed from: f  reason: collision with root package name */
    private static final byte[] f31095f;

    /* renamed from: g  reason: collision with root package name */
    private static final byte[] f31096g;

    /* renamed from: h  reason: collision with root package name */
    private static final byte[] f31097h;

    static {
        f31090a = Build.VERSION.SDK_INT <= 17;
        e();
        f31091b = null;
        f31092c = false;
        f31093d = a("RIFF");
        f31094e = a("WEBP");
        f31095f = a("VP8 ");
        f31096g = a("VP8L");
        f31097h = a("VP8X");
    }

    private static byte[] a(String str) {
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("ASCII not found!", e10);
        }
    }

    public static boolean b(byte[] bArr, int i10) {
        return j(bArr, i10 + 12, f31097h) && ((bArr[i10 + 20] & 2) == 2);
    }

    public static boolean c(byte[] bArr, int i10, int i11) {
        return i11 >= 21 && j(bArr, i10 + 12, f31097h);
    }

    public static boolean d(byte[] bArr, int i10) {
        return j(bArr, i10 + 12, f31097h) && ((bArr[i10 + 20] & 16) == 16);
    }

    private static boolean e() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 17) {
            return false;
        }
        if (i10 == 17) {
            byte[] decode = Base64.decode("UklGRkoAAABXRUJQVlA4WAoAAAAQAAAAAAAAAAAAQUxQSAwAAAARBxAR/Q9ERP8DAABWUDggGAAAABQBAJ0BKgEAAQAAAP4AAA3AAP7mtQAAAA==", 0);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
            if (options.outHeight != 1 || options.outWidth != 1) {
                return false;
            }
        }
        return true;
    }

    public static boolean f(byte[] bArr, int i10) {
        return j(bArr, i10 + 12, f31096g);
    }

    public static boolean g(byte[] bArr, int i10) {
        return j(bArr, i10 + 12, f31095f);
    }

    public static boolean h(byte[] bArr, int i10, int i11) {
        return i11 >= 20 && j(bArr, i10, f31093d) && j(bArr, i10 + 8, f31094e);
    }

    public static b i() {
        if (f31092c) {
            return f31091b;
        }
        b bVar = null;
        try {
            bVar = (b) Class.forName("com.facebook.webpsupport.WebpBitmapFactoryImpl").newInstance();
        } catch (Throwable unused) {
        }
        f31092c = true;
        return bVar;
    }

    private static boolean j(byte[] bArr, int i10, byte[] bArr2) {
        if (bArr2 == null || bArr == null || bArr2.length + i10 > bArr.length) {
            return false;
        }
        for (int i11 = 0; i11 < bArr2.length; i11++) {
            if (bArr[i11 + i10] != bArr2[i11]) {
                return false;
            }
        }
        return true;
    }
}
