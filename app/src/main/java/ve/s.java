package ve;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: _Strings.kt */
/* loaded from: classes3.dex */
public class s extends r {
    public static String y0(String str, int i10) {
        int d10;
        qe.k.f(str, "<this>");
        if (i10 >= 0) {
            d10 = se.f.d(i10, str.length());
            String substring = str.substring(0, d10);
            qe.k.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }
}
