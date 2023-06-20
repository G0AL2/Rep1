package a4;

import java.util.Locale;
import java.util.Map;
import y3.g;

/* compiled from: MediaUtils.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, String> f65a = g.of("mkv", "video/x-matroska", "glb", "model/gltf-binary");

    private static String a(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf < 0 || lastIndexOf == str.length() - 1) {
            return null;
        }
        return str.substring(lastIndexOf + 1);
    }

    public static String b(String str) {
        String a10 = a(str);
        if (a10 == null) {
            return null;
        }
        String lowerCase = a10.toLowerCase(Locale.US);
        String a11 = b.a(lowerCase);
        return a11 == null ? f65a.get(lowerCase) : a11;
    }

    public static boolean c(String str) {
        return str != null && str.startsWith("video/");
    }
}
