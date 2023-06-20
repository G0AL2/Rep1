package cb;

/* loaded from: classes3.dex */
public final class h0 {
    public static String a(String str, String str2) {
        StringBuilder sb2 = new StringBuilder(str.length() + 1 + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append(":");
        sb2.append(str2);
        return sb2.toString();
    }

    public static String b(String str, String str2, String str3) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(length + 2 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb2.append(str);
        sb2.append(":");
        sb2.append(str2);
        sb2.append(":");
        sb2.append(str3);
        return sb2.toString();
    }
}
