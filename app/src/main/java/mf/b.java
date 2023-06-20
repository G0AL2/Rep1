package mf;

/* compiled from: -Platform.kt */
/* loaded from: classes3.dex */
public final class b {
    public static final byte[] a(String str) {
        qe.k.f(str, "$this$asUtf8ToByteArray");
        byte[] bytes = str.getBytes(ve.d.f38080b);
        qe.k.e(bytes, "(this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    public static final String b(byte[] bArr) {
        qe.k.f(bArr, "$this$toUtf8String");
        return new String(bArr, ve.d.f38080b);
    }
}
